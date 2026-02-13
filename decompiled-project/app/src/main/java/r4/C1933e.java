package r4;

import android.os.Handler;

/* renamed from: r4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1933e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final C1941m f23732a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1938j f23733b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23734c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1934f f23735d;

    public C1933e(C1934f c1934f, C1941m c1941m) {
        this.f23735d = c1934f;
        this.f23732a = c1941m;
    }

    @Override // r4.p
    public final void release() {
        Handler handler = this.f23735d.f23752u;
        handler.getClass();
        n5.D.Q(handler, new k1.a(this, 8));
    }
}
