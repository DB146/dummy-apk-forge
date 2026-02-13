package S3;

import A0.G0;
import C3.A;
import C3.n;
import C3.r;
import C3.v;
import T3.i;
import W3.o;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g implements c, T3.h {

    /* renamed from: D, reason: collision with root package name */
    public static final boolean f9016D = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    public boolean f9017A;

    /* renamed from: B, reason: collision with root package name */
    public final RuntimeException f9018B;

    /* renamed from: C, reason: collision with root package name */
    public int f9019C;

    /* renamed from: a, reason: collision with root package name */
    public final String f9020a;

    /* renamed from: b, reason: collision with root package name */
    public final X3.e f9021b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9022c;

    /* renamed from: d, reason: collision with root package name */
    public final z3.c f9023d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9024e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f9025f;
    public final com.bumptech.glide.f g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f9026h;

    /* renamed from: i, reason: collision with root package name */
    public final Class f9027i;
    public final a j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9028l;

    /* renamed from: m, reason: collision with root package name */
    public final com.bumptech.glide.g f9029m;

    /* renamed from: n, reason: collision with root package name */
    public final i f9030n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f9031o;

    /* renamed from: p, reason: collision with root package name */
    public final U3.a f9032p;

    /* renamed from: q, reason: collision with root package name */
    public final Executor f9033q;

    /* renamed from: r, reason: collision with root package name */
    public A f9034r;

    /* renamed from: s, reason: collision with root package name */
    public G0 f9035s;

    /* renamed from: t, reason: collision with root package name */
    public long f9036t;

    /* renamed from: u, reason: collision with root package name */
    public volatile n f9037u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f9038v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f9039w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f9040x;

    /* renamed from: y, reason: collision with root package name */
    public int f9041y;

    /* renamed from: z, reason: collision with root package name */
    public int f9042z;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, X3.e] */
    public g(Context context, com.bumptech.glide.f fVar, Object obj, Object obj2, Class cls, a aVar, int i7, int i10, com.bumptech.glide.g gVar, i iVar, z3.c cVar, ArrayList arrayList, d dVar, n nVar, U3.a aVar2, Executor executor) {
        this.f9020a = f9016D ? String.valueOf(hashCode()) : null;
        this.f9021b = new Object();
        this.f9022c = obj;
        this.f9025f = context;
        this.g = fVar;
        this.f9026h = obj2;
        this.f9027i = cls;
        this.j = aVar;
        this.k = i7;
        this.f9028l = i10;
        this.f9029m = gVar;
        this.f9030n = iVar;
        this.f9023d = cVar;
        this.f9031o = arrayList;
        this.f9024e = dVar;
        this.f9037u = nVar;
        this.f9032p = aVar2;
        this.f9033q = executor;
        this.f9019C = 1;
        if (this.f9018B == null && ((Map) fVar.f14631h.f8927b).containsKey(com.bumptech.glide.d.class)) {
            this.f9018B = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // S3.c
    public final boolean a() {
        boolean z8;
        synchronized (this.f9022c) {
            z8 = this.f9019C == 4;
        }
        return z8;
    }

    @Override // S3.c
    public final boolean b() {
        boolean z8;
        synchronized (this.f9022c) {
            z8 = this.f9019C == 6;
        }
        return z8;
    }

    public final void c() {
        if (this.f9017A) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f9021b.a();
        this.f9030n.d(this);
        G0 g02 = this.f9035s;
        if (g02 != null) {
            synchronized (((n) g02.f29d)) {
                ((r) g02.f27b).h((g) g02.f28c);
            }
            this.f9035s = null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [S3.d, java.lang.Object] */
    @Override // S3.c
    public final void clear() {
        synchronized (this.f9022c) {
            try {
                if (this.f9017A) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f9021b.a();
                if (this.f9019C == 6) {
                    return;
                }
                c();
                A a9 = this.f9034r;
                if (a9 != null) {
                    this.f9034r = null;
                } else {
                    a9 = null;
                }
                ?? r32 = this.f9024e;
                if (r32 == 0 || r32.f(this)) {
                    this.f9030n.h(f());
                }
                this.f9019C = 6;
                if (a9 != null) {
                    this.f9037u.getClass();
                    n.f(a9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S3.c
    public final boolean d(c cVar) {
        int i7;
        int i10;
        Object obj;
        Class cls;
        a aVar;
        com.bumptech.glide.g gVar;
        int size;
        int i11;
        int i12;
        Object obj2;
        Class cls2;
        a aVar2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(cVar instanceof g)) {
            return false;
        }
        synchronized (this.f9022c) {
            try {
                i7 = this.k;
                i10 = this.f9028l;
                obj = this.f9026h;
                cls = this.f9027i;
                aVar = this.j;
                gVar = this.f9029m;
                ArrayList arrayList = this.f9031o;
                size = arrayList != null ? arrayList.size() : 0;
            } finally {
            }
        }
        g gVar3 = (g) cVar;
        synchronized (gVar3.f9022c) {
            try {
                i11 = gVar3.k;
                i12 = gVar3.f9028l;
                obj2 = gVar3.f9026h;
                cls2 = gVar3.f9027i;
                aVar2 = gVar3.j;
                gVar2 = gVar3.f9029m;
                ArrayList arrayList2 = gVar3.f9031o;
                size2 = arrayList2 != null ? arrayList2.size() : 0;
            } finally {
            }
        }
        if (i7 == i11 && i10 == i12) {
            char[] cArr = o.f10619a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((aVar == null ? aVar2 == null : aVar.h(aVar2)) && gVar == gVar2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [S3.d, java.lang.Object] */
    @Override // S3.c
    public final void e() {
        synchronized (this.f9022c) {
            try {
                if (this.f9017A) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f9021b.a();
                int i7 = W3.i.f10608b;
                this.f9036t = SystemClock.elapsedRealtimeNanos();
                if (this.f9026h == null) {
                    if (o.j(this.k, this.f9028l)) {
                        this.f9041y = this.k;
                        this.f9042z = this.f9028l;
                    }
                    if (this.f9040x == null) {
                        this.j.getClass();
                        this.f9040x = null;
                    }
                    j(new v("Received null model"), this.f9040x == null ? 5 : 3);
                    return;
                }
                int i10 = this.f9019C;
                if (i10 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i10 == 4) {
                    k(this.f9034r, A3.a.f346e, false);
                    return;
                }
                ArrayList arrayList = this.f9031o;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                    }
                }
                this.f9019C = 3;
                if (o.j(this.k, this.f9028l)) {
                    m(this.k, this.f9028l);
                } else {
                    this.f9030n.f(this);
                }
                int i11 = this.f9019C;
                if (i11 == 2 || i11 == 3) {
                    ?? r12 = this.f9024e;
                    if (r12 == 0 || r12.g(this)) {
                        this.f9030n.e(f());
                    }
                }
                if (f9016D) {
                    h("finished run method in " + W3.i.a(this.f9036t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Drawable f() {
        int i7;
        if (this.f9039w == null) {
            a aVar = this.j;
            Drawable drawable = aVar.f9003f;
            this.f9039w = drawable;
            if (drawable == null && (i7 = aVar.f9004u) > 0) {
                Resources.Theme theme = aVar.f8994E;
                Context context = this.f9025f;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.f9039w = android.support.v4.media.session.b.o(context, context, i7, theme);
            }
        }
        return this.f9039w;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [S3.d, java.lang.Object] */
    public final boolean g() {
        ?? r02 = this.f9024e;
        return r02 == 0 || !r02.c().a();
    }

    public final void h(String str) {
        StringBuilder n6 = A3.c.n(str, " this: ");
        n6.append(this.f9020a);
        Log.v("GlideRequest", n6.toString());
    }

    @Override // S3.c
    public final boolean i() {
        boolean z8;
        synchronized (this.f9022c) {
            z8 = this.f9019C == 4;
        }
        return z8;
    }

    @Override // S3.c
    public final boolean isRunning() {
        boolean z8;
        synchronized (this.f9022c) {
            int i7 = this.f9019C;
            z8 = i7 == 2 || i7 == 3;
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [S3.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [S3.d, java.lang.Object] */
    public final void j(v vVar, int i7) {
        boolean z8;
        int i10;
        this.f9021b.a();
        synchronized (this.f9022c) {
            try {
                vVar.getClass();
                int i11 = this.g.f14632i;
                if (i11 <= i7) {
                    Log.w("Glide", "Load failed for [" + this.f9026h + "] with dimensions [" + this.f9041y + "x" + this.f9042z + "]", vVar);
                    if (i11 <= 4) {
                        vVar.d();
                    }
                }
                Drawable drawable = null;
                this.f9035s = null;
                this.f9019C = 5;
                ?? r02 = this.f9024e;
                if (r02 != 0) {
                    r02.j(this);
                }
                boolean z10 = true;
                this.f9017A = true;
                try {
                    ArrayList arrayList = this.f9031o;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        z8 = false;
                        while (it.hasNext()) {
                            z8 |= ((e) it.next()).onLoadFailed(vVar, this.f9026h, this.f9030n, g());
                        }
                    } else {
                        z8 = false;
                    }
                    z3.c cVar = this.f9023d;
                    if (cVar != null) {
                        cVar.onLoadFailed(vVar, this.f9026h, this.f9030n, g());
                    }
                    if (!z8) {
                        ?? r10 = this.f9024e;
                        if (r10 != 0 && !r10.g(this)) {
                            z10 = false;
                        }
                        if (this.f9026h == null) {
                            if (this.f9040x == null) {
                                this.j.getClass();
                                this.f9040x = null;
                            }
                            drawable = this.f9040x;
                        }
                        if (drawable == null) {
                            if (this.f9038v == null) {
                                a aVar = this.j;
                                Drawable drawable2 = aVar.f9001d;
                                this.f9038v = drawable2;
                                if (drawable2 == null && (i10 = aVar.f9002e) > 0) {
                                    Resources.Theme theme = aVar.f8994E;
                                    Context context = this.f9025f;
                                    if (theme == null) {
                                        theme = context.getTheme();
                                    }
                                    this.f9038v = android.support.v4.media.session.b.o(context, context, i10, theme);
                                }
                            }
                            drawable = this.f9038v;
                        }
                        if (drawable == null) {
                            drawable = f();
                        }
                        this.f9030n.b(drawable);
                    }
                } finally {
                    this.f9017A = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [S3.d, java.lang.Object] */
    public final void k(A a9, A3.a aVar, boolean z8) {
        this.f9021b.a();
        A a10 = null;
        try {
            synchronized (this.f9022c) {
                try {
                    this.f9035s = null;
                    if (a9 == null) {
                        j(new v("Expected to receive a Resource<R> with an object of " + this.f9027i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = a9.get();
                    try {
                        if (obj != null && this.f9027i.isAssignableFrom(obj.getClass())) {
                            ?? r92 = this.f9024e;
                            if (r92 == 0 || r92.h(this)) {
                                l(a9, obj, aVar);
                                return;
                            }
                            this.f9034r = null;
                            this.f9019C = 4;
                            this.f9037u.getClass();
                            n.f(a9);
                            return;
                        }
                        this.f9034r = null;
                        StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                        sb2.append(this.f9027i);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(a9);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        j(new v(sb2.toString()), 5);
                        this.f9037u.getClass();
                        n.f(a9);
                    } catch (Throwable th) {
                        a10 = a9;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (a10 != null) {
                this.f9037u.getClass();
                n.f(a10);
            }
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [S3.d, java.lang.Object] */
    public final void l(A a9, Object obj, A3.a aVar) {
        boolean z8;
        boolean g = g();
        this.f9019C = 4;
        this.f9034r = a9;
        if (this.g.f14632i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f9026h + " with size [" + this.f9041y + "x" + this.f9042z + "] in " + W3.i.a(this.f9036t) + " ms");
        }
        ?? r11 = this.f9024e;
        if (r11 != 0) {
            r11.k(this);
        }
        boolean z10 = true;
        this.f9017A = true;
        try {
            ArrayList arrayList = this.f9031o;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                z8 = false;
                while (it.hasNext()) {
                    z8 |= ((e) it.next()).onResourceReady(obj, this.f9026h, this.f9030n, aVar, g);
                }
            } else {
                z8 = false;
            }
            z3.c cVar = this.f9023d;
            if (cVar != null) {
                cVar.onResourceReady(obj, this.f9026h, this.f9030n, aVar, g);
            } else {
                z10 = false;
            }
            if (!(z10 | z8)) {
                this.f9032p.getClass();
                this.f9030n.i(obj);
            }
            this.f9017A = false;
        } catch (Throwable th) {
            this.f9017A = false;
            throw th;
        }
    }

    public final void m(int i7, int i10) {
        Object obj;
        int i11 = i7;
        this.f9021b.a();
        Object obj2 = this.f9022c;
        synchronized (obj2) {
            try {
                try {
                    boolean z8 = f9016D;
                    if (z8) {
                        h("Got onSizeReady in " + W3.i.a(this.f9036t));
                    }
                    if (this.f9019C == 3) {
                        this.f9019C = 2;
                        this.j.getClass();
                        if (i11 != Integer.MIN_VALUE) {
                            i11 = Math.round(i11 * 1.0f);
                        }
                        this.f9041y = i11;
                        this.f9042z = i10 == Integer.MIN_VALUE ? i10 : Math.round(1.0f * i10);
                        if (z8) {
                            h("finished setup for calling load in " + W3.i.a(this.f9036t));
                        }
                        n nVar = this.f9037u;
                        com.bumptech.glide.f fVar = this.g;
                        Object obj3 = this.f9026h;
                        a aVar = this.j;
                        try {
                            obj = obj2;
                            try {
                                this.f9035s = nVar.a(fVar, obj3, aVar.f9008y, this.f9041y, this.f9042z, aVar.f8992C, this.f9027i, this.f9029m, aVar.f8999b, aVar.f8991B, aVar.f9009z, aVar.f8996G, aVar.f8990A, aVar.f9005v, aVar.f8997H, this, this.f9033q);
                                if (this.f9019C != 2) {
                                    this.f9035s = null;
                                }
                                if (z8) {
                                    h("finished onSizeReady in " + W3.i.a(this.f9036t));
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
    }

    @Override // S3.c
    public final void pause() {
        synchronized (this.f9022c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f9022c) {
            obj = this.f9026h;
            cls = this.f9027i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
