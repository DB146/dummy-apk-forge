package P4;

import java.util.List;

/* loaded from: classes.dex */
public final class J implements k5.s {

    /* renamed from: a, reason: collision with root package name */
    public final k5.s f7868a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f7869b;

    public J(k5.s sVar, m0 m0Var) {
        this.f7868a = sVar;
        this.f7869b = m0Var;
    }

    @Override // k5.s
    public final void a(boolean z8) {
        this.f7868a.a(z8);
    }

    @Override // k5.s
    public final void b(long j, long j10, long j11, List list, R4.l[] lVarArr) {
        this.f7868a.b(j, j10, j11, list, lVarArr);
    }

    @Override // k5.s
    public final boolean c(int i7, long j) {
        return this.f7868a.c(i7, j);
    }

    @Override // k5.s
    public final m4.L d(int i7) {
        return this.f7868a.d(i7);
    }

    @Override // k5.s
    public final void e() {
        this.f7868a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        return this.f7868a.equals(j.f7868a) && this.f7869b.equals(j.f7869b);
    }

    @Override // k5.s
    public final int f(int i7) {
        return this.f7868a.f(i7);
    }

    @Override // k5.s
    public final int g(long j, List list) {
        return this.f7868a.g(j, list);
    }

    @Override // k5.s
    public final boolean h(long j, R4.e eVar, List list) {
        return this.f7868a.h(j, eVar, list);
    }

    public final int hashCode() {
        return this.f7868a.hashCode() + ((this.f7869b.hashCode() + 527) * 31);
    }

    @Override // k5.s
    public final void i() {
        this.f7868a.i();
    }

    @Override // k5.s
    public final int j() {
        return this.f7868a.j();
    }

    @Override // k5.s
    public final m0 k() {
        return this.f7869b;
    }

    @Override // k5.s
    public final m4.L l() {
        return this.f7868a.l();
    }

    @Override // k5.s
    public final int length() {
        return this.f7868a.length();
    }

    @Override // k5.s
    public final int m() {
        return this.f7868a.m();
    }

    @Override // k5.s
    public final int n() {
        return this.f7868a.n();
    }

    @Override // k5.s
    public final boolean o(int i7, long j) {
        return this.f7868a.o(i7, j);
    }

    @Override // k5.s
    public final void p(float f4) {
        this.f7868a.p(f4);
    }

    @Override // k5.s
    public final Object q() {
        return this.f7868a.q();
    }

    @Override // k5.s
    public final void r() {
        this.f7868a.r();
    }

    @Override // k5.s
    public final int s(m4.L l10) {
        return this.f7868a.s(l10);
    }

    @Override // k5.s
    public final void t() {
        this.f7868a.t();
    }

    @Override // k5.s
    public final int u(int i7) {
        return this.f7868a.u(i7);
    }
}
