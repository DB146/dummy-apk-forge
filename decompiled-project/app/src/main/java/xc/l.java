package xc;

import ia.C1358d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import l2.X;
import yc.C2482c;
import yc.D;
import yc.E;
import yc.F;
import yc.H;

/* loaded from: classes2.dex */
public class l extends q implements Iterable {

    /* renamed from: u, reason: collision with root package name */
    public static final List f26346u = Collections.emptyList();

    /* renamed from: v, reason: collision with root package name */
    public static final k f26347v = new ArrayList(0);

    /* renamed from: w, reason: collision with root package name */
    public static final String f26348w;

    /* renamed from: d, reason: collision with root package name */
    public final F f26349d;

    /* renamed from: e, reason: collision with root package name */
    public k f26350e;

    /* renamed from: f, reason: collision with root package name */
    public b f26351f;

    /* JADX WARN: Type inference failed for: r0v1, types: [xc.k, java.util.ArrayList] */
    static {
        Pattern.compile("\\s+");
        f26348w = "/baseUri";
    }

    public l(F f4, String str, b bVar) {
        vc.i.D(f4);
        this.f26350e = f26347v;
        this.f26351f = bVar;
        this.f26349d = f4;
        if (str != null) {
            e0(str);
        }
    }

    public static void b0(StringBuilder sb2, x xVar) {
        String Z7 = xVar.Z();
        l lVar = xVar.f26368a;
        if (lVar != null) {
            int i7 = 0;
            while ((lVar.f26349d.f27659d & 64) == 0) {
                lVar = lVar.f26368a;
                i7++;
                if (i7 < 6 && lVar != null) {
                }
            }
            sb2.append(Z7);
        }
        if (!(xVar instanceof c)) {
            wc.l.a(Z7, sb2, x.c0(sb2));
            return;
        }
        sb2.append(Z7);
    }

