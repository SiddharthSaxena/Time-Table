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

public class Thursday
        extends AppCompatActivity
{
    private ArrayList<SearchResults> GetSearchResults()
    {
        ArrayList localArrayList = new ArrayList();
        SearchResults localSearchResults = new SearchResults();
        localSearchResults.setPeriodName("Data Communication and Networking Lab");
        localSearchResults.setFaculty("Mr. Davender Banga");
        localSearchResults.setTiming("8:30 am - 10:05 am");
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
        localSearchResults.setPeriodName("VLSI Design");
        localSearchResults.setFaculty("Dr. Rajiv Sharma");
        localSearchResults.setTiming("11:30 am - 12:25 pm");
        localArrayList.add(localSearchResults);
        localSearchResults = new SearchResults();
        localSearchResults.setPeriodName("Digital Signal Processing");
        localSearchResults.setFaculty("Mr. Surender Dhiman");
        localSearchResults.setTiming("12:25 pm - 1:20 pm");
        localArrayList.add(localSearchResults);
        localSearchResults = new SearchResults();
        localSearchResults.setPeriodName("Information Theory and Coding");
        localSearchResults.setFaculty("Mr. Kamal Singh");
        localSearchResults.setTiming("1:20 pm - 2:15 pm");
        localArrayList.add(localSearchResults);
        localSearchResults = new SearchResults();
        localSearchResults.setPeriodName("Data Communication and Networking");
        localSearchResults.setFaculty("Mr. Davender Banga");
        localSearchResults.setTiming("2:15 pm - 3:10 pm");
        localArrayList.add(localSearchResults);
        return localArrayList;
    }

    public void onCreate(Bundle paramBundle)
    {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_thursday);
        paramBundle = GetSearchResults();
        final Object localObject = (ListView)findViewById(2131427417);
        ((ListView)localObject).setAdapter(new CustomBaseAdapter(this, paramBundle));
        ((ListView)localObject).setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
            {
                paramAnonymousAdapterView = (SearchResults)localObject.getItemAtPosition(paramAnonymousInt);
                Toast.makeText(Thursday.this, "Period :  " + paramAnonymousAdapterView.getPeriodName() + "\nLecturer : " + " " + paramAnonymousAdapterView.getFaculty() + "\nTimings : " + " " + paramAnonymousAdapterView.getTiming(), 1).show();
            }
        });
        paramBundle = (AlarmManager)getSystemService("alarm");
        localObject = PendingIntent.getBroadcast(this, 0, new Intent(this, ThursdayNotificationService.class), 0);
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
