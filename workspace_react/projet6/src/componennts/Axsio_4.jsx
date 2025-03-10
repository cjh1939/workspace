import axios from 'axios'
import React, { useEffect, useState } from 'react'

const Axsio_4 = () => {
  //서버에서 넘어오는 데이터를 받아옴
  const [person1, setPerson1] = useState([]);

useEffect(()=>{
  axios.get('api/t5').
  then((res)=>{
    console.log(res.data);
    setPerson1 (res.data)
  }).
  catch((error)=>{
    console.log(error)
  })
},[])




  return (
    <>
    <div>Axsio_4</div>

    

    <table  border='1' >
      <thead>
      <tr>
        <td>이름</td>
        <td>나이</td>
        <td>주소</td>
      </tr>
      </thead>
      
      <tbody>
        {
          person1.map((person, i)=>{
            return(
              <tr key={i}>
                <td>{person.name}</td>
                <td>{person.age}</td>
                <td>{person.addr}</td>
              </tr>
            
            )
          })
        }
      
      </tbody>
    </table>

    </>
  )
}

export default Axsio_4



                                                      
                                                                                                                                                                     
   
   
   
   
                                                                                                                                                                       
