import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';



const Order = () => {
  const nav = useNavigate();

  //상품목록 저장할 변수
  const [itemList,setItemList] =useState([]);

  //입력한정보 저장할변수
  const [orderData,setOrderData] =useState({
    itemNum: '',
    price: '상품을 선택하세요',
    buyer: '',
    buyCnt: 1,
    
  });
  console.log(orderData);


  useEffect(()=>{
    axios.get('/api/items')
    .then((res)=>{setItemList(res.data);})
    .catch((error)=>{console.log(error);})
  },[]);
  


  const changeOrderData = (e)=>{

    if(e.target.name === 'itemNum'){
      let itemPrice = 0;

      for(const item of itemList){
        if(item.itemNum == e.target.value){
            itemPrice = item.itemPrice;
        }
      }
      setOrderData({
        ...orderData,
        [e.target.name]:e.target.value,
          price: itemPrice,
        // price: itemList.find((e) => {return e.itemNum == e.target.value}).itemPrice
      });
    }

    else{
      setOrderData({
        ...orderData,
        [e.target.name]:e.target.value,
        
      });
      
    }
    
  }


const insertorder =()=>{
  axios.post('api/orders',orderData)
  .then((res)=>{
    nav('/order-list');
  })
  .catch(()=>{})
}






  return (
    <>


    <div>
      <div>order</div>
        
      <div>
        <select name='itemNum'value={orderData.itemNum} onChange={(e)=>{changeOrderData(e)}}>
          <option value="">선택</option>
          {
            itemList.map((item,i)=>{
              return(
                <option key={i} value={item.itemNum}>{item.itemName}</option>
              )
            })
          }
        </select>

      </div>
        <div>상품단가: <input type="text" readOnly={true} name='price'value={orderData.price} onChange={(e)=>{changeOrderData(e)}}/></div>
        <div>주문자: <input type="text" name='buyer'value={orderData.buyer} onChange={(e)=>{changeOrderData(e)}} /></div>
        <div>주문수량: <input type="text"name='buyCnt'value={orderData.buyCnt} onChange={(e)=>{changeOrderData(e)}} /></div>

        <button type='button' className='btn btn-larg ' onClick={(e)=>{
          insertorder()
        }}>주문하기</button>
    </div>

    
    </>
  )
}



export default Order