package net.fcubd.info_fcub_mahfuz.navactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import net.fcubd.info_fcub_mahfuz.R;
import net.fcubd.info_fcub_mahfuz.developer.jewelActivity;
import net.fcubd.info_fcub_mahfuz.developer.ronyActivity;
import net.fcubd.info_fcub_mahfuz.teaching.cse.tomalActivity;

public class developerActivity extends AppCompatActivity {


    TextView software_developer;
    Animation bounce;

    TextView rony_vai_work;
    TextView tomal_sir_work;

    RelativeLayout jewel_layout;
    RelativeLayout rony_vai_layout;
    RelativeLayout tomal_sir_layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);


        bounce = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);

        //Software Developer Jewel
        software_developer = (TextView) findViewById(R.id.software_developer);
        software_developer.startAnimation(bounce);

        jewel_layout = (RelativeLayout) findViewById(R.id.jewel_layout);
        jewel_layout.startAnimation(bounce);



        //rony vai
        rony_vai_work = (TextView) findViewById(R.id.rony_vai_work);
        rony_vai_work.startAnimation(bounce);

        rony_vai_layout = (RelativeLayout) findViewById(R.id.rony_layout);
        rony_vai_layout.startAnimation(bounce);

        rony_vai_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rony = new Intent(developerActivity.this, ronyActivity.class);
                startActivity(rony);
            }
        });


        //tomal sir
        tomal_sir_work = (TextView) findViewById(R.id.tomal_sir_work);
        tomal_sir_work.startAnimation(bounce);

        tomal_sir_layout = (RelativeLayout) findViewById(R.id.tomal_layout);
        tomal_sir_layout.startAnimation(bounce);
        tomal_sir_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tomalsir = new Intent(developerActivity.this, tomalActivity.class);
                startActivity(tomalsir);
            }
        });

        jewel_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jewel = new Intent(developerActivity.this, jewelActivity.class);
                startActivity(jewel);
            }
        });





    }
}
