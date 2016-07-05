package net.fcubd.info_fcub_mahfuz.teaching;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.fcubd.info_fcub_mahfuz.R;
import net.fcubd.info_fcub_mahfuz.teaching.agriculture.golamActivity;
import net.fcubd.info_fcub_mahfuz.teaching.agriculture.mizanActivity;
import net.fcubd.info_fcub_mahfuz.teaching.agriculture.nahidActivity;
import net.fcubd.info_fcub_mahfuz.teaching.agriculture.shahinActivity;
import net.fcubd.info_fcub_mahfuz.teaching.agriculture.tahmidarActivity;
import net.fcubd.info_fcub_mahfuz.teaching.buadm.aminulActivity;
import net.fcubd.info_fcub_mahfuz.teaching.buadm.astarulActivity;
import net.fcubd.info_fcub_mahfuz.teaching.buadm.mostafijurActivity;
import net.fcubd.info_fcub_mahfuz.teaching.buadm.najmulActivity;
import net.fcubd.info_fcub_mahfuz.teaching.buadm.sabujActivity;

public class AgricultureActivity extends AppCompatActivity {

    Button golam;
    Button mizan;
    Button nahid;
    Button shahin;
    Button tahmidar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture);


        golam=(Button)findViewById(R.id.golamsorwaragriculture);
        mizan=(Button)findViewById(R.id.mizanagriculture);
        nahid=(Button)findViewById(R.id.nahidagriculture);
        shahin=(Button)findViewById(R.id.shahinagriculture);
        tahmidar=(Button)findViewById(R.id.tahmidarrahman);

        golam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent golam = new Intent(AgricultureActivity.this, golamActivity.class);
                startActivity(golam);
            }
        });


        mizan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mizan = new Intent(AgricultureActivity.this, mizanActivity.class);
                startActivity(mizan);
            }
        });


        nahid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nahid = new Intent(AgricultureActivity.this, nahidActivity.class);
                startActivity(nahid);
            }
        });


        shahin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shahin = new Intent(AgricultureActivity.this, shahinActivity.class);
                startActivity(shahin);
            }
        });


        tahmidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tahmidar = new Intent(AgricultureActivity.this, tahmidarActivity.class);
                startActivity(tahmidar);
            }
        });

    }
}
