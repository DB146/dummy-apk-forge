package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
final class zztm extends zzso {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zztm(Object[] objArr, int i7, int i10) {
        this.zza = objArr;
        this.zzb = i7;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzrm.zza(i7, this.zzc, "index");
        Object obj = this.zza[i7 + i7 + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final boolean zzf() {
        return true;
    }
}
