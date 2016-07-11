package com.vending;

/**
 * Created by Noppharat on 7/11/2016.
 */
public class MRTVender extends VendingMachine {

    protected void mrtCoinCheck(){
        //เช็คว่ามีเหรียญ mrt เหลืออยู่ในตู้หรือไม่
    }
    protected void showError(){
        //กรณีเครื่องขัดข้อง จะแสดง Error
    }

    private void changeCheck(){
        //ตรวจสอบเงินทอนว่ามีเหลือพอจะทอนไหม
    }
}
