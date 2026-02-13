package yc;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class E implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f27651a;

    /* renamed from: b, reason: collision with root package name */
    public final xc.k f27652b;

    /* renamed from: c, reason: collision with root package name */
    public final D f27653c;

    /* renamed from: d, reason: collision with root package name */
    public H f27654d;

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f27655e;

    /* JADX WARN: Type inference failed for: r0v3, types: [xc.k, java.util.ArrayList] */
    public E(E e2) {
        this.f27655e = new ReentrantLock();
        this.f27651a = e2.f27651a.i();
        e2.f27652b.getClass();
        this.f27652b = new ArrayList(0);
        D d10 = e2.f27653c;
        this.f27653c = new D(d10.f27649a, d10.f27650b);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [xc.k, java.util.ArrayList] */
    public E(m1 m1Var) {
        this.f27655e = new ReentrantLock();
        this.f27651a = m1Var;
        this.f27653c = m1Var.e();
        this.f27652b = new ArrayList(0);
    }

    public final xc.g a(wc.f fVar, String str) {
        ReentrantLock reentrantLock = this.f27655e;
        try {
            reentrantLock.lock();
            m1 m1Var = this.f27651a;
            m1Var.g(fVar, str, this);
            m1Var.n();
            return m1Var.f27814d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object clone() {
        return new E(this);
    }
}
