package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzagj extends zzahz {
    private String zza;
    private String zzb;
    private String zzc;
    private zzagy zzd;
    private String zze;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahz
    public final zzahw zza() {
        String str;
        zzagy zzagyVar;
        String str2;
        String str3 = this.zza;
        if (str3 != null && (str = this.zzc) != null && (zzagyVar = this.zzd) != null && (str2 = this.zze) != null) {
            return new zzagg(str3, this.zzb, str, zzagyVar, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" providerId");
        }
        if (this.zzc == null) {
            sb2.append(" token");
        }
        if (this.zzd == null) {
            sb2.append(" tokenType");
        }
        if (this.zze == null) {
            sb2.append(" idToken");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb2)));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahz
    public final zzahz zza(zzagy zzagyVar) {
        if (zzagyVar == null) {
            throw new NullPointerException("Null tokenType");
        }
        this.zzd = zzagyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahz
    public final zzahz zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null idToken");
        }
        this.zze = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahz
    public final zzahz zzb(String str) {
        if (str == null) {
            throw new NullPointerException("Null providerId");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahz
    public final zzahz zzc(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahz
    public final zzahz zzd(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.zzc = str;
        return this;
    }
}
