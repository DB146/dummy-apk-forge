package I2;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: I2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0326o extends Binder implements InterfaceC0317f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0327p f5183a;

    public BinderC0326o(C0327p c0327p) {
        this.f5183a = c0327p;
        attachInterface(this, InterfaceC0317f.g);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // I2.InterfaceC0317f
    public final void g(String[] tables) {
        kotlin.jvm.internal.l.e(tables, "tables");
        C0327p c0327p = this.f5183a;
        cc.F.B(c0327p.f5187d, null, 0, new C0325n(tables, c0327p, null), 3);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        String str = InterfaceC0317f.g;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i7 != 1) {
            return super.onTransact(i7, parcel, parcel2, i10);
        }
        g(parcel.createStringArray());
        return true;
    }
}
