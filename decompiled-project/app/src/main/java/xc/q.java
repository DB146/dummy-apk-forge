package xc;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import l2.X;
import yc.D;

/* loaded from: classes2.dex */
public abstract class q implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    public static final List f26367c = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public l f26368a;

    /* renamed from: b, reason: collision with root package name */
    public int f26369b;

    public abstract int C();

    public final List D() {
        if (C() == 0) {
            return f26367c;
        }
        List G9 = G();
        ArrayList arrayList = new ArrayList(G9.size());
        arrayList.addAll(G9);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    /* renamed from: E */
    public q E() {
        q F10 = F(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(F10);
        while (!linkedList.isEmpty()) {
            q qVar = (q) linkedList.remove();
            int C2 = qVar.C();
            for (int i7 = 0; i7 < C2; i7++) {
                List G9 = qVar.G();
                q F11 = ((q) G9.get(i7)).F(qVar);
                G9.set(i7, F11);
                linkedList.add(F11);
            }
        }
        return F10;
    }

    public q F(q qVar) {
        g S7;
        try {
            q qVar2 = (q) super.clone();
            qVar2.f26368a = (l) qVar;
            qVar2.f26369b = qVar == null ? 0 : this.f26369b;
            if (qVar == null && !(this instanceof g) && (S7 = S()) != null) {
                g gVar = new g(S7.f26349d.f27656a, S7.z(), S7.f26342y);
                b bVar = S7.f26351f;
                if (bVar != null) {
                    gVar.f26351f = bVar.clone();
                }
                gVar.f26341x = S7.f26341x.clone();
                qVar2.f26368a = gVar;
                ((ArrayList) gVar.G()).add(qVar2);
            }
            return qVar2;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public abstract List G();

    public final q H() {
        if (C() == 0) {
            return null;
        }
        return (q) G().get(0);
    }

    public final boolean I(String str) {
        vc.i.D(str);
        if (!J()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (y().F(substring) != -1 && !b(substring).isEmpty()) {
                return true;
            }
        }
        return y().F(str) != -1;
    }

    public abstract boolean J();

    public final boolean K(String str) {
        return P().equals(str);
    }

    public final l L() {
        q qVar = this;
        do {
            qVar = qVar.M();
            if (qVar == null) {
                return null;
            }
        } while (!(qVar instanceof l));
        return (l) qVar;
    }

    public final q M() {
        l lVar = this.f26368a;
        if (lVar == null) {
            return null;
        }
        List G9 = lVar.G();
        int i7 = this.f26369b + 1;
        ArrayList arrayList = (ArrayList) G9;
        if (arrayList.size() > i7) {
            return (q) arrayList.get(i7);
        }
        return null;
    }

    public abstract String N();

    public abstract String O();

    public String P() {
        return N();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [l2.X] */
    /* JADX WARN: Type inference failed for: r3v3, types: [zc.u] */
    /* JADX WARN: Type inference failed for: r3v4, types: [l2.X, xc.s] */
    public String Q() {
        ?? x2;
        StringBuilder b2 = wc.l.b();
        wc.c e2 = wc.c.e(b2);
        g S7 = S();
        if (S7 == null) {
            S7 = new g("http://www.w3.org/1999/xhtml", "");
        }
        f fVar = S7.f26341x;
        fVar.getClass();
        if (fVar.f26337c) {
            x2 = new X(this, e2, fVar, 14);
            x2.f26376e = false;
            q qVar = this;
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
            x2 = new X(this, e2, fVar, 14);
        }
        x2.h(this);
        return wc.l.l(b2);
    }

    public abstract void R(wc.c cVar, f fVar);

    public final g S() {
        q Y2 = Y();
        if (Y2 instanceof g) {
            return (g) Y2;
        }
        return null;
    }

    public abstract l T();

    public final q U() {
        l lVar = this.f26368a;
        if (lVar == null || this.f26369b <= 0) {
            return null;
        }
        return (q) ((ArrayList) lVar.G()).get(this.f26369b - 1);
    }

    public final void V(int i7) {
        int C2 = C();
        if (C2 == 0) {
            return;
        }
        List G9 = G();
        while (i7 < C2) {
            ((q) G9.get(i7)).f26369b = i7;
            i7++;
        }
    }

    public void W(q qVar) {
        vc.i.y(qVar.f26368a == this);
        int i7 = qVar.f26369b;
        ((ArrayList) G()).remove(i7);
        V(i7);
        qVar.f26368a = null;
    }

    public final void X(l lVar) {
        vc.i.D(lVar);
        if (this.f26368a == null) {
            this.f26368a = lVar.f26368a;
        }
        vc.i.D(this.f26368a);
        l lVar2 = this.f26368a;
        lVar2.getClass();
        vc.i.y(this.f26368a == lVar2);
        if (this == lVar) {
            return;
        }
        l lVar3 = lVar.f26368a;
        if (lVar3 != null) {
            lVar3.W(lVar);
        }
        int i7 = this.f26369b;
        ((ArrayList) lVar2.G()).set(i7, lVar);
        lVar.f26368a = lVar2;
        lVar.f26369b = i7;
        this.f26368a = null;
    }

    public q Y() {
        q qVar = this;
        while (true) {
            l lVar = qVar.f26368a;
            if (lVar == null) {
                return qVar;
            }
            qVar = lVar;
        }
    }

    public String b(String str) {
        vc.i.A(str);
        if (!J() || y().F(str) == -1) {
            return "";
        }
        String z8 = z();
        String C2 = y().C(str);
        Pattern pattern = wc.l.f25894d;
        String replaceAll = pattern.matcher(z8).replaceAll("");
        String replaceAll2 = pattern.matcher(C2).replaceAll("");
        try {
            try {
                replaceAll2 = wc.l.m(new URL(replaceAll), replaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                replaceAll2 = new URL(replaceAll2).toExternalForm();
            }
            return replaceAll2;
        } catch (MalformedURLException unused2) {
            return wc.l.f25893c.matcher(replaceAll2).find() ? replaceAll2 : "";
        }
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final void i(int i7, q... qVarArr) {
        vc.i.D(qVarArr);
        if (qVarArr.length == 0) {
            return;
        }
        List G9 = G();
        l T10 = qVarArr[0].T();
        if (T10 != null && T10.f26350e.size() == qVarArr.length) {
            List G10 = T10.G();
            int length = qVarArr.length;
            while (true) {
                int i10 = length - 1;
                if (length <= 0) {
                    boolean z8 = C() == 0;
                    Iterator<E> it = T10.f26350e.iterator();
                    while (it.hasNext()) {
                        ((q) it.next()).f26368a = null;
                    }
                    T10.f26350e.clear();
                    G9.addAll(i7, Arrays.asList(qVarArr));
                    int length2 = qVarArr.length;
                    while (true) {
                        int i11 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        qVarArr[i11].f26368a = (l) this;
                        length2 = i11;
                    }
                    if (z8 && qVarArr[0].f26369b == 0) {
                        return;
                    }
                    V(i7);
                    return;
                }
                if (qVarArr[i10] != ((ArrayList) G10).get(i10)) {
                    break;
                } else {
                    length = i10;
                }
            }
        }
        for (q qVar : qVarArr) {
            if (qVar == null) {
                throw new IllegalArgumentException("Array must not contain any null objects");
            }
        }
        for (q qVar2 : qVarArr) {
            qVar2.getClass();
            l lVar = qVar2.f26368a;
            if (lVar != null) {
                lVar.W(qVar2);
            }
            qVar2.f26368a = (l) this;
        }
        G9.addAll(i7, Arrays.asList(qVarArr));
        V(i7);
    }

    public String o(String str) {
        vc.i.D(str);
        if (!J()) {
            return "";
        }
        String C2 = y().C(str);
        return C2.length() > 0 ? C2 : str.startsWith("abs:") ? b(str.substring(4)) : "";
    }

    public void t(String str, String str2) {
        g S7 = S();
        D d10 = S7 != null ? S7.f26342y.f27653c : D.f27647c;
        d10.getClass();
        String trim = str.trim();
        if (!d10.f27650b) {
            trim = wc.c.c(trim);
        }
        b y10 = y();
        int F10 = y10.F(trim);
        if (F10 == -1) {
            y10.i(trim, str2);
            return;
        }
        y10.f26334c[F10] = str2;
        if (y10.f26333b[F10].equals(trim)) {
            return;
        }
        y10.f26333b[F10] = trim;
    }

    public String toString() {
        return Q();
    }

    public abstract b y();

    public abstract String z();
}
