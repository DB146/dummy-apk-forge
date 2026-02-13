package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes.dex */
final class zzo extends zzq {
    final /* synthetic */ zzp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(zzp zzpVar, zzr zzrVar, CharSequence charSequence) {
        super(zzrVar, charSequence);
        this.zza = zzpVar;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzq
    public final int zzc(int i7) {
        return i7 + 1;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzq
    public final int zzd(int i7) {
        CharSequence charSequence = ((zzq) this).zzb;
        int length = charSequence.length();
        zzn.zzb(i7, length, "index");
        while (i7 < length) {
            if (charSequence.charAt(i7) == ':') {
                return i7;
            }
            i7++;
        }
        return -1;
    }
}
