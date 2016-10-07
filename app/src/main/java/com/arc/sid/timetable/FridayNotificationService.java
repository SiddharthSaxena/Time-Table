package com.arc.sid.timetable;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.NotificationCompat;

public class FridayNotificationService extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        final NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        final NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setSmallIcon(R.drawable.icon);
        builder.setContentTitle(context.getString(R.string.app_name));

        if (intent.getAction().equalsIgnoreCase("FirstPeriod")) {
            builder.setContentText("Microwave Engineering");
            builder.setContentIntent(PendingIntent.getActivity(context, 100, new Intent(context, Friday.class), 0));
            Notification notification = builder.build();
            builder.setAutoCancel(true);
            int notificationID = 100;
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(100);
                }
            }, delayInMilliseconds);

        }

        if (intent.getAction().equalsIgnoreCase("SecondPeriod")) {
            builder.setContentText("Digital Signal Processing");
            builder.setContentIntent(PendingIntent.getActivity(context, 101, new Intent(context, Friday.class), 0));
            Notification notification = builder.build();
            int notificationID = 101;
            builder.setAutoCancel(true);
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
            builder.setContentText("Digital Signal Processing");
            builder.setContentIntent(PendingIntent.getActivity(context, 102, new Intent(context, Friday.class), 0));
            Notification notification = builder.build();
            int notificationID = 102;
            builder.setAutoCancel(true);
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(102);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("FourthPeriod")) {
            builder.setContentText("Digital Signal Processing");
            builder.setContentIntent(PendingIntent.getActivity(context, 103, new Intent(context, Friday.class), 0));
            Notification notification = builder.build();
            int notificationID = 103;
            builder.setAutoCancel(true);
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(103);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("FifthPeriod")) {
            builder.setContentText("Digital Signal Processing");
            builder.setContentIntent(PendingIntent.getActivity(context, 104, new Intent(context, Friday.class), 0));
            Notification notification = builder.build();
            int notificationID = 104;
            builder.setAutoCancel(true);
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(104);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("SixthPeriod")) {
            builder.setContentText("Digital Signal Processing");
            builder.setContentIntent(PendingIntent.getActivity(context, 105, new Intent(context, Friday.class), 0));
            Notification notification = builder.build();
            int notificationID = 105;
            builder.setAutoCancel(true);
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(105);
                }
            }, delayInMilliseconds);
        }
    }
}
