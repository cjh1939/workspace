import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';

const MemberUpdate = () => {
  const nav  = useNavigate();
  const params = useParams();

  //수정할 회원의 모든 정보를 저장할 state변수 
  const[MemberUpdate,setMemberUpdate] = useState({});

  //마운트시 spring에서 회원정보를 조회하여 조회한 데이터를 MemberUpdate 변수에 저장
  useEffect(()=>{
    axios.get(`/api/members/${params.memId}`)
    .then((res)=>{
      setMemberUpdate(res.data);
      
    })
    .catch((error)=>{
      console.log(error);
    })
  },[]);


//update기능 실행 함수
  const Update = ()=>{
    axios.put(`/api/members/${params.memId}`, MemberUpdate)
    .then((res)=>{
      alert("회원의 정보가 변경되었습니다.");
      nav(`/detail/${params.memId}`);
      console.log(res.data);
      console.log(MemberUpdate);
    })
    .catch((error)=>{
      console.log(error);
      console.log(MemberUpdate);
    })
  }

  //input태그의 값이 변경될대마다 실행하는함수 
  const change  = (e)=>{
    setMemberUpdate({...MemberUpdate,
        [e.target.name] : e.target.value
    })
  }

  console.log(MemberUpdate);

  return (
    <>


    <h2>회원 수정 페이지</h2>

    <table>
      <tr>
        <td>아이디</td>
        <td>{MemberUpdate.memId}</td>
      </tr>
      <tr>
        <td>이름</td>
        <td>
          <input type="text" name='memName' value={MemberUpdate.memName} onChange={(e)=>{
          change(e);
        }}/>
        </td>
      </tr>
      <tr>
        <td>비밀번호</td>
        <td><input type="text"name='memPw'onChange={(e)=>{
          change(e);
        }} /></td>
      </tr>
      <tr>
        <td>연락처</td>
        <td><input type="text" name='memTel' value={MemberUpdate.memTel} onChange={(e)=>{
          change(e);
        }}/></td>
      </tr>
      <tr>
        <td>내용</td>
        <td><input type="text" name='memIntro' value={MemberUpdate.Intro} onChange={(e)=>{
          change(e);
        }}/></td>
      </tr>
    </table>

    <button type='button' onClick={(e)=>{
        Update();
        
    }}>회원 수정</button>



    </>
  )
}

export default MemberUpdate