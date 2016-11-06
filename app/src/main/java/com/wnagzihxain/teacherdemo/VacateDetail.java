package com.wnagzihxain.teacherdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.Serializable;

/**
 * Created by wangz on 2016/11/6 0006.
 */

public class VacateDetail extends AppCompatActivity implements Serializable{

    private TextView tv_vacatedetail_StuName, tv_vacatedetail_reason;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacate_detail);

        ClassVacateStuInfo vacateStuInfo = (ClassVacateStuInfo)getIntent().getSerializableExtra(VacateActivity.KEY);

        tv_vacatedetail_StuName = (TextView)findViewById(R.id.tv_vacatedetail_StuName);
        tv_vacatedetail_reason = (TextView)findViewById(R.id.tv_vacatedetail_reason);

        tv_vacatedetail_StuName.setText(vacateStuInfo.getStuName().toString());
        tv_vacatedetail_reason.setText(vacateStuInfo.getVacateReason().toString());

    }
}
