package net.fcubd.info_fcub_mahfuz.developer;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import net.fcubd.info_fcub_mahfuz.R;

/**
 * Created by Mahfuz on 6/25/2016.
 */
public class ronyActivity extends AppCompatActivity {


    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;


    ImageView jewel_img;
    TextView jewel_info;
    TextView academic_info;
    TextView experience;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.developers_info_layout);

        button_1=(Button)findViewById(R.id.button_1);
        button_2=(Button)findViewById(R.id.button_2);
        button_3=(Button)findViewById(R.id.button_3);
        button_4=(Button)findViewById(R.id.button_4);
        button_5=(Button)findViewById(R.id.button_5);
        button_6=(Button)findViewById(R.id.button_6);
        button_7=(Button)findViewById(R.id.button_7);
        button_8=(Button)findViewById(R.id.button_8);
        jewel_img=(ImageView)findViewById(R.id.jewel_img);
        jewel_info=(TextView)findViewById(R.id.jewel_info);
        academic_info=(TextView)findViewById(R.id.academic_info);
        experience=(TextView)findViewById(R.id.experience);


        button_1.setText("01722414101");
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Create custom dialog object
                final Dialog dialog = new Dialog(ronyActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                // Include dialog.xml file
                dialog.setContentView(R.layout.alertdialogue);
                dialog.show();


                ImageButton call = (ImageButton) dialog.findViewById(R.id.call);
                call.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+8801722414101"));
                        startActivity(i);
                    }
                });

                ImageButton call2 = (ImageButton) dialog.findViewById(R.id.sms);
                call2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        {
                            String number = "+8801722414101";
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

        button_2.setText("01913510111");
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Create custom dialog object
                final Dialog dialog = new Dialog(ronyActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                // Include dialog.xml file
                dialog.setContentView(R.layout.alertdialogue);
                dialog.show();


                ImageButton call = (ImageButton) dialog.findViewById(R.id.call);
                call.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent call = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+8801913510111"));
                        startActivity(call);
                    }
                });

                ImageButton call2 = (ImageButton) dialog.findViewById(R.id.sms);
                call2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        {
                            String number = "+8801913510111";
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

        button_3.setText("r.rony9966@gmail.com");
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] to = {"r.rony9966@gmail.com"};
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


        button_4.setText("/rony9966");
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookIntent = getOpenFacebookIntent(ronyActivity.this);
                startActivity(facebookIntent);
            }
        });

        button_5.setText("/rony9966");
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twitterIntent = getOpenTwitterIntent(ronyActivity.this);
                startActivity(twitterIntent);
            }
        });

        button_6.setText("/rony96bd");
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAppInstalled("com.skype.raider")){
                    Intent skype_intent = new Intent("android.intent.action.VIEW");
                    skype_intent.setData(Uri.parse("skype:rony96bd"));
                    startActivity(skype_intent);
                }else{
                    Toast.makeText(ronyActivity.this, "Please install Skype App", Toast.LENGTH_LONG).show();
                }
            }
        });

        button_7.setText("/rony9966");
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent
                        .putExtra(Intent.EXTRA_TEXT,
                                "Hi, I am texting from info_fcub android app");
                sendIntent.setType("text/plain");
                sendIntent.setPackage("com.facebook.orca");
                try
                {
                    startActivity(sendIntent);
                }
                catch (android.content.ActivityNotFoundException ex)
                {
                    Toast.makeText(ronyActivity.this, "Please install Messenger App", Toast.LENGTH_LONG).show();
                }
            }
        });

        button_8.setText("odepe.com/rony9966");
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.odepe.com/rony9966"));
                startActivity(web);
            }
        });

        jewel_img.setImageResource(R.drawable.rony);
        jewel_info.setText("Rakib Uddin Rony\nB.Sc in Computer Science and Engineering\nDepartment Of CSE\nFirst Capital University Of Bangladesh\nBatch: 10th\nID:15093341(4)401");
        academic_info.setText("*** SSC-2012\n*** HSC-2014\n*** B.Sc in CSE");
        experience.setText("A member of team odepe and working as a Technician, UNO Office, Alamdanga, Chuadanga..");


    }

    //twitter Intent
    public static Intent getOpenTwitterIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.twitter.android", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("twitter://user?user_id=168422177"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.twitter.com/rony9966"));
        }
    }

    //facebook Intent
    public static Intent getOpenFacebookIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("fb://profile/100000444387571"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://facebook.com/rony9966"));
        }
    }

    //is app installed decleared

    private boolean isAppInstalled(String app) {
        PackageManager packagemanager = getPackageManager();
        boolean isOnDevice = false;
        try {
            packagemanager.getPackageInfo(app, PackageManager.GET_ACTIVITIES);
            isOnDevice = true;
        } catch (PackageManager.NameNotFoundException exception) {
            isOnDevice = false;
        }
        return isOnDevice;
    }

}
