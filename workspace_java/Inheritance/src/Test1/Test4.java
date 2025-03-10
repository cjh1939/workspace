package Test1;

import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
int a;
int cnt =0;
    System.out.println("1 ~999 까지 정수 입력 :");
a= sc.nextInt();
    int num = a%100;

    int one = a % 10;
    int ten = num / 10;
    int hu =  a / 100;

    if(one == 3 || one == 6 || one == 9){
      ++cnt;
    }

    if(ten == 3 || ten == 6 || ten == 9){
      ++cnt;
    }

    if(hu == 3 || hu == 6 || hu == 9){
      ++cnt;
    }

    switch (cnt){
      case 0 :
        System.out.println("박수 0번");
        break;
      case 1 :
        System.out.println("박수 한번");
        break;
      case 2 :
        System.out.println("박수 두번");
        break;
      case 3:
        System.out.println("박수 세번 ");
    }
  }
}
