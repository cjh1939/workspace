import java.util.Scanner;

public class 문제3_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a;
    System.out.print("첫번째 수 :");
    a = sc.nextInt();
    int b;
    System.out.print("두번째 수 :");
    b = sc.nextInt();
    String c ;
    System.out.print("연산자 :");
    c = sc.next();

    switch (c){
      case "+":
        System.out.println(a + " " + c + " " + b + " = "+(a + b));
        break;
      case "-":
        System.out.println(a +" "+ c + " " + b + " = "+(a - b));
        break;
      case "*":
        System.out.println(a +" "+ c + " " + b + " = "+(a * b));
        break;
      case "/":
        System.out.println(a +" "+ c + " " + b + " = "+(a / b));
        break;
      default:
        System.out.println("연산자를 잘 못 입력하였습니다.");
    }




  }
}
