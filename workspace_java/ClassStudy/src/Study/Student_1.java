package Study;

public class Student_1 {
  String name;
  int age;
  String ad;
  String gak;
  String tel;


  public String setName(String name){
    return name;
  }
  public int setAge(int age){
    return age;
  }
  public String setAd(String ad){
    return ad;
  }
  public String setGak(String gak){
    return gak;
  }
  public String setTel(String tel){
    return tel;
  }





public void set1(String name, int age, String ad, String gak, String tel ){
  this.name = name;
  this.age =  age;
  this.ad =  ad;
  this.gak = gak;
  this.tel = tel;

}


public void print(){
  System.out.println("이름 :"+ name);
  System.out.println("나이 :"+ age);
  System.out.println("주소 :"+ ad);
  System.out.println("학번 :"+ gak);
  System.out.println("연락처 :"+ tel);
}











}
