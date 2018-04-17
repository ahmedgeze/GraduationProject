package com.example.ahmetserdargeze.graduationproject.tabsection.t_ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ahmetserdargeze.graduationproject.R;
import com.example.ahmetserdargeze.graduationproject.tabsection.coin_models.Collective_Coin_Body;
import com.example.ahmetserdargeze.graduationproject.tabsection.coin_models.Collective_Coin_Result;
import com.example.ahmetserdargeze.graduationproject.tabsection.retrofit.APIService;
import com.example.ahmetserdargeze.graduationproject.tabsection.retrofit.ApiUtils;
import com.example.ahmetserdargeze.graduationproject.tabsection.rv.ResultAdapter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ahmetserdargeze on 16.04.2018.
 */

public class Usdt_fragment extends Fragment {
    View view;
    private String mtitle;


    public Collective_Coin_Body usdt_response=new Collective_Coin_Body();
    public ArrayList<Collective_Coin_Result> result_USDresponse=new ArrayList<>();
    public RecyclerView usdcoinRecycler;
    RecyclerView.LayoutManager mLayoutManager;
    public ResultAdapter usdtAdapter;
    public APIService ustdToCoin;


    public static Usdt_fragment getInstance(String title) {

        Usdt_fragment uf = new Usdt_fragment();
        uf.mtitle = title;
        return uf;
    }






    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.usdt_fragment,container,false);








        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


//        usdcoinRecycler=(RecyclerView) view.findViewById(R.id.ucf_usdtcoinrecyler);
//        mLayoutManager=new LinearLayoutManager(getActivity());
//
//        ustdToCoin= ApiUtils.getAPIService();
//        ustdToCoin.getCoinWithType("USDT").enqueue(new Callback<Collective_Coin_Body>() {
//            @Override
//            public void onResponse(Call<Collective_Coin_Body> call, Response<Collective_Coin_Body> response) {
//                usdt_response=response.body();
//                result_USDresponse=usdt_response.getResult();
//                Log.i("result",result_USDresponse.get(1).getKoinIdKoinName());
//
//                usdtAdapter=new ResultAdapter(result_USDresponse);
//                usdcoinRecycler.setLayoutManager(mLayoutManager);
//                usdcoinRecycler.setItemAnimator(new DefaultItemAnimator());
//                usdcoinRecycler.setAdapter(usdtAdapter);
//
//            }
//
//            @Override
//            public void onFailure(Call<Collective_Coin_Body> call, Throwable t) {
//
//            }
//        });

//        Log.i("response",GetRequest(ustdToCoin)+"");
    }
}
