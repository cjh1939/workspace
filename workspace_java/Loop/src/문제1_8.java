import java.util.Scanner;

public class 문제1_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num ;
    System.out.println("정수 입력 :");
    num = sc.nextInt();

    int sum = 0;
    sum = sc.nextInt();

    while (num < num + 1){
      if (num % 2 == 0){
      sum++;
      }
      num++;
    }
    System.out.println("짝수 개수 :"+ sum);
  }
}
