package test;

public class Test4 {
  private String id;
  private String pw;
  private String name;
  private int age;






  public Test4(String id, String pw, String name, int age) {
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.age = age;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setInfo( ){
    System.out.println("id = " + id);
    System.out.println("pw = " + pw);
    System.out.println("name = " + name);
    System.out.println("age = " + age);

  }

  public boolean islogin(String id, String pw){
    if (id.equals("java") && pw.equals("1234")){
      System.out.println("로그인 가능");
      return true;
    }
    else {
      System.out.println("로그인 불가능");
      return false;
    }

  }
}
