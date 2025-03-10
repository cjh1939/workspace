import java.util.Scanner;

public class 문제1_9 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("숫자 입력 : ");
    //int max; num1과 num2 중 작은 수를 저장할 변수.
   // int min; num1과 num2 중 큰 수를 저장할 변수.
    //if(num1 > num2){
    //min = num2;
    //max = num1;
    //}
    //System.out.println(max +" > " + min);
    int num1 ;
    num1 = sc.nextInt();
    int num2 ;
    num2 = sc.nextInt();

    if(num1 > num2){
      System.out.println(num1 + ">" + num2);
    }
    else if (num1 == num2) {
      System.out.println(num2 + ">" + num1);
    }
  }
}
