import axios from 'axios'
import React, { useEffect, useState } from 'react'

export const Axsio_2 = () => {
  
  const [tt, setTT] = useState({});

  useEffect(()=>{
    
    axios.get('/api/t4')
    .then((res)=>{
      console.log(res.data);
      setTT(res.data);

    })
    .catch((error)=>{
      console.log('통신중 오류발생');
      console.log(error);
    })

  },[])




  return (
    <>
    
    <div>이름 : {tt.name}  </div>
    <div>나이 : {tt.age}  </div>
    <div>주소 : {tt.addr}  </div>
    
    
    </>
  )
}
export default Axsio_2