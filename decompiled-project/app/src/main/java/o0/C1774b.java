package o0;

import j0.i;
import j0.n;
import l0.InterfaceC1445d;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1774b extends AbstractC1775c {

    /* renamed from: e, reason: collision with root package name */
    public final long f21655e;
    public i g;

    /* renamed from: f, reason: collision with root package name */
    public float f21656f = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public final long f21657h = 9205357640488583168L;

    public C1774b(long j) {
        this.f21655e = j;
    }

    @Override // o0.AbstractC1775c
    public final void a(float f4) {
        this.f21656f = f4;
    }

    @Override // o0.AbstractC1775c
    public final void b(i iVar) {
        this.g = iVar;
    }

    @Override // o0.AbstractC1775c
    public final long e() {
        return this.f21657h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1774b) {
            return n.c(this.f21655e, ((C1774b) obj).f21655e);
        }
        return false;
    }

    @Override // o0.AbstractC1775c
    public final void f(InterfaceC1445d interfaceC1445d) {
        InterfaceC1445d.s(interfaceC1445d, this.f21655e, 0L, this.f21656f, this.g, 86);
    }

    public final int hashCode() {
        int i7 = n.f18553h;
        return Long.hashCode(this.f21655e);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) n.i(this.f21655e)) + ')';
    }
}
