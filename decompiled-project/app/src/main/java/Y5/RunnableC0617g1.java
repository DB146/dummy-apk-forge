package Y5;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: Y5.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0617g1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O1 f11760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0632l1 f11761c;

    public RunnableC0617g1(C0632l1 c0632l1, O1 o12) {
        this.f11759a = 4;
        this.f11760b = o12;
        Objects.requireNonNull(c0632l1);
        this.f11761c = c0632l1;
    }

    public /* synthetic */ RunnableC0617g1(C0632l1 c0632l1, O1 o12, int i7) {
        this.f11759a = i7;
        this.f11760b = o12;
        this.f11761c = c0632l1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11759a) {
            case 0:
                C0632l1 c0632l1 = this.f11761c;
                I i7 = c0632l1.f11815d;
                C0646q0 c0646q0 = (C0646q0) c0632l1.f3094a;
                if (i7 == null) {
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11577f.a("Failed to reset data on the service: not connected to service");
                    return;
                } else {
                    try {
                        i7.i(this.f11760b);
                    } catch (RemoteException e2) {
                        W w11 = c0646q0.f11912f;
                        C0646q0.l(w11);
                        w11.f11577f.b(e2, "Failed to reset data on the service: remote exception");
                    }
                    c0632l1.W();
                    return;
                }
            case 1:
                C0632l1 c0632l12 = this.f11761c;
                I i10 = c0632l12.f11815d;
                C0646q0 c0646q02 = (C0646q0) c0632l12.f3094a;
                if (i10 == null) {
                    W w12 = c0646q02.f11912f;
                    C0646q0.l(w12);
                    w12.f11577f.a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    O1 o12 = this.f11760b;
                    C0615g c0615g = c0646q02.f11910d;
                    E e10 = F.f11312c1;
                    if (c0615g.T(null, e10)) {
                        c0632l12.b0(i10, null, o12);
                    }
                    i10.b(o12);
                    c0646q02.n().O();
                    c0646q02.f11910d.T(null, e10);
                    c0632l12.b0(i10, null, o12);
                    c0632l12.W();
                    return;
                } catch (RemoteException e11) {
                    W w13 = c0646q02.f11912f;
                    C0646q0.l(w13);
                    w13.f11577f.b(e11, "Failed to send app launch to the service");
                    return;
                }
            case 2:
                C0632l1 c0632l13 = this.f11761c;
                I i11 = c0632l13.f11815d;
                C0646q0 c0646q03 = (C0646q0) c0632l13.f3094a;
                if (i11 == null) {
                    W w14 = c0646q03.f11912f;
                    C0646q0.l(w14);
                    w14.f11580w.a("Failed to send app backgrounded");
                    return;
                }
                try {
                    i11.j(this.f11760b);
                    c0632l13.W();
                    return;
                } catch (RemoteException e12) {
                    W w15 = c0646q03.f11912f;
                    C0646q0.l(w15);
                    w15.f11577f.b(e12, "Failed to send app backgrounded to the service");
                    return;
                }
            case 3:
                C0632l1 c0632l14 = this.f11761c;
                I i12 = c0632l14.f11815d;
                C0646q0 c0646q04 = (C0646q0) c0632l14.f3094a;
                if (i12 == null) {
                    W w16 = c0646q04.f11912f;
                    C0646q0.l(w16);
                    w16.f11577f.a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    i12.y(this.f11760b);
                    c0632l14.W();
                    return;
                } catch (RemoteException e13) {
                    W w17 = c0646q04.f11912f;
                    C0646q0.l(w17);
                    w17.f11577f.b(e13, "Failed to send measurementEnabled to the service");
                    return;
                }
            default:
                C0632l1 c0632l15 = this.f11761c;
                I i13 = c0632l15.f11815d;
                C0646q0 c0646q05 = (C0646q0) c0632l15.f3094a;
                if (i13 == null) {
                    W w18 = c0646q05.f11912f;
                    C0646q0.l(w18);
                    w18.f11577f.a("Failed to send consent settings to service");
                    return;
                }
                try {
                    i13.w(this.f11760b);
                    c0632l15.W();
                    return;
                } catch (RemoteException e14) {
                    W w19 = c0646q05.f11912f;
                    C0646q0.l(w19);
                    w19.f11577f.b(e14, "Failed to send consent settings to the service");
                    return;
                }
        }
    }
}
