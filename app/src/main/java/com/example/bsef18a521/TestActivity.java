package com.example.bsef18a521;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity{

    String Questions[][]={{"1. How many prophets are there?","a. 100000","b. 200000","c. 300000","d. 400000"},{"2. How many prophets are there?","a. 500000","b. 600000","c. 700000","d. 800000"}, {"3. How many prophets are there?","a. 120000","b. 220000","c. 320000","d. 420000"},{"4. How many prophets are there?","a. 130000","b. 230000","c. 330000","d. 430000"},{"5. How many prophets are there?","a. 100000","b. 200000","c. 300000","d. 400000"},{"6. How many prophets are there?","a. 100000","b. 200000","c. 300000","d. 400000"}};

    private RadioButton radioButton;
    private Button btnDisplay;
    int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
        TextView questionText=(TextView) findViewById(R.id.textView7);
        RadioButton radio1=(RadioButton) findViewById(R.id.radio1);
        RadioButton radio2=(RadioButton) findViewById(R.id.radio2);
        RadioButton radio3=(RadioButton) findViewById(R.id.radio3);
        RadioButton radio4=(RadioButton) findViewById(R.id.radio4);

        questionText.setText(Questions[0][0]);
        radio1.setText(Questions[0][1]);
        radio2.setText(Questions[0][2]);
        radio3.setText(Questions[0][3]);
        radio4.setText(Questions[0][4]);
    }






    public void onNextClick(View v){
        if(i<Questions.length){
            RadioGroup radioGroup=(RadioGroup) findViewById(R.id.radioGroup);
            int selectedId = radioGroup.getCheckedRadioButtonId();
            TextView questionText=(TextView) findViewById(R.id.textView7);
            RadioButton radio1=(RadioButton) findViewById(R.id.radio1);
            RadioButton radio2=(RadioButton) findViewById(R.id.radio2);
            RadioButton radio3=(RadioButton) findViewById(R.id.radio3);
            RadioButton radio4=(RadioButton) findViewById(R.id.radio4);
            radioButton = (RadioButton) findViewById(selectedId);

            Log.d("selected radio", (String) radioButton.getText());

            i=i+1;
            questionText.setText(Questions[i][0]);
            radio1.setText(Questions[i][1]);
            radio2.setText(Questions[i][2]);
            radio3.setText(Questions[i][3]);
            radio4.setText(Questions[i][4]);
            radioGroup.clearCheck();


        }else{
            Log.d("hello","activity has been finished");
        }

    }
    public void onPreviousClick(View v){
        if(i>0){
            RadioGroup radioGroup=(RadioGroup) findViewById(R.id.radioGroup);
            int selectedId = radioGroup.getCheckedRadioButtonId();
            TextView questionText=(TextView) findViewById(R.id.textView7);
            RadioButton radio1=(RadioButton) findViewById(R.id.radio1);
            RadioButton radio2=(RadioButton) findViewById(R.id.radio2);
            RadioButton radio3=(RadioButton) findViewById(R.id.radio3);
            RadioButton radio4=(RadioButton) findViewById(R.id.radio4);
            radioButton = (RadioButton) findViewById(selectedId);


            Log.d("selected radio", String.valueOf(selectedId));

            i=i-1;
            questionText.setText(Questions[i][0]);
            radio1.setText(Questions[i][1]);
            radio2.setText(Questions[i][2]);
            radio3.setText(Questions[i][3]);
            radio4.setText(Questions[i][4]);


        }else{
            Log.d("hello","activity has been finished");
        }

    }


}


