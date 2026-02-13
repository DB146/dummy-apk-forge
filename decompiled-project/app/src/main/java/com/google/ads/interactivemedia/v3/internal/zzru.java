package com.google.ads.interactivemedia.v3.internal;

import X.c;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzru extends zzth implements Serializable {
    final zzrc zza;
    final zzth zzb;

    public zzru(zzrc zzrcVar, zzth zzthVar) {
        this.zza = zzrcVar;
        this.zzb = zzthVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzth, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zzb.compare(this.zza.zza(obj), this.zza.zza(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzru) {
            zzru zzruVar = (zzru) obj;
            if (this.zza.equals(zzruVar.zza) && this.zzb.equals(zzruVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return c.j(this.zzb.toString(), ".onResultOf(", this.zza.toString(), ")");
    }
}
