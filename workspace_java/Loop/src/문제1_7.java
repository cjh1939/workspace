public class 문제1_7 {
  public static void main(String[] args) {
    int num = 1;
    int sum = 0;

    while (num < 101){
      if (num % 5 == 0){
        sum++;
        System.out.println(" "+ num);
      }
      num++;
    }
      System.out.println("5의 배수의 개수 :"+sum);

  }
}
