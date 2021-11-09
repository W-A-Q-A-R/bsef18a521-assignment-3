package com.example.bsef18a521;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LearnActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_activity);
    }

    public void navigateToDetailScreen(View v){
        Intent intent=new Intent(this,MakharijDetailsActivity.class);
        String buttonType = v.getTag().toString();
        intent.putExtra("buttonType", buttonType);
        startActivity(intent);
    }

}
