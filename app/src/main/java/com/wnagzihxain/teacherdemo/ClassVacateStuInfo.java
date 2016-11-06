package com.wnagzihxain.teacherdemo;

import java.io.Serializable;

/**
 * Created by wangz on 2016/11/6 0006.
 */

public class ClassVacateStuInfo implements Serializable{
    private String StuName;
    private String vacateReason;

    public ClassVacateStuInfo(String StuName, String vacateReason){
        this.StuName = StuName;
        this.vacateReason = vacateReason;
    }

    public String getStuName(){
        return this.StuName;
    }

    public String getVacateReason(){
        return this.vacateReason;
    }
}
