package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzamt implements zzama {
    private final zzamc zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzamt(zzamc zzamcVar, String str, Object[] objArr) {
        this.zza = zzamcVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.zzd = i7 | (charAt2 << i10);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzama
    public final zzamc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzama
    public final zzamo zzb() {
        int i7 = this.zzd;
        return (i7 & 1) != 0 ? zzamo.PROTO2 : (i7 & 4) == 4 ? zzamo.EDITIONS : zzamo.PROTO3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzama
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
