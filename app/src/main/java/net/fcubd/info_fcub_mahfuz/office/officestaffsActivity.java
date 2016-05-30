package net.fcubd.info_fcub_mahfuz.office;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.fcubd.info_fcub_mahfuz.R;

public class officestaffsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officestaffs);


        Button vc;
        Button treasurer;
        Button registrar;
        Button controller;
        Button finance;
        Button asregistrar;
        Button administrative;
        Button admission;
        Button asaccount;
        Button section;
        Button computer;
        Button computer2;
        Button officeassistant;
        Button supervisor;
        Button vctomlss;
        Button mlssexam;
        Button mlssreg;
        Button mlssteaching;
        Button nightguard1;
        Button nightguard2;
        Button cleaner;
        Button aiya;



        vc = (Button)findViewById(R.id.vc);
        treasurer = (Button)findViewById(R.id.treasurer);
        registrar = (Button)findViewById(R.id.registrar);
        controller = (Button)findViewById(R.id.controller);
        finance = (Button)findViewById(R.id.finance);
        asregistrar = (Button)findViewById(R.id.asregistrar);
        administrative = (Button)findViewById(R.id.adofficer);
        admission = (Button)findViewById(R.id.admissionofficer);
        asaccount = (Button)findViewById(R.id.accofficer);
        section = (Button)findViewById(R.id.secofficer);
        computer = (Button)findViewById(R.id.computeroperator);
        computer2 = (Button)findViewById(R.id.computeroperator2);
        officeassistant = (Button)findViewById(R.id.officeassistant);
        supervisor = (Button)findViewById(R.id.supervisor);
        vctomlss = (Button)findViewById(R.id.vcmlss);
        mlssexam = (Button)findViewById(R.id.mlssexam);
        mlssreg = (Button)findViewById(R.id.mlssreg);
        mlssteaching = (Button)findViewById(R.id.mlssstaff);
        nightguard1 = (Button)findViewById(R.id.nightguard);
        nightguard2 = (Button)findViewById(R.id.nightguard2);
        cleaner = (Button)findViewById(R.id.cleaner);
        aiya = (Button)findViewById(R.id.aiya);





        vc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vc = new Intent(officestaffsActivity.this, vcActivity.class);
                startActivity(vc);
            }
        });


        treasurer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent treasurer = new Intent(officestaffsActivity.this, treasurerActivity.class);
                startActivity(treasurer);
            }
        });

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrar = new Intent(officestaffsActivity.this, registrarActivity.class);
                startActivity(registrar);
            }
        });

        controller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent controller = new Intent(officestaffsActivity.this, controllerActivity.class);
                startActivity(controller);
            }
        });

        finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent finance = new Intent(officestaffsActivity.this, financeActivity.class);
                startActivity(finance);
            }
        });

        asregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asregistrar = new Intent(officestaffsActivity.this, asregistrarActivity.class);
                startActivity(asregistrar);
            }
        });

        administrative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent administrative = new Intent(officestaffsActivity.this, administrativeActivity.class);
                startActivity(administrative);
            }
        });

        admission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent admission = new Intent(officestaffsActivity.this, admissionActivity.class);
                startActivity(admission);
            }
        });

        asaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asaccount = new Intent(officestaffsActivity.this, asaccountActivity.class);
                startActivity(asaccount);
            }
        });

        section.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent section = new Intent(officestaffsActivity.this, sectionActivity.class);
                startActivity(section);
            }
        });

        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent computer = new Intent(officestaffsActivity.this, computerActivity.class);
                startActivity(computer);
            }
        });

        computer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent computer2 = new Intent(officestaffsActivity.this, computer2Activity.class);
                startActivity(computer2);
            }
        });

        officeassistant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent officeassistant = new Intent(officestaffsActivity.this, officeassistantActivity.class);
                startActivity(officeassistant);
            }
        });

        supervisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent supervisor = new Intent(officestaffsActivity.this, supervisorActivity.class);
                startActivity(supervisor);
            }
        });

        vctomlss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vctomlss = new Intent(officestaffsActivity.this, vctomlssActivity.class);
                startActivity(vctomlss);
            }
        });

        mlssexam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mlssexam = new Intent(officestaffsActivity.this, mlssexamActivity.class);
                startActivity(mlssexam);
            }
        });

        mlssreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mlssreg = new Intent(officestaffsActivity.this, mlssregActivity.class);
                startActivity(mlssreg);
            }
        });

        mlssteaching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mlssteaching = new Intent(officestaffsActivity.this, mlssteachingActivity.class);
                startActivity(mlssteaching);
            }
        });

        nightguard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nightguard1 = new Intent(officestaffsActivity.this, nightguard1Activity.class);
                startActivity(nightguard1);
            }
        });

        nightguard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nightguard2 = new Intent(officestaffsActivity.this, nightguard2Activity.class);
                startActivity(nightguard2);
            }
        });

        cleaner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cleaner = new Intent(officestaffsActivity.this, cleanerActivity.class);
                startActivity(cleaner);
            }
        });

        aiya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aiya = new Intent(officestaffsActivity.this, aiyaActivity.class);
                startActivity(aiya);
            }
        });

    }


}
