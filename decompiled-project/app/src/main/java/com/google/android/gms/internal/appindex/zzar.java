package com.google.android.gms.internal.appindex;

/* loaded from: classes.dex */
final class zzar implements zzaq {
    volatile zzaq zza;

    public zzar(zzaq zzaqVar) {
        this.zza = zzaqVar;
    }

    public final String toString() {
        Object obj = this.zza;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned null>";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
