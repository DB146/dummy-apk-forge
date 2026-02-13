package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes.dex */
public final class zzjm {
    private static UserManager zza;
    private static volatile boolean zzb = !zza();

    private zzjm() {
    }

    public static boolean zza() {
        return true;
    }

    public static boolean zzb(Context context) {
        return zza() && !zzd(context);
    }

    public static boolean zzc(Context context) {
        return !zza() || zzd(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzd(Context context) {
        boolean z8;
        if (zzb) {
            return true;
        }
        synchronized (zzjm.class) {
            try {
                if (zzb) {
                    return true;
                }
                int i7 = 1;
                while (true) {
                    z8 = false;
                    if (i7 > 2) {
                        break;
                    }
                    if (zza == null) {
                        zza = (UserManager) context.getSystemService(UserManager.class);
                    }
                    UserManager userManager = zza;
                    if (userManager == null) {
                        z8 = true;
                        break;
                    }
                    try {
                        if (userManager.isUserUnlocked()) {
                            break;
                        }
                    } catch (NullPointerException e2) {
                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                        zza = null;
                        i7++;
                    }
                }
                if (z8) {
                    zza = null;
                }
                if (z8) {
                    zzb = true;
                }
                return z8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
