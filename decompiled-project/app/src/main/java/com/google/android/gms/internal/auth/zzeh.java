package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
final class zzeh extends zzej {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzeh(byte[] bArr, int i7, int i10, boolean z8, zzeg zzegVar) {
        super(null);
        this.zze = f.API_PRIORITY_OTHER;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i7) {
        int i10 = this.zze;
        this.zze = 0;
        int i11 = this.zzc + this.zzd;
        this.zzc = i11;
        if (i11 > 0) {
            this.zzd = i11;
            this.zzc = 0;
        } else {
            this.zzd = 0;
        }
        return i10;
    }
}
