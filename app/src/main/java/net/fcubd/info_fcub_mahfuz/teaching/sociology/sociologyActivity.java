package net.fcubd.info_fcub_mahfuz.teaching.sociology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.fcubd.info_fcub_mahfuz.R;
import net.fcubd.info_fcub_mahfuz.teaching.buadm.aminulActivity;
import net.fcubd.info_fcub_mahfuz.teaching.buadm.astarulActivity;
import net.fcubd.info_fcub_mahfuz.teaching.buadm.mostafijurActivity;
import net.fcubd.info_fcub_mahfuz.teaching.buadm.najmulActivity;
import net.fcubd.info_fcub_mahfuz.teaching.buadm.sabujActivity;

public class sociologyActivity extends AppCompatActivity {

    Button amirul;
    Button farjana;
    Button razwan;
    Button shamsun;
    Button sujauddin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sociology);


        amirul=(Button)findViewById(R.id.amirul);
        farjana=(Button)findViewById(R.id.farjana);
        razwan=(Button)findViewById(R.id.razwan);
        shamsun=(Button)findViewById(R.id.shamsun);
        sujauddin=(Button)findViewById(R.id.sujauddin);

        amirul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent amirul = new Intent(sociologyActivity.this, amirulActivity.class);
                startActivity(amirul);
            }
        });


        farjana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent farjana = new Intent(sociologyActivity.this, farjanaActivity.class);
                startActivity(farjana);
            }
        });


        razwan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent razwan = new Intent(sociologyActivity.this, razwanActivity.class);
                startActivity(razwan);
            }
        });


        shamsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shamsun = new Intent(sociologyActivity.this, shamsunActivity.class);
                startActivity(shamsun);
            }
        });


        sujauddin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sujauddin = new Intent(sociologyActivity.this, sujauddinActivity.class);
                startActivity(sujauddin);
            }
        });

    }
}
