package Study;

//학생을 표현할 설계도
public class Student {
  String name;//학생이름 데이터
  int age ; //학생의 나이
  int score ; //점수

  //이름을 변경하는 메서드**
  public void setName( String name1  ){
    name = name1;
  }
  //나이 변경하는 메서드
  public void setAge(int age1){
    age =age1;
  }
  //점수 변경하는 메서드
  public void setScore(int score1){
    score =score1;
  }
  //이름 나이 점수 를 모두 변경하는 메서드
  public void set1(String name1 ,int age1 ,int score1){
    name = name1;
    age = age1;
    score =score1 ;
  }

  //학생의 정보를 출력하는 기능
  public void printInfo(){
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("점수 : " + score);
  }

}
