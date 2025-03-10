package practice;

import java.util.Scanner;

public class 문제1_1_8 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("정수 입력 :");
    System.out.println("정수 입력 :");

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    printNum(num1, num2);

  }
  public static void printNum(int num1, int num2){
    System.out.println(num1 + num2 );
  }
}
