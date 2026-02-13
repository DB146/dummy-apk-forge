package com.google.android.gms.common.internal;

import a6.C0779c;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class C implements InterfaceC0999o {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f15021a;

    public C(IBinder iBinder) {
        this.f15021a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15021a;
    }

    public final void h(J j, C0994j c0994j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(j.asBinder());
            obtain.writeInt(1);
            C0779c.a(c0994j, obtain, 0);
            this.f15021a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
