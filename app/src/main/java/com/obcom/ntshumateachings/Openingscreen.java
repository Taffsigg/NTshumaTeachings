package com.obcom.ntshumateachings;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Openingscreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openingscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mainIntent = new Intent(Openingscreen.this,MainActivity.class);

                Openingscreen.this.startActivity(mainIntent);

                Openingscreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}