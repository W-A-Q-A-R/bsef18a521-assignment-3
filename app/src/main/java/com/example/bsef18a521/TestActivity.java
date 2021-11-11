package com.example.bsef18a521;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {

    String Questions[][] = {{"1. How many prophets are there?", "100000", "200000", "300000", "400000"}, {"2. How many prophets are there?", "500000", "600000", "700000", "800000"}, {"How many prophets are there?", "120000", "220000", "320000", "420000"}, {"How many prophets are there?", "130000", "230000", "330000", "430000"}, {"5. How many prophets are there?", "100000", "200000", "300000", "400000"}, {"6. How many prophets are there?", "100000", "200000", "300000", "400000"}};

    String CorrectOptions[] = {"100000", "100000", "100000", "100000", "100000", "100000"};


    private RadioButton radioButton;
    private Button btnDisplay;
    int i = 0;
    int correct=0;
    int incorrect=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
        TextView questionText = (TextView) findViewById(R.id.textView7);
        RadioButton radio1 = (RadioButton) findViewById(R.id.radio1);
        RadioButton radio2 = (RadioButton) findViewById(R.id.radio2);
        RadioButton radio3 = (RadioButton) findViewById(R.id.radio3);
        RadioButton radio4 = (RadioButton) findViewById(R.id.radio4);

        questionText.setText(Questions[0][0]);
        radio1.setText(Questions[0][1]);
        radio2.setText(Questions[0][2]);
        radio3.setText(Questions[0][3]);
        radio4.setText(Questions[0][4]);
    }


    public void onNextClick(View v) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        if (selectedId != -1) {
            radioButton = (RadioButton) findViewById(selectedId);
            String radioText = (String) radioButton.getText();
            Log.d("--string value before--", String.valueOf(Questions.length));
            if (radioText == CorrectOptions[i]) {
                correct=correct+1;
            } else if (radioText != CorrectOptions[i]) {
                incorrect=incorrect+1;
            }
            TextView questionText = (TextView) findViewById(R.id.textView7);
            RadioButton radio1 = (RadioButton) findViewById(R.id.radio1);
            RadioButton radio2 = (RadioButton) findViewById(R.id.radio2);
            RadioButton radio3 = (RadioButton) findViewById(R.id.radio3);
            RadioButton radio4 = (RadioButton) findViewById(R.id.radio4);

            Log.d("selected radio", (String) radioButton.getText());

            i = i + 1;

            if (i < Questions.length) {
                questionText.setText(Questions[i][0]);
                radio1.setText(Questions[i][1]);
                radio2.setText(Questions[i][2]);
                radio3.setText(Questions[i][3]);
                radio4.setText(Questions[i][4]);
                radioGroup.clearCheck();
            } else {
                Intent intent=new Intent(this,ResultActivity.class);
                Bundle extras = new Bundle();
                extras.putString("correct", String.valueOf(correct));
                extras.putString("incorrect", String.valueOf(incorrect));
                intent.putExtras(extras);
                startActivity(intent);

            }
        } else {
            Toast.makeText(TestActivity.this,
                    "Please select an option to continue", Toast.LENGTH_LONG).show();
        }


    }

    public void onPreviousClick(View v) {
        finish();
    }


}


