package Study;

import java.util.Scanner;

public class Score_1 {
  Scanner sc = new Scanner(System.in);
int a ;
int b ;
String c;

public void score1(){
  System.out.println("첫번째 수 :");
  a = sc.nextInt();
  this.b = b;
  System.out.println("두번째 수 : ");
  b = sc.nextInt();
  this.c = c;
  System.out.println("연산자");
  c = sc.next();
}


public void print(){
  System.out.println(a + c + b + " = " );
  if (c.equals("+")){
    System.out.println(a + b);
  }
  else if (c.equals("-")){
    System.out.println(a - b);
  }
  else if (c.equals("*")){
    System.out.println(a * b);
  }
  else if (c.equals("/")){
    System.out.print(a / b);
  }
}




}
