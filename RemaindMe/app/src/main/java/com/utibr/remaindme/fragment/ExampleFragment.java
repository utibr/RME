package com.utibr.remaindme.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.utibr.remaindme.R;

/**
 * Created by Evgen True on 09.07.2017.
 */

public class ExampleFragment extends Fragment {
    private static  final  int Layout = R.layout.fragment_example;

    private View view;

    public static ExampleFragment getInstance (){
        Bundle args = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(Layout,container, false);
        return view;
    }
}
