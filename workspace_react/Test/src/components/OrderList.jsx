import axios from 'axios';
import React, { useEffect, useState } from 'react'
import'./container.css'

const OrderList = (props) => {
  const {order, btnF} = props;
  console.log(order);
  return (
    <>
    
    
    <div>
      <table className='list-Oder'>
        <colgroup>
        <col width={'10%'}></col>
        <col width={'30%'}></col>
        <col width={'20%'}></col>
        <col width={'20%'}></col>
        </colgroup>
        <thead className='h1'>
          <tr>
            <td>No</td>
            <td>상품명</td>
            <td>상품가격</td>
            <td>수량</td>
            <td>총구매가격</td>
          </tr>
        </thead>
        <tbody>
          {
            Object.keys(order).map((i)=>{
              return(
                <tr key={i} onClick={(e)=>{
                  btnF(i);
                }}>
                  <td>{order.length -i}</td>
                  <td>{order[i].itemName}</td>
                  <td>{order[i].itemPrice}원</td>
                  <td>{order[i].itemCnt}</td>
                  <td>{order[i].itemPrice * order[i].itemCnt}원</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </div>
    </>
  )
}

export default OrderList