
import { Link, Route, Routes, useNavigate } from 'react-router-dom'
import './App.css'
import Header from './componernts/Header'
import Login from './componernts/Login'
import BoardList from './componernts/BoardList'
import BoardDtail from './componernts/BoardDtail'

function App() {
  //useNavigate ( ) hook 은 페이지 이동기능을 제공하는 함수를리턴
  const nav = useNavigate();
  



  return (
    <>
      <Header />
      
      <Routes>
        {/* 게시글 목록 페이지 */}
        <Route path=' ' element={<BoardList/>}/>
        

        {/* 게시글 상세페이지 */}
        <Route path='/detail/:num/:age' element={<BoardDtail/>}/>

        {/* 게시글 등록페이지 */}


        {/* 게시글 수정 페이지 */}


        {/* 로그인 페이지 */}
        <Route path='/login' element={<Login/>} />
        {/* 마이페이지 */}
        <Route path='/my-page' element={<div>마이페이지 입니다</div>}/>
      </Routes>

      {/* 버튼클릭시 페이지 이동 */}
      <button type='button' onClick={(e)=>{
        nav('/my-page');
      }}>마이페이지 이동</button>

    </>
  )
}

export default App
