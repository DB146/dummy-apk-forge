package U4;

import P4.c0;
import java.util.Map;
import m4.K;
import m4.L;
import m5.C1620q;
import r4.C1936h;
import r4.C1941m;

/* loaded from: classes.dex */
public final class q extends c0 {

    /* renamed from: H, reason: collision with root package name */
    public final Map f9621H;

    /* renamed from: I, reason: collision with root package name */
    public C1936h f9622I;

    public q(C1620q c1620q, r4.q qVar, C1941m c1941m, Map map) {
        super(c1620q, qVar, c1941m);
        this.f9621H = map;
    }

    @Override // P4.c0
    public final L l(L l10) {
        C1936h c1936h;
        C1936h c1936h2 = this.f9622I;
        if (c1936h2 == null) {
            c1936h2 = l10.f20066C;
        }
        if (c1936h2 != null && (c1936h = (C1936h) this.f9621H.get(c1936h2.f23763c)) != null) {
            c1936h2 = c1936h;
        }
        F4.c cVar = l10.f20094x;
        F4.c cVar2 = null;
        if (cVar != null) {
            F4.b[] bVarArr = cVar.f4071a;
            int length = bVarArr.length;
            int i7 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                F4.b bVar = bVarArr[i10];
                if ((bVar instanceof K4.n) && "com.apple.streaming.transportStreamTimestamp".equals(((K4.n) bVar).f6151b)) {
                    break;
                }
                i10++;
            }
            if (i10 != -1) {
                if (length != 1) {
                    F4.b[] bVarArr2 = new F4.b[length - 1];
                    while (i7 < length) {
                        if (i7 != i10) {
                            bVarArr2[i7 < i10 ? i7 : i7 - 1] = bVarArr[i7];
                        }
                        i7++;
                    }
                    cVar2 = new F4.c(bVarArr2);
                }
            }
            if (c1936h2 == l10.f20066C || cVar != l10.f20094x) {
                K a9 = l10.a();
                a9.f19986n = c1936h2;
                a9.f19983i = cVar;
                l10 = new L(a9);
            }
            return super.l(l10);
        }
        cVar = cVar2;
        if (c1936h2 == l10.f20066C) {
        }
        K a92 = l10.a();
        a92.f19986n = c1936h2;
        a92.f19983i = cVar;
        l10 = new L(a92);
        return super.l(l10);
    }
}
