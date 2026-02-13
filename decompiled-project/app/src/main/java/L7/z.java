package L7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public final E f6412b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6413c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f6414d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f6415e;

    /* renamed from: f, reason: collision with root package name */
    public final y f6416f;
    public final N7.a g;

    /* renamed from: h, reason: collision with root package name */
    public final Q7.h f6417h;

    /* renamed from: i, reason: collision with root package name */
    public long f6418i = 1;

    /* renamed from: a, reason: collision with root package name */
    public O7.g f6411a = O7.g.f7494d;

    /* JADX WARN: Type inference failed for: r0v2, types: [L7.E, java.lang.Object] */
    public z(C0384d c0384d, N7.a aVar, y yVar) {
        ?? obj = new Object();
        obj.f6317a = C0381a.f6320b;
        obj.f6318b = new ArrayList();
        obj.f6319c = -1L;
        this.f6412b = obj;
        this.f6413c = new HashMap();
        this.f6414d = new HashMap();
        this.f6415e = new HashSet();
        this.f6416f = yVar;
        this.g = aVar;
        this.f6417h = c0384d.b("SyncTree");
    }

    public static ArrayList a(z zVar, H2.E e2) {
        O7.g gVar = zVar.f6411a;
        C0385e c0385e = C0385e.f6337d;
        E e10 = zVar.f6412b;
        e10.getClass();
        return zVar.d(e2, gVar, null, new q3.s(14, c0385e, e10, false));
    }

    public static ArrayList b(z zVar, Q7.f fVar, H2.E e2) {
        zVar.getClass();
        O7.g gVar = zVar.f6411a;
        C0385e c0385e = fVar.f8685a;
        n nVar = (n) gVar.o(c0385e);
        O7.k.b("Missing sync point for query tag that we're tracking", nVar != null);
        E e10 = zVar.f6412b;
        e10.getClass();
        return nVar.a(e2, new q3.s(14, c0385e, e10, false), null);
    }

    public static void f(O7.g gVar, ArrayList arrayList) {
        n nVar = (n) gVar.f7495a;
        if (nVar != null && nVar.f()) {
            arrayList.add(nVar.d());
            return;
        }
        if (nVar != null) {
            nVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = nVar.f6372a.entrySet().iterator();
            while (it.hasNext()) {
                Q7.g gVar2 = (Q7.g) ((Map.Entry) it.next()).getValue();
                if (!gVar2.f8687a.f8686b.d()) {
                    arrayList2.add(gVar2);
                }
            }
            arrayList.addAll(arrayList2);
        }
        Iterator it2 = gVar.f7496b.iterator();
        while (it2.hasNext()) {
            f((O7.g) ((Map.Entry) it2.next()).getValue(), arrayList);
        }
    }

    public static Q7.f g(Q7.f fVar) {
        return (!fVar.f8686b.d() || fVar.b()) ? fVar : Q7.f.a(fVar.f8685a);
    }

    public final ArrayList c(H2.E e2, O7.g gVar, T7.s sVar, q3.s sVar2) {
        n nVar = (n) gVar.f7495a;
        if (sVar == null && nVar != null) {
            sVar = nVar.c(C0385e.f6337d);
        }
        ArrayList arrayList = new ArrayList();
        gVar.f7496b.z(new t(this, sVar, sVar2, e2, arrayList));
        if (nVar != null) {
            arrayList.addAll(nVar.a(e2, sVar2, sVar));
        }
        return arrayList;
    }

    public final ArrayList d(H2.E e2, O7.g gVar, T7.s sVar, q3.s sVar2) {
        C0385e c0385e = (C0385e) e2.f4588c;
        if (c0385e.isEmpty()) {
            return c(e2, gVar, sVar, sVar2);
        }
        n nVar = (n) gVar.f7495a;
        if (sVar == null && nVar != null) {
            sVar = nVar.c(C0385e.f6337d);
        }
        ArrayList arrayList = new ArrayList();
        T7.c C2 = c0385e.C();
        H2.E x2 = e2.x(C2);
        O7.g gVar2 = (O7.g) gVar.f7496b.i(C2);
        if (gVar2 != null && x2 != null) {
            arrayList.addAll(d(x2, gVar2, sVar != null ? sVar.h(C2) : null, new q3.s(14, ((C0385e) sVar2.f23438b).o(C2), (E) sVar2.f23439c, false)));
        }
        if (nVar != null) {
            arrayList.addAll(nVar.a(e2, sVar2, sVar));
        }
        return arrayList;
    }

    public final List e(C0385e c0385e, T7.s sVar) {
        return (List) this.g.c(new w(this, c0385e, sVar));
    }

    public final List h(Q7.f fVar, x xVar, G7.b bVar, boolean z8) {
        return (List) this.g.c(new s(this, fVar, xVar, bVar, z8));
    }

    public final A i(Q7.f fVar) {
        return (A) this.f6414d.get(fVar);
    }
}
