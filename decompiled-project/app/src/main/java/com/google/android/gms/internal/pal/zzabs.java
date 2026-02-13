package com.google.android.gms.internal.pal;

import X.c;
import h3.o;

/* loaded from: classes.dex */
final class zzabs extends zzabv {
    private final int zzc;

    public zzabs(byte[] bArr, int i7, int i10) {
        super(bArr);
        zzaby.zzl(0, i10, bArr.length);
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.pal.zzabv, com.google.android.gms.internal.pal.zzaby
    public final byte zza(int i7) {
        int i10 = this.zzc;
        if (((i10 - (i7 + 1)) | i7) >= 0) {
            return this.zza[i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(o.l(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(c.e(i7, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.pal.zzabv, com.google.android.gms.internal.pal.zzaby
    public final byte zzb(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.gms.internal.pal.zzabv
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.pal.zzabv, com.google.android.gms.internal.pal.zzaby
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.pal.zzabv, com.google.android.gms.internal.pal.zzaby
    public final void zze(byte[] bArr, int i7, int i10, int i11) {
        System.arraycopy(this.zza, 0, bArr, 0, i11);
    }
}
