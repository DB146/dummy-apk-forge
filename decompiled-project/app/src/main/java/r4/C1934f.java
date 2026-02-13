package r4;

import A8.c0;
import N6.H;
import N6.H0;
import N6.t0;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import ea.C1108c;
import ia.C1358d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import m4.AbstractC1571h;
import m4.L;
import n5.AbstractC1705a;

/* renamed from: r4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1934f implements q {

    /* renamed from: b, reason: collision with root package name */
    public final UUID f23736b;

    /* renamed from: c, reason: collision with root package name */
    public final n4.c f23737c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1926E f23738d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f23739e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23740f;
    public final int[] g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f23741h;

    /* renamed from: i, reason: collision with root package name */
    public final C1108c f23742i;
    public final Y5.B j;
    public final C1358d k;

    /* renamed from: l, reason: collision with root package name */
    public final long f23743l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f23744m;

    /* renamed from: n, reason: collision with root package name */
    public final Set f23745n;

    /* renamed from: o, reason: collision with root package name */
    public final Set f23746o;

    /* renamed from: p, reason: collision with root package name */
    public int f23747p;

    /* renamed from: q, reason: collision with root package name */
    public y f23748q;

    /* renamed from: r, reason: collision with root package name */
    public C1931c f23749r;

    /* renamed from: s, reason: collision with root package name */
    public C1931c f23750s;

    /* renamed from: t, reason: collision with root package name */
    public Looper f23751t;

    /* renamed from: u, reason: collision with root package name */
    public Handler f23752u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f23753v;

    /* renamed from: w, reason: collision with root package name */
    public n4.l f23754w;

    /* renamed from: x, reason: collision with root package name */
    public volatile c0 f23755x;

    public C1934f(UUID uuid, InterfaceC1926E interfaceC1926E, HashMap hashMap, boolean z8, int[] iArr, boolean z10, Y5.B b2) {
        n4.c cVar = C1924C.f23700d;
        uuid.getClass();
        AbstractC1705a.g("Use C.CLEARKEY_UUID instead", !AbstractC1571h.f20383b.equals(uuid));
        this.f23736b = uuid;
        this.f23737c = cVar;
        this.f23738d = interfaceC1926E;
        this.f23739e = hashMap;
        this.f23740f = z8;
        this.g = iArr;
        this.f23741h = z10;
        this.j = b2;
        this.f23742i = new C1108c(12);
        this.k = new C1358d(this, 14);
        this.f23744m = new ArrayList();
        this.f23745n = Collections.newSetFromMap(new IdentityHashMap());
        this.f23746o = Collections.newSetFromMap(new IdentityHashMap());
        this.f23743l = 300000L;
    }

    public static boolean g(C1931c c1931c) {
        c1931c.m();
        if (c1931c.f23722o == 1) {
            if (n5.D.f21141a < 19) {
                return true;
            }
            C1937i error = c1931c.getError();
            error.getClass();
            if (error.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList j(C1936h c1936h, UUID uuid, boolean z8) {
        ArrayList arrayList = new ArrayList(c1936h.f23764d);
        for (int i7 = 0; i7 < c1936h.f23764d; i7++) {
            C1935g c1935g = c1936h.f23761a[i7];
            if ((c1935g.a(uuid) || (AbstractC1571h.f20384c.equals(uuid) && c1935g.a(AbstractC1571h.f20383b))) && (c1935g.f23760e != null || z8)) {
                arrayList.add(c1935g);
            }
        }
        return arrayList;
    }

    @Override // r4.q
    public final void a() {
        y a9;
        l(true);
        int i7 = this.f23747p;
        this.f23747p = i7 + 1;
        if (i7 != 0) {
            return;
        }
        if (this.f23748q == null) {
            UUID uuid = this.f23736b;
            this.f23737c.getClass();
            try {
                try {
                    a9 = new C1924C(uuid);
                } catch (C1928G unused) {
                    AbstractC1705a.t("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    a9 = new Y5.A(16);
                }
                this.f23748q = a9;
                a9.g(new o7.o(this, 4));
                return;
            } catch (UnsupportedSchemeException e2) {
                throw new Exception(e2);
            } catch (Exception e10) {
                throw new Exception(e10);
            }
        }
        if (this.f23743l == -9223372036854775807L) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23744m;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((C1931c) arrayList.get(i10)).d(null);
            i10++;
        }
    }

    @Override // r4.q
    public final void b(Looper looper, n4.l lVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.f23751t;
                if (looper2 == null) {
                    this.f23751t = looper;
                    this.f23752u = new Handler(looper);
                } else {
                    AbstractC1705a.m(looper2 == looper);
                    this.f23752u.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f23754w = lVar;
    }

    @Override // r4.q
    public final p c(C1941m c1941m, L l10) {
        AbstractC1705a.m(this.f23747p > 0);
        AbstractC1705a.n(this.f23751t);
        C1933e c1933e = new C1933e(this, c1941m);
        Handler handler = this.f23752u;
        handler.getClass();
        handler.post(new p5.j(7, c1933e, l10));
        return c1933e;
    }

    @Override // r4.q
    public final InterfaceC1938j d(C1941m c1941m, L l10) {
        l(false);
        AbstractC1705a.m(this.f23747p > 0);
        AbstractC1705a.n(this.f23751t);
        return f(this.f23751t, c1941m, l10, true);
    }

    @Override // r4.q
    public final int e(L l10) {
        l(false);
        y yVar = this.f23748q;
        yVar.getClass();
        int n6 = yVar.n();
        C1936h c1936h = l10.f20066C;
        if (c1936h == null) {
            int h10 = n5.o.h(l10.f20096z);
            int i7 = 0;
            while (true) {
                int[] iArr = this.g;
                if (i7 >= iArr.length) {
                    i7 = -1;
                    break;
                }
                if (iArr[i7] == h10) {
                    break;
                }
                i7++;
            }
            if (i7 != -1) {
                return n6;
            }
            return 0;
        }
        if (this.f23753v != null) {
            return n6;
        }
        UUID uuid = this.f23736b;
        if (j(c1936h, uuid, true).isEmpty()) {
            if (c1936h.f23764d == 1 && c1936h.f23761a[0].a(AbstractC1571h.f20383b)) {
                AbstractC1705a.S("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
            }
            return 1;
        }
        String str = c1936h.f23763c;
        if (str == null || "cenc".equals(str)) {
            return n6;
        }
        if ("cbcs".equals(str)) {
            if (n5.D.f21141a >= 25) {
                return n6;
            }
        } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
            return n6;
        }
        return 1;
    }

    public final InterfaceC1938j f(Looper looper, C1941m c1941m, L l10, boolean z8) {
        ArrayList arrayList;
        if (this.f23755x == null) {
            this.f23755x = new c0(this, looper, 6);
        }
        C1936h c1936h = l10.f20066C;
        int i7 = 0;
        C1931c c1931c = null;
        if (c1936h == null) {
            int h10 = n5.o.h(l10.f20096z);
            y yVar = this.f23748q;
            yVar.getClass();
            if (yVar.n() == 2 && z.f23781d) {
                return null;
            }
            int[] iArr = this.g;
            while (true) {
                if (i7 >= iArr.length) {
                    i7 = -1;
                    break;
                }
                if (iArr[i7] == h10) {
                    break;
                }
                i7++;
            }
            if (i7 == -1 || yVar.n() == 1) {
                return null;
            }
            C1931c c1931c2 = this.f23749r;
            if (c1931c2 == null) {
                N6.F f4 = H.f7232b;
                C1931c i10 = i(t0.f7341e, true, null, z8);
                this.f23744m.add(i10);
                this.f23749r = i10;
            } else {
                c1931c2.d(null);
            }
            return this.f23749r;
        }
        if (this.f23753v == null) {
            arrayList = j(c1936h, this.f23736b, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f23736b);
                AbstractC1705a.u("DefaultDrmSessionMgr", "DRM error", exc);
                if (c1941m != null) {
                    c1941m.d(exc);
                }
                return new v(new C1937i(6003, exc));
            }
        } else {
            arrayList = null;
        }
        if (this.f23740f) {
            Iterator it = this.f23744m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1931c c1931c3 = (C1931c) it.next();
                if (n5.D.a(c1931c3.f23711a, arrayList)) {
                    c1931c = c1931c3;
                    break;
                }
            }
        } else {
            c1931c = this.f23750s;
        }
        if (c1931c == null) {
            c1931c = i(arrayList, false, c1941m, z8);
            if (!this.f23740f) {
                this.f23750s = c1931c;
            }
            this.f23744m.add(c1931c);
        } else {
            c1931c.d(c1941m);
        }
        return c1931c;
    }

    public final C1931c h(List list, boolean z8, C1941m c1941m) {
        this.f23748q.getClass();
        boolean z10 = this.f23741h | z8;
        y yVar = this.f23748q;
        byte[] bArr = this.f23753v;
        Looper looper = this.f23751t;
        looper.getClass();
        n4.l lVar = this.f23754w;
        lVar.getClass();
        C1931c c1931c = new C1931c(this.f23736b, yVar, this.f23742i, this.k, list, z10, z8, bArr, this.f23739e, this.f23738d, looper, this.j, lVar);
        c1931c.d(c1941m);
        if (this.f23743l != -9223372036854775807L) {
            c1931c.d(null);
        }
        return c1931c;
    }

    public final C1931c i(List list, boolean z8, C1941m c1941m, boolean z10) {
        C1931c h10 = h(list, z8, c1941m);
        boolean g = g(h10);
        long j = this.f23743l;
        Set set = this.f23746o;
        if (g && !set.isEmpty()) {
            H0 it = N6.L.F(set).iterator();
            while (it.hasNext()) {
                ((InterfaceC1938j) it.next()).a(null);
            }
            h10.a(c1941m);
            if (j != -9223372036854775807L) {
                h10.a(null);
            }
            h10 = h(list, z8, c1941m);
        }
        if (!g(h10) || !z10) {
            return h10;
        }
        Set set2 = this.f23745n;
        if (set2.isEmpty()) {
            return h10;
        }
        H0 it2 = N6.L.F(set2).iterator();
        while (it2.hasNext()) {
            ((C1933e) it2.next()).release();
        }
        if (!set.isEmpty()) {
            H0 it3 = N6.L.F(set).iterator();
            while (it3.hasNext()) {
                ((InterfaceC1938j) it3.next()).a(null);
            }
        }
        h10.a(c1941m);
        if (j != -9223372036854775807L) {
            h10.a(null);
        }
        return h(list, z8, c1941m);
    }

    public final void k() {
        if (this.f23748q != null && this.f23747p == 0 && this.f23744m.isEmpty() && this.f23745n.isEmpty()) {
            y yVar = this.f23748q;
            yVar.getClass();
            yVar.release();
            this.f23748q = null;
        }
    }

    public final void l(boolean z8) {
        if (z8 && this.f23751t == null) {
            AbstractC1705a.R(new IllegalStateException(), "DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.");
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f23751t;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            AbstractC1705a.R(new IllegalStateException(), "DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f23751t.getThread().getName());
        }
    }

    @Override // r4.q
    public final void release() {
        l(true);
        int i7 = this.f23747p - 1;
        this.f23747p = i7;
        if (i7 != 0) {
            return;
        }
        if (this.f23743l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f23744m);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((C1931c) arrayList.get(i10)).a(null);
            }
        }
        H0 it = N6.L.F(this.f23745n).iterator();
        while (it.hasNext()) {
            ((C1933e) it.next()).release();
        }
        k();
    }
}
