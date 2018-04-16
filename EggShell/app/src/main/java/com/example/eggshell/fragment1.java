package com.example.eggshell;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 박하영 on 2018-04-11.
 */

public class fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootview =(ViewGroup)inflater.inflate(R.layout.fragment_atraction, container , false);
        return  rootview;
 }
}
