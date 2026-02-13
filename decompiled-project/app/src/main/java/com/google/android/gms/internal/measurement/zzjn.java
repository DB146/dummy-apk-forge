package com.google.android.gms.internal.measurement;

import M6.q;
import android.content.Context;
import h3.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjn extends zzkg {
    private final Context zza;
    private final q zzb;

    public zzjn(Context context, q qVar) {
        this.zza = context;
        this.zzb = qVar;
    }

    public final boolean equals(Object obj) {
        q qVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkg) {
            zzkg zzkgVar = (zzkg) obj;
            if (this.zza.equals(zzkgVar.zza()) && ((qVar = this.zzb) != null ? qVar.equals(zzkgVar.zzb()) : zzkgVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        q qVar = this.zzb;
        return (hashCode * 1000003) ^ (qVar == null ? 0 : qVar.hashCode());
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(length + 45 + valueOf.length() + 1);
        o.v(sb2, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final q zzb() {
        return this.zzb;
    }
}
