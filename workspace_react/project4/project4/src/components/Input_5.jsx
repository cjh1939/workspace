import React from 'react'

const Input_5 = () => {
  
  return (
    <>
      이름 : <input type="text" /> <br />
      이메일 : <input type="text" /> <br />
      비밀번호 : <input type="password" /> <br />
      
      학과
      <select>
        <option value="">학과를 선택하세요</option>
        <option value="computer">컴퓨터공학</option>
        <option value="business">경영학과</option>
      </select> 
      <br />

      성별
      <input type="radio" value='male' checked/>남자
      <input type="radio" value='female'/>여자
      <br />

      자기소개
      <textarea cols="50" rows="5"></textarea>
      <br />

      <div>
        <h3>입력정보</h3>
        이름 : <br />
        이메일 : <br />
        비밀번호 : <br />
        학과 : <br />
        성별 : <br />
        자기소개 : <br />
      </div>


    </>
  )
}

export default Input_5