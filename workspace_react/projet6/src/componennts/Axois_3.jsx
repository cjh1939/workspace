import axios from 'axios';
import React, { useEffect, useState } from 'react'

const Axois_3 = () => {
  //서버에서 넘어오는 데이터를 저장할 변수 초기값은 
  //최종적으로 받는 데이터의 자료형과 일치시켜서 만들어줌
  const [person, setPerson] = useState({});

  //서버에서 데이터를 받아 person 에 저장하는 함수
  const getPersonData  = () => { 
    //서버에서 데이터 불러오기 
    axios.get('/api/t4') //서버주소
    .then((res)=>{
      console.log('통신 성공');
      console.log(res.data);
      setPerson = (res.data);
    })  //서버와 통신성공시 실행내용 작성 
    //res: 통신 성공한 모든 데이터를 객체 혈태  & 서버에서 받아온 데이터 : res.data

    .catch((error)=>{
      console.log('통신 실패');
      console.log(error);
    })  //서버와 통신실패시 실행내용 작성
        //통신 실패에대한 모든 데이터를 객체 형태}


  //컴포넌트의 특정 생애주기에 기능을 구현할 때
  //서버에서 데이터 받을 때 오래걸리기 때문에  -> 그림 다 그린후 마지막에 실행
 // useEffect();


   //서버에서 데이터 받을 때 사용 
  
  // axios.get();


  return (
    <>

    <div>Axois_3</div>

    <input type="button" value={'버튼'} onClick={(e)=>{
      getPersonData();
    }}/>

    <div>
      <p>이름 :{person.name}</p>
      <p>나이 :{person.age}</p>
      <p>주소 :{person.addr}</p>
    </div>

    <div>
      
    </div>


    </>
  )
}
}
export default Axois_3



