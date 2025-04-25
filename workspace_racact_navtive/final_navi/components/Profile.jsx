import { Image, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import face from '../assets/images/face-01.jpg';
import FontAwesome6 from '@expo/vector-icons/FontAwesome6';
import { colors } from '../constants/colorConstant';



const Profile = ({writer,createData}) => {
  return (
    <View style={styles.container}>
      <View style={styles.ProfileContainer}>
        <Image source={face} style={styles.img}/>
        <View style={{gap : 4}}>
          <Text style={styles.writer}>{writer}</Text>
          <Text style={styles.createDate}>{createData}</Text>
        </View>
      </View>
        <View style={{paddingRight : 20}}>
          <FontAwesome6 name="ellipsis-vertical" size={18} color="black" />
        </View>
    </View>
  )
}

export default Profile

const styles = StyleSheet.create({

  container :{
    flexDirection: 'row',
    // alignSelf: 'center',
    justifyContent : 'space-between',
    marginBottom : 10,
    

  },
  img : {
    width: 50,
    height : 50,
    borderWidth : StyleSheet.hairlineWidth,
    borderColor : colors.ORANGE_600,
    borderRadius: 50
  },
  ProfileContainer :{
    flexDirection: 'row',
    alignItems : 'center',
    gap : 8

  },
  writer: {
    fontSize : 14,
    fontWeight : 'bold',
    fontSize : 13,
    color : colors.GRAY_500


  },
  createDate :{


  },


})