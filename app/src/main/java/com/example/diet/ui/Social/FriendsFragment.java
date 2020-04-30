package com.example.diet.ui.Social;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.diet.R;
import com.example.diet.ui.Social.ui.main.SectionsPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class FriendsFragment extends Fragment {
    View view;

    private RecyclerView friendsList;


    public static FriendsFragment newInstance() {
        FriendsFragment fragment = new FriendsFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            view = inflater.inflate(R.layout.fragment_social_friends, container, false);

            friendsList = (RecyclerView) view.findViewById(R.id.friends_list);

            friendsList.setLayoutManager(new LinearLayoutManager(getContext()));

            return view;
    }

    @Override
    public void onStart(){
        super.onStart();
    }

}
