
import'./Test3.css'
import React, { useState } from 'react'

const Test3 = () => {
  const [ar1, setAr1] = useState(true);
  const [ar2, setAr2] = useState("광고닫기");

  return (
    <>
    <button type='button' onClick={()=>{
      setAr1(!ar1); 
      setAr2(ar2 === "광고닫기" ? '광고보기 ': '광고닫기');  
    }}>{ar2}</button>

    {
      ar1 ?  <h2 className='aa'>오늘구매하시면 30% SALE!!!</h2> : null
    }
    </>
  );
};

export default Test3