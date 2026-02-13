package com.google.android.gms.internal.auth;

import F5.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0995k;
import com.google.android.gms.common.internal.C0992h;
import v5.AbstractC2145d;
import w5.e;
import w5.f;

/* loaded from: classes.dex */
public final class zzam extends AbstractC0995k {
    public zzam(Context context, Looper looper, C0992h c0992h, m mVar, n nVar) {
        super(context, looper, 120, c0992h, mVar, nVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i7 = e.f25807a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new zza(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final d[] getApiFeatures() {
        return new d[]{AbstractC2145d.f25077d};
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
