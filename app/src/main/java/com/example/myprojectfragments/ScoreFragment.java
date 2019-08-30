package com.example.myprojectfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ScoreFragment extends Fragment {
    private TextView mScoreView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_score, container, false);
        mScoreView = (TextView) rootView.findViewById(R.id.textView2);
        return rootView;
    }
    //method that takes the value of score from MainActivity2 and updates the textview in scorefragment
    public void updateScore(int score) {
        mScoreView.setText("" +  score);
    }

}
