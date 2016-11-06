package com.wnagzihxain.teacherdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangz on 2016/11/6 0006.
 */

public class VacateActivity extends AppCompatActivity {

    public final static String KEY = "VacateStuInfoKEY";
    private ListView lv_vacate;
    private List<ClassVacateStuInfo> vacateStuList = new ArrayList<ClassVacateStuInfo>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacate);

        initvacateStuInfo();
        lv_vacate = (ListView)findViewById(R.id.lv_vacate);
        final ClassVacateStuInfoAdapter adapter = new ClassVacateStuInfoAdapter(VacateActivity.this, R.layout.vacate_stuinfo_item, vacateStuList);
        lv_vacate.setAdapter(adapter);

        lv_vacate.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClassVacateStuInfo vacateStuInfo = (ClassVacateStuInfo) adapter.getItem(position);
                Intent intent = new Intent(VacateActivity.this, VacateDetail.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable(KEY, vacateStuInfo);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void initvacateStuInfo() {
        for (int i = 1; i <= 5; i++){
            vacateStuList.add(new ClassVacateStuInfo("姓名测试" + i, "请假详细信息测试" + i));
        }
    }
}
