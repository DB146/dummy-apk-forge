package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0995k;
import com.google.android.gms.common.internal.C0992h;

/* loaded from: classes.dex */
public final class zzy extends AbstractC0995k {
    public zzy(Context context, Looper looper, C0992h c0992h, m mVar, n nVar) {
        super(context, looper, 117, c0992h, mVar, nVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
        return queryLocalInterface instanceof zzw ? (zzw) queryLocalInterface : new zzw(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.thirdparty.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.u2f.thirdparty.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
