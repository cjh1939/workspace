import java.util.Scanner;

public class 문제2_2 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("점 x y 좌표를 입력하세요 :");
    int x ;
    x = sc.nextInt();
    int y ;
    y = sc.nextInt();


    if (100 >= x && x >=50 && y <= 100 && y >= 50){
      System.out.println("참");
    }else{
      System.out.println("거짓");
    }


  }
}
