import java.util.Scanner;

public class 문제_1_1 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int num1 =25;
    num1 = sc.nextInt();
    int num2 = 26;
    num2 = sc.nextInt();

    System.out.println("정수 입력 :");

    if (num1 + num2 > 50){
      System.out.println("두수의 합이 50보다 큽니다.");
    }else if (num1 + num2 < 50){
      System.out.println("두수의 합이 50이하 입니다.");
    }


  }
}
