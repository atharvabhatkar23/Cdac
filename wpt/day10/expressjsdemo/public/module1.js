array  = [{uname:"user1",passwd:"pass1"},{uname:"user2",passwd:"pass3"}]

exports.validateuser = (uname,pass)=>{

    var user = array.find(obj=> obj.uname===uname && obj.passwd === pass)
    if (user==undefined){
       // arr.push(uname:uname,)
    }
    return user==undefined?null:user ;
}
exports.addition = (n1,n2)=>{

   return n1+n2;
}
exports.factorial = (n1)=>{

   return n1*n1;
}