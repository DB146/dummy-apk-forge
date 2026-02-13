package xc;

import java.nio.charset.Charset;
import java.util.Iterator;
import yc.C2482c;
import yc.D;
import yc.E;
import yc.F;
import yc.H;

/* loaded from: classes2.dex */
public final class g extends l {

    /* renamed from: x, reason: collision with root package name */
    public f f26341x;

    /* renamed from: y, reason: collision with root package name */
    public E f26342y;

    /* renamed from: z, reason: collision with root package name */
    public int f26343z;

    public g(String str, String str2) {
        this(str, str2, new E(new C2482c()));
    }

    public g(String str, String str2, E e2) {
        super(new F("#root", wc.c.d("#root"), str), str2, null);
        this.f26341x = new f();
        this.f26343z = 1;
        this.f26342y = e2;
    }

    @Override // xc.l, xc.q
    public final String N() {
        return "#document";
    }

    @Override // xc.q
    public final String Q() {
        return j0();
    }

    public final l p0() {
        l h02 = h0();
        while (true) {
            if (h02 == null) {
                h02 = a0("html");
                break;
            }
            if (h02.K("html")) {
                break;
            }
            h02 = h02.L();
        }
        for (l h03 = h02.h0(); h03 != null; h03 = h03.L()) {
            if (h03.K("body") || h03.K("frameset")) {
                return h03;
            }
        }
        return h02.a0("body");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        if (r10.Z().equals("xml") != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(Charset charset) {
        y yVar;
        f fVar = this.f26341x;
        fVar.f26336b = charset;
        int i7 = fVar.f26340f;
        if (i7 != 1) {
            if (i7 == 2) {
                q H10 = H();
                if (H10 instanceof y) {
                    yVar = (y) H10;
                }
                yVar = new y("xml", false);
                i(0, yVar);
                yVar.t("version", "1.0");
                yVar.t("encoding", this.f26341x.f26336b.displayName());
                return;
            }
            return;
        }
        l n02 = n0("meta[charset]");
        if (n02 != null) {
            n02.t("charset", this.f26341x.f26336b.displayName());
        } else {
            l h02 = h0();
            while (true) {
                if (h02 == null) {
                    h02 = a0("html");
                    break;
                } else if (h02.K("html")) {
                    break;
                } else {
                    h02 = h02.L();
                }
            }
            l h03 = h02.h0();
            while (true) {
                if (h03 == null) {
                    String str = h02.f26349d.f27656a;
                    g S7 = h02.S();
                    E e2 = S7 != null ? S7.f26342y : new E(new C2482c());
                    if (e2.f27654d == null) {
                        e2.f27654d = e2.f27651a.f();
                    }
                    H h10 = e2.f27654d;
                    D d10 = e2.f27653c;
                    h10.getClass();
                    l lVar = new l(h10.d("head", wc.c.d("head"), str, d10.f27649a), h02.z(), null);
                    h02.i(0, lVar);
                    h03 = lVar;
                } else if (h03.K("head")) {
                    break;
                } else {
                    h03 = h03.L();
                }
            }
            h03.a0("meta").t("charset", this.f26341x.f26336b.displayName());
        }
        Iterator<E> it = m0("meta[name=charset]").iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            l lVar2 = qVar.f26368a;
            if (lVar2 != null) {
                lVar2.W(qVar);
            }
        }
    }

    @Override // xc.l
    /* renamed from: r0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g E() {
        g gVar = (g) super.E();
        b bVar = this.f26351f;
        if (bVar != null) {
            gVar.f26351f = bVar.clone();
        }
        gVar.f26341x = this.f26341x.clone();
        return gVar;
    }
}
