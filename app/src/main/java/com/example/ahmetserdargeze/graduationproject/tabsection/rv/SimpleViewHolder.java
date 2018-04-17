package com.example.ahmetserdargeze.graduationproject.tabsection.rv;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.ahmetserdargeze.graduationproject.R;

import com.example.ahmetserdargeze.graduationproject.tabsection.coin_models.Collective_Coin_Result;

import java.util.ArrayList;

/**
 * Created by ahmetserdargeze on 16.04.2018.
 */

public class SimpleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private Context context;
    ImageView coin_pic,alarm,add_fav,go_to_chart;
    TextView coin_name,coin_price,volume,change;
    LinearLayout parent,child;



    public SimpleViewHolder(View itemView) {
        super(itemView);
        context=itemView.getContext();

        coin_pic=(ImageView) itemView.findViewById(R.id.coin_pic);
        alarm=(ImageView) itemView.findViewById(R.id.alarm);
        coin_name=(TextView) itemView.findViewById(R.id.coin_name);
        coin_price=(TextView) itemView.findViewById(R.id.coin_price);
        volume=(TextView) itemView.findViewById(R.id.volume);
        change=(TextView) itemView.findViewById(R.id.change);

        add_fav=(ImageView) itemView.findViewById(R.id.add_fav);
        go_to_chart=(ImageView) itemView.findViewById(R.id.go_to_chart);

        parent=(LinearLayout) itemView.findViewById(R.id.parentLL);
        child=(LinearLayout) itemView.findViewById(R.id.rv_child_items);

        for(int i=0;i<90;i++){
//            chart.setPadding(0,20,0,20);
//            chart.setBackground(ContextCompat.getDrawable(context,R.color.toolbar_bg));
            parent.setOnClickListener(this);

        }
    }

    public void setData(Collective_Coin_Result clickedObject,int position){

        this.coin_name.setText(clickedObject.getKoinIdKoinName()+"");
        this.coin_price.setText(clickedObject.getLast()+"");
        this.change.setText(clickedObject.getChange()+"");
        this.volume.setText(clickedObject.getVolume()+"");
        this.coin_pic.setImageResource(R.drawable.btc_t);
        this.alarm.setImageResource(R.drawable.alarm_new);
        this.child.setVisibility(View.GONE);



    }

    @Override
    public void onClick(View v) {
        Log.i("visibled","görünür oldu");

        if(v.getId()==R.id.parentLL){
            if(child.getVisibility()==View.VISIBLE){
                child.setVisibility(View.GONE);
                Log.i("visibled"," oldu");

            }
            else {
                child.setVisibility(View.VISIBLE);
                Log.i("visibled","görünür oldu");

            }

        }



    }
}
