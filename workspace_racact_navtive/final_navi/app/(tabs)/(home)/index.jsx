import { FlatList, Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'

import FeedItem from '../../../components/FeedItem';
import { dummyData } from '../../../apis/dummyData';
import { colors } from '../../../constants/colorConstant';
import Octicons from '@expo/vector-icons/Octicons';



const index = () => {
  const data = dummyData;

  return (
    <View style={styles.container}>
      <FlatList 
        data={data}//반복돌릴 데이터
        renderItem={({item}) => { return <FeedItem item={item}/> }} // 아이템마다 진행할 코드  {item}으로 구조분해할당 
        keyExtractor={(item) => item.id}// key
        contentContainerStyle={styles.listContainer} //리스트 디자인
      />
      <Pressable style={styles.wirteBtn}>
        <Octicons name="pencil" size={24} color="white" />
      </Pressable>
      
    </View>
  )
}

export default index

const styles = StyleSheet.create({

  container :{
    flex :1,
    backgroundColor : 'white',

  },
  listContainer :{
    paddingVertical : 14,
    backgroundColor: colors.GRAY_200,
  
  },
  wirteBtn :{
    position: 'absolute',
    width: 50,
    height : 50,
    backgroundColor : colors.ORANGE_600,
    borderRadius: 50,
    justifyContent: "center",
    alignItems: 'center',
    bottom : 40,
    right : 30
    
  },
  

})