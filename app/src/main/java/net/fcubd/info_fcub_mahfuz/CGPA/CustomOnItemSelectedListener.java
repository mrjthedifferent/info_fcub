package net.fcubd.info_fcub_mahfuz.CGPA;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by Mahfuz on 5/28/2016.
 */
public class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener {

    public String text;

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        Toast.makeText(parent.getContext(),
                "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(),
                Toast.LENGTH_SHORT).show();

        text = parent.getItemAtPosition(pos).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

}
