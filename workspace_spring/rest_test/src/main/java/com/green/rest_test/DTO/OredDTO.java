package com.green.rest_test.DTO;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class OredDTO {

    private int itemCode;
    private String itemName;
    private  int itemPrice;
    private  int itemCnt;
    private  String id;
    private int itemBuy;


    public OredDTO(int itemCode, String itemName, int itemPrice, int itemCnt, String id, int itemBuy) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCnt = itemCnt;
        this.id = id;
        this.itemBuy = itemBuy;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemCnt() {
        return itemCnt;
    }

    public void setItemCnt(int itemCnt) {
        this.itemCnt = itemCnt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getItemBuy() {
        return itemBuy;
    }

    public void setItemBuy(int itemBuy) {
        this.itemBuy = itemBuy;
    }
}
