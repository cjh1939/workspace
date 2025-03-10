package Study;

public class StudentTest2 {
  public static void main(String[] args) {

    //student 클래스의 객체 stu1 생성
    Student stu1 = new Student();
    stu1.printInfo();

    //학생 stu1개체의 데이터 변경
    stu1.name= "lee";
    stu1.age= 30;
    stu1.score= 90;
    stu1.printInfo();

    System.out.println();

    //student 객체 stu2 생성
    Student stu2 = new Student();
    // stu2 객체의 데이터 변경
    stu2.setName("hong");
    stu2.setAge(20);
    stu2.setScore(90);
    stu2.printInfo();

    System.out.println();

    //student 클래스의 객체 stu3생성

    Student stu3 = new Student();
    stu3.set1("홍",20,90);
    stu3.printInfo();


  }
}
