package al.musi.batteryobserver;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.content.LocalBroadcastManager;

public class BatteryService extends Service {

    public static final String TAG = "BatteryService";

    @Override
    public IBinder onBind(Intent intent) { return null; }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Bundle extras = intent.getExtras();
        if (extras != null) {

            Intent intent1 = new Intent("lyricSearching");
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent1);
        }
        return super.onStartCommand(intent, flags, startId);
    }


}
