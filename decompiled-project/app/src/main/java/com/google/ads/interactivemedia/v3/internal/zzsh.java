package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzsh extends AbstractMap implements Serializable, zzrt {
    transient Object[] zza;
    transient Object[] zzb;
    transient int zzc;
    transient int zzd;
    private transient int[] zze;
    private transient int[] zzf;
    private transient int[] zzg;
    private transient int[] zzh;
    private transient int zzi;
    private transient int zzj;
    private transient int[] zzk;
    private transient int[] zzl;
    private transient Set zzm;
    private transient Set zzn;
    private transient Set zzo;
    private transient zzrt zzp;

    private zzsh(int i7) {
        int zza = zzsi.zza(2, 1.0d);
        this.zzc = 0;
        this.zza = new Object[2];
        this.zzb = new Object[2];
        this.zze = zzy(zza);
        this.zzf = zzy(zza);
        this.zzg = zzy(2);
        this.zzh = zzy(2);
        this.zzi = -2;
        this.zzj = -2;
        this.zzk = zzy(2);
        this.zzl = zzy(2);
    }

    public static /* bridge */ /* synthetic */ int zza(zzsh zzshVar) {
        return zzshVar.zzi;
    }

    public static zzsh zzf(int i7) {
        return new zzsh(2);
    }

    public static /* bridge */ /* synthetic */ int[] zzn(zzsh zzshVar) {
        return zzshVar.zzl;
    }

    private final int zzo(int i7) {
        return i7 & (this.zze.length - 1);
    }

    private final void zzp(int i7, int i10) {
        zzrm.zzd(i7 != -1);
        int zzo = zzo(i10);
        int[] iArr = this.zze;
        int i11 = iArr[zzo];
        if (i11 == i7) {
            int[] iArr2 = this.zzg;
            iArr[zzo] = iArr2[i7];
            iArr2[i7] = -1;
            return;
        }
        int i12 = this.zzg[i11];
        while (true) {
            int i13 = i11;
            i11 = i12;
            if (i11 == -1) {
                throw new AssertionError("Expected to find entry with key ".concat(String.valueOf(this.zza[i7])));
            }
            if (i11 == i7) {
                int[] iArr3 = this.zzg;
                iArr3[i13] = iArr3[i7];
                iArr3[i7] = -1;
                return;
            }
            i12 = this.zzg[i11];
        }
    }

    private final void zzq(int i7, int i10) {
        zzrm.zzd(i7 != -1);
        int zzo = zzo(i10);
        int[] iArr = this.zzf;
        int i11 = iArr[zzo];
        if (i11 == i7) {
            int[] iArr2 = this.zzh;
            iArr[zzo] = iArr2[i7];
            iArr2[i7] = -1;
            return;
        }
        int i12 = this.zzh[i11];
        while (true) {
            int i13 = i11;
            i11 = i12;
            if (i11 == -1) {
                throw new AssertionError("Expected to find entry with value ".concat(String.valueOf(this.zzb[i7])));
            }
            if (i11 == i7) {
                int[] iArr3 = this.zzh;
                iArr3[i13] = iArr3[i7];
                iArr3[i7] = -1;
                return;
            }
            i12 = this.zzh[i11];
        }
    }

    private final void zzr(int i7) {
        int length = this.zzg.length;
        if (length < i7) {
            int zza = zzsj.zza(length, i7);
            this.zza = Arrays.copyOf(this.zza, zza);
            this.zzb = Arrays.copyOf(this.zzb, zza);
            this.zzg = zzz(this.zzg, zza);
            this.zzh = zzz(this.zzh, zza);
            this.zzk = zzz(this.zzk, zza);
            this.zzl = zzz(this.zzl, zza);
        }
        if (this.zze.length < i7) {
            int zza2 = zzsi.zza(i7, 1.0d);
            this.zze = zzy(zza2);
            this.zzf = zzy(zza2);
            for (int i10 = 0; i10 < this.zzc; i10++) {
                int zzo = zzo(zzsi.zzc(this.zza[i10]));
                int[] iArr = this.zzg;
                int[] iArr2 = this.zze;
                iArr[i10] = iArr2[zzo];
                iArr2[zzo] = i10;
                int zzo2 = zzo(zzsi.zzc(this.zzb[i10]));
                int[] iArr3 = this.zzh;
                int[] iArr4 = this.zzf;
                iArr3[i10] = iArr4[zzo2];
                iArr4[zzo2] = i10;
            }
        }
    }

    private final void zzs(int i7, int i10) {
        zzrm.zzd(i7 != -1);
        int zzo = zzo(i10);
        int[] iArr = this.zzg;
        int[] iArr2 = this.zze;
        iArr[i7] = iArr2[zzo];
        iArr2[zzo] = i7;
    }

    private final void zzt(int i7, int i10) {
        zzrm.zzd(i7 != -1);
        int zzo = zzo(i10);
        int[] iArr = this.zzh;
        int[] iArr2 = this.zzf;
        iArr[i7] = iArr2[zzo];
        iArr2[zzo] = i7;
    }

    private final void zzu(int i7, int i10, int i11) {
        int i12;
        int i13;
        zzrm.zzd(i7 != -1);
        zzp(i7, i10);
        zzq(i7, i11);
        zzx(this.zzk[i7], this.zzl[i7]);
        int i14 = this.zzc - 1;
        if (i14 != i7) {
            int i15 = this.zzk[i14];
            int i16 = this.zzl[i14];
            zzx(i15, i7);
            zzx(i7, i16);
            Object[] objArr = this.zza;
            Object obj = objArr[i14];
            Object[] objArr2 = this.zzb;
            Object obj2 = objArr2[i14];
            objArr[i7] = obj;
            objArr2[i7] = obj2;
            int zzo = zzo(zzsi.zzc(obj));
            int[] iArr = this.zze;
            int i17 = iArr[zzo];
            if (i17 == i14) {
                iArr[zzo] = i7;
            } else {
                int i18 = this.zzg[i17];
                while (true) {
                    i12 = i17;
                    i17 = i18;
                    if (i17 == i14) {
                        break;
                    } else {
                        i18 = this.zzg[i17];
                    }
                }
                this.zzg[i12] = i7;
            }
            int[] iArr2 = this.zzg;
            iArr2[i7] = iArr2[i14];
            iArr2[i14] = -1;
            int zzo2 = zzo(zzsi.zzc(obj2));
            int[] iArr3 = this.zzf;
            int i19 = iArr3[zzo2];
            if (i19 == i14) {
                iArr3[zzo2] = i7;
            } else {
                int i20 = this.zzh[i19];
                while (true) {
                    i13 = i19;
                    i19 = i20;
                    if (i19 == i14) {
                        break;
                    } else {
                        i20 = this.zzh[i19];
                    }
                }
                this.zzh[i13] = i7;
            }
            int[] iArr4 = this.zzh;
            iArr4[i7] = iArr4[i14];
            iArr4[i14] = -1;
        }
        Object[] objArr3 = this.zza;
        int i21 = this.zzc - 1;
        objArr3[i21] = null;
        this.zzb[i21] = null;
        this.zzc = i21;
        this.zzd++;
    }

    public final void zzv(int i7, Object obj, boolean z8) {
        zzrm.zzd(i7 != -1);
        int zzc = zzc(obj, zzsi.zzc(obj));
        int i10 = this.zzj;
        if (zzc != -1) {
            throw new IllegalArgumentException("Key already present in map: ".concat(String.valueOf(obj)));
        }
        if (i10 == i7) {
            i10 = this.zzk[i7];
        } else if (i10 == this.zzc) {
            i10 = zzc;
        }
        if (i7 == -2) {
            zzc = this.zzl[-2];
        } else if (this.zzc != -2) {
            zzc = -2;
        }
        zzx(this.zzk[i7], this.zzl[i7]);
        zzp(i7, zzsi.zzc(this.zza[i7]));
        this.zza[i7] = obj;
        zzs(i7, zzsi.zzc(obj));
        zzx(i10, i7);
        zzx(i7, zzc);
    }

    public final void zzw(int i7, Object obj, boolean z8) {
        zzrm.zzd(i7 != -1);
        int zzc = zzsi.zzc(obj);
        if (zzd(obj, zzc) != -1) {
            throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(obj)));
        }
        zzq(i7, zzsi.zzc(this.zzb[i7]));
        this.zzb[i7] = obj;
        zzt(i7, zzc);
    }

    private final void zzx(int i7, int i10) {
        if (i7 == -2) {
            this.zzi = i10;
        } else {
            this.zzl[i7] = i10;
        }
        if (i10 == -2) {
            this.zzj = i7;
        } else {
            this.zzk[i10] = i7;
        }
    }

    private static int[] zzy(int i7) {
        int[] iArr = new int[i7];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static int[] zzz(int[] iArr, int i7) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i7);
        Arrays.fill(copyOf, length, i7, -1);
        return copyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.zza, 0, this.zzc, (Object) null);
        Arrays.fill(this.zzb, 0, this.zzc, (Object) null);
        Arrays.fill(this.zze, -1);
        Arrays.fill(this.zzf, -1);
        Arrays.fill(this.zzg, 0, this.zzc, -1);
        Arrays.fill(this.zzh, 0, this.zzc, -1);
        Arrays.fill(this.zzk, 0, this.zzc, -1);
        Arrays.fill(this.zzl, 0, this.zzc, -1);
        this.zzc = 0;
        this.zzi = -2;
        this.zzj = -2;
        this.zzd++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzc(obj, zzsi.zzc(obj)) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return zzd(obj, zzsi.zzc(obj)) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzo;
        if (set != null) {
            return set;
        }
        zzsa zzsaVar = new zzsa(this);
        this.zzo = zzsaVar;
        return zzsaVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int zzc = zzc(obj, zzsi.zzc(obj));
        if (zzc == -1) {
            return null;
        }
        return this.zzb[zzc];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzm;
        if (set != null) {
            return set;
        }
        zzsd zzsdVar = new zzsd(this);
        this.zzm = zzsdVar;
        return zzsdVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return zzg(obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int zzc = zzsi.zzc(obj);
        int zzc2 = zzc(obj, zzc);
        if (zzc2 == -1) {
            return null;
        }
        Object obj2 = this.zzb[zzc2];
        zzl(zzc2, zzc);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc;
    }

    public final int zzb(Object obj, int i7, int[] iArr, int[] iArr2, Object[] objArr) {
        int i10 = iArr[zzo(i7)];
        while (i10 != -1) {
            if (zzri.zza(objArr[i10], obj)) {
                return i10;
            }
            i10 = iArr2[i10];
        }
        return -1;
    }

    public final int zzc(Object obj, int i7) {
        return zzb(obj, i7, this.zze, this.zzg, this.zza);
    }

    public final int zzd(Object obj, int i7) {
        return zzb(obj, i7, this.zzf, this.zzh, this.zzb);
    }

    public final zzrt zze() {
        zzrt zzrtVar = this.zzp;
        if (zzrtVar != null) {
            return zzrtVar;
        }
        zzsb zzsbVar = new zzsb(this);
        this.zzp = zzsbVar;
        return zzsbVar;
    }

    public final Object zzg(Object obj, Object obj2, boolean z8) {
        int zzc = zzsi.zzc(obj);
        int zzc2 = zzc(obj, zzc);
        if (zzc2 != -1) {
            Object obj3 = this.zzb[zzc2];
            if (zzri.zza(obj3, obj2)) {
                return obj2;
            }
            zzw(zzc2, obj2, false);
            return obj3;
        }
        int zzc3 = zzsi.zzc(obj2);
        zzrm.zzf(zzd(obj2, zzc3) == -1, "Value already present: %s", obj2);
        zzr(this.zzc + 1);
        Object[] objArr = this.zza;
        int i7 = this.zzc;
        objArr[i7] = obj;
        this.zzb[i7] = obj2;
        zzs(i7, zzc);
        zzt(this.zzc, zzc3);
        zzx(this.zzj, this.zzc);
        zzx(this.zzc, -2);
        this.zzc++;
        this.zzd++;
        return null;
    }

    public final Object zzh(Object obj, Object obj2, boolean z8) {
        int zzc = zzsi.zzc(obj);
        int zzd = zzd(obj, zzc);
        if (zzd != -1) {
            Object obj3 = this.zza[zzd];
            if (zzri.zza(obj3, obj2)) {
                return obj2;
            }
            zzv(zzd, obj2, false);
            return obj3;
        }
        int i7 = this.zzj;
        int zzc2 = zzsi.zzc(obj2);
        zzrm.zzf(zzc(obj2, zzc2) == -1, "Key already present: %s", obj2);
        zzr(this.zzc + 1);
        Object[] objArr = this.zza;
        int i10 = this.zzc;
        objArr[i10] = obj2;
        this.zzb[i10] = obj;
        zzs(i10, zzc2);
        zzt(this.zzc, zzc);
        int i11 = i7 == -2 ? this.zzi : this.zzl[i7];
        zzx(i7, this.zzc);
        zzx(this.zzc, i11);
        this.zzc++;
        this.zzd++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zzi */
    public final Set values() {
        Set set = this.zzn;
        if (set != null) {
            return set;
        }
        zzse zzseVar = new zzse(this);
        this.zzn = zzseVar;
        return zzseVar;
    }

    public final void zzl(int i7, int i10) {
        zzu(i7, i10, zzsi.zzc(this.zzb[i7]));
    }

    public final void zzm(int i7, int i10) {
        zzu(i7, zzsi.zzc(this.zza[i7]), i10);
    }
}
