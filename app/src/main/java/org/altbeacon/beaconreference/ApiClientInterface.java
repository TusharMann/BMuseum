package org.altbeacon.beaconreference;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Tushar on 14-10-2016.
 */
public interface ApiClientInterface {

    @GET("kohinoor")
    Call<JsonObject> getkohinoor();

    @GET("allanhills")
    Call<JsonObject> getallanhills();

    @GET("monalisa")
    Call<JsonObject> getmonalisa();

}
