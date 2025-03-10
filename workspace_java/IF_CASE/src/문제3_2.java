import java.util.Scanner;

public class 문제3_2 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("성별 입력 :");
    String a ;
    a = sc.next();

    switch (a){
      case "남":
        System.out.println("남성입니다.");
        break;
      case "여":
        System.out.println("여자입니다.");
        break;
      default:
    }

  }
}
