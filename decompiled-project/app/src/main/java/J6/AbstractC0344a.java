package J6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: J6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0344a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f5537a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5538b;

    public AbstractC0344a(IBinder iBinder, String str) {
        this.f5537a = iBinder;
        this.f5538b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5537a;
    }

    public final void h(int i7, Parcel parcel) {
        try {
            this.f5537a.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
