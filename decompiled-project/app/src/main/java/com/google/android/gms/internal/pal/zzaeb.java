package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
final class zzaeb {
    private static final zzaea zza;
    private static final zzaea zzb;

    static {
        zzaea zzaeaVar = null;
        try {
            zzaeaVar = (zzaea) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzaeaVar;
        zzb = new zzaea();
    }

    public static zzaea zza() {
        return zza;
    }

    public static zzaea zzb() {
        return zzb;
    }
}
