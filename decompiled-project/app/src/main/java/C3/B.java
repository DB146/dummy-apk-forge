package C3;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import u.C2052e;

/* loaded from: classes.dex */
public final class B implements h, com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final k f2484a;

    /* renamed from: b, reason: collision with root package name */
    public final i f2485b;

    /* renamed from: c, reason: collision with root package name */
    public int f2486c;

    /* renamed from: d, reason: collision with root package name */
    public int f2487d = -1;

    /* renamed from: e, reason: collision with root package name */
    public A3.h f2488e;

    /* renamed from: f, reason: collision with root package name */
    public List f2489f;

    /* renamed from: u, reason: collision with root package name */
    public int f2490u;

    /* renamed from: v, reason: collision with root package name */
    public volatile G3.r f2491v;

    /* renamed from: w, reason: collision with root package name */
    public File f2492w;

    /* renamed from: x, reason: collision with root package name */
    public C f2493x;

    public B(i iVar, k kVar) {
        this.f2485b = iVar;
        this.f2484a = kVar;
    }

    @Override // C3.h
    public final boolean a() {
        List list;
        ArrayList c10;
        ArrayList a9 = this.f2485b.a();
        boolean z8 = false;
        if (a9.isEmpty()) {
            return false;
        }
        i iVar = this.f2485b;
        com.bumptech.glide.i a10 = iVar.f2527c.a();
        Class<?> cls = iVar.f2528d.getClass();
        Class cls2 = iVar.g;
        Class cls3 = iVar.k;
        q3.e eVar = a10.f14644h;
        W3.m mVar = (W3.m) ((AtomicReference) eVar.f23376b).getAndSet(null);
        if (mVar == null) {
            mVar = new W3.m(cls, cls2, cls3);
        } else {
            mVar.f10615a = cls;
            mVar.f10616b = cls2;
            mVar.f10617c = cls3;
        }
        synchronized (((C2052e) eVar.f23377c)) {
            list = (List) ((C2052e) eVar.f23377c).get(mVar);
        }
        ((AtomicReference) eVar.f23376b).set(mVar);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            G3.v vVar = a10.f14638a;
            synchronized (vVar) {
                c10 = vVar.f4331a.c(cls);
            }
            Iterator it = c10.iterator();
            while (it.hasNext()) {
                Iterator it2 = a10.f14640c.A((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!a10.f14643f.d(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            q3.e eVar2 = a10.f14644h;
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((C2052e) eVar2.f23377c)) {
                ((C2052e) eVar2.f23377c).put(new W3.m(cls, cls2, cls3), unmodifiableList);
            }
            list2 = arrayList;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f2485b.k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f2485b.f2528d.getClass() + " to " + this.f2485b.k);
        }
        while (true) {
            List list3 = this.f2489f;
            if (list3 != null && this.f2490u < list3.size()) {
                this.f2491v = null;
                while (!z8 && this.f2490u < this.f2489f.size()) {
                    List list4 = this.f2489f;
                    int i7 = this.f2490u;
                    this.f2490u = i7 + 1;
                    G3.s sVar = (G3.s) list4.get(i7);
                    File file = this.f2492w;
                    i iVar2 = this.f2485b;
                    this.f2491v = sVar.a(file, iVar2.f2529e, iVar2.f2530f, iVar2.f2532i);
                    if (this.f2491v != null && this.f2485b.c(this.f2491v.f4329c.b()) != null) {
                        this.f2491v.f4329c.f(this.f2485b.f2536o, this);
                        z8 = true;
                    }
                }
                return z8;
            }
            int i10 = this.f2487d + 1;
            this.f2487d = i10;
            if (i10 >= list2.size()) {
                int i11 = this.f2486c + 1;
                this.f2486c = i11;
                if (i11 >= a9.size()) {
                    return false;
                }
                this.f2487d = 0;
            }
            A3.h hVar = (A3.h) a9.get(this.f2486c);
            Class cls5 = (Class) list2.get(this.f2487d);
            A3.p e2 = this.f2485b.e(cls5);
            i iVar3 = this.f2485b;
            this.f2493x = new C(iVar3.f2527c.f14625a, hVar, iVar3.f2535n, iVar3.f2529e, iVar3.f2530f, e2, cls5, iVar3.f2532i);
            File e10 = iVar3.f2531h.a().e(this.f2493x);
            this.f2492w = e10;
            if (e10 != null) {
                this.f2488e = hVar;
                this.f2489f = this.f2485b.f2527c.a().f(e10);
                this.f2490u = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void c(Exception exc) {
        this.f2484a.b(this.f2493x, exc, this.f2491v.f4329c, A3.a.f345d);
    }

    @Override // C3.h
    public final void cancel() {
        G3.r rVar = this.f2491v;
        if (rVar != null) {
            rVar.f4329c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(Object obj) {
        this.f2484a.d(this.f2488e, obj, this.f2491v.f4329c, A3.a.f345d, this.f2493x);
    }
}
