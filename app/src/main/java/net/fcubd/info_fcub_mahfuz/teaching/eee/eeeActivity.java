package net.fcubd.info_fcub_mahfuz.teaching.eee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.fcubd.info_fcub_mahfuz.R;
import net.fcubd.info_fcub_mahfuz.teaching.buadm.aminulActivity;
import net.fcubd.info_fcub_mahfuz.teaching.cse.SayeedActivity;

public class eeeActivity extends AppCompatActivity {

    Button iqbalsir;
    Button arifur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee);


        iqbalsir = (Button)findViewById(R.id.iqbalsir);
        arifur = (Button)findViewById(R.id.arifur);

        iqbalsir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iqbalsir = new Intent(eeeActivity.this, SayeedActivity.class);
                startActivity(iqbalsir);
            }
        });

        arifur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arifur = new Intent(eeeActivity.this, arifurActivity.class);
                startActivity(arifur);
            }
        });
    }
}
