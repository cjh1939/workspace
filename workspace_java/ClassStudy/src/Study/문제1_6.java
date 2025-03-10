package Study;

public class 문제1_6 {

    String name;
    String name1;
    String name2;
    int cash;
    String num;



    public void set6(String J1,String B1,String C1,int D1,String E1){
      name = J1;
      name1 = B1;
      name2 = C1;
      cash = D1;
      num = E1;
    }

    public void print() {
      System.out.println("제조사 :" + name);
      System.out.println("모델명 :" + name1);
      System.out.println("색상 :" + name2);
      System.out.println("가격  :" + cash);
      System.out.println("휴대폰 번호 :" + num);


    }
  }


