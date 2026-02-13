package N0;

import A0.C0005a;
import B0.C0170c0;
import cc.C0943l0;
import cc.F;
import g3.C1191j;
import h3.H;
import u.C2066t;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final h8.e f7130a;

    /* renamed from: b, reason: collision with root package name */
    public final a f7131b;

    /* renamed from: c, reason: collision with root package name */
    public final q3.l f7132c;

    /* renamed from: d, reason: collision with root package name */
    public final h f7133d;

    /* renamed from: e, reason: collision with root package name */
    public final C1191j f7134e;

    /* JADX WARN: Type inference failed for: r1v0, types: [N0.h, java.lang.Object] */
    public e(h8.e eVar, a aVar) {
        q3.l lVar = f.f7135a;
        q3.l lVar2 = f.f7135a;
        Hb.j jVar = Hb.j.f4919a;
        ?? obj = new Object();
        dc.d dVar = R0.f.f8803a;
        g gVar = h.f7136a;
        gVar.getClass();
        F.b(E6.b.w(gVar, dVar).plus(jVar).plus(new C0943l0(null)));
        C1191j c1191j = new C1191j(28);
        this.f7130a = eVar;
        this.f7131b = aVar;
        this.f7132c = lVar;
        this.f7133d = obj;
        this.f7134e = c1191j;
        new C0005a(this, 15);
    }

    public final s a(r rVar) {
        s sVar;
        q3.l lVar = this.f7132c;
        C0170c0 c0170c0 = new C0170c0(12, this, rVar);
        synchronized (((Hc.e) lVar.f23391b)) {
            sVar = (s) ((C2066t) lVar.f23392c).get(rVar);
            if (sVar != null) {
                if (!sVar.f7154b) {
                }
            }
            try {
                sVar = (s) c0170c0.invoke(new C0170c0(13, lVar, rVar));
                synchronized (((Hc.e) lVar.f23391b)) {
                    if (((C2066t) lVar.f23392c).get(rVar) == null && sVar.f7154b) {
                        ((C2066t) lVar.f23392c).put(rVar, sVar);
                    }
                }
            } catch (Exception e2) {
                throw new IllegalStateException("Could not load font", e2);
            }
        }
        return sVar;
    }

    public final s b(q qVar, k kVar, int i7, int i10) {
        a aVar = this.f7131b;
        aVar.getClass();
        int i11 = aVar.f7129a;
        k kVar2 = (i11 == 0 || i11 == Integer.MAX_VALUE) ? kVar : new k(H.k(kVar.f7143a + i11, 1, 1000));
        this.f7130a.getClass();
        return a(new r(qVar, kVar2, i7, i10, null));
    }
}
