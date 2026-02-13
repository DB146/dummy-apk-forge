package v2;

import Eb.C0252c;
import java.util.Iterator;
import l2.X;
import u.U;

/* loaded from: classes.dex */
public class r extends q implements Iterable, Sb.a {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f25020u = 0;

    /* renamed from: f, reason: collision with root package name */
    public final B4.j f25021f;

    public r(t tVar) {
        super(tVar);
        this.f25021f = new B4.j(this);
    }

    @Override // v2.q
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        if (super.equals(obj)) {
            B4.j jVar = this.f25021f;
            int f4 = ((U) jVar.f2091d).f();
            B4.j jVar2 = ((r) obj).f25021f;
            if (f4 == ((U) jVar2.f2091d).f() && jVar.f2089b == jVar2.f2089b) {
                U u3 = (U) jVar.f2091d;
                kotlin.jvm.internal.l.e(u3, "<this>");
                Iterator it = ((Zb.a) Zb.i.M(new C0252c(u3, 3))).iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (!qVar.equals(((U) jVar2.f2091d).c(qVar.f25017b.f4638a))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // v2.q
    public final int hashCode() {
        B4.j jVar = this.f25021f;
        int i7 = jVar.f2089b;
        U u3 = (U) jVar.f2091d;
        int f4 = u3.f();
        for (int i10 = 0; i10 < f4; i10++) {
            i7 = (((i7 * 31) + u3.d(i10)) * 31) + ((q) u3.g(i10)).hashCode();
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        B4.j jVar = this.f25021f;
        jVar.getClass();
        return new y2.h(jVar);
    }

    @Override // v2.q
    public final p t(X x2) {
        p t5 = super.t(x2);
        B4.j jVar = this.f25021f;
        jVar.getClass();
        return jVar.s(t5, x2, false, (r) jVar.f2090c);
    }

    @Override // v2.q
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        B4.j jVar = this.f25021f;
        String str = (String) jVar.f2093f;
        jVar.getClass();
        q i7 = (str == null || ac.g.h0(str)) ? null : jVar.i(str, true);
        if (i7 == null) {
            i7 = jVar.h(jVar.f2089b);
        }
        sb2.append(" startDestination=");
        if (i7 == null) {
            String str2 = (String) jVar.f2093f;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = (String) jVar.f2092e;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(jVar.f2089b));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(i7.toString());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }

    public final p y(X x2, q lastVisited) {
        kotlin.jvm.internal.l.e(lastVisited, "lastVisited");
        return this.f25021f.s(super.t(x2), x2, true, lastVisited);
    }
}
