public class For문제1_7 {
  public static void main(String[] args) {

    int l = 0;
    for (int i =1; i < 101; i++){
      if (i % 5 == 0){
        l++;
        System.out.println("5의배수"+ i);
      }
    }
    System.out.println("5의배수의 개수 :"+ l);
  }
}
