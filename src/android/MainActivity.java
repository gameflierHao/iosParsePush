package org.apache.cordova.core;

import android.app.Activity;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.PushService;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Parse.initialize(this, "hagjJqINpGMihPhkIdP6OoIO7MFaT8PuMrLynbt5", "26I7kNgRDXOcajqCeGKzPGKTRKvoZ82fdBXT8XjC");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}