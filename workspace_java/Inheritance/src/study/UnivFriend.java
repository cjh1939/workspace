package study;

//대학 동창정보
public class UnivFriend extends Friend{


  private String major;


  public UnivFriend (String name, String tel, String major) {
    super("name","1111");
    this.major = major;
  }
public void showInfo(){
  super.showInfo();
  System.out.println("전공 : "+  major);
}









}
