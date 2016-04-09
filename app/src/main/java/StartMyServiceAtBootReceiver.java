import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.learn.team.aaa450.phonecallreminder.RunInBackground;

/**
 * Created by ahmed on 4/8/2016.
 */
public class StartMyServiceAtBootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, final Intent intent) {
        /*
        This part deals with
        starting the app every time the device is booted
         */
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Intent serviceIntent = new Intent(context, RunInBackground.class);
                    intent.putExtra("phone_started",true);
                    context.startService(serviceIntent);
                }
            }).start();

        }
    }
}