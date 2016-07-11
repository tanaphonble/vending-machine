package com.vending;

/**
 * Created by Noppharat on 7/11/2016.
 */
public class BTSVender extends VendingMachine{
    private int totalCard;

    private int getCardLeft(){
        //เช็คว่ามีบัตร bts เหลืออยู่ในตู้หรือไม่
        return totalCard;
    }

    private void displayError(){
        //กรณีเครื่องขัดข้อง จะแสดง Error
    }

    private void changeCheck(){
        //ตรวจสอบเงินทอนว่ามีเหลือพอจะทอนไหม
    }

}
