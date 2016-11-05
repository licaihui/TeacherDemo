package com.wnagzihxain.teacherdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangz on 2016/11/5 0005.
 */

public class SignActivity extends AppCompatActivity {

    private ListView lv_sign;
    private Button bt_sign_update;
    private List<ClasssignstuInfo> StuList = new ArrayList<ClasssignstuInfo>();
    private String[] StuID = {"20130610110101", "20130610110102", "20130610110103", "20130610110104", "20130610110105",
                            "20130610110106", "20130610110107", "20130610110108", "20130610110109", "20130610110110"};
    private String[] StuName = {"测试1", "测试2", "测试3", "测试4", "测试5", "测试6", "测试7", "测试8", "测试9", "测试10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        lv_sign = (ListView)findViewById(R.id.lv_sign);
        initStuInfo();
        ClasssignstuInfoAdapter adapter = new ClasssignstuInfoAdapter(SignActivity.this, R.layout.sign_stuinfo_item, StuList);
        lv_sign.setAdapter(adapter);

        bt_sign_update = (Button)findViewById(R.id.bt_sign_update);
        bt_sign_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**Socket connect to Server**/
                Toast.makeText(SignActivity.this, "成功提交签到记录", Toast.LENGTH_LONG).show();
                SignActivity.this.finish();
            }
        });
    }

    private void initStuInfo(){

        for (int i = 0; i < StuID.length; i++){
            ClasssignstuInfo signstuInfo = new ClasssignstuInfo(StuID[i], StuName[i]);
            StuList.add(signstuInfo);
        }
    }
}
