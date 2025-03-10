
import { Route, Routes } from 'react-router-dom'
import './App.css'
import BoardList from './conponent/BoardList'
import BoardInsert from './conponent/BoardInsert'
import BoardDetail from './conponent/BoardDetail'
import BoardUpdate from './conponent/BoardUpdate'
import InputTest from './conponent/inputTest'
import QueryString from './conponent/QueryString'



function App() {
  

  return (
    <div className='container'>

      {/* <InputTest/> */}
  
    
    <h1>게시판</h1>
    
    


      <Routes>

        <Route path='' element={<BoardList/>}/>

        <Route path='/BoradInsert' element={<BoardInsert/>}/>

        <Route path='/BoardDetail/:boardNum' element={<BoardDetail/>}/>

        <Route path='/BoardUpdate/:boardNum' element={<BoardUpdate/>}/>

        {/* 쿼리스트링 연습 페이지 */}
          <Route path='/test' element={<QueryString />}/>
      </Routes>

      

    </div>
  )
}

export default App
