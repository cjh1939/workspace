import java.util.Scanner;

public class 문제1_10 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int num1;
    int num2;
    int num3;


    int max = 0;
    int mid = 0;
    int min = 0;
    // 키보드로 숫자입력
    System.out.println("첫번째 수 :");
    num1 = sc.nextInt();
    System.out.println("두번째 수 :");
    num2 = sc.nextInt();
    System.out.println("세번째 수 :");
    num3 = sc.nextInt();

    // 숫자 크기 비교
    // num1 > num2 > num3 (num1 이 가장 클경우)
    if(num1 > num2 && num1 > num3 ){
      max = num1;
      //num2가 num3보다 클 경우
      // 그렇지 않은 경우 (num3가 num2보다 클경우)
      if(num2 >  num3){
        mid = num2;
        min = num3;
      }
      else {
        mid = num3;
        min = num2;
      }

    }
    // 그렇지 않고 num2 가 가장 클 경우
    else if (num2 > num1 && num2 > num3){
      max = num2;

      if(num1 > num3){
        mid = num1;
        min = num3;
      }
      else {
        mid =num3;
        min =num1;
      }

    }
    //num3가 가장 클 경우
    else {
      max = num3;
      if(num1 > num2){
        mid = num1;
        min = num2;
      }
      else {
        mid = num2;
        min = num3;
      }
    }


    //출력
    System.out.print(max + ">"+ mid+ ">"+ min );
    max = sc.nextInt();

  }
}
