package com.google.android.gms.internal.measurement;

import Y5.E0;
import android.os.Bundle;
import q3.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzer extends zzcz {
    private final E0 zza;

    public zzer(E0 e02) {
        this.zza = e02;
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j) {
        ((l) this.zza).B(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() {
        return System.identityHashCode(this.zza);
    }
}
