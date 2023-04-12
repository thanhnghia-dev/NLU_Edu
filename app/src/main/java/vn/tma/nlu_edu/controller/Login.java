package vn.tma.nlu_edu.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import vn.tma.nlu_edu.view.DialogForgotPass;
import vn.tma.nlu_edu.R;

public class Login extends AppCompatActivity {
    EditText etID, etPass;
    TextView forgotPass;
    Button btnLogin;
    ImageView btnBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etID = findViewById(R.id.etID);
        etPass = findViewById(R.id.etPass);
        forgotPass = findViewById(R.id.forgotPass);
        btnBack = findViewById(R.id.back);
        btnLogin = findViewById(R.id.btnLogin);

        // Button Login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Login.this, Main.class);
                startActivity(intent);
            }
        });

        // Button Forgot Password
        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

        // Button Back
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void openDialog() {
        DialogForgotPass dfp = new DialogForgotPass();
        dfp.show(getSupportFragmentManager(), "quên mật khẩu");
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}