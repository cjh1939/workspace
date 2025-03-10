package practice;

public class 문제2_9 {
  public static void main(String[] args) {
    int c = aaa(10);
    System.out.println(c);
  }
  public static int aaa(int a){
    int reuslt = 0;
    for (int i =1; i < a + 1; i++){
      if (i % 3 == 0){
        reuslt =reuslt +i;
      }
    }
    return reuslt;
  }
}
