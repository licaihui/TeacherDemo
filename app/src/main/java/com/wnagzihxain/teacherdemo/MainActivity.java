package com.wnagzihxain.teacherdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ed_username, ed_password;
    private Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        ed_username = (EditText)findViewById(R.id.ed_username);
        ed_password = (EditText)findViewById(R.id.ed_username);
        bt_login = (Button)findViewById(R.id.bt_login);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**Socket Connect to Server**/
                if(ed_username.getText().toString().trim().equals("") || ed_password.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this, "用户名或密码不能为空！", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, ControlActivity.class);
                    startActivity(intent);
                    MainActivity.this.finish();
                }
            }
        });
    }
}
