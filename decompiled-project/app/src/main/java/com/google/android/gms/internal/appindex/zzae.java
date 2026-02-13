package com.google.android.gms.internal.appindex;

import android.content.Context;
import h3.o;

/* loaded from: classes.dex */
final class zzae extends zzai {
    private final Context zza;
    private final zzaq zzb;

    public zzae(Context context, zzaq zzaqVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = zzaqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzai) {
            zzai zzaiVar = (zzai) obj;
            if (this.zza.equals(zzaiVar.zza()) && this.zzb.equals(zzaiVar.zzb())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        return o.n("FlagsContext{context=", this.zza.toString(), ", hermeticFileOverrides=", this.zzb.toString(), "}");
    }

    @Override // com.google.android.gms.internal.appindex.zzai
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.appindex.zzai
    public final zzaq zzb() {
        return this.zzb;
    }
}
