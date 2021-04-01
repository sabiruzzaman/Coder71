package com.coder71.coder71.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.coder71.coder71.Adapter.GridViewAdapter;
import com.coder71.coder71.model.DataModel;
import com.coder71.coder71ltd.R;

import java.util.ArrayList;

public class ClientsFragment extends Fragment {

    ArrayList<Integer> logo;
    ArrayList<String> clients;

    /* int[] flag = {R.drawable.govt, R.drawable.ambalanews, R.drawable.setara_logo, R.drawable.premiercement,
            R.drawable.wristbands_house_logo, R.drawable.emart_logo, R.drawable.jessoreinfo_logo,
            R.drawable.azadbazar_logo, R.drawable.pulse, R.drawable.ayozon_logo, R.drawable.aba_logo};*/
    // String[] clients;

    GridView gridView;
    ArrayList<DataModel> allItem = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_clients, container, false);


        clients = new ArrayList<>();
        clients.add("Bangladesh Film Censor Board ");
        clients.add("Ambala News");
        clients.add("Setara Farm");
        clients.add("Premier Cement");
        clients.add("Wristbands House");
        clients.add("Emart");
        clients.add("jessoreinfo");
        clients.add("Azadbazar");
        clients.add("Mypulse.com.bd");
        clients.add("Ayozon");
        clients.add("Aba");

        logo = new ArrayList<>();
        logo.add(R.drawable.govt);
        logo.add(R.drawable.ambalanews);
        logo.add(R.drawable.setara_logo);
        logo.add(R.drawable.premiercement);
        logo.add(R.drawable.wristbands_house_logo);
        logo.add(R.drawable.emart_logo);
        logo.add(R.drawable.jessoreinfo_logo);
        logo.add(R.drawable.azadbazar_logo);
        logo.add(R.drawable.pulse);
        logo.add(R.drawable.ayozon_logo);
        logo.add(R.drawable.aba_logo);


        gridView = view.findViewById(R.id.GridViewId);
        // clients = getResources().getStringArray(R.array.Clients);

        GridViewAdapter gridViewAdapter = new GridViewAdapter(getContext(), allItem);
        gridView.setAdapter(gridViewAdapter);

        for (int i = 0; i < logo.size(); i++) {
            DataModel dataModel = new DataModel();
            dataModel.setName(clients.get(i));
            dataModel.setUrl(logo.get(i));
            allItem.add(dataModel);
        }

        gridViewAdapter.notifyDataSetChanged();
        return view;

    }

}