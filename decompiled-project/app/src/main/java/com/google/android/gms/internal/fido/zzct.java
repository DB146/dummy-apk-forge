package com.google.android.gms.internal.fido;

import X.c;
import h3.o;

/* loaded from: classes.dex */
final class zzct extends zzcw {
    private final int zzc;
    private final int zzd;

    public zzct(byte[] bArr, int i7, int i10) {
        super(bArr);
        zzcz.zzj(i7, i7 + i10, bArr.length);
        this.zzc = i7;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final byte zza(int i7) {
        int i10 = this.zzd;
        if (((i10 - (i7 + 1)) | i7) >= 0) {
            return this.zza[this.zzc + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(o.l(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(c.e(i7, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final byte zzb(int i7) {
        return this.zza[this.zzc + i7];
    }

    @Override // com.google.android.gms.internal.fido.zzcw
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final void zze(byte[] bArr, int i7, int i10, int i11) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i11);
    }
}
