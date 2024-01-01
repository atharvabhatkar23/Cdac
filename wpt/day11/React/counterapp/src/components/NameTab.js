
const NameTab = (props)=>{
    return (
        <div>
    <table>
        <thead>
            <tr><th>Id</th> <th>Name</th></tr>
        </thead>
        <tbody>
            {props.nmarr.map((ob,index)=><tr key={index}> 
                <td> {index+1} </td>
                <td>  {ob}</td>
                </tr> )}

        </tbody>

    </table>
    </div>
    )
}

export default NameTab