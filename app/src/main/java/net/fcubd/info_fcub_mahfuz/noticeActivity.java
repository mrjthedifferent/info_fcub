package net.fcubd.info_fcub_mahfuz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class noticeActivity extends AppCompatActivity {

    WebView noticewebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        noticewebView = (WebView)findViewById(R.id.noticewebView);
        WebSettings webSettings = noticewebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        noticewebView.loadUrl("http://www.fcubd.net/notice.php");


    }
}
