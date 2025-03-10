import java.util.Scanner;

public class IF_3 {
  public static void main(String[] args) {
    // 키보드로 정수 두개를 받아,
    //입력받은 두 수의 합이 10이상이면서
    //짝수는 아닐 경우에만 "참" 이라는 문자열을 출력
    Scanner sc =new Scanner(System.in);

    int num;
    int num1;
    //값 입력받기
    System.out.print("정수 입력 :");
    num = sc.nextInt();
    System.out.print("정수 입력 :");
    num1 = sc.nextInt();

    //결과 출력
    if (num + num1 >= 10 && (num + num1 % 2 != 0 ) ){
      System.out.println("참");
    }

  }
}
