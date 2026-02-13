package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzann {
    private static final zzann zza = new zzann(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzann() {
        this(0, new int[8], new Object[8], true);
    }

    private zzann(int i7, int[] iArr, Object[] objArr, boolean z8) {
        this.zze = -1;
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z8;
    }

    public static zzann zza(zzann zzannVar, zzann zzannVar2) {
        int i7 = zzannVar.zzb + zzannVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzannVar.zzc, i7);
        System.arraycopy(zzannVar2.zzc, 0, copyOf, zzannVar.zzb, zzannVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzannVar.zzd, i7);
        System.arraycopy(zzannVar2.zzd, 0, copyOf2, zzannVar.zzb, zzannVar2.zzb);
        return new zzann(i7, copyOf, copyOf2, true);
    }

    private final void zza(int i7) {
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

    private static void zza(int i7, Object obj, zzaof zzaofVar) {
        int i10 = i7 >>> 3;
        int i11 = i7 & 7;
        if (i11 == 0) {
            zzaofVar.zzb(i10, ((Long) obj).longValue());
            return;
        }
        if (i11 == 1) {
            zzaofVar.zza(i10, ((Long) obj).longValue());
            return;
        }
        if (i11 == 2) {
            zzaofVar.zza(i10, (zzajp) obj);
            return;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw new RuntimeException(zzalf.zza());
            }
            zzaofVar.zzb(i10, ((Integer) obj).intValue());
        } else if (zzaofVar.zza() == 1) {
            zzaofVar.zzb(i10);
            ((zzann) obj).zzb(zzaofVar);
            zzaofVar.zza(i10);
        } else {
            zzaofVar.zza(i10);
            ((zzann) obj).zzb(zzaofVar);
            zzaofVar.zzb(i10);
        }
    }

    public static zzann zzc() {
        return zza;
    }

    public static zzann zzd() {
        return new zzann();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzann)) {
            return false;
        }
        zzann zzannVar = (zzann) obj;
        int i7 = this.zzb;
        if (i7 == zzannVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzannVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzannVar.zzd;
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
        int zze;
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
                zze = zzakg.zze(i13, ((Long) this.zzd[i11]).longValue());
            } else if (i14 == 1) {
                zze = zzakg.zza(i13, ((Long) this.zzd[i11]).longValue());
            } else if (i14 == 2) {
                zze = zzakg.zza(i13, (zzajp) this.zzd[i11]);
            } else if (i14 == 3) {
                i10 = ((zzann) this.zzd[i11]).zza() + (zzakg.zzi(i13) << 1) + i10;
            } else {
                if (i14 != 5) {
                    throw new IllegalStateException(zzalf.zza());
                }
                zze = zzakg.zzc(i13, ((Integer) this.zzd[i11]).intValue());
            }
            i10 = zze + i10;
        }
        this.zze = i10;
        return i10;
    }

    public final zzann zza(zzann zzannVar) {
        if (zzannVar.equals(zza)) {
            return this;
        }
        zzf();
        int i7 = this.zzb + zzannVar.zzb;
        zza(i7);
        System.arraycopy(zzannVar.zzc, 0, this.zzc, this.zzb, zzannVar.zzb);
        System.arraycopy(zzannVar.zzd, 0, this.zzd, this.zzb, zzannVar.zzb);
        this.zzb = i7;
        return this;
    }

    public final void zza(int i7, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i7;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zza(zzaof zzaofVar) {
        if (zzaofVar.zza() == 2) {
            for (int i7 = this.zzb - 1; i7 >= 0; i7--) {
                zzaofVar.zza(this.zzc[i7] >>> 3, this.zzd[i7]);
            }
            return;
        }
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzaofVar.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zza(StringBuilder sb2, int i7) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzamh.zza(sb2, i7, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final int zzb() {
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            i10 += zzakg.zzb(this.zzc[i11] >>> 3, (zzajp) this.zzd[i11]);
        }
        this.zze = i10;
        return i10;
    }

    public final void zzb(zzaof zzaofVar) {
        if (this.zzb == 0) {
            return;
        }
        if (zzaofVar.zza() == 1) {
            for (int i7 = 0; i7 < this.zzb; i7++) {
                zza(this.zzc[i7], this.zzd[i7], zzaofVar);
            }
            return;
        }
        for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
            zza(this.zzc[i10], this.zzd[i10], zzaofVar);
        }
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }
}
