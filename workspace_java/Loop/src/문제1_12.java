public class 문제1_12 {
  public static void main(String[] args) {

    int num = 0;
    int x = 1;

    for ( x = 1; x < 100; x++  ){
      num = num + x;
      if (num > 300){
        break;
      }
    }
    System.out.println("합 :"+ num);
    System.out.println("마지막에 더해진 값 : "+ x);

    //변수는 이름 중복 불가
    //변수는 해당 변수가 선언된 중괄호 안에서만 사용 가능


  }
}
