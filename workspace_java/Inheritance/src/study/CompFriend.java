package study;

//직장 동료 정보
public class CompFriend extends Friend{

  private String dept;

  public CompFriend(String naem, String tel, String dept) {
    super("name","000");
    this.dept = dept;
  }
  public void  showInfo(){
    super.showInfo();
    System.out.println("부서 : " + dept);
  }
}
