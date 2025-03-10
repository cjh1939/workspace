import React, { useState } from 'react'

function Test3() {
  const [isShow, setIsShow] = useState(false);


  return (
    <>
    <div>Test3</div>
    
    <div className='aaa'onMouseEnter={(e)=>{setIsShow(true)}} onMouseLeave={(e)=>{setIsShow(false)}}>마우스를 올리면 숨겨진 글자가 보여요</div>
    {
      isShow ? <div className='aaa'>hello react</div> : null
    }
    
    </>
  );
};

export default Test3