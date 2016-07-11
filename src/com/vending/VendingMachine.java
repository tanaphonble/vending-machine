package com.vending;

import java.util.Date;

/**
 * Created by Tanaphon on 7/11/2016.
 */
public class VendingMachine {

    private String machineCode;
    private Date date;
    private int money;

    protected void createTransactionLog(String machineCode, Date date, int money){
        //เก็บ log ของ transaction
    }

    protected void insertCoin(int money){
        //นับเงินที่ใส่เข้ามาในเครื่อง เก็บใน money
    }

    protected void calculate(String itemName, int price, int money){
        //หลังจาก user กด button จะคำนวณ โดยเอา money - price จะได้ money ที่เป็นเงินทอน
        //returnItem ตามชื่อ Item
        //returnChange if money > 0;
    }

    protected void returnItem(String itemName){
        //จ่ายสินค้า
    }
}
