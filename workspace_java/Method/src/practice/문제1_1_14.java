package practice;

public class 문제1_1_14 {
  public static void main(String[] args) {
    printNum(17,2);
  }
  public static void printNum(int num1, int num2 ){
   int max = num1 > num2 ? num1 : num2;
   int min = num1 < num2 ? num1 : num2;
   int sum =0;

   for (int i = min+1 ;i < max; i++){
     if (i % 5 == 0){
       sum ++;
     }
   }
    System.out.println(sum);
  }
}
