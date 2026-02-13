package c;

import android.window.OnBackInvokedDispatcher;
import l2.InterfaceC1477v;
import l2.InterfaceC1479x;

/* renamed from: c.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0861e implements InterfaceC1477v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0853A f14024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0867k f14025b;

    public /* synthetic */ C0861e(C0853A c0853a, AbstractActivityC0867k abstractActivityC0867k) {
        this.f14024a = c0853a;
        this.f14025b = abstractActivityC0867k;
    }

    @Override // l2.InterfaceC1477v
    public final void onStateChanged(InterfaceC1479x interfaceC1479x, l2.r rVar) {
        if (rVar == l2.r.ON_CREATE) {
            OnBackInvokedDispatcher a9 = AbstractC0862f.a(this.f14025b);
            C0853A c0853a = this.f14024a;
            c0853a.f14011e = a9;
            c0853a.d(c0853a.g);
        }
    }
}
