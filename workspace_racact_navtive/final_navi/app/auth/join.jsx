import { StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import Custominput from '../../components/common/Custominput'
import CustomButton from '../../components/common/CustomButton'
import { api_join } from '../../apis/memberApi'



const JoinScreen = ({label}) => {

  const [joinData, setJoinData] =useState({
    memEmail: '',
    memPw : '',
    memName : ''
  });

const handelJoinData = (text, name)=>{
  setJoinData({
    ...joinData,
    [name] : text
  })


}
const join =()=>{
  console.log(joinData)

  api_join(joinData)
  .then((res)=>{  
    alert('성공')
    
  })
  .catch((error)=>{
    console.log(error)
  })
}






  return (

    <View>
      <View>
        <Custominput 
        label={'아이디'}
        value={joinData.memEmail}
        onChangeText={(text)=>{handelJoinData(text , 'memEmail')}}
        />
      </View>

      <View>
        <Custominput 
        label={'비밀번호'} 
        isPw={true}
        value={joinData.memPw}
        onChangeText={(text)=>{handelJoinData(text , 'memPw')}}
        />
      </View>

      <View>
        <Custominput 
        label={'이름'}
        value={joinData.memName}
        onChangeText={(text)=>{handelJoinData(text , 'memName')}}
        
        />
      </View>

      <View>
        <CustomButton 
        label='회원가입' 
        size='large'
        onPress={()=>{join()}}
        
        />
      </View>

    </View>

  )
}

export default JoinScreen

const styles = StyleSheet.create({})