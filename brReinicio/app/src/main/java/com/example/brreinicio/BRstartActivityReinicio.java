package com.example.brreinicio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BRstartActivityReinicio extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){
            Intent i = new Intent(context, MainActivity.class);
            i.addFlags((Intent.FLAG_ACTIVITY_NEW_TASK));
            context.startActivity(i);
            Toast.makeText(context,"TELEFONO REINICIADO",Toast.LENGTH_SHORT).show();
        }
    }
}
