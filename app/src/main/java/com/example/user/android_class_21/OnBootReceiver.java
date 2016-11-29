package com.example.user.android_class_21;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.util.Log;

public class OnBootReceiver extends BroadcastReceiver {
    public OnBootReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.v("ppking","OKOK");
        Intent it = new Intent(context , MyService.class);
        context.startService(it);

    }
}
