package practice;

public class 문제3_6 {
  public static void main(String[] args) {
   int[] b ={1,156,3334,22,34};
    int data = aaa(b);
    System.out.println(data);

  }

  // 5 7 1 3     max= 5;
  public static int aaa(int[] a){
    int max = a[0];

    for(int i = 0 ; i < a.length ; i++){
      if(max  < a[i]){
        max = a[i];
      }
    }
    return max;
  }
}
