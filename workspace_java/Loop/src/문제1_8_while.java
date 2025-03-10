import java.util.Scanner;

public class 문제1_8_while {
  public static void main(String[] args) {
    //키보드로 정수를 입력받아
    //1부터 입력받은 수까지 중 짝수의 개수를 구하세요
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("정수입력 :");
    num = sc.nextInt();

    //반복 시작 숫자
    int i = 1;

    //짝수의개수를 저장할변수
    int cnt = 0;

    //1부터 num까지 반복
    while (i < num + 1){
      //숫자가 짝수라면 ..
      if (i % 2 == 0){
        cnt++;
      }
      i++; // 반복을 한번 할때마다 i를 1증가 시킨다.
    }
    System.out.println(cnt);


  }
}
