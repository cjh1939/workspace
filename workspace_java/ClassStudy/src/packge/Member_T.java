package packge;

public class Member_T {
  private String name;
  private String name1;
  private String id;
  private String pw;
  private int age;

  public void set12(String name, String id, String pw, int age) {
    this.name = name;
    this.id = id;
    this.pw = pw;
    this.age = age;
  }

  public void setName(String name, String id) {
    this.name = name;
    this.id = id;
  }

  public void setlogout(String id){
    this.id = id;
  }



  public void setId(String id) {
    this.id = id;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }
}