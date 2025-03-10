import React, { useState } from "react";

const Test2 = () => {
  //on, off 글자
  const [a, setA] = useState("on");
  const [b, setB] = useState("off");

  return (
    <>
      <div>Test2</div>
      <div className="c">{a}</div>
      <button type="button" onClick={() => {
        setA(a === 'ON' ? 'OFF' : 'ON');
        setB(b === 'OFF' ? 'ON' : 'OFF');
      }}>{b}</button>
    </>
  );
};

export default Test2;
