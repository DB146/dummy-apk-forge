package com.google.android.gms.internal.appindex;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.InterfaceC0966g;
import com.google.android.gms.common.api.internal.InterfaceC0976q;
import com.google.android.gms.common.internal.AbstractC0995k;
import com.google.android.gms.common.internal.C0992h;
import m7.AbstractBinderC1638d;
import m7.InterfaceC1639e;

/* loaded from: classes.dex */
public final class zzv extends AbstractC0995k {
    static final i zze;
    private static final h zzf;
    private static final a zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zzf = obj;
        zzu zzuVar = new zzu();
        zzg = zzuVar;
        zze = new i("AppIndexing.API", zzuVar, obj);
    }

    public zzv(Context context, Looper looper, C0992h c0992h, InterfaceC0966g interfaceC0966g, InterfaceC0976q interfaceC0976q) {
        super(context, looper, 113, c0992h, interfaceC0966g, interfaceC0976q);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i7 = AbstractBinderC1638d.f20756a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
        return queryLocalInterface instanceof InterfaceC1639e ? (InterfaceC1639e) queryLocalInterface : new zza(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getServiceDescriptor() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getStartServiceAction() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
