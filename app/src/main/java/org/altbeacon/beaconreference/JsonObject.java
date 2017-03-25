package org.altbeacon.beaconreference;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Tushar on 24-03-2017.
 */

public class JsonObject {

    int _id;

    public int get_id() {
        return _id;
    }

    public void set_id(int id) {
        this._id = id;
    }

    @SerializedName("result")
    ArrayList<MObject> arrayList;

    public ArrayList<MObject> getArrayList(String result) {
        return arrayList;
    }

    public void setArrayList(ArrayList<MObject> arrayList) {
        this.arrayList = arrayList;
    }


}
