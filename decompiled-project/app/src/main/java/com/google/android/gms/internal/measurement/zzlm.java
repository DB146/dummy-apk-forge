package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzlm implements zzou {
    private final zzll zza;

    private zzlm(zzll zzllVar) {
        byte[] bArr = zzmo.zzb;
        this.zza = zzllVar;
        zzllVar.zza = this;
    }

    public static zzlm zza(zzll zzllVar) {
        zzlm zzlmVar = zzllVar.zza;
        return zzlmVar != null ? zzlmVar : new zzlm(zzllVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzA(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzmz)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzf(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            zzllVar.zzr(i11);
            while (i10 < list.size()) {
                zzllVar.zzu(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzmz zzmzVar = (zzmz) list;
        if (!z8) {
            while (i10 < zzmzVar.size()) {
                this.zza.zzf(i7, zzmzVar.zzc(i10));
                i10++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzmzVar.size(); i14++) {
            zzmzVar.zzc(i14);
            i13 += 8;
        }
        zzllVar2.zzr(i13);
        while (i10 < zzmzVar.size()) {
            zzllVar2.zzu(zzmzVar.zzc(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzB(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzlx)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzd(i7, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Float) list.get(i12)).getClass();
                i11 += 4;
            }
            zzllVar.zzr(i11);
            while (i10 < list.size()) {
                zzllVar.zzs(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        zzlx zzlxVar = (zzlx) list;
        if (!z8) {
            while (i10 < zzlxVar.size()) {
                this.zza.zzd(i7, Float.floatToRawIntBits(zzlxVar.zze(i10)));
                i10++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzlxVar.size(); i14++) {
            zzlxVar.zze(i14);
            i13 += 4;
        }
        zzllVar2.zzr(i13);
        while (i10 < zzlxVar.size()) {
            zzllVar2.zzs(Float.floatToRawIntBits(zzlxVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzC(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzln)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzf(i7, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Double) list.get(i12)).getClass();
                i11 += 8;
            }
            zzllVar.zzr(i11);
            while (i10 < list.size()) {
                zzllVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        zzln zzlnVar = (zzln) list;
        if (!z8) {
            while (i10 < zzlnVar.size()) {
                this.zza.zzf(i7, Double.doubleToRawLongBits(zzlnVar.zze(i10)));
                i10++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzlnVar.size(); i14++) {
            zzlnVar.zze(i14);
            i13 += 8;
        }
        zzllVar2.zzr(i13);
        while (i10 < zzlnVar.size()) {
            zzllVar2.zzu(Double.doubleToRawLongBits(zzlnVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzD(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzmf)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzb(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzll.zzA(((Integer) list.get(i12)).intValue());
            }
            zzllVar.zzr(i11);
            while (i10 < list.size()) {
                zzllVar.zzq(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z8) {
            while (i10 < zzmfVar.size()) {
                this.zza.zzb(i7, zzmfVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzmfVar.size(); i14++) {
            i13 += zzll.zzA(zzmfVar.zzf(i14));
        }
        zzllVar2.zzr(i13);
        while (i10 < zzmfVar.size()) {
            zzllVar2.zzq(zzmfVar.zzf(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzE(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzkx)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzg(i7, ((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Boolean) list.get(i12)).getClass();
                i11++;
            }
            zzllVar.zzr(i11);
            while (i10 < list.size()) {
                zzllVar.zzp(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        zzkx zzkxVar = (zzkx) list;
        if (!z8) {
            while (i10 < zzkxVar.size()) {
                this.zza.zzg(i7, zzkxVar.zze(i10));
                i10++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzkxVar.size(); i14++) {
            zzkxVar.zze(i14);
            i13++;
        }
        zzllVar2.zzr(i13);
        while (i10 < zzkxVar.size()) {
            zzllVar2.zzp(zzkxVar.zze(i10) ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzF(int i7, List list) {
        int i10 = 0;
        if (!(list instanceof zzmw)) {
            while (i10 < list.size()) {
                this.zza.zzh(i7, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        while (i10 < list.size()) {
            Object zzc = zzmwVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzh(i7, (String) zzc);
            } else {
                this.zza.zzi(i7, (zzlg) zzc);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzG(int i7, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zzi(i7, (zzlg) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzH(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzmf)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzc(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzll.zzz(((Integer) list.get(i12)).intValue());
            }
            zzllVar.zzr(i11);
            while (i10 < list.size()) {
                zzllVar.zzr(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z8) {
            while (i10 < zzmfVar.size()) {
                this.zza.zzc(i7, zzmfVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzmfVar.size(); i14++) {
            i13 += zzll.zzz(zzmfVar.zzf(i14));
        }
        zzllVar2.zzr(i13);
        while (i10 < zzmfVar.size()) {
            zzllVar2.zzr(zzmfVar.zzf(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzI(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzmf)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzd(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            zzllVar.zzr(i11);
            while (i10 < list.size()) {
                zzllVar.zzs(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z8) {
            while (i10 < zzmfVar.size()) {
                this.zza.zzd(i7, zzmfVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzmfVar.size(); i14++) {
            zzmfVar.zzf(i14);
            i13 += 4;
        }
        zzllVar2.zzr(i13);
        while (i10 < zzmfVar.size()) {
            zzllVar2.zzs(zzmfVar.zzf(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzJ(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzmz)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzf(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            zzllVar.zzr(i11);
            while (i10 < list.size()) {
                zzllVar.zzu(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzmz zzmzVar = (zzmz) list;
        if (!z8) {
            while (i10 < zzmzVar.size()) {
                this.zza.zzf(i7, zzmzVar.zzc(i10));
                i10++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzmzVar.size(); i14++) {
            zzmzVar.zzc(i14);
            i13 += 8;
        }
        zzllVar2.zzr(i13);
        while (i10 < zzmzVar.size()) {
            zzllVar2.zzu(zzmzVar.zzc(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzK(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzmf)) {
            if (!z8) {
                while (i10 < list.size()) {
                    zzll zzllVar = this.zza;
                    int intValue = ((Integer) list.get(i10)).intValue();
                    zzllVar.zzc(i7, (intValue >> 31) ^ (intValue + intValue));
                    i10++;
                }
                return;
            }
            zzll zzllVar2 = this.zza;
            zzllVar2.zza(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue2 = ((Integer) list.get(i12)).intValue();
                i11 += zzll.zzz((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzllVar2.zzr(i11);
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                zzllVar2.zzr((intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z8) {
            while (i10 < zzmfVar.size()) {
                zzll zzllVar3 = this.zza;
                int zzf = zzmfVar.zzf(i10);
                zzllVar3.zzc(i7, (zzf >> 31) ^ (zzf + zzf));
                i10++;
            }
            return;
        }
        zzll zzllVar4 = this.zza;
        zzllVar4.zza(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzmfVar.size(); i14++) {
            int zzf2 = zzmfVar.zzf(i14);
            i13 += zzll.zzz((zzf2 >> 31) ^ (zzf2 + zzf2));
        }
        zzllVar4.zzr(i13);
        while (i10 < zzmfVar.size()) {
            int zzf3 = zzmfVar.zzf(i10);
            zzllVar4.zzr((zzf3 >> 31) ^ (zzf3 + zzf3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzL(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzmz)) {
            if (!z8) {
                while (i10 < list.size()) {
                    zzll zzllVar = this.zza;
                    long longValue = ((Long) list.get(i10)).longValue();
                    zzllVar.zze(i7, (longValue >> 63) ^ (longValue + longValue));
                    i10++;
                }
                return;
            }
            zzll zzllVar2 = this.zza;
            zzllVar2.zza(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long longValue2 = ((Long) list.get(i12)).longValue();
                i11 += zzll.zzA((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzllVar2.zzr(i11);
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                zzllVar2.zzt((longValue3 >> 63) ^ (longValue3 + longValue3));
                i10++;
            }
            return;
        }
        zzmz zzmzVar = (zzmz) list;
        if (!z8) {
            while (i10 < zzmzVar.size()) {
                zzll zzllVar3 = this.zza;
                long zzc = zzmzVar.zzc(i10);
                zzllVar3.zze(i7, (zzc >> 63) ^ (zzc + zzc));
                i10++;
            }
            return;
        }
        zzll zzllVar4 = this.zza;
        zzllVar4.zza(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzmzVar.size(); i14++) {
            long zzc2 = zzmzVar.zzc(i14);
            i13 += zzll.zzA((zzc2 >> 63) ^ (zzc2 + zzc2));
        }
        zzllVar4.zzr(i13);
        while (i10 < zzmzVar.size()) {
            long zzc3 = zzmzVar.zzc(i10);
            zzllVar4.zzt((zzc3 >> 63) ^ (zzc3 + zzc3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzM(int i7, zznd zzndVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzll zzllVar = this.zza;
            zzllVar.zza(i7, 2);
            zzllVar.zzr(zzne.zzc(zzndVar, entry.getKey(), entry.getValue()));
            zzne.zzb(zzllVar, zzndVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzb(int i7, int i10) {
        this.zza.zzd(i7, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzc(int i7, long j) {
        this.zza.zze(i7, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzd(int i7, long j) {
        this.zza.zzf(i7, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zze(int i7, float f4) {
        this.zza.zzd(i7, Float.floatToRawIntBits(f4));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzf(int i7, double d10) {
        this.zza.zzf(i7, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzg(int i7, int i10) {
        this.zza.zzb(i7, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzh(int i7, long j) {
        this.zza.zze(i7, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzi(int i7, int i10) {
        this.zza.zzb(i7, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzj(int i7, long j) {
        this.zza.zzf(i7, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzk(int i7, int i10) {
        this.zza.zzd(i7, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzl(int i7, boolean z8) {
        this.zza.zzg(i7, z8);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzm(int i7, String str) {
        this.zza.zzh(i7, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzn(int i7, zzlg zzlgVar) {
        this.zza.zzi(i7, zzlgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzo(int i7, int i10) {
        this.zza.zzc(i7, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzp(int i7, int i10) {
        this.zza.zzc(i7, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzq(int i7, long j) {
        this.zza.zze(i7, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzr(int i7, Object obj, zznw zznwVar) {
        this.zza.zzl(i7, (zznl) obj, zznwVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzs(int i7, Object obj, zznw zznwVar) {
        zzll zzllVar = this.zza;
        zzllVar.zza(i7, 3);
        zznwVar.zzf((zznl) obj, zzllVar.zza);
        zzllVar.zza(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    @Deprecated
    public final void zzt(int i7) {
        this.zza.zza(i7, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    @Deprecated
    public final void zzu(int i7) {
        this.zza.zza(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzv(int i7, Object obj) {
        if (obj instanceof zzlg) {
            this.zza.zzn(i7, (zzlg) obj);
        } else {
            this.zza.zzm(i7, (zznl) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzw(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzmf)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzb(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzll.zzA(((Integer) list.get(i12)).intValue());
            }
            zzllVar.zzr(i11);
            while (i10 < list.size()) {
                zzllVar.zzq(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z8) {
            while (i10 < zzmfVar.size()) {
                this.zza.zzb(i7, zzmfVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzmfVar.size(); i14++) {
            i13 += zzll.zzA(zzmfVar.zzf(i14));
        }
        zzllVar2.zzr(i13);
        while (i10 < zzmfVar.size()) {
            zzllVar2.zzq(zzmfVar.zzf(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzx(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzmf)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzd(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            zzllVar.zzr(i11);
            while (i10 < list.size()) {
                zzllVar.zzs(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzmf zzmfVar = (zzmf) list;
        if (!z8) {
            while (i10 < zzmfVar.size()) {
                this.zza.zzd(i7, zzmfVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzmfVar.size(); i14++) {
            zzmfVar.zzf(i14);
            i13 += 4;
        }
        zzllVar2.zzr(i13);
        while (i10 < zzmfVar.size()) {
            zzllVar2.zzs(zzmfVar.zzf(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzy(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzmz)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zze(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzll.zzA(((Long) list.get(i12)).longValue());
            }
            zzllVar.zzr(i11);
            while (i10 < list.size()) {
                zzllVar.zzt(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzmz zzmzVar = (zzmz) list;
        if (!z8) {
            while (i10 < zzmzVar.size()) {
                this.zza.zze(i7, zzmzVar.zzc(i10));
                i10++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzmzVar.size(); i14++) {
            i13 += zzll.zzA(zzmzVar.zzc(i14));
        }
        zzllVar2.zzr(i13);
        while (i10 < zzmzVar.size()) {
            zzllVar2.zzt(zzmzVar.zzc(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final void zzz(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzmz)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zze(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzll zzllVar = this.zza;
            zzllVar.zza(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzll.zzA(((Long) list.get(i12)).longValue());
            }
            zzllVar.zzr(i11);
            while (i10 < list.size()) {
                zzllVar.zzt(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzmz zzmzVar = (zzmz) list;
        if (!z8) {
            while (i10 < zzmzVar.size()) {
                this.zza.zze(i7, zzmzVar.zzc(i10));
                i10++;
            }
            return;
        }
        zzll zzllVar2 = this.zza;
        zzllVar2.zza(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzmzVar.size(); i14++) {
            i13 += zzll.zzA(zzmzVar.zzc(i14));
        }
        zzllVar2.zzr(i13);
        while (i10 < zzmzVar.size()) {
            zzllVar2.zzt(zzmzVar.zzc(i10));
            i10++;
        }
    }
}
