
const ListEmployeeComponents = () => {
    const dummyData = [
        {
            "id": 1,
            "firstName": "Deepak",
            "lastName": "Urs",
            email: "deepak@gmail.com"
        },
        {
            "id": 2,
            "firstName": "D",
            "lastName": "U",
            email: "gvdu@gmail.com"
        },
        {
            "id": 3,
            "firstName": "AB",
            "lastName": "CD",
            email: "abcd@gmail.com"
        },
        {
            "id": 4,
            "firstName": "EF",
            "lastName": "GH",
            email: "efgh@gmail.com"
        },
    ]
  return (
    <div className="container">
      <h2 className="text-center">List of Employees</h2>
      <table className="table table-striped table-bordered">
        <thead>
            <tr>
                <th>Employee First Name</th>
                <th>Employee Last Name</th>
                <th>Employee Email</th>
            </tr>
        </thead>
        <tbody>
            {
                dummyData.map(emp => 
                    <tr key={emp.id}>
                    <td>{emp.firstName}</td>
                    <td>{emp.lastName}</td>
                    <td>{emp.email}</td>
                    </tr>
                )
            }
        </tbody>
      </table>
    </div>
  )
}

export default ListEmployeeComponents
