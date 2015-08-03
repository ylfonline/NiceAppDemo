package com.shine.niceapp.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.util.DisplayMetrics;

/**
 * User: shine
 * Date: 2014-12-12
 * Time: 10:34
 * Description:
 */
public class AppUtils {

    public static DisplayMetrics getScreenDisplayMetrics(Context context) {
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
        return localDisplayMetrics;
    }

    public static int getDrawableIdByName(Context context, String drawableName) {
        return context.getResources().getIdentifier(drawableName, "drawable", context.getPackageName());
    }

    public static boolean isWifiDataEnable(Context paramContext) {
        try {
            boolean bool = ((ConnectivityManager) paramContext.getSystemService(Context.CONNECTIVITY_SERVICE)).getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnectedOrConnecting();
            return bool;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static int getHexColor(String paramString) {
        int i = Long.decode("0xFF8080FF").intValue();
        try {
            int j = Color.parseColor(paramString);
            return j;
        } catch (Exception localException) {
        }
        return i;
    }



}
