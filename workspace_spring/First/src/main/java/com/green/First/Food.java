package com.green.First;

public class Food {
  private String food;
  private int cnt;
  private String option;
  private String text;
  private String orderDate;

  public Food(String food, int cnt, String option, String text, String orderDate) {
    this.food = food;
    this.cnt = cnt;
    this.option = option;
    this.text = text;
    this.orderDate = orderDate;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public int getCnt() {
    return cnt;
  }

  public void setCnt(int cnt) {
    this.cnt = cnt;
  }

  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }

  @Override
  public String toString() {
    return "Food{" +
            "food='" + food + '\'' +
            ", cnt=" + cnt +
            ", option='" + option + '\'' +
            ", text='" + text + '\'' +
            ", orderDate='" + orderDate + '\'' +
            '}';
  }
}
