package practice;

public class 문제3_2 {
  public static void main(String[] args) {
    aaa(5);
  }
  public static void aaa(int a){
    for(int i = 1; i < 101; i++ ){
      if (i % a ==0){
        System.out.println(i);
      }
    }
  }
}
