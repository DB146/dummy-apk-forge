package com.google.android.gms.internal.pal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.InterfaceC0986b;
import com.google.android.gms.common.internal.InterfaceC0987c;

/* loaded from: classes.dex */
public final class zzhh extends zzfu {
    private final int zze;

    public zzhh(Context context, Looper looper, InterfaceC0986b interfaceC0986b, InterfaceC0987c interfaceC0987c, int i7) {
        super(context, looper, 116, interfaceC0986b, interfaceC0987c, null);
        this.zze = 9200000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof zzhm ? (zzhm) queryLocalInterface : new zzhm(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0990f
    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    public final zzhm zzp() {
        return (zzhm) getService();
    }
}
