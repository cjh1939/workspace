import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import styles from "./ItemDetail.module.css";
import dayjs from 'dayjs';

const ItemDetail = ({itemSelect,change,cnt,setcnt}) => {
  const [itemUp, setItmeUp] = useState({});// 업데이트 변수
  const {itemNum} =useParams();
  const nav =useNavigate();

//업데이트
const update2 =()=>{
  axios.put(`/api/items/${itemSelect.itemNum}`,itemSelect)
  .then((res)=>{
    alert("수정 완료");
    console.log(res.data);
    //게시글 목록을 다시 조회 
    setcnt(cnt+1);
    
  })
  .catch((error)=>{})
}




  return (
    <>



    <div className={styles.detail_div}>
      <h3>상품 상세정보</h3>
        <table className={styles.detail_table}>
          <tbody>
          
            <tr>
              <td>상품번호</td>
              <td><input className='my_input wide' type="text" value={itemSelect.itemNum} name='itemNum'  readOnly={true} onChange={(e)=>{change(e)}}/></td>
            </tr>
            <tr>
              <td>상품명</td>
              <td><input className='my_input wide' type="text" value={itemSelect.itemName} name='itemName' onChange={(e)=>{change(e)}}/></td>
            </tr>
            <tr>
              <td>상품가격</td>
              <td><input className='my_input wide' type="text" value={itemSelect.itemPrice} name='itemPrice'  onChange={(e)=>{change(e)}}/></td>
            </tr>
            <tr>
              <td>판매자</td>
              <td><input className='my_input wide' type="text"value={itemSelect.seller} name='seller'  readOnly={true} onChange={(e)=>{change(e)}}/></td>
            </tr>
            <tr>
              <td>상품등록일</td>
              <td>
                <input className='my_input wide' type="text" value={dayjs(itemSelect.regDate).format('YYYY-MM-DD')} name='regDate' readOnly ={true} onChange={(e)=>{change(e)}}/></td>
            </tr>
            <tr>
              <td>상품설명</td>
              <td><textarea  className='my_input wide' value={itemSelect.itemIntro} name='itemIntro' onChange={(e)=>{change(e)}}></textarea></td>
            </tr>
          </tbody>
        </table>
        <div>
          <button className={styles.btn} type='button' onClick={(e)=>{
            update2();
            nav('/');
          }}>수정</button>
        </div>
      </div>













    
    </>
  )
}

export default ItemDetail