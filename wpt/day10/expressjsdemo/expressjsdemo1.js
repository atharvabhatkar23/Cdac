var express = require("express");
var app = express();  //create an express object


//define the middleware(fns which you want to execute)
const bodyparser = require("body-parser"); // for every request, it is common functionality for all urls

app.use(function(req,resp,next){
    console.log("this is first middleware");
    console.log("url : "+ req.url);
    next();
    
})
app.use(function(req,resp,next){
    console.log("this is first middleware");
    console.log("url : "+ req.url);
    next();//to go to next middleware
})

app.get("/home",function(req,resp){

    resp.send("<h1>  Home Page</h1>");
})

app.get("/aboutus",function(req,resp){
    var str = "<h1>  Hello world</h1>       <h2>  welcome to express js </h2>"
    resp.send(str);
})

app.listen(9090,function(){
    console.log("listening at port 9090")
})