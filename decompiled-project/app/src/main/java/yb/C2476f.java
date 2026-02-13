package yb;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: yb.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2476f extends AtomicReferenceArray implements InterfaceC2474d {

    /* renamed from: f, reason: collision with root package name */
    public static final Integer f27572f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: a, reason: collision with root package name */
    public final int f27573a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f27574b;

    /* renamed from: c, reason: collision with root package name */
    public long f27575c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f27576d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27577e;

    public C2476f(int i7) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i7 - 1)));
        this.f27573a = length() - 1;
        this.f27574b = new AtomicLong();
        this.f27576d = new AtomicLong();
        this.f27577e = Math.min(i7 / 4, f27572f.intValue());
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
        return this.f27574b.get() == this.f27576d.get();
    }

    @Override // yb.InterfaceC2475e
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f27574b;
        long j = atomicLong.get();
        int i7 = this.f27573a;
        int i10 = ((int) j) & i7;
        if (j >= this.f27575c) {
            long j10 = this.f27577e + j;
            if (get(i7 & ((int) j10)) == null) {
                this.f27575c = j10;
            } else if (get(i10) != null) {
                return false;
            }
        }
        lazySet(i10, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // yb.InterfaceC2475e
    public final Object poll() {
        AtomicLong atomicLong = this.f27576d;
        long j = atomicLong.get();
        int i7 = ((int) j) & this.f27573a;
        Object obj = get(i7);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i7, null);
        return obj;
    }
}
