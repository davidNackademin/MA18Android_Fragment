package com.example.ma18android_fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FragmentManager manager;

//    YellowFragment yellowFrag;
//    PinkFragment pinkFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        manager = getSupportFragmentManager();

//        yellowFrag = new YellowFragment();
//        pinkFrag = new PinkFragment();



    }

    public void addYellowFragment(View view) {
        YellowFragment yellowFragment = new YellowFragment();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, yellowFragment, "yellowFragment");
        transaction.commit();
    }


    public void addPinkFragment(View view) {
        PinkFragment pinkFragment = new PinkFragment();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, pinkFragment, "pinkFragment");
        transaction.commit();
    }

    public void removeYellowFragment(View view) {
        YellowFragment yellowFragment = (YellowFragment) manager.findFragmentByTag("yellowFragment");

        if( yellowFragment != null ) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(yellowFragment);
            transaction.commit();
        } else {
            Toast.makeText(this,"Yellowfragment not found", Toast.LENGTH_SHORT).show();
        }
    }


    public void removePinkFragment(View view) {
        PinkFragment pinkFragment = (PinkFragment) manager.findFragmentByTag("pinkFragment");

        if( pinkFragment != null ) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(pinkFragment);
            transaction.commit();
        } else {
            Toast.makeText(this,"Pinkfragment not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void replaceWithPinkFragment(View view) {
        PinkFragment fragment = new PinkFragment();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragment, "pinkFragment");
        transaction.commit();
    }

    public void changeTextInFragment(View view) {
        PinkFragment pinkFragment = (PinkFragment) manager.findFragmentByTag("pinkFragment");

        if(pinkFragment != null ) {
            pinkFragment.setTextInTextView("New text in fragment");
        }

    }



}
