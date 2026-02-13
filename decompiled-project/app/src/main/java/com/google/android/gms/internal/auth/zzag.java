package com.google.android.gms.internal.auth;

import android.accounts.Account;
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
final class zzag extends AbstractC0963d {
    final /* synthetic */ Account zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzal zzalVar, i iVar, o oVar, Account account) {
        super(iVar, oVar);
        this.zza = account;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final r createFailedResult(Status status) {
        return new zzak(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0963d
    public final void doExecute(b bVar) {
        f fVar = (f) ((zzam) bVar).getService();
        zzaf zzafVar = new zzaf(this);
        Account account = this.zza;
        d dVar = (d) fVar;
        Parcel zza = dVar.zza();
        zzc.zzd(zza, zzafVar);
        zzc.zzc(zza, account);
        dVar.zzc(3, zza);
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzag) obj);
    }
}
