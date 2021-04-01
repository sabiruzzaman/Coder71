package com.coder71.coder71.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coder71.coder71ltd.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import com.coder71.coder71.Adapter.ViewPagerAdapter;

public class PortfolioFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_protfolio, container, false);

        ViewPager2 viewPager2 = view.findViewById(R.id.viewPager);
        viewPager2.setAdapter(new ViewPagerAdapter(this));

        TabLayout tabLayout = view.findViewById(R.id.tabLayout);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("CORPORATE WEBSITE");
                        break;
                    case 1:
                        tab.setText("E-COMMERCE WEBSITE");
                        break;
                    case 2:
                        tab.setText("PORTAL");
                        break;
                    case 3:
                        tab.setText("WEB BASED SOFTWARE");
                        break;
                    case 4:
                        tab.setText("MOBILE APPS");
                        break;
                    case 5:
                        tab.setText("LOGO DESIGN");
                        break;
                }

            }
        });
        tabLayoutMediator.attach();

        return view;

    }

}