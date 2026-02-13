package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0963d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;
import x5.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzbj extends AbstractC0963d {
    public zzbj(o oVar) {
        super(b.f26220a, oVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ r createFailedResult(Status status) {
        return new zzbv(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0963d
    public final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.b bVar) {
        zzbe zzbeVar = (zzbe) bVar;
        zza(zzbeVar.getContext(), (zzbh) zzbeVar.getService());
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzbj) obj);
    }

    public abstract void zza(Context context, zzbh zzbhVar);
}
