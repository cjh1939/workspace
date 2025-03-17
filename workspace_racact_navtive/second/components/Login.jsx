import { SafeAreaView, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import MyTextInput from './MyTextInput'
import MyButton from './MyButton'

const Login = () => {
  const printHello = ()=>{
    console.log('안녕하세요');
  }
  const [data,setData] =useState({
    id: '',
    pw:''
  });

const changeDate = (text,name)=>{
    setData({
      [name]: text
    })
}


  return (
    <SafeAreaView>

      
      <Text>Login</Text>

      <TextInput onChangeText={text=> changeDate(text,'id') } value={data.id} ></TextInput>
      <TextInput onChangeText={text=> changeDate(text,'pw')} value={data.pw}></TextInput>
      
      <MyTextInput  placeholder={'aaa'} onChangeText={text=> changeDate(text,'id') } value={data.id} />
      <MyTextInput placeholder={'bbb'} onChangeText={text=> changeDate(text,'pw')} value={data.pw}/>


      {/* alert 으로 안녕하세요 */}
      <MyButton onpress={()=>{alert('안녕하세요')}}  />
       {/* console에 안녕하세요 */}
      <MyButton size='large' onpress={()=>{printHello()}}/>

      <MyButton title='데이터 확인'  onPress={()=>{
        alert(`id= ${data.id}, pw=${data.pw}`);
      }} />

    </SafeAreaView>
  )
}

export default Login

const styles = StyleSheet.create({


})