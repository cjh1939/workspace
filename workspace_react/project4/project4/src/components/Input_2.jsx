import React, { useState } from "react";

export const Input_2 = () => {

  
  //이름을 입력하는 input 태그에 작성한 내용을 저장할 state변수
  // const [name, setName] = useState("");
  // const [age, setAge] = useState("");
  // const [addr, setAddr] = useState("");

//모든 input 태그에 입력한 데이터를 저장할 state변수
  const [data, setData] = useState({
    name : '',
    age : '', 
    addr : ''
  }); 

  //input 태그의 값이 변경되는 실행시킬 함수
  function changeData(e){
    setData({
      ...data,
      [e.target.name] : e.target.value
    })
  }



  return (
    <>
      이름 :
      <input name="name"  type="text" value={data.name} onChange={(e) => {
        //input 태그의 값이 변경될때마다 (input 태그에 입력할때마다 )
        //input 태그의 작성한 데이터를 name 변수에 저장한다
        changeData(e);  


        }}
      ></input>
      <br/>
      나이 :<input name="age" type="text" value={data.age} onChange={(e) => {
          changeData(e);
        }}
      ></input>
      <br/>

      주소 :
      <input name="addr" type="text" value={data.addr} onChange={(e) => {
          changeData(e);
        }}
      ></input>
      <br/>
      <div>입력받은 이름:{data.name}</div>
      <div>입력받은 나이:{data.age}</div>
      <div>입력받은 주소:{data.addr}</div>
    </>
  );
};

export default Input_2;
