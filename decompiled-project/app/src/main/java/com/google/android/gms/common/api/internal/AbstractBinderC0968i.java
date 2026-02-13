package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* renamed from: com.google.android.gms.common.api.internal.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0968i extends zab implements InterfaceC0969j {
    public AbstractBinderC0968i() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.common.api.internal.j, com.google.android.gms.internal.base.zaa] */
    public static InterfaceC0969j asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
        return queryLocalInterface instanceof InterfaceC0969j ? (InterfaceC0969j) queryLocalInterface : new zaa(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) zac.zaa(parcel, Status.CREATOR);
        zac.zab(parcel);
        onResult(status);
        return true;
    }
}
