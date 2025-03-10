import React, { useEffect, useState } from 'react'

export const Effect_1 = () => {
  const [cnt1,setCnt1] = useState(0); 
  const [cnt2,setCnt2] = useState(0); 


  //useEffect 의 두번째 매개변수를 의존성 배열이라부름
  //의존성 배열을 어떻게 작성하냐에 따라서 useEffect의 리렌더링 시점의 
  //실행 여부를 결정

  //의존성배열을 빈배열로 선언하면 
  //useEffect 의 내용은 mount 될때만 실행
  useEffect(()=>{
    console.log(5);
  }, []);
//의존성 배열에 cnt1 변수를 작성하면 
//mount + cnt1이 변경되서 리렌더링 될때만 실행
  useEffect(()=>{
    console.log('cnt1값 변경');
  }, [cnt1]);

  //mount +cnt2 값이 변경되어 리렌더링 될때
  useEffect(()=>{
    console.log('cnt2값 변경');
  }, [cnt2]);

//mount +cnt2 또는 cnt1 둘중하라도 변경되서 리렌더 될때는실행
  useEffect(()=>{
    console.log('값 변경');
  }, [cnt1,cnt2]);


  return (
    <>
    <div>Effect_1</div>

    <button type='button' onClick={(e)=>{
      setCnt1 (cnt1 + 1 )
      }}>cnt1 변경 버튼</button>

    <button type='button' onClick={(e)=>{
      setCnt2 (cnt2 + 1 )
      }}>cnt2 변경 버튼</button>




    </>
  )
}
export default Effect_1;