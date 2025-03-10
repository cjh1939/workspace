import java.util.Scanner;

public class 문제1_5 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int num = 99;
    String grade;

    System.out.println("학점 입력 :");
     num = sc.nextInt();


   if (num > 90 && num <= 100){
     grade = "A";
   }
   else if (num > 80 && num <= 90){
    grade = "B";
   }
   else {
     grade ="C";
   }

    System.out.println("학점은 "+grade+" 입니다");

  }
}
