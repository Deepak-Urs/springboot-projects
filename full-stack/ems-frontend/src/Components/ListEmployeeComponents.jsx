import { useEffect, useState } from "react"
import { listEmployees } from "../services/EmployeeService"
import { useNavigate } from "react-router-dom"

const ListEmployeeComponents = () => {
    const [employees, setEmployees] = useState([])
    const navigator = useNavigate();
    
    useEffect(() => {
        listEmployees().then((response) => {
            console.log(response.data);
            setEmployees(response.data)
        }).catch(err => {
            console.log(err);
        })
    }, [])

    const addNewEmployee = () => {
        navigator('/add-employee')
    }

    const updateEmployee = (id) => {
        navigator(`/edit-employee/${id}`)
    }

    
  return (
    <div className="container">
      <h2 className="text-center">List of Employees</h2>
      <button className="btn btn-primary" onClick={addNewEmployee}>Add Employee</button>
      <table className="table table-striped table-bordered">
        <thead>
            <tr>
                <th>Employee First Name</th>
                <th>Employee Last Name</th>
                <th>Employee Email</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            {
                employees && employees.map(emp => 
                    <tr key={emp.id}>
                    <td>{emp.firstName}</td>
                    <td>{emp.lastName}</td>
                    <td>{emp.email}</td>
                    <td>
                        <button className="btn btn-info" onClick={() => updateEmployee(emp.id)}>Update</button></td>
                    </tr>
                )
            }
        </tbody>
      </table>
    </div>
  )
}

export default ListEmployeeComponents
