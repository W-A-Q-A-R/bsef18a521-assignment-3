package com.example.bsef18a521;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class choiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chooseactivity);
    }

    public void navigateToTestScreen(View v) {
        Intent intent = new Intent(this, TestActivity.class);
        intent.putExtra("value", "hello how are u?");
        startActivity(intent);
    }

    public void navigateToLearnScreen(View v) {
        Intent intent = new Intent(this, LearnActivity.class);
        intent.putExtra("value", "hello how are u?");
        startActivity(intent);
    }

    public void onBackButtonPress(View v) {
        finish();
    }


}
