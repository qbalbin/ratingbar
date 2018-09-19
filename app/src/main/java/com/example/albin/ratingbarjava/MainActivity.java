package com.example.albin.ratingbarjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      private static  Button bttn;
      private static RatingBar rateus;
      private static TextView textrate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listenerRatebar();
        onButtonClick();
    }


//    ratingbar program
    public void listenerRatebar(){
        rateus = findViewById(R.id.ratingBar);
        textrate = findViewById(R.id.textView);
        rateus.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                textrate.setText(String.valueOf(v));

            }
        });
    }

//    ratingabar value set by buttonclick
    public void onButtonClick(){
        rateus = findViewById(R.id.ratingBar);
        bttn = findViewById(R.id.button);

        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,String.valueOf(rateus.getRating()),Toast.LENGTH_SHORT).show();
            }
        });
    }


}
