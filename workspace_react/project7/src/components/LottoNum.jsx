import axios from "axios";
import React from "react";
import "./Lotto.css";

const LottoNum = (props) => {
  //버튼 클릭시 자바에서 1~45의 랜덤한 정수 받아 오는 함수
  const getLottoNum = (index) => {
    axios
      .get('/api/t9')
      .then((res) => {
        console.log(res.data);
        const copyNum = [...props.num];
        copyNum[index] = res.data;
        props.setNum(copyNum);
      })
      .catch((error) => {
        console.log("오류발생");
        console.log(error);
      });
  }

  return (
    <>
      <div className="num">
        <div className="display">{props.lotto}</div>
        <div className="btn">
          <button
            type="button"
            onClick={(e) => {
              getLottoNum(props.i);
            }}
          >
            생성
          </button>
        </div>
      </div>
    </>
  );
};

export default LottoNum;
