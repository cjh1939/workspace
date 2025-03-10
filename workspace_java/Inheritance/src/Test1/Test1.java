package Test1;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    int a ;
    System.out.println("첫번째 수 :");
    a = sc.nextInt();
    int b ;
    System.out.println("두번째 수 :");
    b =sc.nextInt();
    int c;
    System.out.println("세번째 수 :");
    c = sc.nextInt();

    int max = 0;
    int mid = 0;
    int min = 0;





    if(a > b && a > c ){
      max = a;

    } else if (b > c) {
      mid = b;
      min = c;
    }else if(a> b) {
      mid = c;
      min = b;

    }else if(b > a && b > c){
      max = b;

    }
    if(a > c){
      mid =a;
      min =c;
    }else {
      mid= c;
      min =a;
    }
//    else {
//      max = c;
//    }
    if(a > b ){
      min = b;
      mid =a;
    }
    else {
      min =a;
      mid=b;
    }

    System.out.println(max +'>'+ mid + '>'+ min);
  }
}
