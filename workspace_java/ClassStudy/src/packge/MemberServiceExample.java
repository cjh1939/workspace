package packge;

public class MemberServiceExample {
  public static void main(String[] args) {

    MemberService m1 = new MemberService();
    boolean result = m1.login("hong","1111");

    if (result){
      System.out.println("로그인되었습니다.");
      m1.logout("hong");
    }else {
      System.out.println("로그아웃 되었습니다");
    }

  }
}
