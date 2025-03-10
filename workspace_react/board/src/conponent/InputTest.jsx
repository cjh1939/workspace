import React, { useState } from 'react'
import { data } from 'react-router-dom';

const InputTest = () => {
  const[data,setDate] = useState({
    id : 'c',
    age : 'a',
    name : 'd'

  });

  const chang = (e)=>{
    setDate({...data,
      [e.target.name] : e.target.value
      //[] : 변수 사용 가능 
    })
  }



console.log(chang);
  return (
    <>

      <div>inputTest</div>

        <div>id : <input type="text" name='id' onChange={(e)=>{chang(e)}}/></div>


        <div>나이 : <input type="text" name='age' onChange={(e)=>{chang(e)}} /></div>




        <div>이름 : <input type="text" /></div>








    </>
  )
}

export default InputTest