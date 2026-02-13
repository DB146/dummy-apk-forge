package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes.dex */
public class zzyy {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            zzabe zzabeVar = new zzabe(stringWriter);
            zzabeVar.zzj(true);
            zzaba.zzV.zzb(zzabeVar, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public int zza() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String zzd() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final zzzb zzf() {
        if (this instanceof zzzb) {
            return (zzzb) this;
        }
        toString();
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }
}
