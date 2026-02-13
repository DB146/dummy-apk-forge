package b5;

import a5.k;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import n5.AbstractC1705a;
import n5.D;

/* loaded from: classes.dex */
public abstract class i implements a5.h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f13968a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f13969b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue f13970c;

    /* renamed from: d, reason: collision with root package name */
    public h f13971d;

    /* renamed from: e, reason: collision with root package name */
    public long f13972e;

    /* renamed from: f, reason: collision with root package name */
    public long f13973f;

    public i() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f13968a.add(new q4.g(1));
        }
        this.f13969b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.f13969b;
            Q9.a aVar = new Q9.a(this, 10);
            a5.d dVar = new a5.d();
            dVar.f12748u = aVar;
            arrayDeque.add(dVar);
        }
        this.f13970c = new PriorityQueue();
    }

    @Override // q4.c
    public final void a(k kVar) {
        AbstractC1705a.h(kVar == this.f13971d);
        h hVar = (h) kVar;
        if (hVar.i(Integer.MIN_VALUE)) {
            hVar.G();
            this.f13968a.add(hVar);
        } else {
            long j = this.f13973f;
            this.f13973f = 1 + j;
            hVar.f13967x = j;
            this.f13970c.add(hVar);
        }
        this.f13971d = null;
    }

    public abstract j b();

    public abstract void c(h hVar);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return null;
     */
    @Override // q4.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a5.d f() {
        ArrayDeque arrayDeque = this.f13969b;
        if (!arrayDeque.isEmpty()) {
            while (true) {
                PriorityQueue priorityQueue = this.f13970c;
                if (!priorityQueue.isEmpty()) {
                    h hVar = (h) priorityQueue.peek();
                    int i7 = D.f21141a;
                    if (hVar.f23460f > this.f13972e) {
                        break;
                    }
                    h hVar2 = (h) priorityQueue.poll();
                    boolean i10 = hVar2.i(4);
                    ArrayDeque arrayDeque2 = this.f13968a;
                    if (i10) {
                        a5.d dVar = (a5.d) arrayDeque.pollFirst();
                        dVar.a(4);
                        hVar2.G();
                        arrayDeque2.add(hVar2);
                        return dVar;
                    }
                    c(hVar2);
                    if (g()) {
                        j b2 = b();
                        a5.d dVar2 = (a5.d) arrayDeque.pollFirst();
                        dVar2.H(hVar2.f23460f, b2, Long.MAX_VALUE);
                        hVar2.G();
                        arrayDeque2.add(hVar2);
                        return dVar2;
                    }
                    hVar2.G();
                    arrayDeque2.add(hVar2);
                } else {
                    break;
                }
            }
        } else {
            return null;
        }
    }

    @Override // a5.h
    public final void e(long j) {
        this.f13972e = j;
    }

    @Override // q4.c
    public void flush() {
        ArrayDeque arrayDeque;
        this.f13973f = 0L;
        this.f13972e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f13970c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f13968a;
            if (isEmpty) {
                break;
            }
            h hVar = (h) priorityQueue.poll();
            int i7 = D.f21141a;
            hVar.G();
            arrayDeque.add(hVar);
        }
        h hVar2 = this.f13971d;
        if (hVar2 != null) {
            hVar2.G();
            arrayDeque.add(hVar2);
            this.f13971d = null;
        }
    }

    public abstract boolean g();

    @Override // q4.c
    public final Object h() {
        AbstractC1705a.m(this.f13971d == null);
        ArrayDeque arrayDeque = this.f13968a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        h hVar = (h) arrayDeque.pollFirst();
        this.f13971d = hVar;
        return hVar;
    }

    @Override // q4.c
    public void release() {
    }
}
