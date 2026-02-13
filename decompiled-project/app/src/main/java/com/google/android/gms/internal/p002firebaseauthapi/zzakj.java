package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzakj implements zzaof {
    private final zzakg zza;

    private zzakj(zzakg zzakgVar) {
        zzakg zzakgVar2 = (zzakg) zzalb.zza(zzakgVar, "output");
        this.zza = zzakgVar2;
        zzakgVar2.zze = this;
    }

    public static zzakj zza(zzakg zzakgVar) {
        zzakj zzakjVar = zzakgVar.zze;
        return zzakjVar != null ? zzakjVar : new zzakj(zzakgVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    @Deprecated
    public final void zza(int i7) {
        this.zza.zzk(i7, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i7, double d10) {
        this.zza.zzb(i7, d10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i7, float f4) {
        this.zza.zzb(i7, f4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i7, int i10) {
        this.zza.zzi(i7, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i7, long j) {
        this.zza.zzf(i7, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i7, zzajp zzajpVar) {
        this.zza.zzc(i7, zzajpVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final <K, V> void zza(int i7, zzalx<K, V> zzalxVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzk(i7, 2);
            this.zza.zzn(zzalu.zza(zzalxVar, entry.getKey(), entry.getValue()));
            zzalu.zza(this.zza, zzalxVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i7, Object obj) {
        if (obj instanceof zzajp) {
            this.zza.zzd(i7, (zzajp) obj);
        } else {
            this.zza.zzb(i7, (zzamc) obj);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i7, Object obj, zzamv zzamvVar) {
        zzakg zzakgVar = this.zza;
        zzakgVar.zzk(i7, 3);
        zzamvVar.zza((zzamv) obj, (zzaof) zzakgVar.zze);
        zzakgVar.zzk(i7, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i7, String str) {
        this.zza.zzb(i7, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i7, List<zzajp> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zzc(i7, list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i7, List<?> list, zzamv zzamvVar) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            zza(i7, list.get(i10), zzamvVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i7, List<Boolean> list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzajn)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzb(i7, list.get(i10).booleanValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzakg.zza(list.get(i12).booleanValue());
            }
            this.zza.zzn(i11);
            while (i10 < list.size()) {
                this.zza.zzb(list.get(i10).booleanValue());
                i10++;
            }
            return;
        }
        zzajn zzajnVar = (zzajn) list;
        if (!z8) {
            while (i10 < zzajnVar.size()) {
                this.zza.zzb(i7, zzajnVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzajnVar.size(); i14++) {
            i13 += zzakg.zza(zzajnVar.zzb(i14));
        }
        this.zza.zzn(i13);
        while (i10 < zzajnVar.size()) {
            this.zza.zzb(zzajnVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zza(int i7, boolean z8) {
        this.zza.zzb(i7, z8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    @Deprecated
    public final void zzb(int i7) {
        this.zza.zzk(i7, 3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i7, int i10) {
        this.zza.zzh(i7, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i7, long j) {
        this.zza.zzh(i7, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i7, Object obj, zzamv zzamvVar) {
        this.zza.zzc(i7, (zzamc) obj, zzamvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i7, List<String> list) {
        int i10 = 0;
        if (!(list instanceof zzaln)) {
            while (i10 < list.size()) {
                this.zza.zzb(i7, list.get(i10));
                i10++;
            }
            return;
        }
        zzaln zzalnVar = (zzaln) list;
        while (i10 < list.size()) {
            Object zza = zzalnVar.zza(i10);
            if (zza instanceof String) {
                this.zza.zzb(i7, (String) zza);
            } else {
                this.zza.zzc(i7, (zzajp) zza);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i7, List<?> list, zzamv zzamvVar) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzb(i7, list.get(i10), zzamvVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzb(int i7, List<Double> list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzaki)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzb(i7, list.get(i10).doubleValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzakg.zza(list.get(i12).doubleValue());
            }
            this.zza.zzn(i11);
            while (i10 < list.size()) {
                this.zza.zzb(list.get(i10).doubleValue());
                i10++;
            }
            return;
        }
        zzaki zzakiVar = (zzaki) list;
        if (!z8) {
            while (i10 < zzakiVar.size()) {
                this.zza.zzb(i7, zzakiVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzakiVar.size(); i14++) {
            i13 += zzakg.zza(zzakiVar.zzb(i14));
        }
        this.zza.zzn(i13);
        while (i10 < zzakiVar.size()) {
            this.zza.zzb(zzakiVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzc(int i7, int i10) {
        this.zza.zzi(i7, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzc(int i7, long j) {
        this.zza.zzf(i7, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzc(int i7, List<Integer> list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzakz)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzi(i7, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzakg.zzc(list.get(i12).intValue());
            }
            this.zza.zzn(i11);
            while (i10 < list.size()) {
                this.zza.zzl(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z8) {
            while (i10 < zzakzVar.size()) {
                this.zza.zzi(i7, zzakzVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzakzVar.size(); i14++) {
            i13 += zzakg.zzc(zzakzVar.zzb(i14));
        }
        this.zza.zzn(i13);
        while (i10 < zzakzVar.size()) {
            this.zza.zzl(zzakzVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzd(int i7, int i10) {
        this.zza.zzh(i7, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzd(int i7, long j) {
        this.zza.zzg(i7, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzd(int i7, List<Integer> list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzakz)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzh(i7, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzakg.zzd(list.get(i12).intValue());
            }
            this.zza.zzn(i11);
            while (i10 < list.size()) {
                this.zza.zzk(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z8) {
            while (i10 < zzakzVar.size()) {
                this.zza.zzh(i7, zzakzVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzakzVar.size(); i14++) {
            i13 += zzakg.zzd(zzakzVar.zzb(i14));
        }
        this.zza.zzn(i13);
        while (i10 < zzakzVar.size()) {
            this.zza.zzk(zzakzVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zze(int i7, int i10) {
        this.zza.zzj(i7, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zze(int i7, long j) {
        this.zza.zzh(i7, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zze(int i7, List<Long> list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzalr)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzf(i7, list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzakg.zzc(list.get(i12).longValue());
            }
            this.zza.zzn(i11);
            while (i10 < list.size()) {
                this.zza.zzh(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        if (!z8) {
            while (i10 < zzalrVar.size()) {
                this.zza.zzf(i7, zzalrVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzalrVar.size(); i14++) {
            i13 += zzakg.zzc(zzalrVar.zzb(i14));
        }
        this.zza.zzn(i13);
        while (i10 < zzalrVar.size()) {
            this.zza.zzh(zzalrVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzf(int i7, int i10) {
        this.zza.zzl(i7, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzf(int i7, List<Float> list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzakx)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzb(i7, list.get(i10).floatValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzakg.zza(list.get(i12).floatValue());
            }
            this.zza.zzn(i11);
            while (i10 < list.size()) {
                this.zza.zzb(list.get(i10).floatValue());
                i10++;
            }
            return;
        }
        zzakx zzakxVar = (zzakx) list;
        if (!z8) {
            while (i10 < zzakxVar.size()) {
                this.zza.zzb(i7, zzakxVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzakxVar.size(); i14++) {
            i13 += zzakg.zza(zzakxVar.zzb(i14));
        }
        this.zza.zzn(i13);
        while (i10 < zzakxVar.size()) {
            this.zza.zzb(zzakxVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzg(int i7, List<Integer> list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzakz)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzi(i7, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzakg.zze(list.get(i12).intValue());
            }
            this.zza.zzn(i11);
            while (i10 < list.size()) {
                this.zza.zzl(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z8) {
            while (i10 < zzakzVar.size()) {
                this.zza.zzi(i7, zzakzVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzakzVar.size(); i14++) {
            i13 += zzakg.zze(zzakzVar.zzb(i14));
        }
        this.zza.zzn(i13);
        while (i10 < zzakzVar.size()) {
            this.zza.zzl(zzakzVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzh(int i7, List<Long> list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzalr)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzh(i7, list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzakg.zzd(list.get(i12).longValue());
            }
            this.zza.zzn(i11);
            while (i10 < list.size()) {
                this.zza.zzj(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        if (!z8) {
            while (i10 < zzalrVar.size()) {
                this.zza.zzh(i7, zzalrVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzalrVar.size(); i14++) {
            i13 += zzakg.zzd(zzalrVar.zzb(i14));
        }
        this.zza.zzn(i13);
        while (i10 < zzalrVar.size()) {
            this.zza.zzj(zzalrVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzi(int i7, List<Integer> list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzakz)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzh(i7, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzakg.zzg(list.get(i12).intValue());
            }
            this.zza.zzn(i11);
            while (i10 < list.size()) {
                this.zza.zzk(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z8) {
            while (i10 < zzakzVar.size()) {
                this.zza.zzh(i7, zzakzVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzakzVar.size(); i14++) {
            i13 += zzakg.zzg(zzakzVar.zzb(i14));
        }
        this.zza.zzn(i13);
        while (i10 < zzakzVar.size()) {
            this.zza.zzk(zzakzVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzj(int i7, List<Long> list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzalr)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzf(i7, list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzakg.zze(list.get(i12).longValue());
            }
            this.zza.zzn(i11);
            while (i10 < list.size()) {
                this.zza.zzh(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        if (!z8) {
            while (i10 < zzalrVar.size()) {
                this.zza.zzf(i7, zzalrVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzalrVar.size(); i14++) {
            i13 += zzakg.zze(zzalrVar.zzb(i14));
        }
        this.zza.zzn(i13);
        while (i10 < zzalrVar.size()) {
            this.zza.zzh(zzalrVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzk(int i7, List<Integer> list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzakz)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzj(i7, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzakg.zzh(list.get(i12).intValue());
            }
            this.zza.zzn(i11);
            while (i10 < list.size()) {
                this.zza.zzm(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z8) {
            while (i10 < zzakzVar.size()) {
                this.zza.zzj(i7, zzakzVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzakzVar.size(); i14++) {
            i13 += zzakg.zzh(zzakzVar.zzb(i14));
        }
        this.zza.zzn(i13);
        while (i10 < zzakzVar.size()) {
            this.zza.zzm(zzakzVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzl(int i7, List<Long> list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzalr)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzg(i7, list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzakg.zzf(list.get(i12).longValue());
            }
            this.zza.zzn(i11);
            while (i10 < list.size()) {
                this.zza.zzi(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        if (!z8) {
            while (i10 < zzalrVar.size()) {
                this.zza.zzg(i7, zzalrVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzalrVar.size(); i14++) {
            i13 += zzakg.zzf(zzalrVar.zzb(i14));
        }
        this.zza.zzn(i13);
        while (i10 < zzalrVar.size()) {
            this.zza.zzi(zzalrVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzm(int i7, List<Integer> list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzakz)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzl(i7, list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzakg.zzj(list.get(i12).intValue());
            }
            this.zza.zzn(i11);
            while (i10 < list.size()) {
                this.zza.zzn(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzakz zzakzVar = (zzakz) list;
        if (!z8) {
            while (i10 < zzakzVar.size()) {
                this.zza.zzl(i7, zzakzVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzakzVar.size(); i14++) {
            i13 += zzakg.zzj(zzakzVar.zzb(i14));
        }
        this.zza.zzn(i13);
        while (i10 < zzakzVar.size()) {
            this.zza.zzn(zzakzVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaof
    public final void zzn(int i7, List<Long> list, boolean z8) {
        int i10 = 0;
        if (!(list instanceof zzalr)) {
            if (!z8) {
                while (i10 < list.size()) {
                    this.zza.zzh(i7, list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += zzakg.zzg(list.get(i12).longValue());
            }
            this.zza.zzn(i11);
            while (i10 < list.size()) {
                this.zza.zzj(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzalr zzalrVar = (zzalr) list;
        if (!z8) {
            while (i10 < zzalrVar.size()) {
                this.zza.zzh(i7, zzalrVar.zzb(i10));
                i10++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzalrVar.size(); i14++) {
            i13 += zzakg.zzg(zzalrVar.zzb(i14));
        }
        this.zza.zzn(i13);
        while (i10 < zzalrVar.size()) {
            this.zza.zzj(zzalrVar.zzb(i10));
            i10++;
        }
    }
}
