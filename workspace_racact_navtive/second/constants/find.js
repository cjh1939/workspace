


const cartList = [
  {
    id: 1,
    item: '달걀 한 판'
  },
  {
    id: 2,
    item: '라면 한 묶음'
  },
  {
    id: 3,
    item: '주방 세제'
  },
];

//cartList 에서 id가 2인 데이터 찿기
//find : return 에 작성한 조건문과 일치하는 데이터만 리턴해준다
const a = cartList.find((e)=>{return e.id === 2});  // 기본문법(수정) e: 배열에 있는데이터 하나하나를 e 라고부름
const a1 = cartList.find(e =>  e.id === 2); //동일한 코드 


//filter : return 에 작성한 조건과 일치하는 데이터는 걸러낸다
const b = cartList.filter((e)=>{return e.id === 2}); //(삭제) b = id 2번은 걸러낸다 = id 1,3 번  
const b1 = cartList.filter(e => e.id === 2); //동일한 코드 




const c = cartList.map((e,i)=>{cartList.map((e,i)=>{return e.id })}); 


for(const e of cartList){
  if(e.id == 2){
    //찿음 
  }
}
