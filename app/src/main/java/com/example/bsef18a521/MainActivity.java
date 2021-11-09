package com.example.bsef18a521;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void openWebBrowser(View v){
        Uri repo= Uri.parse("https://github.com/W-A-Q-A-R/bsef18a521-assignment-3");
        Intent intent =new Intent(Intent.ACTION_VIEW, repo);
        startActivity(intent);
    }
}