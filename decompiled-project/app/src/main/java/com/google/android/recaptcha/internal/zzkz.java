package com.google.android.recaptcha.internal;

import X.c;
import h3.o;

/* loaded from: classes.dex */
final class zzkz extends zzlc {
    private final int zzc;

    public zzkz(byte[] bArr, int i7, int i10) {
        super(bArr);
        zzle.zzi(0, i10, bArr.length);
        this.zzc = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zza(int i7) {
        int i10 = this.zzc;
        if (((i10 - (i7 + 1)) | i7) >= 0) {
            return ((zzlc) this).zza[i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(o.l(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(c.e(i7, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zzb(int i7) {
        return ((zzlc) this).zza[i7];
    }

    @Override // com.google.android.recaptcha.internal.zzlc
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final void zze(byte[] bArr, int i7, int i10, int i11) {
        System.arraycopy(((zzlc) this).zza, 0, bArr, 0, i11);
    }
}
