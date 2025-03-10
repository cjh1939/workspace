import React, { useState } from 'react'

const Controller = (props) => {


  return (
    <>

    <div>Controller</div>

      <button  type='button' onClick={(e)=>{
        props.play1(props.play-1 );    
      }}>-1{}</button>
      <button type='button' onClick={(e)=>{
        props.play1(props.play -10);
      }}>-10{}</button>
      <button type='button' onClick={()=>{}}>-100{}</button>
      <button type='button' onClick={()=>{}}>+100{}</button>
      <button type='button' onClick={()=>{}}>+10{}</button>
      <button type='button' onClick={()=>{}}>+1{}</button>

    </>
  )
}

export default Controller