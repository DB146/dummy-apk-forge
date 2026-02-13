package J8;

import java.util.Map;

/* renamed from: J8.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359n extends G8.z {

    /* renamed from: a, reason: collision with root package name */
    public final C0369y f5705a;

    /* renamed from: b, reason: collision with root package name */
    public final C0369y f5706b;

    /* renamed from: c, reason: collision with root package name */
    public final I8.o f5707c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0349d f5708d;

    public C0359n(C0349d c0349d, C0369y c0369y, C0369y c0369y2, I8.o oVar) {
        this.f5708d = c0349d;
        this.f5705a = c0369y;
        this.f5706b = c0369y2;
        this.f5707c = oVar;
    }

    @Override // G8.z
    public final Object b(O8.a aVar) {
        int j02 = aVar.j0();
        if (j02 == 9) {
            aVar.f0();
            return null;
        }
        Map map = (Map) this.f5707c.h();
        if (j02 == 1) {
            aVar.l();
            while (aVar.W()) {
                aVar.l();
                Object b2 = this.f5705a.f5738b.b(aVar);
                if (map.put(b2, this.f5706b.f5738b.b(aVar)) != null) {
                    throw new Db.d(X.c.g(b2, "duplicate key: "), 4);
                }
                aVar.P();
            }
            aVar.P();
        } else {
            aVar.n();
            while (aVar.W()) {
                U9.j.f9883b.getClass();
                int i7 = aVar.f7512u;
                if (i7 == 0) {
                    i7 = aVar.K();
                }
                if (i7 == 13) {
                    aVar.f7512u = 9;
                } else if (i7 == 12) {
                    aVar.f7512u = 8;
                } else {
                    if (i7 != 14) {
                        throw aVar.r0("a name");
                    }
                    aVar.f7512u = 10;
                }
                Object b10 = this.f5705a.f5738b.b(aVar);
                if (map.put(b10, this.f5706b.f5738b.b(aVar)) != null) {
                    throw new Db.d(X.c.g(b10, "duplicate key: "), 4);
                }
            }
            aVar.T();
        }
        return map;
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            bVar.W();
            return;
        }
        this.f5708d.getClass();
        C0369y c0369y = this.f5706b;
        bVar.F();
        for (Map.Entry entry : map.entrySet()) {
            bVar.U(String.valueOf(entry.getKey()));
            c0369y.c(bVar, entry.getValue());
        }
        bVar.T();
    }
}
