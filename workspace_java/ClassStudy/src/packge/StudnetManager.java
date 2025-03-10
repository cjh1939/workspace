package packge;

import java.util.Scanner;

public class StudnetManager {
  //학생등록 기능
  //학생 정보 변경기능(연락처)
  //학생 정보출력 기능(개별)
  //학생 모든 학생정보출력
 private Scanner sc ;
private Studnet[] studnets;
private int index;// students 배열의 요소를 지정



  public  StudnetManager(){
    sc = new Scanner(System.in);
     studnets = new Studnet[3];
     index = 0;
  }

  public void reg(){
    System.out.println("학생등록을 시작합니다 학생정보를 입력하세요");

    System.out.println("이름 :");
    String name =sc.next();

    System.out.println("나이 :");
    int age = sc.nextInt();

    System.out.println("연락처 :");
    String tel =sc.next();

    System.out.println("학점 :");
    String grade =sc.next();

    //입력받은 정보로 학생을 생성한다
    Studnet stu = new Studnet(name, age, grade,tel);
    //생성한 학생을 students 배열에 저장한다
    studnets[index++] = stu; // index++;
  }

  public void telInfo(){
    System.out.println("학생정보변경(연락처)");
    System.out.println("이름 :");
    String name = sc.next();
    System.out.println("연락처 :");
    String tel = sc.next();



  }
  public void printStuInfo(){
    System.out.println("정보를 열람할 학생 :");

    System.out.println();

  }
  public void printstuInfoAll(){
    System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 "+index+"명입니다.");
    for (int i =0; i < index; i++){
      studnets[i].printStudnet();
      System.out.println();
    }


  }











}
