package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0963d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.r;
import w5.d;
import w5.f;

/* loaded from: classes.dex */
final class zzac extends AbstractC0963d {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzal zzalVar, i iVar, o oVar, boolean z8) {
        super(iVar, oVar);
        this.zza = z8;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final r createFailedResult(Status status) {
        return new zzaj(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0963d
    public final void doExecute(b bVar) {
        f fVar = (f) ((zzam) bVar).getService();
        boolean z8 = this.zza;
        d dVar = (d) fVar;
        Parcel zza = dVar.zza();
        int i7 = zzc.zza;
        zza.writeInt(z8 ? 1 : 0);
        dVar.zzc(1, zza);
        setResult((zzac) new zzaj(Status.f14892e));
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzac) obj);
    }
}
