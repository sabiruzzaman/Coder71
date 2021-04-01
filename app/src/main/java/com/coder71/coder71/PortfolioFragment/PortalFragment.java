package com.coder71.coder71.PortfolioFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coder71.coder71.Adapter.MyAdapter;

import com.coder71.coder71ltd.R;


public class PortalFragment extends Fragment {
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_portfolio_view, container, false);


        recyclerView = view.findViewById(R.id.TabLayoutListViewId);


        String[] images = new String[]{
                "http://www.coder71.com/upload/album/thumb_cache/5c2eb4c3af0afbae39956067cfabbfd8.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/dd078187c543a48e6c6b36459abd6cbc.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/4119f31a3c9caf4542c8d2aba48173f2.jpg"
        };

        String[] siteName = new String[]{
                "Eibela",
                "Ambalanews24",
                "Kopotakkhonews24"
        };

        String[] siteLink = new String[]{

                "https://eibela.com/",
                "http://ambalanews24.com/",
                "http://kopotakkhonews24.com/"

        };


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapter myAdapter = new MyAdapter(getContext(), images, siteName, siteLink);
        recyclerView.setAdapter(myAdapter);

        return view;
    }
}