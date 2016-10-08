package com.arc.sid.timetable;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
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

public class Monday extends AppCompatActivity {

    private ArrayList<SearchResults> GetSearchResults() {

        ArrayList<SearchResults> results = new ArrayList<>();

        SearchResults searchResults = new SearchResults();
        searchResults.setPeriodName("Microwave Engineering");
        searchResults.setFaculty("Mr. Devraj Gautam");
        searchResults.setTiming("8:30 am - 9:10 am");
        results.add(searchResults);

        searchResults = new SearchResults();
        searchResults.setPeriodName("Digital Signal Processing");
        searchResults.setFaculty("Dr. Surender Dhiman");
        searchResults.setTiming("9:10 am - 10:05 am");
        results.add(searchResults);

        searchResults = new SearchResults();
        searchResults.setPeriodName("VLSI Design");
        searchResults.setFaculty("Dr. Rajiv Sharma");
        searchResults.setTiming("10:05 am - 11:00 am");
        results.add(searchResults);

        searchResults = new SearchResults();
        searchResults.setPeriodName("Lunch Break");
        searchResults.setFaculty("Break");
        searchResults.setTiming("11:00 am - 11:30 am");
        results.add(searchResults);

        searchResults = new SearchResults();
        searchResults.setPeriodName("Antenna and Wave Propagation");
        searchResults.setFaculty("Mrs. Medha Hooda");
        searchResults.setTiming("11:30 am - 12:25 pm");
        results.add(searchResults);

        searchResults = new SearchResults();
        searchResults.setPeriodName("Data Communication and Networking");
        searchResults.setFaculty("Mr. Davender Banga");
        searchResults.setTiming("12:25 pm - 1:20 pm");
        results.add(searchResults);

        return results;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);

        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView periods = (ListView) findViewById(R.id.mondayList);
        periods.setAdapter(new CustomBaseAdapter(this, searchResults));

        periods.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object period = periods.getItemAtPosition(position);
                SearchResults fullObject = (SearchResults) period;
                Toast.makeText(Monday.this, "Period : " + " " + fullObject.getPeriodName() + "\nLecturer : "
                        + " " + fullObject.getFaculty() + "\nTimings : " + " " + fullObject.getTiming(), Toast.LENGTH_LONG).show();
            }
        });

        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Calendar calendar = Calendar.getInstance();
        Calendar now = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());

        Intent firstIntent = new Intent(this, MondayNotificationService.class);
        firstIntent.setAction("FirstPeriod");
        PendingIntent firstAlarmIntent = PendingIntent.getBroadcast(this, 100, firstIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//        calendar.set(13, 47, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 41);
        calendar.set(Calendar.SECOND, 0);
        if(calendar.before(now)) {
            calendar.add(Calendar.DATE, 1);
        }
//        alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), firstAlarmIntent);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, firstAlarmIntent);

        Intent secondIntent = new Intent(this, MondayNotificationService.class);
        secondIntent.setAction("SecondPeriod");
        PendingIntent secondAlarmIntent = PendingIntent.getBroadcast(this, 101, secondIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//        calendar.set(13, 48, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 0);
        if(calendar.before(now)) {
            calendar.add(Calendar.DATE, 1);
        }
//        alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), secondAlarmIntent);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, secondAlarmIntent);

        Intent thirdIntent = new Intent(this, MondayNotificationService.class);
        thirdIntent.setAction("ThirdPeriod");
        PendingIntent thirdAlarmIntent = PendingIntent.getBroadcast(this, 102, thirdIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//        calendar.set(13, 49, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 43);
        calendar.set(Calendar.SECOND, 0);
        if(calendar.before(now)) {
            calendar.add(Calendar.DATE, 1);
        }
//        alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), thirdAlarmIntent);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, thirdAlarmIntent);

        Intent fourthIntent = new Intent(this, MondayNotificationService.class);
        fourthIntent.setAction("FourthPeriod");
        PendingIntent fourthAlarmIntent = PendingIntent.getBroadcast(this, 103, fourthIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//        calendar.set(13, 50, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 44);
        calendar.set(Calendar.SECOND, 0);
        if(calendar.before(now)) {
            calendar.add(Calendar.DATE, 1);
        }
//        alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), fourthAlarmIntent);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, fourthAlarmIntent);

        Intent fifthIntent = new Intent(this, MondayNotificationService.class);
        fifthIntent.setAction("FifthPeriod");
        PendingIntent fifthAlarmIntent = PendingIntent.getBroadcast(this, 104, fifthIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//        calendar.set(13, 51, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 45);
        calendar.set(Calendar.SECOND, 0);
        if(calendar.before(now)) {
            calendar.add(Calendar.DATE, 1);
        }
//        alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), fifthAlarmIntent);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, fifthAlarmIntent);

        Intent sixthIntent = new Intent(this, MondayNotificationService.class);
        sixthIntent.setAction("SixthPeriod");
        PendingIntent sixthAlarmIntent = PendingIntent.getBroadcast(this, 105, sixthIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//        calendar.set(13, 52, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 46);
        calendar.set(Calendar.SECOND, 0);
        if(calendar.before(now)) {
            calendar.add(Calendar.DATE, 1);
        }
//        alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), sixthAlarmIntent);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, sixthAlarmIntent);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return menuItem.getItemId() == R.id.action_settings || super.onOptionsItemSelected(menuItem);
    }
}