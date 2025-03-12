import { Alert, Button,  SafeAreaView, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import { Pressable } from 'react-native'


const Style2 = () => {

  const [id,setId] = useState('');



  return (


      

    <SafeAreaView style={styles.container}>

      <View style={styles.content}>

      
      

      
      <View>
      <Text>아이디 </Text>
      <TextInput style={styles.input} value='' placeholder='아이디 입력' 
        onChange={(e)=>{console.log(e.nativeEvent.text)}}></TextInput>
      </View>

      <View>
      <Text>비밀번호 </Text>
      <TextInput style={styles.input} value=''placeholder='비밀번호' />
      </View>

    
      
      <View styles={styles.btnView}>

      <Pressable
      style={styles.btn}
      onPress={()=>{}}
      >
        <Text style={styles.btn1}>로그인</Text>
      </Pressable>

        </View>

      </View>
    </SafeAreaView>

  )
}

export default Style2

const styles = StyleSheet.create({

  container:{
    flex: 1,
    justifyContent: 'center',
    backgroundColor:'',
    padding:20
    
  },
  content:{
  gap: 6
    
  },

  btn:{
    borderWidth: 1,
    width: '30%',
    height: 35,
    borderRadius: 6,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: 'blue',
    
  },
  btn1:{
    color: 'white',
  
  },

  btnView:{
    alignItems: 'center'
  },

  font:{
    fontSize: 30,
    flex: 2,
    
  },

  input:{
    marginTop: 20,
    marginBottom: 10,
    paddingHorizontal: 10,
    height: 40,
    borderRadius: 10,
    borderColor: 'gray',
    borderWidth: 1
  }
})