package com.green.First;

public class Lotto {
  private  int num;
  private  int setNum;

  public Lotto(int setNum) {
    this.setNum = setNum;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public int getSetNum() {
    return setNum;
  }

  public void setSetNum(int setNum) {
    this.setNum = setNum;
  }

  @Override
  public String toString() {
    return "Lotto{" +
            "num=" + num +
            ", setNum=" + setNum +
            '}';
  }
}
