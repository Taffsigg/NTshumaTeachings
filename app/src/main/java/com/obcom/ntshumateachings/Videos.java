package com.obcom.ntshumateachings;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;

public class Videos extends AppCompatActivity {

    private Button b ;



    WebView OurBrow;
    ProgressBar Bar;
    private Button backtof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);



        Bar=(ProgressBar)findViewById(R.id.progressbarshop);



        OurBrow=(WebView) findViewById(R.id.webviewshop);
        OurBrow.setWebViewClient(new MyBrowser());
        OurBrow.setWebViewClient(new MyBr());
        OurBrow.getSettings().setLoadWithOverviewMode(true);
        OurBrow.getSettings().setUseWideViewPort(true);
        OurBrow.getSettings().setJavaScriptEnabled(true);
        OurBrow.loadUrl("http://www.dhpministries.co.zw/dhpapp/videos");

        b=(Button)findViewById(R.id.back);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Videos.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });




    }



    public class MyBr extends WebViewClient {

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            Bar.setVisibility(View.VISIBLE);
            setTitle("Loading...");
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            Bar.setVisibility(View.GONE);
            setTitle("Videos");
        }
    }

    private class MyBrowser extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return  true;
        }
    }
}

