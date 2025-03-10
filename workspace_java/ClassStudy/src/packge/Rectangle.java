package packge;

import java.util.List;

public class Rectangle {
  private int x1;
  private int y1;
  private int x2;
  private int y2;

  public void set(int x1, int x2, int y1 , int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }
  // defult 생성자
  public Rectangle(){}

  public Rectangle(int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  public int square(){
    return (x2 -x1) * (y2 -y1);
  }
  //좌표의 넓이 등 직사각형 정보의 화면 출력
  // ex> (1,3),(2,5) 넓이 : 2
  public void show(){
    System.out.println("좌표 : (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ") , 넓이 : " + square());
  }
  //인자로 전달된 객체r과 현 객체가 동일한 넓이 면 true 리턴
  public boolean eauals(Rectangle r){
   if (square() == r.square()){
     return true;
   }else {
     return false;
   }


  }









}
