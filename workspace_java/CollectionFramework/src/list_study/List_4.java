package list_study;

import java.util.ArrayList;
import java.util.List;

/* System.out.println(p1.toString());
   //출력문에 객체명만 작성하면. toString() 메서드를 호출
   System.out.println(p2);*/
public class List_4 {
  public static void main(String[] args) {
    //Person 클래스의 객체를 다수 저장할수있는 list 객체 생성
    List<Person> list = new ArrayList<>();

    //list 객체에 저장시킬 person 클래스의 객체생성
    Person p1 = new Person("kim",20,"울산");
    Person p2 = new Person("hong",30,"부산");
    Person p3 = new Person("lee",40,"대구");

    //위에서만든 person 객체를 list에 저장
    list.add(p1);
    list.add(p2);
    list.add(p3);

  //list에 저장된 모든 Person 객체에 정보를 출력(to String)

    for (int i =0; i <list.size(); i++){
      System.out.println(list.get(i).toString());
    }
    System.out.println();
    /// //////////////////////////////////////////////////////////////////


    //울산시에 거주하는 회원의 모든 정보 출력
    for (int i = 0; i < list.size(); i++){
      if (list.get(i).getAdd().equals("울산") ){
        System.out.println(list.get(i).toString());
      }
    }

    for (Person e :list){
      if (p1.getAdd().equals("울산")){
        System.out.println(e);
      }
    }





















  }
}
