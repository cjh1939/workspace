package test;

public class Test2 {
  public static void main(String[] args) {
    int[] a = new int[6];
    int max = 0;

    for (int i = 0; i < a.length; i++){
      a[i] = (int) (Math.random()* 46+1);
      if(a[i] > max){
        max = a[i];
      }
    }
    System.out.println(max);
  }
}
