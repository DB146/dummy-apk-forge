package com.google.android.gms.internal.p002firebaseauthapi;

import M5.c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.G;

/* loaded from: classes.dex */
public final class zzafp {
    private final String zza;
    private final String zzb;

    public zzafp(Context context) {
        this(context, context.getPackageName());
    }

    private zzafp(Context context, String str) {
        G.g(context);
        G.d(str);
        this.zza = str;
        try {
            byte[] e2 = c.e(context, str);
            if (e2 != null) {
                this.zzb = c.b(e2);
                return;
            }
            Log.e("FBA-PackageInfo", "single cert required: " + str);
            this.zzb = null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
