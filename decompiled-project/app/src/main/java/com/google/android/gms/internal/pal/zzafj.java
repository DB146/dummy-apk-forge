package com.google.android.gms.internal.pal;

import X.c;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzafj {
    private static final zzafj zza = new zzafj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzafj() {
        this(0, new int[8], new Object[8], true);
    }

    private zzafj(int i7, int[] iArr, Object[] objArr, boolean z8) {
        this.zze = -1;
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z8;
    }

    public static zzafj zzc() {
        return zza;
    }

    public static zzafj zzd(zzafj zzafjVar, zzafj zzafjVar2) {
        int i7 = zzafjVar.zzb + zzafjVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzafjVar.zzc, i7);
        System.arraycopy(zzafjVar2.zzc, 0, copyOf, zzafjVar.zzb, zzafjVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzafjVar.zzd, i7);
        System.arraycopy(zzafjVar2.zzd, 0, copyOf2, zzafjVar.zzb, zzafjVar2.zzb);
        return new zzafj(i7, copyOf, copyOf2, true);
    }

    public static zzafj zze() {
        return new zzafj(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzafj)) {
            return false;
        }
        zzafj zzafjVar = (zzafj) obj;
        int i7 = this.zzb;
        if (i7 == zzafjVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzafjVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzafjVar.zzd;
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
        int i10 = (i7 + 527) * 31;
        int[] iArr = this.zzc;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i7; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }

    public final int zza() {
        int zzA;
        int zzB;
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.zzd[i11]).getClass();
                    i10 = c.w(i13 << 3, 8, i10);
                } else if (i14 == 2) {
                    zzaby zzabyVar = (zzaby) this.zzd[i11];
                    int zzA2 = zzach.zzA(i13 << 3);
                    int zzd = zzabyVar.zzd();
                    i10 = c.v(zzd, zzd, zzA2, i10);
                } else if (i14 == 3) {
                    int zzz = zzach.zzz(i13);
                    zzA = zzz + zzz;
                    zzB = ((zzafj) this.zzd[i11]).zza();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(zzadi.zza());
                    }
                    ((Integer) this.zzd[i11]).getClass();
                    i10 = c.w(i13 << 3, 4, i10);
                }
            } else {
                long longValue = ((Long) this.zzd[i11]).longValue();
                zzA = zzach.zzA(i13 << 3);
                zzB = zzach.zzB(longValue);
            }
            i10 = zzB + zzA + i10;
        }
        this.zze = i10;
        return i10;
    }

    public final int zzb() {
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            zzaby zzabyVar = (zzaby) this.zzd[i11];
            int zzA = zzach.zzA(8);
            int zzd = zzabyVar.zzd();
            i10 += zzach.zzA(zzd) + zzd + zzach.zzA(24) + c.w(i12 >>> 3, zzach.zzA(16), zzA + zzA);
        }
        this.zze = i10;
        return i10;
    }

    public final void zzf() {
        this.zzf = false;
    }

    public final void zzg(StringBuilder sb2, int i7) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzaeh.zzb(sb2, i7, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzh(int i7, Object obj) {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i10 = this.zzb;
        int[] iArr = this.zzc;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.zzc = Arrays.copyOf(iArr, i11);
            this.zzd = Arrays.copyOf(this.zzd, i11);
        }
        int[] iArr2 = this.zzc;
        int i12 = this.zzb;
        iArr2[i12] = i7;
        this.zzd[i12] = obj;
        this.zzb = i12 + 1;
    }

    public final void zzi(zzaga zzagaVar) {
        if (this.zzb != 0) {
            for (int i7 = 0; i7 < this.zzb; i7++) {
                int i10 = this.zzc[i7];
                Object obj = this.zzd[i7];
                int i11 = i10 >>> 3;
                int i12 = i10 & 7;
                if (i12 == 0) {
                    zzagaVar.zzt(i11, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzagaVar.zzm(i11, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzagaVar.zzd(i11, (zzaby) obj);
                } else if (i12 == 3) {
                    zzagaVar.zzE(i11);
                    ((zzafj) obj).zzi(zzagaVar);
                    zzagaVar.zzh(i11);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(zzadi.zza());
                    }
                    zzagaVar.zzk(i11, ((Integer) obj).intValue());
                }
            }
        }
    }
}
