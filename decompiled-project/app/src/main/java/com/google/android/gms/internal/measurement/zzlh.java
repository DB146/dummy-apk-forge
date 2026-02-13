package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
final class zzlh extends zzli {
    private int zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzlh(byte[] bArr, int i7, int i10, boolean z8, byte[] bArr2) {
        super(null);
        this.zzd = f.API_PRIORITY_OTHER;
        this.zzb = 0;
    }

    public final int zza(int i7) {
        int i10 = this.zzd;
        this.zzd = 0;
        int i11 = this.zzb + this.zzc;
        this.zzb = i11;
        if (i11 > 0) {
            this.zzc = i11;
            this.zzb = 0;
        } else {
            this.zzc = 0;
        }
        return i10;
    }
}
