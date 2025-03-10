import React, { useState } from "react";

function Test1() {
  const [data, setdata] = useState({
    name: "김자바",
    age: 20,
    addr: "울산시",
  });



  return (
    <>
      <div>test_1</div>
      <div>이름 : {data.name}</div>
      <div>나이 : {data.age}</div>
      <div>주소 : {data.addr}</div>
      <button id ='aaa' className="bbb" type="button" onClick={(e) => { // e : 이벤트 발생시 실행코드로 작성하는 함수의 매개변수로는 
      //이벤트 객체를 전달받을수 있다.
      //이벤트 객체는 이벤트와 관련된 모든 정보를 객체 형태로 갖고 있다.
        const copyData = {...data};
        copyData.name = '홍길동';
        setdata(copyData);
        
        console.log(e);
        console.log(e.target); // -> 이벤트가 발생한 태그 
        console.log(e.target.id); // 의 태그의 타입 속성값
        console.log(e.target.className);
      }}>
        이름을 홍길동으로 변경
      </button>
      <button type="button" onClick={(e) => {
        const copyData = {...data};
        copyData.age = 30;
        setdata(copyData);
      }}>
      나이를 30으로 변경
      </button>
      <button type="button" onClick={(e) => {
        const copyData = {...data};
        copyData.addr = '서울시';
        setdata(copyData);
      }}>
        주소를 서울시로변경
      </button>
    </>
  );
}

export default Test1;
