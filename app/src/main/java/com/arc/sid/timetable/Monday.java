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

public class Monday extends AppCompatActivity {

    private ArrayList<SearchResults> GetSearchResults() {

        ArrayList<SearchResults> results = new ArrayList<>();

        SearchResults searchResults = new SearchResults();

        searchResults.setPeriodName("Optical Communication");
        searchResults.setFaculty("Mrs. Amrita Kaul");
        searchResults.setTiming("8:30 am - 9:10 am");
        results.add(searchResults);

        searchResults = new SearchResults();
        searchResults.setPeriodName("RF Devices and Circuits");
        searchResults.setFaculty("Mr. Harsh");
        searchResults.setTiming("9:10 am - 10:05 am");
        results.add(searchResults);

        searchResults = new SearchResults();
        searchResults.setPeriodName("Radar and Navigation");
        searchResults.setFaculty("Mrs. Medha Hooda");
        searchResults.setTiming("10:05 am - 11:00 am");
        results.add(searchResults);

        searchResults = new SearchResults();
        searchResults.setPeriodName("Lunch Break");
        searchResults.setFaculty("Break");
        searchResults.setTiming("11:00 am - 11:30 am");
        results.add(searchResults);

        searchResults = new SearchResults();
        searchResults.setPeriodName("RF Devices and Circuits");
        searchResults.setFaculty("Mr. Harsh");
        searchResults.setTiming("11:30 am - 1:20 pm");
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

        Intent firstIntent = new Intent(this, MondayNotificationService.class);
        firstIntent.setAction("FirstPeriod");
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 100, firstIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Calendar calendar = Calendar.getInstance();
        Calendar now = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 8);
        calendar.set(Calendar.MINUTE, 10);
        calendar.set(Calendar.SECOND, 0);

        if (calendar.before(now)) {
            calendar.add(Calendar.DATE, +7);
        }

        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 7 * 24 * 60 * 60 * 1000, pendingIntent);

        Intent secondIntent = new Intent(this, MondayNotificationService.class);
        secondIntent.setAction("SecondPeriod");
        AlarmManager alarmManager2 = (AlarmManager) getSystemService(ALARM_SERVICE);
        PendingIntent pendingIntent2 = PendingIntent.getBroadcast(this, 101, secondIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.HOUR_OF_DAY, 9);
        calendar2.set(Calendar.MINUTE, 5);
        calendar2.set(Calendar.SECOND, 0);

        if (calendar2.before(now)) {
            calendar2.add(Calendar.DATE, +7);
        }

        alarmManager2.setRepeating(AlarmManager.RTC_WAKEUP, calendar2.getTimeInMillis(), 7 * 24 * 60 * 60 * 1000, pendingIntent2);

        Intent thirdIntent = new Intent(this, MondayNotificationService.class);
        thirdIntent.setAction("ThirdPeriod");
        AlarmManager alarmManager3 = (AlarmManager) getSystemService(ALARM_SERVICE);
        PendingIntent pendingIntent3 = PendingIntent.getBroadcast(this, 102, thirdIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(Calendar.HOUR_OF_DAY, 10);
        calendar3.set(Calendar.MINUTE, 0);
        calendar3.set(Calendar.SECOND, 0);

        if (calendar3.before(now)) {
            calendar3.add(Calendar.DATE, +7);
        }

        alarmManager3.setRepeating(AlarmManager.RTC_WAKEUP, calendar3.getTimeInMillis(), 7 * 24 * 60 * 60 * 1000, pendingIntent3);

        Intent fourthIntent = new Intent(this, MondayNotificationService.class);
        fourthIntent.setAction("FourthPeriod");
        AlarmManager alarmManager4 = (AlarmManager) getSystemService(ALARM_SERVICE);
        PendingIntent pendingIntent4 = PendingIntent.getBroadcast(this, 103, fourthIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Calendar calendar4 = Calendar.getInstance();
        calendar4.set(Calendar.HOUR_OF_DAY, 10);
        calendar4.set(Calendar.MINUTE, 55);
        calendar4.set(Calendar.SECOND, 0);

        if (calendar4.before(now)) {
            calendar4.add(Calendar.DATE, +7);
        }

        alarmManager4.setRepeating(AlarmManager.RTC_WAKEUP, calendar4.getTimeInMillis(), 7 * 24 * 60 * 60 * 1000, pendingIntent4);

        Intent fifthIntent = new Intent(this, MondayNotificationService.class);
        fifthIntent.setAction("FifthPeriod");
        AlarmManager alarmManager5 = (AlarmManager) getSystemService(ALARM_SERVICE);
        PendingIntent pendingIntent5 = PendingIntent.getBroadcast(this, 104, fifthIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Calendar calendar5 = Calendar.getInstance();
        calendar5.set(Calendar.HOUR_OF_DAY, 11);
        calendar5.set(Calendar.MINUTE, 25);
        calendar5.set(Calendar.SECOND, 0);

        if (calendar5.before(now)) {
            calendar5.add(Calendar.DATE, +7);
        }

        alarmManager5.setRepeating(AlarmManager.RTC_WAKEUP, calendar5.getTimeInMillis(), 7 * 24 * 60 * 60 * 1000, pendingIntent5);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return menuItem.getItemId() == R.id.action_settings || super.onOptionsItemSelected(menuItem);
    }
}