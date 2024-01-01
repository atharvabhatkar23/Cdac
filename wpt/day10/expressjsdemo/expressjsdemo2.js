const express = require("express")
var app = express();  //create an express object


//define the middleware(fns which you want to execute)
const bodyparser = require("body-parser"); // for every request, it is common functionality for all urls

app.use(function(req,resp,next){
    console.log("this is middleware")
    next()
})

app.get("/hello",function(req,resp){
    resp.sendFile("public/hello.html", {root:__dirname })

})
app.get("/aboutus",function(req,resp){
    resp.send("<h1>inabout us</h1>")

})
app.listen(9090,function(req,resp){
    console.log("Started")
})