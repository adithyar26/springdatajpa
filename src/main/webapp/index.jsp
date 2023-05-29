<html>
    <body>
        <h1> Employee Management Application </h1>
        <hr>
        <h2 style="color : red; font-weight:bold;"> Employee Creation</h2>
        <hr>
        <form action = "addEmp">
            <h3>
                Emp ID : <input type= "number" name = "eid"></br>
                Name : <input type= "text" name = "name"></br>
                Age : <input type= "number" name = "age"></br>
                Salary : <input type= "number" name = "salary"></br>
                Designation: <input type= "text" name = "designation"></br> 
                <br><br><input type = "submit" value = "Insert">
                <input type = "reset" value = "reset">
            </h3>
          
        </form>
        <hr>
        
        <h2 > Get Employees </h2>
        <form action = "getEmployees"> 
            <input type = "submit" value = "get all employee details">
        </form>

        <hr>
        
        <h2 > Search Employees </h2>
        <form action = "SearchEmployee"> 
            Emp ID : <input type= "number" name = "eid" value="Enter ID to Search"></br>
            <input type = "submit" value = "Search">
        </form>
        <h2 > Employee updation</h2>
        <hr>
        <form action = "updateEmp">
            <h3>
                Emp ID : <input type= "number" name = "eid"></br>
                Name : <input type= "text" name = "name"></br>
                Age : <input type= "number" name = "age"></br>
                Salary : <input type= "number" name = "salary"></br>
                Designation: <input type= "text" name = "designation"></br> 
                <br><br><input type = "submit" value = "Update">
                <input type = "reset" value = "reset">
            </h3>
          
        </form>

        <h2 > Delete Employee </h2>
        <form action = "DeleteEmployee"> 
            Emp ID : <input type= "number" name = "eid" value="Enter ID to Search"></br>
            <input type = "submit" value = "Remove">
        </form>

        <hr>
        <h2 > Get Employee by Designation </h2>
        <form action = "byDesig"> 
            Designation : <input type= "text" name = "desig" value="Enter designation"></br>
            <input type = "submit" value = "search">
        </form>

        <hr>
        <h2 > Get Employee above age </h2>
        <form action = "aboveAge"> 
            age : <input type= "number" name = "age" value="Enter age"></br>
            <input type = "submit" value = "search">
        </form>
        
        <hr>
        <h2 > Get records by Designation in Decrement of salary</h2>
        <form action = "byDesigSalary"> 
            Designation : <input type= "text" name = "desig" value="Enter designation"></br>
            <input type = "submit" value = "search">
        </form>
        


</body></html>