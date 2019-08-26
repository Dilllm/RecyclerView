package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieHolder> implements Filterable {

    private ArrayList<ModelMovie> listData;
    private ArrayList<ModelMovie> filterdata;

    @NonNull
    @Override

    public MovieHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.raw_list, viewGroup, false);
        return new MovieHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder movieHolder, int i) {
        movieHolder.bindView(filterdata.get(i));


    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    @Override
    public Filter getFilter() {
        return null;
    }

    public class MovieHolder extends RecyclerView.ViewHolder {

        private TextView tvJudul, tvSubJudul;
        private ImageView ivCover, ivLogo;

        public MovieHolder(@NonNull View itemView) {
            super(itemView);

            tvJudul = itemView.findViewById(R.id.tvJudul);
            tvSubJudul = itemView.findViewById(R.id.tvSubJudul);
            ivCover = itemView.findViewById(R.id.ivRaw);
            ivLogo = itemView.findViewById(R.id.ivLogo);
        }


        private void bindView(ModelMovie data){
            tvJudul.setText(data.getJudul());
            tvSubJudul.setText(data.getSubjudul());
            ivCover.setImageReso urce(data.getGambar());
            ivLogo.setImageResource(data.getGambar());
            final String idm = data.getId();

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), DetailMovie.class)
                        .putExtra(DetailMovie.KEY_MOVIE, idm));


                }
            });


        }
    }
}
