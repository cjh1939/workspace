import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom';

const Order_List = () => {



  const [orderList,setorderList] =useState([]);
  
  


  
useEffect(()=>{
  axios.get('/api/orders')
  .then((res)=>{
    console.log(res.data);
    setorderList(res.data);
  })
  .catch(()=>{})
},[]);


  return (
    <>

    <div>Order-List</div>

    <table>
      <thead>
        <tr>
          <td>No</td>
          <td>상품명</td>
          <td>상품단가</td>
          <td>구매수량</td>
          <td>구매가격</td>
          <td>주문자</td>
          <td>주문일</td>
        </tr>
      </thead>
      <tbody>
        {
          orderList.map((item,i)=>{
            return(
              <tr key={i}>
                <td>{orderList.length -i}</td>
                <td>{item.itemDTO.itemName}</td>
                <td>{item.itemDTO.itemPrice}</td>
                <td>{item.buyCnt}</td>
                <td>{item.buyPrice}</td>
                <td>{item.buyer}</td>
                <td>{item.buyDate}</td>
              </tr>
            )
          })
        }
      </tbody>
    </table>
    <p>총 주문금액{}</p>





    </>
  )
}

export default Order_List