package net.fcubd.info_fcub_mahfuz.office;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import net.fcubd.info_fcub_mahfuz.R;

public class aiyaActivity extends AppCompatActivity {

    TextView staffs_position;
    TextView staffs_academics;
    TextView staffs_research;
    TextView staffs_experiences;

    ImageView teachers_img;

    Button staffs_mobile;
    Button staffs_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teachers_layout);

        //staff position

        staffs_position=(TextView)findViewById(R.id.staffs_position);
        staffs_academics=(TextView)findViewById(R.id.staffs_academics);
        staffs_research=(TextView)findViewById(R.id.staffs_research);
        staffs_experiences=(TextView)findViewById(R.id.staffs_experiences);
        teachers_img=(ImageView)findViewById(R.id.teachers_img);
        staffs_mobile=(Button)findViewById(R.id.staffs_mobile);
        staffs_email=(Button)findViewById(R.id.staffs_email);



        staffs_position.setText("Mst. Selina khatun\nAaya\nFirst Capital University Of Bangladesh,Chuadanga");
        staffs_academics.setText(R.string.no_info);
        staffs_research.setText(R.string.no_info);
        staffs_experiences.setText(R.string.no_info);

        //telephone info


        staffs_mobile.setText(R.string.no_info);

        //staffs email
        staffs_email.setText(R.string.no_email);
        staffs_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(aiyaActivity.this, "No E-mail Available", Toast.LENGTH_LONG).show();
            }
        });

        //image details
        teachers_img.setImageResource(R.drawable.noimage);
    }
}
