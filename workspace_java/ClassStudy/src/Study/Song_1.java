package Study;

import java.util.Arrays;

public class Song_1 {
  String title;
  String artist;
  String album;
  int year;
  String[] composer;


  public void title(String T){
    title = T;
  }
  public void artist(String A){
  artist = A;
  }
  public void album(String L){
    album = L;
  }
  public void year(int Y){
    year = Y;
  }
  public void composer(String[] C ){
    composer = C;
  }

public void set1 (String T1, String A1, String L1, int Y1, String[] C){
 title = T1;
 artist = A1;
 album = L1;
 year = Y1;
 composer = C;



}


  public void print(){
    System.out.println("제목 :" + title + " - " + "가수 :" + artist);
    System.out.println("앨범 :" + album + " - " + "연도 :" + year);
    System.out.println("작곡가 :"+ Arrays.toString(composer));

  }



}
