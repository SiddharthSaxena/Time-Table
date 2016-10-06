package com.arc.sid.timetable;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class Friday
        extends AppCompatActivity
{
    private ArrayList<SearchResults> GetSearchResults()
    {
        ArrayList localArrayList = new ArrayList();
        SearchResults localSearchResults = new SearchResults();
        localSearchResults.setPeriodName("VLSI Design");
        localSearchResults.setFaculty("Dr. Rajiv Sharma");
        localSearchResults.setTiming("8:30 am - 9:10 am");
        localArrayList.add(localSearchResults);
        localSearchResults = new SearchResults();
        localSearchResults.setPeriodName("Microwave Engineering");
        localSearchResults.setFaculty("Mr. Devraj Gautam");
        localSearchResults.setTiming("9:10 am - 10:05 am");
        localArrayList.add(localSearchResults);
        localSearchResults = new SearchResults();
        localSearchResults.setPeriodName("Antenna and Wave Propagation");
        localSearchResults.setFaculty("Mrs. Medha Hooda");
        localSearchResults.setTiming("10:05 am - 11:00 am");
        localArrayList.add(localSearchResults);
        localSearchResults = new SearchResults();
        localSearchResults.setPeriodName("Lunch Break");
        localSearchResults.setFaculty("Break");
        localSearchResults.setTiming("11:00 am - 11:30 am");
        localArrayList.add(localSearchResults);
        localSearchResults = new SearchResults();
        localSearchResults.setPeriodName("Information Theory and Coding");
        localSearchResults.setFaculty("Mr. Kamal Singh");
        localSearchResults.setTiming("11:30 am - 12:25 pm");
        localArrayList.add(localSearchResults);
        localSearchResults = new SearchResults();
        localSearchResults.setPeriodName("Digital Signal Processing");
        localSearchResults.setFaculty("Dr. Surender Dhiman");
        localSearchResults.setTiming("12:25 pm - 1:20 pm");
        localArrayList.add(localSearchResults);
        localSearchResults = new SearchResults();
        localSearchResults.setPeriodName("VLSI Design Lab");
        localSearchResults.setFaculty("Dr. Rajiv Sharma\nMr. Joginder");
        localSearchResults.setTiming("1:20 pm - 3:10 pm");
        localArrayList.add(localSearchResults);
        return localArrayList;
    }

    public void onCreate(Bundle paramBundle)
    {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_friday);
        paramBundle = GetSearchResults();
        final Object localObject = (ListView)findViewById(2131427408);
        ((ListView)localObject).setAdapter(new CustomBaseAdapter(this, paramBundle));
        ((ListView)localObject).setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
            {
                paramAnonymousAdapterView = (SearchResults)localObject.getItemAtPosition(paramAnonymousInt);
                Toast.makeText(Friday.this, "Period :  " + paramAnonymousAdapterView.getPeriodName() + "\nLecturer : " + " " + paramAnonymousAdapterView.getFaculty() + "\nTimings : " + " " + paramAnonymousAdapterView.getTiming(), 1).show();
            }
        });
        paramBundle = (AlarmManager)getSystemService("alarm");
        localObject = PendingIntent.getBroadcast(this, 0, new Intent(this, FridayNotificationService.class), 0);
        paramBundle.set(1, Calendar.getInstance().getTimeInMillis() + 30000L, (PendingIntent)localObject);
    }

    public boolean onCreateOptionsMenu(Menu paramMenu)
    {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem paramMenuItem)
    {
        if (paramMenuItem.getItemId() == 2131427438) {
            return true;
        }
        return super.onOptionsItemSelected(paramMenuItem);
    }
}