package com.luna.anytime;

import com.avos.avoscloud.AVOSCloud;

import android.app.Application;

public class AnyTimeApplication extends Application {

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		AVOSCloud.useAVCloudCN();
		// U need your AVOS key and so on to run the code.
		AVOSCloud.initialize(this,
				"2s4amu2ol6y6j369flxy4orr38o4rtpoj2tldfvx4yk1945g",
				"x0wktubwarcb37tp4i3mhxvlbgaretjaxxiakua3mcjjt3ft");
	}
}
