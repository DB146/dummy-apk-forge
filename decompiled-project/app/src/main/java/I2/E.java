package I2;

import B0.C0200s;
import K2.InterfaceC0380b;
import a.AbstractC0672a;
import android.content.Intent;
import android.os.Looper;
import hc.C1277e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public C1277e f5026a;

    /* renamed from: b, reason: collision with root package name */
    public Hb.i f5027b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f5028c;

    /* renamed from: d, reason: collision with root package name */
    public K f5029d;

    /* renamed from: e, reason: collision with root package name */
    public A f5030e;

    /* renamed from: f, reason: collision with root package name */
    public C0323l f5031f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5032h;
    public final q3.s g = new q3.s(new C0200s(0, this, E.class, "onClosed", "onClosed()V", 0, 3));

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f5033i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k = true;

    public final void a() {
        if (this.f5032h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (p() && !q() && this.f5033i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        U2.a N10 = j().N();
        if (!N10.u()) {
            Y6.b.v(new C0322k(i(), null));
        }
        if (N10.z()) {
            N10.D();
        } else {
            N10.i();
        }
    }

    public List d(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Eb.B.F(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(c2.i.q((Yb.c) entry.getKey()), entry.getValue());
        }
        return h(linkedHashMap2);
    }

    public abstract C0323l e();

    public H2.E f() {
        throw new Db.i();
    }

    public U2.d g(C0313b config) {
        kotlin.jvm.internal.l.e(config, "config");
        throw new Db.i();
    }

    public List h(LinkedHashMap linkedHashMap) {
        return Eb.v.f3891a;
    }

    public final C0323l i() {
        C0323l c0323l = this.f5031f;
        if (c0323l != null) {
            return c0323l;
        }
        kotlin.jvm.internal.l.j("internalTracker");
        throw null;
    }

    public final U2.d j() {
        A a9 = this.f5030e;
        if (a9 == null) {
            kotlin.jvm.internal.l.j("connectionManager");
            throw null;
        }
        U2.d c10 = a9.c();
        if (c10 != null) {
            return c10;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final Hb.i k() {
        C1277e c1277e = this.f5026a;
        if (c1277e != null) {
            return c1277e.f17939a;
        }
        kotlin.jvm.internal.l.j("coroutineScope");
        throw null;
    }

    public Set l() {
        Set<Class> m10 = m();
        ArrayList arrayList = new ArrayList(Eb.p.S(m10, 10));
        for (Class cls : m10) {
            kotlin.jvm.internal.l.e(cls, "<this>");
            arrayList.add(kotlin.jvm.internal.w.a(cls));
        }
        return Eb.o.w0(arrayList);
    }

    public Set m() {
        return Eb.x.f3893a;
    }

    public LinkedHashMap n() {
        Set<Map.Entry> entrySet = o().entrySet();
        int F10 = Eb.B.F(Eb.p.S(entrySet, 10));
        if (F10 < 16) {
            F10 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F10);
        for (Map.Entry entry : entrySet) {
            Class cls = (Class) entry.getKey();
            List<Class> list = (List) entry.getValue();
            kotlin.jvm.internal.l.e(cls, "<this>");
            kotlin.jvm.internal.e a9 = kotlin.jvm.internal.w.a(cls);
            ArrayList arrayList = new ArrayList(Eb.p.S(list, 10));
            for (Class cls2 : list) {
                kotlin.jvm.internal.l.e(cls2, "<this>");
                arrayList.add(kotlin.jvm.internal.w.a(cls2));
            }
            linkedHashMap.put(a9, arrayList);
        }
        return linkedHashMap;
    }

    public Map o() {
        return Eb.w.f3892a;
    }

    public final boolean p() {
        A a9 = this.f5030e;
        if (a9 != null) {
            return a9.c() != null;
        }
        kotlin.jvm.internal.l.j("connectionManager");
        throw null;
    }

    public final boolean q() {
        return t() && j().N().u();
    }

    public final void r() {
        j().N().h();
        if (q()) {
            return;
        }
        C0323l i7 = i();
        i7.f5170c.e(i7.f5173f, i7.g);
    }

    public final void s(T2.a connection) {
        kotlin.jvm.internal.l.e(connection, "connection");
        C0323l i7 = i();
        c0 c0Var = i7.f5170c;
        c0Var.getClass();
        T2.c R10 = connection.R("PRAGMA query_only");
        try {
            R10.J();
            boolean A10 = R10.A();
            Tb.a.g(R10, null);
            if (!A10) {
                AbstractC0672a.h(connection, "PRAGMA temp_store = MEMORY");
                AbstractC0672a.h(connection, "PRAGMA recursive_triggers = 1");
                AbstractC0672a.h(connection, "DROP TABLE IF EXISTS room_table_modification_log");
                if (c0Var.f5154d) {
                    AbstractC0672a.h(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    AbstractC0672a.h(connection, ac.n.W("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                C0330t c0330t = c0Var.f5157h;
                ReentrantLock reentrantLock = (ReentrantLock) c0330t.f5200b;
                reentrantLock.lock();
                try {
                    c0330t.f5199a = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (i7.j) {
                try {
                    C0327p c0327p = i7.f5175i;
                    if (c0327p != null) {
                        Intent intent = i7.f5174h;
                        if (intent == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        c0327p.a(intent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
        }
    }

    public final boolean t() {
        A a9 = this.f5030e;
        if (a9 == null) {
            kotlin.jvm.internal.l.j("connectionManager");
            throw null;
        }
        U2.a aVar = (U2.a) a9.f5006h;
        if (aVar != null) {
            return aVar.isOpen();
        }
        return false;
    }

    public final Object u(Rb.a aVar) {
        if (!p()) {
            Ba.o oVar = new Ba.o(aVar, 13);
            a();
            b();
            return Y6.b.v(new P2.c(this, oVar, null));
        }
        c();
        try {
            Object invoke = aVar.invoke();
            v();
            return invoke;
        } finally {
            r();
        }
    }

    public final void v() {
        j().N().C();
    }

    public final Object w(boolean z8, Rb.e eVar, Jb.c cVar) {
        A a9 = this.f5030e;
        if (a9 != null) {
            return ((InterfaceC0380b) a9.g).w(z8, eVar, cVar);
        }
        kotlin.jvm.internal.l.j("connectionManager");
        throw null;
    }
}
