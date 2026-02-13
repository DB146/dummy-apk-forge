package r4;

import A8.c0;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import ea.C1108c;
import ia.C1358d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import m4.AbstractC1571h;
import n5.AbstractC1705a;
import n5.C1707c;
import q4.InterfaceC1888a;

/* renamed from: r4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1931c implements InterfaceC1938j {

    /* renamed from: a, reason: collision with root package name */
    public final List f23711a;

    /* renamed from: b, reason: collision with root package name */
    public final y f23712b;

    /* renamed from: c, reason: collision with root package name */
    public final C1108c f23713c;

    /* renamed from: d, reason: collision with root package name */
    public final C1358d f23714d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23715e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23716f;
    public final HashMap g;

    /* renamed from: h, reason: collision with root package name */
    public final C1707c f23717h;

    /* renamed from: i, reason: collision with root package name */
    public final Y5.B f23718i;
    public final n4.l j;
    public final InterfaceC1926E k;

    /* renamed from: l, reason: collision with root package name */
    public final UUID f23719l;

    /* renamed from: m, reason: collision with root package name */
    public final Looper f23720m;

    /* renamed from: n, reason: collision with root package name */
    public final c0 f23721n;

    /* renamed from: o, reason: collision with root package name */
    public int f23722o;

    /* renamed from: p, reason: collision with root package name */
    public int f23723p;

    /* renamed from: q, reason: collision with root package name */
    public HandlerThread f23724q;

    /* renamed from: r, reason: collision with root package name */
    public HandlerC1929a f23725r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC1888a f23726s;

    /* renamed from: t, reason: collision with root package name */
    public C1937i f23727t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f23728u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f23729v;

    /* renamed from: w, reason: collision with root package name */
    public w f23730w;

    /* renamed from: x, reason: collision with root package name */
    public x f23731x;

    public C1931c(UUID uuid, y yVar, C1108c c1108c, C1358d c1358d, List list, boolean z8, boolean z10, byte[] bArr, HashMap hashMap, InterfaceC1926E interfaceC1926E, Looper looper, Y5.B b2, n4.l lVar) {
        this.f23719l = uuid;
        this.f23713c = c1108c;
        this.f23714d = c1358d;
        this.f23712b = yVar;
        this.f23715e = z8;
        this.f23716f = z10;
        if (bArr != null) {
            this.f23729v = bArr;
            this.f23711a = null;
        } else {
            list.getClass();
            this.f23711a = Collections.unmodifiableList(list);
        }
        this.g = hashMap;
        this.k = interfaceC1926E;
        this.f23717h = new C1707c();
        this.f23718i = b2;
        this.j = lVar;
        this.f23722o = 2;
        this.f23720m = looper;
        this.f23721n = new c0(this, looper, 5);
    }

    @Override // r4.InterfaceC1938j
    public final void a(C1941m c1941m) {
        m();
        int i7 = this.f23723p;
        if (i7 <= 0) {
            AbstractC1705a.t("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i7 - 1;
        this.f23723p = i10;
        if (i10 == 0) {
            this.f23722o = 0;
            c0 c0Var = this.f23721n;
            int i11 = n5.D.f21141a;
            c0Var.removeCallbacksAndMessages(null);
            HandlerC1929a handlerC1929a = this.f23725r;
            synchronized (handlerC1929a) {
                handlerC1929a.removeCallbacksAndMessages(null);
                handlerC1929a.f23705a = true;
            }
            this.f23725r = null;
            this.f23724q.quit();
            this.f23724q = null;
            this.f23726s = null;
            this.f23727t = null;
            this.f23730w = null;
            this.f23731x = null;
            byte[] bArr = this.f23728u;
            if (bArr != null) {
                this.f23712b.e(bArr);
                this.f23728u = null;
            }
        }
        if (c1941m != null) {
            C1707c c1707c = this.f23717h;
            synchronized (c1707c.f21164a) {
                try {
                    Integer num = (Integer) c1707c.f21165b.get(c1941m);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(c1707c.f21167d);
                        arrayList.remove(c1941m);
                        c1707c.f21167d = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            c1707c.f21165b.remove(c1941m);
                            HashSet hashSet = new HashSet(c1707c.f21166c);
                            hashSet.remove(c1941m);
                            c1707c.f21166c = Collections.unmodifiableSet(hashSet);
                        } else {
                            c1707c.f21165b.put(c1941m, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } finally {
                }
            }
            if (this.f23717h.b(c1941m) == 0) {
                c1941m.e();
            }
        }
        C1358d c1358d = this.f23714d;
        int i12 = this.f23723p;
        C1934f c1934f = (C1934f) c1358d.f18487b;
        if (i12 == 1 && c1934f.f23747p > 0 && c1934f.f23743l != -9223372036854775807L) {
            c1934f.f23746o.add(this);
            Handler handler = c1934f.f23752u;
            handler.getClass();
            handler.postAtTime(new k1.a(this, 9), this, SystemClock.uptimeMillis() + c1934f.f23743l);
        } else if (i12 == 0) {
            c1934f.f23744m.remove(this);
            if (c1934f.f23749r == this) {
                c1934f.f23749r = null;
            }
            if (c1934f.f23750s == this) {
                c1934f.f23750s = null;
            }
            C1108c c1108c = c1934f.f23742i;
            HashSet hashSet2 = (HashSet) c1108c.f16831c;
            hashSet2.remove(this);
            if (((C1931c) c1108c.f16830b) == this) {
                c1108c.f16830b = null;
                if (!hashSet2.isEmpty()) {
                    C1931c c1931c = (C1931c) hashSet2.iterator().next();
                    c1108c.f16830b = c1931c;
                    x k = c1931c.f23712b.k();
                    c1931c.f23731x = k;
                    HandlerC1929a handlerC1929a2 = c1931c.f23725r;
                    int i13 = n5.D.f21141a;
                    k.getClass();
                    handlerC1929a2.getClass();
                    handlerC1929a2.obtainMessage(0, new C1930b(P4.r.f8129b.getAndIncrement(), true, SystemClock.elapsedRealtime(), k)).sendToTarget();
                }
            }
            if (c1934f.f23743l != -9223372036854775807L) {
                Handler handler2 = c1934f.f23752u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                c1934f.f23746o.remove(this);
            }
        }
        c1934f.k();
    }

    @Override // r4.InterfaceC1938j
    public final boolean b() {
        m();
        return this.f23715e;
    }

    @Override // r4.InterfaceC1938j
    public final UUID c() {
        m();
        return this.f23719l;
    }

    @Override // r4.InterfaceC1938j
    public final void d(C1941m c1941m) {
        m();
        if (this.f23723p < 0) {
            AbstractC1705a.t("DefaultDrmSession", "Session reference count less than zero: " + this.f23723p);
            this.f23723p = 0;
        }
        if (c1941m != null) {
            C1707c c1707c = this.f23717h;
            synchronized (c1707c.f21164a) {
                try {
                    ArrayList arrayList = new ArrayList(c1707c.f21167d);
                    arrayList.add(c1941m);
                    c1707c.f21167d = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) c1707c.f21165b.get(c1941m);
                    if (num == null) {
                        HashSet hashSet = new HashSet(c1707c.f21166c);
                        hashSet.add(c1941m);
                        c1707c.f21166c = Collections.unmodifiableSet(hashSet);
                    }
                    c1707c.f21165b.put(c1941m, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i7 = this.f23723p + 1;
        this.f23723p = i7;
        if (i7 == 1) {
            AbstractC1705a.m(this.f23722o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f23724q = handlerThread;
            handlerThread.start();
            this.f23725r = new HandlerC1929a(this, this.f23724q.getLooper());
            if (k()) {
                g(true);
            }
        } else if (c1941m != null && h() && this.f23717h.b(c1941m) == 1) {
            c1941m.c(this.f23722o);
        }
        C1934f c1934f = (C1934f) this.f23714d.f18487b;
        if (c1934f.f23743l != -9223372036854775807L) {
            c1934f.f23746o.remove(this);
            Handler handler = c1934f.f23752u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // r4.InterfaceC1938j
    public final boolean e(String str) {
        m();
        byte[] bArr = this.f23728u;
        AbstractC1705a.n(bArr);
        return this.f23712b.q(str, bArr);
    }

    @Override // r4.InterfaceC1938j
    public final InterfaceC1888a f() {
        m();
        return this.f23726s;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:41|42|43|(6:45|46|47|48|(1:50)|52)|55|46|47|48|(0)|52) */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006c A[Catch: NumberFormatException -> 0x0070, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x0070, blocks: (B:48:0x0064, B:50:0x006c), top: B:47:0x0064 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(boolean z8) {
        long min;
        long j;
        String str;
        String str2;
        Set set;
        if (this.f23716f) {
            return;
        }
        byte[] bArr = this.f23728u;
        int i7 = n5.D.f21141a;
        byte[] bArr2 = this.f23729v;
        if (bArr2 == null) {
            l(1, z8, bArr);
            return;
        }
        if (this.f23722o != 4) {
            try {
                this.f23712b.b(bArr, bArr2);
            } catch (Exception e2) {
                i(1, e2);
                return;
            }
        }
        if (AbstractC1571h.f20385d.equals(this.f23719l)) {
            m();
            byte[] bArr3 = this.f23728u;
            Pair pair = null;
            Map c10 = bArr3 == null ? null : this.f23712b.c(bArr3);
            if (c10 != null) {
                long j10 = -9223372036854775807L;
                try {
                    str2 = (String) c10.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                if (str2 != null) {
                    j = Long.parseLong(str2);
                    Long valueOf = Long.valueOf(j);
                    str = (String) c10.get("PlaybackDurationRemaining");
                    if (str != null) {
                        j10 = Long.parseLong(str);
                    }
                    pair = new Pair(valueOf, Long.valueOf(j10));
                }
                j = -9223372036854775807L;
                Long valueOf2 = Long.valueOf(j);
                str = (String) c10.get("PlaybackDurationRemaining");
                if (str != null) {
                }
                pair = new Pair(valueOf2, Long.valueOf(j10));
            }
            pair.getClass();
            min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            min = Long.MAX_VALUE;
        }
        if (min <= 60) {
            AbstractC1705a.s("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + min);
            l(2, z8, bArr);
            return;
        }
        if (min <= 0) {
            i(2, new Exception());
            return;
        }
        this.f23722o = 4;
        C1707c c1707c = this.f23717h;
        synchronized (c1707c.f21164a) {
            set = c1707c.f21166c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C1941m) it.next()).b();
        }
    }

    @Override // r4.InterfaceC1938j
    public final C1937i getError() {
        m();
        if (this.f23722o == 1) {
            return this.f23727t;
        }
        return null;
    }

    @Override // r4.InterfaceC1938j
    public final int getState() {
        m();
        return this.f23722o;
    }

    public final boolean h() {
        int i7 = this.f23722o;
        return i7 == 3 || i7 == 4;
    }

    public final void i(int i7, Exception exc) {
        int i10;
        Set set;
        int i11 = n5.D.f21141a;
        if (i11 < 21 || !t.a(exc)) {
            if (i11 < 23 || !u.a(exc)) {
                if (i11 < 18 || !s.b(exc)) {
                    if (i11 >= 18 && s.a(exc)) {
                        i10 = 6007;
                    } else if (exc instanceof C1928G) {
                        i10 = 6001;
                    } else if (exc instanceof C1932d) {
                        i10 = 6003;
                    } else if (exc instanceof C1925D) {
                        i10 = 6008;
                    } else if (i7 != 1) {
                        if (i7 == 2) {
                            i10 = 6004;
                        } else if (i7 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i10 = 6002;
            }
            i10 = 6006;
        } else {
            i10 = t.b(exc);
        }
        this.f23727t = new C1937i(i10, exc);
        AbstractC1705a.u("DefaultDrmSession", "DRM session error", exc);
        C1707c c1707c = this.f23717h;
        synchronized (c1707c.f21164a) {
            set = c1707c.f21166c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C1941m) it.next()).d(exc);
        }
        if (this.f23722o != 4) {
            this.f23722o = 1;
        }
    }

    public final void j(Exception exc, boolean z8) {
        if (!(exc instanceof NotProvisionedException)) {
            i(z8 ? 1 : 2, exc);
            return;
        }
        C1108c c1108c = this.f23713c;
        ((HashSet) c1108c.f16831c).add(this);
        if (((C1931c) c1108c.f16830b) != null) {
            return;
        }
        c1108c.f16830b = this;
        x k = this.f23712b.k();
        this.f23731x = k;
        HandlerC1929a handlerC1929a = this.f23725r;
        int i7 = n5.D.f21141a;
        k.getClass();
        handlerC1929a.getClass();
        handlerC1929a.obtainMessage(0, new C1930b(P4.r.f8129b.getAndIncrement(), true, SystemClock.elapsedRealtime(), k)).sendToTarget();
    }

    public final boolean k() {
        Set set;
        if (h()) {
            return true;
        }
        try {
            byte[] r10 = this.f23712b.r();
            this.f23728u = r10;
            this.f23712b.h(r10, this.j);
            this.f23726s = this.f23712b.o(this.f23728u);
            this.f23722o = 3;
            C1707c c1707c = this.f23717h;
            synchronized (c1707c.f21164a) {
                set = c1707c.f21166c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C1941m) it.next()).c(3);
            }
            this.f23728u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            C1108c c1108c = this.f23713c;
            ((HashSet) c1108c.f16831c).add(this);
            if (((C1931c) c1108c.f16830b) == null) {
                c1108c.f16830b = this;
                x k = this.f23712b.k();
                this.f23731x = k;
                HandlerC1929a handlerC1929a = this.f23725r;
                int i7 = n5.D.f21141a;
                k.getClass();
                handlerC1929a.getClass();
                handlerC1929a.obtainMessage(0, new C1930b(P4.r.f8129b.getAndIncrement(), true, SystemClock.elapsedRealtime(), k)).sendToTarget();
            }
            return false;
        } catch (Exception e2) {
            i(1, e2);
            return false;
        }
    }

    public final void l(int i7, boolean z8, byte[] bArr) {
        try {
            w m10 = this.f23712b.m(bArr, this.f23711a, i7, this.g);
            this.f23730w = m10;
            HandlerC1929a handlerC1929a = this.f23725r;
            int i10 = n5.D.f21141a;
            m10.getClass();
            handlerC1929a.getClass();
            handlerC1929a.obtainMessage(1, new C1930b(P4.r.f8129b.getAndIncrement(), z8, SystemClock.elapsedRealtime(), m10)).sendToTarget();
        } catch (Exception e2) {
            j(e2, true);
        }
    }

    public final void m() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f23720m;
        if (currentThread != looper.getThread()) {
            AbstractC1705a.R(new IllegalStateException(), "DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName());
        }
    }
}
