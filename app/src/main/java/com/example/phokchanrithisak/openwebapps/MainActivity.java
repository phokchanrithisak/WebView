package com.example.phokchanrithisak.openwebapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    WebView webSite;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        webSite = (WebView) findViewById(R.id.webSites);
        webSite.loadUrl("http://www.youtube.com");
        webSite.getSettings().setJavaScriptEnabled(true);
        webSite.setWebViewClient(new OpenWebInternalClass());
        button = (Button) findViewById(R.id.reload);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webSite.reload();
            }
        });


    }
    private class OpenWebInternalClass extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    }

