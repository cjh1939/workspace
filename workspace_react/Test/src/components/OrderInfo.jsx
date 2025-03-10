import React, { useEffect, useState } from 'react'
import OrderList from './OrderList'
import OrderDetail from './OrderDetail'
import'./container.css'
import axios from 'axios'

const OrderInfo = () => {
  const [order,setOrder] = useState([]); //서버에서 받을 state 변수 
  const [keyNum, setKeyNum] = useState(0);
  const [tag, setTag] = useState("tag-off")

  const btnF = (i) => {
    setKeyNum(i);
    setTag("tag-on");
  };

  useEffect(()=>{
    axios.get('api/restTest')
    .then((res)=>{
      console.log(res.data);
      setOrder(res.data);
    })
    .catch((error)=>{
      console.log(error);
    })
  },[]);


  return (
    <>
    <div className='container'><h2>주문 목록</h2></div>
    
      <OrderList order={order} btnF={btnF}/> 
    
    {
      order.length === 0 ? null : <OrderDetail order={order} keyNum={keyNum} tag={tag} /> 
    }
    </>
  )
}

export default OrderInfo