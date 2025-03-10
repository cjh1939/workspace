package practice;

import java.util.Scanner;

public class 문제1_9 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    int[] a =new int[5];
    System.out.println("요소 입력 : ");
    a[0]=sc.nextInt();

    for (int b= 0; b < a.length; b++){
        a[b]= b+1;
      System.out.print(a[b]);

    }



  }
}
