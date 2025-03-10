package practice;

public class 문제_1_1to3 {
  public static void main(String[] args) {
    printHello();
    printNum(10);
    printNum1("문자열");
    printNum1(10, 20);
    printNum2(3,5,6);
    printNum3(10, 2);
    printName("안녕","하세요");//문제7번
  }
  public static void printHello(){
    System.out.println("안녕하세요");
  }
  public static void printNum(int num){
    System.out.println(num);
  }
  public static void printNum1(String name){
    System.out.println(name);
  }
  public static void printNum1(int num1, int num2){
    System.out.println(num1 + num2);
  }
  public static void printNum2(int num3, int num4, int num5){
    System.out.println(num3 * num4 * num5);
  }
  public static void printNum3(int num6 , int num7){
    System.out.println(num6 / num7 );
  }
  public static void printName(String name1, String name2){
    System.out.println(name1+name2);
  }
}
