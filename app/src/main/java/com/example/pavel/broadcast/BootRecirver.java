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
        if(intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)){
            Toast.makeText(context, "Boot completed", Toast.LENGTH_LONG).show();
            for (int y=0; y<10; y++){
                Log.d(TAG, "Boot Completed"); // Чтоб не потерять
            }
        }
    }
}
