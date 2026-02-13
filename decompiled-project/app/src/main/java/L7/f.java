package L7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f implements B, y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f6341a;

    public /* synthetic */ f(j jVar) {
        this.f6341a = jVar;
    }

    @Override // L7.B
    public void a(String str) {
        j jVar = this.f6341a;
        ((Q7.h) jVar.j).p("Auth token changed, triggering auth token refresh", null, new Object[0]);
        J7.r rVar = (J7.r) jVar.f6358d;
        rVar.f5637y.p("Auth token refreshed.", null, new Object[0]);
        rVar.f5629q = str;
        if (rVar.a()) {
            if (str != null) {
                rVar.j(false);
                return;
            }
            tc.b.z(rVar.a(), "Must be connected to send unauth.", new Object[0]);
            tc.b.z(rVar.f5629q == null, "Auth token must not be set.", new Object[0]);
            rVar.n("unauth", false, Collections.emptyMap(), null);
        }
    }

    @Override // L7.y
    public void f(Q7.f fVar) {
        J7.r rVar = (J7.r) this.f6341a.f6358d;
        ArrayList b2 = fVar.f8685a.b();
        HashMap a9 = fVar.f8686b.a();
        rVar.getClass();
        J7.q qVar = new J7.q(b2, a9);
        Q7.h hVar = rVar.f5637y;
        if (hVar.H()) {
            hVar.p("unlistening on " + qVar, null, new Object[0]);
        }
        J7.o f4 = rVar.f(qVar);
        if (f4 != null && rVar.a()) {
            HashMap hashMap = new HashMap();
            J7.q qVar2 = f4.f5600b;
            hashMap.put("p", tc.b.E(qVar2.f5607a));
            Long l10 = f4.f5602d;
            if (l10 != null) {
                hashMap.put("q", qVar2.f5608b);
                hashMap.put("t", l10);
            }
            rVar.n("n", false, hashMap, null);
        }
        rVar.b();
    }

    @Override // L7.y
    public void s(Q7.f fVar, A a9, E e2, E e10) {
        J7.r rVar = (J7.r) this.f6341a.f6358d;
        ArrayList b2 = fVar.f8685a.b();
        HashMap a10 = fVar.f8686b.a();
        Long valueOf = a9 != null ? Long.valueOf(a9.f6311a) : null;
        q3.s sVar = new q3.s(13, this, e10);
        rVar.getClass();
        J7.q qVar = new J7.q(b2, a10);
        Q7.h hVar = rVar.f5637y;
        if (hVar.H()) {
            hVar.p("Listening on " + qVar, null, new Object[0]);
        }
        HashMap hashMap = rVar.f5628p;
        tc.b.z(!hashMap.containsKey(qVar), "listen() called twice for same QuerySpec.", new Object[0]);
        if (hVar.H()) {
            hVar.p("Adding listen query: " + qVar, null, new Object[0]);
        }
        J7.o oVar = new J7.o(sVar, qVar, valueOf, e2);
        hashMap.put(qVar, oVar);
        if (rVar.a()) {
            rVar.l(oVar);
        }
        rVar.b();
    }
}
