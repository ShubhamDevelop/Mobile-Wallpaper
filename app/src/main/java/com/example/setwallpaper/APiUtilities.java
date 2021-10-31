package com.example.setwallpaper;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APiUtilities {

    private static  Retrofit retrofit=null;
    public static final String API="563492ad6f9170000100000141fe12d2b3734b23bfdb24e1af66bddc";

    public static ApiInterface getApiInterface()
    {
        if(retrofit==null)
        {
            retrofit=new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }

        return retrofit.create(ApiInterface.class);
    }



}
