package practice;

public class 문제1_17 {
  public static void main(String[] args) {
    int[] a =new int[6];

  // 배열의 모든 요소에 1~45까지의 랜덤한 정수 저장
    for (int e = 0; e < a.length; e++){
      a[e] = (int) (Math.random() * 46);
      System.out.print(a[e] + " ");
    }


  }
}
