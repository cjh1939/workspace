import React from 'react'
import Display from './Display'
import Controller from './Controller'

const Counter = () => {
  const [paly, setPlay] = useState(0);

  return (
    <>
    
      <h2>Simple Counter</h2>
      <Display paly = {paly}/>
      <Controller paly1 ={setPlay} paly={paly}/>

    </>
  )
}

export default Counter