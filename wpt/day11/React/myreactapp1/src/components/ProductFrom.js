import React, { useState } from 'react'
import ProductService from '../service/ProductService';

export default function ProductFrom(props) {


  const[formdetails,setformdetails]  = useState({pid:"", pname:"", qty:"", price:""})
  const [formerrors,seterrors] = useState({});
  let errors={};
  const validateForm = () =>{
   ////
    if(formdetails.pid.trim().length===0){
      errors.piderr = "pid cannot be empty"
    }
    if(formdetails.qty<0){
      errors.qtyerr = "qty cannot be 0"
    }
    seterrors(errors)
    return errors;
  }
  const addproduct = ()=>{
    let errors = validateForm();
    if(Object.keys(errors).length>0){
      return;
    }
    else{
      ProductService.insertProduct(formdetails);
      setformdetails({pid:"", pname:"", qty:"", price:""});
      props.changeflag();
    }
  }

  const handlechange=(event)=>{
    // let name=event.target.name;
    // let value=event.target.value; this can be written as: 
    let {name,value} = event.target;
    setformdetails({...formdetails,[name]:value})


  }
  return (
    <div>
      
      <form>
  <div className="form-group">
    <label for="pid">Pid</label>
    <input type="text" className="form-control" id="pid"
     name="pid" value={formdetails.pid} onChange={handlechange} />
     <p>{formerrors.piderr}</p>
   
  </div>
  <div className="form-group">
    <label for="pname">Product Name</label>
    <input type="text" className="form-control" id="pname"
     name="pname" value={formdetails.pname} onChange={handlechange} />
  </div>
 
  
  <div className="form-group">
    <label for="qty">Product QTY</label>
    <input type="text" className="form-control" id="qty"  name="qty"
    value={formdetails.qty} onChange={handlechange}/>
     <p>{formerrors.qtyerr}</p>
  </div>
  <div className="form-group">
    <label for="price">Product price</label>
    <input type="text" className="form-control" id="price" name="price"
    value={formdetails.price} onChange={handlechange} />
  </div>
  {/* <div className="form-check">
    <input type="checkbox" className="form-check-input" id="exampleCheck1">
    <label className="form-check-label" for="exampleCheck1">Check me out</label>
  </div> */}
  <button type="button" className="btn btn-primary" name="add" id="add" onClick={addproduct}>Submit</button>
</form>
    </div>
  )
}
