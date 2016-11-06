package com.wnagzihxain.teacherdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

/**
 * Created by wangz on 2016/11/6 0006.
 */

public class ManageStuInfoDetail extends AppCompatActivity implements Serializable{

    private TextView tv_manage_StuName, tv_manage_StuID, tv_manage_PhoneNumber, tv_manage_Sex, tv_manage_Age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_stuinfo_detail);

        ClassmanageStuInfo manageStuInfo = (ClassmanageStuInfo)getIntent().getSerializableExtra(ManageStuInfoActivity.KEY);

        tv_manage_StuName = (TextView)findViewById(R.id.tv_manage_StuName);
        tv_manage_StuID = (TextView)findViewById(R.id.tv_manage_StuID);
        tv_manage_PhoneNumber = (TextView)findViewById(R.id.tv_manage_PhoneNumber);
        tv_manage_Sex = (TextView)findViewById(R.id.tv_manage_Sex);
        tv_manage_Age = (TextView)findViewById(R.id.tv_manage_Age);

        //Toast.makeText(ManageStuInfoDetail.this, manageStuInfo.getStuName().toString(), Toast.LENGTH_SHORT).show();
        try{
            tv_manage_StuName.setText(manageStuInfo.getStuName().toString());
            tv_manage_StuID.setText(manageStuInfo.getStuID().toString());
            tv_manage_PhoneNumber.setText(manageStuInfo.getPhoneNumber().toString());
            tv_manage_Sex.setText(manageStuInfo.getSex().toString());
            tv_manage_Age.setText(manageStuInfo.getAge() + "");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
