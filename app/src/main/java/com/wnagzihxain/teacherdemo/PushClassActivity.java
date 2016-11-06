package com.wnagzihxain.teacherdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by wangz on 2016/11/6 0006.
 */

public class PushClassActivity extends AppCompatActivity {

    private Button bt_pushclass_push;
    private Spinner spinner, spinner2, spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushclass);

        bt_pushclass_push = (Button)findViewById(R.id.bt_pushclass_push);
        spinner = (Spinner)findViewById(R.id.spinner);
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        spinner3 = (Spinner)findViewById(R.id.spinner3);

        bt_pushclass_push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PushClassActivity.this, "课表发布成功", Toast.LENGTH_SHORT).show();
                PushClassActivity.this.finish();
            }
        });

    }
}
