package com.google.android.gms.internal.pal;

import h3.o;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzqj extends zzqu {
    private final int zza;
    private final zzqi zzb;

    private zzqj(int i7, zzqi zzqiVar) {
        this.zza = i7;
        this.zzb = zzqiVar;
    }

    public static zzqj zzb(int i7, zzqi zzqiVar) {
        if (i7 < 10 || i7 > 16) {
            throw new GeneralSecurityException(o.l(i7, "Invalid tag size for AesCmacParameters: "));
        }
        return new zzqj(i7, zzqiVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqj)) {
            return false;
        }
        zzqj zzqjVar = (zzqj) obj;
        return zzqjVar.zza() == zza() && zzqjVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + this.zzb.toString() + ", " + this.zza + "-byte tags)";
    }

    public final int zza() {
        zzqi zzqiVar = this.zzb;
        if (zzqiVar == zzqi.zzd) {
            return this.zza;
        }
        if (zzqiVar == zzqi.zza || zzqiVar == zzqi.zzb || zzqiVar == zzqi.zzc) {
            return this.zza + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean zzc() {
        return this.zzb != zzqi.zzd;
    }
}
