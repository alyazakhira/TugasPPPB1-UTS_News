package com.example.projectnewsutsrev10;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    EditText mUnameEdit;
    EditText mPassEdit;
    Button mLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        assign layout variable
        mUnameEdit = findViewById(R.id.main_uname_edit);
        mPassEdit = findViewById(R.id.main_pass_edit);
        mLoginBtn = findViewById(R.id.m_login_btn);

//        set listener on button
        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get string from EditText
                String uname = mUnameEdit.getText().toString();
                String pass = mPassEdit.getText().toString();
                login(uname,pass);
            }
        });
    }


    public void login(String username, String password){
        if (Objects.equals(username, "pakjoko") && Objects.equals(password, "yangpentingcuan")){
            Intent inputDataIntent = new Intent(this, InputDataActivity.class);
            startActivity(inputDataIntent);
        } else {
            showAlert();
        }
    }

    public void showAlert(){
        AlertDialog.Builder alertLogin = new AlertDialog.Builder(MainActivity.this);
        alertLogin.setTitle("Peringatan");
        alertLogin.setMessage("Username atau Password yang Anda masukkan salah!");
        alertLogin.setPositiveButton("OK", (dialogInterface, i) -> {
        });
        alertLogin.show();
    }
}