
//배열의 데이터를 다른 변수에 저장하는 일반적 방법
const arr1 = [1,2,3];

let a = arr1[0];
let b = arr1[1];
let c = arr1[2];

//구조분해할당
let [aa,bb,cc] =arr1;
console.log(aa, bb, cc);

let [aaa,bbb] =arr1;
console.log(aaa, bbb);


/////////////////////////////////////////////////////////////////////////////////////////////

const person ={
  name : "kim",
  age : 20,
  hobby : "공부"
};
// 객체는 순번이 없음 
//const {name, age , hobby} = person;
const {age, name , hobby} = person;
console.log(age , name , hobby);

const {name :name1, age :age1 , hobby:hobby1} = person;
console.log(name1, age1,hobby1);

const student ={
  name : "kim",
  age : 30,
  engScore :80,
  korScore :70
}
//매개변수도 student 객체가 전달되면 해당 학생의 총점을 리턴하는 함수 
function getSum(s){
let korScore = s.korScore;
let engScore = s.engScore;
return korScore + engScore;
}

function getSum1 ({korScore, engScore}){
  return korScore + engScore;
}
getSum1(student)



const phone ={
  modelName :"s5",
  price : 10000
}
//매개변수로 폰을 전달하면 폰 객체의 모델명과 가격을 출력하는 함수 
function a1(p){
  console.log(p.modelName, p.price);
}
a1(phone);

function a2({modelName,price}){
  console.log(modelName,price);
}
a2(phone);

























































