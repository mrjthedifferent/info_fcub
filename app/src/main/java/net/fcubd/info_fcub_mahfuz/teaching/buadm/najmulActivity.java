package net.fcubd.info_fcub_mahfuz.teaching.buadm;

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

public class najmulActivity extends AppCompatActivity {


    TextView staffs_position;
    TextView staffs_academics;
    TextView staffs_research;
    TextView staffs_experiences;
    TextView staffs_publications;
    TextView staffs_award;

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
        staffs_publications=(TextView)findViewById(R.id.staffs_publications);
        staffs_award=(TextView)findViewById(R.id.staffs_award);
        teachers_img=(ImageView)findViewById(R.id.teachers_img);
        staffs_mobile=(Button)findViewById(R.id.staffs_mobile);
        staffs_email=(Button)findViewById(R.id.staffs_email);



        staffs_position.setText(R.string.najmul_position);
        staffs_academics.setText(R.string.najmul_education);
        staffs_research.setText(R.string.najmul_research);
        staffs_experiences.setText(R.string.najuml_experience);
        staffs_award.setText(R.string.no_info);
        staffs_publications.setText(R.string.no_info);

        //telephone info

        staffs_mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Create custom dialog object
                final Dialog dialog = new Dialog(najmulActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                // Include dialog.xml file
                dialog.setContentView(R.layout.alertdialogue);
                dialog.show();


                ImageButton call = (ImageButton) dialog.findViewById(R.id.call);
                call.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+8801712242713"));
                        startActivity(i);
                    }
                });

                ImageButton call2 = (ImageButton) dialog.findViewById(R.id.sms);
                call2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        {
                            String number = "+8801712242713";
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", number, null)));
                        }
                    }
                });

                Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
                // if decline button is clicked, close the custom dialog
                declineButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Close dialog
                        dialog.dismiss();
                    }
                });
            }
        });

        staffs_mobile.setText("Telephpne: +8801712242713");

        //staffs email
        staffs_email.setText("Email: nhsohag24@gmail.com");
        staffs_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] to = {"nhsohag24@gmail.com"};
                String[] cc = {"This email was sent from info_fcub android app"};
                sendEmail(to, cc, "", "");
            }

            private void sendEmail(String[] emailAddresses, String[] carbonCopies,
                                   String subject, String message)
            {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setData(Uri.parse("mailto:"));
                String[] to = emailAddresses;
                String[] cc = carbonCopies;
                emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
                emailIntent.putExtra(Intent.EXTRA_CC, cc);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
                emailIntent.putExtra(Intent.EXTRA_TEXT, message);
                emailIntent.setType("message/rfc822");
                startActivity(Intent.createChooser(emailIntent, "Email"));
            }
        });

        //image details
        teachers_img.setImageResource(R.drawable.noimage);
    }
}
