package com.google.android.gms.internal.auth;

import B5.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;

/* loaded from: classes.dex */
final class zzbu implements r {
    private final Status zza;
    private b zzb;

    public zzbu(b bVar) {
        this.zzb = bVar;
        this.zza = Status.f14892e;
    }

    public zzbu(Status status) {
        this.zza = status;
    }

    public final b getResponse() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status getStatus() {
        return this.zza;
    }
}
