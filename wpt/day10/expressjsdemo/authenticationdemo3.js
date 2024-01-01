const express = require("express")
var app = express();  //create an express object

const m1= require("./public/module1")
//define the middleware(fns which you want to execute)
const bodyparser = require("body-parser"); // for every request, it is common functionality for all urls
//const bodyParser = require("body-parser");


//this is a middleware which helps to parse url and seperate data from  
//it will generate a object by name query in req object if method is get
//it will generate a object by name body in req object if method is post

app.use(bodyparser.urlencoded({extended:false})) //data is in text format

app.get("/login",function(res,resp){

    resp.sendFile("/public/login.html" , {root: __dirname});
})

app.post("/validate",function(req,resp){
    //resp.send("uname : "+req.body.uname + "Password : " + req.body.pass)
    var u = m1.validateuser(req.body.uname,req.body.pass);
    if(u==null){
        resp.send("<h1> Invalid USer </h1>")
    }
    else{
        resp.sendFile("/public/form.html", {root: __dirname});
    }

})

app.get("/calculate",function(req,resp){
    var num1 = parseInt(req.query.num1);
    
    var btn = req.query.btn;
    if(btn==="add"){
        var num2 = parseInt(req.query.num2);
        var ans = m1.addition(num1,num2)
        resp.send("<h1> addition = " + ans + "</h1>")
    }
    else{
        var ans = m1.factorial(num1);
        resp.send("<h1> factorial = " + ans + "</h1>")
    }
})

app.listen(9090,function(req,resp){
    console.log("server started at port 9090")
})