    @Override // xc.q
    public final int C() {
        return this.f26350e.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xc.k, java.util.AbstractCollection, java.util.ArrayList] */
    @Override // xc.q
    public final q F(q qVar) {
        l lVar = (l) super.F(qVar);
        ?? arrayList = new ArrayList(this.f26350e.size());
        lVar.f26350e = arrayList;
        arrayList.addAll(this.f26350e);
        b bVar = this.f26351f;
        if (bVar != null) {
            b clone = bVar.clone();
            lVar.f26351f = clone;
            clone.J().put("jsoup.childEls", null);
        }
        return lVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [xc.k, java.util.ArrayList] */
    @Override // xc.q
    public final List G() {
        if (this.f26350e == f26347v) {
            this.f26350e = new ArrayList(4);
        }
        return this.f26350e;
    }

    @Override // xc.q
    public final boolean J() {
        return this.f26351f != null;
    }

    @Override // xc.q
    public String N() {
        return this.f26349d.f27657b;
    }

    @Override // xc.q
    public final String O() {
        return (String) this.f26350e.stream().map(new wc.b(4)).collect(wc.l.k(""));
    }

    @Override // xc.q
    public final String P() {
        return this.f26349d.f27658c;
    }

    @Override // xc.q
    public void R(wc.c cVar, f fVar) {
        int i7 = fVar.f26340f;
        F f4 = this.f26349d;
        String a9 = i7 == 2 ? a.a(2, f4.f27657b) : f4.f27657b;
        cVar.a('<').b(a9);
        b bVar = this.f26351f;
        if (bVar != null) {
            bVar.D(cVar, fVar);
        }
        if (!this.f26350e.isEmpty()) {
            cVar.a('>');
            return;
        }
        int i10 = fVar.f26340f;
        F f10 = this.f26349d;
        boolean z8 = i10 == 2 || !f10.f27656a.equals("http://www.w3.org/1999/xhtml");
        if (z8 && (f10.b(32) || (f10.d() && (f10.c() || f10.e())))) {
            cVar.b(" />");
        } else if (z8 || !f10.c()) {
            cVar.b("></").b(a9).a('>');
        } else {
            cVar.a('>');
        }
    }

    @Override // xc.q
    public final l T() {
        return this.f26368a;
    }

    @Override // xc.q
    public final q Y() {
        l lVar = this;
        while (true) {
            l lVar2 = lVar.f26368a;
            if (lVar2 == null) {
                return lVar;
            }
            lVar = lVar2;
        }
    }

    public final void Z(q qVar) {
        vc.i.D(qVar);
        l lVar = qVar.f26368a;
        if (lVar != null) {
            lVar.W(qVar);
        }
        qVar.f26368a = this;
        G();
        this.f26350e.add(qVar);
        qVar.f26369b = this.f26350e.size() - 1;
    }

    public final l a0(String str) {
        String str2 = this.f26349d.f27656a;
        g S7 = S();
        E e2 = S7 != null ? S7.f26342y : new E(new C2482c());
        if (e2.f27654d == null) {
            e2.f27654d = e2.f27651a.f();
        }
        H h10 = e2.f27654d;
        D d10 = e2.f27653c;
        h10.getClass();
        l lVar = new l(h10.d(str, wc.c.d(str), str2, d10.f27649a), z(), null);
        Z(lVar);
        return lVar;
    }

    public final List c0() {
        List list;
        Integer num;
        if (this.f26350e.size() == 0) {
            return f26346u;
        }
        Map J10 = y().J();
        WeakReference weakReference = (WeakReference) J10.get("jsoup.childEls");
        if (weakReference == null || (list = (List) weakReference.get()) == null || (num = (Integer) J10.get("jsoup.childElsMod")) == null || num.intValue() != this.f26350e.i()) {
            list = null;
        }
        if (list != null) {
            return list;
        }
        List g02 = g0(l.class);
        Map J11 = y().J();
        J11.put("jsoup.childEls", new WeakReference(g02));
        J11.put("jsoup.childElsMod", Integer.valueOf(this.f26350e.i()));
        return g02;
    }

    @Override // xc.q
    /* renamed from: d0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public l E() {
        return (l) super.E();
    }

    public final void e0(String str) {
        y().H(f26348w, str);
    }

    public final int f0() {
        l lVar = this.f26368a;
        if (lVar == null) {
            return 0;
        }
        List c02 = lVar.c0();
        int size = c02.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (c02.get(i7) == this) {
                return i7;
            }
        }
        return 0;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        android.support.v4.media.session.b.F(this, l.class).forEach(consumer);
    }

    public final List g0(final Class cls) {
        return (List) this.f26350e.stream().filter(new Predicate() { // from class: xc.i
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cls.isInstance((q) obj);
            }
        }).map(new Function() { // from class: xc.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cls.cast((q) obj);
            }
        }).collect(Collectors.collectingAndThen(Collectors.toList(), new wc.b(3)));
    }

    public final l h0() {
        for (q H10 = H(); H10 != null; H10 = H10.M()) {
            if (H10 instanceof l) {
                return (l) H10;
            }
        }
        return null;
    }

    public final zc.e i0(String str) {
        vc.i.A(str);
        return h3.H.m(new zc.h(wc.c.d(str), 9, false), this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r(this, l.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [l2.X] */
    /* JADX WARN: Type inference failed for: r6v2, types: [zc.u] */
    /* JADX WARN: Type inference failed for: r6v3, types: [l2.X, xc.s] */
    public final String j0() {
        ?? x2;
        StringBuilder b2 = wc.l.b();
        q H10 = H();
        if (H10 != null) {
            wc.c e2 = wc.c.e(b2);
            g S7 = H10.S();
            if (S7 == null) {
                S7 = new g("http://www.w3.org/1999/xhtml", "");
            }
            f fVar = S7.f26341x;
            fVar.getClass();
            if (fVar.f26337c) {
                x2 = new X(H10, e2, fVar, 14);
                x2.f26376e = false;
                q qVar = H10;
                while (true) {
                    if (qVar != null) {
                        if ((qVar instanceof l) && ((l) qVar).f26349d.b(64)) {
                            x2.f26376e = true;
                            break;
                        }
                        qVar = qVar.f26368a;
                    } else {
                        break;
                    }
                }
            } else {
                x2 = new X(H10, e2, fVar, 14);
            }
            while (H10 != null) {
                x2.h(H10);
                H10 = H10.M();
            }
        }
        String l10 = wc.l.l(b2);
        g S10 = S();
        if (S10 == null) {
            S10 = new g("http://www.w3.org/1999/xhtml", "");
        }
        return S10.f26341x.f26337c ? l10.trim() : l10;
    }

    public void k0(wc.c cVar, f fVar) {
        if (this.f26350e.isEmpty()) {
            return;
        }
        wc.c b2 = cVar.b("</");
        int i7 = fVar.f26340f;
        F f4 = this.f26349d;
        b2.b(i7 == 2 ? a.a(2, f4.f27657b) : f4.f27657b).a('>');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String l0() {
        StringBuilder b2 = wc.l.b();
        for (int i7 = 0; i7 < this.f26350e.size(); i7++) {
            q qVar = (q) this.f26350e.get(i7);
            if (qVar instanceof x) {
                b0(b2, (x) qVar);
            } else if (qVar.K("br") && !x.c0(b2)) {
                b2.append(" ");
            }
        }
        return wc.l.l(b2).trim();
    }

    public final zc.e m0(String str) {
        vc.i.A(str);
        return h3.H.m(zc.v.X(str), this);
    }

    public final l n0(String str) {
        vc.i.A(str);
        zc.p X10 = zc.v.X(str);
        X10.e();
        return (l) android.support.v4.media.session.b.F(this, l.class).filter(new zc.f(X10, this, 0)).findFirst().orElse(null);
    }

    public final String o0() {
        StringBuilder b2 = wc.l.b();
        new C1358d(b2, 23).h(this);
        return wc.l.l(b2).trim();
    }

    @Override // xc.q
    public final b y() {
        if (this.f26351f == null) {
            this.f26351f = new b();
        }
        return this.f26351f;
    }

    @Override // xc.q
    public final String z() {
        for (l lVar = this; lVar != null; lVar = lVar.f26368a) {
            b bVar = lVar.f26351f;
            if (bVar != null) {
                String str = f26348w;
                if (bVar.E(str) != -1) {
                    return lVar.f26351f.z(str);
                }
            }
        }
        return "";
    }
}
