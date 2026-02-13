package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
final class zzif extends zzil {
    static final zzif zza = new zzif();

    private zzif() {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final zzil zza(zzii zziiVar) {
        zziiVar.getClass();
        return zza;
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final Object zzb() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final Object zzc(Object obj) {
        return obj;
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final boolean zzd() {
        return false;
    }
}
