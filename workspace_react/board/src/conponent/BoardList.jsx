import axios from 'axios';
import React, { useEffect, useState } from 'react'
import'./Board.css'
import { Link, useNavigate, useParams } from 'react-router-dom';
// import styles from './BoardList.module.css'



const BoardList = () => {
  const {boardNum} = useParams();
  const nav = useNavigate();
  const[boardList,setboardList] = useState([]);
  



useEffect(()=>{
  axios.get('/api/boards')
  .then((res)=>{
    setboardList(res.data);
    
  })
  .catch((error)=>{
    console.log(error);
  })
},[]);

const [data,setData] =useState({
  age: '',
  name:''
});

const changeData = (e)=>{
  setData({
    ...data,
    [e.target.name] : e.target.value
  })
}

//검색창에 입력한 데이터 저장할 변수
const [searchData,setSearchData] = useState({
  searchKeyword : 'TITLE',
  searchValue:''
});
//검색창내용 변경시 실행되는 함수
const changeSearchData= (e)=>{
  setSearchData({
    ...searchData,
    [e.target.name] : e.target.value
  })
}

const searchList =()=>{
  axios.get(`/api/boards?searchKeyword=${searchData.searchKeyword}&searchValue=${searchData.searchValue}`)
  .then(res => setboardList(res.data))
  .catch(error => console.log(error));
}






console.log(searchData);
  return (
    <>

    <h1 className='m'>자유 게시판</h1>
      
    <div>
        <select value={searchData.searchKeyword} name='searchKeyword' 
          onChange={(e)=>{changeSearchData(e)}}>

          <option value="TITLE" >제목</option>

          <option value="WRITER">작성자</option>

        </select>

        <input type="text" name='searchValue' value={searchData.searchValue} onChange={(e)=>{changeSearchData(e)}}/>
        
          <button onClick={e=>{ searchList() }}>검색</button>
    </div>

    <table className='co'>
      
      <thead className='co1'>
        <tr>
          <td>No</td>
          <td>제목</td>
          <td>작성자</td>
          <td>작성일</td>
          <td>조회수</td>
        </tr>
      </thead>

      <tbody>
        {
          boardList.map((board,i)=>{
            return(
              <tr key={i}>
                <td>{boardList.length-i}</td>
                <td>
                  <Link to={`/BoardDetail/${board.boardNum}`} ><span>{boardList[i].title}</span></Link>
                  </td>
                <td>{board.writer}</td>
                <td>{board.regDate}</td>
                <td>{board.readCnt}</td>
              </tr>
            )
          })
        }
      </tbody>
      
    </table>

    <div className='bu'><button type='button' className='bo1' onClick={(e)=>{
      nav('/BoradInsert');
    }}>글쓰기</button>
    
    {/* 나이 이름 입력값을 쿼리스트링 방식으로  */}
    {/* 버튼클릭시 /test url로 전달하세요 */}
  

    
    <div>Query String</div>

    <div>나이 : <input type="text" name='age' value={data.age} onChange={(e)=>{changeData(e)}}/> </div>

    <div>이름 : <input type="text" name='name' value={data.name} onChange={(e)=>{changeData(e)}}/> </div>

    <button type='button' onClick={(e)=>{
      nav(`/test?age=${data.age}&name=${data.name}`)
    }}>Query String 실행</button>
    
    </div>
    





    </>
  )
}

export default BoardList