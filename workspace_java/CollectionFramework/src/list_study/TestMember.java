package list_study;

import java.util.ArrayList;
import java.util.List;

public class TestMember {
  public static void main(String[] args) {
    List<Member> list = new ArrayList<>();

    Member a = new Member("kbs","1111","java",20);
    Member b = new Member("mbc","2222","장길동",30);
    Member c = new Member("sbs","3333","김길동",40);
    list.add(a);
    list.add(b);
    list.add(c);

    for (int i = 0; i <list.size(); i++){
      System.out.println(list.get(i));
    }


    int sum = 0;
    for (int i = 0; i <list.size(); i++){
      sum = sum + list.get(i).getAge();
    }
    System.out.println(sum);

    for (int i = 0; i < list.size(); i++){
      if (list.get(i).getId().equals("java")){
        list.remove(i);
      }
    }





  }
}
