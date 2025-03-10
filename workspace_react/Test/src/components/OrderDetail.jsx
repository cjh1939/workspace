import React, { useState } from 'react'
import'./container.css'
const OrderDetail = (props) => {
  const {order, keyNum, tag} = props;
  console.log(keyNum);
  console.log(order);
  
  return (
    <>
    <div className='container'><h2>주문상세 페이지</h2></div>
    <div className={tag}>
      <table className='detail'>
        <colgroup>
        <col width={'10%'}></col>
        <col width={'10%'}></col>
        <col width={'10%'}></col>
        <col width={'10%'}></col>
        </colgroup>
        
        <tbody>
          
          <tr>
            <td className='co'>상품번호</td>
            <td className='co1'>{order[keyNum].itemCode}</td>
            <td className='co'>상품명</td>
            <td className='co1'>{order[keyNum].itemName}</td>
          </tr>
          <tr>
            <td className='co'>가격</td>
            <td className='co1'>{order[keyNum].itemPrice}</td>
            <td className='co'>수량</td>
            <td className='co1'>{order[keyNum].itemCnt}</td>
          </tr>
          <tr>
            <td className='co'>주문자ID</td>
            <td className='co1'>{order[keyNum].id}</td>
            <td className='co'>구매금액</td>
            <td className='co1'>{order[keyNum].itemCnt * order[keyNum].itemPrice}</td>
          </tr>
        </tbody>
      </table>
    </div>
    </>
  )
}

export default OrderDetail