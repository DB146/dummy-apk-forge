package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes.dex */
public final class zzcc {
    private static UserManager zza;
    private static volatile boolean zzb = !zzb();

    private zzcc() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        r8 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(Context context) {
        int i7;
        boolean z8;
        if (zzb() && !zzb) {
            synchronized (zzcc.class) {
                try {
                    if (!zzb) {
                        i7 = 1;
                        while (true) {
                            if (i7 <= 2) {
                                if (zza == null) {
                                    zza = (UserManager) context.getSystemService(UserManager.class);
                                }
                                UserManager userManager = zza;
                                if (userManager != null) {
                                    if (userManager.isUserUnlocked()) {
                                        break;
                                    }
                                } else {
                                    z8 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        z8 = false;
                        if (z8) {
                            zza = null;
                        }
                        if (z8) {
                            zzb = true;
                        }
                        if (!z8) {
                            return true;
                        }
                    }
                } catch (NullPointerException e2) {
                    Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                    zza = null;
                    i7++;
                } finally {
                }
            }
        }
        return false;
    }

    public static boolean zzb() {
        return true;
    }
}
