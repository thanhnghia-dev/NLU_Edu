package vn.tma.nlu_edu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChangePassword extends AppCompatActivity {
    EditText etOldPass, etNewPass, etConfPass;
    Button btnSave, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        etOldPass = findViewById(R.id.etOldPass);
        etNewPass = findViewById(R.id.etNewPass);
        etConfPass = findViewById(R.id.etConfPass);
        btnSave = findViewById(R.id.btnSaveChange);
        btnCancel = findViewById(R.id.btnCancel);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(ChangePassword.this, Main.class);
                startActivity(intent);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
//                intent.setClass(ChangePassword.this, Main.class);
                startActivity(intent);
            }
        });
    }
}