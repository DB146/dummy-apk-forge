package com.google.ads.interactivemedia.v3.internal;

import X.c;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzahk {
    private static final zzahk zza = new zzahk(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzahk() {
        this(0, new int[8], new Object[8], true);
    }

    private zzahk(int i7, int[] iArr, Object[] objArr, boolean z8) {
        this.zze = -1;
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z8;
    }

    public static zzahk zzc() {
        return zza;
    }

    public static zzahk zze(zzahk zzahkVar, zzahk zzahkVar2) {
        int i7 = zzahkVar.zzb + zzahkVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzahkVar.zzc, i7);
        System.arraycopy(zzahkVar2.zzc, 0, copyOf, zzahkVar.zzb, zzahkVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzahkVar.zzd, i7);
        System.arraycopy(zzahkVar2.zzd, 0, copyOf2, zzahkVar.zzb, zzahkVar2.zzb);
        return new zzahk(i7, copyOf, copyOf2, true);
    }

    public static zzahk zzf() {
        return new zzahk(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i7) {
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
        if (obj == null || !(obj instanceof zzahk)) {
            return false;
        }
        zzahk zzahkVar = (zzahk) obj;
        int i7 = this.zzb;
        if (i7 == zzahkVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzahkVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzahkVar.zzd;
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

    public final int zza() {
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                i10 = c.r(i13 << 3, zzaea.zzy(((Long) this.zzd[i11]).longValue()), i10);
            } else if (i14 == 1) {
                ((Long) this.zzd[i11]).getClass();
                i10 = c.r(i13 << 3, 8, i10);
            } else if (i14 == 2) {
                zzadr zzadrVar = (zzadr) this.zzd[i11];
                int i15 = zzaea.zzb;
                int zzd = zzadrVar.zzd();
                i10 = c.r(i13 << 3, zzaea.zzx(zzd) + zzd, i10);
            } else if (i14 == 3) {
                int i16 = i13 << 3;
                int i17 = zzaea.zzb;
                int zza2 = ((zzahk) this.zzd[i11]).zza();
                int zzx = zzaea.zzx(i16);
                i10 = zzx + zzx + zza2 + i10;
            } else {
                if (i14 != 5) {
                    throw new IllegalStateException(zzafc.zza());
                }
                ((Integer) this.zzd[i11]).getClass();
                i10 = c.r(i13 << 3, 4, i10);
            }
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
            int i12 = this.zzc[i11] >>> 3;
            zzadr zzadrVar = (zzadr) this.zzd[i11];
            int i13 = zzaea.zzb;
            int zzd = zzadrVar.zzd();
            int zzx = zzaea.zzx(zzd) + zzd;
            int zzx2 = zzaea.zzx(16);
            int zzx3 = zzaea.zzx(i12);
            int zzx4 = zzaea.zzx(8);
            i10 = c.s(24, zzx, zzx2 + zzx3 + zzx4 + zzx4, i10);
        }
        this.zze = i10;
        return i10;
    }

    public final zzahk zzd(zzahk zzahkVar) {
        if (zzahkVar.equals(zza)) {
            return this;
        }
        zzg();
        int i7 = this.zzb + zzahkVar.zzb;
        zzl(i7);
        System.arraycopy(zzahkVar.zzc, 0, this.zzc, this.zzb, zzahkVar.zzb);
        System.arraycopy(zzahkVar.zzd, 0, this.zzd, this.zzb, zzahkVar.zzb);
        this.zzb = i7;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i7) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzagb.zzb(sb2, i7, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzj(int i7, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i7;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zzk(zzaib zzaibVar) {
        if (this.zzb != 0) {
            for (int i7 = 0; i7 < this.zzb; i7++) {
                int i10 = this.zzc[i7];
                Object obj = this.zzd[i7];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    zzaibVar.zzt(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zzaibVar.zzm(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zzaibVar.zzd(i12, (zzadr) obj);
                } else if (i11 == 3) {
                    zzaibVar.zzE(i12);
                    ((zzahk) obj).zzk(zzaibVar);
                    zzaibVar.zzh(i12);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(zzafc.zza());
                    }
                    zzaibVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }
}
