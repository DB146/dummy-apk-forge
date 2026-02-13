package com.google.android.recaptcha.internal;

import Db.g;
import android.support.v4.media.session.b;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class zzfm {
    private final g zza;

    public zzfm() {
        int i7 = zzav.zza;
        this.zza = b.z(zzfl.zza);
    }

    public final HttpURLConnection zza(String str) {
        if (!((zzfk) this.zza.getValue()).zzb(str)) {
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        }
        URLConnection openConnection = new URL(str).openConnection();
        l.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}
