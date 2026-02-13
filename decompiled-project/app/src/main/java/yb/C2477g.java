package yb;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: yb.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2477g implements InterfaceC2474d {

    /* renamed from: w, reason: collision with root package name */
    public static final int f27578w = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: x, reason: collision with root package name */
    public static final Object f27579x = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f27580a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27581b;

    /* renamed from: c, reason: collision with root package name */
    public long f27582c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27583d;

    /* renamed from: e, reason: collision with root package name */
    public AtomicReferenceArray f27584e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27585f;

    /* renamed from: u, reason: collision with root package name */
    public AtomicReferenceArray f27586u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicLong f27587v;

    public C2477g(int i7) {
        AtomicLong atomicLong = new AtomicLong();
        this.f27580a = atomicLong;
        this.f27587v = new AtomicLong();
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i7) - 1));
        int i10 = numberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(numberOfLeadingZeros + 1);
        this.f27584e = atomicReferenceArray;
        this.f27583d = i10;
        this.f27581b = Math.min(numberOfLeadingZeros / 4, f27578w);
        this.f27586u = atomicReferenceArray;
        this.f27585f = i10;
        this.f27582c = numberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // yb.InterfaceC2475e
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // yb.InterfaceC2475e
    public final boolean isEmpty() {
        return this.f27580a.get() == this.f27587v.get();
    }

    @Override // yb.InterfaceC2475e
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f27584e;
        AtomicLong atomicLong = this.f27580a;
        long j = atomicLong.get();
        int i7 = this.f27583d;
        int i10 = ((int) j) & i7;
        if (j < this.f27582c) {
            atomicReferenceArray.lazySet(i10, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j10 = this.f27581b + j;
        if (atomicReferenceArray.get(((int) j10) & i7) == null) {
            this.f27582c = j10 - 1;
            atomicReferenceArray.lazySet(i10, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j11 = j + 1;
        if (atomicReferenceArray.get(((int) j11) & i7) == null) {
            atomicReferenceArray.lazySet(i10, obj);
            atomicLong.lazySet(j11);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f27584e = atomicReferenceArray2;
        this.f27582c = (j + i7) - 1;
        atomicReferenceArray2.lazySet(i10, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i10, f27579x);
        atomicLong.lazySet(j11);
        return true;
    }

    @Override // yb.InterfaceC2475e
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f27586u;
        AtomicLong atomicLong = this.f27587v;
        long j = atomicLong.get();
        int i7 = this.f27585f;
        int i10 = ((int) j) & i7;
        Object obj = atomicReferenceArray.get(i10);
        boolean z8 = obj == f27579x;
        if (obj != null && !z8) {
            atomicReferenceArray.lazySet(i10, null);
            atomicLong.lazySet(j + 1);
            return obj;
        }
        if (!z8) {
            return null;
        }
        int i11 = i7 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i11);
        atomicReferenceArray.lazySet(i11, null);
        this.f27586u = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i10);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i10, null);
            atomicLong.lazySet(j + 1);
        }
        return obj2;
    }
}
