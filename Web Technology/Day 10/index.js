const express = require("express");
const app = express();
app.use(express.json());
const port = 4444;

let arr = [ {id:1,Name:"Rahul",City:"Mumbai"},
            {id:2,Name:"Ajay",City:"Pune"},
            {id:3,Name:"Ram",City:"Nashik"} ];


app.get("/",(req,res)=>{
    res.send(arr);
})

app.get("/:id", (req,res)=>{
    let id = parseInt(req.params.id);
    let emp = arr.filter(e => e.id === id);
    res.send(emp);
})

app.post("/", (req,res)=>{
    let {id,Name,City} = req.body;
    let newEmp = {id,Name,City};
    arr.push(newEmp);
    res.send(arr);
})

app.put("/:id",(req,res)=>{
    let idd = parseInt(req.params.id);
    if(idd == null){
        res.send("please enter correct id");
    }else{
    let {id,Name,City} = req.body;
    let empIndex = arr.findIndex(e => e.id === idd);
    arr[empIndex] = { id, Name, City };
    res.send(arr);
    }
})

app.delete("/:id",(req,res)=>{
    let id = req.params.id;
    arr = arr.filter(e => e.id != id);
    res.send(arr);
})

app.listen(port,() =>{
    console.log(`Server is listening on port ${port}`);
})