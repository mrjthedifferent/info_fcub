package net.fcubd.info_fcub_mahfuz;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import net.fcubd.info_fcub_mahfuz.CGPA.cgpaActivity;
import net.fcubd.info_fcub_mahfuz.navactivity.aboutActivity;
import net.fcubd.info_fcub_mahfuz.navactivity.contactActivity;
import net.fcubd.info_fcub_mahfuz.navactivity.developerActivity;
import net.fcubd.info_fcub_mahfuz.navactivity.need_help;
import net.fcubd.info_fcub_mahfuz.navactivity.resultActivity;
import net.fcubd.info_fcub_mahfuz.navactivity.websiteviewActivity;
import net.fcubd.info_fcub_mahfuz.parallaxActivity.officestaffsActivity;
import net.fcubd.info_fcub_mahfuz.parallaxActivity.teachingstaffsActivity;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ViewPager pager;
    PagerTabStrip tab_strp;
    final String TAG = this.getClass().getName();

    private static String TAG2 = "PermissionDemo";
    private static String TAG3 = "PermissionDemo";
    private static String TAG4 = "PermissionDemo";
    private static final int RECORD_REQUEST_CODE = 101;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ma_pager_adapter mapager=new ma_pager_adapter(getSupportFragmentManager());
        pager=(ViewPager)findViewById(R.id.pager);


        pager.setAdapter(mapager);
        tab_strp=(PagerTabStrip)findViewById(R.id.tab_strip);
        tab_strp.setTextColor(Color.WHITE);
        //   tab_strp.setTextSize(14,14);
        // tab_strp.setTabIndicatorColor(Color.WHITE);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //Call Phone Permission check
        int permission = ContextCompat.checkSelfPermission(this,
                Manifest.permission.CALL_PHONE);

        if (permission != PackageManager.PERMISSION_GRANTED) {
            Log.i(TAG2, "Permission to Call denied");

            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.CALL_PHONE)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Permission to access the microphone is required for this app to Call.")
                        .setTitle("Permission required");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {
                        Log.i(TAG2, "Clicked");
                        makeRequest();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            } else {
                makeRequest();
            }
        }
        //call phone permission check finish

        //send sms permission
        int permission2 = ContextCompat.checkSelfPermission(this,
                Manifest.permission.CALL_PHONE);

        if (permission2 != PackageManager.PERMISSION_GRANTED) {
            Log.i(TAG3, "Permission to send sms denied");

            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.CALL_PHONE)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Permission to access the messaging is required for this app to Send SMS.")
                        .setTitle("Permission required");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {
                        Log.i(TAG3, "Clicked");
                        makeRequest2();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            } else {
                makeRequest2();
            }
        }

        //write external storages permission

        int permission3 = ContextCompat.checkSelfPermission(this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (permission3 != PackageManager.PERMISSION_GRANTED) {
            Log.i(TAG4, "Permission to read and write storage denied");

            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Permission to access the storage is required for this app to Update this application.")
                        .setTitle("Permission required");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {
                        Log.i(TAG4, "Clicked");
                        makeRequest3();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            } else {
                makeRequest3();
            }
        }
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.share_app) {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT,
                    "Hey, check out info_fcub android app at: http://www.fcubd.net/info_fcub/info_fcub_v_two_zero_one.apk");
            sendIntent.setType("text/plain");
            startActivity(sendIntent);
            return true;
        }
        if (id == R.id.check_for_updates) {
            startActivity(new Intent(MainActivity.this, aboutActivity.class));
            return true;
        }
        if (id == R.id.developer) {
            startActivity(new Intent(MainActivity.this, developerActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

            Intent home = new Intent(MainActivity.this,MainActivity.class);
            startActivity(home);

        } else if (id == R.id.nav_notice) {

            Intent notice = new Intent(MainActivity.this,noticeActivity.class);
            startActivity(notice);

        } else if (id == R.id.nav_officestaff) {

            Intent officestaff = new Intent(MainActivity.this,officestaffsActivity.class);
            startActivity(officestaff);

        } else if (id == R.id.nav_teachingstaff) {

            Intent teachingstaff = new Intent(MainActivity.this,teachingstaffsActivity.class);
            startActivity(teachingstaff);

        } else if (id == R.id.nav_result) {

            Intent teachingstaff = new Intent(MainActivity.this,resultActivity.class);
            startActivity(teachingstaff);


        } else if (id == R.id.nav_cgpacalculator) {

            Intent cgpa = new Intent(MainActivity.this, cgpaActivity.class);
            startActivity(cgpa);
        }else if(id == R.id.nav_web){

            Intent web = new Intent(MainActivity.this, websiteviewActivity.class);
            startActivity(web);

        } else if (id == R.id.nav_contact) {

            Intent contact = new Intent(MainActivity.this, contactActivity.class);
            startActivity(contact);

        } else if (id == R.id.nav_About) {

            Intent about = new Intent(MainActivity.this, aboutActivity.class);
            startActivity(about);

        }else if (id == R.id.nav_Developer) {

            Intent developer = new Intent(MainActivity.this, developerActivity.class);
            startActivity(developer);
        }else if (id == R.id.nav_help) {

            Intent help = new Intent(MainActivity.this, need_help.class);
            startActivity(help);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    boolean twice;
    @Override
    public void onBackPressed() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            Log.d(TAG, "click");

            if(twice == true){
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
                System.exit(0);
            }

            twice = true;
            Log.d(TAG, "twice: " + twice);

            // super.onBackPressed();
            Toast.makeText(MainActivity.this, "Please press again to close the app",Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    twice = false;
                    Log.d(TAG, "twice: " + twice);
                }
            },3000);
        }
    }
    //permission request
    protected void makeRequest() {
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.CALL_PHONE},
                RECORD_REQUEST_CODE);
    }

    protected void makeRequest2() {
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.SEND_SMS},
                RECORD_REQUEST_CODE);
    }
    protected void makeRequest3() {
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                RECORD_REQUEST_CODE);
    }
}
