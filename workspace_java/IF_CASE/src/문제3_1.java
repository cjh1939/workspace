import java.util.Scanner;

public class 문제3_1 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("성별 입력 :");
    String a;

    a = sc.next();


    if (a.equals("남")){
      System.out.println("남자입니다");
    }else if (a.equals("여")){
      System.out.println("여자입니다.");
    }else {
      System.out.println("다시 입력하세요");
    }

  }
}
