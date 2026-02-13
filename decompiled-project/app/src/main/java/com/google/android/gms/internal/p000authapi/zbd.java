package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0995k;
import com.google.android.gms.common.internal.C0992h;
import ea.C1112g;
import x5.d;

/* loaded from: classes.dex */
public final class zbd extends AbstractC0995k {
    private final d zba;

    public zbd(Context context, Looper looper, C0992h c0992h, d dVar, m mVar, n nVar) {
        super(context, looper, 68, c0992h, mVar, nVar);
        dVar = dVar == null ? d.f26223c : dVar;
        C1112g c1112g = new C1112g(18);
        c1112g.f16840b = Boolean.FALSE;
        d dVar2 = d.f26223c;
        dVar.getClass();
        c1112g.f16840b = Boolean.valueOf(dVar.f26224a);
        c1112g.f16841c = dVar.f26225b;
        c1112g.f16841c = zbas.zba();
        this.zba = new d(c1112g);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zbe ? (zbe) queryLocalInterface : new zbe(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final Bundle getGetServiceRequestExtraArgs() {
        d dVar = this.zba;
        dVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", dVar.f26224a);
        bundle.putString("log_session_id", dVar.f26225b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
