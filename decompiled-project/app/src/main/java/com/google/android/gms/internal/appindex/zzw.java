package com.google.android.gms.internal.appindex;

import android.util.Log;
import s5.b;

/* loaded from: classes.dex */
public final class zzw {
    public static int zza(String str) {
        if (zzb(3)) {
            return Log.d(b.APP_INDEXING_API_TAG, str);
        }
        return 0;
    }

    public static boolean zzb(int i7) {
        if (Log.isLoggable(b.APP_INDEXING_API_TAG, i7)) {
            return true;
        }
        return Log.isLoggable(b.APP_INDEXING_API_TAG, i7);
    }
}
