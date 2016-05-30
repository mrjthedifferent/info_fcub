package net.fcubd.info_fcub_mahfuz.teaching.cse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.fcubd.info_fcub_mahfuz.R;

public class cseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);

        Button shafiq;
        Button tomalsir;
        Button iqbalsir;





        shafiq = (Button)findViewById(R.id.shafiq);
        tomalsir = (Button)findViewById(R.id.tomalsir);
        iqbalsir = (Button)findViewById(R.id.iqbalsir);




        shafiq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shafiq = new Intent(cseActivity.this,shafiqActivity.class);
                startActivity(shafiq);
            }
        });

        tomalsir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tomal = new Intent(cseActivity.this,tomalActivity.class);
                startActivity(tomal);
            }
        });

        iqbalsir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iqbalsir = new Intent(cseActivity.this,SayeedActivity.class);
                startActivity(iqbalsir);
            }
        });
    }
}
