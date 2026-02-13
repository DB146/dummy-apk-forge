package J8;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: J8.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362q extends G8.z {

    /* renamed from: c, reason: collision with root package name */
    public static final C0360o f5713c = new C0360o(G8.x.f4396a, 1);

    /* renamed from: a, reason: collision with root package name */
    public final G8.m f5714a;

    /* renamed from: b, reason: collision with root package name */
    public final G8.x f5715b;

    public C0362q(G8.m mVar, G8.x xVar) {
        this.f5714a = mVar;
        this.f5715b = xVar;
    }

    @Override // G8.z
    public final Object b(O8.a aVar) {
        Object arrayList;
        Serializable arrayList2;
        int j02 = aVar.j0();
        int b2 = P.c.b(j02);
        if (b2 == 0) {
            aVar.l();
            arrayList = new ArrayList();
        } else if (b2 != 2) {
            arrayList = null;
        } else {
            aVar.n();
            arrayList = new I8.n(true);
        }
        if (arrayList == null) {
            return d(aVar, j02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.W()) {
                String d02 = arrayList instanceof Map ? aVar.d0() : null;
                int j03 = aVar.j0();
                int b10 = P.c.b(j03);
                if (b10 == 0) {
                    aVar.l();
                    arrayList2 = new ArrayList();
                } else if (b10 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.n();
                    arrayList2 = new I8.n(true);
                }
                boolean z8 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(aVar, j03);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(d02, arrayList2);
                }
                if (z8) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.P();
                } else {
                    aVar.T();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        if (obj == null) {
            bVar.W();
            return;
        }
        Class<?> cls = obj.getClass();
        G8.m mVar = this.f5714a;
        mVar.getClass();
        G8.z d10 = mVar.d(new N8.a(cls));
        if (!(d10 instanceof C0362q)) {
            d10.c(bVar, obj);
        } else {
            bVar.F();
            bVar.T();
        }
    }

    public final Serializable d(O8.a aVar, int i7) {
        int b2 = P.c.b(i7);
        if (b2 == 5) {
            return aVar.h0();
        }
        if (b2 == 6) {
            return this.f5715b.a(aVar);
        }
        if (b2 == 7) {
            return Boolean.valueOf(aVar.Z());
        }
        if (b2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(A3.c.t(i7)));
        }
        aVar.f0();
        return null;
    }
}
