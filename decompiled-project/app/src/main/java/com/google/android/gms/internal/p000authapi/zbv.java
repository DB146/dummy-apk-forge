package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.InterfaceC0969j;
import z5.f;
import z5.i;
import z5.j;

/* loaded from: classes.dex */
public final class zbv extends zba implements IInterface {
    public zbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbl zblVar, f fVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zblVar);
        zbc.zbc(zba, fVar);
        zbb(1, zba);
    }

    public final void zbd(zbo zboVar, i iVar, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, zboVar);
        zbc.zbc(zba, iVar);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(zbq zbqVar, j jVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbqVar);
        zbc.zbc(zba, jVar);
        zbb(3, zba);
    }

    public final void zbf(InterfaceC0969j interfaceC0969j, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, interfaceC0969j);
        zba.writeString(str);
        zbb(2, zba);
    }
}
