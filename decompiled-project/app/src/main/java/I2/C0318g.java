package I2;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: I2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318g implements InterfaceC0319h {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f5160a;

    @Override // I2.InterfaceC0319h
    public final void B(int i7, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0319h.f5161h);
            obtain.writeInt(i7);
            obtain.writeStringArray(strArr);
            this.f5160a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5160a;
    }

    @Override // I2.InterfaceC0319h
    public final void r(InterfaceC0317f interfaceC0317f, int i7) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0319h.f5161h);
            obtain.writeStrongInterface(interfaceC0317f);
            obtain.writeInt(i7);
            this.f5160a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // I2.InterfaceC0319h
    public final int u(InterfaceC0317f interfaceC0317f, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0319h.f5161h);
            obtain.writeStrongInterface(interfaceC0317f);
            obtain.writeString(str);
            this.f5160a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
