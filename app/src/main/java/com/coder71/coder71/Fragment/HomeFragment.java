package com.coder71.coder71.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.coder71.coder71ltd.R;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;



import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    CardView ServiceCardView, ProductsCardView, PortfolioCardView, ClientsCardView;
    ImageSlider imageSlider;


    private final static String LONG_TEXT = "Coder71 Ltd. is an established web development company delivering web development services of any complexity to " +
            "clients worldwide. Being in IT business for over some years now we have a strong team of skilled experienced IT" +
            " experts.Our customers are companies of all sizes ranging from startups to large enterprises who realize that they need " +
            "a professional internet solution to generate revenue streams establish communication channels or streamline business" +
            " operations.";

    private final static String SHORT_TEXT = "Coder71 Ltd. is an established web development company delivering web development services of any complexity to" +
            "clients worldwide. Being in IT business for over some years now we have a strong team of skilled experienced IT...";


    private boolean flags = true;
    TextView TextField, expended_text;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        TextField = view.findViewById(R.id.about_text_field);
        expended_text = view.findViewById(R.id.expended_text);
        TextField.setText(SHORT_TEXT);
        expended_text.setText("See more");

        expended_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flags) {
                    TextField.setText(LONG_TEXT);
                    expended_text.setText("See less");
                    flags = false;
                } else {
                    TextField.setText(SHORT_TEXT);
                    flags = true;
                    expended_text.setText("See more");
                }


            }
        });


        //CardViewHooks

        ServiceCardView = view.findViewById(R.id.OurServiceId);
        ProductsCardView = view.findViewById(R.id.ProductsId);
        PortfolioCardView = view.findViewById(R.id.PortfolioId);
        ClientsCardView = view.findViewById(R.id.ClientsId);


        //CardViewSet

        ServiceCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OurServicesFragment ourServicesFragment = new OurServicesFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, ourServicesFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        ProductsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OurProductsFragment ourProductsFragment = new OurProductsFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, ourProductsFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        PortfolioCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PortfolioFragment portfolioFragment = new PortfolioFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, portfolioFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        ClientsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClientsFragment clientsFragment = new ClientsFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, clientsFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        //Slider
        imageSlider = view.findViewById(R.id.image_slider);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.image1, ""));
        slideModels.add(new SlideModel(R.drawable.image2, ""));
        imageSlider.setImageList(slideModels, false);


        return view;

    }
}