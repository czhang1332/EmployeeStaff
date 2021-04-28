# EmployeeStaff

This RESTful Web API was tested using POSTMAN and is run on local host- port 80. 

The design patterns used is Model View Controller. 

Through this Web API a user can 
- Get an employee through an ID -> GET Request with the URL http://localhost/employees/{id}
- Create an employeee -> POST Request with the URL http://localhost/employees with object text passed in as a JSON object 
- Get all employees -> GET Request with the URL http://localhost/employees
- Update existing employees -> PUT Request with the URL http://localhost/employees with object text passed in as a JSON object
- Delete an employee with id -> DELETE Request with the URL http://localhost/employees/{id}
