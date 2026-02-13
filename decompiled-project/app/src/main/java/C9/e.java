package C9;

import A9.Z1;
import m4.C1549C;

/* loaded from: classes2.dex */
public final class e extends Tb.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3085a;

    /* renamed from: b, reason: collision with root package name */
    public long f3086b;

    /* renamed from: c, reason: collision with root package name */
    public long f3087c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f3089e;

    public e(g gVar) {
        this.f3089e = gVar;
    }

    @Override // Tb.a
    public final void A() {
        this.f3088d = true;
        g gVar = this.f3089e;
        this.f3085a = !gVar.f3072d.s();
        b bVar = gVar.f3072d;
        bVar.R(true);
        this.f3086b = bVar.K();
        this.f3087c = -1L;
        bVar.P();
    }

    @Override // Tb.a
    public final void s() {
        this.f3089e.getClass();
    }

    @Override // Tb.a
    public final boolean v() {
        g gVar = this.f3089e;
        gVar.getClass();
        return gVar.f3091C;
    }

    @Override // Tb.a
    public final void y(boolean z8) {
        g gVar = this.f3089e;
        if (z8) {
            long j = this.f3086b;
            if (j >= 0) {
                C1549C c1549c = gVar.f3072d.f3061c;
                c1549c.y(c1549c.U(), j, false);
            }
        } else {
            long j10 = this.f3087c;
            if (j10 >= 0) {
                C1549C c1549c2 = gVar.f3072d.f3061c;
                c1549c2.y(c1549c2.U(), j10, false);
            }
        }
        this.f3088d = false;
        if (!this.f3085a) {
            gVar.b();
        } else {
            gVar.f3072d.R(false);
            gVar.a();
        }
    }

    @Override // Tb.a
    public final void z(long j) {
        g gVar = this.f3089e;
        gVar.getClass();
        C1549C c1549c = gVar.f3072d.f3061c;
        c1549c.y(c1549c.U(), j, false);
        Z1 z12 = gVar.f3073e;
        if (z12 != null) {
            z12.c(j);
        }
    }
}
