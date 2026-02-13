package com.google.ads.interactivemedia.v3.internal;

import F5.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0995k;
import com.google.android.gms.common.internal.C0992h;

/* loaded from: classes.dex */
public final class zzos extends AbstractC0995k {
    public zzos(Context context, Looper looper, C0992h c0992h, m mVar, n nVar) {
        super(context, looper, 203, c0992h, mVar, nVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return zzoe.zzb(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final d[] getApiFeatures() {
        return zzqt.zzc;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 17108000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.signalsdk.ISignalSdkService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.SDK_SIGNAL";
    }
}
