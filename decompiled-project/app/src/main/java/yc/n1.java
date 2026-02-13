package yc;

import androidx.datastore.preferences.protobuf.C0801d;
import java.io.Reader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class n1 extends m1 {

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f27819l = new ArrayDeque();

    @Override // yc.m1
    public final List a() {
        return this.f27814d.D();
    }

    @Override // yc.m1
    public final String d() {
        return "http://www.w3.org/XML/1998/namespace";
    }

    @Override // yc.m1
    public final D e() {
        return D.f27648d;
    }

    @Override // yc.m1
    public final H f() {
        return new H();
    }

    @Override // yc.m1
    public final void g(Reader reader, String str, E e2) {
        super.g(reader, str, e2);
        xc.f fVar = this.f27814d.f26341x;
        fVar.f26340f = 2;
        fVar.f26335a = xc.m.f26352e;
        fVar.f26337c = false;
        ArrayDeque arrayDeque = this.f27819l;
        arrayDeque.clear();
        HashMap hashMap = new HashMap();
        hashMap.put("xml", "http://www.w3.org/XML/1998/namespace");
        hashMap.put("", "http://www.w3.org/XML/1998/namespace");
        arrayDeque.push(hashMap);
    }

    @Override // yc.m1
    public final void h() {
    }

    @Override // yc.m1
    public final m1 i() {
        return new n1();
    }

    @Override // yc.m1
    public final xc.l j() {
        this.f27819l.pop();
        return super.j();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // yc.m1
    public final boolean k(S s3) {
        String str;
        this.g = s3;
        xc.l lVar = null;
        switch (P.c.b(s3.f27675a)) {
            case 0:
                L l10 = (L) s3;
                D d10 = this.f27817h;
                String L = l10.f27666d.L();
                d10.getClass();
                String trim = L.trim();
                if (!d10.f27649a) {
                    trim = wc.c.c(trim);
                }
                xc.h hVar = new xc.h(trim, l10.f27668f.L(), l10.g.L());
                String str2 = l10.f27667e;
                if (str2 != null) {
                    hVar.t("pubSysKey", str2);
                }
                b().Z(hVar);
                return true;
            case 1:
                O o10 = (O) s3;
                ArrayDeque arrayDeque = this.f27819l;
                HashMap hashMap = new HashMap((Map) arrayDeque.peek());
                arrayDeque.push(hashMap);
                xc.b bVar = o10.g;
                if (bVar != null) {
                    bVar.y(this.f27817h);
                    bVar.getClass();
                    C0801d c0801d = new C0801d(bVar);
                    while (c0801d.hasNext()) {
                        xc.a aVar = (xc.a) c0801d.next();
                        String str3 = aVar.f26329a;
                        String str4 = aVar.f26330b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        if (str3.equals("xmlns")) {
                            hashMap.put("", str4);
                        } else if (str3.startsWith("xmlns:")) {
                            hashMap.put(str3.substring(6), str4);
                        }
                    }
                    HashMap hashMap2 = new HashMap();
                    C0801d c0801d2 = new C0801d(bVar);
                    while (c0801d2.hasNext()) {
                        String str5 = ((xc.a) c0801d2.next()).f26329a;
                        int indexOf = str5.indexOf(58);
                        String substring = indexOf == -1 ? "" : str5.substring(0, indexOf);
                        if (!substring.isEmpty() && !substring.equals("xmlns") && (str = (String) hashMap.get(substring)) != null) {
                            hashMap2.put("jsoup.xmlns-".concat(substring), str);
                        }
                    }
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        String str6 = (String) entry.getKey();
                        Object value = entry.getValue();
                        vc.i.D(str6);
                        bVar.J().put(str6, value);
                    }
                }
                String L10 = o10.f27670d.L();
                String str7 = (String) hashMap.get("");
                int indexOf2 = L10.indexOf(58);
                if (indexOf2 > 0) {
                    String substring2 = L10.substring(0, indexOf2);
                    if (hashMap.containsKey(substring2)) {
                        str7 = (String) hashMap.get(substring2);
                    }
                }
                F d11 = this.f27818i.d(L10, o10.f27671e, str7, this.f27817h.f27649a);
                this.f27817h.a(bVar);
                xc.l lVar2 = new xc.l(d11, null, bVar);
                b().Z(lVar2);
                this.f27815e.add(lVar2);
                if (o10.f27672f) {
                    d11.f27659d |= 32;
                    j();
                } else if (d11.c()) {
                    j();
                } else {
                    l1 g = d11.g();
                    if (g != null) {
                        this.f27813c.o(g);
                    }
                }
                return true;
            case 2:
                D d12 = this.f27817h;
                String L11 = ((N) s3).f27670d.L();
                d12.getClass();
                String trim2 = L11.trim();
                if (!d12.f27649a) {
                    trim2 = wc.c.c(trim2);
                }
                int size = this.f27815e.size();
                int i7 = size + (-1) >= 256 ? size - 257 : 0;
                int size2 = this.f27815e.size() - 1;
                while (true) {
                    if (size2 >= i7) {
                        xc.l lVar3 = (xc.l) this.f27815e.get(size2);
                        if (lVar3.N().equals(trim2)) {
                            lVar = lVar3;
                        } else {
                            size2--;
                        }
                    }
                }
                if (lVar != null) {
                    for (int size3 = this.f27815e.size() - 1; size3 >= 0 && j() != lVar; size3--) {
                    }
                }
                return true;
            case 3:
                b().Z(new xc.p(((K) s3).f27665d.L()));
                return true;
            case 4:
                J j = (J) s3;
                String L12 = j.f27664d.L();
                b().Z(j instanceof I ? new xc.p(L12) : b().f26349d.b(256) ? new xc.p(L12) : new xc.p(L12));
                return true;
            case 5:
                Q q10 = (Q) s3;
                xc.y yVar = new xc.y(q10.f27670d.L(), q10.k);
                if (q10.g != null) {
                    yVar.y().b(q10.g);
                }
                b().Z(yVar);
                return true;
            case 6:
                return true;
            default:
                throw new IllegalArgumentException("Unexpected token type: ".concat(y.S.e(s3.f27675a)));
        }
    }
}
