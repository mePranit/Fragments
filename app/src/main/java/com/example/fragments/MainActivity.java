package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.fragments.Fragments.AddFragment;
import com.example.fragments.Fragments.FirstFragment;
import com.example.fragments.Fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {


    LinearLayout container;
    Button btnFragment;
    boolean status=true;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container=findViewById(R.id.container);
        btnFragment=findViewById(R.id.btnFragment);



        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                if(status==true)
                {
                    AddFragment addFragment=new AddFragment();
                    fragmentTransaction.replace(R.id.container,addFragment);
                    fragmentTransaction.commit();
                    btnFragment.setText("Load Second Fragment");
                    status=false;
                    /*
                    FirstFragment firstFragment=new FirstFragment();
                    fragmentTransaction.replace(R.id.container,firstFragment);
                    fragmentTransaction.commit();
                    btnFragment.setText("Load Second Fragment");
                    status=false;*/

                }
                else
                {
                    SecondFragment secondFragment=new SecondFragment();
                    fragmentTransaction.replace(R.id.container,secondFragment);
                    fragmentTransaction.commit();
                    btnFragment.setText("Load First Fragment");
                    status=true;
                }
            }
        });

    }
}
