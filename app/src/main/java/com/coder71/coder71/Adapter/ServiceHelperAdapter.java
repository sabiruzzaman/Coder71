package com.coder71.coder71.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.coder71.coder71.Data.OurServiceData;
import com.coder71.coder71ltd.R;

import java.util.ArrayList;

public class ServiceHelperAdapter extends RecyclerView.Adapter {

    static Context context;
    ArrayList arrayList, arrayListName;

    public ServiceHelperAdapter(Context context, ArrayList arrayList, ArrayList arrayListName) {
        this.context = context;
        this.arrayList = arrayList;
        this.arrayListName = arrayListName;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.service_item_model, parent, false);
        return new ViewHolderClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {

        ViewHolderClass viewHolderClass = (ViewHolderClass) holder;
        viewHolderClass.imageView.setImageResource(OurServiceData.images[position]);
        viewHolderClass.textView.setText(OurServiceData.names[position]);
        viewHolderClass.description.setText(OurServiceData.description[position]);


    }

    @Override
    public int getItemCount() {
        return arrayListName.size();
    }

    public static class ViewHolderClass extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        TextView description;

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.itemTitle);
            imageView = itemView.findViewById(R.id.itemImage);
            description = itemView.findViewById(R.id.itemDescription);


        }
    }
}
