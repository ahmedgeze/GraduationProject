package com.example.ahmetserdargeze.graduationproject.tabsection.retrofit;

import com.example.ahmetserdargeze.graduationproject.tabsection.coin_models.Collective_Coin_Body;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by ahmetserdargeze on 16.04.2018.
 */

public interface APIService {
//    @POST("register/")
//    @FormUrlEncoded
//    Call<RegisterationPojo> saveUser(
//            @Field("username") String username,
//            @Field("email")    String email,
//            @Field("password") String password,
//            @Field("confirm_password") String confirm_password);


    @GET("returnTop25")
    Call<Collective_Coin_Body> getTop25();

    @GET("top25/{kur_type}/")
    Call<Collective_Coin_Body> getCoinWithType(@Path("kur_type") String kur_type);


//    @GET("graphic/{kur_type}/{koin_type}")
//    Call<Real_graphic_data> getRealTimePrice(@Path("kur_type") String kur_type, @Path("koin_type") String koin_type);
//
//    @GET("getCoin/{kur_type}/{koin_type}/")
//    Call<SingleCoinBody> getSingleCoin(@Path("kur_type") String kur_type, @Path("koin_type") String koin_type);
}
