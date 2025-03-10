package Study;

public class Member {
  String name;
  String id;
  String pw;
  int age;

  public void setAllInfo (String name ,String id , String pw, int age){
    // this = 클래스 안에서 정의된 name
    this.name = name;
    this.id = id;
    this.pw = pw;
    this.age = age;
  }
  public void printAll(){
    System.out.println("이름 =" + this.name);
    System.out.println("아이디 =" + id);
    System.out.println("PW =" + pw);
    System.out.println("나이 =" + age);
  }







}
