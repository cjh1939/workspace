package pakege;

import java.util.ArrayList;
import java.util.List;

public class 문제1_4 {
  public static void main(String[] args) {
    List<Integer>list = new ArrayList<>();



    for (int i = 0; i < 10; i++){
     int a = (int)(Math.random()* 100+1);
      list.add(a);

      //믄제답이 맞는지 확인하기위해 리스트 모든데이터 출력
      for (int e: list){
        System.out.print(e + " ");
      }

      System.out.println();


      int cnt = 0; //짝수의 개수를 저장할 변수
     for (int e = 0; e < list.size(); e++){
      //리스트에 저장된 하나하나의 데이터가 짝수인지 확인
       if (list.get(e) % 2 == 0){
         //짝수의 갯수와 모든 짝수 출력
         System.out.print(list.get(i) + " ");
         //cnt 값을 1 증가시킨다.
         cnt++;
       }
     }
      System.out.println();

      System.out.println("짝수 의 개수 : " + cnt);















    }










  }
}
