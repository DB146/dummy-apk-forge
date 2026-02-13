package J8;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: J8.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0358m extends G8.z {

    /* renamed from: a, reason: collision with root package name */
    public static final C0358m f5704a = new C0358m();

    private C0358m() {
    }

    public static G8.o d(O8.a aVar, int i7) {
        int b2 = P.c.b(i7);
        if (b2 == 5) {
            return new G8.s(aVar.h0());
        }
        if (b2 == 6) {
            return new G8.s(new I8.j(aVar.h0()));
        }
        if (b2 == 7) {
            return new G8.s(Boolean.valueOf(aVar.Z()));
        }
        if (b2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(A3.c.t(i7)));
        }
        aVar.f0();
        return G8.q.f4393a;
    }

    public static void e(O8.b bVar, G8.o oVar) {
        if (oVar == null || (oVar instanceof G8.q)) {
            bVar.W();
            return;
        }
        boolean z8 = oVar instanceof G8.s;
        if (z8) {
            if (!z8) {
                throw new IllegalStateException("Not a JSON Primitive: " + oVar);
            }
            G8.s sVar = (G8.s) oVar;
            Serializable serializable = sVar.f4395a;
            if (serializable instanceof Number) {
                bVar.d0(sVar.i());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.f0(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(sVar.o()));
                return;
            } else {
                bVar.e0(sVar.o());
                return;
            }
        }
        boolean z10 = oVar instanceof G8.n;
        if (z10) {
            bVar.n();
            if (!z10) {
                throw new IllegalStateException("Not a JSON Array: " + oVar);
            }
            Iterator it = ((G8.n) oVar).f4392a.iterator();
            while (it.hasNext()) {
                e(bVar, (G8.o) it.next());
            }
            bVar.P();
            return;
        }
        boolean z11 = oVar instanceof G8.r;
        if (!z11) {
            throw new IllegalArgumentException("Couldn't write " + oVar.getClass());
        }
        bVar.F();
        if (!z11) {
            throw new IllegalStateException("Not a JSON Object: " + oVar);
        }
        Iterator it2 = ((I8.l) ((G8.r) oVar).f4394a.entrySet()).iterator();
        while (((I8.k) it2).hasNext()) {
            I8.m b2 = ((I8.k) it2).b();
            bVar.U((String) b2.getKey());
            e(bVar, (G8.o) b2.getValue());
        }
        bVar.T();
    }

    @Override // G8.z
    public final Object b(O8.a aVar) {
        G8.o nVar;
        G8.o nVar2;
        int j02 = aVar.j0();
        int b2 = P.c.b(j02);
        if (b2 == 0) {
            aVar.l();
            nVar = new G8.n();
        } else if (b2 != 2) {
            nVar = null;
        } else {
            aVar.n();
            nVar = new G8.r();
        }
        if (nVar == null) {
            return d(aVar, j02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.W()) {
                String d02 = nVar instanceof G8.r ? aVar.d0() : null;
                int j03 = aVar.j0();
                int b10 = P.c.b(j03);
                if (b10 == 0) {
                    aVar.l();
                    nVar2 = new G8.n();
                } else if (b10 != 2) {
                    nVar2 = null;
                } else {
                    aVar.n();
                    nVar2 = new G8.r();
                }
                boolean z8 = nVar2 != null;
                if (nVar2 == null) {
                    nVar2 = d(aVar, j03);
                }
                if (nVar instanceof G8.n) {
                    ((G8.n) nVar).f4392a.add(nVar2);
                } else {
                    ((G8.r) nVar).f4394a.put(d02, nVar2);
                }
                if (z8) {
                    arrayDeque.addLast(nVar);
                    nVar = nVar2;
                }
            } else {
                if (nVar instanceof G8.n) {
                    aVar.P();
                } else {
                    aVar.T();
                }
                if (arrayDeque.isEmpty()) {
                    return nVar;
                }
                nVar = (G8.o) arrayDeque.removeLast();
            }
        }
    }

    @Override // G8.z
    public final /* bridge */ /* synthetic */ void c(O8.b bVar, Object obj) {
        e(bVar, (G8.o) obj);
    }
}
