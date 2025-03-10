package Study;
//멤버 변수의 모든 값을 초기화 할수있는 메소드
//setter 만드세요 ---
//setter : 멤버변수 하나의 값을 변경시키는 메서드
// setter 메서드는 이름이 정해져 있음(set멤버변수명)
// name 값을 변경하는 setter 메서드정의
// public void setName(){

//}
//age 값을 변경하는 setter정의
//   public void setAge(){

//  }

public class Man_1 {

  String name;
  int age;
  String ad;



  public void name1(String name, int age, String ad){
    this.name = name;
    this.age = age;
    this.ad = ad;
  }


  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAd(String ad) {
    this.ad = ad;
  }






  public String getAd() {
    return ad;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }


  public void print(){
    System.out.println("이름 : " + getName());
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + getAge());
    System.out.println("주소 : " + getAd());
  }




  /*//getter -> 멤버변수 하나의 값을 리턴하는 메서드
  public void name(String name){
    this.name = name;
  }

  //이름값을 리턴하는 메서드
  public String getName(){
    return name;
  }
  public int setAge(){
    return age;
  }
  // age 리턴메서드
  public void age(int age){
    this.age = age;
  }

  public void ad(String ad){
    this.ad = ad;
  }
  //주소 리턴 메서드
  public String setAd(){
    return ad;
  }*/











}
