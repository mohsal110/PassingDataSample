package com.example.mohsal.passingdatasample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button enter_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter_name=(Button)findViewById(R.id.enter_name_dialoge);
        enter_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                OnNameSelectedDialoge onNameSelectedDialoge=new OnNameSelectedDialoge(MainActivity.this);
//                onNameSelectedDialoge.show();
                Intent intent=new Intent(MainActivity.this,StopActivitiy.class);
                startActivity(intent);
            }
        });
    }
}
