package v7;

import ha.C1265a;
import m4.C1549C;
import m4.SurfaceHolderCallbackC1596z;
import n4.C1703a;
import n5.D;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25148c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25149d;

    public /* synthetic */ o(ha.g gVar, Object obj, long j) {
        this.f25146a = 2;
        this.f25147b = gVar;
        this.f25149d = obj;
        this.f25148c = j;
    }

    public /* synthetic */ o(p pVar, long j, String str, int i7) {
        this.f25146a = i7;
        this.f25147b = pVar;
        this.f25148c = j;
        this.f25149d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.f25148c;
        Object obj = this.f25149d;
        Object obj2 = this.f25147b;
        switch (this.f25146a) {
            case 0:
                p pVar = (p) obj2;
                pVar.f25161o.f25820b.a(new o(pVar, this.f25148c, (String) obj, 1));
                return;
            case 1:
                l lVar = ((p) obj2).g;
                r rVar = lVar.f25138n;
                if (rVar == null || !rVar.f25172e.get()) {
                    ((x7.d) lVar.f25135i.f26254b).f((String) obj, j);
                    return;
                }
                return;
            default:
                ha.g gVar = (ha.g) obj2;
                gVar.getClass();
                int i7 = D.f21141a;
                C1549C c1549c = ((SurfaceHolderCallbackC1596z) gVar.f17916c).f20525a;
                n4.f fVar = c1549c.f19821E;
                C1703a P10 = fVar.P();
                fVar.Q(P10, 26, new n4.d(P10, obj, j));
                if (c1549c.f19850e0 == obj) {
                    c1549c.f19877z.e(26, new C1265a(14));
                    return;
                }
                return;
        }
    }
}
