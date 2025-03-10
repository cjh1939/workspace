import React, { useState } from 'react'

function Test2() {
  const [arr, setArr] = useState(0);
  
  const changeCount = (val)=>{
    setArr (arr + val);
  };

  return (
    <>
    <div>Test2</div>
    <div>현재 카운트 :</div>
    <div>{arr}</div>

    <button type='button' onClick={(e)=>{
      
      changeCount(-1);
    }}>-1</button>

    <button type='button' onClick={(e)=>{
      changeCount(-10);
    }}>-10</button>

    <button type='button' onClick={(e)=>{
     changeCount(-100);
    }}>-100</button>

    <button type='button' onClick={(e)=>{
      setArr(arr +100);
    }}>100</button>

    <button type='button' onClick={(e)=>{
      setArr(arr +10);
    }}>10</button>

    <button type='button' onClick={()=>{
      setArr(arr +1);
    }}>1</button>

    </>
  )
}

export default Test2