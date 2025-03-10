import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const MemberDetail = () => {
  const nav  = useNavigate();
  const{memId} = useParams();
  console.log(memId);
  const[MemberDetail,setMemberDtail] = useState([]);

  const[MemberDel, setMemberDel] = useState();

  //회원 한명조회 
  useEffect(()=>{
    axios.get(`/api/members/${memId}`)
    .then((res)=>{
      console.log(res.data);
      setMemberDtail(res.data);
    })
    .catch((error)=>{
      console.log(error);
    })
  },[]);



  //회원삭제
  const Delt = ()=>{

    if(!confirm("정말 삭제 할까요 ?")){
      return;
    }

    axios.delete(`/api/members/${memId}`,MemberDel)
    .then((res)=>{
      alert("회원이 삭제되었습니다.");
      nav('/')
      setMemberDel(res.data);
    })
    .catch((error)=>{
      console.log(error);
    })
  }

  const change = (e) =>{
    setMemberDel({...MemberDel,
      [e.target.name] : e.target.value
    })
  }
  


  return (
    <>


    <h2>회원상세 정보 페이지</h2>
    <td name='memId'>ID:  {MemberDetail.memId}</td>
    <td name='memName'>이름 : {MemberDetail.memName}  </td>
    <td name='memPw'>비밀번호: {MemberDetail.memPw}</td>
    <td name='memTel'>연락처:  {MemberDetail.memTel}</td>
    <td name='memTel'>내용:  {MemberDetail.memIntro}</td>
    <td name='memjoinDate'>가입일:   {MemberDetail.joinDate}</td>

    
      
    <button type='button'  onClick={(e)=>{
      nav(`/Update/${MemberDetail.memId}`)
    }}>수정</button>

    <button type='button' onClick={(e)=>{
        Delt();
    }}>삭제</button> <br />

<button  type='button' onClick={(e)=>{
      nav('/');
    }}>목록으로가기</button>






    
  </>
  )
}

export default MemberDetail