package yc;

import java.util.Iterator;

/* renamed from: yc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2484d extends C {
    public C2484d() {
        super("InTableText", 9);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        if (s3.f27675a == 5) {
            J j = (J) s3;
            if (j.f27664d.L().equals(C.f27633M)) {
                c2482c.x(this);
                return false;
            }
            c2482c.f27735t.add(new J(j));
            return true;
        }
        if (c2482c.f27735t.size() > 0) {
            S s10 = c2482c.g;
            Iterator it = c2482c.f27735t.iterator();
            while (it.hasNext()) {
                J j10 = (J) it.next();
                c2482c.g = j10;
                if (C.a(j10)) {
                    c2482c.G(j10);
                } else {
                    c2482c.x(this);
                    boolean d10 = wc.l.d(c2482c.b().f26349d.f27658c, B.f27621z);
                    C2525y c2525y = C.f27641u;
                    if (d10) {
                        c2482c.f27738w = true;
                        c2525y.f(j10, c2482c);
                        c2482c.f27738w = false;
                    } else {
                        c2525y.f(j10, c2482c);
                    }
                }
            }
            c2482c.g = s10;
            c2482c.f27735t.clear();
        }
        c2482c.f27727l = c2482c.f27728m;
        return c2482c.k(s3);
    }
}
