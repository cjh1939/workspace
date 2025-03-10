package practice;

public class 문제2_10 {
  public static void main(String[] args) {
    boolean c = aaa("");
    System.out.println(c);
  }
  public static boolean aaa(String a){
    return a.length() % 2 ==0 ? true:false ;
    /*if (a.length() % 2 == 0){
      return true;
    }else {
      return false;
    }*/

  }
}
