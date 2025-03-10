package practice;

public class 문제1_10 {
  public static void main(String[] args) {
    int[] a ={1,2,3,4,5,6,7,8};
    int sum = 0;

    //for-each문 사용
    for( int e : a){
      if (e % 2 ==0){
        sum++;
      }
      System.out.println(sum);
    }




    System.out.println();
    //기본for문 사용
    for (int b = 0; b <a.length; b++){

      if (a[b] % 2 == 0){
        sum++;


      }
    }
    System.out.println(sum);
  }
}
