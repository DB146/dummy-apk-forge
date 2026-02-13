package A9;

import H2.AbstractC0303q;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class R0 extends AbstractC0303q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V0 f945c;

    public R0(V0 v02, ArrayList arrayList) {
        this.f945c = v02;
        this.f944b = arrayList;
    }

    @Override // H2.AbstractC0303q
    public final boolean a(int i7, int i10) {
        V0 v02 = this.f945c;
        return v02.f984n.g((P0) this.f944b.get(i7), (P0) v02.j.get(i10));
    }

    @Override // H2.AbstractC0303q
    public final boolean b(int i7, int i10) {
        V0 v02 = this.f945c;
        return v02.f984n.h((P0) this.f944b.get(i7), (P0) v02.j.get(i10));
    }

    @Override // H2.AbstractC0303q
    public final void g(int i7, int i10) {
        V0 v02 = this.f945c;
        Y0 y02 = v02.f984n;
        y02.getClass();
    }

    @Override // H2.AbstractC0303q
    public final int h() {
        return this.f945c.j.size();
    }

    @Override // H2.AbstractC0303q
    public final int i() {
        return this.f944b.size();
    }
}
