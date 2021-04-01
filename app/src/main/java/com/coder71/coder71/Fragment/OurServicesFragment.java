package com.coder71.coder71.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coder71.coder71.Adapter.ServiceHelperAdapter;
import com.coder71.coder71.Data.OurServiceData;

import com.coder71.coder71ltd.R;

import java.util.ArrayList;

public class OurServicesFragment extends Fragment {


    RecyclerView recyclerView;
    ArrayList image, name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_our_services, container, false);
        image = new ArrayList();
        name = new ArrayList();

        for (int i = 0; i < OurServiceData.names.length; i++) {
            image.add(image);
            name.add(name);


        }
        recyclerView = view.findViewById(R.id.listRecyclerViewId);
        ServiceHelperAdapter helperAdapter = new ServiceHelperAdapter(getContext(), image, name);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(helperAdapter);


        return view;
    }
}