package com.androidjavapoint.localbroadcastreceiversample;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

import java.util.Date;

public class MyIntentService extends IntentService {

    public static final String CUSTOM_ACTION = "YOUR_CUSTOM_ACTION";

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent arg0) {
        Intent intent = new Intent(CUSTOM_ACTION);
        intent.putExtra("DATE", new Date().toString());
        Log.d(MyIntentService.class.getSimpleName(), "sending broadcast");

        // send local broadcast
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

}
