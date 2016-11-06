package com.wnagzihxain.teacherdemo;

/**
 * Created by wangz on 2016/11/6 0006.
 */

public class ClasssignstuInfo {

    private String StuID;
    private String StuName;

    public ClasssignstuInfo(String StuID, String StuName){
        this.StuID = StuID;
        this.StuName = StuName;
    }

    public String getStuID(){
        return this.StuID;
    }

    public String getStuName(){
        return this.StuName;
    }
}
