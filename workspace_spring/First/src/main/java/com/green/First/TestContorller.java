package com.green.First;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

// @ :어노테이션
@RestController
public class TestContorller {


  @GetMapping("/t1")
  public String test1(){
    return "java";
  }
//http://localhost:8080/t2
  @GetMapping("/t2")
  public int test2(){
    return 10;
  }

  @GetMapping("/t4")
  public Person  test3(){
    //person 클래스에 대한 객체를 하나생성
    Person aa = new Person("홍길동",20,"울산시");
    return aa;
  }

  @GetMapping("/t5")
  public List<Person> test4(){
    //Person 클래스에 대한 객체를 다수저장할수있는 리스트 생성
    //자료형 변수명 ;
    List<Person> list = new ArrayList<>();
    Person p1 = new Person("kim",20,"울산시");
    Person p2 = new Person("pack",20,"부산시");
    Person p3 = new Person("choi",20,"서울시");

    list.add(p1);
    list.add(p2);
    list.add(p3);
    return list ;

  }
@GetMapping("/t6")
public List<Student> test5(){
    List<Student> studentsList = new ArrayList<>();

    studentsList.add(new Student("kim",80,70,75));
    studentsList.add(new Student("nim",60,50,95));
    studentsList.add(new Student("mim",90,20,45));
    studentsList.add(new Student("lim",60,40,70));
    studentsList.add(new Student("fim",55,35,85));

      return studentsList;
}

//react 에서 전달한느 데이터는 자바에서 받는 문법은 2가지 존재
  //1. 클래스를 활용하는 방법
    //react 에서 전달하는 객체의 key와
    //자바에서 데이터를 받기위해 매개변수에 선언한 클래스의 변수명이
    //동일하면 데이터를 자동으로 받아옴
  //2. collection Framework의 Map을 활용 하는방법
@PostMapping("/t7")
public int test6(@RequestBody Student student){

  System.out.println(student.toString());
  int sum = student.getEngScore() +student.getKorScore()+ student.getMatScore();
  return sum;
}

@PostMapping("/t8")
public void test8(@RequestBody Food food){
  System.out.println(food.toString());
}
@GetMapping ("/t9")
public int test9(){
  int num = (int)(Math.random() * 45 +1);
  return num;
}
@GetMapping ("/t10")
public List<Board> test10(){
    List<Board> l1 =new ArrayList<>();

    l1.add(new Board(5,"제목입니다1","김자바",0,"안녕하세요"));
    l1.add(new Board(4,"제목입니다2","박자바",5,"내용입니다"));
    l1.add(new Board(3,"제목입니다3","이자바",1,"내용입니다"));
    l1.add(new Board(2,"제목입니다4","김자바",3,"내용입니다"));
    l1.add(new Board(1,"제목입니다5","이자바",2,"내용입니다"));
    return l1;
}

@GetMapping("/t11")
public List<Order> Order1(){
    List<Order> l1 =new ArrayList<>();
    l1.add(new Order(101,"데님",15000,2,"abc"));
    l1.add(new Order(102,"데님1",25000,2,"abc1"));
    l1.add(new Order(103,"데님2",35000,2,"abc2"));
    l1.add(new Order(104,"데님3",45000,2,"abc3"));
    l1.add(new Order(105,"데님4",55000,2,"abc4"));
    return l1;
}













}




