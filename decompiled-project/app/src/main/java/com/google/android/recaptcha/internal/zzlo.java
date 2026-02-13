package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes.dex */
final class zzlo implements zzpy {
    private final zzln zza;

    private zzlo(zzln zzlnVar) {
        byte[] bArr = zznl.zzb;
        this.zza = zzlnVar;
        zzlnVar.zza = this;
    }

    public static zzlo zza(zzln zzlnVar) {
        zzlo zzloVar = zzlnVar.zza;
        return zzloVar != null ? zzloVar : new zzlo(zzlnVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzA(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zznx)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzh(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            this.zza.zzt(i11);
            while (i10 < list.size()) {
                this.zza.zzi(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z8) {
            while (i10 < zznxVar.size()) {
                this.zza.zzh(i7, zznxVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zznxVar.size(); i14++) {
            zznxVar.zze(i14);
            i13 += 8;
        }
        this.zza.zzt(i13);
        while (i10 < zznxVar.size()) {
            this.zza.zzi(zznxVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzB(int i7, int i10) {
        this.zza.zzs(i7, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzC(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzne)) {
            if (!z8) {
                while (i10 < list.size()) {
                    zzln zzlnVar = this.zza;
                    int intValue = ((Integer) list.get(i10)).intValue();
                    zzlnVar.zzs(i7, (intValue >> 31) ^ (intValue + intValue));
                    i10++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue2 = ((Integer) list.get(i12)).intValue();
                i11 += zzln.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            this.zza.zzt(i11);
            while (i10 < list.size()) {
                zzln zzlnVar2 = this.zza;
                int intValue3 = ((Integer) list.get(i10)).intValue();
                zzlnVar2.zzt((intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z8) {
            while (i10 < zzneVar.size()) {
                zzln zzlnVar3 = this.zza;
                int zze = zzneVar.zze(i10);
                zzlnVar3.zzs(i7, (zze >> 31) ^ (zze + zze));
                i10++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzneVar.size(); i14++) {
            int zze2 = zzneVar.zze(i14);
            i13 += zzln.zzA((zze2 >> 31) ^ (zze2 + zze2));
        }
        this.zza.zzt(i13);
        while (i10 < zzneVar.size()) {
            zzln zzlnVar4 = this.zza;
            int zze3 = zzneVar.zze(i10);
            zzlnVar4.zzt((zze3 >> 31) ^ (zze3 + zze3));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzD(int i7, long j) {
        this.zza.zzu(i7, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzE(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zznx)) {
            if (!z8) {
                while (i10 < list.size()) {
                    zzln zzlnVar = this.zza;
                    long longValue = ((Long) list.get(i10)).longValue();
                    zzlnVar.zzu(i7, (longValue >> 63) ^ (longValue + longValue));
                    i10++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long longValue2 = ((Long) list.get(i12)).longValue();
                i11 += zzln.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            this.zza.zzt(i11);
            while (i10 < list.size()) {
                zzln zzlnVar2 = this.zza;
                long longValue3 = ((Long) list.get(i10)).longValue();
                zzlnVar2.zzv((longValue3 >> 63) ^ (longValue3 + longValue3));
                i10++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z8) {
            while (i10 < zznxVar.size()) {
                zzln zzlnVar3 = this.zza;
                long zze = zznxVar.zze(i10);
                zzlnVar3.zzu(i7, (zze >> 63) ^ (zze + zze));
                i10++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zznxVar.size(); i14++) {
            long zze2 = zznxVar.zze(i14);
            i13 += zzln.zzB((zze2 >> 63) ^ (zze2 + zze2));
        }
        this.zza.zzt(i13);
        while (i10 < zznxVar.size()) {
            zzln zzlnVar4 = this.zza;
            long zze3 = zznxVar.zze(i10);
            zzlnVar4.zzv((zze3 >> 63) ^ (zze3 + zze3));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    @Deprecated
    public final void zzF(int i7) {
        this.zza.zzr(i7, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzG(int i7, String str) {
        this.zza.zzp(i7, str);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzH(int i7, List list) {
        int i10 = 0;
        if (!(list instanceof zznu)) {
            while (i10 < list.size()) {
                this.zza.zzp(i7, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zznu zznuVar = (zznu) list;
        while (i10 < list.size()) {
            Object zzc = zznuVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzp(i7, (String) zzc);
            } else {
                this.zza.zze(i7, (zzle) zzc);
            }
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzI(int i7, int i10) {
        this.zza.zzs(i7, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzJ(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzne)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzs(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzln.zzA(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzt(i11);
            while (i10 < list.size()) {
                this.zza.zzt(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z8) {
            while (i10 < zzneVar.size()) {
                this.zza.zzs(i7, zzneVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzneVar.size(); i14++) {
            i13 += zzln.zzA(zzneVar.zze(i14));
        }
        this.zza.zzt(i13);
        while (i10 < zzneVar.size()) {
            this.zza.zzt(zzneVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzK(int i7, long j) {
        this.zza.zzu(i7, j);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzL(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zznx)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzu(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzln.zzB(((Long) list.get(i12)).longValue());
            }
            this.zza.zzt(i11);
            while (i10 < list.size()) {
                this.zza.zzv(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z8) {
            while (i10 < zznxVar.size()) {
                this.zza.zzu(i7, zznxVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zznxVar.size(); i14++) {
            i13 += zzln.zzB(zznxVar.zze(i14));
        }
        this.zza.zzt(i13);
        while (i10 < zznxVar.size()) {
            this.zza.zzv(zznxVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzb(int i7, boolean z8) {
        this.zza.zzd(i7, z8);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzc(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzkv)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzd(i7, ((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Boolean) list.get(i12)).getClass();
                i11++;
            }
            this.zza.zzt(i11);
            while (i10 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        zzkv zzkvVar = (zzkv) list;
        if (!z8) {
            while (i10 < zzkvVar.size()) {
                this.zza.zzd(i7, zzkvVar.zzf(i10));
                i10++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzkvVar.size(); i14++) {
            zzkvVar.zzf(i14);
            i13++;
        }
        this.zza.zzt(i13);
        while (i10 < zzkvVar.size()) {
            this.zza.zzb(zzkvVar.zzf(i10) ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzd(int i7, zzle zzleVar) {
        this.zza.zze(i7, zzleVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zze(int i7, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zze(i7, (zzle) list.get(i10));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzf(int i7, double d10) {
        this.zza.zzh(i7, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzg(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzmi)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzh(i7, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Double) list.get(i12)).getClass();
                i11 += 8;
            }
            this.zza.zzt(i11);
            while (i10 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        zzmi zzmiVar = (zzmi) list;
        if (!z8) {
            while (i10 < zzmiVar.size()) {
                this.zza.zzh(i7, Double.doubleToRawLongBits(zzmiVar.zze(i10)));
                i10++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzmiVar.size(); i14++) {
            zzmiVar.zze(i14);
            i13 += 8;
        }
        this.zza.zzt(i13);
        while (i10 < zzmiVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzmiVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    @Deprecated
    public final void zzh(int i7) {
        this.zza.zzr(i7, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzi(int i7, int i10) {
        this.zza.zzj(i7, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzj(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzne)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzj(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzln.zzB(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzt(i11);
            while (i10 < list.size()) {
                this.zza.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z8) {
            while (i10 < zzneVar.size()) {
                this.zza.zzj(i7, zzneVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzneVar.size(); i14++) {
            i13 += zzln.zzB(zzneVar.zze(i14));
        }
        this.zza.zzt(i13);
        while (i10 < zzneVar.size()) {
            this.zza.zzk(zzneVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzk(int i7, int i10) {
        this.zza.zzf(i7, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzl(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzne)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzf(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            this.zza.zzt(i11);
            while (i10 < list.size()) {
                this.zza.zzg(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z8) {
            while (i10 < zzneVar.size()) {
                this.zza.zzf(i7, zzneVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzneVar.size(); i14++) {
            zzneVar.zze(i14);
            i13 += 4;
        }
        this.zza.zzt(i13);
        while (i10 < zzneVar.size()) {
            this.zza.zzg(zzneVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzm(int i7, long j) {
        this.zza.zzh(i7, j);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzn(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zznx)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzh(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            this.zza.zzt(i11);
            while (i10 < list.size()) {
                this.zza.zzi(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z8) {
            while (i10 < zznxVar.size()) {
                this.zza.zzh(i7, zznxVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zznxVar.size(); i14++) {
            zznxVar.zze(i14);
            i13 += 8;
        }
        this.zza.zzt(i13);
        while (i10 < zznxVar.size()) {
            this.zza.zzi(zznxVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzo(int i7, float f4) {
        this.zza.zzf(i7, Float.floatToRawIntBits(f4));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzp(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzmv)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzf(i7, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Float) list.get(i12)).getClass();
                i11 += 4;
            }
            this.zza.zzt(i11);
            while (i10 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        zzmv zzmvVar = (zzmv) list;
        if (!z8) {
            while (i10 < zzmvVar.size()) {
                this.zza.zzf(i7, Float.floatToRawIntBits(zzmvVar.zze(i10)));
                i10++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzmvVar.size(); i14++) {
            zzmvVar.zze(i14);
            i13 += 4;
        }
        this.zza.zzt(i13);
        while (i10 < zzmvVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzmvVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzq(int i7, Object obj, zzow zzowVar) {
        zzln zzlnVar = this.zza;
        zzlnVar.zzr(i7, 3);
        zzowVar.zzj((zzoi) obj, zzlnVar.zza);
        zzlnVar.zzr(i7, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzr(int i7, int i10) {
        this.zza.zzj(i7, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzs(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzne)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzj(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzln.zzB(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzt(i11);
            while (i10 < list.size()) {
                this.zza.zzk(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z8) {
            while (i10 < zzneVar.size()) {
                this.zza.zzj(i7, zzneVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzneVar.size(); i14++) {
            i13 += zzln.zzB(zzneVar.zze(i14));
        }
        this.zza.zzt(i13);
        while (i10 < zzneVar.size()) {
            this.zza.zzk(zzneVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzt(int i7, long j) {
        this.zza.zzu(i7, j);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzu(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zznx)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzu(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzln.zzB(((Long) list.get(i12)).longValue());
            }
            this.zza.zzt(i11);
            while (i10 < list.size()) {
                this.zza.zzv(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z8) {
            while (i10 < zznxVar.size()) {
                this.zza.zzu(i7, zznxVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zznxVar.size(); i14++) {
            i13 += zzln.zzB(zznxVar.zze(i14));
        }
        this.zza.zzt(i13);
        while (i10 < zznxVar.size()) {
            this.zza.zzv(zznxVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzv(int i7, Object obj, zzow zzowVar) {
        this.zza.zzm(i7, (zzoi) obj, zzowVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzw(int i7, Object obj) {
        if (obj instanceof zzle) {
            this.zza.zzo(i7, (zzle) obj);
        } else {
            this.zza.zzn(i7, (zzoi) obj);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzx(int i7, int i10) {
        this.zza.zzf(i7, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzy(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzne)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzf(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            this.zza.zzt(i11);
            while (i10 < list.size()) {
                this.zza.zzg(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z8) {
            while (i10 < zzneVar.size()) {
                this.zza.zzf(i7, zzneVar.zze(i10));
                i10++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzneVar.size(); i14++) {
            zzneVar.zze(i14);
            i13 += 4;
        }
        this.zza.zzt(i13);
        while (i10 < zzneVar.size()) {
            this.zza.zzg(zzneVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzz(int i7, long j) {
        this.zza.zzh(i7, j);
    }
}
