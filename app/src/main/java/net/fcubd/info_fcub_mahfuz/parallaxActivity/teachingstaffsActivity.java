package net.fcubd.info_fcub_mahfuz.parallaxActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import net.fcubd.info_fcub_mahfuz.R;
import net.fcubd.info_fcub_mahfuz.teaching.AgricultureActivity;
import net.fcubd.info_fcub_mahfuz.teaching.SelimThohaActivity;
import net.fcubd.info_fcub_mahfuz.teaching.buadmActivity;
import net.fcubd.info_fcub_mahfuz.teaching.cse.cseActivity;
import net.fcubd.info_fcub_mahfuz.teaching.eee.eeeActivity;
import net.fcubd.info_fcub_mahfuz.teaching.english.englishActivity;
import net.fcubd.info_fcub_mahfuz.teaching.law.lawActivity;
import net.fcubd.info_fcub_mahfuz.teaching.ph.phActivity;
import net.fcubd.info_fcub_mahfuz.teaching.sociology.sociologyActivity;

public class teachingstaffsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachingstaffs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);



        Button selimthoha;
        Button agriculture;
        Button buadm;
        Button cse;
        Button eee;
        Button english;
        Button law;
        Button ph;
        Button sociology;



        selimthoha = (Button)findViewById(R.id.selimthoha);
        agriculture = (Button)findViewById(R.id.agriculture);
        buadm = (Button)findViewById(R.id.buadm);
        cse = (Button)findViewById(R.id.cse);
        eee = (Button)findViewById(R.id.eee);
        english = (Button)findViewById(R.id.english);
        law = (Button)findViewById(R.id.law);
        ph = (Button)findViewById(R.id.ph);
        sociology = (Button)findViewById(R.id.sociology);



        selimthoha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selimthoha = new Intent(teachingstaffsActivity.this, SelimThohaActivity.class);
                startActivity(selimthoha);
            }
        });

        agriculture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent agriculture = new Intent(teachingstaffsActivity.this, AgricultureActivity.class);
                startActivity(agriculture);
            }
        });

        buadm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buadm = new Intent(teachingstaffsActivity.this, buadmActivity.class);
                startActivity(buadm);
            }
        });

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cse = new Intent(teachingstaffsActivity.this, cseActivity.class);
                startActivity(cse);
            }
        });

        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eee = new Intent(teachingstaffsActivity.this, eeeActivity.class);
                startActivity(eee);
            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent english = new Intent(teachingstaffsActivity.this, englishActivity.class);
                startActivity(english);
            }
        });

        law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent law = new Intent(teachingstaffsActivity.this, lawActivity.class);
                startActivity(law);
            }
        });

        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ph = new Intent(teachingstaffsActivity.this, phActivity.class);
                startActivity(ph);
            }
        });

        sociology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sociology = new Intent(teachingstaffsActivity.this, sociologyActivity.class);
                startActivity(sociology);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
