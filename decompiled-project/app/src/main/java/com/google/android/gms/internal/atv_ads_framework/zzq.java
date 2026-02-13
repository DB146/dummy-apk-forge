package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.gms.common.api.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzq extends zze {
    final CharSequence zzb;
    final zzk zzc;
    int zzd = 0;
    int zze;

    public zzq(zzr zzrVar, CharSequence charSequence) {
        zzk zzkVar;
        zzkVar = zzrVar.zza;
        this.zzc = zzkVar;
        this.zze = f.API_PRIORITY_OTHER;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zze
    public final /* bridge */ /* synthetic */ Object zza() {
        int zzc;
        int i7 = this.zzd;
        while (true) {
            int i10 = this.zzd;
            if (i10 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i10);
            if (zzd == -1) {
                zzd = this.zzb.length();
                this.zzd = -1;
                zzc = -1;
            } else {
                zzc = zzc(zzd);
                this.zzd = zzc;
            }
            if (zzc != i7) {
                if (i7 < zzd) {
                    this.zzb.charAt(i7);
                }
                if (i7 < zzd) {
                    this.zzb.charAt(zzd - 1);
                }
                int i11 = this.zze;
                if (i11 == 1) {
                    zzd = this.zzb.length();
                    this.zzd = -1;
                    if (zzd > i7) {
                        this.zzb.charAt(zzd - 1);
                    }
                } else {
                    this.zze = i11 - 1;
                }
                return this.zzb.subSequence(i7, zzd).toString();
            }
            int i12 = zzc + 1;
            this.zzd = i12;
            if (i12 > this.zzb.length()) {
                this.zzd = -1;
            }
        }
    }

    public abstract int zzc(int i7);

    public abstract int zzd(int i7);
}
