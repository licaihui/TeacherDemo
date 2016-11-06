package com.wnagzihxain.teacherdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by wangz on 2016/11/5 0005.
 */

public class ControlActivity extends AppCompatActivity{

    private Button bt_sign, bt_stuInfo, bt_vacate, bt_pushClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        bt_sign = (Button)findViewById(R.id.bt_sign);
        bt_stuInfo = (Button)findViewById(R.id.bt_stuInfo);
        bt_vacate = (Button)findViewById(R.id.bt_vacate);
        bt_pushClass = (Button)findViewById(R.id.bt_pushClass);

        //学生签到登记
        bt_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ControlActivity.this, SignActivity.class);
                startActivity(intent);
            }
        });

        //学生信息获取
        bt_stuInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ControlActivity.this, ManageStuInfoActivity.class);
                startActivity(intent);
            }
        });

        //学生请假管理
        bt_vacate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ControlActivity.this, VacateActivity.class);
                startActivity(intent);
            }
        });

        //发布课程安排
        bt_pushClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(ControlActivity.this, );
                //startActivity(intent);
            }
        });

    }
}
