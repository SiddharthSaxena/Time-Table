package com.arc.sid.timetable;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.NotificationCompat;

public class WednesdayNotificationService extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        final NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        final NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setSmallIcon(R.drawable.icon);
        builder.setContentTitle(context.getString(R.string.app_name));

        if (intent.getAction().equalsIgnoreCase("FirstPeriod")) {
            builder.setContentText("First Lecture: RF Devices and Circuits begins in 5 minutes");
            builder.setContentIntent(PendingIntent.getActivity(context, 300, new Intent(context, Wednesday.class), 0));
            builder.setAutoCancel(true);
            int notificationID = 300;
            Notification notification = builder.build();
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(300);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("SecondPeriod")) {
            builder.setContentText("Next Lecture: Wireless Communication");
            builder.setContentIntent(PendingIntent.getActivity(context, 301, new Intent(context, Wednesday.class), 0));
            int notificationID = 301;
            builder.setAutoCancel(true);
            Notification notification = builder.build();
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(101);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("ThirdPeriod")) {
            builder.setContentText("Next Lecture: Embedded Systems");
            builder.setContentIntent(PendingIntent.getActivity(context, 302, new Intent(context, Wednesday.class), 0));
            int notificationID = 302;
            builder.setAutoCancel(true);
            Notification notification = builder.build();
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(302);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("FourthPeriod")) {
            builder.setContentText("Lunch Break coming up in 5 minutes");
            builder.setContentIntent(PendingIntent.getActivity(context, 303, new Intent(context, Wednesday.class), 0));
            int notificationID = 303;
            builder.setAutoCancel(true);
            Notification notification = builder.build();
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(303);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("FifthPeriod")) {
            builder.setContentText("Next Lecture: Radar and Navigation");
            builder.setContentIntent(PendingIntent.getActivity(context, 304, new Intent(context, Wednesday.class), 0));
            int notificationID = 304;
            builder.setAutoCancel(true);
            Notification notification = builder.build();
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(304);
                }
            }, delayInMilliseconds);
        }
    }
}
