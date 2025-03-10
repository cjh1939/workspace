import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import styles from './Itemjoin.module.css'

const ItemJoin = () => {

const [itemJoin,setItemJoin] =useState({
  itemName:'',
  itemPrice:'',
  seller : '',
  itemIntro: ''
});

const {itemNum} =useParams();
const nav = useNavigate();


//상품등록기능
const join =()=>{
  if( !(itemJoin.itemName  && itemJoin.itemPrice) ){
    alert('상품명과 가격은 필수입력입니다.');
    return;
  }


  axios.post('/api/items',itemJoin)
  .then((res)=>{
    alert("상품등록 완료");
    setItemJoin(res.data);
    nav('/');
  })
  .catch((error)=>{})
}



const change = (e)=>{
  setItemJoin({...itemJoin,
    [e.target.name]:e.target.value
  })
}



  return (
    <>


    

    <div className={styles.item_insert_container}>
    <h2>상품등록</h2>
      <table className={styles.item_insert_table}>
        <colgroup>
          
        </colgroup>
        <tbody>
          <tr>
            <td>상품명</td>
            <td><input className='my_input wide' type="text"value={itemJoin.itemName} name='itemName' onChange={(e)=>{change(e)}} /></td>
          </tr>
          <tr>
            <td>상품가격</td>
            <td><input className='my_input wide' type="text"value={itemJoin.itemPrice} name='itemPrice' onChange={(e)=>{change(e)}} /></td>
          </tr>
          <tr>
            <td>판매자</td>
            <td><input className='my_input wide' type="text" value={itemJoin.seller} name='seller' onChange={(e)=>{change(e)}}/></td>
          </tr>
          <tr>
            <td>상품설명</td>
            <td><textarea type="text" value={itemJoin.itemIntro} name='itemIntro' onChange={(e)=>{change(e)}}></textarea></td>
          </tr>
        </tbody>
      </table>
        <div className={styles.btn_div}>
          <button className='btn btn-large' type='button' onClick={(e)=>{
                join();
                
            }}>상품 등록</button>
        </div>
      </div>









    </>
  )
}

export default ItemJoin