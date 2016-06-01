package net.fcubd.info_fcub_mahfuz.navactivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import net.fcubd.info_fcub_mahfuz.MainActivity;
import net.fcubd.info_fcub_mahfuz.R;

public class resultActivity extends AppCompatActivity {


    WebView result;
    ProgressDialog progressDialog;

    Button button;
    Button button2;
    Button button3;

    final Activity activity=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if(isNetworkAvailable()) {
            setContentView(R.layout.activity_result);
            result = (WebView) findViewById(R.id.resultwebView);
            WebSettings webSettings2 = result.getSettings();
            webSettings2.setJavaScriptEnabled(true);
            result.loadUrl("http://fcubd.net/onlyresult.php");
            result.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    if (progressDialog == null) {
                        progressDialog = new ProgressDialog(activity);
                        progressDialog.setMessage("Connecting to Server...");
                        progressDialog.show();

                        // Hide the webview while loading
                        result.setEnabled(false);
                    }
                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    if (progressDialog.isShowing()) {
                        progressDialog.dismiss();
                        progressDialog = null;
                        result.setEnabled(true);
                    }
                }

                public void onReceivedError(WebView view, int errorCod, String description, String failingUrl) {
                    setContentView(R.layout.activity_error);

                    button = (Button)findViewById(R.id.button);
                    button2 = (Button)findViewById(R.id.button2);
                    button3 = (Button)findViewById(R.id.button3);

                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent goback = new Intent(resultActivity.this, MainActivity.class);
                            startActivity(goback);
                        }
                    });

                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent tryagain = new Intent(resultActivity.this, resultActivity.class);
                            startActivity(tryagain);
                        }
                    });

                    button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent settings = new Intent(android.provider.Settings.ACTION_SETTINGS);
                            settings.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(settings);
                        }
                    });
                    Toast.makeText(resultActivity.this, "Your Internet Connection May not be active Or " + description, Toast.LENGTH_LONG).show();
                }
            });


        }
            if (!isNetworkAvailable()) {
                setContentView(R.layout.activity_error);

                button = (Button)findViewById(R.id.button);
                button2 = (Button)findViewById(R.id.button2);
                button3 = (Button)findViewById(R.id.button3);

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent goback = new Intent(resultActivity.this, MainActivity.class);
                        startActivity(goback);
                    }
                });

                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent tryagain = new Intent(resultActivity.this, resultActivity.class);
                        startActivity(tryagain);
                    }
                });

                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent settings = new Intent(android.provider.Settings.ACTION_SETTINGS);
                        settings.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(settings);
                    }
                });

                Toast.makeText(resultActivity.this, "you cannot see result untill you go online", Toast.LENGTH_SHORT).show();

            }
    }

    @Override
    public void onBackPressed() {
        Intent gotomain = new Intent(resultActivity.this, MainActivity.class);
        startActivity(gotomain);
        return;
    }

    private boolean isNetworkAvailable(){
        ConnectivityManager connectivityManager=(ConnectivityManager)this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo=connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo !=null;
    }
}
