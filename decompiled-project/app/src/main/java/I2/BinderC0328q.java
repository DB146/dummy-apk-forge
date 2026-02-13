package I2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: I2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0328q extends Binder implements InterfaceC0319h {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5192b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f5193a;

    public BinderC0328q(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f5193a = multiInstanceInvalidationService;
        attachInterface(this, InterfaceC0319h.f5161h);
    }

    @Override // I2.InterfaceC0319h
    public final void B(int i7, String[] tables) {
        kotlin.jvm.internal.l.e(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f5193a;
        synchronized (multiInstanceInvalidationService.f13721c) {
            String str = (String) multiInstanceInvalidationService.f13720b.get(Integer.valueOf(i7));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.f13721c.beginBroadcast();
            for (int i10 = 0; i10 < beginBroadcast; i10++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f13721c.getBroadcastCookie(i10);
                    kotlin.jvm.internal.l.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f13720b.get(num);
                    if (i7 != intValue && str.equals(str2)) {
                        try {
                            ((InterfaceC0317f) multiInstanceInvalidationService.f13721c.getBroadcastItem(i10)).g(tables);
                        } catch (RemoteException e2) {
                            Log.w("ROOM", "Error invoking a remote callback", e2);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.f13721c.finishBroadcast();
                }
            }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [I2.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [I2.e, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        String str = InterfaceC0319h.f5161h;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        InterfaceC0317f interfaceC0317f = null;
        InterfaceC0317f interfaceC0317f2 = null;
        if (i7 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(InterfaceC0317f.g);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0317f)) {
                    ?? obj = new Object();
                    obj.f5159a = readStrongBinder;
                    interfaceC0317f = obj;
                } else {
                    interfaceC0317f = (InterfaceC0317f) queryLocalInterface;
                }
            }
            int u3 = u(interfaceC0317f, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(u3);
        } else if (i7 == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(InterfaceC0317f.g);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof InterfaceC0317f)) {
                    ?? obj2 = new Object();
                    obj2.f5159a = readStrongBinder2;
                    interfaceC0317f2 = obj2;
                } else {
                    interfaceC0317f2 = (InterfaceC0317f) queryLocalInterface2;
                }
            }
            r(interfaceC0317f2, parcel.readInt());
            parcel2.writeNoException();
        } else {
            if (i7 != 3) {
                return super.onTransact(i7, parcel, parcel2, i10);
            }
            B(parcel.readInt(), parcel.createStringArray());
        }
        return true;
    }

    @Override // I2.InterfaceC0319h
    public final void r(InterfaceC0317f callback, int i7) {
        kotlin.jvm.internal.l.e(callback, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f5193a;
        synchronized (multiInstanceInvalidationService.f13721c) {
            multiInstanceInvalidationService.f13721c.unregister(callback);
        }
    }

    @Override // I2.InterfaceC0319h
    public final int u(InterfaceC0317f callback, String str) {
        kotlin.jvm.internal.l.e(callback, "callback");
        int i7 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f5193a;
        synchronized (multiInstanceInvalidationService.f13721c) {
            try {
                int i10 = multiInstanceInvalidationService.f13719a + 1;
                multiInstanceInvalidationService.f13719a = i10;
                if (multiInstanceInvalidationService.f13721c.register(callback, Integer.valueOf(i10))) {
                    multiInstanceInvalidationService.f13720b.put(Integer.valueOf(i10), str);
                    i7 = i10;
                } else {
                    multiInstanceInvalidationService.f13719a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i7;
    }
}
