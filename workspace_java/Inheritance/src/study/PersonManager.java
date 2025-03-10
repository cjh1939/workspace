package study;

import com.sun.source.tree.NewArrayTree;

public class PersonManager {
  public static void main(String[] args) {

    //대학동창을 5명 저장할수있는 배열 생성
    UnivFriend[] ufs = new UnivFriend[5];
    //대학동창이 저장된 배열의 index 정보
    int ucnt = 0;
    int ccnt = 0;
    //직장동료 를 5명 저장할수있는 배열 생성
    CompFriend[] cfs = new CompFriend[5];


    //대학 동창 생성 + 생성한 대학 동창 객체를 ufs 에저장
    ufs[ucnt++] = new UnivFriend("김자바","010-4154","생물학과");
    ufs[ucnt++] = new UnivFriend("이자바","010-2154","방송학과");

    //직장 동료 생성 + 생성한 직정 동료 객체를 cfs 에저장
    cfs[ccnt++] = new CompFriend("감사원","1111-111","영업부");
    cfs[ccnt++] = new CompFriend("박대리님","2222-111","인사부");


    //저장된 직장동료 정보 출력
    //저장된 대학 동창 정보를 출력
    for (int i= 0; i < ucnt; i++){
//      ufs[i].showUnivInfo();
    }

    for (int i= 0; i < ccnt; i++){
//      cfs[i].showCompInfo();
    }


  }
}
