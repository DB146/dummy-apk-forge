package Y5;

import android.os.RemoteException;

/* renamed from: Y5.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0626j1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0632l1 f11791b;

    public /* synthetic */ RunnableC0626j1(C0632l1 c0632l1, int i7) {
        this.f11790a = i7;
        this.f11791b = c0632l1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11790a) {
            case 0:
                this.f11791b.P();
                return;
            case 1:
                C0632l1 c0632l1 = this.f11791b;
                I i7 = c0632l1.f11815d;
                C0646q0 c0646q0 = (C0646q0) c0632l1.f3094a;
                if (i7 == null) {
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11577f.a("Failed to send Dma consent settings to service");
                    return;
                }
                try {
                    i7.A(c0632l1.Z(false));
                    c0632l1.W();
                    return;
                } catch (RemoteException e2) {
                    W w11 = c0646q0.f11912f;
                    C0646q0.l(w11);
                    w11.f11577f.b(e2, "Failed to send Dma consent settings to the service");
                    return;
                }
            default:
                C0632l1 c0632l12 = this.f11791b;
                I i10 = c0632l12.f11815d;
                C0646q0 c0646q02 = (C0646q0) c0632l12.f3094a;
                if (i10 == null) {
                    W w12 = c0646q02.f11912f;
                    C0646q0.l(w12);
                    w12.f11577f.a("Failed to send storage consent settings to service");
                    return;
                }
                try {
                    i10.n(c0632l12.Z(false));
                    c0632l12.W();
                    return;
                } catch (RemoteException e10) {
                    W w13 = c0646q02.f11912f;
                    C0646q0.l(w13);
                    w13.f11577f.b(e10, "Failed to send storage consent settings to the service");
                    return;
                }
        }
    }
}
