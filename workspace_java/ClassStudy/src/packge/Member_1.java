package packge;

public class Member_1 {
 private String name;
 private String id;
  private int pw;

  public void set1(String name , String id, int pw){
    this.name = name;
    this.id = id;
    this.pw = pw;

  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setPw(int pw) {
    this.pw = pw;
  }


  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public int getPw() {
    return pw;
  }

  public void displayInfo(){
    System.out.println("이름 :" + name);
    System.out.println("아이디 :" + id);
    System.out.println("비밀번호 :" + pw);



  }



}
