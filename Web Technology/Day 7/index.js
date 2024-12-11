const http = require("http");
const employee = require("./employee");
const department = require("./department");
const port = 5555;

let arr=[];

employee.forEach(emp => {
    const dept = department.find(d => d.dept_no === emp.dept_no);
    if (dept) {
        arr.push({
            emp_id: emp.emp_id,
            name: emp.name,
            city: emp.city,
            dept_name: dept.dept_name,
            dept_location: dept.dept_location
        });
    }
});

const server =  http.createServer((req,res) => {
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    res.end(JSON.stringify(arr));
});


server.listen(port,() =>{
    console.log(`Server is running at port ${port}`);
})