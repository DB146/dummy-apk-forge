package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zznv implements zzni {
    private final zznl zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zznv(zznl zznlVar, String str, Object[] objArr) {
        this.zza = zznlVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.zzd = i7 | (charAt2 << i11);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final boolean zza() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final zznl zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final int zzc() {
        int i7 = this.zzd;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
