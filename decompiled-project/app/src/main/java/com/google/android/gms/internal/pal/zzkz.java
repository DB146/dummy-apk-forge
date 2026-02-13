package com.google.android.gms.internal.pal;

import h3.o;

/* loaded from: classes.dex */
final class zzkz extends zzks {
    private final String zza;
    private final int zzb;

    public /* synthetic */ zzkz(String str, int i7, zzky zzkyVar) {
        this.zza = str;
        this.zzb = i7;
    }

    public final String toString() {
        String str = this.zza;
        int i7 = this.zzb - 2;
        return o.n("(typeUrl=", str, ", outputPrefixType=", i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
