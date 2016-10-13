package com.arc.sid.timetable;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.NotificationCompat;

public class ThursdayNotificationService extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        final NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        final NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setSmallIcon(R.drawable.icon);
        builder.setContentTitle(context.getString(R.string.app_name));

        if (intent.getAction().equalsIgnoreCase("FirstPeriod")) {
            builder.setContentText("First Lecture: Optical Communication begins in 5 minutes");
            builder.setContentIntent(PendingIntent.getActivity(context, 400, new Intent(context, Thursday.class), 0));
            builder.setAutoCancel(true);
            int notificationID = 400;
            Notification notification = builder.build();
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(400);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("SecondPeriod")) {
            builder.setContentText("Next Lecture: Wireless Communication");
            builder.setContentIntent(PendingIntent.getActivity(context, 401, new Intent(context, Thursday.class), 0));
            int notificationID = 401;
            builder.setAutoCancel(true);
            Notification notification = builder.build();
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(401);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("ThirdPeriod")) {
            builder.setContentText("Lunch Break coming up in 5 minutes");
            builder.setContentIntent(PendingIntent.getActivity(context, 402, new Intent(context, Thursday.class), 0));
            int notificationID = 402;
            builder.setAutoCancel(true);
            Notification notification = builder.build();
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(402);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("FourthPeriod")) {
            builder.setContentText("Embedded Systems");
            builder.setContentIntent(PendingIntent.getActivity(context, 403, new Intent(context, Thursday.class), 0));
            int notificationID = 403;
            builder.setAutoCancel(true);
            Notification notification = builder.build();
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(403);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("FifthPeriod")) {
            builder.setContentText("Last Lecture: Embedded Systems");
            builder.setContentIntent(PendingIntent.getActivity(context, 404, new Intent(context, Thursday.class), 0));
            int notificationID = 404;
            builder.setAutoCancel(true);
            Notification notification = builder.build();
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(404);
                }
            }, delayInMilliseconds);
        }
    }
}
