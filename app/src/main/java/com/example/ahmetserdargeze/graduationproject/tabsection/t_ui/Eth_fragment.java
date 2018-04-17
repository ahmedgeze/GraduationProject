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

public class Eth_fragment extends Fragment {
    View view;
    private String mtitle;

    public static Eth_fragment getInstance(String title) {
        Eth_fragment ef = new Eth_fragment();
        ef.mtitle = title;
        return ef;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.eth_fragment,container,false);





        return view;
    }
}
