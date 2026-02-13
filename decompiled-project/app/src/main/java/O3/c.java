package O3;

import A9.O0;
import Db.j;
import Eb.n;
import Eb.o;
import M1.C0405u;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import fc.InterfaceC1161h;
import fc.Q;
import h3.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import m3.f;
import n3.C1699d;
import n3.C1701f;
import n3.C1702g;
import n3.InterfaceC1700e;
import o3.C1781a;
import o3.e;
import q3.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7466a;

    public c(int i7) {
        this.f7466a = new ArrayList(i7);
    }

    public c(int i7, boolean z8) {
        switch (i7) {
            case 1:
                this.f7466a = new ArrayList();
                return;
            default:
                this.f7466a = new ArrayList();
                return;
        }
    }

    public c(O0 trackers) {
        f fVar;
        l.e(trackers, "trackers");
        C1699d c1699d = new C1699d((e) trackers.f923b, 0);
        C1699d c1699d2 = new C1699d((C1781a) trackers.f924c);
        C1699d c1699d3 = new C1699d((e) trackers.f926e, 4);
        e eVar = (e) trackers.f925d;
        C1699d c1699d4 = new C1699d(eVar, 2);
        C1699d c1699d5 = new C1699d(eVar, 3);
        C1702g c1702g = new C1702g(eVar);
        C1701f c1701f = new C1701f(eVar);
        if (Build.VERSION.SDK_INT >= 28) {
            String str = m3.l.f19799a;
            Context context = (Context) trackers.f922a;
            l.e(context, "context");
            Object systemService = context.getSystemService("connectivity");
            l.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            fVar = new f((ConnectivityManager) systemService);
        } else {
            fVar = null;
        }
        this.f7466a = n.X(new InterfaceC1700e[]{c1699d, c1699d2, c1699d3, c1699d4, c1699d5, c1702g, c1701f, fVar});
    }

    public void a(j jVar) {
        this.f7466a.add(jVar);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z8 = obj instanceof Object[];
        ArrayList arrayList = this.f7466a;
        if (z8) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public boolean c(p pVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7466a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC1700e) next).c(pVar)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            z.e().a(m3.l.f19799a, "Work " + pVar.f23403a + " constrained by " + o.d0(arrayList, null, null, null, m3.j.f19794a, 31));
        }
        return arrayList.isEmpty();
    }

    public synchronized ArrayList d(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f7466a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if ((bVar.f7463a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f7464b)) && !arrayList.contains(bVar.f7464b)) {
                arrayList.add(bVar.f7464b);
            }
        }
        return arrayList;
    }

    public InterfaceC1161h e(p spec) {
        l.e(spec, "spec");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7466a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC1700e) next).b(spec)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(Eb.p.S(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((InterfaceC1700e) it2.next()).a(spec.j));
        }
        return Q.h(new C0405u((InterfaceC1161h[]) o.s0(arrayList2).toArray(new InterfaceC1161h[0]), 3));
    }
}
