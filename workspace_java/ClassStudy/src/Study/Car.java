package Study;
/*
* 자동차를 객체로 만들기 위해 자동차 설계도를 작성!!
* 클래스의 구성 요소: 데이터(변수) , 기능(메서드의 정의) , 생성자
* 클래스 안에서 선언한 변수를 : 멤버 변수, 필드
* 메서드 안에서 선언한 변수 : 지역 변수 (local variable)
* 멤버변수 vs 지역변수
*  -지역변수 는 반드시 초기화 필요 !
* - 멤버변수는 초기화 하지않으면 기본값으로 초기화가 자동 진행
*
* */

public class Car {
  //데이터(자동차가 가져야 하는 정보)
  String carName; //자동차명

  int Price; // 자동차 가격
  //시동거는 기능
  public void powerOn(){
    System.out.println("시동을 겁니다 ");
  }
  // 브레이크를 밟습니다
public void takeBreak(){
  System.out.println("브레이크를 밟습니다");
  }

}
