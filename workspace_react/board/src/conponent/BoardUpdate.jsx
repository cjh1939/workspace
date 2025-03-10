import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';

const BoardUpdate = () => {
  const nav =useNavigate();
  const[getBoardUpdate,setGetBoardUpdate] = useState({});
  const {boardNum} = useParams();

  const change = (e)=>{
    setGetBoardUpdate({...getBoardUpdate,
        [e.target.name] : e.target.value
    })
  }

  console.log(getBoardUpdate);

useEffect(()=>{
  axios.get(`/api/boards/${boardNum}`)
  .then((res)=>{
    
    console.log(res.data);
    setGetBoardUpdate(res.data);
    
  })
  .catch((error)=>{
    console.log(error);
  })
},[]);



const update = ()=>{
  axios.put(`/api/boards/${getBoardUpdate.boardNum}`,getBoardUpdate)
  .then(res=>{
    console.log(res.data);
    alert("수정완료");
    nav(`/BoardDetail/${boardNum}`)
  })
  .catch((error)=>{
    console.log(error);

  })
}




  return (
    <>


    <h1>회원 수정 페이지</h1>


      <table>
        <tbody>
        <tr>
          <td>작성일</td>
          <td>{getBoardUpdate.regDate}</td>
          <td>작성자</td>
          <td>{getBoardUpdate.writer}</td>
        </tr>
        <tr>
          <td>제목</td>
          <td colSpan={3}><input type="text" name='title' value={getBoardUpdate.title} onChange={(e)=>{change(e)}} /></td>
        </tr>
        <tr>
          <td>내용</td>
          <td colSpan={3}><textarea name="content" value={getBoardUpdate.content} onChange={(e)=>{change(e)}}></textarea></td>
        </tr>
        </tbody>
      </table>

      <button type='button'onClick={(e)=>{
        nav(`/BoardDetail/${getBoardUpdate.boardNum}`);
      }} >뒤로가기</button>  

      
      <button type='button' onClick={(e)=>{
        update();
      }}>수정</button>








    </>
  )
}

export default BoardUpdate