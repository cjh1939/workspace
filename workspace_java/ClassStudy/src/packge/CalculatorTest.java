package packge;

import java.util.Scanner;

public class CalculatorTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("첫번째 수 :");
    int num1 =sc.nextInt();
    System.out.println("두번째 수 :");
    int num2 = sc.nextInt();
    System.out.println("연산자 :");
    String oper = sc.next();

    //계산기 객체 생성
    //Calculator cal = new Calculator();
   //첫번째 방식 cal.setA(num1);
    //cal.setB(num2);

  //두번째 방식
    Calculator cal = new Calculator(num1,num2);


    switch (oper ){
      case "+":// 10 + 20 =30
        System.out.println(num1 + oper + num2+ " = "+ cal.getSum());
        break;
      case "-":
        System.out.println(num1 + oper + num2+ " = "+ cal.getSub());
        break;
      case "*":
        System.out.println(num1 + oper + num2+ " = "+ cal.getMutlti());
        break;
      case "/":
        System.out.println(num1 + oper + num2+ " = "+ cal.getDiv());
        break;
      default:
        System.out.println("연산자를 잘못 입력햇습니다.");
    }



  }
}
