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


public class LogoDesignFragment extends Fragment {

    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_portfolio_view, container, false);


        recyclerView = view.findViewById(R.id.TabLayoutListViewId);


        String[] images = new String[]{

                "http://www.coder71.com/upload/album/thumb_cache/711782bf9ffe966a72f7dd908583ecdf.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/757e996d9e23dde4cf39c9cd1655cc8e.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/200eed660822faf6704993509ad2229a.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/f1950770c3871962122784927145177c.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/44e0465a18488a88c00fbd8273c4b2c9.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/69c93d5bf0c90d54e447aa68b8a4db5b.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/95f3a24e051d38651cd1be62015e98fc.jpg"
                /*
                R.drawable.learn_more_academy, R.drawable.canary_wharf_academy, R.drawable.decorbymadiha, R.drawable.toys4all_g,
                R.drawable.partnerchai_logo, R.drawable.west_academy_logo, R.drawable.photoprint_logo*/

        };

        String[] siteName = new String[]{
                "Learn more Academy",
                "Canary Wharf Academy",
                "Decorbymadiha",
                "Toys4all",
                "Partnerchai logo",
                "West Academy logo",
                "Photoprint logo"
        };

        String[] siteLink = new String[]{

                "https://www.learnmoreacademy.co.uk/",
                "https://www.canarywharfacademy.co.uk/",
                "http://decorbymadiha.com/",
                "http://www.toys4allbd.com/",
                "http://partnerchai.com/",
                "https://www.westacademy.co.uk/",
                "http://photoprintbd.com/",

        };


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapter myAdapter = new MyAdapter(getContext(), images, siteName, siteLink);
        recyclerView.setAdapter(myAdapter);

        return view;
    }
}