package com.example.ahmetserdargeze.graduationproject.tabsection.rv;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ahmetserdargeze.graduationproject.R;
import com.example.ahmetserdargeze.graduationproject.tabsection.coin_models.Collective_Coin_Result;

import java.util.ArrayList;

/**
 * Created by ahmetserdargeze on 16.04.2018.
 */

public class ResultAdapter extends RecyclerView.Adapter<SimpleViewHolder>{
    private ArrayList<Collective_Coin_Result> dataSet;

    public ResultAdapter(ArrayList<Collective_Coin_Result> dataSet) {
        this.dataSet = dataSet;
    }

    public void setDataSet(ArrayList<Collective_Coin_Result> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.coin_cardview,parent,false);

        return new SimpleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        Collective_Coin_Result result=dataSet.get(position);
        holder.setData(result,position);

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
