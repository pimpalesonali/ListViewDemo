package com.android.sonali.fragments;


//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        runFragmentTransaction();
        runFragmentTransaction();
    }


    private void runFragmentTransaction()
    {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
       // transaction.add(R.id.frameContainer,new MyFragment());
        transaction.replace(R.id.fragmentLogin,new MyFragment());
        transaction.commit();


    }
}
