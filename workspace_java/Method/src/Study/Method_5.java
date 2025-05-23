package Study;

import java.nio.channels.Pipe;

/*
* 메서드의 리턴타입
*  - 메서드의 실행결과 리턴되는 데이터의 자료형
* - 리턴 : 메서드를 호출하는 곳에 결과값을 되돌려준다.
*   리턴되는 데이터의 자료형과 메서드의 리턴타입은 일치!
*   - return 명령어는 실제 데이터를 리턴하는 역할을 하며
*   - return 명령어 뒤에는 어떠한 코드도 올 수 없다!
*   -메서드에서 return 명령어는 한번만 실행할 수 있다.
* */
public class Method_5 {
  public static void main(String[] args) {
   // int a = aaa();
   // System.out.println(a);
   int sum = bbb(10,10);
    System.out.println(sum);

  }

  //return 명령어를 한번만 실행 할수 있다의 의미.
  public static int ccc(){
    // 두 수중 큰수를 리턴
    int a = 5;
    int b = 10;
    if (a > b ){
      return a;
    }
    else {
      return b;
    }
  }

  //매개변수로 전달된 두 수의 합을 리턴하는 메서드
  public static int bbb(int a , int b){
    return a + b;
   // System.out.println(222); 리턴뒤에는 다른 코드 못옴 !
  }



  public static int aaa(){
    System.out.println(5);
    // 메서드 실행후 3을 리턴하겟습니다.
    return 3;
    // return 5; retuen은 한번만 실행 가능


  }
}
