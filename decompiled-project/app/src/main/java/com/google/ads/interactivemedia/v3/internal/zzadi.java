package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzadi extends zzadk {
    final /* synthetic */ zzadr zza;
    private int zzb = 0;
    private final int zzc;

    public zzadi(zzadr zzadrVar) {
        this.zza = zzadrVar;
        this.zzc = zzadrVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadm
    public final byte zza() {
        int i7 = this.zzb;
        if (i7 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i7 + 1;
        return this.zza.zzb(i7);
    }
}
