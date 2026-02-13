package r4;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: r4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1941m {

    /* renamed from: a, reason: collision with root package name */
    public final int f23771a;

    /* renamed from: b, reason: collision with root package name */
    public final P4.B f23772b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f23773c;

    public C1941m(CopyOnWriteArrayList copyOnWriteArrayList, int i7, P4.B b2) {
        this.f23773c = copyOnWriteArrayList;
        this.f23771a = i7;
        this.f23772b = b2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [r4.n, java.lang.Object] */
    public final void a() {
        Iterator it = this.f23773c.iterator();
        while (it.hasNext()) {
            C1940l c1940l = (C1940l) it.next();
            n5.D.Q(c1940l.f23769a, new RunnableC1939k(this, c1940l.f23770b, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [r4.n, java.lang.Object] */
    public final void b() {
        Iterator it = this.f23773c.iterator();
        while (it.hasNext()) {
            C1940l c1940l = (C1940l) it.next();
            n5.D.Q(c1940l.f23769a, new RunnableC1939k(this, c1940l.f23770b, 1));
        }
    }

    public final void c(int i7) {
        Iterator it = this.f23773c.iterator();
        while (it.hasNext()) {
            C1940l c1940l = (C1940l) it.next();
            n5.D.Q(c1940l.f23769a, new F2.a(this, c1940l.f23770b, i7, 5));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f23773c.iterator();
        while (it.hasNext()) {
            C1940l c1940l = (C1940l) it.next();
            n5.D.Q(c1940l.f23769a, new P4.G(this, c1940l.f23770b, exc, 11));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [r4.n, java.lang.Object] */
    public final void e() {
        Iterator it = this.f23773c.iterator();
        while (it.hasNext()) {
            C1940l c1940l = (C1940l) it.next();
            n5.D.Q(c1940l.f23769a, new RunnableC1939k(this, c1940l.f23770b, 0));
        }
    }
}
