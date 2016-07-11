package com.vending;

/**
 * Created by Noppharat on 7/11/2016.
 */
public class BTSVender extends VendingMachine{
    protected void btsCardCheck(){
        //เช็คว่ามีบัตร bts เหลืออยู่ในตู้หรือไม่
    }

    protected void showError(){
        //กรณีเครื่องขัดข้อง จะแสดง Error
    }

    private void changeCheck(){
        //ตรวจสอบเงินทอนว่ามีเหลือพอจะทอนไหม
    }
}
