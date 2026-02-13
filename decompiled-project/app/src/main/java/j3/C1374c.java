package j3;

import A9.O0;
import E3.d;
import H7.e;
import P4.C0463k;
import P4.G;
import android.content.Context;
import android.text.TextUtils;
import cc.A;
import cc.InterfaceC0937i0;
import ea.C1111f;
import h3.C1235A;
import h3.C1240b;
import h3.C1243e;
import h3.z;
import ha.g;
import i3.InterfaceC1342a;
import i3.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import m3.h;
import q3.i;
import q3.j;
import q3.p;

/* renamed from: j3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1374c implements f, h, InterfaceC1342a {

    /* renamed from: C, reason: collision with root package name */
    public static final String f18588C = z.g("GreedyScheduler");

    /* renamed from: A, reason: collision with root package name */
    public final i f18589A;

    /* renamed from: B, reason: collision with root package name */
    public final d f18590B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f18591a;

    /* renamed from: c, reason: collision with root package name */
    public final C1372a f18593c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18594d;

    /* renamed from: u, reason: collision with root package name */
    public final i3.d f18597u;

    /* renamed from: v, reason: collision with root package name */
    public final C1111f f18598v;

    /* renamed from: w, reason: collision with root package name */
    public final C1240b f18599w;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f18601y;

    /* renamed from: z, reason: collision with root package name */
    public final O3.c f18602z;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18592b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Object f18595e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final g f18596f = new g(new C0463k(29));

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f18600x = new HashMap();

    /* JADX WARN: Type inference failed for: r5v2, types: [E3.d, java.lang.Object] */
    public C1374c(Context context, C1240b c1240b, O0 o02, i3.d dVar, C1111f c1111f, i iVar) {
        this.f18591a = context;
        C1235A c1235a = c1240b.f17671d;
        e runnableScheduler = c1240b.g;
        this.f18593c = new C1372a(this, runnableScheduler, c1235a);
        l.e(runnableScheduler, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        ?? obj = new Object();
        obj.f3525b = runnableScheduler;
        obj.f3526c = c1111f;
        obj.f3524a = millis;
        obj.f3527d = new Object();
        obj.f3528e = new LinkedHashMap();
        this.f18590B = obj;
        this.f18589A = iVar;
        this.f18602z = new O3.c(o02);
        this.f18599w = c1240b;
        this.f18597u = dVar;
        this.f18598v = c1111f;
    }

    @Override // i3.f
    public final void a(String str) {
        Runnable runnable;
        if (this.f18601y == null) {
            this.f18601y = Boolean.valueOf(r3.h.a(this.f18591a, this.f18599w));
        }
        boolean booleanValue = this.f18601y.booleanValue();
        String str2 = f18588C;
        if (!booleanValue) {
            z.e().f(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f18594d) {
            this.f18597u.a(this);
            this.f18594d = true;
        }
        z.e().a(str2, "Cancelling work ID " + str);
        C1372a c1372a = this.f18593c;
        if (c1372a != null && (runnable = (Runnable) c1372a.f18585d.remove(str)) != null) {
            c1372a.f18583b.f4906a.removeCallbacks(runnable);
        }
        for (i3.i iVar : this.f18596f.q(str)) {
            this.f18590B.a(iVar);
            C1111f c1111f = this.f18598v;
            c1111f.getClass();
            c1111f.K(iVar, -512);
        }
    }

    @Override // i3.InterfaceC1342a
    public final void b(j jVar, boolean z8) {
        InterfaceC0937i0 interfaceC0937i0;
        i3.i p10 = this.f18596f.p(jVar);
        if (p10 != null) {
            this.f18590B.a(p10);
        }
        synchronized (this.f18595e) {
            interfaceC0937i0 = (InterfaceC0937i0) this.f18592b.remove(jVar);
        }
        if (interfaceC0937i0 != null) {
            z.e().a(f18588C, "Stopping tracking for " + jVar);
            interfaceC0937i0.cancel(null);
        }
        if (z8) {
            return;
        }
        synchronized (this.f18595e) {
            this.f18600x.remove(jVar);
        }
    }

    @Override // i3.f
    public final void c(p... pVarArr) {
        long max;
        if (this.f18601y == null) {
            this.f18601y = Boolean.valueOf(r3.h.a(this.f18591a, this.f18599w));
        }
        if (!this.f18601y.booleanValue()) {
            z.e().f(f18588C, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f18594d) {
            this.f18597u.a(this);
            this.f18594d = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            if (!this.f18596f.e(O5.b.p(pVar))) {
                synchronized (this.f18595e) {
                    try {
                        j p10 = O5.b.p(pVar);
                        C1373b c1373b = (C1373b) this.f18600x.get(p10);
                        if (c1373b == null) {
                            int i7 = pVar.k;
                            this.f18599w.f17671d.getClass();
                            c1373b = new C1373b(i7, System.currentTimeMillis());
                            this.f18600x.put(p10, c1373b);
                        }
                        max = (Math.max((pVar.k - c1373b.f18586a) - 5, 0) * 30000) + c1373b.f18587b;
                    } finally {
                    }
                }
                long max2 = Math.max(pVar.a(), max);
                this.f18599w.f17671d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (pVar.f23404b == 1) {
                    if (currentTimeMillis < max2) {
                        C1372a c1372a = this.f18593c;
                        if (c1372a != null) {
                            HashMap hashMap = c1372a.f18585d;
                            Runnable runnable = (Runnable) hashMap.remove(pVar.f23403a);
                            e eVar = c1372a.f18583b;
                            if (runnable != null) {
                                eVar.f4906a.removeCallbacks(runnable);
                            }
                            hc.i iVar = new hc.i(1, c1372a, pVar);
                            hashMap.put(pVar.f23403a, iVar);
                            c1372a.f18584c.getClass();
                            eVar.f4906a.postDelayed(iVar, max2 - System.currentTimeMillis());
                        }
                    } else if (pVar.c()) {
                        C1243e c1243e = pVar.j;
                        if (c1243e.f17685d) {
                            z.e().a(f18588C, "Ignoring " + pVar + ". Requires device idle.");
                        } else if (c1243e.f17689i.isEmpty()) {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.f23403a);
                        } else {
                            z.e().a(f18588C, "Ignoring " + pVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f18596f.e(O5.b.p(pVar))) {
                        z.e().a(f18588C, "Starting work for " + pVar.f23403a);
                        g gVar = this.f18596f;
                        gVar.getClass();
                        i3.i s3 = gVar.s(O5.b.p(pVar));
                        this.f18590B.c(s3);
                        C1111f c1111f = this.f18598v;
                        c1111f.getClass();
                        ((i) c1111f.f16838c).r(new G(c1111f, s3, null, 7));
                    }
                }
            }
        }
        synchronized (this.f18595e) {
            try {
                if (!hashSet.isEmpty()) {
                    z.e().a(f18588C, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        p pVar2 = (p) it.next();
                        j p11 = O5.b.p(pVar2);
                        if (!this.f18592b.containsKey(p11)) {
                            this.f18592b.put(p11, m3.l.a(this.f18602z, pVar2, (A) this.f18589A.f23383b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // i3.f
    public final boolean d() {
        return false;
    }

    @Override // m3.h
    public final void e(p pVar, m3.c cVar) {
        j p10 = O5.b.p(pVar);
        boolean z8 = cVar instanceof m3.a;
        C1111f c1111f = this.f18598v;
        d dVar = this.f18590B;
        String str = f18588C;
        g gVar = this.f18596f;
        if (z8) {
            if (gVar.e(p10)) {
                return;
            }
            z.e().a(str, "Constraints met: Scheduling work ID " + p10);
            i3.i s3 = gVar.s(p10);
            dVar.c(s3);
            c1111f.getClass();
            ((i) c1111f.f16838c).r(new G(c1111f, s3, null, 7));
            return;
        }
        z.e().a(str, "Constraints not met: Cancelling work ID " + p10);
        i3.i p11 = gVar.p(p10);
        if (p11 != null) {
            dVar.a(p11);
            int i7 = ((m3.b) cVar).f19778a;
            c1111f.getClass();
            c1111f.K(p11, i7);
        }
    }
}
