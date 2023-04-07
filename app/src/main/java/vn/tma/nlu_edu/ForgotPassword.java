package vn.tma.nlu_edu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForgotPassword extends AppCompatActivity {
    EditText edId;
    TextView backToLogin;
    Button require;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        edId = findViewById(R.id.edID);
        backToLogin = findViewById(R.id.backToLogin);
        require = findViewById(R.id.btnRequire);

        backToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(ForgotPassword.this, Login.class);
                startActivity(intent);
                finish();
            }
        });

        require.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
//                intent.setClass(ForgotPassword.this, ForgotPassword.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}