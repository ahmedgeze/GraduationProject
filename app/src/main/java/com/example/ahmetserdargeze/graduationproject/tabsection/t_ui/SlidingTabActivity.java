package com.example.ahmetserdargeze.graduationproject.tabsection.t_ui;

/**
 * Created by ahmetserdargeze on 16.04.2018.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.ahmetserdargeze.graduationproject.tabsection.coin_models.Collective_Coin_Body;
import com.example.ahmetserdargeze.graduationproject.tabsection.coin_models.Collective_Coin_Result;
import com.example.ahmetserdargeze.graduationproject.tabsection.retrofit.APIService;
import com.example.ahmetserdargeze.graduationproject.tabsection.retrofit.ApiUtils;
import com.example.ahmetserdargeze.graduationproject.tabsection.rv.ResultAdapter;
import com.example.ahmetserdargeze.graduationproject.tabsection.t_utils.ViewFindUtils;
import com.example.ahmetserdargeze.graduationproject.R;
import com.flyco.tablayout.SlidingTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SlidingTabActivity extends AppCompatActivity implements OnTabSelectListener {
    private Context mContext = this;
    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private final String[] mTitles = {
           "USDT","BTC","ETH"
    };

    private final String[] cardViewTitles = {
            "Coin","Price","Volume","Change",
    };
    private MyPagerAdapter mAdapter;




    /*usdt fragment*/
    public Collective_Coin_Body usdt_response=new Collective_Coin_Body();
    public ArrayList<Collective_Coin_Result> result_USDresponse=new ArrayList<>();
    public RecyclerView usdcoinRecycler;
    RecyclerView.LayoutManager mLayoutManager;
    public ResultAdapter usdtAdapter;
    public APIService ustdToCoin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sliding_tab_activity);

        ustdToCoin= ApiUtils.getAPIService();
        ustdToCoin.getCoinWithType("USDT").enqueue(new Callback<Collective_Coin_Body>() {
            @Override
            public void onResponse(Call<Collective_Coin_Body> call, Response<Collective_Coin_Body> response) {
                usdt_response=response.body();
                result_USDresponse=usdt_response.getResult();
                Log.i("MESAJ",result_USDresponse.toString());
            }

            @Override
            public void onFailure(Call<Collective_Coin_Body> call, Throwable t) {

            }
        });




        for (int i=0;i<mTitles.length;i++){
            if (mTitles[i]=="USDT")
                mFragments.add(Usdt_fragment.getInstance(mTitles[i]));
            else if(mTitles[i]=="BTC")
                mFragments.add(Btc_fragment.getInstance(mTitles[i]));
            else if(mTitles[i]=="ETH")
                mFragments.add(Eth_fragment.getInstance(mTitles[i]));


        }




        View decorView = getWindow().getDecorView();
        ViewPager vp = ViewFindUtils.find(decorView, R.id.vp);
        mAdapter = new MyPagerAdapter(getSupportFragmentManager());
        vp.setAdapter(mAdapter);


        SlidingTabLayout tabLayout_8 = ViewFindUtils.find(decorView, R.id.tl_8);
        tabLayout_8.setTabSpaceEqual(true);




        tabLayout_8.setViewPager(vp);
        tabLayout_8.setOnTabSelectListener(this);

        vp.setCurrentItem(0);





    }


    @Override
    public void onTabSelect(int position) {
        Toast.makeText(mContext, "onTabSelect&position--->" + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTabReselect(int position) {
        Toast.makeText(mContext, "onTabReselect&position--->" + position, Toast.LENGTH_SHORT).show();
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles[position];
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }
    }

    class PagerAdapter extends FragmentPagerAdapter{
        


        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return null;
        }

        @Override
        public int getCount() {
            return 0;
        }
    }
}
