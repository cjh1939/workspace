import { Image, Pressable, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import { icon } from '../constants/icons'

const Task = ({item,cartList2,setCartList2}) => {

  //수정상태 여부
const [isEditing,setIsEditing] = useState(false);

// 수정을 위해서는 input 태그에 입력한 글자 id도 필요
// 전체 데이터 필요 (data)

//input 태그에 입력한 데이터 
//주의! props로 전달된 데이터를 state변수에 초기값으로 주면안됨 
  const [newText,setNewText ] = useState('');

// 마운트 될때 변경된 item 값 실행
  useEffect(()=>{
    setNewText(item.item);
  },[item]);

//장바구니 목록데이터 수정 

  const handleCartList = ()=>{
    //상품목록 현재 수정중인상품의 id 를 찿아서 
    //찿은 상품의 item 수정값을 input 태그에 입력한 
    //글자로바꿔준다 .
    // cartList2
    // item.id
    // newText;
    // setCartList2();

    //1번풀이 
    // const copyCartList = [...cartList2];
    // for(const cart of copyCartList){
    //   if(cart.id === item.id){
    //     cart.item = newText;
    //   }
    // }
    // setCartList2(copyCartList);

    //2번풀이
    //find : 조건과 일치하는 데이터만 리턴한다
    //filter : 조건과일치하는 데이터만 걸러낸다 (제외한다)
    const copyCartList = [...cartList2];
    const findCart = copyCartList.find((cart)=>{return item.id === cart.id});
    findCart.item = newText;
    setCartList2(copyCartList);

  }

const hadelList = ()=>{
  const copyCartList =[...cartList2];
  const deleteCart =copyCartList.filter((cart)=>{return })



}


  return (
  
        <View style={styles.container} >
          {
            isEditing 
            ?  
            <>
              <TextInput style={styles.input} autoFocus={true} 
              //포커스 아웃 이벤트
              onBlur={()=>{setIsEditing(false)
                setNewText(item.item);
              }}
              onChangeText={text => setNewText(text)}
              value = {newText}
              onSubmitEditing={()=>{handleCartList()}}
              />
            </>
            :
            <>
              <Text style={styles.title}>{item.item}</Text>

              <Pressable onPress={()=>{setIsEditing(true)}}>
                <Image source={icon.ICON_EDIT} style={styles.img}  />
              </Pressable>

              <Image source={icon.ICON_DELETE} style={styles.img} 
              autoFocus={true}
              onBlur={()=>{setIsEditing(false)}}
              onChangeText={text => setNewText(text)}
              onSubmitEditing={()=>{}}
              /> 

            </>
          }

        </View>
  )
}

export default Task

const styles = StyleSheet.create({

  container:{
    borderWidth: 1,
    margin: 12,
    backgroundColor: '#eeeeee',
    borderRadius: 5,
    flexDirection: 'row',
    alignItems: 'center',
    padding : 10,
  },

  title:{
    //fontSize: 50,
    flex: 1,
    gap: 10,
    //height:40,
    //borderWidth:1
    
  },
  img:{
    width:30,
    height:30
  },
  input:{
    borderWidth:1,
    width: '100%'
  },



})