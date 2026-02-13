package F6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class f implements h, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f4152a;

    public f(IBinder iBinder) {
        this.f4152a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4152a;
    }

    @Override // F6.h
    public final void d(String str, Bundle bundle, E6.h hVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i7 = e.f4151a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(hVar);
        try {
            this.f4152a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
