package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.G;

/* loaded from: classes.dex */
public final class zzbv implements r {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        G.g(status);
        this.zza = status;
        this.zzb = "";
    }

    public zzbv(String str) {
        G.g(str);
        this.zzb = str;
        this.zza = Status.f14892e;
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status getStatus() {
        return this.zza;
    }
}
