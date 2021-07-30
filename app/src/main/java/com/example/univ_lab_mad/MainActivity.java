package com.example.univ_lab_mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    RadioButton rb1,rb2,rb3,rb4;
    RadioGroup rg1,rg2,rg3,rg4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg1=(RadioGroup)findViewById(R.id.radioGroup2);
        rg2=(RadioGroup)findViewById(R.id.radioGroup);
        rg3=(RadioGroup)findViewById(R.id.radioGroup3);
        rg4=(RadioGroup)findViewById(R.id.radioGroup4);

    }

    public void onclickbuttonMethod(View view) {
        int score=0;
        int selectedId = rg1.getCheckedRadioButtonId();
        int selectedId2 = rg2.getCheckedRadioButtonId();
        int selectedId3= rg3.getCheckedRadioButtonId();
        int selectedId4 = rg4.getCheckedRadioButtonId();
        rb1 = (RadioButton) findViewById(selectedId);
        rb2 = (RadioButton) findViewById(selectedId2);
        rb3 = (RadioButton) findViewById(selectedId3);
        rb4 = (RadioButton) findViewById(selectedId4);
        if(selectedId==-1){
        }
        else{
            if(rb1.getText().toString().equals("True")){
                score++;
            }
        }
        if(selectedId2==-1){
        }
        else{
            if(rb2.getText().toString().equals("False")){
                score++;
            }
        }
        if(selectedId3==-1){
        }
        else{
            if(rb3.getText().toString().equals("False")){
                score++;
            }
        }
        if(selectedId4==-1){
        }
        else{
            if(rb4.getText().toString().equals("False")){
                score++;
            }
        }
        Toast.makeText(MainActivity.this,"Your Score is "+Integer.toString(score), Toast.LENGTH_SHORT).show();
    }
}