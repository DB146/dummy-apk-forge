package com.google.android.gms.internal.auth;

import F5.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC0966g;
import com.google.android.gms.common.api.internal.InterfaceC0976q;
import com.google.android.gms.common.internal.AbstractC0995k;
import com.google.android.gms.common.internal.C0992h;
import v5.AbstractC2145d;

/* loaded from: classes.dex */
final class zzi extends AbstractC0995k {
    public zzi(Context context, Looper looper, C0992h c0992h, InterfaceC0966g interfaceC0966g, InterfaceC0976q interfaceC0976q) {
        super(context, looper, 224, c0992h, interfaceC0966g, interfaceC0976q);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return queryLocalInterface instanceof zzp ? (zzp) queryLocalInterface : new zzp(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f, com.google.android.gms.common.api.g
    public final void disconnect(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super.disconnect(str);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final d[] getApiFeatures() {
        return new d[]{AbstractC2145d.f25076c, AbstractC2145d.f25075b, AbstractC2145d.f25074a};
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.authapi.START";
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
