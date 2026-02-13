package Y5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.InterfaceC0986b;
import com.google.android.gms.common.internal.InterfaceC0987c;
import java.util.Objects;

/* renamed from: Y5.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0629k1 implements ServiceConnection, InterfaceC0986b, InterfaceC0987c {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f11807a;

    /* renamed from: b, reason: collision with root package name */
    public volatile S f11808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0632l1 f11809c;

    public ServiceConnectionC0629k1(C0632l1 c0632l1) {
        Objects.requireNonNull(c0632l1);
        this.f11809c = c0632l1;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0986b
    public final void onConnected(Bundle bundle) {
        C0640o0 c0640o0 = ((C0646q0) this.f11809c.f3094a).f11913u;
        C0646q0.l(c0640o0);
        c0640o0.O();
        synchronized (this) {
            try {
                com.google.android.gms.common.internal.G.g(this.f11808b);
                I i7 = (I) this.f11808b.getService();
                C0640o0 c0640o02 = ((C0646q0) this.f11809c.f3094a).f11913u;
                C0646q0.l(c0640o02);
                c0640o02.S(new RunnableC0623i1(this, i7, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f11808b = null;
                this.f11807a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0987c
    public final void onConnectionFailed(F5.b bVar) {
        C0632l1 c0632l1 = this.f11809c;
        C0640o0 c0640o0 = ((C0646q0) c0632l1.f3094a).f11913u;
        C0646q0.l(c0640o0);
        c0640o0.O();
        W w10 = ((C0646q0) c0632l1.f3094a).f11912f;
        if (w10 == null || !w10.f11992b) {
            w10 = null;
        }
        if (w10 != null) {
            w10.f11573B.b(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f11807a = false;
            this.f11808b = null;
        }
        C0640o0 c0640o02 = ((C0646q0) this.f11809c.f3094a).f11913u;
        C0646q0.l(c0640o02);
        c0640o02.S(new E5.k(this, bVar));
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0986b
    public final void onConnectionSuspended(int i7) {
        C0646q0 c0646q0 = (C0646q0) this.f11809c.f3094a;
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.O();
        W w10 = c0646q0.f11912f;
        C0646q0.l(w10);
        w10.f11572A.a("Service connection suspended");
        C0640o0 c0640o02 = c0646q0.f11913u;
        C0646q0.l(c0640o02);
        c0640o02.S(new B0.C(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0640o0 c0640o0 = ((C0646q0) this.f11809c.f3094a).f11913u;
        C0646q0.l(c0640o0);
        c0640o0.O();
        synchronized (this) {
            if (iBinder == null) {
                this.f11807a = false;
                W w10 = ((C0646q0) this.f11809c.f3094a).f11912f;
                C0646q0.l(w10);
                w10.f11577f.a("Service connected with null binder");
                return;
            }
            I i7 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    i7 = queryLocalInterface instanceof I ? (I) queryLocalInterface : new G(iBinder);
                    W w11 = ((C0646q0) this.f11809c.f3094a).f11912f;
                    C0646q0.l(w11);
                    w11.f11573B.a("Bound to IMeasurementService interface");
                } else {
                    W w12 = ((C0646q0) this.f11809c.f3094a).f11912f;
                    C0646q0.l(w12);
                    w12.f11577f.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                W w13 = ((C0646q0) this.f11809c.f3094a).f11912f;
                C0646q0.l(w13);
                w13.f11577f.a("Service connect failed to get IMeasurementService");
            }
            if (i7 == null) {
                this.f11807a = false;
                try {
                    L5.a b2 = L5.a.b();
                    C0632l1 c0632l1 = this.f11809c;
                    b2.c(((C0646q0) c0632l1.f3094a).f11907a, c0632l1.f11814c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                C0640o0 c0640o02 = ((C0646q0) this.f11809c.f3094a).f11913u;
                C0646q0.l(c0640o02);
                c0640o02.S(new RunnableC0623i1(this, i7, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C0646q0 c0646q0 = (C0646q0) this.f11809c.f3094a;
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.O();
        W w10 = c0646q0.f11912f;
        C0646q0.l(w10);
        w10.f11572A.a("Service disconnected");
        C0640o0 c0640o02 = c0646q0.f11913u;
        C0646q0.l(c0640o02);
        c0640o02.S(new E5.k(22, this, componentName, false));
    }
}
