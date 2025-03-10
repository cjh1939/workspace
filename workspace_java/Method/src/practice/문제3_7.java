package practice;

public class 문제3_7 {
  public static void main(String[] args) {
   String[] c = {"집에","가고","싶다"};
   String t =  aaa(c);
    System.out.println(t);
  }
  public static String aaa(String[] a){
    String sum = "";
    for (int i =0; i < a.length; i++){
      sum = sum + a[i];
    }
    return sum;
  }
}
