package com.example.garden;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class AdBanner_1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.ad_banner1,container,false);

        return rootView;
    }
}
