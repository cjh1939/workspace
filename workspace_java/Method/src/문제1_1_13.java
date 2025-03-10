public class 문제1_1_13 {
  public static void main(String[] args) {
    int a = 5;
    int b = 15;
    printNum(a,b);
  }
  public static void printNum(int num1 , int num2){
    //두 수중 큰수, 작은수 구분
    int max = num1 > num2 ? num1 : num2;
    int min = num1 < num2 ? num1 : num2;

    for (int i = min +1; i < max; i++){
      System.out.println(i+ " ");
    }
  }
}
