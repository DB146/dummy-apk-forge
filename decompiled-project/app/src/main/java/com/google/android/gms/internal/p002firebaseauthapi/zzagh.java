package com.google.android.gms.internal.p002firebaseauthapi;

import h3.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzagh extends zzahv {
    private final String zza;
    private final String zzb;

    public zzagh(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzahv) {
            zzahv zzahvVar = (zzahv) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzahvVar.zzb()) : zzahvVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzahvVar.zza()) : zzahvVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.zzb;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return o.n("RecaptchaEnforcementState{provider=", this.zza, ", enforcementState=", this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahv
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahv
    public final String zzb() {
        return this.zza;
    }
}
