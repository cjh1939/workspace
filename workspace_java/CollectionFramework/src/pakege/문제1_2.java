package pakege;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class 문제1_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Integer> list = new ArrayList<>(5);

    //키보드로 값 입력 받기
//    int a = sc.nextInt();
        list.add(sc.nextInt());



    for(int i = 0 ; i < 5 ; i++){
      System.out.println(i + 1 +"번째 정수 입력 : ");
      int a = sc.nextInt();
      list.add(a);
    }
    //리스트에 저장된 합 출력
    int sum =0;
    for (int i =0; i <list.size(); i++){
      sum = sum +list.get(i);

  }
    System.out.println(sum);
  }
}
