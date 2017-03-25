package org.altbeacon.beaconreference;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tushar on 24-03-2017.
 */

public class MObject {

    @SerializedName("language")
    private String  language;

    @SerializedName("key")
    private String key;

    @SerializedName("image")
    private String image;

    @SerializedName("context")
    private String context;



    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getImage() {

        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

   }
