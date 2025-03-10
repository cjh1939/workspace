import React from 'react'

const Map3 = () => {
const localList =['경기도','강원도','경상도','전라도']
//로칼리스트 를 selectbox 를 그리세요 .
  return (
    <>
      <select >
      {
        localList.map =((a,i)=>{
          return (<option key={i}>{a}</option>)
        })
      }
      </select>
    </>
  )
}

export default Map3