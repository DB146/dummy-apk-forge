package I2;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: I2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316e implements InterfaceC0317f {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f5159a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5159a;
    }

    @Override // I2.InterfaceC0317f
    public final void g(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0317f.g);
            obtain.writeStringArray(strArr);
            this.f5159a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
