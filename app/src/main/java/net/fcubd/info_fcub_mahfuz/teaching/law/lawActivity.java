package net.fcubd.info_fcub_mahfuz.teaching.law;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.fcubd.info_fcub_mahfuz.R;
import net.fcubd.info_fcub_mahfuz.teaching.buadm.aminulActivity;

public class lawActivity extends AppCompatActivity {

    Button billal;
    Button mehedi;
    Button sultana;
    Button tuhin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law);


        billal=(Button)findViewById(R.id.billal);
        mehedi=(Button)findViewById(R.id.mehedi);
        sultana=(Button)findViewById(R.id.sultana);
        tuhin=(Button)findViewById(R.id.tuhin);


        billal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent billal = new Intent(lawActivity.this, billalActivity.class);
                startActivity(billal);
            }
        });


        mehedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mehedi = new Intent(lawActivity.this, mehediActivity.class);
                startActivity(mehedi);
            }
        });


        sultana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sultana = new Intent(lawActivity.this, sultanaActivity.class);
                startActivity(sultana);
            }
        });


        tuhin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tuhin = new Intent(lawActivity.this, tuhinActivity.class);
                startActivity(tuhin);
            }
        });



    }
}
