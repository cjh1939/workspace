import axios from 'axios';
import React, { useEffect, useState } from 'react'
import'./MemberList.css'
import { Link, useNavigate } from 'react-router-dom';

//REACT_MEMBER 테이블에 저장된 회원 정보를 조회하여 
//MemberList 컴포넌트에 table 형식으로 표현하세요/
//테이블의 컬럼(제목) : NO(행번호), 회원 ID, 회원명, 회원 연락처, 가입일 
const MemberList = () => {
  const [memberList, setMemberList] = useState([]);
  const nav = useNavigate(); 

  
  useEffect(()=>{
    axios.get('api/members')
    .then((res)=>{
      console.log(res.data);
      setMemberList(res.data);
    })
    .catch((error)=>{
      console.log(error);
    })
  },[]);

  




  return (
    <>

    <h2 className='c'>회원 목록 페이지</h2>
    <table className='co'>
      <thead className='co1'>
        <tr>
          <td>NO</td>
          <td>ID</td>
          <td>이름</td>
          <td>연락처</td>
          <td>가입일</td>
        </tr>
      </thead>
      <tbody>
        {
          memberList.map((e, i)=>{
            return(
              <tr key={i}> 
                <td>{memberList.length-i}</td>
                <td>
                  <Link to ={`/detail/${memberList[i].memId}`}><span>{memberList[i].memId}</span></Link>
                  </td>
                <td>
                  <span onClick={(e)=>{
                    nav(`/detail/${memberList[i].memId}`);
                  }}>{memberList[i].memName}</span>
                  </td>
                <td>{memberList[i].memTel}</td>
                <td>{memberList[i].joinDate}</td>
              </tr>
            )
          })
        }
      </tbody>
      
    </table>
      <div className='bo'>
        <button type='button' onClick={(e)=>{
          nav('/join')
        }} >회원 등록</button>
        
        
      </div>


    </>
  )
}

export default MemberList