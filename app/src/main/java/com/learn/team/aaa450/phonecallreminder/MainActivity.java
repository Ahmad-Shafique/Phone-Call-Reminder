package com.learn.team.aaa450.phonecallreminder;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
    }
}
/*
class RunInBackground{
    /*
    1)Execute every time the phone starts up
    2)Keep running in background
     //*
}
*/

class DetectIncomingCalls{
    /*
    1)Record caller phone number function
    2)call RecordIncomingNumber class
     */
}

class RecordIncomingNumber{
    /*
    1)Implement listener for call end
    2)On ending a call ; (Open a popup and ask for name and call frequncy of the number||Do this only if the number is not already present in DB
    3)If not saved , save the contact to DV
    4)Call reminder setter class and send the info
     */
}

class ReminderSetter{
    /*
    1)Create a reminder trigger for current contact
    2)If the day is "friday" ,recheck all the DB entries and set new reminder if necessary
     */
}