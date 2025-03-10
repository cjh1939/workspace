package Static_study;

//static 이 붙은 멤버변수는
//객체에 종속적이지 않고 모든 객체가 공유하는 데이터
//static 변수는 생성자에서 초기화 하지 않는다
//static 변수는 초기화 구문이 따로 존재
//생성자 보다 static 초기화가 먼저 진행된다*****
//static 변수는 객체명.멤버변수; 의 문법으로 호출 권장 x
//static 변수는 클래스명.변수명;
//static 은 변수 및 메서드에 적용할수있다.

public class Count_Test {
  public static void main(String[] args) {

    Count count1 = new Count();
    Count count2 = new Count();
    Count count3 = new Count();

    System.out.println(count1.cnt);

    //static 변수는 클래스명.변수명;
    System.out.println(Count.cnt);

    System.out.println(Math.PI);
    System.out.println(Math.max(10,20));

  }



}
