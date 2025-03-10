import java.util.Scanner;

public class 정수입력받기_4 {
  public static void main(String[] args) {
    Scanner sr = new Scanner(System.in);



    System.out.print("이름 :");
    String name = sr.next();

    System.out.print("나이 :");
    int a = sr.nextInt();

    System.out.print("몸무게 :");
    int b = sr.nextInt();

    double age = (a+b)/3;
    int total = a+b;


    System.out.println("나이 + 몸무게 ="+ total);
    System.out.println("평균 :"+ age);

  }
}
