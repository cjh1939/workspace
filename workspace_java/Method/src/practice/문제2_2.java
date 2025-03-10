package practice;

public class 문제2_2 {
  public static void main(String[] args) {
    int c = aaa(6, 8);
    System.out.println(c);
  }
  public static int aaa(int a, int b){
    //return a > b? a: b ;
    if (a > b){
      return a;
    }
    else {
      return b;
    }
  }
}
