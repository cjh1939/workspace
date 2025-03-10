package practice;

public class 문제1_18 {
  public static void main(String[] args) {
    //0번째 요소를 가장 큰값이라 가정하고 시작 !
    //max라는 변수를 만들고 거기에 0번째 요소를 저장
    //배열의 크기만큼 반복한다.
    //반복을 하며 배열 요소의 값과 max 변수의 값을 비교
    //만약 max값보다 배열 요소의 값이 크다면
    // 배열 요소의 값을 max변수에 저장한다.
    int[] a = {11,532312,333,8442,21122222};
    int max = a[0];

    for (int i = 0;  i < a.length; i++){
      if(a[i] > max){
        max = a[i];

      }
    }
    System.out.println(max);


  }
}
