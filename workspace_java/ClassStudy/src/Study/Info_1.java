package Study;

public class Info_1 {
  String name ;
  String ID ;
  int password ;
  int age ;

  public void name(String N){
    name = N;
  }
  public void ID(String I){
    ID = I;
  }
  public void password(int P){
    password = P;
  }
  public void age(int A){
    age = A;
  }




  public void print(){
    System.out.println("이름 :"+ name);
    System.out.println("아이디 :" + ID);
    System.out.println("비밀번호 :"+ password);
    System.out.println("나이 :"+ age);



  }





}
