package W1;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import c.C0853A;
import c.InterfaceC0854B;
import l2.C1481z;

/* loaded from: classes.dex */
public final class F extends tc.b implements l2.e0, InterfaceC0854B, Q2.e, Y {

    /* renamed from: a, reason: collision with root package name */
    public final G f10310a;

    /* renamed from: b, reason: collision with root package name */
    public final G f10311b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f10312c;

    /* renamed from: d, reason: collision with root package name */
    public final U f10313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ G f10314e;

    public F(G g) {
        this.f10314e = g;
        Handler handler = new Handler();
        this.f10310a = g;
        this.f10311b = g;
        this.f10312c = handler;
        this.f10313d = new U();
    }

    @Override // tc.b
    public final View B(int i7) {
        return this.f10314e.findViewById(i7);
    }

    @Override // tc.b
    public final boolean C() {
        Window window = this.f10314e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // c.InterfaceC0854B
    public final C0853A a() {
        return this.f10314e.a();
    }

    @Override // Q2.e
    public final q3.s b() {
        return (q3.s) this.f10314e.f14050d.f23372c;
    }

    @Override // W1.Y
    public final void c() {
    }

    @Override // l2.e0
    public final l2.d0 s() {
        return this.f10314e.s();
    }

    @Override // l2.InterfaceC1479x
    public final C1481z w() {
        return this.f10314e.f10316J;
    }
}
