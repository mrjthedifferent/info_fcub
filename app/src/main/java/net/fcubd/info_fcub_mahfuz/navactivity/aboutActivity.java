package net.fcubd.info_fcub_mahfuz.navactivity;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import net.fcubd.info_fcub_mahfuz.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class aboutActivity extends AppCompatActivity {

    Button checkbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        checkbutton = (Button) findViewById(R.id.checkbutton);
        checkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Update("http://fcubd.net/app/info_fcub_latest.apk");
                Toast.makeText(aboutActivity.this, "Checking for Updates....", Toast.LENGTH_LONG).show();
                Toast.makeText(aboutActivity.this, "Downloading Updates....Please Wait..", Toast.LENGTH_LONG).show();

            }

        });

    }

    public void Update(final String apkurl) {
        new AsyncTask<Void, String, String>() {
            String result="";
            @Override
            protected String doInBackground(Void... params) {
                try {
                    URL url = new URL(apkurl);
                    HttpURLConnection c = (HttpURLConnection) url
                            .openConnection();
                    c.setRequestMethod("GET");

                    c.connect();

                    String PATH = Environment.getExternalStorageDirectory()
                            + "/download/";
                    File file = new File(PATH);
                    file.mkdirs();
                    File outputFile = new File(file, "app.apk");
                    FileOutputStream fos = new FileOutputStream(outputFile);

                    InputStream is = c.getInputStream();

                    byte[] buffer = new byte[1024];
                    int len1 = 0;
                    while ((len1 = is.read(buffer)) != -1) {
                        fos.write(buffer, 0, len1);
                    }
                    fos.close();
                    is.close();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setDataAndType(Uri.fromFile(new File(Environment.getExternalStorageDirectory() + "/download/" + "app.apk")), "application/vnd.android.package-archive");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);

                } catch (IOException e) {
                    result="No Update Available!!!!!";
                    e.printStackTrace();

                }
                return result;
            }

            protected void onPostExecute(String result) {

                Toast.makeText(getApplicationContext(), result,
                        Toast.LENGTH_LONG).show();
            };

        }.execute();

    }

}