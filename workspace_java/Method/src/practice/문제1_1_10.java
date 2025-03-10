package practice;

import java.util.Scanner;

public class 문제1_1_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    printNum(num1);
    System.out.println("짝수 입니다");
    printNum1(num2);
    System.out.println("홀수 입니다");


  }
  public static  void printNum(int num1){
    System.out.println(num1 % 2 == 0);
  }
  public static  void printNum1(int num2){
    System.out.println(num2 % 3 == 0);
  }
}

//test10() 메서드의 인자로 5가 전달 되었다.

/* //조건? 참일때 실행 내용 : 거짓일때 실행 내용
 static  void test10(int a){
  System.out.println(num1 % 2 == 0 ? "짝수입니다 " : "홀수입니다");
}*/
