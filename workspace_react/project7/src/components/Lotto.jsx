import React, { useState } from "react";
import "./Lotto.css";
import LottoNum from "./LottoNum";

const Lotto = () => {
  //로또 번호를 저잘하는 변수
  const [num, setNum] = useState([0, 0, 0, 0, 0, 0]);

  return (
    <>
      <div className="lotto">
        {
        num.map((lotto, i) => {
          return (
              <LottoNum key={i}
              lotto={lotto}
              num={num}
              setNum={setNum}
              i={i} /> 
          )
        }
      )}
        





      </div>
    </>
  );
};

export default Lotto;
