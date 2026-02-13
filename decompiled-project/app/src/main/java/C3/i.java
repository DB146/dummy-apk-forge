package C3;

import androidx.datastore.preferences.protobuf.b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2525a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2526b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.f f2527c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2528d;

    /* renamed from: e, reason: collision with root package name */
    public int f2529e;

    /* renamed from: f, reason: collision with root package name */
    public int f2530f;
    public Class g;

    /* renamed from: h, reason: collision with root package name */
    public F5.i f2531h;

    /* renamed from: i, reason: collision with root package name */
    public A3.l f2532i;
    public W3.c j;
    public Class k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2533l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2534m;

    /* renamed from: n, reason: collision with root package name */
    public A3.h f2535n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.g f2536o;

    /* renamed from: p, reason: collision with root package name */
    public m f2537p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2538q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2539r;

    public final ArrayList a() {
        boolean z8 = this.f2534m;
        ArrayList arrayList = this.f2526b;
        if (!z8) {
            this.f2534m = true;
            arrayList.clear();
            ArrayList b2 = b();
            int size = b2.size();
            for (int i7 = 0; i7 < size; i7++) {
                G3.r rVar = (G3.r) b2.get(i7);
                if (!arrayList.contains(rVar.f4327a)) {
                    arrayList.add(rVar.f4327a);
                }
                int i10 = 0;
                while (true) {
                    List list = rVar.f4328b;
                    if (i10 < list.size()) {
                        if (!arrayList.contains(list.get(i10))) {
                            arrayList.add((A3.h) list.get(i10));
                        }
                        i10++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z8 = this.f2533l;
        ArrayList arrayList = this.f2525a;
        if (!z8) {
            this.f2533l = true;
            arrayList.clear();
            List f4 = this.f2527c.a().f(this.f2528d);
            int size = f4.size();
            for (int i7 = 0; i7 < size; i7++) {
                G3.r a9 = ((G3.s) f4.get(i7)).a(this.f2528d, this.f2529e, this.f2530f, this.f2532i);
                if (a9 != null) {
                    arrayList.add(a9);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y c(Class cls) {
        y yVar;
        ArrayList arrayList;
        O3.a aVar;
        com.bumptech.glide.i a9 = this.f2527c.a();
        Class cls2 = this.g;
        Class cls3 = this.k;
        R3.b bVar = a9.f14645i;
        W3.m mVar = (W3.m) bVar.f8839b.getAndSet(null);
        W3.m mVar2 = mVar;
        if (mVar == null) {
            mVar2 = new Object();
        }
        mVar2.f10615a = cls;
        mVar2.f10616b = cls2;
        mVar2.f10617c = cls3;
        synchronized (bVar.f8838a) {
            yVar = (y) bVar.f8838a.get(mVar2);
        }
        bVar.f8839b.set(mVar2);
        a9.f14645i.getClass();
        if (R3.b.f8837c.equals(yVar)) {
            return null;
        }
        if (yVar != null) {
            return yVar;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = a9.f14640c.A(cls, cls2).iterator();
        while (it.hasNext()) {
            Class<?> cls4 = (Class) it.next();
            Iterator it2 = a9.f14643f.d(cls4, cls3).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                q3.l lVar = a9.f14640c;
                synchronized (lVar) {
                    arrayList = new ArrayList();
                    Iterator it3 = ((ArrayList) lVar.f23391b).iterator();
                    while (it3.hasNext()) {
                        List<R3.c> list = (List) ((HashMap) lVar.f23392c).get((String) it3.next());
                        if (list != null) {
                            for (R3.c cVar : list) {
                                if (cVar.f8840a.isAssignableFrom(cls) && cls4.isAssignableFrom(cVar.f8841b)) {
                                    arrayList.add(cVar.f8842c);
                                }
                            }
                        }
                    }
                }
                O3.c cVar2 = a9.f14643f;
                synchronized (cVar2) {
                    if (!cls5.isAssignableFrom(cls4)) {
                        Iterator it4 = cVar2.f7466a.iterator();
                        while (it4.hasNext()) {
                            O3.b bVar2 = (O3.b) it4.next();
                            if (bVar2.f7463a.isAssignableFrom(cls4) && cls5.isAssignableFrom(bVar2.f7464b)) {
                                aVar = bVar2.f7465c;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                    }
                    aVar = O3.d.f7467b;
                }
                arrayList2.add(new l(cls, cls4, cls5, arrayList, aVar, a9.j));
            }
        }
        y yVar2 = arrayList2.isEmpty() ? null : new y(cls, cls2, cls3, arrayList2, a9.j);
        R3.b bVar3 = a9.f14645i;
        synchronized (bVar3.f8838a) {
            bVar3.f8838a.put(new W3.m(cls, cls2, cls3), yVar2 != null ? yVar2 : R3.b.f8837c);
        }
        return yVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r1 = r3.f8836b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final A3.d d(Object obj) {
        A3.d dVar;
        O7.e eVar = this.f2527c.a().f14639b;
        Class<?> cls = obj.getClass();
        synchronized (eVar) {
            Iterator it = eVar.f7492a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                R3.a aVar = (R3.a) it.next();
                if (aVar.f8835a.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (dVar != null) {
            return dVar;
        }
        throw new RuntimeException("Failed to find source encoder for data class: " + obj.getClass());
    }

    public final A3.p e(Class cls) {
        A3.p pVar = (A3.p) this.j.get(cls);
        if (pVar == null) {
            Iterator it = ((b0) this.j.entrySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    pVar = (A3.p) entry.getValue();
                    break;
                }
            }
        }
        if (pVar != null) {
            return pVar;
        }
        if (!this.j.isEmpty() || !this.f2538q) {
            return I3.c.f5219b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
