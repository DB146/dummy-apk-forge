package Bc;

import A0.G0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2309a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f2310b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2311c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2312d;

    public /* synthetic */ k() {
    }

    public k(G0 g02, h hVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            k kVar = new k();
            fVar.c();
            fVar.b();
            kVar.f2312d = fVar.d();
            kVar.f2311c = fVar.e();
            String a9 = fVar.a();
            kVar.f2310b = a9;
            if (!fVar.f()) {
                linkedHashMap.put(a9, kVar);
            }
        }
        this.f2310b = linkedHashMap;
        this.f2311c = g02;
        this.f2312d = hVar;
    }

    public final String a() {
        switch (this.f2309a) {
            case 0:
                return (String) this.f2311c;
            default:
                G0 g02 = (G0) this.f2311c;
                m mVar = (m) g02.f29d;
                if (!(mVar.contains(this) || mVar.isEmpty())) {
                    return null;
                }
                StringBuilder sb2 = (StringBuilder) g02.f27b;
                int length = sb2.length();
                i iVar = (i) g02.f28c;
                if (length <= 0 && iVar.peek().B()) {
                    int size = mVar.size();
                    if ((size <= 0 ? null : mVar.get(size - 1)) == this) {
                        return null;
                    }
                    int size2 = mVar.size();
                    if (size2 > 0) {
                        mVar.remove(size2 - 1);
                    }
                    iVar.next();
                }
                h peek = iVar.peek();
                while (true) {
                    int size3 = mVar.size();
                    if ((size3 <= 0 ? null : mVar.get(size3 - 1)) == this && peek.u()) {
                        h peek2 = iVar.peek();
                        if (peek2.u()) {
                            sb2.append(peek2.getValue());
                        }
                        iVar.next();
                        peek = iVar.peek();
                    }
                }
                if (sb2.length() <= 0) {
                    return null;
                }
                String sb3 = sb2.toString();
                sb2.setLength(0);
                return sb3;
        }
    }

    public final String toString() {
        switch (this.f2309a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("attribute ");
                sb2.append((String) this.f2310b);
                sb2.append("='");
                return h3.o.p(sb2, (String) this.f2311c, "'");
            default:
                return X.c.t("element ", ((h) this.f2312d).getName());
        }
    }
}
