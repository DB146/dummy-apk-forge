package Bb;

import gb.l;
import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicReference;
import xb.AbstractC2275c;
import xb.C2274b;

/* loaded from: classes2.dex */
public final class b extends d {

    /* renamed from: c, reason: collision with root package name */
    public static final a[] f2295c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    public static final a[] f2296d = new a[0];

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f2297a = new AtomicReference(f2296d);

    /* renamed from: b, reason: collision with root package name */
    public Throwable f2298b;

    @Override // gb.l
    public final void a() {
        AtomicReference atomicReference = this.f2297a;
        Object obj = atomicReference.get();
        Object obj2 = f2295c;
        if (obj == obj2) {
            return;
        }
        a[] aVarArr = (a[]) atomicReference.getAndSet(obj2);
        for (a aVar : aVarArr) {
            if (!aVar.get()) {
                aVar.f2293a.a();
            }
        }
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        if (this.f2297a.get() == f2295c) {
            interfaceC1269b.b();
        }
    }

    @Override // gb.l
    public final void e(Object obj) {
        if (obj == null) {
            throw AbstractC2275c.a("onNext called with a null value.");
        }
        C2274b c2274b = AbstractC2275c.f26321a;
        for (a aVar : (a[]) this.f2297a.get()) {
            if (!aVar.get()) {
                aVar.f2293a.e(obj);
            }
        }
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        if (th == null) {
            throw AbstractC2275c.a("onError called with a null Throwable.");
        }
        C2274b c2274b = AbstractC2275c.f26321a;
        AtomicReference atomicReference = this.f2297a;
        Object obj = atomicReference.get();
        Object obj2 = f2295c;
        if (obj == obj2) {
            com.bumptech.glide.d.t(th);
            return;
        }
        this.f2298b = th;
        a[] aVarArr = (a[]) atomicReference.getAndSet(obj2);
        for (a aVar : aVarArr) {
            if (aVar.get()) {
                com.bumptech.glide.d.t(th);
            } else {
                aVar.f2293a.onError(th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gb.i
    public final void p(l lVar) {
        a aVar = new a(lVar, this);
        lVar.c(aVar);
        while (true) {
            AtomicReference atomicReference = this.f2297a;
            a[] aVarArr = (a[]) atomicReference.get();
            if (aVarArr == f2295c) {
                Throwable th = this.f2298b;
                if (th != null) {
                    lVar.onError(th);
                    return;
                } else {
                    lVar.a();
                    return;
                }
            }
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.get()) {
                r(aVar);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference atomicReference = this.f2297a;
            a[] aVarArr2 = (a[]) atomicReference.get();
            if (aVarArr2 == f2295c || aVarArr2 == (aVarArr = f2296d)) {
                return;
            }
            int length = aVarArr2.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    i7 = -1;
                    break;
                } else if (aVarArr2[i7] == aVar) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 < 0) {
                return;
            }
            if (length != 1) {
                aVarArr = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr, 0, i7);
                System.arraycopy(aVarArr2, i7 + 1, aVarArr, i7, (length - i7) - 1);
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }
}
