package com.green.First;

public class Order {
  private int number;
  private String name;
  private int price;
  private int data;
  private String ID;


  public Order(int number, String name, int price, int data, String ID) {
    this.number = number;
    this.name = name;
    this.price = price;
    this.data = data;
    this.ID = ID;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }
}
