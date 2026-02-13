package com.google.android.gms.internal.measurement;

import android.net.Uri;
import u.C2052e;
import u.T;

/* loaded from: classes.dex */
public final class zzka {
    public static final /* synthetic */ int zza = 0;
    private static final C2052e zzb = new T(0);

    public static synchronized Uri zza(String str) {
        synchronized (zzka.class) {
            C2052e c2052e = zzb;
            Uri uri = (Uri) c2052e.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            c2052e.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
