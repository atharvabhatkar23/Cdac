import React, {useState} from 'react';
export default function NameForm(){

    const [name,setname]=useState("")

    const addName=()=>{
            
    }
    
    return(
        <div>
            <form>
  <div class="form-group">
    <label for="name">Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email"/>
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  
  <button type="submit" class="btn btn-primary" name="name" id="name" value={name} onChange={(event)=>{setname(event.target.value)}}>AddButton</button>
</form>
        </div>


    )
}