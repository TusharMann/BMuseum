package org.altbeacon.beaconreference;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Tushar on 14-10-2016.
 */
public class ApiClient {

    private static ApiClientInterface mService;

    public static ApiClientInterface getInterface() {
        if (mService == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.43.11:1337/api4app/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            mService = retrofit.create(ApiClientInterface.class);
        }
        return mService;
    }
}
