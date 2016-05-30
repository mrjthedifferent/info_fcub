package net.fcubd.info_fcub_mahfuz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;

/**
 * Created by Mahfuz on 5/13/2016.
 */
public class tab1 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab1,container,false);




            WebView view1 = (WebView)view.findViewById(R.id.founder);
            view1.loadData(getString(R.string.founder), "text/html; charset=utf-8", "utf-8");




        return  view;
    }



}
