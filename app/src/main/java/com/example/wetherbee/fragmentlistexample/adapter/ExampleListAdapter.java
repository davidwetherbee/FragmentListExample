package com.example.wetherbee.fragmentlistexample.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.example.wetherbee.fragmentlistexample.R;

import java.util.List;

/**
 * Created by Wetherbee on 4/17/2015.
 */
public class ExampleListAdapter extends ArrayAdapter {

    private Context context;
    private boolean useList = true;

    public ExampleListAdapter(Context context, List items){
        super(context, android.R.layout.simple_list_item_1, items);
        this.context = context;
    }

    /**
     * Holder for the list items.
     */

    private class ViewHolder{
        TextView titleText;
    }

    /**
     *
     * @param position
     * @param convertView
     * @param parent
     * @return
     */

    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder = null;
        ExampleListItem item = (ExampleListItem)getItem(position);
        View viewToUse = null;


        // This block exists to inflate the settings list item conditionally based on whether
        // we want to support a grid or list view.
        LayoutInflater mInflator = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            if(useList) {
                viewToUse = mInflator.inflate(R.layout.example_list_item, null);
            } else {
                viewToUse = mInflator.inflate(R.layout.example_grid_item, null);

            }
        }
        holder.titleText.setText(item.getItemTitle());
        return viewToUse;
    }
}


