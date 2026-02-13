package L7;

import A0.G0;
import F.C0257a;
import N6.H;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import m4.C1558a0;
import m4.C1562c0;
import m4.O;
import m4.P;
import m4.Q;
import m4.T;
import m4.U;
import m4.V;
import m4.W;
import n5.AbstractC1705a;
import y6.C2395a;
import y6.C2398d;
import y6.C2399e;
import y6.C2403i;
import y6.C2404j;
import y6.InterfaceC2397c;
import y7.u0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6355a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6356b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6357c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6358d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6359e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6360f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6361h;

    /* renamed from: i, reason: collision with root package name */
    public Object f6362i;
    public Object j;
    public Object k;

    /* renamed from: l, reason: collision with root package name */
    public Object f6363l;

    /* renamed from: m, reason: collision with root package name */
    public Object f6364m;

    public j(int i7) {
        this.f6355a = i7;
        switch (i7) {
            case 2:
                this.f6356b = new Object();
                this.f6357c = new Object();
                this.f6358d = new Object();
                this.f6359e = new Object();
                this.f6360f = new C2395a(0.0f);
                this.g = new C2395a(0.0f);
                this.f6361h = new C2395a(0.0f);
                this.f6362i = new C2395a(0.0f);
                this.j = new C2399e(0);
                this.k = new C2399e(0);
                this.f6363l = new C2399e(0);
                this.f6364m = new C2399e(0);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [F.a, java.lang.Object] */
    public j(C0384d c0384d, k kVar) {
        this.f6355a = 0;
        new Hc.e(11);
        ?? obj = new Object();
        obj.f3957a = 0L;
        this.f6357c = obj;
        this.f6356b = kVar;
        this.f6362i = c0384d;
        this.j = c0384d.b("RepoOperation");
        this.k = c0384d.b("DataOperation");
        this.f6361h = new q3.e(c0384d);
        ((O7.b) c0384d.f6333e.f27b).execute(new B0.C(this, 10));
    }

    public /* synthetic */ j(boolean z8) {
        this.f6355a = 2;
    }

    public static void a(ArrayList arrayList, G0 g02) {
        ((O7.j) g02.f29d).getClass();
        for (Object obj : ((O7.j) g02.f29d).f7500a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            a(arrayList, new G0((T7.c) entry.getKey(), g02, (O7.j) entry.getValue(), 27));
        }
    }

    public static void d(u0 u0Var) {
        if (u0Var instanceof C2403i) {
            ((C2403i) u0Var).getClass();
        } else if (u0Var instanceof C2398d) {
            ((C2398d) u0Var).getClass();
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [m4.Q, m4.S] */
    public C1558a0 b() {
        V v10;
        S2.b bVar = (S2.b) this.f6360f;
        AbstractC1705a.m(((Uri) bVar.f8987e) == null || ((UUID) bVar.f8986d) != null);
        Uri uri = (Uri) this.f6357c;
        if (uri != null) {
            S2.b bVar2 = (S2.b) this.f6360f;
            v10 = new V(uri, (String) this.f6358d, ((UUID) bVar2.f8986d) != null ? new T(bVar2) : null, (O) this.j, (List) this.g, (String) this.f6361h, (H) this.f6362i);
        } else {
            v10 = null;
        }
        String str = (String) this.f6356b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        P p10 = (P) this.f6359e;
        p10.getClass();
        ?? q10 = new Q(p10);
        U a9 = ((T4.t) this.f6363l).a();
        C1562c0 c1562c0 = (C1562c0) this.k;
        if (c1562c0 == null) {
            c1562c0 = C1562c0.f20268W;
        }
        return new C1558a0(str2, q10, v10, a9, c1562c0, (W) this.f6364m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, y6.j] */
    public C2404j c() {
        ?? obj = new Object();
        obj.f27048a = (u0) this.f6356b;
        obj.f27049b = (u0) this.f6357c;
        obj.f27050c = (u0) this.f6358d;
        obj.f27051d = (u0) this.f6359e;
        obj.f27052e = (InterfaceC2397c) this.f6360f;
        obj.f27053f = (InterfaceC2397c) this.g;
        obj.g = (InterfaceC2397c) this.f6361h;
        obj.f27054h = (InterfaceC2397c) this.f6362i;
        obj.f27055i = (C2399e) this.j;
        obj.j = (C2399e) this.k;
        obj.k = (C2399e) this.f6363l;
        obj.f27056l = (C2399e) this.f6364m;
        return obj;
    }

    public void e(Q7.f fVar, boolean z8) {
        C0385e c0385e = fVar.f8685a;
        O7.k.c(c0385e.isEmpty() || !c0385e.C().equals(AbstractC0382b.f6322a));
        z zVar = (z) this.f6364m;
        HashSet hashSet = zVar.f6415e;
        if (z8 && !hashSet.contains(fVar)) {
            hashSet.add(fVar);
        } else {
            if (z8 || !hashSet.contains(fVar)) {
                return;
            }
            x xVar = new x(fVar);
            zVar.h(xVar.f6410b, xVar, null, true);
            hashSet.remove(fVar);
        }
    }

    public void f(List list) {
        if (list.isEmpty()) {
            return;
        }
        q3.e eVar = (q3.e) this.f6361h;
        Q7.h hVar = (Q7.h) eVar.f23377c;
        if (hVar.H()) {
            hVar.p("Raising " + list.size() + " event(s)", null, new Object[0]);
        }
        ((H7.e) eVar.f23376b).f4906a.post(new E5.k(9, eVar, new ArrayList(list), false));
    }

    public void g(G0 g02) {
        ((O7.j) g02.f29d).getClass();
        for (Object obj : ((O7.j) g02.f29d).f7500a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            g(new G0((T7.c) entry.getKey(), g02, (O7.j) entry.getValue(), 27));
        }
    }

    public C0385e h(C0385e c0385e) {
        G0 g02 = (G0) this.g;
        while (!c0385e.isEmpty()) {
            ((O7.j) g02.f29d).getClass();
            C0385e c0385e2 = new C0385e(c0385e.C());
            g02.getClass();
            T7.c C2 = c0385e2.C();
            while (C2 != null) {
                O7.j jVar = (O7.j) g02.f29d;
                G0 g03 = new G0(C2, g02, jVar.f7500a.containsKey(C2) ? (O7.j) jVar.f7500a.get(C2) : new O7.j(), 27);
                c0385e2 = c0385e2.F();
                C2 = c0385e2.C();
                g02 = g03;
            }
            c0385e = c0385e.F();
        }
        C0385e J10 = g02.J();
        ArrayList arrayList = new ArrayList();
        a(arrayList, g02);
        Collections.sort(arrayList);
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            new ArrayList();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw h3.o.j(it);
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw h3.o.j(it2);
            }
            g((G0) this.g);
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                ((C0384d) this.f6362i).f6330b.f4906a.post((Runnable) arrayList2.get(i7));
            }
            G0 g04 = (G0) this.g;
            g(g04);
            i(g04);
        }
        return J10;
    }

    public void i(G0 g02) {
        O7.j jVar = (O7.j) g02.f29d;
        jVar.getClass();
        if (jVar.f7500a.isEmpty()) {
            return;
        }
        for (Object obj : ((O7.j) g02.f29d).f7500a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            i(new G0((T7.c) entry.getKey(), g02, (O7.j) entry.getValue(), 27));
        }
    }

    public void j(T7.c cVar, Object obj) {
        if (cVar.equals(AbstractC0382b.f6323b)) {
            ((C0257a) this.f6357c).f3957a = ((Long) obj).longValue();
        }
        C0385e c0385e = new C0385e(AbstractC0382b.f6322a, cVar);
        try {
            T7.s a9 = android.support.v4.media.session.b.a(obj, T7.k.f9348e);
            D5.i iVar = (D5.i) this.f6359e;
            iVar.f3256b = ((T7.s) iVar.f3256b).l(c0385e, a9);
            f(((z) this.f6363l).e(c0385e, a9));
        } catch (G7.c e2) {
            ((Q7.h) this.j).u("Failed to parse info update", e2);
        }
    }

    public String toString() {
        switch (this.f6355a) {
            case 0:
                return ((k) this.f6356b).toString();
            default:
                return super.toString();
        }
    }
}
