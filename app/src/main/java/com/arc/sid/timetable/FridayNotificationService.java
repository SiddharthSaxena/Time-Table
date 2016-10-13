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
            builder.setContentText("First Lecture: RF Devices and Circuits begins in 5 minutes");
            builder.setContentIntent(PendingIntent.getActivity(context, 500, new Intent(context, Friday.class), 0));
            builder.setAutoCancel(true);
            int notificationID = 500;
            Notification notification = builder.build();
            notification.defaults |= Notification.DEFAULT_VIBRATE;
            notification.defaults |= Notification.DEFAULT_SOUND;
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(500);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("SecondPeriod")) {
            builder.setContentText("Next Lecture: Radar and Navigation");
            builder.setContentIntent(PendingIntent.getActivity(context, 501, new Intent(context, Friday.class), 0));
            int notificationID = 501;
            builder.setAutoCancel(true);
            Notification notification = builder.build();
            notification.defaults |= Notification.DEFAULT_VIBRATE;
            notification.defaults |= Notification.DEFAULT_SOUND;
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(501);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("ThirdPeriod")) {
            builder.setContentText("Next Lecture: Embedded Systems");
            builder.setContentIntent(PendingIntent.getActivity(context, 502, new Intent(context, Friday.class), 0));
            int notificationID = 502;
            builder.setAutoCancel(true);
            Notification notification = builder.build();
            notification.defaults |= Notification.DEFAULT_VIBRATE;
            notification.defaults |= Notification.DEFAULT_SOUND;
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(502);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("FourthPeriod")) {
            builder.setContentText("Lunch Break coming up in 5 minutes");
            builder.setContentIntent(PendingIntent.getActivity(context, 503, new Intent(context, Friday.class), 0));
            int notificationID = 503;
            builder.setAutoCancel(true);
            Notification notification = builder.build();
            notification.defaults |= Notification.DEFAULT_VIBRATE;
            notification.defaults |= Notification.DEFAULT_SOUND;
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(503);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("FifthPeriod")) {
            builder.setContentText("Next Lecture: Optical Communication");
            builder.setContentIntent(PendingIntent.getActivity(context, 504, new Intent(context, Friday.class), 0));
            int notificationID = 504;
            builder.setAutoCancel(true);
            Notification notification = builder.build();
            notification.defaults |= Notification.DEFAULT_VIBRATE;
            notification.defaults |= Notification.DEFAULT_SOUND;
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(504);
                }
            }, delayInMilliseconds);
        }

        if (intent.getAction().equalsIgnoreCase("FifthPeriod")) {
            builder.setContentText("Last Lecture: Wireless Communication");
            builder.setContentIntent(PendingIntent.getActivity(context, 505, new Intent(context, Friday.class), 0));
            int notificationID = 505;
            builder.setAutoCancel(true);
            Notification notification = builder.build();
            notification.defaults |= Notification.DEFAULT_VIBRATE;
            notification.defaults |= Notification.DEFAULT_SOUND;
            notificationManager.notify(notificationID, notification);

            Handler handler = new Handler();
            long delayInMilliseconds = 300000;
            handler.postDelayed(new Runnable() {
                public void run() {
                    notificationManager.cancel(505);
                }
            }, delayInMilliseconds);
        }
    }
}
