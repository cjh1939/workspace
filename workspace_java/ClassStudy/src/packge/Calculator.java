package packge;

public class Calculator {
  private int a;
  private int b;

  //생성자
public Calculator(int a, int b){
  this.a = a;
  this.b = b;
}

  public void setA(int a) {
    this.a = a;
  }

  public void setB(int b) {
    this.b = b;
  }

  //계산기 기능 = + - * /
  //더하기기능
  //더하기 결과를 출력
  // 더한결과를 리턴하는 기능
  public int getSum(){
    return a+b;
  }
  public int getSub(){
    return a-b;
  }
  public int getMutlti(){
    return a * b;
  }
  public double getDiv(){
    return a / (double)b;
  }



}
