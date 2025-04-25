import { StyleSheet, Text, TextInput, View } from 'react-native'
import React from 'react'
import { colors } from '../../constants/colorConstant'

const Custominput = ({label, isPw=false, ...props}) => {
  return (
    <View>
      {
        label && <Text style={styles.label}>{label}</Text>
      }

      <View style={styles.container}>
        <TextInput 
        style={styles.input} 
        secureTextEntry ={isPw}
        {...props}
        />
      </View>

    </View>
  )
}

export default Custominput

const styles = StyleSheet.create({

  label :{
    fontSize: 12,
    marginBottom: 6,
    color : colors.ORANGE_600,
    
  },
  container :{
    height : 44,
    borderRadius: 8,
    paddingHorizontal: 10,
    justifyContent: 'center',
    borderWidth: 3,
    borderColor: colors.ORANGE_600,
    backgroundColor: colors.GRAY_100


  },
  input :{
    fontSize: 16,
    flex:1,

  }



})