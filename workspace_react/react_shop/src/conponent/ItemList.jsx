import axios from "axios";
import React, { useEffect, useState } from "react";
import { Link, useNavigate, useParams } from "react-router-dom";
import styles from "./ItemList.module.css";
import dayjs from "dayjs";
import ItemDetail from "./ItemDetail";

const ItemList = () => {
  const [itemList, setItmeList] = useState([]);//전제조회(목록) 변수
  const[itemSelect,setItmeSelect] = useState(null); //상세조회 변수

  const { itemNum } = useParams();
  const nav = useNavigate();

  //const [isShow, setIshow] = useState(false);  //상세정보 내용 삼항연산자 변수 

  const [cnt, setCnt] = useState(0);



  useEffect(() => {
    axios
      .get("/api/items")
      .then((res) => {
        setItmeList(res.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, [cnt]);





const change = (e)=>{
  setItmeSelect({
    ...itemSelect,
    [e.target.name] : e.target.value
  })
}

//업데이트
const update2 =()=>{
  axios.put(`/api/items/${itemSelect.itemNum}`,itemSelect)
  .then((res)=>{
    alert("수정 완료");
    console.log(res.data);
    
  })
  .catch((error)=>{})
}

//클릭시 상세정보 페이지 
const getdetail =(itemNum)=>{6+
  axios.get(`/api/items/${itemNum}`)
  .then((res)=>{
    
    setItmeSelect(res.data);
    //setIshow(true);
    console.log(res.data);
    
  })
  .catch((error)=>{})
}







  return (
    <>
    <div className={styles.item_info_container}>
      <div className={styles.list_div}>
        <h3>상품목록</h3>
        <table className={styles.list_table}>
          <colgroup>
            <col width={''}/>
            <col width={''}/>
            <col width={''}/>
            <col width={''}/>
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>상품명</td>
              <td>상품가격</td>
              <td>판매자</td>
            </tr>
          </thead>

          <tbody >
            {itemList.map((item, i) => {
              return (
                <tr key={i}>
                  <td>{itemList.length - i}</td>
                  <td>
                      
                        <span onClick={(e)=>{
                          getdetail(item.itemNum);
                        }}>{item.itemName}</span>
                      
                    
                  </td>
                  <td>￦{item.itemPrice.toLocaleString()}</td>
                  <td>{item.seller}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
        <p>총 {itemList.length}개의 상품이 등록되었습니다</p>
      
      </div>



          <div className={styles.detail_div}>
            {
              // isShow ? <ItemDetail  itemSelect={itemSelect} change={change}/> :null
              itemSelect && <ItemDetail  itemSelect={itemSelect} change={change} setCnt={setCnt}
              cnt={cnt}/>
            }
            
              
            </div>    
    </div> 
    


      



    </>
  );
};

export default ItemList;
