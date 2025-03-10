import java.util.Scanner;

public class 문제3_3 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);



    int a;
    // 정보입력
    System.out.print("첫번째 수 :");
    a = sc.nextInt();
    int b;
    System.out.print("두번째 수 :");
    b = sc.nextInt();
    String c ;//연산자를 저장할 변수
    System.out.print("연산자 :");
    c = sc.next();


    if (c.equals("*")){
      System.out.println(a +" "+ c + " " + b + " = "+(a * b) );
    }
    else if (c.equals("+")){
      System.out.println(a +" "+ c + " " + b + " = "+(a + b));
    }
    else if (c.equals("-")){
      System.out.println(a +" "+ c + " " + b + " = "+(a - b));
    }
    else if (c.equals("/")){
      System.out.println(a +" "+ c + " " + b + " = "+((double)a / b));
    }else {
      System.out.println("연산자 잘못 입력");
    }


  }
}
