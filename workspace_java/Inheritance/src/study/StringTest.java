package study;

public class StringTest {
  public static void main(String[] args) {
    String s1 = "Simple";
    String s2 = "java";

    //concat() : 두 문자열을 나열한 결과를 리턴
   String s3  = s1.concat(s2);
    System.out.println(s3);

    //length() : 문자열의 길이를 정수로 리턴
    int s4 = s3.length();

    //String.valueOf() : 매개변수로 전달된 데이터를 문자열로 바꿔서리턴
   String result  = String.valueOf(10.5);
    System.out.println(result);

    String data = "hi java";

    //substring() : 일부 문자열을 추출할때 사용
   String r1 = data.substring(3);
    System.out.println(r1);

    String r2 = data.substring(1,5);
    System.out.println(r2);

    String data2 = "a,b,c";
    //split() : 매개변수로 전달된 문자열을 기준으로 문자열을 조각냄
    //조각낸 데이터를 리턴
   String[] r3 = data2.split(",");
    System.out.println(r3[1]);

 String r4 = data2.replace(",", "-");
    System.out.println(r4);
  }
}
