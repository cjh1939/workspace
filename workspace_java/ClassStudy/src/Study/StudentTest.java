package Study;

import javax.naming.Name;

public class StudentTest {
  public static void main(String[] args) {
    //Student 클래스 객체 stu1 생성
    Student stu1 = new Student();

    //Student 클래스 객체 stu1 생성
    Student stu2 = new Student();

    //stu1객체의 이름을 "홍길동",나이 20살로 변경

    stu1.name ="홍길동";
    stu1.age =20;
    stu1.score =80;
    stu1.setName("순신");
    stu1.setAge(50);
    stu1.setScore(100);
    stu1.set1("동", 52 , 80);


    //stu1 객체의 모든정보 출력
    System.out.println(stu1.name);
    System.out.println(stu1.age);
    System.out.println(stu1.score);
  stu1.printInfo();

  stu2.printInfo();
  }
}
