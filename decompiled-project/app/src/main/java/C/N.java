package C;

import Q.C0480b;
import Q.C0487e0;

/* loaded from: classes.dex */
public final class N implements O {

    /* renamed from: a, reason: collision with root package name */
    public final String f2367a;

    /* renamed from: b, reason: collision with root package name */
    public final C0487e0 f2368b;

    public N(B b2, String str) {
        this.f2367a = str;
        this.f2368b = C0480b.o(b2);
    }

    @Override // C.O
    public final int a(V0.c cVar) {
        return e().f2336d;
    }

    @Override // C.O
    public final int b(V0.c cVar) {
        return e().f2334b;
    }

    @Override // C.O
    public final int c(V0.c cVar, V0.l lVar) {
        return e().f2335c;
    }

    @Override // C.O
    public final int d(V0.c cVar, V0.l lVar) {
        return e().f2333a;
    }

    public final B e() {
        return (B) this.f2368b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N) {
            return kotlin.jvm.internal.l.a(e(), ((N) obj).e());
        }
        return false;
    }

    public final void f(B b2) {
        this.f2368b.setValue(b2);
    }

    public final int hashCode() {
        return this.f2367a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2367a);
        sb2.append("(left=");
        sb2.append(e().f2333a);
        sb2.append(", top=");
        sb2.append(e().f2334b);
        sb2.append(", right=");
        sb2.append(e().f2335c);
        sb2.append(", bottom=");
        return X.c.k(sb2, e().f2336d, ')');
    }
}
