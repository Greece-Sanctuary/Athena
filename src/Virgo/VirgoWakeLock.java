package Virgo;

import android.content.Context;
import android.os.PowerManager;

public class VirgoWakeLock {
	public static PowerManager.WakeLock wakeLock;
	/**
	 * 唤醒服务
	 */
	public static void acquireWakeLock(Context context){
		if(wakeLock!=null){
	        return;
	    }
	    PowerManager powerManager = (PowerManager)(context.getSystemService(Context.POWER_SERVICE));
	    wakeLock = powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "com.cnblogs.download.OfflineService");
	    wakeLock.acquire();
	}

	/**
	 * 释放唤醒服务，返回休眠状态
	 */
	public static void releaseWakeLock(){
	    if(wakeLock!=null&&wakeLock.isHeld()){
	        wakeLock.release();
	        wakeLock = null;
	    }
	}
}


