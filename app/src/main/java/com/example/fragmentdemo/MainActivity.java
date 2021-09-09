package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button leftFragmentButton=(Button) findViewById(R.id.left_fragment_button);

        leftFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()){
                    case R.id.left_fragment_button:
                        AnotherRightFragment anotherRightFragment=new AnotherRightFragment();
                        FragmentManager fragmentManager=getFragmentManager();
                        FragmentTransaction transaction=fragmentManager.beginTransaction();
                        transaction.replace(R.id.main_right_layout,anotherRightFragment);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}