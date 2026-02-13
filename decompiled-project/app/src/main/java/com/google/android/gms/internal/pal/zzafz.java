package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public enum zzafz {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzaby.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzafz(Object obj) {
        this.zzk = obj;
    }
}
