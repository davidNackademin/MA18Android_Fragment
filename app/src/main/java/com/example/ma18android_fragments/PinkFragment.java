package com.example.ma18android_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PinkFragment extends Fragment {

    public final static String TAG = PinkFragment.class.getSimpleName();

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e(TAG, "oncreateview running");


        View view = inflater.inflate(R.layout.fragment_pink, container, false);
        textView = view.findViewById(R.id.pinkText);

        return view;
    }

    public void setTextInTextView(String text) {
        textView.setText(text);

    }


}
