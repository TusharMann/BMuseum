package org.altbeacon.beaconreference;

import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static android.content.Context.MODE_PRIVATE;


public class monolisa_fragment extends Fragment  {


    ImageView imageView;
    Button playvideo;
    TextView content;
    String key1;
   // String content;

    public monolisa_fragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.monolisa_fragment, container, false);
        imageView=(ImageView) view.findViewById(R.id.imageview);
        playvideo=(Button) view.findViewById(R.id.button);
        content=(TextView) view.findViewById(R.id.context);

        RequestQueue requestQueue= Volley.newRequestQueue(getActivity());

//        StringRequest request=new StringRequest(Request.Method.GET, "http://192.168.43.11:1337/api4app/kohinoor", new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//               // Toast.makeText(getActivity(),"Response"+response,Toast.LENGTH_LONG).show();
//
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Toast.makeText(getActivity(),"Error"+error.getMessage(),Toast.LENGTH_LONG).show();
//            }
//        });
//
//        requestQueue.add(request);

        JsonArrayRequest jsonObjectRequest=new JsonArrayRequest(Request.Method.GET, "http://192.168.43.11:1337/api4app/monalisa",null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        try {
                           // textView.setText("Entered");

                            SharedPreferences prefs = getActivity().getSharedPreferences("select", MODE_PRIVATE);
                            String lang=prefs.getString("language",null);
                            Log.e("text",lang);


                            JSONObject ob = response.getJSONObject(0);

                            JSONArray jsonArray = ob.getJSONArray("result");
                            for(int i=0;i<jsonArray.length();i++) {
                                JSONObject result = jsonArray.getJSONObject(i);
                                String language = result.getString("language");
                                if (language.equals(lang)) {
                                    Log.e("data1", language);


                                    String key = result.getString("key");
                                    key1 = key;
                                    String image = result.getString("image");
                                    String context = result.getString("context");
                                    content.setText(context);

                                    //  Toast.makeText(getActivity(),context,Toast.LENGTH_LONG).show();
                                    //textView.setText(context);
//                                    Picasso.with(getActivity())
//                                            .load(image)
//                                            .into(imageView);
//                                    Log.e("Data", context);
                                    // break;


                                    // Toast.makeText(getActivity(),context,Toast.LENGTH_LONG).show();
                                }
                            }


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //textView.setText("error");
            }
        });

        requestQueue.add(jsonObjectRequest);



        playvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.youtube.com/watch?v="+key1;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });


//        Call<JsonObject> jsonObject = ApiClient.getInterface().getmonalisa();
//        Log.i("Data ",jsonObject.toString());
//
//        jsonObject.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                JsonObject jsonObject1 = response.body();
//
//                for (int i = 0; i < jsonObject1.getArrayList().size(); i++)
//                 //   movieList.add(jsonObject1.getMovieList().get(i));
//
//                Log.i("Data coming ", String.valueOf(jsonObject1.getArrayList().size()));
//
//               // adapter.notifyDataSetChanged();
//               // progressDialog.hide();
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                Toast.makeText(getActivity(), "Check your internet connection", Toast.LENGTH_LONG).show();
//
//            }
//        });


        return view;
    }

}
