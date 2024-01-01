const express=require("express");
var router=express.Router();
var connection=require("../db/dbconnect")
router.get("/products",function(req,resp){
   connection.query("select * from product",(err,data,fields)=>{
   if(err){
    console.log(err);
    resp.status(500).send("no data found")
   }else{
    console.log(data);
    //this will generate ./views/index.ejs
    resp.send(data);
   }
   })

});
//webservice api name shouldn't have verbs

router.post("/products/product/:pnum",function(req,resp){
    connection.query("insert into product values(?,?,?,?)",[req.body.pid,req.body.pname,req.body.qty,req.body.price],(err,result)=>{
        if(err){
            console.log(err);
            resp.status(500).send("<h3>no data found</h3>")
           }else{
            console.log(result);
            resp.status(200).send("data added successfully")
           }
    })
});
router.delete("/products/product/:pnum",function(req,resp){
    connection.query("delete from product where pid=?",[req.params.pnum],function(err,result){
        if(err){
            console.log(err);
            resp.status(500).send("no data found")
           }else{
            console.log(result);
            resp.status(200).send("")
           }

    })

});
router.get("/products/product/:pnum",function(req,resp){
    connection.query("select * from product where pid=?",[req.params.pnum],function(err,data){
        if(err){
            console.log(err);
            resp.status(500).send("no data found")
           }else{
            
            console.log(data);
            resp.status(200).send(data[0])
           }
    })

})
router.put("/products/product/:pnum",function(req,resp){
    connection.query("update product set pname=?,qty=?,price=? where pid=?",[req.body.pname,req.body.qty,req.body.price,req.body.pid],function(err,result){
        if(err){
            console.log(err);
            resp.status(500).send("no data updated")
           }else{
            console.log(result);
            resp.send(200).send("data updated succesfully")
           }

    })

})

//this is same object rotes in app.js
module.exports=router;