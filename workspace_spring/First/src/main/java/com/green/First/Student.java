package com.green.First;

public class Student {

  private String name;
  private int korScore;
  private int engScore;
  private int matScore;


  public Student(String name, int korScore, int engScore, int matScore) {
    this.name = name;
    this.korScore = korScore;
    this.engScore = engScore;
    this.matScore = matScore;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKorScore() {
    return korScore;
  }

  public void setKorScore(int korScore) {
    this.korScore = korScore;
  }

  public int getEngScore() {
    return engScore;
  }

  public void setEngScore(int engScore) {
    this.engScore = engScore;
  }

  public int getMatScore() {
    return matScore;
  }

  public void setMatScore(int matScore) {
    this.matScore = matScore;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", korScore=" + korScore +
            ", engScore=" + engScore +
            ", matScore=" + matScore +
            '}';
  }

}
