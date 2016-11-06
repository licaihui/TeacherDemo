package com.wnagzihxain.teacherdemo;

import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by wangz on 2016/11/6 0006.
 */

public class ClassmanageStuInfo implements Serializable{
    private String StuID;
    private String StuName;
    private String PhoneNumber;
    private String Sex;
    private int Age;

    public ClassmanageStuInfo(String StuID, String StuName, String PhoneNumber, String Sex, int Age){
        this.StuID = StuID;
        this.StuName = StuName;
        this.PhoneNumber = PhoneNumber;
        this.Sex = Sex;
        this.Age = Age;
    }

    public String getStuID(){
        return this.StuID;
    }

    public String getStuName(){
        return this.StuName;
    }

    public String getPhoneNumber(){
        return this.PhoneNumber;
    }

    public String getSex(){
        return this.Sex;
    }

    public int getAge(){
        return this.Age;
    }
}
