package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;

/* loaded from: classes.dex */
final class zzaj implements r {
    private final Status zza;

    public zzaj(Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status getStatus() {
        return this.zza;
    }
}
