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


public class E_commerceWebsiteFragment extends Fragment {

    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_portfolio_view, container, false);


        recyclerView = view.findViewById(R.id.TabLayoutListViewId);


        String[] images = new String[]{

                "http://www.coder71.com/upload/album/thumb_cache/41eec7cf47b45e841830a00da822c71c.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/9d800f420401ce43a9a28fe8a8e2e5b7.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/9116193821aca05b50a11de047746a67.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/b5641ef89ba87a9f1a7049137d865a85.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/68066f7ddaf9c3de08997503e759e593.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/ab2f716c86499d3ec79dbadd761d4679.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/74a1dd676bee3a5fb7a00da4d86968bb.jpg",
                /*
                R.drawable.panasiabd_com, R.drawable.korbazar_com, R.drawable.handset_com, R.drawable.setarafarm_com,
                R.drawable.emart, R.drawable.fashionstylebd, R.drawable.toys4all*/
        };

        String[] siteName = new String[]{
                "Panasiabd.com",
                "korbazar.com",
                "Azadbazar.af",
                "Handset.com.bd",
                "Setarafarm.com",
                "Emart",
                "Fashionstylebd",
        };

        String[] siteLink = new String[]{

                "http://www.panasiabd.com/",
                "https://korbazar.com/search/result.jsp",
                "https://www.azadbazar.af/search/result.jsp",
                "http://handset.com.bd/",
                "http://www.setarafarm.com/",
                "https://www.emartway.com.bd",
                "http://fashionstylebd.com/"

        };


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapter myAdapter = new MyAdapter(getContext(), images, siteName, siteLink);
        recyclerView.setAdapter(myAdapter);

        return view;
    }
}