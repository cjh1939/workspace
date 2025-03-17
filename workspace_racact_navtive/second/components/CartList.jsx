import { Image, Pressable, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import icon_edit from '@/assets/icons/edit.png'
import icon_delete from '@/assets/icons/delete.png'
import { icon } from '../constants/icons'
import { data } from '../data/data'
import Task from './Task'


const CartList = () => {
//각 상품이 수정 상태인지, 수정상태가 아닌지 판단하는 변수
  


  const [cartList2,setCartList2] = useState(data); 

  const [newItem,setNewItem] =useState('');
  console.log(cartList2)
  const aaa = cartList2.forEach((e,i)=>{
    
  });
  // const aa = cartList2.map((e,i)=>{return e.id}); //[1,2,3]
  // const end= Math.max(...aa) + 1 ;

  // const end1 = Math.max(...cartList2.map((e,i)=>{return e.id})) + 1 ;
  
  // console.log(max);





  return (

    <View>
    
      <Text>CartList</Text>

      {/* <Image source={icon_edit}/>
      <Image source={icon_delete}/>

      <Image source={icon.ICON_EDIT}/> */}




        
          {
            cartList2.map((item,i)=>{
              return(

                <Task  key={i} item={item} cartList2={cartList2} 
                setCartList2={setCartList2}
                />

              )
            })
          }
          
          <View>
            <TextInput 
            style={styles.input}
            value={newItem}
            onChangeText={text => setNewItem(text)}
            onSubmitEditing={(e)=>{

            // maxid +1 구하기
            let max = cartList2[0].id
              for(const e of cartList2){
                if(max < e.id){
                  max = e.id;
                }
              }
              const max1 = Math.max(...cartList2.map((e,i)=>{return e.id}));



              //저장할 객체생성
              const newData ={
                id: max+1,
                item: newItem
              }
              setCartList2([...cartList2,newData]);
              setNewItem('');
            }} //키보드의 완료, 엔터 키를 눌렀을때 실행하는 이벤트


            />
          </View>
        


    </View>

  )
}

export default CartList

const styles = StyleSheet.create({

  input:{
    borderWidth: 1
  },


})