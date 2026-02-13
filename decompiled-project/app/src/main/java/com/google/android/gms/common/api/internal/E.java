package com.google.android.gms.common.api.internal;

import A9.B2;
import a6.C0777a;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0992h;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class E implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.g f14918b;

    /* renamed from: c, reason: collision with root package name */
    public final C0960a f14919c;

    /* renamed from: d, reason: collision with root package name */
    public final A f14920d;
    public final int j;
    public final N k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14923l;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0967h f14927p;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f14917a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f14921e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f14922f = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f14924m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public F5.b f14925n = null;

    /* renamed from: o, reason: collision with root package name */
    public int f14926o = 0;

    public E(C0967h c0967h, com.google.android.gms.common.api.l lVar) {
        this.f14927p = c0967h;
        com.google.android.gms.common.api.g zab = lVar.zab(c0967h.f14987B.getLooper(), this);
        this.f14918b = zab;
        this.f14919c = lVar.getApiKey();
        this.f14920d = new A();
        this.j = lVar.zaa();
        if (!zab.requiresSignIn()) {
            this.k = null;
        } else {
            this.k = lVar.zac(c0967h.f14993e, c0967h.f14987B);
        }
    }

    public final void a(F5.b bVar) {
        HashSet hashSet = this.f14921e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (com.google.android.gms.common.internal.G.k(bVar, F5.b.f4086e)) {
                this.f14918b.getEndpointPackageName();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        com.google.android.gms.common.internal.G.c(this.f14927p.f14987B);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z8) {
        com.google.android.gms.common.internal.G.c(this.f14927p.f14987B);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f14917a.iterator();
        while (it.hasNext()) {
            W w10 = (W) it.next();
            if (!z8 || w10.f14963a == 2) {
                if (status != null) {
                    w10.a(status);
                } else {
                    w10.b(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f14917a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            W w10 = (W) arrayList.get(i7);
            if (!this.f14918b.isConnected()) {
                return;
            }
            if (i(w10)) {
                linkedList.remove(w10);
            }
        }
    }

    public final void e() {
        C0967h c0967h = this.f14927p;
        com.google.android.gms.common.internal.G.c(c0967h.f14987B);
        this.f14925n = null;
        a(F5.b.f4086e);
        if (this.f14923l) {
            zau zauVar = c0967h.f14987B;
            C0960a c0960a = this.f14919c;
            zauVar.removeMessages(11, c0960a);
            c0967h.f14987B.removeMessages(9, c0960a);
            this.f14923l = false;
        }
        Iterator it = this.f14922f.values().iterator();
        if (it.hasNext()) {
            throw h3.o.j(it);
        }
        d();
        g();
    }

    public final void f(int i7) {
        C0967h c0967h = this.f14927p;
        com.google.android.gms.common.internal.G.c(c0967h.f14987B);
        this.f14925n = null;
        this.f14923l = true;
        String lastDisconnectMessage = this.f14918b.getLastDisconnectMessage();
        A a9 = this.f14920d;
        a9.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i7 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i7 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(lastDisconnectMessage);
        }
        a9.a(new Status(20, sb2.toString(), null, null), true);
        zau zauVar = c0967h.f14987B;
        C0960a c0960a = this.f14919c;
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 9, c0960a), 5000L);
        zau zauVar2 = c0967h.f14987B;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 11, c0960a), 120000L);
        ((SparseIntArray) c0967h.f14995u.f23376b).clear();
        Iterator it = this.f14922f.values().iterator();
        if (it.hasNext()) {
            A3.c.p(it.next());
            throw null;
        }
    }

    public final void g() {
        C0967h c0967h = this.f14927p;
        zau zauVar = c0967h.f14987B;
        C0960a c0960a = this.f14919c;
        zauVar.removeMessages(12, c0960a);
        zau zauVar2 = c0967h.f14987B;
        zauVar2.sendMessageDelayed(zauVar2.obtainMessage(12, c0960a), c0967h.f14989a);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0966g
    public final void h() {
        Looper myLooper = Looper.myLooper();
        C0967h c0967h = this.f14927p;
        if (myLooper == c0967h.f14987B.getLooper()) {
            e();
        } else {
            c0967h.f14987B.post(new B0.C(this, 27));
        }
    }

    public final boolean i(W w10) {
        F5.d dVar;
        if (!(w10 instanceof K)) {
            com.google.android.gms.common.api.g gVar = this.f14918b;
            w10.d(this.f14920d, gVar.requiresSignIn());
            try {
                w10.c(this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                gVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        K k = (K) w10;
        F5.d[] g = k.g(this);
        if (g != null && g.length != 0) {
            F5.d[] availableFeatures = this.f14918b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new F5.d[0];
            }
            u.T t5 = new u.T(availableFeatures.length);
            for (F5.d dVar2 : availableFeatures) {
                t5.put(dVar2.f4094a, Long.valueOf(dVar2.t()));
            }
            int length = g.length;
            for (int i7 = 0; i7 < length; i7++) {
                dVar = g[i7];
                Long l10 = (Long) t5.get(dVar.f4094a);
                if (l10 == null || l10.longValue() < dVar.t()) {
                    break;
                }
            }
        }
        dVar = null;
        if (dVar == null) {
            com.google.android.gms.common.api.g gVar2 = this.f14918b;
            w10.d(this.f14920d, gVar2.requiresSignIn());
            try {
                w10.c(this);
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                gVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.f14918b.getClass().getName() + " could not execute call because it requires feature (" + dVar.f4094a + ", " + dVar.t() + ").");
        if (!this.f14927p.f14988C || !k.f(this)) {
            k.b(new com.google.android.gms.common.api.v(dVar));
            return true;
        }
        F f4 = new F(this.f14919c, dVar);
        int indexOf = this.f14924m.indexOf(f4);
        if (indexOf >= 0) {
            F f10 = (F) this.f14924m.get(indexOf);
            this.f14927p.f14987B.removeMessages(15, f10);
            zau zauVar = this.f14927p.f14987B;
            zauVar.sendMessageDelayed(Message.obtain(zauVar, 15, f10), 5000L);
        } else {
            this.f14924m.add(f4);
            zau zauVar2 = this.f14927p.f14987B;
            zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 15, f4), 5000L);
            zau zauVar3 = this.f14927p.f14987B;
            zauVar3.sendMessageDelayed(Message.obtain(zauVar3, 16, f4), 120000L);
            F5.b bVar = new F5.b(2, null);
            if (!j(bVar)) {
                this.f14927p.d(bVar, this.j);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r6.get() == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(F5.b bVar) {
        synchronized (C0967h.f14984F) {
            try {
                C0967h c0967h = this.f14927p;
                if (c0967h.f14999y == null || !c0967h.f15000z.contains(this.f14919c)) {
                    return false;
                }
                B b2 = this.f14927p.f14999y;
                int i7 = this.j;
                b2.getClass();
                X x2 = new X(bVar, i7);
                loop0: while (true) {
                    AtomicReference atomicReference = b2.f14908b;
                    while (true) {
                        if (atomicReference.compareAndSet(null, x2)) {
                            b2.f14909c.post(new Y(0, b2, x2));
                            break loop0;
                        }
                        if (atomicReference.get() != null) {
                            break;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k(boolean z8) {
        com.google.android.gms.common.internal.G.c(this.f14927p.f14987B);
        com.google.android.gms.common.api.g gVar = this.f14918b;
        if (!gVar.isConnected() || !this.f14922f.isEmpty()) {
            return false;
        }
        A a9 = this.f14920d;
        if (((Map) a9.f14905a).isEmpty() && ((Map) a9.f14906b).isEmpty()) {
            gVar.disconnect("Timing out service connection.");
            return true;
        }
        if (!z8) {
            return false;
        }
        g();
        return false;
    }

    public final void l() {
        C0967h c0967h = this.f14927p;
        com.google.android.gms.common.internal.G.c(c0967h.f14987B);
        com.google.android.gms.common.api.g gVar = this.f14918b;
        if (gVar.isConnected() || gVar.isConnecting()) {
            return;
        }
        try {
            q3.e eVar = c0967h.f14995u;
            Context context = c0967h.f14993e;
            eVar.getClass();
            com.google.android.gms.common.internal.G.g(context);
            int i7 = 0;
            if (gVar.requiresGooglePlayServices()) {
                int minApkVersion = gVar.getMinApkVersion();
                SparseIntArray sparseIntArray = (SparseIntArray) eVar.f23376b;
                int i10 = sparseIntArray.get(minApkVersion, -1);
                if (i10 != -1) {
                    i7 = i10;
                } else {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= sparseIntArray.size()) {
                            i7 = -1;
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i11);
                        if (keyAt > minApkVersion && sparseIntArray.get(keyAt) == 0) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (i7 == -1) {
                        i7 = ((F5.e) eVar.f23377c).d(context, minApkVersion);
                    }
                    sparseIntArray.put(minApkVersion, i7);
                }
            }
            if (i7 != 0) {
                F5.b bVar = new F5.b(i7, null);
                Log.w("GoogleApiManager", "The service for " + gVar.getClass().getName() + " is not available: " + bVar.toString());
                n(bVar, null);
                return;
            }
            G g = new G(c0967h, gVar, this.f14919c);
            if (gVar.requiresSignIn()) {
                N n6 = this.k;
                com.google.android.gms.common.internal.G.g(n6);
                C0777a c0777a = n6.f14952f;
                if (c0777a != null) {
                    c0777a.disconnect();
                }
                Integer valueOf = Integer.valueOf(System.identityHashCode(n6));
                C0992h c0992h = n6.f14951e;
                c0992h.g = valueOf;
                Handler handler = n6.f14948b;
                n6.f14952f = (C0777a) n6.f14949c.buildClient(n6.f14947a, handler.getLooper(), c0992h, (Object) c0992h.f15066f, (com.google.android.gms.common.api.m) n6, (com.google.android.gms.common.api.n) n6);
                n6.j = g;
                Set set = n6.f14950d;
                if (set == null || set.isEmpty()) {
                    handler.post(new B0.C(n6, 29));
                } else {
                    C0777a c0777a2 = n6.f14952f;
                    c0777a2.getClass();
                    c0777a2.connect(new com.google.android.gms.common.internal.r(c0777a2));
                }
            }
            try {
                gVar.connect(g);
            } catch (SecurityException e2) {
                n(new F5.b(10), e2);
            }
        } catch (IllegalStateException e10) {
            n(new F5.b(10), e10);
        }
    }

    public final void m(W w10) {
        com.google.android.gms.common.internal.G.c(this.f14927p.f14987B);
        boolean isConnected = this.f14918b.isConnected();
        LinkedList linkedList = this.f14917a;
        if (isConnected) {
            if (i(w10)) {
                g();
                return;
            } else {
                linkedList.add(w10);
                return;
            }
        }
        linkedList.add(w10);
        F5.b bVar = this.f14925n;
        if (bVar == null || bVar.f4088b == 0 || bVar.f4089c == null) {
            l();
        } else {
            n(bVar, null);
        }
    }

    public final void n(F5.b bVar, RuntimeException runtimeException) {
        C0777a c0777a;
        com.google.android.gms.common.internal.G.c(this.f14927p.f14987B);
        N n6 = this.k;
        if (n6 != null && (c0777a = n6.f14952f) != null) {
            c0777a.disconnect();
        }
        com.google.android.gms.common.internal.G.c(this.f14927p.f14987B);
        this.f14925n = null;
        ((SparseIntArray) this.f14927p.f14995u.f23376b).clear();
        a(bVar);
        if ((this.f14918b instanceof H5.c) && bVar.f4088b != 24) {
            C0967h c0967h = this.f14927p;
            c0967h.f14990b = true;
            zau zauVar = c0967h.f14987B;
            zauVar.sendMessageDelayed(zauVar.obtainMessage(19), 300000L);
        }
        if (bVar.f4088b == 4) {
            b(C0967h.f14983E);
            return;
        }
        if (this.f14917a.isEmpty()) {
            this.f14925n = bVar;
            return;
        }
        if (runtimeException != null) {
            com.google.android.gms.common.internal.G.c(this.f14927p.f14987B);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f14927p.f14988C) {
            b(C0967h.e(this.f14919c, bVar));
            return;
        }
        c(C0967h.e(this.f14919c, bVar), null, true);
        if (this.f14917a.isEmpty() || j(bVar) || this.f14927p.d(bVar, this.j)) {
            return;
        }
        if (bVar.f4088b == 18) {
            this.f14923l = true;
        }
        if (!this.f14923l) {
            b(C0967h.e(this.f14919c, bVar));
            return;
        }
        C0967h c0967h2 = this.f14927p;
        C0960a c0960a = this.f14919c;
        zau zauVar2 = c0967h2.f14987B;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 9, c0960a), 5000L);
    }

    public final void o(F5.b bVar) {
        com.google.android.gms.common.internal.G.c(this.f14927p.f14987B);
        com.google.android.gms.common.api.g gVar = this.f14918b;
        gVar.disconnect("onSignInFailed for " + gVar.getClass().getName() + " with " + String.valueOf(bVar));
        n(bVar, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0976q
    public final void onConnectionFailed(F5.b bVar) {
        n(bVar, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0966g
    public final void onConnectionSuspended(int i7) {
        Looper myLooper = Looper.myLooper();
        C0967h c0967h = this.f14927p;
        if (myLooper == c0967h.f14987B.getLooper()) {
            f(i7);
        } else {
            c0967h.f14987B.post(new B2(this, i7, 1));
        }
    }

    public final void p() {
        com.google.android.gms.common.internal.G.c(this.f14927p.f14987B);
        Status status = C0967h.f14982D;
        b(status);
        this.f14920d.a(status, false);
        for (AbstractC0973n abstractC0973n : (AbstractC0973n[]) this.f14922f.keySet().toArray(new AbstractC0973n[0])) {
            m(new V(4, new TaskCompletionSource()));
        }
        a(new F5.b(4));
        com.google.android.gms.common.api.g gVar = this.f14918b;
        if (gVar.isConnected()) {
            gVar.onUserSignOut(new R7.b(this, 16));
        }
    }
}
