
function Footer (){
  return(
    <>
      <div>
        footer
      </div>
      <button type="button" onClick={() => {
        console.log("버튼클릭!");
      }}/>버튼1
      <button type="button" onMouseEnter={()=>{
        console.log("5");
      }}/>버튼2
        <input type="text" onChange={()=>{
          alert("!!!");
        }}/>


    </>
  )
}

export default Footer












