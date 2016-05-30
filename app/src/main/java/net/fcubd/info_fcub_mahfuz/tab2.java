package net.fcubd.info_fcub_mahfuz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Mahfuz on 5/13/2016.
 */
public class tab2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.tab2,container,false);




        WebView view2 = (WebView)view.findViewById(R.id.vcsir);
        view2.loadData(getString(R.string.founder), "text/html; charset=utf-8", "utf-8");


        return view;

    }
}
