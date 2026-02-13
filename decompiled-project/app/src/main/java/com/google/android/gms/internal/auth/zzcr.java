package com.google.android.gms.internal.auth;

import android.net.Uri;
import u.C2052e;
import u.T;

/* loaded from: classes.dex */
public final class zzcr {
    private static final C2052e zza = new T(0);

    public static synchronized Uri zza(String str) {
        synchronized (zzcr.class) {
            C2052e c2052e = zza;
            Uri uri = (Uri) c2052e.get("com.google.android.gms.auth_account");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
            c2052e.put("com.google.android.gms.auth_account", parse);
            return parse;
        }
    }
}
