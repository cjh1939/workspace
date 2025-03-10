
import './Test4.css'
import React, { useState } from 'react'

function Test4() {
  
  const [numArr, setNUmArr] =useState([0,0,0]);

  function cha(index){
    const copyArr =[...numArr];
          copyArr[index] = copyArr[index] +1;
          setNUmArr(copyArr);
  }


  return (
    <>
      <div>Test4</div>

        <span onClick={()=>{
        cha(0);
        }}>{numArr[0]}</span>

        <span onClick={()=>{
          cha(1);

        }}>{numArr[1]}</span>

        <span onClick={()=>{

          cha(2);
        }}>{numArr[2]}</span>
  
    </>
  )
}

export default Test4


