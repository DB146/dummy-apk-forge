package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzsm extends zzso {
    private final transient zzso zza;

    public zzsm(zzso zzsoVar) {
        this.zza = zzsoVar;
    }

    private final int zzo(int i7) {
        return (this.zza.size() - 1) - i7;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso, com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzrm.zza(i7, this.zza.size(), "index");
        return this.zza.get(zzo(i7));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzo(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzo(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso
    public final zzso zzh() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso, java.util.List
    /* renamed from: zzi */
    public final zzso subList(int i7, int i10) {
        zzrm.zzg(i7, i10, this.zza.size());
        zzso zzsoVar = this.zza;
        return zzsoVar.subList(zzsoVar.size() - i10, this.zza.size() - i7).zzh();
    }
}
