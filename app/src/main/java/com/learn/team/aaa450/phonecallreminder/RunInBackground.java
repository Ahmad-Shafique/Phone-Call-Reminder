package com.learn.team.aaa450.phonecallreminder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by ahmed on 4/8/2016.
 */
public class RunInBackground extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        handleCommand(intent);
        return START_STICKY;
    }

    private void handleCommand(Intent intent) {
        //If intent message contains record number
        if((intent.hasExtra("message"))){
            
        }

    }

    @Override
    public void onCreate(){

    }

    @Override
    public void onDestroy(){

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

}

