package com.google.android.gms.internal.measurement;

import A3.c;
import h3.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbu extends zzca {
    private final String zzc;
    private final int zzd;
    private final int zze;

    public /* synthetic */ zzbu(String str, boolean z8, int i7, zzbr zzbrVar, zzbs zzbsVar, int i10, byte[] bArr) {
        this.zzc = str;
        this.zzd = i7;
        this.zze = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzca) {
            zzca zzcaVar = (zzca) obj;
            if (this.zzc.equals(zzcaVar.zza())) {
                zzcaVar.zzb();
                int i7 = this.zzd;
                int zze = zzcaVar.zze();
                if (i7 == 0) {
                    throw null;
                }
                if (i7 == zze) {
                    zzcaVar.zzc();
                    zzcaVar.zzd();
                    int i10 = this.zze;
                    int zzf = zzcaVar.zzf();
                    if (i10 == 0) {
                        throw null;
                    }
                    if (zzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzc.hashCode() ^ 1000003;
        int i7 = this.zzd;
        if (i7 == 0) {
            throw null;
        }
        int i10 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i7;
        if (this.zze != 0) {
            return (i10 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i7 = this.zzd;
        String str = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.zze == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.zzc;
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + String.valueOf(str3).length() + 73 + 91 + 1);
        o.v(sb2, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return c.m(sb2, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final String zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final zzbr zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final zzbs zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int zzf() {
        return this.zze;
    }
}
