package com.example.ahmetserdargeze.graduationproject.tabsection.coin_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by ahmetserdargeze on 16.04.2018.
 */

public class Collective_Coin_Body {
    @SerializedName("messages")
    @Expose
    public Boolean messages;
    @SerializedName("result")
    @Expose
    public ArrayList<Collective_Coin_Result> result = null;





    public Boolean getMessages() {
        return messages;
    }

    public void setMessages(Boolean messages) {
        this.messages = messages;
    }

    public ArrayList<Collective_Coin_Result> getResult() {
        return result;
    }

    public void setResult(ArrayList<Collective_Coin_Result> result) {
        this.result = result;
    }
}
