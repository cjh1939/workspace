

import { Route, Router, Routes } from 'react-router-dom'
import './App.css'
import './common.css'
import ItemList from './conponent/ItemList';
import ItemDetail from './conponent/ItemDetail';
import ItemJoin from './conponent/ItemJoin';
import Header from './conponent/Header';
import Order from './conponent/order';
import Order_List from './conponent/Order_List';


// import styles from'./Item.module.css'


function App() {
  //falsy : false로 판단하는내용
  //null,undefined, 0,''
  
  //truthy : falsy 한데이터빼고 전부.

  // const data = [];
  // if(data){
  //   console.log(1111);
  // }
// const data1 = 'java';
// const data2 = 'python';
// console.log(data1 && data2 );
// console.log(data1 || data2 );



  return (
    <>
      <div className='container'>
        
        <Header/> 
    
      
      <Routes>
        {/* 글목록 페이지 */}
        <Route path='' element={<ItemList/>}/>  
        {/* 상세정보 페이지 */}
        <Route path='/detail/:itemNum' element={<ItemDetail/>}/>
        {/* 아이템등록 페이지 */}
        <Route path='/itemjoin' element={<ItemJoin/>}/>
        {/* 주문페이지 */}
        <Route path='order' element={<Order/>}/>
        {/* 주문 목록 페이지 */}
        <Route path='order-list' element={<Order_List/>}/>
        
      </Routes>

      </div>
    </>
  )
}

export default App
