package com.example.diet.ui.mypage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.diet.R;

public class MypageFragment extends Fragment {
    View view;
    public static MypageFragment newInstance() {
        MypageFragment fragment = new MypageFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_mypage, container, false);
        TextView title = (TextView)view.findViewById(R.id.titlebarText);
        title.setText("Mypage");
        return view;
    }
}
