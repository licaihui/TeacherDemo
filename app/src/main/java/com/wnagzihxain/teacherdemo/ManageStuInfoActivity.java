package com.wnagzihxain.teacherdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangz on 2016/11/6 0006.
 */

public class ManageStuInfoActivity extends AppCompatActivity {

    List<ClassmanageStuInfo> StuList = new ArrayList<ClassmanageStuInfo>();
    ListView lv_managestuinfo;
    public final static String KEY = "ManageStuInfoKEY";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managestuinfo);

        lv_managestuinfo = (ListView)findViewById(R.id.lv_managestuinfo);
        initStuInfo();
        final ClassmanageStuInfoAdapter adapter = new ClassmanageStuInfoAdapter(ManageStuInfoActivity.this, R.layout.manage_stuinfo_item, StuList);
        lv_managestuinfo.setAdapter(adapter);

        lv_managestuinfo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClassmanageStuInfo manageStuInfo = (ClassmanageStuInfo)adapter.getItem(position);
                Toast.makeText(ManageStuInfoActivity.this, manageStuInfo.getStuName().toString(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ManageStuInfoActivity.this, ManageStuInfoDetail.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable(KEY, manageStuInfo);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void initStuInfo(){
        ClassmanageStuInfo manageStuInfo;
        for (int i = 1; i <= 30; i++){
            if (i < 10){
                manageStuInfo = new ClassmanageStuInfo("2013061011010" + String.valueOf(i),
                        "姓名测试" + String.valueOf(i),
                        "手机号测试" + String.valueOf(i),
                        "性别测试" + String.valueOf(i),
                        20);
            }
            else {
                manageStuInfo = new ClassmanageStuInfo("201306101101" + String.valueOf(i),
                        "姓名测试" + String.valueOf(i),
                        "手机号测试" + String.valueOf(i),
                        "性别测试" + String.valueOf(i),
                        20);
            }
            StuList.add(manageStuInfo);
        }
    }
}
