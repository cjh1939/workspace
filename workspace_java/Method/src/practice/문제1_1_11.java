package practice;

import java.util.Scanner;

public class 문제1_1_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("정수 입력 :");
    int num1 = sc.nextInt();
    System.out.println("정수 입력 :");
    int num2 = sc.nextInt();

    printNum(num1, num2);
  }
  public static void printNum(int num1, int num2){
   if(num1 % 2 == 0 && num2 % 2 == 0){
     System.out.println("두수는 짝수입니다.");
   }else if (num1 % 2 != 0 && num2 % 2 == 0  ) {
     System.out.println("한 수 만 짝수입니다.");
   }else if(num1 % 3 == 0 && num2 % 3 == 0){
     System.out.println("두 수는 홀수입니다");
   }
  }
}
