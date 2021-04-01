package com.coder71.coder71.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.coder71.coder71ltd.R;
import com.squareup.picasso.Picasso;


public class OurProductsFragment extends Fragment {

    ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_our_products, container, false);


        imageView1 = view.findViewById(R.id.cms_imageId);
        imageView2 = view.findViewById(R.id.news_portal);
        imageView3 = view.findViewById(R.id.job_portal);
        imageView4 = view.findViewById(R.id.ads_portal);
        imageView5 = view.findViewById(R.id.point_of_sales);
        imageView6 = view.findViewById(R.id.accounting);

/*
        String uri1 = "https://www.coder71.com/themes/coder71/assets/images/service-3d-printer.png";
        String uri2 = "https://www.coder71.com/themes/coder71/assets/images/service-6d-printer.png";
        String uri3 = "https://www.coder71.com/themes/coder71/assets/images/service-7d-printer.png";
        String uri4 = "http://coder71.com/upload/album/thumb_cache/981f429f1646ea5e069189cd0de7974a.jpg";
        String uri5 = "https://www.coder71.com/themes/coder71/assets/images/service-4d-printer.png";
        String uri6 = "https://www.coder71.com/themes/coder71/assets/images/service-5d-printer.png";

        Picasso.get().load(uri1).into(imageView1);
        Picasso.get().load(uri2).into(imageView2);
        Picasso.get().load(uri3).into(imageView3);
        Picasso.get().load(uri4).into(imageView4);
        Picasso.get().load(uri5).into(imageView5);
        Picasso.get().load(uri6).into(imageView6);*/


        return view;
    }
}