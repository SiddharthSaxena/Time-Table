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

public class Tuesday
        extends AppCompatActivity
{
    private ArrayList<SearchResults> GetSearchResults()
    {
        ArrayList localArrayList = new ArrayList();
        SearchResults localSearchResults = new SearchResults();
        localSearchResults.setPeriodName("Data Communication and Networking");
        localSearchResults.setFaculty("Mr. Davender Banga");
        localSearchResults.setTiming("8:30 am - 9:10 am");
        localArrayList.add(localSearchResults);
        localSearchResults = new SearchResults();
        localSearchResults.setPeriodName("Microwave Engineering");
        localSearchResults.setFaculty("Mr. Devraj Gautam");
        localSearchResults.setTiming("9:10 am - 10:05 am");
        localArrayList.add(localSearchResults);
        localSearchResults = new SearchResults();
        localSearchResults.setPeriodName("VLSI Design");
        localSearchResults.setFaculty("Dr. Rajiv Sharma");
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
        localSearchResults.setPeriodName("Antenna and Wave Propagation");
        localSearchResults.setFaculty("Mrs. Medha Hooda");
        localSearchResults.setTiming("12:25 pm - 1:20 pm");
        localArrayList.add(localSearchResults);
        localSearchResults = new SearchResults();
        localSearchResults.setPeriodName("Digital Signal Processing Lab");
        localSearchResults.setFaculty("Dr. Surender Dhiman\nMr. Deepak Vats");
        localSearchResults.setTiming("1:20 pm - 3:10 pm");
        localArrayList.add(localSearchResults);
        return localArrayList;
    }

    public void onCreate(Bundle paramBundle)
    {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_tuesday);
        paramBundle = GetSearchResults();
        final Object localObject1 = (ListView)findViewById(2131427419);
        ((ListView)localObject1).setAdapter(new CustomBaseAdapter(this, paramBundle));
        ((ListView)localObject1).setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
            {
                paramAnonymousAdapterView = (SearchResults)localObject1.getItemAtPosition(paramAnonymousInt);
                Toast.makeText(Tuesday.this, "Period :  " + paramAnonymousAdapterView.getPeriodName() + "\nLecturer : " + " " + paramAnonymousAdapterView.getFaculty() + "\nTimings : " + " " + paramAnonymousAdapterView.getTiming(), 1).show();
            }
        });
        paramBundle = (AlarmManager)getSystemService("alarm");
        localObject1 = Calendar.getInstance();
        ((Calendar)localObject1).setTimeInMillis(System.currentTimeMillis());
        Object localObject2 = new Intent(this, TuesdayNotificationService.class);
        ((Intent)localObject2).setAction("FirstPeriod");
        localObject2 = PendingIntent.getBroadcast(this, 100, (Intent)localObject2, 134217728);
        ((Calendar)localObject1).set(2016, 3, 26, 8, 10, 0);
        paramBundle.set(0, ((Calendar)localObject1).getTimeInMillis(), (PendingIntent)localObject2);
        paramBundle.setRepeating(0, ((Calendar)localObject1).getTimeInMillis(), 604800000L, (PendingIntent)localObject2);
        localObject2 = new Intent(this, TuesdayNotificationService.class);
        ((Intent)localObject2).setAction("SecondPeriod");
        localObject2 = PendingIntent.getBroadcast(this, 101, (Intent)localObject2, 134217728);
        ((Calendar)localObject1).set(2016, 3, 26, 9, 5, 0);
        paramBundle.set(0, ((Calendar)localObject1).getTimeInMillis(), (PendingIntent)localObject2);
        paramBundle.setRepeating(0, ((Calendar)localObject1).getTimeInMillis(), 604800000L, (PendingIntent)localObject2);
        localObject2 = new Intent(this, TuesdayNotificationService.class);
        ((Intent)localObject2).setAction("ThirdPeriod");
        localObject2 = PendingIntent.getBroadcast(this, 102, (Intent)localObject2, 134217728);
        ((Calendar)localObject1).set(2016, 3, 26, 10, 0, 0);
        paramBundle.set(0, ((Calendar)localObject1).getTimeInMillis(), (PendingIntent)localObject2);
        paramBundle.setRepeating(0, ((Calendar)localObject1).getTimeInMillis(), 604800000L, (PendingIntent)localObject2);
        localObject2 = new Intent(this, TuesdayNotificationService.class);
        ((Intent)localObject2).setAction("FourthPeriod");
        localObject2 = PendingIntent.getBroadcast(this, 103, (Intent)localObject2, 134217728);
        ((Calendar)localObject1).set(2016, 3, 26, 10, 55, 0);
        paramBundle.set(0, ((Calendar)localObject1).getTimeInMillis(), (PendingIntent)localObject2);
        paramBundle.setRepeating(0, ((Calendar)localObject1).getTimeInMillis(), 604800000L, (PendingIntent)localObject2);
        localObject2 = new Intent(this, TuesdayNotificationService.class);
        ((Intent)localObject2).setAction("FifthPeriod");
        localObject2 = PendingIntent.getBroadcast(this, 104, (Intent)localObject2, 134217728);
        ((Calendar)localObject1).set(2016, 3, 26, 11, 25, 0);
        paramBundle.set(0, ((Calendar)localObject1).getTimeInMillis(), (PendingIntent)localObject2);
        paramBundle.setRepeating(0, ((Calendar)localObject1).getTimeInMillis(), 604800000L, (PendingIntent)localObject2);
        localObject2 = new Intent(this, TuesdayNotificationService.class);
        ((Intent)localObject2).setAction("SixthPeriod");
        localObject2 = PendingIntent.getBroadcast(this, 105, (Intent)localObject2, 134217728);
        ((Calendar)localObject1).set(2016, 3, 26, 12, 20, 0);
        paramBundle.set(0, ((Calendar)localObject1).getTimeInMillis(), (PendingIntent)localObject2);
        paramBundle.setRepeating(0, ((Calendar)localObject1).getTimeInMillis(), 604800000L, (PendingIntent)localObject2);
        localObject2 = new Intent(this, TuesdayNotificationService.class);
        ((Intent)localObject2).setAction("SeventhPeriod");
        localObject2 = PendingIntent.getBroadcast(this, 105, (Intent)localObject2, 134217728);
        ((Calendar)localObject1).set(2016, 3, 26, 13, 15, 0);
        paramBundle.set(0, ((Calendar)localObject1).getTimeInMillis(), (PendingIntent)localObject2);
        paramBundle.setRepeating(0, ((Calendar)localObject1).getTimeInMillis(), 604800000L, (PendingIntent)localObject2);
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
