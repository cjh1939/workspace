import React, { useState } from 'react'

export const Test_1 = () => {

  const [arr,setArr] = useState({
    name :'',
    email :'',
    pass :'',
    rhk : '',
    gender : 'male',
    ar2 : ''
  });
  const changeArr = (e)=>{
    setArr({
      ...arr,
      [e.target.name] : e.target.value
    })
  }

  
  return (
    <>
      이름  <input name='name' type='text' value={arr.name} onChange={(e)=>{
        changeArr(e)
      }} /> <br />
      이메일  <input name='email' type='text'value={arr.email} onChange={(e)=>{
        changeArr(e)
      }}/> <br />
      비밀번호  <input name='pass' type='password' value={arr.pass} onChange={(e)=>{
        changeArr(e)
      }}/> <br />

      
      학과 <select name='rhk' value={arr.rhk} onChange={(e)=>{
        changeArr(e)
      }}>
          <option value=''>학과를선택하세요</option>
          <Option value='기계'>기계</Option>
          <Option value='전기'>전기</Option>
          <Option value='화학'>화학</Option>
        </select> <br />



    성별 
        <input name='gender' value='male' type="radio" checked={arr.gender === 'male'} onChange={(e)=>{
          changeArr(e)
        }} />남자

        <input name='gender' value='female' type='radio'checked={arr.gender === 'female'} onChange={(e)=>{
          changeArr(e)
        }}/>여자 <br />

    자기소개 <textarea cols="50" rows="5" name='ar2' onChange={(e) => {
      changeArr(e)
    }}/>

  
          <div>이름 : {arr.name}</div> <br />
          <div>이메일 :{arr.email}</div> <br />
          <div>비밀번호:{arr.pass}</div> <br />
          <div>학과 :{arr.rhk}</div> <br />
          <div>성별 :{arr.gender}</div> <br />
          <div>자기소개 : {arr.ar2}</div> <br />


    </>
  )
}
export default Test_1