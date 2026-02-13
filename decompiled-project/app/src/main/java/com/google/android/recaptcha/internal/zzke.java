package com.google.android.recaptcha.internal;

import h3.o;

/* loaded from: classes.dex */
final class zzke extends zzkg {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzke(String str, String str2, Character ch) {
        super(r0, ch);
        char[] cArr;
        zzkd zzkdVar = new zzkd(str, str2.toCharArray());
        cArr = zzkdVar.zzf;
        zzjf.zza(cArr.length == 64);
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    public final int zza(byte[] bArr, CharSequence charSequence) {
        CharSequence zze = zze(charSequence);
        if (!this.zza.zzc(zze.length())) {
            throw new zzkf(o.l(zze.length(), "Invalid input length "));
        }
        int i7 = 0;
        int i10 = 0;
        while (i7 < zze.length()) {
            int i11 = i10 + 1;
            int zzb = (this.zza.zzb(zze.charAt(i7)) << 18) | (this.zza.zzb(zze.charAt(i7 + 1)) << 12);
            bArr[i10] = (byte) (zzb >>> 16);
            int i12 = i7 + 2;
            if (i12 < zze.length()) {
                int i13 = i7 + 3;
                int zzb2 = zzb | (this.zza.zzb(zze.charAt(i12)) << 6);
                int i14 = i10 + 2;
                bArr[i11] = (byte) ((zzb2 >>> 8) & 255);
                if (i13 < zze.length()) {
                    i7 += 4;
                    i10 += 3;
                    bArr[i14] = (byte) ((zzb2 | this.zza.zzb(zze.charAt(i13))) & 255);
                } else {
                    i10 = i14;
                    i7 = i13;
                }
            } else {
                i7 = i12;
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    public final void zzb(Appendable appendable, byte[] bArr, int i7, int i10) {
        int i11 = 0;
        zzjf.zzd(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = bArr[i11] & 255;
            int i14 = ((bArr[i11 + 1] & 255) << 8) | (i13 << 16) | (bArr[i11 + 2] & 255);
            appendable.append(this.zza.zza(i14 >>> 18));
            appendable.append(this.zza.zza((i14 >>> 12) & 63));
            appendable.append(this.zza.zza((i14 >>> 6) & 63));
            appendable.append(this.zza.zza(i14 & 63));
            i11 += 3;
        }
        if (i11 < i10) {
            zzf(appendable, bArr, i11, i10 - i11);
        }
    }
}
