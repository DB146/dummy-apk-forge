package com.bumptech.glide;

import B0.C;
import P3.p;
import P3.q;
import W3.o;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import i2.C1332t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import l1.AbstractC1449a;

/* loaded from: classes.dex */
public final class n implements ComponentCallbacks2, P3.i {

    /* renamed from: y, reason: collision with root package name */
    public static final S3.f f14695y;

    /* renamed from: a, reason: collision with root package name */
    public final b f14696a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14697b;

    /* renamed from: c, reason: collision with root package name */
    public final P3.g f14698c;

    /* renamed from: d, reason: collision with root package name */
    public final p f14699d;

    /* renamed from: e, reason: collision with root package name */
    public final P3.m f14700e;

    /* renamed from: f, reason: collision with root package name */
    public final q f14701f;

    /* renamed from: u, reason: collision with root package name */
    public final C f14702u;

    /* renamed from: v, reason: collision with root package name */
    public final P3.b f14703v;

    /* renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArrayList f14704w;

    /* renamed from: x, reason: collision with root package name */
    public final S3.f f14705x;

    static {
        S3.f fVar = (S3.f) new S3.a().d(Bitmap.class);
        fVar.f8993D = true;
        f14695y = fVar;
        ((S3.f) new S3.a().d(N3.c.class)).f8993D = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6, types: [P3.b, P3.i] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [P3.g] */
    /* JADX WARN: Type inference failed for: r8v10, types: [S3.a, S3.f] */
    public n(b bVar, P3.g gVar, P3.m mVar, Context context) {
        S3.f fVar;
        p pVar = new p(3);
        C1332t c1332t = bVar.f14604f;
        this.f14701f = new q();
        C c10 = new C(this, 26);
        this.f14702u = c10;
        this.f14696a = bVar;
        this.f14698c = gVar;
        this.f14700e = mVar;
        this.f14699d = pVar;
        this.f14697b = context;
        Context applicationContext = context.getApplicationContext();
        m mVar2 = new m(this, pVar);
        c1332t.getClass();
        boolean z8 = AbstractC1449a.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z8 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        ?? cVar = z8 ? new P3.c(applicationContext, mVar2) : new Object();
        this.f14703v = cVar;
        synchronized (bVar.f14605u) {
            if (bVar.f14605u.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.f14605u.add(this);
        }
        char[] cArr = o.f10619a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            gVar.j(this);
        } else {
            o.f().post(c10);
        }
        gVar.j(cVar);
        this.f14704w = new CopyOnWriteArrayList(bVar.f14601c.f14629e);
        f fVar2 = bVar.f14601c;
        synchronized (fVar2) {
            try {
                if (fVar2.j == null) {
                    fVar2.f14628d.getClass();
                    ?? aVar = new S3.a();
                    aVar.f8993D = true;
                    fVar2.j = aVar;
                }
                fVar = fVar2.j;
            } finally {
            }
        }
        synchronized (this) {
            S3.f fVar3 = (S3.f) fVar.clone();
            if (fVar3.f8993D && !fVar3.f8995F) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            fVar3.f8995F = true;
            fVar3.f8993D = true;
            this.f14705x = fVar3;
        }
    }

    @Override // P3.i
    public final synchronized void c() {
        this.f14701f.c();
        q();
    }

    @Override // P3.i
    public final synchronized void j() {
        r();
        this.f14701f.j();
    }

    @Override // P3.i
    public final synchronized void k() {
        this.f14701f.k();
        o();
        p pVar = this.f14699d;
        Iterator it = o.e((Set) pVar.f7842c).iterator();
        while (it.hasNext()) {
            pVar.d((S3.c) it.next());
        }
        ((HashSet) pVar.f7843d).clear();
        this.f14698c.h(this);
        this.f14698c.h(this.f14703v);
        o.f().removeCallbacks(this.f14702u);
        b bVar = this.f14696a;
        synchronized (bVar.f14605u) {
            if (!bVar.f14605u.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            bVar.f14605u.remove(this);
        }
    }

    public final k l(Class cls) {
        return new k(this.f14696a, this, cls, this.f14697b);
    }

    public final k m() {
        return l(Bitmap.class).a(f14695y);
    }

    public final void n(T3.i iVar) {
        if (iVar == null) {
            return;
        }
        boolean s3 = s(iVar);
        S3.c g = iVar.g();
        if (s3) {
            return;
        }
        b bVar = this.f14696a;
        synchronized (bVar.f14605u) {
            try {
                Iterator it = bVar.f14605u.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((n) it.next()).s(iVar)) {
                        }
                    } else if (g != null) {
                        iVar.a(null);
                        g.clear();
                    }
                }
            } finally {
            }
        }
    }

    public final synchronized void o() {
        try {
            Iterator it = o.e(this.f14701f.f7844a).iterator();
            while (it.hasNext()) {
                n((T3.i) it.next());
            }
            this.f14701f.f7844a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
    }

    public final k p(String str) {
        return l(Drawable.class).E(str);
    }

    public final synchronized void q() {
        p pVar = this.f14699d;
        pVar.f7841b = true;
        Iterator it = o.e((Set) pVar.f7842c).iterator();
        while (it.hasNext()) {
            S3.c cVar = (S3.c) it.next();
            if (cVar.isRunning()) {
                cVar.pause();
                ((HashSet) pVar.f7843d).add(cVar);
            }
        }
    }

    public final synchronized void r() {
        p pVar = this.f14699d;
        pVar.f7841b = false;
        Iterator it = o.e((Set) pVar.f7842c).iterator();
        while (it.hasNext()) {
            S3.c cVar = (S3.c) it.next();
            if (!cVar.i() && !cVar.isRunning()) {
                cVar.e();
            }
        }
        ((HashSet) pVar.f7843d).clear();
    }

    public final synchronized boolean s(T3.i iVar) {
        S3.c g = iVar.g();
        if (g == null) {
            return true;
        }
        if (!this.f14699d.d(g)) {
            return false;
        }
        this.f14701f.f7844a.remove(iVar);
        iVar.a(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f14699d + ", treeNode=" + this.f14700e + "}";
    }
}
