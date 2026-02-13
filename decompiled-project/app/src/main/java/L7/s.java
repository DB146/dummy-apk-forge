package L7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class s implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q7.f f6387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f6388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G7.b f6389c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f6390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f6391e;

    public s(z zVar, Q7.f fVar, x xVar, G7.b bVar, boolean z8) {
        this.f6391e = zVar;
        this.f6387a = fVar;
        this.f6388b = xVar;
        this.f6389c = bVar;
        this.f6390d = z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [L7.E, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z8;
        Object obj;
        Q7.f fVar = this.f6387a;
        C0385e c0385e = fVar.f8685a;
        z zVar = this.f6391e;
        n nVar = (n) zVar.f6411a.o(c0385e);
        ArrayList arrayList = new ArrayList();
        if (nVar != null && (fVar.b() || nVar.g(fVar) != null)) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            boolean f4 = nVar.f();
            boolean b2 = fVar.b();
            HashMap hashMap = nVar.f6372a;
            G7.b bVar = this.f6389c;
            x xVar = this.f6388b;
            if (b2) {
                Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Q7.g gVar = (Q7.g) ((Map.Entry) it.next()).getValue();
                    arrayList3.addAll(gVar.b(xVar, bVar));
                    if (gVar.f8690d.isEmpty()) {
                        it.remove();
                        Q7.f fVar2 = gVar.f8687a;
                        if (!fVar2.f8686b.d()) {
                            arrayList2.add(fVar2);
                        }
                    }
                }
            } else {
                Q7.e eVar = fVar.f8686b;
                Q7.g gVar2 = (Q7.g) hashMap.get(eVar);
                if (gVar2 != null) {
                    arrayList3.addAll(gVar2.b(xVar, bVar));
                    if (gVar2.f8690d.isEmpty()) {
                        hashMap.remove(eVar);
                        Q7.f fVar3 = gVar2.f8687a;
                        if (!fVar3.f8686b.d()) {
                            arrayList2.add(fVar3);
                        }
                    }
                }
            }
            if (f4 && !nVar.f()) {
                arrayList2.add(Q7.f.a(fVar.f8685a));
            }
            if (hashMap.isEmpty()) {
                zVar.f6411a = zVar.f6411a.y(c0385e);
            }
            Iterator it2 = arrayList2.iterator();
            loop1: while (true) {
                z8 = false;
                while (it2.hasNext()) {
                    Q7.f fVar4 = (Q7.f) it2.next();
                    zVar.g.e();
                    if (z8 || fVar4.f8686b.d()) {
                        z8 = true;
                    }
                }
            }
            if (this.f6390d) {
                return null;
            }
            O7.g gVar3 = zVar.f6411a;
            Object obj2 = gVar3.f7495a;
            boolean z10 = obj2 != null && ((n) obj2).f();
            I7.l lVar = new I7.l(c0385e);
            while (lVar.hasNext()) {
                gVar3 = gVar3.t((T7.c) lVar.next());
                z10 = z10 || ((obj = gVar3.f7495a) != null && ((n) obj).f());
                if (z10 || gVar3.isEmpty()) {
                    break;
                }
            }
            y yVar = zVar.f6416f;
            if (z8 && !z10) {
                O7.g D10 = zVar.f6411a.D(c0385e);
                if (!D10.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    z.f(D10, arrayList4);
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        Q7.g gVar4 = (Q7.g) it3.next();
                        ?? obj3 = new Object();
                        obj3.f6319c = zVar;
                        obj3.f6317a = gVar4;
                        obj3.f6318b = zVar.i(gVar4.f8687a);
                        yVar.s(z.g(gVar4.f8687a), (A) obj3.f6318b, obj3, obj3);
                    }
                }
            }
            if (!z10 && !arrayList2.isEmpty() && bVar == null) {
                if (z8) {
                    yVar.f(z.g(fVar));
                } else {
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        Q7.f fVar5 = (Q7.f) it4.next();
                        O7.k.c(zVar.i(fVar5) != null);
                        yVar.f(z.g(fVar5));
                    }
                }
            }
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                Q7.f fVar6 = (Q7.f) it5.next();
                if (!fVar6.f8686b.d()) {
                    A i7 = zVar.i(fVar6);
                    O7.k.c(i7 != null);
                    zVar.f6414d.remove(fVar6);
                    zVar.f6413c.remove(i7);
                }
            }
            arrayList = arrayList3;
        }
        return arrayList;
    }
}
