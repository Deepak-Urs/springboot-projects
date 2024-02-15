import { useState } from "react"
import { createEmployee } from "../services/EmployeeService"
import { useNavigate, useParams } from "react-router-dom"

const EmployeeComponent = () => {
  const [firstName, setFirstName] = useState('')
  const [lastName, setLastName] = useState('')
  const [email, setEmail] = useState('')
  const [errors, setErrors] = useState({firstName: '', lastName:'', email:''});


  const navigator = useNavigate();
  const {id} = useParams();
  

  const pageTitle = () => {
    if(id) {
      return <h2 className="text-center">Update Employee</h2>
    } else {
      return <h2 className="text-center">Add Employee</h2>
    }
  }

  const saveEmployee = (e) => {
    e.preventDefault();

    const employee = {firstName, lastName, email}
    console.log(employee);

    if(validateForm()) {
      createEmployee(employee).then(res => {
        console.log(res.data);
        navigator('/employees')
      }).catch(err => {
        console.log(err);
      })
    }
    //else {

    //}
    
  }

  const validateForm = () => {
    let valid = true;

    const errorsCopy = {...errors}

    if(firstName.trim().length === 0) {
      errorsCopy.firstName = 'First name is requried';
      valid = false;
    }
    
    if(lastName.trim().length === 0) {
      errorsCopy.lastName = 'Last name is requried';
      valid = false;
    }
    
    if(email.trim().length === 0) {
      errorsCopy.email = 'Email is requried';
      valid = false;
    }

    setErrors(errorsCopy);
    return valid;
  }

  return (
    <div className="container">
      <div className="row">
        <div className="card mt-5 col-md-6 offset-md-3">
          {/*<h2 className="text-center">Add Employee</h2>*/}
          {pageTitle()}
          <div className="card-body">
            <form>
              <div className="form-group mb-2">
                <label className="form-label">First Name:</label>
                <input type="text" placeholder="Enter Employee First Name" name="firstName" value={firstName} className={`form-control ${errors.firstName ? `is-invalid`: ''}`} onChange={(e) => setFirstName(e.target.value)}/>
                {errors.firstName && <div className="invalid-feedback">{errors.firstName}</div>}
              </div>

              <div className="form-group mb-2">
                <label className="form-label">Last Name:</label>
                <input type="text" placeholder="Enter Employee Last Name" name="lastName" value={lastName} className={`form-control ${errors.lastName ? `is-invalid`: ''}`} onChange={(e) => setLastName(e.target.value)}/>
                {errors.lastName && <div className="invalid-feedback">{errors.lastName}</div>}
              </div>

              <div className="form-group mb-2">
                <label className="form-label">Email:</label>
                <input type="text" placeholder="Enter Employee Email" name="lastName" value={email} className={`form-control ${errors.email ? `is-invalid`: ''}`}  onChange={(e) => setEmail(e.target.value)}/>
                {errors.email && <div className="invalid-feedback">{errors.email}</div>}
              </div>

              <button className="btn btn-success" onClick={saveEmployee}>Submit</button>

              {/* Simple validation */}
              {/*<button className="btn btn-success" disabled={!(firstName.length && lastName.length && email.length)} onClick={saveEmployee}>Submit</button>*/}
            </form>
          </div>
        </div>
      </div>
    </div>
  )
}

export default EmployeeComponent
