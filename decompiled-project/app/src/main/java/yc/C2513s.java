package yc;

import java.util.ArrayList;

/* renamed from: yc.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2513s extends C {
    public C2513s() {
        super("ForeignContent", 23);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        xc.b bVar;
        xc.b bVar2;
        xc.b bVar3;
        xc.l b2;
        int b10 = P.c.b(s3.f27675a);
        if (b10 == 0) {
            c2482c.x(this);
        } else if (b10 == 1) {
            O o10 = (O) s3;
            if (wc.l.c(o10.f27671e, B.L)) {
                return c2482c.f27727l.f(s3, c2482c);
            }
            if (o10.f27671e.equals("font") && (((bVar = o10.g) != null && bVar.F("color") != -1) || (((bVar2 = o10.g) != null && bVar2.F("face") != -1) || ((bVar3 = o10.g) != null && bVar3.F("size") != -1)))) {
                return c2482c.f27727l.f(s3, c2482c);
            }
            String str = c2482c.b().f26349d.f27656a;
            c2482c.L(o10, str);
            l1 g = c2482c.f27818i.d(o10.f27670d.L(), o10.f27671e, str, c2482c.f27817h.f27649a).g();
            if (g != null) {
                if (o10.f27671e.equals("script")) {
                    c2482c.f27813c.o(l1.f27783f);
                } else {
                    c2482c.f27813c.o(g);
                }
                c2482c.f27728m = c2482c.f27727l;
                c2482c.f27727l = C.f27642v;
            }
        } else if (b10 == 2) {
            N n6 = (N) s3;
            if (n6.f27671e.equals("br") || n6.f27671e.equals("p")) {
                return c2482c.f27727l.f(s3, c2482c);
            }
            if (n6.f27671e.equals("script") && c2482c.f27815e.size() != 0 && (b2 = c2482c.b()) != null) {
                F f4 = b2.f26349d;
                if (f4.f27658c.equals("script") && f4.f27656a.equals("http://www.w3.org/2000/svg")) {
                    c2482c.j();
                    return true;
                }
            }
            ArrayList arrayList = c2482c.f27815e;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Stack unexpectedly empty");
            }
            int size = arrayList.size() - 1;
            xc.l lVar = (xc.l) arrayList.get(size);
            if (!lVar.K(n6.f27671e)) {
                c2482c.x(this);
            }
            while (size != 0) {
                if (lVar.K(n6.f27671e)) {
                    String str2 = lVar.f26349d.f27658c;
                    for (int size2 = c2482c.f27815e.size() - 1; size2 >= 0 && !c2482c.j().K(str2); size2--) {
                    }
                    return true;
                }
                size--;
                lVar = (xc.l) arrayList.get(size);
                if (lVar.f26349d.f27656a.equals("http://www.w3.org/1999/xhtml")) {
                    return c2482c.f27727l.f(s3, c2482c);
                }
            }
        } else if (b10 == 3) {
            c2482c.I((K) s3);
        } else if (b10 == 4) {
            J j = (J) s3;
            if (j.f27664d.L().equals(C.f27633M)) {
                c2482c.x(this);
            } else if (C.a(j)) {
                c2482c.G(j);
            } else {
                c2482c.G(j);
                c2482c.f27737v = false;
            }
        } else if (b10 != 6) {
            throw new IllegalStateException("Unexpected state: ".concat(y.S.e(s3.f27675a)));
        }
        return true;
    }
}
