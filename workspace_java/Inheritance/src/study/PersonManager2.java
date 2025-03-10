package study;

public class PersonManager2 {
  public static void main(String[] args) {

    //친구 객체가 10개 저장될 수있는 배열 생성
    Friend[] fs = new Friend[10];

    int cnt =0;

    fs[cnt++] = new UnivFriend("김자바","010-4154","생물학과");
    fs[cnt++] = new CompFriend("박자바","010-4154","회계학과");

    for(int i =0; i < cnt; i++){
      fs[i].showInfo();
    }


  }
}
