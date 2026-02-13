package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzafh extends RuntimeException {
    public zzafh(zzaef zzaefVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzadi zza() {
        return new zzadi(getMessage());
    }
}
