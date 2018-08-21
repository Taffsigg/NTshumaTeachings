package com.obcom.ntshumateachings;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button s;
    private Button v;
    private Button a;
    private Button e;
    private Button q;
    private Button b;
    private Button f;
    private Button p;
    private Button t;
    private Button ab;
    private Button clas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p = (Button) findViewById(R.id.prayerbtn);

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Prayer.class);
                startActivity(intent);
                finish();
            }
        });

        s = (Button) findViewById(R.id.sermonsbtn);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sermons.class);
                startActivity(intent);
                finish();
            }
        });


        v = (Button) findViewById(R.id.vidsbtn);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Videos.class);
                startActivity(intent);
                finish();
            }
        });


        a = (Button) findViewById(R.id.audiobtn);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Audios.class);
                startActivity(intent);
                finish();
            }
        });


        e = (Button) findViewById(R.id.eventsbtn);

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Events.class);
                startActivity(intent);
                finish();
            }
        });


        q = (Button) findViewById(R.id.qoutesbtn);

        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Qoutes.class);
                startActivity(intent);
                finish();
            }
        });


        b = (Button) findViewById(R.id.bookletbtn);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Booklet.class);
                startActivity(intent);
                finish();
            }
        });


        f = (Button) findViewById(R.id.fbtn);

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Facebook.class);
                startActivity(intent);
                finish();
            }
        });


        t = (Button) findViewById(R.id.twitterbtn);

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Twitter.class);
                startActivity(intent);
                finish();
            }
        });


        ab = (Button) findViewById(R.id.aboutusbtn);

        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutUs.class);
                startActivity(intent);
                finish();
            }
        });

        clas = (Button) findViewById(R.id.classifiedsbtn);

        clas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
