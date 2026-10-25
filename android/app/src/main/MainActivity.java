package com.example.engineercalc;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(Color.rgb(16,21,29));
        getWindow().setNavigationBarColor(Color.rgb(16,21,29));
        WebView web = new WebView(this);
        web.setBackgroundColor(Color.rgb(16,21,29));
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setDomStorageEnabled(false);
        web.loadUrl("file:///android_asset/index.html");
        setContentView(web);
    }
}
