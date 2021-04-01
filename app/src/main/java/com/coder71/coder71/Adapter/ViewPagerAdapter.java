package com.coder71.coder71.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.coder71.coder71.Fragment.PortfolioFragment;
import com.coder71.coder71.PortfolioFragment.CorporateWebsiteFragment;
import com.coder71.coder71.PortfolioFragment.E_commerceWebsiteFragment;
import com.coder71.coder71.PortfolioFragment.LogoDesignFragment;
import com.coder71.coder71.PortfolioFragment.MobileAppsFragment;
import com.coder71.coder71.PortfolioFragment.PortalFragment;
import com.coder71.coder71.PortfolioFragment.WebBasedSoftwareFragment;


public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull PortfolioFragment fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {


        switch (position) {
            case 0:
                return new CorporateWebsiteFragment();
            case 1:
                return new E_commerceWebsiteFragment();
            case 2:
                return new PortalFragment();
            case 3:
                return new WebBasedSoftwareFragment();
            case 4:
                return new MobileAppsFragment();
            default:
                return new LogoDesignFragment();

        }

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
