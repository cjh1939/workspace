import { StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'

const MyTextInput = ({placeholder = '', ...props}) => {

  const [id, setId] =useState('');

  return (


    <TextInput style={styles.input} 
    placeholder={placeholder}
    {...props}

    //secureTextEntry //type = 'password'
    returnKeyType='next' // 자판 UI의 완료를 -> 다음으로변경
    autoCapitalize='none' //자동 대문자변환 비활성화 
    spellCheck={false} //맞춤법 검사 비활성화 
    autoCorrect={false} //맞춤법 자동 수정 비활성화
    



    />




  )
}

export default MyTextInput

const styles = StyleSheet.create({
  input:{
    borderWidth: 1,
    

  }


})