package B0;

import Q.C0517u;
import Q.InterfaceC0510q;
import com.kt.apps.media.xemtv.beta.R;
import l2.C1481z;
import l2.InterfaceC1477v;
import l2.InterfaceC1479x;

/* loaded from: classes.dex */
public final class y1 implements InterfaceC0510q, InterfaceC1477v {

    /* renamed from: a, reason: collision with root package name */
    public final D f2021a;

    /* renamed from: b, reason: collision with root package name */
    public final C0517u f2022b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2023c;

    /* renamed from: d, reason: collision with root package name */
    public C1481z f2024d;

    /* renamed from: e, reason: collision with root package name */
    public Y.e f2025e = AbstractC0203t0.f1980a;

    public y1(D d10, C0517u c0517u) {
        this.f2021a = d10;
        this.f2022b = c0517u;
    }

    public final void a() {
        if (!this.f2023c) {
            this.f2023c = true;
            this.f2021a.getView().setTag(R.id.wrapped_composition_tag, null);
            C1481z c1481z = this.f2024d;
            if (c1481z != null) {
                c1481z.f(this);
            }
        }
        this.f2022b.l();
    }

    public final void b(Rb.e eVar) {
        this.f2021a.setOnViewTreeOwnersAvailable(new C0170c0(4, this, (Y.e) eVar));
    }

    @Override // l2.InterfaceC1477v
    public final void onStateChanged(InterfaceC1479x interfaceC1479x, l2.r rVar) {
        if (rVar == l2.r.ON_DESTROY) {
            a();
        } else {
            if (rVar != l2.r.ON_CREATE || this.f2023c) {
                return;
            }
            b(this.f2025e);
        }
    }
}
