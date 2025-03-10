import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

const MemberJoin = () => {
  const nav = useNavigate();
  const[MemberInsert,setMemberInsert] = useState({
    memId :"",
    memPw :"",
    memPwi : "",
    memName: "",
    memTel: "",
    memIntro: ""
  });

  const validateRegData =()=>{
    let isValid = true;
    if(MemberInsert.memId === ''){
      alert("아이디는 필수입력 입니다.");
      isValid =false;
    }
    if(MemberInsert.memName === ''){
      alert("이름은 필수 입력입니다.");
      isValid =false;
    }
    if(MemberInsert.memPw !== MemberInsert.memPwi ){
        alert("입력한 비밀번호가 다릅니다.");
        isValid =false;
    }
    return isValid;
  }


//가입버튼 클릭시 실행 함수  
  const Memdata = ()=>{
    //데이터 유효성(중복) 검사(validation 처리)
  
    if(!validateRegData()){
      return;
    }


    axios.post('/api/members',MemberInsert)
    .then((res)=>{
      
      
        alert(`${MemberInsert.memId}님 가입을 축하합니다.`);
        nav('/');
      
    })
    .catch((error)=>{
      console.log(error);
    })
  }

  const change = (e) =>{
    setMemberInsert({...MemberInsert,
      [e.target.name] : e.target.value
    })
  }

  
console.log(MemberInsert);

  return (
    <>

    <h2>회원 등록 페이지</h2>

  
    <div>회원 ID : <input type="text" name='memId'  onChange={(e)=>{
      change(e); 
    }} /> </div>
    <div>회원 비밀번호 : <input type="passward" name='memPw' onChange={(e)=>{
      change(e);
    }} /> </div>
    <div>회원 비밀번호확인 : <input type="passward" name='memPwi' onChange={(e)=>{
      change(e);
    }} /> </div>
    <div>회원 이름 :<input type="text" name='memName' onChange={(e)=>{
      change(e);
    }} /> </div>
    <div>회원 연락처 : <input type="text" name='memTel' onChange={(e)=>{
      change(e);
    }} /> </div>
    <div>회원 내용 : <input type="text" name='memIntro' onChange={(e)=>{
      change(e);
    }} /> </div>

    <button type='button' onClick={(e)=>{
        Memdata();
        nav('/');
      }}>등록</button>



    </>
  )
}

export default MemberJoin