package com.vending;

/**
 * Created by Tanaphon on 7/11/2016.
 */
public class BoontermVender extends VendingMachine {
    private boolean serverStatus;

    private void displayError(){
        //กรณีเครื่องขัดข้อง จะแสดง Error
    }

    private boolean getServerStatus(){
        //เช็ค status ของ server
        return serverStatus;
    }

    @Override
    protected void calculate(String mobileNumber, int price, int money) {
        super.calculate(mobileNumber, price, money);
        //หลังจาก user กด button จะคำนวณ โดยเอา money - price แล้ว money ที่เหลือจะถูกเก็บไว้ใช้ในรอบถัดไป
    }

    private void collectMoney(String mobileNumber, int amount){
        //นำเงินที่เหลือเก็บไว้สำหรับใช้ครั้งต่อไป
    }

}