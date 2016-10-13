package com.arc.sid.timetable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomBaseAdapter extends BaseAdapter {
    private static ArrayList<SearchResults> searchArrayList;

    private LayoutInflater mInflater;

    public CustomBaseAdapter(Context context, ArrayList<SearchResults> results) {
        searchArrayList = results;
        mInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return searchArrayList.size();
    }

    public Object getItem(int position) {
        return searchArrayList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {

//          Display results with format from custom_row_viewer.xml.
            convertView = mInflater.inflate(R.layout.custom_row_viewer, null);
            holder = new ViewHolder();
            holder.txtFaculty= (TextView) convertView.findViewById(R.id.faculty);
            holder.txtPeriodName = (TextView) convertView.findViewById(R.id.periodName);
            holder.txtTiming = (TextView) convertView.findViewById(R.id.timing);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtFaculty.setText(searchArrayList.get(position).getFaculty());
        holder.txtPeriodName.setText(searchArrayList.get(position).getPeriodName());
        holder.txtTiming.setText(searchArrayList.get(position).getTiming());

        return convertView;
    }

    static class ViewHolder {
        TextView txtFaculty;
        TextView txtPeriodName;
        TextView txtTiming;
    }
}