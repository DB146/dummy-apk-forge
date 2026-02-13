package com.google.android.gms.internal.measurement;

import Y5.F0;
import android.os.Bundle;

/* loaded from: classes.dex */
final class zzes extends zzcz {
    private final F0 zza;

    public zzes(F0 f02) {
        this.zza = f02;
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.zza.a(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() {
        return System.identityHashCode(this.zza);
    }
}
