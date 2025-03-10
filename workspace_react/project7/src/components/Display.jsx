import React, { useState } from "react";

const Display = (props) => {
  console.log(props);

  return (
    <>
      <div> 현재 카운트 : </div>
        <h2>{props.paly}</h2>

      
    </>
  );
};

export default Display;
