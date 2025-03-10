package practice;

import java.util.Scanner;

public class 문제1_12 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    System.out.println("생성할 배열의 길이 입력 :");
    int arrlength = sc.nextInt();
    int[] arr =new int[arrlength];

    //배열에 값 저장
    for (int i =0; i < arr.length; i++){
      arr[i] = i+1;

    }

    //배열의 평균계산
    int sum =0;
    for (int i =0; i < arrlength; i++){
      sum = sum +arr[i];
    }

    for (int i : arr ){
      sum = sum + i;
      System.out.println(i);


    }



    double avg = (double) sum / arrlength;
    System.out.println("배열요소의 평균 :"+ avg);
  }
}
