package net.fcubd.info_fcub_mahfuz.navactivity;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import net.fcubd.info_fcub_mahfuz.R;

public class resultActivity extends AppCompatActivity {


    WebView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        result = (WebView)findViewById(R.id.resultwebView);
        WebSettings webSettings2 = result.getSettings();
        webSettings2.setJavaScriptEnabled(true);
        result.loadUrl("http://fcubd.net/onlyresult.php");
        result.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                findViewById(R.id.resultprogress).setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                findViewById(R.id.resultprogress).setVisibility(View.GONE);
            }
        });
    }
}
