package study;

// 다형성 : 부모클래스로 자식 클래스 객체 생성 가능

//클래스가 명시적으로 상속을 받고 있지 않으면
// 자동으로 object 클래스를 상속 받습니다.
// 모든 클래스는 object 클래스를 상속 받고 있음 !
// 모든클래스의 객체는  object 로 다 받을수있다.

public class Tv {
  int a;
  String b;

  public void turnOn (){
    System.out.println("Tv 전원을 컴");

  }

  //object 클래스의 toString() 메서드 오버라이딩

  //override : 메서드가 오버라이딩 문법에 맞는지 확인


  @Override
  public String toString() {
    return "Tv{" +
            "a=" + a +
            ", b='" + b + '\'' +
            '}';
  }
}
