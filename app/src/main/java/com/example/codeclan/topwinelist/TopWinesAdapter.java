package com.example.codeclan.topwinelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by katarinazemplenyiova on 19/12/2017.
 */

public class TopWinesAdapter extends ArrayAdapter<Wine> {

    public TopWinesAdapter(Context context, ArrayList<Wine> wines){
        super(context, 0, wines);}


    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.wine_item, parent,false);
        }
        Wine currentWine = getItem(position);

        TextView rank = (TextView) listItemView.findViewById(R.id.rank);
        rank.setText(currentWine.getRank().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentWine.getTitle());

        TextView vintage = (TextView) listItemView.findViewById(R.id.vintage);
        vintage.setText(currentWine.getVintage().toString());

        listItemView.setTag(currentWine);

        return listItemView;


    }
}

