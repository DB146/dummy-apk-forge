package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzti extends zzso {
    static final zzso zza = new zzti(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzti(Object[] objArr, int i7) {
        this.zzb = objArr;
        this.zzc = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzrm.zza(i7, this.zzc, "index");
        Object obj = this.zzb[i7];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso, com.google.ads.interactivemedia.v3.internal.zzsk
    public final int zza(Object[] objArr, int i7) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final int zzc() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final Object[] zzg() {
        return this.zzb;
    }
}
