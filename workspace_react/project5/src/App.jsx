
import { useEffect, useState } from 'react'
import './App.css'
import { Effect_1 } from './Effect_1';

function App() {
  const [cnt,setCnt] = useState(0);



  //useEffect  : 컴포넌트의 생애주기에 맞춰 특징 기능을 실행하기 위해사용!
  //useEffect 는 매개변수로 2개의 데이터를 가짐
  //첫번째 매개변수 : 실행할 내용을 작성, 화살표 함수로 표현
  //두번째 매개변수 : 의존성 배열 , 두번재 매개변수는 필요할때만 사용 !
  //useEffect 안에코드는 html 로 그림을 전부 그린후 마지막에 실행된다





  //useEffect 의 두번째 매개변수를 사용하지 않으면 
  //컴포넌트가 mount 될때 + update 될때 실행하는 코드
  // console.log(1);

  // useEffect( () => {
  //   console.log(111);
  // });  
  
  // console.log(2);

  return (
    <>
      <div>react</div>
      <button type='button' onClick={(e)=>{
      setCnt(cnt+1);
    }}>버튼</button>
      <hr />

    <Effect_1/>

    </>
  )
}

export default App
