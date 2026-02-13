package gb;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import lb.CallableC1516a;
import ob.C1833a;
import rb.C1954a;
import sb.C2002A;
import sb.C2012f;
import sb.u;
import sb.w;
import xb.AbstractC2275c;
import y7.u0;
import yb.InterfaceC2473c;

/* loaded from: classes2.dex */
public abstract class i implements k {
    public static qb.m i(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new qb.m(new CallableC1516a(th), 3);
    }

    public static i k(Object... objArr) {
        return objArr.length == 0 ? sb.h.f24268a : objArr.length == 1 ? l(objArr[0]) : new qb.m(objArr, 4);
    }

    public static u l(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new u(obj);
    }

    @Override // gb.k
    public final void b(l lVar) {
        Objects.requireNonNull(lVar, "observer is null");
        try {
            p(lVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            u0.L(th);
            com.bumptech.glide.d.t(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.CountDownLatch, gb.l, nb.c] */
    public final Object d() {
        ?? countDownLatch = new CountDownLatch(1);
        b(countDownLatch);
        if (countDownLatch.getCount() != 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                countDownLatch.b();
                throw AbstractC2275c.b(e2);
            }
        }
        Throwable th = countDownLatch.f21334b;
        if (th != null) {
            throw AbstractC2275c.b(th);
        }
        Object obj = countDownLatch.f21333a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final i f(H9.a aVar) {
        Objects.requireNonNull(aVar, "composer is null");
        vb.n nVar = Ab.e.f1561c;
        return q(nVar).n(nVar);
    }

    public final C1833a g(InterfaceC1394e interfaceC1394e) {
        lb.b.a(2, "capacityHint");
        return new C1833a(2, this, interfaceC1394e);
    }

    public final C2012f h(InterfaceC1393d interfaceC1393d) {
        return new C2012f(this, lb.b.f19615d, interfaceC1393d, lb.b.f19614c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i j(InterfaceC1394e interfaceC1394e, int i7) {
        int i10 = d.f17483a;
        lb.b.a(i7, "maxConcurrency");
        lb.b.a(i10, "bufferSize");
        if (!(this instanceof InterfaceC2473c)) {
            return new sb.l(this, interfaceC1394e, i7, i10);
        }
        Object obj = ((InterfaceC2473c) this).get();
        return obj == null ? sb.h.f24268a : new C1954a(2, obj, interfaceC1394e);
    }

    public final i m(i iVar) {
        Objects.requireNonNull(iVar, "other is null");
        return k(this, iVar).j(lb.b.f19612a, 2);
    }

    public final w n(o oVar) {
        int i7 = d.f17483a;
        Objects.requireNonNull(oVar, "scheduler is null");
        lb.b.a(i7, "bufferSize");
        return new w(this, oVar, i7);
    }

    public final C2002A o(long j) {
        if (j >= 0) {
            return new C2002A(this, j);
        }
        throw new IllegalArgumentException(A3.c.h("times >= 0 required but it was ", j));
    }

    public abstract void p(l lVar);

    public final sb.g q(vb.n nVar) {
        Objects.requireNonNull(nVar, "scheduler is null");
        return new sb.g(this, nVar, 4);
    }
}
