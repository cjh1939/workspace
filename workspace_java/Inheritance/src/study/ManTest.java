package study;

public class ManTest {
  public static void main(String[] args) {

    //BusinessMan
    BuisinessMan man = new BuisinessMan("삼성");
    man.company = "삼성";
    man.name = "삼성";
    System.out.println(man.company);
    man.tellCompany();

    man.tellName();


  }
}
