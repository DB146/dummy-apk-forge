package B6;

import e3.InterfaceC1082g;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class k implements InterfaceC1082g {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2134a;

    /* renamed from: b, reason: collision with root package name */
    public int f2135b;

    /* renamed from: c, reason: collision with root package name */
    public int f2136c;

    public k(o oVar) {
        this.f2134a = new WeakReference(oVar);
    }

    public final void a(int i7, float f4) {
        o oVar = (o) this.f2134a.get();
        if (oVar != null) {
            int i10 = this.f2136c;
            oVar.l(i7, f4, i10 != 2 || this.f2135b == 1, (i10 == 2 && this.f2135b == 0) ? false : true, false);
        }
    }

    public final void b(int i7) {
        o oVar = (o) this.f2134a.get();
        if (oVar == null || oVar.getSelectedTabPosition() == i7 || i7 >= oVar.getTabCount()) {
            return;
        }
        int i10 = this.f2136c;
        oVar.j(oVar.g(i7), i10 == 0 || (i10 == 2 && this.f2135b == 0));
    }
}
