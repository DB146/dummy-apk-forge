package com.google.android.gms.internal.pal;

import java.util.List;

/* loaded from: classes.dex */
final class zzaci implements zzaga {
    private final zzach zza;

    private zzaci(zzach zzachVar) {
        zzadg.zzf(zzachVar, "output");
        this.zza = zzachVar;
        zzachVar.zza = this;
    }

    public static zzaci zza(zzach zzachVar) {
        zzaci zzaciVar = zzachVar.zza;
        return zzaciVar != null ? zzaciVar : new zzaci(zzachVar);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzA(int i7, int i10) {
        this.zza.zzp(i7, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzB(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                zzach zzachVar = this.zza;
                int intValue = ((Integer) list.get(i10)).intValue();
                zzachVar.zzp(i7, (intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int intValue2 = ((Integer) list.get(i12)).intValue();
            i11 += zzach.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            zzach zzachVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i10)).intValue();
            zzachVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzC(int i7, long j) {
        this.zza.zzr(i7, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzD(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                zzach zzachVar = this.zza;
                long longValue = ((Long) list.get(i10)).longValue();
                zzachVar.zzr(i7, (longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long longValue2 = ((Long) list.get(i12)).longValue();
            i11 += zzach.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            zzach zzachVar2 = this.zza;
            long longValue3 = ((Long) list.get(i10)).longValue();
            zzachVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    @Deprecated
    public final void zzE(int i7) {
        this.zza.zzo(i7, 3);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzF(int i7, String str) {
        this.zza.zzm(i7, str);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzG(int i7, List list) {
        int i10 = 0;
        if (!(list instanceof zzadn)) {
            while (i10 < list.size()) {
                this.zza.zzm(i7, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzadn zzadnVar = (zzadn) list;
        while (i10 < list.size()) {
            Object zzf = zzadnVar.zzf(i10);
            if (zzf instanceof String) {
                this.zza.zzm(i7, (String) zzf);
            } else {
                this.zza.zze(i7, (zzaby) zzf);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzH(int i7, int i10) {
        this.zza.zzp(i7, i10);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzI(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                this.zza.zzp(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += zzach.zzA(((Integer) list.get(i12)).intValue());
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzq(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzJ(int i7, long j) {
        this.zza.zzr(i7, j);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzK(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                this.zza.zzr(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += zzach.zzB(((Long) list.get(i12)).longValue());
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzs(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzb(int i7, boolean z8) {
        this.zza.zzd(i7, z8);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzc(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                this.zza.zzd(i7, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            i11++;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzd(int i7, zzaby zzabyVar) {
        this.zza.zze(i7, zzabyVar);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zze(int i7, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zze(i7, (zzaby) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzf(int i7, double d10) {
        this.zza.zzh(i7, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzg(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                this.zza.zzh(i7, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    @Deprecated
    public final void zzh(int i7) {
        this.zza.zzo(i7, 4);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzi(int i7, int i10) {
        this.zza.zzj(i7, i10);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzj(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                this.zza.zzj(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += zzach.zzv(((Integer) list.get(i12)).intValue());
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzk(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzk(int i7, int i10) {
        this.zza.zzf(i7, i10);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzl(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                this.zza.zzf(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            i11 += 4;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzg(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzm(int i7, long j) {
        this.zza.zzh(i7, j);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzn(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                this.zza.zzh(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzi(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzo(int i7, float f4) {
        this.zza.zzf(i7, Float.floatToRawIntBits(f4));
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzp(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                this.zza.zzf(i7, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzq(int i7, Object obj, zzaer zzaerVar) {
        zzach zzachVar = this.zza;
        zzachVar.zzo(i7, 3);
        zzaerVar.zzj((zzaef) obj, zzachVar.zza);
        zzachVar.zzo(i7, 4);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzr(int i7, int i10) {
        this.zza.zzj(i7, i10);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzs(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                this.zza.zzj(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += zzach.zzv(((Integer) list.get(i12)).intValue());
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzk(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzt(int i7, long j) {
        this.zza.zzr(i7, j);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzu(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                this.zza.zzr(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += zzach.zzB(((Long) list.get(i12)).longValue());
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzs(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzv(int i7, Object obj, zzaer zzaerVar) {
        Object obj2 = (zzaef) obj;
        zzace zzaceVar = (zzace) this.zza;
        zzaceVar.zzq((i7 << 3) | 2);
        zzabi zzabiVar = (zzabi) obj2;
        int zzap = zzabiVar.zzap();
        if (zzap == -1) {
            zzap = zzaerVar.zza(zzabiVar);
            zzabiVar.zzar(zzap);
        }
        zzaceVar.zzq(zzap);
        zzaerVar.zzj(obj2, zzaceVar.zza);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzw(int i7, int i10) {
        this.zza.zzf(i7, i10);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzx(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                this.zza.zzf(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            i11 += 4;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzg(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzy(int i7, long j) {
        this.zza.zzh(i7, j);
    }

    @Override // com.google.android.gms.internal.pal.zzaga
    public final void zzz(int i7, List list, boolean z8) {
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                this.zza.zzh(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzi(((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
