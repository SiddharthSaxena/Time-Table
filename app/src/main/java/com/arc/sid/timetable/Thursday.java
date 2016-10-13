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

public class Thursday extends AppCompatActivity {

    private ArrayList<SearchResults> GetSearchResults() {

        ArrayList<SearchResults> results = new ArrayList<>();

        SearchResults searchResults = new SearchResults();

        searchResults.setPeriodName("Optical Communication");
        searchResults.setFaculty("Mrs. Amrita Kaul");
        searchResults.setTiming("9:10 am - 10:05 am");
        results.add(searchResults);

        searchResults = new SearchResults();
        searchResults.setPeriodName("Wireless Communication");
        searchResults.setFaculty("Mrs. Divya");
        searchResults.setTiming("10:05 am - 11:00 am");
        results.add(searchResults);

        searchResults = new SearchResults();
        searchResults.setPeriodName("Lunch Break");
        searchResults.setFaculty("Break");
        searchResults.setTiming("11:00 am - 11:30 am");
        results.add(searchResults);

        searchResults = new SearchResults();
        searchResults.setPeriodName("Embedded Systems");
        searchResults.setFaculty("Mr. Gaurav Verma");
        searchResults.setTiming("11:30 am - 1:20 pm");
        results.add(searchResults);

        searchResults = new SearchResults();
        searchResults.setPeriodName("Embedded Systems");
        searchResults.setFaculty("Mr. Gaurav Verma");
        searchResults.setTiming("1:20 pm - 2:15 pm");
        results.add(searchResults);

        return results;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thursday);

        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView periods = (ListView) findViewById(R.id.thursdayList);
        periods.setAdapter(new CustomBaseAdapter(this, searchResults));

        periods.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object period = periods.getItemAtPosition(position);
                SearchResults fullObject = (SearchResults) period;
                Toast.makeText(Thursday.this, "Period : " + " " + fullObject.getPeriodName() + "\nLecturer : "
                        + " " + fullObject.getFaculty() + "\nTimings : " + " " + fullObject.getTiming(), Toast.LENGTH_LONG).show();
            }
        });

        Intent firstIntent = new Intent(this, ThursdayNotificationService.class);
        firstIntent.setAction("FirstPeriod");
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 400, firstIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Calendar calendar = Calendar.getInstance();
        Calendar now = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 9);
        calendar.set(Calendar.MINUTE, 5);
        calendar.set(Calendar.SECOND, 0);

        if (calendar.before(now)) {
            calendar.add(Calendar.DATE, +7);
        }

        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 7 * 24 * 60 * 60 * 1000, pendingIntent);

        Intent secondIntent = new Intent(this, ThursdayNotificationService.class);
        secondIntent.setAction("SecondPeriod");
        AlarmManager alarmManager2 = (AlarmManager) getSystemService(ALARM_SERVICE);
        PendingIntent pendingIntent2 = PendingIntent.getBroadcast(this, 401, secondIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.HOUR_OF_DAY, 10);
        calendar2.set(Calendar.MINUTE, 0);
        calendar2.set(Calendar.SECOND, 0);

        if (calendar2.before(now)) {
            calendar2.add(Calendar.DATE, +7);
        }

        alarmManager2.setRepeating(AlarmManager.RTC_WAKEUP, calendar2.getTimeInMillis(), 7 * 24 * 60 * 60 * 1000, pendingIntent2);

        Intent thirdIntent = new Intent(this, ThursdayNotificationService.class);
        thirdIntent.setAction("ThirdPeriod");
        AlarmManager alarmManager3 = (AlarmManager) getSystemService(ALARM_SERVICE);
        PendingIntent pendingIntent3 = PendingIntent.getBroadcast(this, 402, thirdIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(Calendar.HOUR_OF_DAY, 10);
        calendar3.set(Calendar.MINUTE, 55);
        calendar3.set(Calendar.SECOND, 0);

        if (calendar3.before(now)) {
            calendar3.add(Calendar.DATE, +7);
        }

        alarmManager3.setRepeating(AlarmManager.RTC_WAKEUP, calendar3.getTimeInMillis(), 7 * 24 * 60 * 60 * 1000, pendingIntent3);

        Intent fourthIntent = new Intent(this, ThursdayNotificationService.class);
        fourthIntent.setAction("FourthPeriod");
        AlarmManager alarmManager4 = (AlarmManager) getSystemService(ALARM_SERVICE);
        PendingIntent pendingIntent4 = PendingIntent.getBroadcast(this, 403, fourthIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Calendar calendar4 = Calendar.getInstance();
        calendar4.set(Calendar.HOUR_OF_DAY, 11);
        calendar4.set(Calendar.MINUTE, 25);
        calendar4.set(Calendar.SECOND, 0);

        if (calendar4.before(now)) {
            calendar4.add(Calendar.DATE, +7);
        }

        alarmManager4.setRepeating(AlarmManager.RTC_WAKEUP, calendar4.getTimeInMillis(), 7 * 24 * 60 * 60 * 1000, pendingIntent4);

        Intent fifthIntent = new Intent(this, ThursdayNotificationService.class);
        fifthIntent.setAction("FifthPeriod");
        AlarmManager alarmManager5 = (AlarmManager) getSystemService(ALARM_SERVICE);
        PendingIntent pendingIntent5 = PendingIntent.getBroadcast(this, 404, fifthIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Calendar calendar5 = Calendar.getInstance();
        calendar5.set(Calendar.HOUR_OF_DAY, 13);
        calendar5.set(Calendar.MINUTE, 15);
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