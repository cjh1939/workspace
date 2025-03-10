import java.util.Scanner;

public class 문제1_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
    System.out.print("첫번째수 :");
    a = sc.nextInt();

    int b;
    System.out.print("두번째수 :");
    b = sc.nextInt();

    //두 수 중 큰 수와 작은 수를 구분
    int min = a > b ? b : a;
    int max = a > b ? a : b;

    int c = 0;
    int i = min + 1 ;

    while (i < max){
      c = c + i;
      i++;
    }
    System.out.println(c);
  }
}
