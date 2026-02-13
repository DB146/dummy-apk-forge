package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzha {
    private static final zzha zza = new zzha(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    private zzha() {
        this(0, new int[8], new Object[8], true);
    }

    private zzha(int i7, int[] iArr, Object[] objArr, boolean z8) {
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z8;
    }

    public static zzha zza() {
        return zza;
    }

    public static zzha zzc(zzha zzhaVar, zzha zzhaVar2) {
        int i7 = zzhaVar.zzb + zzhaVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzhaVar.zzc, i7);
        System.arraycopy(zzhaVar2.zzc, 0, copyOf, zzhaVar.zzb, zzhaVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzhaVar.zzd, i7);
        System.arraycopy(zzhaVar2.zzd, 0, copyOf2, zzhaVar.zzb, zzhaVar2.zzb);
        return new zzha(i7, copyOf, copyOf2, true);
    }

    public static zzha zzd() {
        return new zzha(0, new int[8], new Object[8], true);
    }

    private final void zzi(int i7) {
        int[] iArr = this.zzc;
        if (i7 > iArr.length) {
            int i10 = this.zzb;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i7) {
                i7 = i11;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i7);
            this.zzd = Arrays.copyOf(this.zzd, i7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzha)) {
            return false;
        }
        zzha zzhaVar = (zzha) obj;
        int i7 = this.zzb;
        if (i7 == zzhaVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhaVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhaVar.zzd;
                    int i11 = this.zzb;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzb;
        int i10 = i7 + 527;
        int[] iArr = this.zzc;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i7; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 * 31) + i12;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return (i14 * 31) + i11;
    }

    public final zzha zzb(zzha zzhaVar) {
        if (zzhaVar.equals(zza)) {
            return this;
        }
        zze();
        int i7 = this.zzb + zzhaVar.zzb;
        zzi(i7);
        System.arraycopy(zzhaVar.zzc, 0, this.zzc, this.zzb, zzhaVar.zzb);
        System.arraycopy(zzhaVar.zzd, 0, this.zzd, this.zzb, zzhaVar.zzb);
        this.zzb = i7;
        return this;
    }

    public final void zze() {
        if (!this.zze) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf() {
        if (this.zze) {
            this.zze = false;
        }
    }

    public final void zzg(StringBuilder sb2, int i7) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzfz.zzb(sb2, i7, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzh(int i7, Object obj) {
        zze();
        zzi(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i7;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }
}
