import './Test5.css'
import React, { useState } from 'react'

const Test5 = () => {
  const [a1,setA] = useState('홍길동');

  return (
    <>
    <div>이름 : 김자바</div>
    <div>나이 : 20</div>
    <div>주소 : 울산시</div>
    <button type='button' onClick={()=>{
      setA = 
    }}>{a1}</button>

    <button type='button' onClick={()=>{}}>{}</button>

    <button type='button' onClick={()=>{}}>{}</button>
    </>
  )
}

export default Test5