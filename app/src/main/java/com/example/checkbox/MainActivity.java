package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    CheckBox cb4;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        cb1=findViewById(R.id.checkBox);
        cb2=findViewById(R.id.checkBox2);
        cb3=findViewById(R.id.checkBox3);
        cb4=findViewById(R.id.checkBox4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str="The games you play are ";
                if(cb1.isChecked()){
                    str+=cb1.getText();
                }
                if(cb2.isChecked()){
                    str+=cb2.getText();
                }
                if(cb3.isChecked()){
                    str+=cb3.getText();
                }
                if(cb4.isChecked()){
                    str+=cb4.getText();
                }
                Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
            }
        });

    }
}