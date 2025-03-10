package packge;

import javax.naming.Name;
import java.util.Scanner;

public class StudentManagerTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //while 문 실행여부 값을 갖고있는 변수
    boolean isRunning = true;
    //학생관리 가능이 있는 클레스에 대한 객체생성
    StudnetManager ff = new StudnetManager();

    System.out.println("학생관리 프로그램을 실행합니다.");
    while (isRunning){
      System.out.println(" 1)학생등록  2)학생정보변경(연락처) 3)학생정보출력 4)모든학생정보출력  5)프로그램 종료 :");
      int option = sc.nextInt();
      switch (option){
        case 1:
          System.out.print("학생등록을 시작합니다 학생정보를 입력하세요");
          ff.reg();
          break;
        case 2:
          System.out.print("학생의 연락처를 변경합니다");
          ff.telInfo();//
          System.out.print("연락처를 변경하엿습니다");
          break;
        case 3:
          System.out.print("정보를 열람한 학생 :" + ff);
          ff.printStuInfo();
          System.out.println("요청하신 학생의 정보입니다.");
          System.out.println();
          break;
        case 4:
          ff.printstuInfoAll();
          break;
        case 5:
          System.out.print("프로그램을 종료합니다");
          isRunning =false;
          break;
        default:
          System.out.print("1~5번 중 하나의 정수를 입력해주세요");
      }
    }
    //break
    //1. swich case break;
    //2. 가장 가까운 반복문 벗어남










  }
}
