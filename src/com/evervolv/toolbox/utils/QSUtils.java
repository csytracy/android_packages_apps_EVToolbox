package com.evervolv.toolbox.utils;

import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.Camera;
import android.hardware.display.DisplayManager;
import android.hardware.display.WifiDisplayStatus;
import android.net.ConnectivityManager;
import android.nfc.NfcAdapter;
import android.os.UserHandle;
import android.provider.Settings;
import android.telephony.TelephonyManager;

import com.android.internal.telephony.PhoneConstants;

public class QSUtils {
        public static boolean deviceSupportsMobileData(Context ctx) {
            ConnectivityManager cm = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
            return cm.isNetworkSupported(ConnectivityManager.TYPE_MOBILE);
        }

}
