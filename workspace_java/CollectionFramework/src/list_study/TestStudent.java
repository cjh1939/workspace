package list_study;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
  public static void main(String[] args) {
    List<Student1>list = new ArrayList();

    Student1 a = new Student1("박자바",60,40,50,150);
    Student1 b = new Student1("이자바",10,20,30,60);
    Student1 c = new Student1("김자바",80,50,60,190);

    list.add(a);
    list.add(b);
    list.add(c);

    for (int i = 0; i < list.size(); i++){
      System.out.println(list.get(i).toString());
    }
    System.out.println();

    for (int i = 0; i < list.size(); i++){
      if (list.get(i).getCj() > 150){
        System.out.println(list.get(i));
      }
    }
    System.out.println();

    int sum = 0;
    for (int i =0; i < list.size(); i++){
     sum += list.get(i).getCj() ;
     //sum += 10; sum = sum + 10;
    }
      double avg = (double) sum / list.size();
    System.out.println("평균 : "+ avg);

    System.out.println();

    int max = 0;
    for (int i =0; i < list.size(); i++){
      if (list.get(i).getCj() > list.get(max).getCj()){
      max = i;
      }
    }
    System.out.println(list.get(max));



  //  System.out.println(list.get(2));





  }
}
