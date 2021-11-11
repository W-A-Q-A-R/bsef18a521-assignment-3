package com.example.bsef18a521;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


//public class MainActivity extends AppCompatActivity

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWebBrowser(View v) {
        Uri repo = Uri.parse("https://github.com/W-A-Q-A-R/bsef18a521-assignment-3");
        Intent intent = new Intent(Intent.ACTION_VIEW, repo);
        startActivity(intent);
    }

    public void navigateToChooseScreen(View v) {
        Intent intent = new Intent(this, choiceActivity.class);
        intent.putExtra("value", "hello how are u?");
        startActivity(intent);
    }


}