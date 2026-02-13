package ec;

import cc.N0;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class l extends hc.u {

    /* renamed from: e, reason: collision with root package name */
    public final d f16894e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f16895f;

    public l(long j, l lVar, d dVar, int i7) {
        super(j, lVar, i7);
        this.f16894e = dVar;
        this.f16895f = new AtomicReferenceArray(f.f16873b * 2);
    }

    @Override // hc.u
    public final int f() {
        return f.f16873b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x005a, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005d, code lost:
    
        if (r0 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005f, code lost:
    
        kotlin.jvm.internal.l.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // hc.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i7, Hb.i iVar) {
        int i10 = f.f16873b;
        boolean z8 = i7 >= i10;
        if (z8) {
            i7 -= i10;
        }
        this.f16895f.get(i7 * 2);
        while (true) {
            Object k = k(i7);
            boolean z10 = k instanceof N0;
            d dVar = this.f16894e;
            if (z10 || (k instanceof v)) {
                if (j(i7, k, z8 ? f.j : f.k)) {
                    m(i7, null);
                    l(i7, !z8);
                    if (z8) {
                        kotlin.jvm.internal.l.b(dVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k == f.j || k == f.k) {
                    break;
                }
                if (k != f.g && k != f.f16877f) {
                    if (k == f.f16879i || k == f.f16875d || k == f.f16880l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k).toString());
                }
            }
        }
    }

    public final boolean j(int i7, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f16895f;
        int i10 = (i7 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceArray.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i7) {
        return this.f16895f.get((i7 * 2) + 1);
    }

    public final void l(int i7, boolean z8) {
        if (z8) {
            d dVar = this.f16894e;
            kotlin.jvm.internal.l.b(dVar);
            dVar.I((this.f17971c * f.f16873b) + i7);
        }
        h();
    }

    public final void m(int i7, Object obj) {
        this.f16895f.lazySet(i7 * 2, obj);
    }

    public final void n(int i7, R7.a aVar) {
        this.f16895f.set((i7 * 2) + 1, aVar);
    }
}
