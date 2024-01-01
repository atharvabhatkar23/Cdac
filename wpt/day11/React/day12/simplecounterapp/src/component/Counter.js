// import React from 'react'
import React, {useState} from 'react'
export default function Counter() {
    const [count, setcount] = useState(4)
    function decrement(){
        setcount(prevCount => prevCount-1)
    }
    function increment(){
        setcount(prevCount => prevCount+1)
    }
  return (
    <div className='btn btn-primary'>
        <button onClick={decrement}>-</button>
        <span> {count }</span>
        <button onClick={increment}>+</button>
    </div>
  )
}
