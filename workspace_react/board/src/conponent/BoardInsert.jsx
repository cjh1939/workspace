import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

const BoardInsert = () => {
  const nav = useNavigate();
  const[boardInsert,setBoardInsert] =useState({});




  const boardInsert1 = ()=>{
    axios.post('/api/boards',boardInsert)
    .then((res)=>{
      console.log(res.data);
      setBoardInsert(res.data);
    })
    .catch((error)=>{
      console.log(error);
    })
  }

const change =(e)=>{
  setBoardInsert({...boardInsert,
    [e.target.name] : e.target.value
  })
}

console.log(boardInsert);

  return (
    <>


<h1 className='m'>게시글 작성 페이지</h1>

    <table className='co'>
      <tr>
        <td>제목</td> 
        <td><input type="text" name='title' onChange={(e)=>{
          change(e)}} /></td>
      </tr>
      <tr>
        <td>작성자</td> 
        <td><input type="text" name='writer' onChange={(e)=>{
          change(e)}}/></td>
      </tr>
      <tr>
        <td>내용</td> 
        <td><textarea type="text" name='content' onChange={(e)=>{
          change(e)}}/></td>
      </tr>
    </table>

    <div className='bu'>
      <button type='button'  onClick={(e)=>{
        boardInsert1();
        nav('/');
      }}>글등록</button>
    </div>






    
    </>
  )
}

export default BoardInsert