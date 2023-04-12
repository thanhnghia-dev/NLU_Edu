package vn.tma.nlu_edu.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import vn.tma.nlu_edu.R;

public class LaunchScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        // Dùng cài đặt sau 1 giây màn hình tự chuyển
        Thread timing = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                } catch (Exception e) {
                    Log.d("Test", "Error Start");
                } finally {
                    Intent intent = new Intent(LaunchScreen.this, Main.class);
                    startActivity(intent);
                }
            }
        };
        timing.start();
    }

    // sau khi chuyển sang màn hình chính, kết thúc màn hình chào
    protected void onPause() {
        super.onPause();
        finish();
    }
}