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

public class CorporateWebsiteFragment extends Fragment {

    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_portfolio_view, container, false);
        recyclerView = view.findViewById(R.id.TabLayoutListViewId);


        String[] images = new String[]{

                "http://www.coder71.com/upload/album/thumb_cache/414961d9c3ba7be278c65b82d3bfb46d.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/a12005b09d851dc8985a48bf16fb0419.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/6836ccb20096b693c03f8caf850a711e.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/0f0ee5b1a125cefb31c7aea3382e7020.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/54aae3473df4e9f210f3d11252543415.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/981f429f1646ea5e069189cd0de7974a.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/045061721a3cb40468f6618b724062c8.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/8b6e6444ec955de295514a2770d7a363.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/7c40f623276f77496c2583b41ca164b2.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/5643e6679a3546823a410bd503115460.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/5c323abbd613a0d997b0f0559e37a84a.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/c652d41578ff10018e57b473f5149ef3.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/6d5758a939c6d7318a97ecd89d9038a5.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/e8d3141dd1812f5f11c53979679c7d42.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/3adb1fa572c0b0999ac0b311de4f4e2e.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/1211b4435c3b30ccb8f5cee76ef808ab.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/7cce453791b1f3263324a4ae3dd7faff.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/637befd1e0997160ac325c8ce617cb37.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/c00ca3c24afea03e4d8ae557cd2c1a54.jpg",
                "http://www.coder71.com/upload/album/thumb_cache/7762ded6f882ea22dbde81dec172df41.jpg"


                /*R.drawable.premier_cement, R.drawable.ihdbd, R.drawable.bmjp, R.drawable.jessore,
                R.drawable.bamiyanculturalcentre, R.drawable.acbar_org, R.drawable.ambalatender, R.drawable.jessore2,
                R.drawable.technoapogee, R.drawable.prdesh, R.drawable.amaderlink, R.drawable.photoprintbd,
                R.drawable.narikelbariacollege, R.drawable.nationaltraining, R.drawable.photoeditexperts,
                R.drawable.space_edge, R.drawable.mbl_bd, R.drawable.decorbymadiha, R.drawable.partnerchai,
                R.drawable.mypulse, R.drawable.ayozon, R.drawable.simcha,
                R.drawable.westacademy, R.drawable.lifeinsuranceabro, R.drawable.abagroupbd
                */
        };


        String[] siteName = new String[]{
                "Premier Cement",
                "Ihdbd.org",
                "Bmjp.org",
                "jessore.info",
                "Bamiyanculturalcentre.org",
                "Acbar.org",
                "Ambalatender.com",
                "jessore.info",
                "Technoapogee.com",
                "Prdesh.com",
                "Photoprintbd.com",
                "Nationaltraininggb.com",
                "Space-edge.com",
                "Mbl-bd.com",
                "Decorbymadiha.com",
                "Partnerchai.com",
                "Mypulse.com.bd",
                "Ayozon.com.bd",
                "Lifeinsuranceabroad.com",
                "Abagroupbd"
        };

        String[] siteLink = new String[]{

                "http://www.premiercement.com/",
                "http://ihdbd.org/",
                "http://www.bmjp.org/",
                "http://directory.jessore.info/",
                "http://bamiyanculturalcentre.org/",
                "http://www.acbar.org/",
                "http://ambalatender.com/",
                "http://jessore.info/",
                "http://technoapogee.com/",
                "http://prdesh.com/",
                "http://photoprintbd.com/",
                "https://nationaltraininggb.com/",
                "http://space-edge.com/",
                "http://mbl-bd.com/",
                "http://decorbymadiha.com/",
                "http://partnerchai.com/",
                "http://mypulse.com.bd/",
                "http://ayozon.com.bd/",
                "https://lifeinsuranceabroad.com/",
                "http://abagroupbd.com/",


        };


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapter myAdapter = new MyAdapter(getContext(), images, siteName, siteLink);
        recyclerView.setAdapter(myAdapter);

        return view;
    }
}