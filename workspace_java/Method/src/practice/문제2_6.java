package practice;

public class 문제2_6 {
  public static void main(String[] args) {
   String c = aaa(5);
    System.out.println(c);
  }
  public static String aaa(int a){
    // 숫자 -> 문자열
    String b = String.valueOf(10);

    // 문자열 -> 정수
    int c = Integer.parseInt("10");

    return String.valueOf(a);
  //  return a +"";
  }
}
