package com.google.android.gms.internal.p000authapi;

import F5.d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC0966g;
import com.google.android.gms.common.api.internal.InterfaceC0976q;
import com.google.android.gms.common.internal.AbstractC0995k;
import com.google.android.gms.common.internal.C0992h;
import z5.q;

/* loaded from: classes.dex */
public final class zbf extends AbstractC0995k {
    private final Bundle zba;

    public zbf(Context context, Looper looper, q qVar, C0992h c0992h, InterfaceC0966g interfaceC0966g, InterfaceC0976q interfaceC0976q) {
        super(context, looper, 219, c0992h, interfaceC0966g, interfaceC0976q);
        Bundle bundle = new Bundle();
        bundle.putString("session_id", null);
        this.zba = bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        return queryLocalInterface instanceof zbj ? (zbj) queryLocalInterface : new zbj(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final d[] getApiFeatures() {
        return zbar.zbk;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
