package com.bumptech.glide;

import A3.o;
import G3.s;
import G3.t;
import G3.u;
import G3.v;
import G3.x;
import G3.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import x1.C2258b;
import y6.C2399e;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final v f14638a;

    /* renamed from: b, reason: collision with root package name */
    public final O7.e f14639b;

    /* renamed from: c, reason: collision with root package name */
    public final q3.l f14640c;

    /* renamed from: d, reason: collision with root package name */
    public final R3.e f14641d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.h f14642e;

    /* renamed from: f, reason: collision with root package name */
    public final O3.c f14643f;
    public final O3.c g;

    /* renamed from: h, reason: collision with root package name */
    public final q3.e f14644h = new q3.e(19);

    /* renamed from: i, reason: collision with root package name */
    public final R3.b f14645i = new R3.b();
    public final Q7.h j;

    public i() {
        Q7.h hVar = new Q7.h(new C2258b(20), new C2399e(16), new Hc.e(17));
        this.j = hVar;
        this.f14638a = new v(hVar);
        this.f14639b = new O7.e();
        this.f14640c = new q3.l(20);
        this.f14641d = new R3.e(0);
        this.f14642e = new com.bumptech.glide.load.data.h();
        this.f14643f = new O3.c(0, false);
        this.g = new O3.c(1, false);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        q3.l lVar = this.f14640c;
        synchronized (lVar) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) lVar.f23391b);
                ((ArrayList) lVar.f23391b).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) lVar.f23391b).add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        ((ArrayList) lVar.f23391b).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, A3.d dVar) {
        O7.e eVar = this.f14639b;
        synchronized (eVar) {
            eVar.f7492a.add(new R3.a(cls, dVar));
        }
    }

    public final void b(Class cls, o oVar) {
        R3.e eVar = this.f14641d;
        synchronized (eVar) {
            eVar.f8845a.add(new R3.d(cls, oVar));
        }
    }

    public final void c(Class cls, Class cls2, t tVar) {
        v vVar = this.f14638a;
        synchronized (vVar) {
            y yVar = vVar.f4331a;
            synchronized (yVar) {
                try {
                    x xVar = new x(cls, cls2, tVar);
                    ArrayList arrayList = yVar.f4345a;
                    arrayList.add(arrayList.size(), xVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            vVar.f4332b.f2640a.clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, A3.n nVar) {
        q3.l lVar = this.f14640c;
        synchronized (lVar) {
            lVar.z(str).add(new R3.c(cls, cls2, nVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        O3.c cVar = this.g;
        synchronized (cVar) {
            arrayList = cVar.f7466a;
        }
        if (arrayList.isEmpty()) {
            throw new RuntimeException("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List f(Object obj) {
        List list;
        v vVar = this.f14638a;
        vVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (vVar) {
            u uVar = (u) vVar.f4332b.f2640a.get(cls);
            list = uVar == null ? null : uVar.f4330a;
            if (list == null) {
                list = Collections.unmodifiableList(vVar.f4331a.b(cls));
                if (((u) vVar.f4332b.f2640a.put(cls, new u(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (list.isEmpty()) {
            throw new RuntimeException("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = list.size();
        List emptyList = Collections.emptyList();
        boolean z8 = true;
        for (int i7 = 0; i7 < size; i7++) {
            s sVar = (s) list.get(i7);
            if (sVar.b(obj)) {
                if (z8) {
                    emptyList = new ArrayList(size - i7);
                    z8 = false;
                }
                emptyList.add(sVar);
            }
        }
        if (!emptyList.isEmpty()) {
            return emptyList;
        }
        throw new RuntimeException("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
    }

    public final com.bumptech.glide.load.data.g g(Object obj) {
        com.bumptech.glide.load.data.g a9;
        com.bumptech.glide.load.data.h hVar = this.f14642e;
        synchronized (hVar) {
            try {
                W3.g.b(obj);
                com.bumptech.glide.load.data.f fVar = (com.bumptech.glide.load.data.f) ((HashMap) hVar.f14680b).get(obj.getClass());
                if (fVar == null) {
                    Iterator it = ((HashMap) hVar.f14680b).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.bumptech.glide.load.data.f fVar2 = (com.bumptech.glide.load.data.f) it.next();
                        if (fVar2.b().isAssignableFrom(obj.getClass())) {
                            fVar = fVar2;
                            break;
                        }
                    }
                }
                if (fVar == null) {
                    fVar = com.bumptech.glide.load.data.h.f14678c;
                }
                a9 = fVar.a(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return a9;
    }

    public final void h(com.bumptech.glide.load.data.f fVar) {
        com.bumptech.glide.load.data.h hVar = this.f14642e;
        synchronized (hVar) {
            ((HashMap) hVar.f14680b).put(fVar.b(), fVar);
        }
    }

    public final void i(Class cls, Class cls2, O3.a aVar) {
        O3.c cVar = this.f14643f;
        synchronized (cVar) {
            cVar.f7466a.add(new O3.b(cls, cls2, aVar));
        }
    }
}
