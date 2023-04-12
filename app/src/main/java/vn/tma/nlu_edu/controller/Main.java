package vn.tma.nlu_edu.controller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import vn.tma.nlu_edu.view.Account;
import vn.tma.nlu_edu.view.Home;
import vn.tma.nlu_edu.view.Notification;
import vn.tma.nlu_edu.R;

public class Main extends AppCompatActivity {
    BottomNavigationView view;
    ImageButton logoutIB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.bottom_nav);

        replaceFragment(new Home());

        view.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home_page:
                        replaceFragment(new Home());
                        break;

                    case R.id.notification:
                        replaceFragment(new Notification());
                        break;

                    case R.id.person:
                        replaceFragment(new Account());
                        break;
                }
                return true;
            }
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.containerAct, fragment);
        fragmentTransaction.commit();
    }
}