package c;

import B0.C0200s;
import l2.C1481z;
import l2.InterfaceC1477v;
import l2.InterfaceC1479x;

/* renamed from: c.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0881y implements InterfaceC1477v, InterfaceC0858b {

    /* renamed from: a, reason: collision with root package name */
    public final C1481z f14081a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0876t f14082b;

    /* renamed from: c, reason: collision with root package name */
    public C0882z f14083c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0853A f14084d;

    public C0881y(C0853A c0853a, C1481z c1481z, AbstractC0876t onBackPressedCallback) {
        kotlin.jvm.internal.l.e(onBackPressedCallback, "onBackPressedCallback");
        this.f14084d = c0853a;
        this.f14081a = c1481z;
        this.f14082b = onBackPressedCallback;
        c1481z.a(this);
    }

    @Override // c.InterfaceC0858b
    public final void cancel() {
        this.f14081a.f(this);
        this.f14082b.f14069b.remove(this);
        C0882z c0882z = this.f14083c;
        if (c0882z != null) {
            c0882z.cancel();
        }
        this.f14083c = null;
    }

    @Override // l2.InterfaceC1477v
    public final void onStateChanged(InterfaceC1479x interfaceC1479x, l2.r rVar) {
        if (rVar != l2.r.ON_START) {
            if (rVar != l2.r.ON_STOP) {
                if (rVar == l2.r.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0882z c0882z = this.f14083c;
                if (c0882z != null) {
                    c0882z.cancel();
                    return;
                }
                return;
            }
        }
        C0853A c0853a = this.f14084d;
        c0853a.getClass();
        AbstractC0876t onBackPressedCallback = this.f14082b;
        kotlin.jvm.internal.l.e(onBackPressedCallback, "onBackPressedCallback");
        c0853a.f14008b.addLast(onBackPressedCallback);
        C0882z c0882z2 = new C0882z(c0853a, onBackPressedCallback);
        onBackPressedCallback.f14069b.add(c0882z2);
        c0853a.e();
        onBackPressedCallback.f14070c = new C0200s(0, c0853a, C0853A.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 5);
        this.f14083c = c0882z2;
    }
}
