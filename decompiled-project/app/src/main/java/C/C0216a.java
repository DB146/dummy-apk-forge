package C;

import Q.C0480b;
import Q.C0487e0;
import q1.C1876b;
import y1.p0;

/* renamed from: C.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216a implements O {

    /* renamed from: a, reason: collision with root package name */
    public final int f2391a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2392b;

    /* renamed from: c, reason: collision with root package name */
    public final C0487e0 f2393c = C0480b.o(C1876b.f23340e);

    /* renamed from: d, reason: collision with root package name */
    public final C0487e0 f2394d = C0480b.o(Boolean.TRUE);

    public C0216a(int i7, String str) {
        this.f2391a = i7;
        this.f2392b = str;
    }

    @Override // C.O
    public final int a(V0.c cVar) {
        return e().f23344d;
    }

    @Override // C.O
    public final int b(V0.c cVar) {
        return e().f23342b;
    }

    @Override // C.O
    public final int c(V0.c cVar, V0.l lVar) {
        return e().f23343c;
    }

    @Override // C.O
    public final int d(V0.c cVar, V0.l lVar) {
        return e().f23341a;
    }

    public final C1876b e() {
        return (C1876b) this.f2393c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0216a) {
            return this.f2391a == ((C0216a) obj).f2391a;
        }
        return false;
    }

    public final void f(p0 p0Var, int i7) {
        int i10 = this.f2391a;
        if (i7 == 0 || (i7 & i10) != 0) {
            this.f2393c.setValue(p0Var.f26731a.g(i10));
            this.f2394d.setValue(Boolean.valueOf(p0Var.f26731a.q(i10)));
        }
    }

    public final int hashCode() {
        return this.f2391a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2392b);
        sb2.append('(');
        sb2.append(e().f23341a);
        sb2.append(", ");
        sb2.append(e().f23342b);
        sb2.append(", ");
        sb2.append(e().f23343c);
        sb2.append(", ");
        return X.c.k(sb2, e().f23344d, ')');
    }
}
