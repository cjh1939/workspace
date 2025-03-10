package study;

//interface 는 class 와 동일하게 첫글자를 대문자 로 작성
//클래스의 구성요소 (작성할수 있는거 ): 멤버변수, 메서드 정의, 생성자
//인터페이스의 구성요소 : 추상메서드.
public interface Print {

  //이 메서드를 호출 하면 커피가 나온다
  //메서드의 정의는 있지만, 내용부가 없는 메서드 를 추상 메서드로 부름

  //흑백 출력기능
  public  void  print();


  //컬러 출력기능
  public  void  colorPrint();
}
