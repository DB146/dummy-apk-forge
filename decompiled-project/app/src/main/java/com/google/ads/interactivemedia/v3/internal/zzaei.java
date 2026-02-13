package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
final class zzaei {
    private static final zzaeg zza = new zzaeh();
    private static final zzaeg zzb;

    static {
        zzaeg zzaegVar = null;
        try {
            zzaegVar = (zzaeg) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzaegVar;
    }

    public static zzaeg zza() {
        zzaeg zzaegVar = zzb;
        if (zzaegVar != null) {
            return zzaegVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzaeg zzb() {
        return zza;
    }
}
