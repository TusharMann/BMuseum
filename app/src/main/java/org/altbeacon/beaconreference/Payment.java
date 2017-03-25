package org.altbeacon.beaconreference;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import static org.altbeacon.beaconreference.RangingActivity.flag;


public class Payment extends Fragment {

    WebView webView;
    String url="http://120.63.229.222/npticketing/";

    public Payment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment.setVisibility(View.VISIBLE);V

        View view= inflater.inflate(R.layout.fragment_payment, container, false);


        webView=(WebView) view.findViewById(R.id.webview);

        webView.loadUrl(url);



        return view;
    }

    @Override
    public void onStop() {
        flag=true;
        super.onStop();

    }
}
