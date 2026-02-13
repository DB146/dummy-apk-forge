package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import h3.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzajt extends zzajw {
    private final int zzc;
    private final int zzd;

    public zzajt(byte[] bArr, int i7, int i10) {
        super(bArr);
        zzajp.zza(i7, i7 + i10, bArr.length);
        this.zzc = i7;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw, com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final byte zza(int i7) {
        int zzb = zzb();
        if (((zzb - (i7 + 1)) | i7) >= 0) {
            return this.zzb[this.zzc + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(o.l(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(c.e(i7, zzb, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw, com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final void zza(byte[] bArr, int i7, int i10, int i11) {
        System.arraycopy(this.zzb, zze(), bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw, com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final byte zzb(int i7) {
        return this.zzb[this.zzc + i7];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw, com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajw
    public final int zze() {
        return this.zzc;
    }
}
