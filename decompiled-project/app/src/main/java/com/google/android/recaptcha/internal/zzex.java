package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public final class zzex {
    private final zzfm zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ zzex(zzfm zzfmVar, int i7, f fVar) {
        this.zza = new zzfm();
    }

    public final zzew zza(String str) {
        try {
            HttpURLConnection zza = this.zza.zza(str);
            zza.setRequestMethod("POST");
            zza.setDoOutput(true);
            zza.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzew(zza);
        } catch (zzbd e2) {
            throw e2;
        } catch (Exception e10) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e10.getMessage());
        }
    }
}
