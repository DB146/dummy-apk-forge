package J7;

import B0.C;
import F.C0257a;
import L7.C0385e;
import h3.H;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.Y0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: G, reason: collision with root package name */
    public static long f5609G;

    /* renamed from: A, reason: collision with root package name */
    public String f5610A;

    /* renamed from: F, reason: collision with root package name */
    public long f5615F;

    /* renamed from: a, reason: collision with root package name */
    public final L7.j f5616a;

    /* renamed from: b, reason: collision with root package name */
    public final P3.p f5617b;

    /* renamed from: c, reason: collision with root package name */
    public String f5618c;

    /* renamed from: f, reason: collision with root package name */
    public long f5621f;
    public B4.j g;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f5624l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f5625m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f5626n;

    /* renamed from: o, reason: collision with root package name */
    public final ConcurrentHashMap f5627o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f5628p;

    /* renamed from: q, reason: collision with root package name */
    public String f5629q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5630r;

    /* renamed from: s, reason: collision with root package name */
    public String f5631s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5632t;

    /* renamed from: u, reason: collision with root package name */
    public final Y0 f5633u;

    /* renamed from: v, reason: collision with root package name */
    public final F8.a f5634v;

    /* renamed from: w, reason: collision with root package name */
    public final F8.a f5635w;

    /* renamed from: x, reason: collision with root package name */
    public final O7.b f5636x;

    /* renamed from: y, reason: collision with root package name */
    public final Q7.h f5637y;

    /* renamed from: z, reason: collision with root package name */
    public final K7.a f5638z;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f5619d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public boolean f5620e = true;

    /* renamed from: h, reason: collision with root package name */
    public m f5622h = m.f5590a;

    /* renamed from: i, reason: collision with root package name */
    public long f5623i = 0;
    public long j = 0;
    public long k = 0;

    /* renamed from: B, reason: collision with root package name */
    public long f5611B = 0;

    /* renamed from: C, reason: collision with root package name */
    public int f5612C = 0;

    /* renamed from: D, reason: collision with root package name */
    public int f5613D = 0;

    /* renamed from: E, reason: collision with root package name */
    public ScheduledFuture f5614E = null;

    public r(Y0 y02, P3.p pVar, L7.j jVar) {
        this.f5616a = jVar;
        this.f5633u = y02;
        O7.b bVar = (O7.b) y02.f21463a;
        this.f5636x = bVar;
        this.f5634v = (F8.a) y02.f21464b;
        this.f5635w = (F8.a) y02.f21465c;
        this.f5617b = pVar;
        this.f5628p = new HashMap();
        this.f5624l = new HashMap();
        this.f5626n = new HashMap();
        this.f5627o = new ConcurrentHashMap();
        this.f5625m = new ArrayList();
        A7.a aVar = (A7.a) y02.f21466d;
        this.f5638z = new K7.a(bVar, new Q7.h(aVar, "ConnectionRetryHelper", null, 4));
        long j = f5609G;
        f5609G = 1 + j;
        this.f5637y = new Q7.h(aVar, "PersistentConnection", A3.c.h("pc_", j), 4);
        this.f5610A = null;
        b();
    }

    public final boolean a() {
        m mVar = this.f5622h;
        return mVar == m.f5593d || mVar == m.f5594e;
    }

    public final void b() {
        if (!d()) {
            if (this.f5619d.contains("connection_idle")) {
                tc.b.z(!d(), "", new Object[0]);
                h("connection_idle");
                return;
            }
            return;
        }
        ScheduledFuture scheduledFuture = this.f5614E;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f5614E = this.f5636x.schedule(new C(this, 9), 60000L, TimeUnit.MILLISECONDS);
    }

    public final void c(String str) {
        Q7.h hVar = this.f5637y;
        if (hVar.H()) {
            hVar.p("Connection interrupted for: ".concat(str), null, new Object[0]);
        }
        this.f5619d.add(str);
        B4.j jVar = this.g;
        K7.a aVar = this.f5638z;
        if (jVar != null) {
            jVar.f(2);
            this.g = null;
        } else {
            ScheduledFuture scheduledFuture = aVar.f6202h;
            Q7.h hVar2 = aVar.f6197b;
            if (scheduledFuture != null) {
                hVar2.p("Cancelling existing retry attempt", null, new Object[0]);
                aVar.f6202h.cancel(false);
                aVar.f6202h = null;
            } else {
                hVar2.p("No existing retry attempt to cancel", null, new Object[0]);
            }
            aVar.f6203i = 0L;
            this.f5622h = m.f5590a;
        }
        aVar.j = true;
        aVar.f6203i = 0L;
    }

    public final boolean d() {
        return this.f5628p.isEmpty() && this.f5627o.isEmpty() && this.f5624l.isEmpty() && this.f5626n.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, J7.p] */
    public final void e(String str, ArrayList arrayList, Object obj, String str2, t tVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", tc.b.E(arrayList));
        hashMap.put("d", obj);
        if (str2 != null) {
            hashMap.put("h", str2);
        }
        long j = this.f5623i;
        this.f5623i = 1 + j;
        HashMap hashMap2 = this.f5626n;
        Long valueOf = Long.valueOf(j);
        ?? obj2 = new Object();
        obj2.f5603a = str;
        obj2.f5604b = hashMap;
        obj2.f5605c = tVar;
        hashMap2.put(valueOf, obj2);
        if (this.f5622h == m.f5594e) {
            m(j);
        }
        this.f5615F = System.currentTimeMillis();
        b();
    }

    public final o f(q qVar) {
        Q7.h hVar = this.f5637y;
        if (hVar.H()) {
            hVar.p("removing query " + qVar, null, new Object[0]);
        }
        HashMap hashMap = this.f5628p;
        if (hashMap.containsKey(qVar)) {
            o oVar = (o) hashMap.get(qVar);
            hashMap.remove(qVar);
            b();
            return oVar;
        }
        if (hVar.H()) {
            hVar.p("Trying to remove listener for QuerySpec " + qVar + " but no listener exists.", null, new Object[0]);
        }
        return null;
    }

    public final void g() {
        m mVar = this.f5622h;
        tc.b.z(mVar == m.f5594e, "Should be connected if we're restoring state, but we are: %s", mVar);
        Q7.h hVar = this.f5637y;
        if (hVar.H()) {
            hVar.p("Restoring outstanding listens", null, new Object[0]);
        }
        for (o oVar : this.f5628p.values()) {
            if (hVar.H()) {
                hVar.p("Restoring listen " + oVar.f5600b, null, new Object[0]);
            }
            l(oVar);
        }
        if (hVar.H()) {
            hVar.p("Restoring writes.", null, new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.f5626n.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m(((Long) it.next()).longValue());
        }
        ArrayList arrayList2 = this.f5625m;
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            throw h3.o.j(it2);
        }
        arrayList2.clear();
        if (hVar.H()) {
            hVar.p("Restoring reads.", null, new Object[0]);
        }
        ArrayList arrayList3 = new ArrayList(this.f5627o.keySet());
        Collections.sort(arrayList3);
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            k((Long) it3.next());
        }
    }

    public final void h(String str) {
        Q7.h hVar = this.f5637y;
        if (hVar.H()) {
            hVar.p("Connection no longer interrupted for: ".concat(str), null, new Object[0]);
        }
        this.f5619d.remove(str);
        if (this.f5619d.size() == 0 && this.f5622h == m.f5590a) {
            o();
        }
    }

    public final void i(final boolean z8) {
        if (this.f5631s == null) {
            g();
            return;
        }
        tc.b.z(a(), "Must be connected to send auth, but was: %s", this.f5622h);
        Q7.h hVar = this.f5637y;
        if (hVar.H()) {
            hVar.p("Sending app check.", null, new Object[0]);
        }
        l lVar = new l() { // from class: J7.f
            @Override // J7.l
            public final void a(Map map) {
                r rVar = r.this;
                rVar.getClass();
                String str = (String) map.get("s");
                if (str.equals("ok")) {
                    rVar.f5613D = 0;
                } else {
                    rVar.f5631s = null;
                    rVar.f5632t = true;
                    rVar.f5637y.p(h3.o.n("App check failed: ", str, " (", (String) map.get("d"), ")"), null, new Object[0]);
                }
                if (z8) {
                    rVar.g();
                }
            }
        };
        HashMap hashMap = new HashMap();
        tc.b.z(this.f5631s != null, "App check token must be set!", new Object[0]);
        hashMap.put("token", this.f5631s);
        n("appcheck", true, hashMap, lVar);
    }

    public final void j(boolean z8) {
        tc.b.z(a(), "Must be connected to send auth, but was: %s", this.f5622h);
        Q7.h hVar = this.f5637y;
        q3.c cVar = null;
        if (hVar.H()) {
            hVar.p("Sending auth.", null, new Object[0]);
        }
        l gVar = new g(this, z8);
        HashMap hashMap = new HashMap();
        String str = this.f5629q;
        if (str.startsWith("gauth|")) {
            try {
                HashMap B10 = H.B(str.substring(6));
                cVar = new q3.c(22, (String) B10.get("token"), (Map) B10.get("auth"), false);
            } catch (IOException e2) {
                throw new RuntimeException("Failed to parse gauth token", e2);
            }
        }
        if (cVar == null) {
            hashMap.put("cred", this.f5629q);
            n("auth", true, hashMap, gVar);
            return;
        }
        hashMap.put("cred", (String) cVar.f23371b);
        Map map = (Map) cVar.f23372c;
        if (map != null) {
            hashMap.put("authvar", map);
        }
        n("gauth", true, hashMap, gVar);
    }

    public final void k(Long l10) {
        tc.b.z(this.f5622h == m.f5594e, "sendGet called when we can't send gets", new Object[0]);
        n nVar = (n) this.f5627o.get(l10);
        if (nVar.f5598c) {
            Q7.h hVar = this.f5637y;
            if (hVar.H()) {
                hVar.p("get" + l10 + " cancelled, ignoring.", null, new Object[0]);
                return;
            }
        } else {
            nVar.f5598c = true;
        }
        n("g", false, nVar.f5596a, new i(this, l10, nVar));
    }

    /* JADX WARN: Type inference failed for: r3v15, types: [F.a, java.lang.Object] */
    public final void l(o oVar) {
        q3.l lVar;
        HashMap hashMap = new HashMap();
        hashMap.put("p", tc.b.E(oVar.f5600b.f5607a));
        Long l10 = oVar.f5602d;
        if (l10 != null) {
            hashMap.put("q", oVar.f5600b.f5608b);
            hashMap.put("t", l10);
        }
        Q7.g gVar = (Q7.g) oVar.f5601c.f6317a;
        hashMap.put("h", ((T7.m) ((Q7.a) gVar.f8689c.f23392c).f8671c).f9350a.c());
        if (H.s(((T7.m) ((Q7.a) gVar.f8689c.f23392c).f8671c).f9350a) > 1024) {
            T7.s sVar = ((T7.m) ((Q7.a) gVar.f8689c.f23392c).f8671c).f9350a;
            ?? obj = new Object();
            obj.f3957a = Math.max(512L, (long) Math.sqrt(H.s(sVar) * 100));
            if (sVar.isEmpty()) {
                lVar = new q3.l(Collections.emptyList(), Collections.singletonList(""));
            } else {
                T7.h hVar = new T7.h((C0257a) obj);
                q3.l.G(sVar, hVar);
                O7.k.b("Can't finish hashing in the middle processing a child", hVar.f9341c == 0);
                if (((StringBuilder) hVar.f9342d) != null) {
                    hVar.d();
                }
                ArrayList arrayList = (ArrayList) hVar.g;
                arrayList.add("");
                lVar = new q3.l((ArrayList) hVar.f9344f, arrayList);
            }
            List unmodifiableList = Collections.unmodifiableList((List) lVar.f23391b);
            ArrayList arrayList2 = new ArrayList(unmodifiableList.size());
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C0385e) it.next()).b());
            }
            List unmodifiableList2 = Collections.unmodifiableList((List) lVar.f23392c);
            if (arrayList2.size() != unmodifiableList2.size() - 1) {
                throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = Collections.unmodifiableList(arrayList2).iterator();
            while (it2.hasNext()) {
                arrayList3.add(tc.b.E((List) it2.next()));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("hs", Collections.unmodifiableList(unmodifiableList2));
            hashMap2.put("ps", arrayList3);
            hashMap.put("ch", hashMap2);
        }
        n("q", false, hashMap, new j(this, oVar));
    }

    public final void m(long j) {
        tc.b.z(this.f5622h == m.f5594e, "sendPut called when we can't send writes (we're disconnected or writes are paused).", new Object[0]);
        p pVar = (p) this.f5626n.get(Long.valueOf(j));
        t tVar = pVar.f5605c;
        pVar.f5606d = true;
        String str = pVar.f5603a;
        n(str, false, pVar.f5604b, new h(this, str, j, pVar, tVar));
    }

    public final void n(String str, boolean z8, Map map, l lVar) {
        String[] strArr;
        long j = this.k;
        this.k = 1 + j;
        HashMap hashMap = new HashMap();
        hashMap.put("r", Long.valueOf(j));
        hashMap.put("a", str);
        hashMap.put("b", map);
        B4.j jVar = this.g;
        jVar.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("t", "d");
        hashMap2.put("d", hashMap);
        int i7 = jVar.f2089b;
        Q7.h hVar = (Q7.h) jVar.f2093f;
        if (i7 != 2) {
            hVar.p("Tried to send on an unconnected connection", null, new Object[0]);
        } else {
            if (z8) {
                hVar.p("Sending data (contents hidden)", null, new Object[0]);
            } else {
                hVar.p("Sending data: %s", null, hashMap2);
            }
            w wVar = (w) jVar.f2091d;
            wVar.e();
            try {
                String D10 = H.D(hashMap2);
                if (D10.length() <= 16384) {
                    strArr = new String[]{D10};
                } else {
                    ArrayList arrayList = new ArrayList();
                    int i10 = 0;
                    while (i10 < D10.length()) {
                        int i11 = i10 + 16384;
                        arrayList.add(D10.substring(i10, Math.min(i11, D10.length())));
                        i10 = i11;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (strArr.length > 1) {
                    wVar.f5646a.A("" + strArr.length);
                }
                for (String str2 : strArr) {
                    wVar.f5646a.A(str2);
                }
            } catch (IOException e2) {
                wVar.j.u("Failed to serialize message: " + hashMap2.toString(), e2);
                wVar.f();
            }
        }
        this.f5624l.put(Long.valueOf(j), lVar);
    }

    public final void o() {
        if (this.f5619d.size() == 0) {
            m mVar = this.f5622h;
            tc.b.z(mVar == m.f5590a, "Not in disconnected state: %s", mVar);
            boolean z8 = this.f5630r;
            boolean z10 = this.f5632t;
            this.f5637y.p("Scheduling connection attempt", null, new Object[0]);
            this.f5630r = false;
            this.f5632t = false;
            b bVar = new b(this, z8, z10);
            K7.a aVar = this.f5638z;
            aVar.getClass();
            E5.k kVar = new E5.k(7, aVar, bVar, false);
            ScheduledFuture scheduledFuture = aVar.f6202h;
            Q7.h hVar = aVar.f6197b;
            if (scheduledFuture != null) {
                hVar.p("Cancelling previous scheduled retry", null, new Object[0]);
                aVar.f6202h.cancel(false);
                aVar.f6202h = null;
            }
            long j = 0;
            if (!aVar.j) {
                long j10 = aVar.f6203i;
                if (j10 == 0) {
                    aVar.f6203i = aVar.f6198c;
                } else {
                    aVar.f6203i = Math.min((long) (j10 * aVar.f6201f), aVar.f6199d);
                }
                double d10 = aVar.f6200e;
                double d11 = aVar.f6203i;
                j = (long) ((aVar.g.nextDouble() * d10 * d11) + ((1.0d - d10) * d11));
            }
            aVar.j = false;
            hVar.p("Scheduling retry in %dms", null, Long.valueOf(j));
            aVar.f6202h = aVar.f6196a.schedule(kVar, j, TimeUnit.MILLISECONDS);
        }
    }
}
