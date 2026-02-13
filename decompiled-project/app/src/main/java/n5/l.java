package n5;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final x f21182a;

    /* renamed from: b, reason: collision with root package name */
    public final z f21183b;

    /* renamed from: c, reason: collision with root package name */
    public final j f21184c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f21185d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f21186e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f21187f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21188h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f21189i;

    public l(Looper looper, x xVar, j jVar) {
        this(new CopyOnWriteArraySet(), looper, xVar, jVar, true);
    }

    public l(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, x xVar, j jVar, boolean z8) {
        this.f21182a = xVar;
        this.f21185d = copyOnWriteArraySet;
        this.f21184c = jVar;
        this.g = new Object();
        this.f21186e = new ArrayDeque();
        this.f21187f = new ArrayDeque();
        this.f21183b = xVar.a(looper, new h(this, 0));
        this.f21189i = z8;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.f21188h) {
                    return;
                }
                this.f21185d.add(new k(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f21187f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        z zVar = this.f21183b;
        if (!zVar.f21238a.hasMessages(0)) {
            zVar.getClass();
            y b2 = z.b();
            b2.f21236a = zVar.f21238a.obtainMessage(0);
            zVar.getClass();
            Message message = b2.f21236a;
            message.getClass();
            zVar.f21238a.sendMessageAtFrontOfQueue(message);
            b2.a();
        }
        ArrayDeque arrayDeque2 = this.f21186e;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i7, i iVar) {
        f();
        this.f21187f.add(new F2.a(new CopyOnWriteArraySet(this.f21185d), i7, iVar, 4));
    }

    public final void d() {
        f();
        synchronized (this.g) {
            this.f21188h = true;
        }
        Iterator it = this.f21185d.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            j jVar = this.f21184c;
            kVar.f21181d = true;
            if (kVar.f21180c) {
                kVar.f21180c = false;
                jVar.d(kVar.f21178a, kVar.f21179b.d());
            }
        }
        this.f21185d.clear();
    }

    public final void e(int i7, i iVar) {
        c(i7, iVar);
        b();
    }

    public final void f() {
        if (this.f21189i) {
            AbstractC1705a.m(Thread.currentThread() == this.f21183b.f21238a.getLooper().getThread());
        }
    }
}
