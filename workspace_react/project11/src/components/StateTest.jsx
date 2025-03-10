import React, { useState } from "react";

const StateTest = () => {
  console.log(3);
  //usestate 는 실행후 두개의 데이터를 갖는 배열을 리턴 
  //배열의 첫번째 데이터는 소괄호 안에작성된 데이터를 리턴한다.
  //배열의 두번째 데이터로 함수가 전달됨
  //두번째로 리턴되는 함수는 변수의 값을 변경하는 기능을 가진 함수 

  let [hobby,sethobby] = useState('밥먹기');
  


  return (
    <>
      
      <div>{hobby}</div>
      <button type="button" onClick={()=>{
        sethobby('잠자기');
      }}>취미변경</button>


    </>
  );
};

export default StateTest;
