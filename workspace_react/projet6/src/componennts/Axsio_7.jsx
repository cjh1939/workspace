import axios from 'axios'
import React, { useEffect, useState } from 'react'

export const Axsio_7 = () => {

  // const phone = {
  //   brand : 'samsung',
  //   price : 1000,
  //   color : 'red',
  // }
 // axios.post('/api/t8', phone).then().catch();


  //아래의 코드의결과 전달되는 데이터를 자바에서 받은후
  //전달된 국,영 수 점수의 총점을 다시 리액트로 가져와서 
  //react 화면에 총점을 보여주세요 ! 

  const [sum, setSum] = useState(0)

  const student ={
    name :'kim',
    korScore :80,
    engScore : 70,
    matScore : 90
  }


useEffect(()=>{
  axios.post('/api/t7', student ).
  then((res)=>{
    console.log(res.data);
    setSum(res.data);
  }).
  catch((error)=>{
    console.log('통신 실패')
  });
},[]);






  return (
    <>
    <div>Axsio_7</div>

    <div>총점:{sum}</div>






      
    </>
  )
}
export default Axsio_7