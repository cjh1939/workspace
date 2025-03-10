import React, { useEffect, useState } from 'react'
import './Axsio_8.css'
import axios from 'axios'
const Axsio_8 = () => {

  
const [food1, setFood1] = useState({
  food : '',
  cnt : 1,
  option : '토핑',
  text : '',
  orderDate : ''

});

console.log(food1);



//모든 입력 값이 변경될때마다 실행시킬 함수 (무적 함수)
const changeOrderInfo = (e) => {
  setFood1({
    ...food1,
    [e.target.name] : e.target.value
  });
}
    


//전송버튼 클릭시 서버로 데이터를 보내는 기능의 함수
const senData = ()=>{
  axios.post('/api/t8', food1).
  then((res)=>{
    console.log(res.data);
    setFood1(res.data);
    alert('서버로 데이터를 전송했습니다.');
  }).
  catch(()=>{
    console.log('실패');
  })
}


  return (
  <>
    <table border={1}>
      <tbody>
      <tr>
        <td>음식선택</td>
        <td>
          <select value={food1.food} name='food' onChange={(e)=>{
            changeOrderInfo(e)
          }}>
            <option value={''}>선택</option>
            <option value="치킨">치킨</option>
            <option value="피자">피자</option>
            <option value="족발">족발</option>
          </select>
        </td>
      </tr>
      <tr>
        <td>수량</td>
        <td>
          <input name='cnt' type="number" value={1} onChange={(e)=>{
            changeOrderInfo(e)
          }} />
        </td>
      </tr>
      <tr>
        <td>추가선택</td>
        <td>
          <input name='option' type="radio"  value={"토핑"} checked={food1.option === '토핑'} onChange={(e)=>{
            changeOrderInfo(e)
          }} />토핑추가
          <input name='option' type="radio" value={"음료"} checked={food1.option === '음료'} onChange={(e)=>{
            changeOrderInfo(e)
          }} />음료추가
          <input name='option' type="radio" value={"공기밥"} checked ={food1.option === '공기밥'} onChange={(e)=>{
            changeOrderInfo(e)
          }} />공기밥추가
        </td>
      </tr>
      <tr>
        <td>요청사항</td>
        <td> <textarea rows={8} cols={40} value={food1.text} name='text' onChange={(e) => {changeOrderInfo(e)}}></textarea> </td>
      </tr>
      <tr>
        <td>주문일시</td>
        <td><input type="date" value={'2025-01-17'} onChange={(e)=>{
          changeOrderInfo(e)
        }} name='orderDate'/></td>
      </tr>
      </tbody>
    </table>

        <div>
        <button className='aa' type='button' onClick={(e)=>{
          senData();
      }}>전송</button>
        </div>


  </>
    
  )
}


export default Axsio_8


