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

    public CustomBaseAdapter(Context context, ArrayList<SearchResults> arrayList) {
        searchArrayList = arrayList;
        this.mInflater = LayoutInflater.from(context);
    }

    public int getCount()
    {
        return searchArrayList.size();
    }

    public Object getItem(int paramInt)
    {
        return searchArrayList.get(paramInt);
    }

    public long getItemId(int paramInt)
    {
        return paramInt;
    }

    public View getView(int paramInt, View view, ViewGroup viewGroup)
    {
        if (view == null)
        {
            view = this.mInflater.inflate(2130903071, null);
            viewGroup = new ViewHolder();
            viewGroup.txtPeriodName = ((TextView)view.findViewById(2131427422));
            viewGroup.txtFaculty = ((TextView)view.findViewById(2131427423));
            viewGroup.txtTiming = ((TextView)view.findViewById(2131427424));
            view.setTag(viewGroup);
        }
        for (;;)
        {
            viewGroup.txtPeriodName.setText(((SearchResults)searchArrayList.get(paramInt)).getPeriodName());
            viewGroup.txtFaculty.setText(((SearchResults)searchArrayList.get(paramInt)).getFaculty());
            viewGroup.txtTiming.setText(((SearchResults)searchArrayList.get(paramInt)).getTiming());
            return view;
            viewGroup = (ViewHolder)view.getTag();
        }
    }

    static class ViewHolder
    {
        TextView txtFaculty;
        TextView txtPeriodName;
        TextView txtTiming;
    }
}
