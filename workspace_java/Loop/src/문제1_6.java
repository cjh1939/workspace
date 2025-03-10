public class 문제1_6 {
  public static void main(String[] args) {
    int num = 1;
    int sum = 0; //결과를 저장할 변수

    while (num < 101){
      if (num % 3 == 0 ){
        sum++;
      }
     num++;
    }
    System.out.println("3의 배수의 개수 : "+ sum);
  }
}
