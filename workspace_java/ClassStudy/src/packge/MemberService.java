package packge;

import Study.Member;

public class MemberService {
  public boolean login(String id, String pw){
    if (id.equals("hong") && pw.equals("12345")){
      return true;
    }
    else {

      return false;
    }
   // return id.equals("hong") && pw.equals("12345");
  }

  public void logout(String id){
    System.out.println("로그아웃 되었습니다.");

  }













}
