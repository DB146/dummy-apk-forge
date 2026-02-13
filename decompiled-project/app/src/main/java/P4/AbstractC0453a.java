package P4;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m4.C1558a0;
import m4.L0;
import m5.C1620q;
import n5.AbstractC1705a;
import r4.C1940l;
import r4.C1941m;

/* renamed from: P4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0453a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7978a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f7979b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final A4.s f7980c = new A4.s(new CopyOnWriteArrayList(), 0, (B) null);

    /* renamed from: d, reason: collision with root package name */
    public final C1941m f7981d = new C1941m(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: e, reason: collision with root package name */
    public Looper f7982e;

    /* renamed from: f, reason: collision with root package name */
    public L0 f7983f;

    /* renamed from: u, reason: collision with root package name */
    public n4.l f7984u;

    public final A4.s a(B b2) {
        return new A4.s((CopyOnWriteArrayList) this.f7980c.f472c, 0, b2);
    }

    public abstract InterfaceC0476y b(B b2, C1620q c1620q, long j);

    public final void c(C c10) {
        HashSet hashSet = this.f7979b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(c10);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public void d() {
    }

    public final void f(C c10) {
        this.f7982e.getClass();
        HashSet hashSet = this.f7979b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(c10);
        if (isEmpty) {
            g();
        }
    }

    public void g() {
    }

    public L0 h() {
        return null;
    }

    public abstract C1558a0 i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(C c10, m5.T t5, n4.l lVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f7982e;
        AbstractC1705a.h(looper == null || looper == myLooper);
        this.f7984u = lVar;
        L0 l02 = this.f7983f;
        this.f7978a.add(c10);
        if (this.f7982e == null) {
            this.f7982e = myLooper;
            this.f7979b.add(c10);
            n(t5);
        } else if (l02 != null) {
            f(c10);
            c10.a(this, l02);
        }
    }

    public abstract void n(m5.T t5);

    public final void o(L0 l02) {
        this.f7983f = l02;
        Iterator it = this.f7978a.iterator();
        while (it.hasNext()) {
            ((C) it.next()).a(this, l02);
        }
    }

    public abstract void p(InterfaceC0476y interfaceC0476y);

    public final void q(C c10) {
        ArrayList arrayList = this.f7978a;
        arrayList.remove(c10);
        if (!arrayList.isEmpty()) {
            c(c10);
            return;
        }
        this.f7982e = null;
        this.f7983f = null;
        this.f7984u = null;
        this.f7979b.clear();
        r();
    }

    public abstract void r();

    public final void s(r4.n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7981d.f23773c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C1940l c1940l = (C1940l) it.next();
            if (c1940l.f23770b == nVar) {
                copyOnWriteArrayList.remove(c1940l);
            }
        }
    }

    public final void u(I i7) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f7980c.f472c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            H h10 = (H) it.next();
            if (h10.f7867b == i7) {
                copyOnWriteArrayList.remove(h10);
            }
        }
    }
}
