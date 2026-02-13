package l2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: l2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC1450A extends Service implements InterfaceC1479x {

    /* renamed from: a, reason: collision with root package name */
    public final X f19150a = new X(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.l.e(intent, "intent");
        X x2 = this.f19150a;
        x2.getClass();
        x2.v(r.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        X x2 = this.f19150a;
        x2.getClass();
        x2.v(r.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        X x2 = this.f19150a;
        x2.getClass();
        x2.v(r.ON_STOP);
        x2.v(r.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i7) {
        X x2 = this.f19150a;
        x2.getClass();
        x2.v(r.ON_START);
        super.onStart(intent, i7);
    }

    @Override // l2.InterfaceC1479x
    public final C1481z w() {
        return (C1481z) this.f19150a.f19194b;
    }
}
