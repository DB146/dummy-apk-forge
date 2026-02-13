package d;

import P3.p;
import c.AbstractC0876t;
import c.C0857a;
import cc.E;

/* loaded from: classes.dex */
public final class f extends AbstractC0876t {

    /* renamed from: d, reason: collision with root package name */
    public E f16290d;

    /* renamed from: e, reason: collision with root package name */
    public Rb.e f16291e;

    /* renamed from: f, reason: collision with root package name */
    public p f16292f;
    public boolean g;

    @Override // c.AbstractC0876t
    public final void a() {
        p pVar = this.f16292f;
        if (pVar != null) {
            pVar.c();
        }
        p pVar2 = this.f16292f;
        if (pVar2 != null) {
            pVar2.f7841b = false;
        }
        this.g = false;
    }

    @Override // c.AbstractC0876t
    public final void b() {
        p pVar = this.f16292f;
        if (pVar != null && !pVar.f7841b) {
            pVar.c();
            this.f16292f = null;
        }
        if (this.f16292f == null) {
            this.f16292f = new p(this.f16290d, false, this.f16291e, this);
        }
        p pVar2 = this.f16292f;
        if (pVar2 != null) {
            ((ec.d) pVar2.f7842c).j(null);
        }
        p pVar3 = this.f16292f;
        if (pVar3 != null) {
            pVar3.f7841b = false;
        }
        this.g = false;
    }

    @Override // c.AbstractC0876t
    public final void c(C0857a c0857a) {
        super.c(c0857a);
        p pVar = this.f16292f;
        if (pVar != null) {
            ((ec.d) pVar.f7842c).h(c0857a);
        }
    }

    @Override // c.AbstractC0876t
    public final void d(C0857a c0857a) {
        super.d(c0857a);
        p pVar = this.f16292f;
        if (pVar != null) {
            pVar.c();
        }
        if (this.f14068a) {
            this.f16292f = new p(this.f16290d, true, this.f16291e, this);
        }
        this.g = true;
    }
}
