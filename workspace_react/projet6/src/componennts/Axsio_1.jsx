import axios from 'axios';
import React, { useEffect, useState } from 'react'

export const Axsio_1 = () => {
  //서버에서 받은 데이터를 저장할 state벼수 
  const [num,setNum] = useState(0);

  //마운트될때만 서버에서 데이터를 받기 위해 useEffect 사용 
  useEffect(()=>{
  //서버에서 데이터 받기
  //get 안에는 데이터를 요청할 url작성 
  axios.get('/api/t2')
  //통신 성공후 실행 내용 작성
  //res:통신성공에 대한 모든 정보가 담겨잇는 객체
  .then((res)=>{
    //통신성공시 num변수에 서버에서 받아온 데이터를 저장
    setNum(res.data);
  })
  //통신 실패 시 실행내용 작성
  //에러 : 통신 실패시 대한 모든정보가담겨잇는 객체
  .catch((error)=>{})
  },[]);

  

  return (
    <>

      <h3>데이터 받기 1</h3>
      <p>받은데이더 : {num}</p>
    </>
  )
}
export default Axsio_1