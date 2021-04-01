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


public class WebBasedSoftwareFragment extends Fragment {
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_portfolio_view, container, false);


        recyclerView = view.findViewById(R.id.TabLayoutListViewId);


        String[] images = new String[]{
                "http://www.coder71.com/upload/album/thumb_cache/576276675d01149d23d2b63504a513bf.jpg"
        };


        String[] siteName = new String[]{
                "Order-Kit"
        };

        String[] siteLink = new String[]{

                "http://order-kit.com/new-order-kit/site/login"

        };


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapter myAdapter = new MyAdapter(getContext(), images, siteName, siteLink);
        recyclerView.setAdapter(myAdapter);

        return view;
    }
}