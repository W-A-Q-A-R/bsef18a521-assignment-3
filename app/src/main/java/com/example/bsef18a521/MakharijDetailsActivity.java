package com.example.bsef18a521;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MakharijDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makharij_details);
        Intent intent = getIntent();
        String buttonType = intent.getStringExtra("buttonType");
        Log.d("buttonType", buttonType);

        TextView title = (TextView) findViewById(R.id.mainTitle);
        ImageView image = (ImageView) findViewById(R.id.mainImage);

        switch (buttonType) {
            case "Halqiyah":
                image.setImageResource(R.drawable.halqiyah);
                title.setText("Halqiyah");
                break;
            case "Lahatiyah":
                image.setImageResource(R.drawable.lahatiyah);
                title.setText("Lahatiyah");

                break;
            case "Shajariyah-Haafiyah":
                image.setImageResource(R.drawable.shajariya);
                title.setText("Shajariyah-Haafiyah");

                break;
            case "Tarfiyah":
                image.setImageResource(R.drawable.tarfiyah);
                title.setText("Tarfiyah");

                break;
            case "Nit-eeyah":
                image.setImageResource(R.drawable.niteeyah);
                title.setText("Nit-eeyah");

                break;
            case "Lisaveyah":
                image.setImageResource(R.drawable.lisaveyah);
                title.setText("Lisaveyah");

                break;
            case "Ghunna":
                image.setImageResource(R.drawable.ghunna);
                title.setText("Ghunna");
                break;
        }
    }

    ;

    public void goBack(View v) {
        finish();
    }
}