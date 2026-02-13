package com.google.android.recaptcha.internal;

import h3.o;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzkd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzkd(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < cArr.length; i7++) {
            char c10 = cArr[i7];
            boolean z8 = true;
            zzjf.zzc(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z8 = false;
            }
            zzjf.zzc(z8, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i7;
        }
    }

    private zzkd(String str, char[] cArr, byte[] bArr, boolean z8) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb = zzkj.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzb);
            int i7 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i7;
            this.zzd = zzb >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i7];
            for (int i10 = 0; i10 < this.zzd; i10++) {
                zArr[zzkj.zza(i10 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = false;
        } catch (ArithmeticException e2) {
            throw new IllegalArgumentException(o.l(cArr.length, "Illegal alphabet length "), e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkd) {
            zzkd zzkdVar = (zzkd) obj;
            boolean z8 = zzkdVar.zzi;
            if (Arrays.equals(this.zzf, zzkdVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i7) {
        return this.zzf[i7];
    }

    public final int zzb(char c10) {
        if (c10 > 127) {
            throw new zzkf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        byte b2 = this.zzg[c10];
        if (b2 != -1) {
            return b2;
        }
        if (c10 <= ' ' || c10 == 127) {
            throw new zzkf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        throw new zzkf("Unrecognized character: " + c10);
    }

    public final boolean zzc(int i7) {
        return this.zzh[i7 % this.zzc];
    }

    public final boolean zzd(char c10) {
        return this.zzg[61] != -1;
    }
}
