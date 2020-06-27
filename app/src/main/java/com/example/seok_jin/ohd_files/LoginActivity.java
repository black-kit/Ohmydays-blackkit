package com.example.seok_jin.ohd_files;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// 로그인을 위한 엑티비티

public class LoginActivity extends AppCompatActivity { // 액티비티 시작시 생명 부여

    private EditText et_id, et_password;
    private Button btn_login, btn_register;
    private Button btn_find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 뷰 객체를 찾는 메서드, xml과 합치는 과정
        et_id = findViewById(R.id.et_name);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);
        btn_register = findViewById(R.id.btn_register);
        btn_find = findViewById(R.id.btn_find);

        // 회원 가입 버튼
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        // id/password 찾기 버튼
        btn_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, FindActivity.class);
                startActivity(intent);
            }
        });
    }
}
