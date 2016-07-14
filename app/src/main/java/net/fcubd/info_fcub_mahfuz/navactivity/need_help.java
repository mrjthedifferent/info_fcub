package net.fcubd.info_fcub_mahfuz.navactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.fcubd.info_fcub_mahfuz.MainActivity;
import net.fcubd.info_fcub_mahfuz.R;

public class need_help extends AppCompatActivity {

    Button nav_dev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_need_help);

        nav_dev=(Button)findViewById(R.id.nav_dev);

        nav_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(need_help.this,developerActivity.class));
            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent gotomain = new Intent(need_help.this, MainActivity.class);
        startActivity(gotomain);
        return;
    }

}
