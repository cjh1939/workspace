package Study;

public class BankTest {
  public static void main(String[] args) {
    //Bank 클래스에 대한 객체를 5개 저장할수있는 배열 bankArr 생성
    //bank 클래스에대한 객체5 개 저장할수있는 공간 5개생성

    Bank[] bankArr = new Bank[5];

    //bank 클래스에 대한 객체 5개 생성 . 초기값 마음대로 .
    //그 다음 bankArr에 객체를 저장
    bankArr[0]  = new Bank("사바",10000,"111-111");

    bankArr[1] = new Bank("최자바",20000,"111-211");

    bankArr[2] = new Bank("김자바",30000,"111-311");

    bankArr[3] = new Bank("박자바",40000,"111-411");

    bankArr[4]= new Bank("정자바",50000,"111-511");

    //bankArr 배열에 저장된 모든계좌의 예금액 합을 출력
    int sum = 0;
    for (int i =0; i < bankArr.length; i++){
      sum = sum + bankArr[i].getBalance();
      System.out.println( "예금액 합 :"+ sum);
    }

    int sum1 = 0;
   for (Bank bank : bankArr){
     sum1 = sum1 + bank.getBalance();
   }
    System.out.println(sum1);
    /// //////////////////////////////////////


    //2. bankArr에 저장된 모든게좌정보 중에서
    //계좌주가 "최자바"인 계좌정보를 찿고, 그 정보 중
    //예금액을 20% 인상 시키는 코드 를 작성!

    for (int i = 0; i < bankArr.length; i++){
      if (bankArr[i].getOwner().equals("최자바")){
        int result = (int)(bankArr[i].getBalance() * 1.2);
        bankArr[i].setBalance(result);
      }
    }

    for (Bank e : bankArr){
      if (e.getOwner().equals("최자바")){
        int result= (int)(e.getBalance() * 1.2);
        e.setBalance(result);
      }
    }











  }
}
