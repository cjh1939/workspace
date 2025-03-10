package practice;

public class 문제2_5 {
  public static void main(String[] args) {
    String c = aaa(60);
    System.out.println(c);
  }

  public static String aaa(int a) {
    String result = "";
    if (a >= 90) {
     return "a";
    } else if (a >= 70) {
      return "b";
    } else {
      return "c";
    }
  }
}
