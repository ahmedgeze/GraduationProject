package com.example.ahmetserdargeze.graduationproject.tabsection.t_ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ahmetserdargeze.graduationproject.R;

/**
 * Created by ahmetserdargeze on 16.04.2018.
 */

public class Btc_fragment extends Fragment {
    View view;
    String mtitle;

    public static Btc_fragment getInstance(String title) {
        Btc_fragment bf = new Btc_fragment();
        bf.mtitle = title;
        return bf;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.btc_fragment,container,false);

        return view;
    }
}
