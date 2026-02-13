package P4;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m4.L0;
import n5.AbstractC1705a;
import r4.C1941m;

/* renamed from: P4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0462j extends AbstractC0453a {

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f8066v = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public Handler f8067w;

    /* renamed from: x, reason: collision with root package name */
    public m5.T f8068x;

    @Override // P4.AbstractC0453a
    public final void d() {
        for (C0461i c0461i : this.f8066v.values()) {
            c0461i.f8060a.c(c0461i.f8061b);
        }
    }

    @Override // P4.AbstractC0453a
    public final void g() {
        for (C0461i c0461i : this.f8066v.values()) {
            c0461i.f8060a.f(c0461i.f8061b);
        }
    }

    @Override // P4.AbstractC0453a
    public void k() {
        Iterator it = this.f8066v.values().iterator();
        while (it.hasNext()) {
            ((C0461i) it.next()).f8060a.k();
        }
    }

    @Override // P4.AbstractC0453a
    public void r() {
        HashMap hashMap = this.f8066v;
        for (C0461i c0461i : hashMap.values()) {
            c0461i.f8060a.q(c0461i.f8061b);
            q3.i iVar = c0461i.f8062c;
            AbstractC0453a abstractC0453a = c0461i.f8060a;
            abstractC0453a.u(iVar);
            abstractC0453a.s(iVar);
        }
        hashMap.clear();
    }

    public abstract B v(Object obj, B b2);

    public long w(Object obj, long j) {
        return j;
    }

    public int x(int i7, Object obj) {
        return i7;
    }

    public abstract void y(Object obj, AbstractC0453a abstractC0453a, L0 l02);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [P4.h, P4.C] */
    /* JADX WARN: Type inference failed for: r2v0, types: [q3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, P4.H] */
    /* JADX WARN: Type inference failed for: r3v3, types: [r4.l, java.lang.Object] */
    public final void z(final Object obj, AbstractC0453a abstractC0453a) {
        HashMap hashMap = this.f8066v;
        AbstractC1705a.h(!hashMap.containsKey(obj));
        ?? r12 = new C() { // from class: P4.h
            @Override // P4.C
            public final void a(AbstractC0453a abstractC0453a2, L0 l02) {
                AbstractC0462j.this.y(obj, abstractC0453a2, l02);
            }
        };
        ?? obj2 = new Object();
        obj2.f23385d = this;
        obj2.f23383b = a(null);
        obj2.f23384c = new C1941m(this.f7981d.f23773c, 0, null);
        obj2.f23382a = obj;
        hashMap.put(obj, new C0461i(abstractC0453a, r12, obj2));
        Handler handler = this.f8067w;
        handler.getClass();
        abstractC0453a.getClass();
        A4.s sVar = abstractC0453a.f7980c;
        sVar.getClass();
        ?? obj3 = new Object();
        obj3.f7866a = handler;
        obj3.f7867b = obj2;
        ((CopyOnWriteArrayList) sVar.f472c).add(obj3);
        Handler handler2 = this.f8067w;
        handler2.getClass();
        C1941m c1941m = abstractC0453a.f7981d;
        c1941m.getClass();
        ?? obj4 = new Object();
        obj4.f23769a = handler2;
        obj4.f23770b = obj2;
        c1941m.f23773c.add(obj4);
        m5.T t5 = this.f8068x;
        n4.l lVar = this.f7984u;
        AbstractC1705a.n(lVar);
        abstractC0453a.l(r12, t5, lVar);
        if (this.f7979b.isEmpty()) {
            abstractC0453a.c(r12);
        }
    }
}
