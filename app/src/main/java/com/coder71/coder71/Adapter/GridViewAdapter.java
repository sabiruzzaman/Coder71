package com.coder71.coder71.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.coder71.coder71.model.DataModel;
import com.coder71.coder71ltd.R;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {


    Context context;

    private LayoutInflater layoutInflater;

    ArrayList<DataModel> allItem;

    public GridViewAdapter(Context context, ArrayList<DataModel> allItem) {

        this.context = context;
        this.allItem = allItem;
    }

    @Override
    public int getCount() {
        return allItem.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return allItem.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        DataModel dataModel = allItem.get(position);
        if (convertView == null) {

            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.model_grid, parent, false);
        }
        ImageView imageView = convertView.findViewById(R.id.ImageViewId);
        TextView textView = convertView.findViewById(R.id.textViewId);
        imageView.setImageResource(dataModel.getUrl());
        textView.setText(dataModel.getName());
        return convertView;
    }
}
