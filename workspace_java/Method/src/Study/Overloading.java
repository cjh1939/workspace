package Study;


//메서드 오버로딩
//메서드 명은 중복불가하다.
// 하지만 메서드의 매개변수 정보(매개변수의 갯수, 매개변수의 자료형)가 다르면
//중복된 이름으로 메서드명 작성을 허용
//
//
public class Overloading {
  public static void main(String[] args) {
    System.out.println(true);

    //println(5);
  }
  public static void println(String str){
    System.out.println(str);
  }
  // 정수를 출력하는 메서드
  public static void println(int num, int num2){
    System.out.println(num);
  }

}
