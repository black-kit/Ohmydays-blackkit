package com.example.seok_jin.ohd_files;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// 회원가입을 위한 엑티비티

public class RegisterActivity extends AppCompatActivity { // 액티비티 시작시 처음 실행

    private EditText et_id, et_password, et_name, et_email;
    private Button btn_register, btn_idcheck;
    private AlertDialog dialog;

    private boolean validate = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // 뷰 객체를 찾는 메서드, xml과 합치는 과정
        et_id = findViewById(R.id.et_id);
        et_password = findViewById(R.id.et_password);
        et_name = findViewById(R.id.et_name);
        et_email = findViewById(R.id.et_email);


        //id 체크 버튼 클릭시 수행
        btn_idcheck = findViewById(R.id.btn_idcheck);
        btn_idcheck.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String userID = et_id.getText().toString();
                if (validate) {
                    return;
                }

                if (userID.equals("")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                    dialog = builder.setMessage("ID is empty").setPositiveButton("OK", null).create();
                    dialog.show();
                    return;
                }
            }
        });

        // 회원가입 버튼 클릭시 수행
        btn_register = findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userID = et_id.getText().toString();
                String userPassword = et_password.getText().toString();
                String userName = et_name.getText().toString();
                String userEmail = et_email.getText().toString();
                if(!validate){
                    AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                    dialog = builder.setMessage("아이디를 체크해주세요!").setNegativeButton("OK", null).create();
                    dialog.show();
                    return;
                }

                if(userID.equals("") || userPassword.equals("") || userName.equals("") || userEmail.equals("")){
                    AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                    dialog=builder.setMessage("입력되지 않은 사항이 있습니다.").setNegativeButton("OK", null).create();
                    dialog.show();
                    return;
                }

            }
        });
    }
}
