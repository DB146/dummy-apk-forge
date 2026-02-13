package com.google.android.gms.internal.fido;

import h3.o;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzcd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcd(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < cArr.length; i7++) {
            char c10 = cArr[i7];
            boolean z8 = true;
            zzap.zzd(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z8 = false;
            }
            zzap.zzd(z8, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i7;
        }
    }

    private zzcd(String str, char[] cArr, byte[] bArr, boolean z8) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb = zzcj.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzb);
            int i7 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i7;
            this.zzd = zzb >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i7];
            for (int i10 = 0; i10 < this.zzd; i10++) {
                zArr[zzcj.zza(i10 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = z8;
        } catch (ArithmeticException e2) {
            throw new IllegalArgumentException(o.l(cArr.length, "Illegal alphabet length "), e2);
        }
    }

    public static /* bridge */ /* synthetic */ char[] zzd(zzcd zzcdVar) {
        return zzcdVar.zzf;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcd) {
            zzcd zzcdVar = (zzcd) obj;
            if (this.zzh == zzcdVar.zzh && Arrays.equals(this.zzf, zzcdVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzh ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i7) {
        return this.zzf[i7];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    public final zzcd zzb() {
        int i7;
        boolean z8;
        int i10 = 0;
        for (char c10 : this.zzf) {
            if (zzad.zza(c10)) {
                char[] cArr = this.zzf;
                int length = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z8 = false;
                        break;
                    }
                    char c11 = cArr[i11];
                    if (c11 >= 'A' && c11 <= 'Z') {
                        z8 = true;
                        break;
                    }
                    i11++;
                }
                if (z8) {
                    throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                }
                char[] cArr2 = new char[this.zzf.length];
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i10 >= cArr3.length) {
                        break;
                    }
                    char c12 = cArr3[i10];
                    if (zzad.zza(c12)) {
                        c12 ^= 32;
                    }
                    cArr2[i10] = (char) c12;
                    i10++;
                }
                zzcd zzcdVar = new zzcd(this.zze.concat(".upperCase()"), cArr2);
                if (!this.zzh || zzcdVar.zzh) {
                    return zzcdVar;
                }
                byte[] bArr = zzcdVar.zzg;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                for (i7 = 65; i7 <= 90; i7++) {
                    int i12 = i7 | 32;
                    byte[] bArr2 = zzcdVar.zzg;
                    byte b2 = bArr2[i7];
                    byte b10 = bArr2[i12];
                    if (b2 == -1) {
                        copyOf[i7] = b10;
                    } else {
                        char c13 = (char) i7;
                        char c14 = (char) i12;
                        if (b10 != -1) {
                            throw new IllegalStateException(zzaq.zza("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c13), Character.valueOf(c14)));
                        }
                        copyOf[i12] = b2;
                    }
                }
                return new zzcd(zzcdVar.zze.concat(".ignoreCase()"), zzcdVar.zzf, copyOf, true);
            }
        }
        return this;
    }

    public final boolean zzc(char c10) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }
}
