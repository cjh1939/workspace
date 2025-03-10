package Study;

public class Song1_2 {
  public static void main(String[] args) {
   /* Song_1 set1 =new Song_1();
    set1.title = "ddd";
    set1.artist = "sss";
    set1.album = "g1";
    set1.year = 2024;
    set1.composer = 3;*/

    Song_1 set2 = new Song_1();
    String[] composer = {"김자바","김자바","김자바"};
    set2.set1("ddd","sss","1집",2025,composer);


    set2.print();

  }
}
