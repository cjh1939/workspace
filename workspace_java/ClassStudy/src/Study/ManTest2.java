package Study;

public class ManTest2 {
  public static void main(String[] args) {
    Man_1 m1 = new Man_1();
    m1.name1("홍길동", 30, "울산시");

    Man_1 m2 =new Man_1();

    m2.name1("유관순",20,"서울시");
    //setter -> 데이터 변경시 사용
    //getter -> 각각의 데이어틀 읽어올떄 사용
    //m1과 m2중 나이가 많은 사람의 이름을 출력해보세요
    if (m1.getAge() < m2.getAge()){
      System.out.println(m1);
    }else {
      System.out.println();
    }
    //m1객체의 나이가 30이면
    //m1객체의 이름을 "이순신"으로 변경하세요.
    if (m1.getAge() == 30){
      m1.setName("이순신");
    }




  }
}
