import { Keyboard, StatusBar, StyleSheet, Text, TouchableWithoutFeedback, View } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native'

import CartList from '@/components/CartList'
// ../ == @ (@최상위 폴더) 
const Mainscreen = () => {
  
  return (
    //TouchableWithoutFeedback 는 터치는 감지하되, 아무 반응도일어 나지않는컴포넌트 
    //주로 키보드를감출때 사용.
    //TouchableWithoutFeedback onPress={Keyboard.dismiss} 이 명령어 = 키보드 숨김코드 

      <TouchableWithoutFeedback onPress={Keyboard.dismiss}> 
        <SafeAreaView style={styles.mainContainer}>
          <StatusBar barStyle={'light-content'}
          backgroundColor={'#555555'} //ios 는 미적용 
          />
  
          {/* <Login/> */}
          <CartList />
  
  
        </SafeAreaView>
      </TouchableWithoutFeedback>
    
  )
}

export default Mainscreen

const styles = StyleSheet.create({
  mainContainer:{
    flex: 1
  }
  
})