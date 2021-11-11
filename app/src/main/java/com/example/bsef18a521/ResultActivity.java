package com.example.bsef18a521;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView correctText = (TextView) findViewById(R.id.correctOptions);
        TextView incorrectText = (TextView) findViewById(R.id.incorrectOptions);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String correct = extras.getString("correct");
        String incorrect = extras.getString("incorrect");
        correctText.setText(correct);
        incorrectText.setText(incorrect);
    }

    public void onSubmit(View v) {
        Intent intent = new Intent(ResultActivity.this, choiceActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void onShare(View v) {

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String correct = extras.getString("correct");
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT,
                "Hey check out makharij app. I got " + correct + " correct out of 6 mcqs.");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);


    }

}