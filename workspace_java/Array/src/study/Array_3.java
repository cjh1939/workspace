package study;

//배열의 값 저장및 읽기
public class Array_3 {
  public static void main(String[] args) {
    // 정수를 3개 저장할수있는 배열 arr1을 생성
    int[] arr1 =new int[3];// 0 0 0

    //배열 출력은 변수명으로 할 수 없음
    System.out.println(arr1);
    //arr1의 0번째 요소를 출력
    System.out.println(arr1[0]);
    //System.out.println(arr1[3]); 주의 !!

    //배열에 각 요소에 값 저장
    //arr1의 0번째 요소에 3을 저장
    arr1[1] = 3;
    System.out.println(arr1[1]);

    //배열의 모든요소의 값을 출력
    System.out.println(arr1[0]);
    System.out.println(arr1[1]);
    System.out.println(arr1[2]);

    for (int i =0; i < 3; i++){
      System.out.println(arr1[i]);
    }
    /// /////////////////////////////////////////////

    System.out.println();

    //배열의 모든요소를 출력할때 사용할수 있는 좋은 명령어
    int[] arr2 =new int[5];

    //arr2 배열의 모든 요소를 출력하는 코드 작성
    for (int i = 0; i < arr2.length; i++){
      System.out.println(arr2[i]);
    }
    //배열의 길이(크기, 요소의개수)를 알수있는 명령어
    System.out.println("arr2 배열의크기 : "+arr2.length);


  }
}
