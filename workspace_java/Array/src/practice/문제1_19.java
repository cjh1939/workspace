package practice;

import java.util.Arrays;

public class 문제1_19 {
  public static void main(String[] args) {
    int[] arr = new int[10];

    for (int i = 0; i < arr.length; i++){
      arr[i] = (int) (Math.random()* 100 + 1);
    }

    int min = arr[0];//0번째 요소를 가장작은 값을 가정
    int max = arr[0];//0번째요소를 가장큰 값으로 가정

    //배열 데이터를 확인을 위한 출력
    System.out.println(Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++){
      if (arr[i] < min){
        min = arr[i];
      }
      if (max < arr[i]){
        max = arr[i];
      }
    }

    System.out.println("최대값 :"+max);
    System.out.println("최소값 :"+min);


  }
}
