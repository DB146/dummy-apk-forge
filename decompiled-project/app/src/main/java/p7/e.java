package p7;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import e8.InterfaceC1099b;
import e8.InterfaceC1100c;
import j8.InterfaceC1387b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e implements InterfaceC1858b {

    /* renamed from: h, reason: collision with root package name */
    public static final d f23125h = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23126a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f23127b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f23128c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f23129d;

    /* renamed from: e, reason: collision with root package name */
    public final j f23130e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f23131f;
    public final U9.j g;

    public e(ArrayList arrayList, ArrayList arrayList2, U9.j jVar) {
        int i7 = 1;
        q7.k kVar = q7.k.f23543a;
        this.f23126a = new HashMap();
        this.f23127b = new HashMap();
        this.f23128c = new HashMap();
        this.f23129d = new HashSet();
        this.f23131f = new AtomicReference();
        j jVar2 = new j();
        this.f23130e = jVar2;
        this.g = jVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C1857a.c(jVar2, j.class, InterfaceC1100c.class, InterfaceC1099b.class));
        arrayList3.add(C1857a.c(this, e.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C1857a c1857a = (C1857a) it.next();
            if (c1857a != null) {
                arrayList3.add(c1857a);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC1387b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.g.n(componentRegistrar));
                        it3.remove();
                    }
                } catch (k e2) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((C1857a) it4.next()).f23119b.toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f23129d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f23129d.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f23126a.isEmpty()) {
                c2.q.h(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f23126a.keySet());
                arrayList6.addAll(arrayList3);
                c2.q.h(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                C1857a c1857a2 = (C1857a) it5.next();
                this.f23126a.put(c1857a2, new l(new Y6.d(i7, this, c1857a2)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f23131f.get();
        if (bool != null) {
            i(this.f23126a, bool.booleanValue());
        }
    }

    @Override // p7.InterfaceC1858b
    public final synchronized InterfaceC1387b c(p pVar) {
        m mVar = (m) this.f23128c.get(pVar);
        if (mVar != null) {
            return mVar;
        }
        return f23125h;
    }

    @Override // p7.InterfaceC1858b
    public final n e(p pVar) {
        InterfaceC1387b h10 = h(pVar);
        return h10 == null ? new n(n.f23148c, n.f23149d) : h10 instanceof n ? (n) h10 : new n(null, h10);
    }

    @Override // p7.InterfaceC1858b
    public final synchronized InterfaceC1387b h(p pVar) {
        c2.i.e(pVar, "Null interface requested.");
        return (InterfaceC1387b) this.f23127b.get(pVar);
    }

    public final void i(HashMap hashMap, boolean z8) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            C1857a c1857a = (C1857a) entry.getKey();
            InterfaceC1387b interfaceC1387b = (InterfaceC1387b) entry.getValue();
            int i7 = c1857a.f23121d;
            if (i7 == 1 || (i7 == 2 && z8)) {
                interfaceC1387b.get();
            }
        }
        j jVar = this.f23130e;
        synchronized (jVar) {
            arrayDeque = jVar.f23141b;
            if (arrayDeque != null) {
                jVar.f23141b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw h3.o.j(it);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [p7.m, java.lang.Object] */
    public final void j() {
        for (C1857a c1857a : this.f23126a.keySet()) {
            for (h hVar : c1857a.f23120c) {
                boolean z8 = hVar.f23138b == 2;
                p pVar = hVar.f23137a;
                if (z8) {
                    HashMap hashMap = this.f23128c;
                    if (!hashMap.containsKey(pVar)) {
                        Set emptySet = Collections.emptySet();
                        ?? obj = new Object();
                        obj.f23147b = null;
                        obj.f23146a = Collections.newSetFromMap(new ConcurrentHashMap());
                        obj.f23146a.addAll(emptySet);
                        hashMap.put(pVar, obj);
                    }
                }
                HashMap hashMap2 = this.f23127b;
                if (hashMap2.containsKey(pVar)) {
                    continue;
                } else {
                    int i7 = hVar.f23138b;
                    if (i7 == 1) {
                        throw new Db.d("Unsatisfied dependency for component " + c1857a + ": " + pVar, 12);
                    }
                    if (i7 != 2) {
                        hashMap2.put(pVar, new n(n.f23148c, n.f23149d));
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1857a c1857a = (C1857a) it.next();
            if (c1857a.f23122e == 0) {
                InterfaceC1387b interfaceC1387b = (InterfaceC1387b) this.f23126a.get(c1857a);
                for (p pVar : c1857a.f23119b) {
                    HashMap hashMap = this.f23127b;
                    if (hashMap.containsKey(pVar)) {
                        arrayList2.add(new p5.j(1, (n) ((InterfaceC1387b) hashMap.get(pVar)), interfaceC1387b));
                    } else {
                        hashMap.put(pVar, interfaceC1387b);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [p7.m, java.lang.Object] */
    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f23126a.entrySet()) {
            C1857a c1857a = (C1857a) entry.getKey();
            if (c1857a.f23122e != 0) {
                InterfaceC1387b interfaceC1387b = (InterfaceC1387b) entry.getValue();
                for (p pVar : c1857a.f23119b) {
                    if (!hashMap.containsKey(pVar)) {
                        hashMap.put(pVar, new HashSet());
                    }
                    ((Set) hashMap.get(pVar)).add(interfaceC1387b);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f23128c;
            if (hashMap2.containsKey(key)) {
                m mVar = (m) hashMap2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new p5.j(2, mVar, (InterfaceC1387b) it.next()));
                }
            } else {
                p pVar2 = (p) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                ?? obj = new Object();
                obj.f23147b = null;
                obj.f23146a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f23146a.addAll(set);
                hashMap2.put(pVar2, obj);
            }
        }
        return arrayList;
    }
}
