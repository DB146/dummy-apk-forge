package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
final class zzacu implements zzaed {
    private static final zzacu zza = new zzacu();

    private zzacu() {
    }

    public static zzacu zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.pal.zzaed
    public final zzaec zzb(Class cls) {
        if (!zzacz.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzaec) zzacz.zzav(cls.asSubclass(zzacz.class)).zzb(3, null, null);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaed
    public final boolean zzc(Class cls) {
        return zzacz.class.isAssignableFrom(cls);
    }
}
