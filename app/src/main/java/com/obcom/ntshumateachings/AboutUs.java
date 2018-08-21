package com.obcom.ntshumateachings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutUs extends AppCompatActivity {

    private Button b ;
    private Button a;
    private Button z ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        b=(Button)findViewById(R.id.back);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutUs.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        a=(Button)findViewById(R.id.bkbtn);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutUs.this, Prayer.class);
                startActivity(intent);
                finish();
            }
        });

        z=(Button)findViewById(R.id.bdbtn);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutUs.this, Banl.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
