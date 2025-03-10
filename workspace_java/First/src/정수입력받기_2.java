import java.util.Scanner;
//두 정수를 키보드로 입력받아
// 입력받은 두 수의 합을 출력
public class 정수입력받기_2 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.print("a 변수 값 :");
    int a = sc.nextInt();

    System.out.print("b 변수 값 :");
    int b = sc.nextInt();

    System.out.println("두 변수의 합 ="+(a+b));

  }
}
