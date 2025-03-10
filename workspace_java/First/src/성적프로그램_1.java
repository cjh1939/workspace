
/*
* 키보드로 국어, 영어, 수학 점수를 입력받은후
* 입력받은 국어, 영어, 수학, 및 총점, 평균을 출력
* 단, 국어 영어 수학 점수는 정수만 저장 된다고 가정,
*
* */


import java.util.Scanner;

public class 성적프로그램_1 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("국어 점수 :");
    int a = sc.nextInt();

    System.out.print("영어 점수 :");
    int b = sc.nextInt();

    System.out.print("수학 점수 :");
    int c = sc.nextInt();

    System.out.println("총점 :"+ (a + b + c));
    System.out.println("평균 :"+ (a + b + c)/3);

  }
}
