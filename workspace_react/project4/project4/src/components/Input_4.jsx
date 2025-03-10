import React, { useState } from 'react'

export const Input_4 = () => {
  //모든 입력정보를 저장할 state 변수 생성
  const[dataa,setDataa] = useState({
    name : '',
    tel : '',
    email : '',
    score :'국어'
  });
//모든 input 태그의 값이 변결될때 실핼할 함수
//injput 태그에 입력한 정보를 data 에 저장하는 기능
const changeDataa = (e)=>{
  setDataa({
    ...dataa,
    [e.target.name] : e.target.value
  })
};



  return (
    <>
    이름-<input name='name' type='text' value={dataa.name} onChange={(e)=>{
      changeDataa(e)
    }}></input><br />

    연락처-<input name='tel' type='text' value={dataa.tel} onChange={(e)=>{
      changeDataa(e)
    }}></input><br />

    이메일-<input name='email' type='text' value={dataa.email} onChange={(e)=>{
      changeDataa(e)
    }}></input><br />
    

    희망과목-<select name='score' value= {dataa.score} onChange={(e)=>{
      changeDataa(e)
    }}>
      <option value="국어">국어</option>
      <option value="영어">영어</option>
      <option value="수학">수하</option>
    </select>

        <h3>작성내용</h3>
      <div>이름 : {dataa.name}</div>
      <div>연락처 : {dataa.tel}</div>
      <div>이메일 : {dataa.email}</div>
      <div>희망과목- {dataa.score}</div>
    </>
  )
}

export default Input_4