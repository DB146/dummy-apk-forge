package com.google.android.gms.internal.pal;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzabp extends zzabr {
    final /* synthetic */ zzaby zza;
    private int zzb = 0;
    private final int zzc;

    public zzabp(zzaby zzabyVar) {
        this.zza = zzabyVar;
        this.zzc = zzabyVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.pal.zzabt
    public final byte zza() {
        int i7 = this.zzb;
        if (i7 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i7 + 1;
        return this.zza.zzb(i7);
    }
}
