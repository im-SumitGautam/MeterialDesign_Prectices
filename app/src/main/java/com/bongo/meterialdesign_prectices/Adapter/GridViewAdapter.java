package com.bongo.meterialdesign_prectices.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bongo.meterialdesign_prectices.Model.HomeItems;
import com.bongo.meterialdesign_prectices.R;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class GridViewAdapter extends ArrayAdapter {


    public GridViewAdapter(@NonNull Context context, ArrayList<HomeItems> homeItemsArrayList) {
        super(context, 0,homeItemsArrayList);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.home_screen_items, parent, false);
        }
        HomeItems hm=(HomeItems) getItem(position);

        ImageView imageView = (ImageView) listitemView.findViewById(R.id.item_image);
        MaterialTextView textView = (MaterialTextView) listitemView.findViewById(R.id.item_name);

        imageView.setImageResource(hm.getListImage());
        textView.setText(hm.getListName());
        return listitemView;

    }




}
