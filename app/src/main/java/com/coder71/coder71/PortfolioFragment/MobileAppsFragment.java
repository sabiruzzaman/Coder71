package com.coder71.coder71.PortfolioFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.coder71.coder71.Adapter.MyAdapter;

import com.coder71.coder71ltd.R;

public class MobileAppsFragment extends Fragment {

    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_portfolio_view, container, false);


        recyclerView = view.findViewById(R.id.TabLayoutListViewId);


        String[] images = new String[]{

               "http://www.coder71.com/upload/album/thumb_cache/c78f896c95d1bf330022ef3d54872037.jpg"

        };

        String[] siteName = new String[]{
                "Bangladesh Film Censor Board"
        };


        String[] siteLink = new String[]{

                  "https://play.google.com/store/apps/details?id=coder71.com.bfcb&hl=en"

        };


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapter myAdapter = new MyAdapter(getContext(), images, siteName, siteLink);
        recyclerView.setAdapter(myAdapter);

        return view;
    }
}