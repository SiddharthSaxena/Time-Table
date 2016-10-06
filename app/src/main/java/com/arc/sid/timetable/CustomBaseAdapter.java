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

    public CustomBaseAdapter(Context paramContext, ArrayList<SearchResults> paramArrayList)
    {
        searchArrayList = paramArrayList;
        this.mInflater = LayoutInflater.from(paramContext);
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

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
        if (paramView == null)
        {
            paramView = this.mInflater.inflate(2130903071, null);
            paramViewGroup = new ViewHolder();
            paramViewGroup.txtPeriodName = ((TextView)paramView.findViewById(2131427422));
            paramViewGroup.txtFaculty = ((TextView)paramView.findViewById(2131427423));
            paramViewGroup.txtTiming = ((TextView)paramView.findViewById(2131427424));
            paramView.setTag(paramViewGroup);
        }
        for (;;)
        {
            paramViewGroup.txtPeriodName.setText(((SearchResults)searchArrayList.get(paramInt)).getPeriodName());
            paramViewGroup.txtFaculty.setText(((SearchResults)searchArrayList.get(paramInt)).getFaculty());
            paramViewGroup.txtTiming.setText(((SearchResults)searchArrayList.get(paramInt)).getTiming());
            return paramView;
            paramViewGroup = (ViewHolder)paramView.getTag();
        }
    }

    static class ViewHolder
    {
        TextView txtFaculty;
        TextView txtPeriodName;
        TextView txtTiming;
    }
}
