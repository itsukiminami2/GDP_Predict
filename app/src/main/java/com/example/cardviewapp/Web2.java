package com.example.cardviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web2 extends AppCompatActivity {

    private WebView myWebView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web2);

        Intent intent = getIntent();
        String url = "http://www.google.com";
        String page = intent.getStringExtra("page");
        if(page.equals("G20")) {
            url = "http://en.wikipedia.org/wiki/G20" ;
        }
        else if(page.equals("growth")){
            url = "http://en.wikipedia.org/wiki/Economic_growth";
        }

        myWebView2 = findViewById(R.id.webview2);
        myWebView2.getSettings().setJavaScriptEnabled(true);
        myWebView2.setWebViewClient(new WebViewClient());
        myWebView2.loadUrl(url);
    }
}
