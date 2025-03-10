import java.util.Scanner;

public class 문제2_1 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int a ;
    System.out.println("정수 1 :");
    a = sc.nextInt();

    int b;
    System.out.println("정수 2 :");
    b = sc.nextInt();

    int c;
    System.out.println("정수 3 :");
    c = sc.nextInt();

    if (( a + b )> c && (a + c) > b && (b + c) > a){
      System.out.println("참");
    }else {
      System.out.println("거짓");
    }




  }
}
