package com.example.pavel.broadcast;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BootRecirver extends BroadcastReceiver{

    private static final String TAG = "myLogs";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("+++", "hello world");
        Toast.makeText(context, "Boot completed", Toast.LENGTH_LONG).show();

    }
}
