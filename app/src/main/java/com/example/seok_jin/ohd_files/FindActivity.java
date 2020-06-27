package com.example.seok_jin.ohd_files;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


// ID/Password 찾기 위한 액티비티

public class FindActivity extends AppCompatActivity {
    private EditText et_name, et_email, et_id, et_name2;
    private Button btn_findid, btn_findpass;
    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        // 뷰 객체를 찾는 메서드, xml과 합치는 과정
        et_name = findViewById(R.id.et_name);
        et_email = findViewById(R.id.et_email);
        et_id = findViewById(R.id.et_id);
        et_name2 = findViewById(R.id.et_name2);
        btn_findid = findViewById(R.id.btn_findid);
        btn_findpass = findViewById(R.id.btn_findpass);

        // 아이디 찾기 버튼 클릭시 수행
        btn_findid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = et_name.getText().toString();
                String userEmail = et_email.getText().toString();
            }
        });

        // 비밀번호 찾기 버튼 클릭시 수행
        btn_findpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = et_name2.getText().toString();
                String userID = et_id.getText().toString();
            }
        });

        }
}