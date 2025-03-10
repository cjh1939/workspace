import React, { useEffect, useState } from 'react'
import'./Axios_5.css'
import axios from 'axios';

const Axios_5 = () => {
  const [person2,setPerson2] = useState([]);

  const [Student1,setStudent1] = useState([]);
//서버에서 데이터가져온느 함수 
  const getPerson2 = ()=>{ 
    axios.get('/api/t5')
    .then((res)=>{
      setPerson2(res.data)
    })
    .catch((error)=>{
      console.log('에러');
    })
  }

  
const getStudent1 = ()=>{
  axios.get('/api/t6')
    .then((res)=>{
      setStudent1(res.data)
    })
    .catch((error)=>{
      console.log('에러');
    })
}


  return (
  
    <>
    <div>Axios_5</div>

      <table className='t1'>
        <colgroup>
        <col width={'50%'}/>
        <col width={'50%'}/>
        </colgroup>
        <tbody>
          <tr className='t1-tr' >
            <td >
              <button type='button' onClick={(e)=>{
                getPerson2()
              }}>버튼</button>
              <table border={1}>
                <thead>
                  <tr>
                    <td>이름</td>
                    <td>나이</td>
                    <td>주소</td>
                  </tr>
                </thead>

                <tbody>
                  {
                    person2.length === 0 ? 
                    <tr>
                      <td colSpan={3}>버튼1을 클릭하면 데이터가 조회됩니다</td>
                    </tr>
                    :
                    person2.map((person,i)=>{
                      return(
                        <tr key={i}>
                          <td>{person.name}</td>
                          <td>{person.age}</td>
                          <td>{person.addr}</td>
                        </tr>
                      )
                    })
                  }
                </tbody>
              </table>

            </td>
            <td >
              <button type='button' onClick={(e)=>{
                getStudent1()
              }}>버튼</button>
              <table>
              <thead>
                  <tr>
                    <td>이름</td>
                    <td>국어</td>
                    <td>영어</td>
                    <td>수학</td>
                    <td>총점</td>
                  </tr>
                </thead>

                <tbody border={1}>
                  {
                    Student1.length === 0 
                    ?
                    <tr>
                      <td colSpan={3}>버튼1을 클릭하면 데이터가 조회됩니다</td>
                    </tr>
                    :
                    Student1.map((Student1,i)=>{
                      return(
                        <tr key={i}>
                          <td>{Student1.name}</td>
                          <td>{Student1.korScore}</td>
                          <td>{Student1.engScore}</td>
                          <td>{Student1.matScore}</td>
                          <td>{Student1.matScore + Student1.engScore + Student1.korScore}</td>
                        </tr>
                      )
                    })
                  }
                </tbody>
              </table>
            </td>
          </tr>
        </tbody>
      </table>




    </>
  )
}
//버튼1클릭시 사람목록표로 보여주기
//버튼2클릭시 학생목록을 표로 보여주기 -이름 국어 영어 수학 총점


export default Axios_5