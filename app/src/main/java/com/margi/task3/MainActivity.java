package com.margi.task3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by Margi on 01-Feb-17.
 */
public class MainActivity extends AppCompatActivity {
   // Button button;
    private FragmentA f1;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       FragmentA a = new FragmentA();
        FragmentManager fr1=getSupportFragmentManager();
        FragmentTransaction ft = fr1.beginTransaction();
        ft.add(R.id.linear_main,a);
        ft.commit();
    }
}





