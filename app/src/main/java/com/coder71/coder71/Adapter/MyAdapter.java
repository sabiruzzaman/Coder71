package com.coder71.coder71.Adapter;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.coder71.coder71ltd.R;
import com.squareup.picasso.Picasso;


public class MyAdapter extends RecyclerView.Adapter<PlaceViewHolder> {

    private final Context context;
    private final String[] images;
    private final String[] siteNames;
    private final String[] siteLink;

    public MyAdapter(Context context, String[] images, String[] siteNames, String[] siteLink) {

        this.context = context;
        this.images = images;
        this.siteNames = siteNames;
        this.siteLink = siteLink;
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.portfolio_view_model, parent, false);
        return new PlaceViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final PlaceViewHolder holder, final int position) {


        holder.itemName.setText(siteNames[position]);
        holder.itemLink.setText(siteLink[position]);
        Picasso.get().load(images[position]).into(holder.itemImage);
       // Picasso.get().load(images.get(position).getImageUrl()).into(holder.itemImage);
        holder.visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context, images[position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(siteLink[holder.getAdapterPosition()]));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }
}

class PlaceViewHolder extends RecyclerView.ViewHolder {

    ImageView itemImage;
    TextView itemName;
    TextView itemLink;
    LinearLayout visit;

    PlaceViewHolder(View itemView) {
        super(itemView);

        itemImage = itemView.findViewById(R.id.itemImageId);
        itemLink = itemView.findViewById(R.id.SiteLinkId);
        itemName = itemView.findViewById(R.id.itemTitleId);
        visit = itemView.findViewById(R.id.SiteID);

    }
}