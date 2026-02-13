package com.google.android.gms.internal.measurement;

import X.c;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzoi {
    private static final zzoi zza = new zzoi(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzoi() {
        this(0, new int[8], new Object[8], true);
    }

    private zzoi(int i7, int[] iArr, Object[] objArr, boolean z8) {
        this.zze = -1;
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z8;
    }

    public static zzoi zza() {
        return zza;
    }

    public static zzoi zzb() {
        return new zzoi(0, new int[8], new Object[8], true);
    }

    public static zzoi zzc(zzoi zzoiVar, zzoi zzoiVar2) {
        int i7 = zzoiVar.zzb + zzoiVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzoiVar.zzc, i7);
        System.arraycopy(zzoiVar2.zzc, 0, copyOf, zzoiVar.zzb, zzoiVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzoiVar.zzd, i7);
        System.arraycopy(zzoiVar2.zzd, 0, copyOf2, zzoiVar.zzb, zzoiVar2.zzb);
        return new zzoi(i7, copyOf, copyOf2, true);
    }

    private final void zzm(int i7) {
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
        if (obj == null || !(obj instanceof zzoi)) {
            return false;
        }
        zzoi zzoiVar = (zzoi) obj;
        int i7 = this.zzb;
        if (i7 == zzoiVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzoiVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzoiVar.zzd;
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
        int i14 = ((i10 * 31) + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf(zzou zzouVar) {
        for (int i7 = 0; i7 < this.zzb; i7++) {
            zzouVar.zzv(this.zzc[i7] >>> 3, this.zzd[i7]);
        }
    }

    public final void zzg(zzou zzouVar) {
        if (this.zzb != 0) {
            for (int i7 = 0; i7 < this.zzb; i7++) {
                int i10 = this.zzc[i7];
                Object obj = this.zzd[i7];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    zzouVar.zzc(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zzouVar.zzj(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zzouVar.zzn(i12, (zzlg) obj);
                } else if (i11 == 3) {
                    zzouVar.zzt(i12);
                    ((zzoi) obj).zzg(zzouVar);
                    zzouVar.zzu(i12);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new zzmp("Protocol message tag had invalid wire type."));
                    }
                    zzouVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzlg zzlgVar = (zzlg) this.zzd[i11];
            int zzz = zzll.zzz(8);
            int zzz2 = zzll.zzz(i12) + zzll.zzz(16);
            int zzz3 = zzll.zzz(24);
            int zzc = zzlgVar.zzc();
            i10 += zzz + zzz + zzz2 + c.u(zzc, zzc, zzz3);
        }
        this.zze = i10;
        return i10;
    }

    public final int zzi() {
        int zzz;
        int zzA;
        int zzz2;
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
                    zzz2 = zzll.zzz(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    zzlg zzlgVar = (zzlg) this.zzd[i11];
                    int zzz3 = zzll.zzz(i15);
                    int zzc = zzlgVar.zzc();
                    i10 = zzll.zzz(zzc) + zzc + zzz3 + i10;
                } else if (i14 == 3) {
                    int zzz4 = zzll.zzz(i13 << 3);
                    zzz = zzz4 + zzz4;
                    zzA = ((zzoi) this.zzd[i11]).zzi();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new zzmp("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i11]).getClass();
                    zzz2 = zzll.zzz(i13 << 3) + 4;
                }
                i10 = zzz2 + i10;
            } else {
                int i16 = i13 << 3;
                long longValue = ((Long) this.zzd[i11]).longValue();
                zzz = zzll.zzz(i16);
                zzA = zzll.zzA(longValue);
            }
            i10 = zzA + zzz + i10;
        }
        this.zze = i10;
        return i10;
    }

    public final void zzj(StringBuilder sb2, int i7) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zznn.zzb(sb2, i7, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzk(int i7, Object obj) {
        zze();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i7;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final zzoi zzl(zzoi zzoiVar) {
        if (zzoiVar.equals(zza)) {
            return this;
        }
        zze();
        int i7 = this.zzb + zzoiVar.zzb;
        zzm(i7);
        System.arraycopy(zzoiVar.zzc, 0, this.zzc, this.zzb, zzoiVar.zzb);
        System.arraycopy(zzoiVar.zzd, 0, this.zzd, this.zzb, zzoiVar.zzb);
        this.zzb = i7;
        return this;
    }
}
