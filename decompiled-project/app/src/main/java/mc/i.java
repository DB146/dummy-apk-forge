package mc;

import hc.AbstractC1273a;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public static final R7.a f20853b;

    /* renamed from: c, reason: collision with root package name */
    public static final R7.a f20854c;

    /* renamed from: d, reason: collision with root package name */
    public static final R7.a f20855d;

    /* renamed from: e, reason: collision with root package name */
    public static final R7.a f20856e;

    /* renamed from: a, reason: collision with root package name */
    public static final int f20852a = AbstractC1273a.k(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");

    /* renamed from: f, reason: collision with root package name */
    public static final int f20857f = AbstractC1273a.k(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    static {
        int i7 = 28;
        f20853b = new R7.a("PERMIT", i7);
        f20854c = new R7.a("TAKEN", i7);
        f20855d = new R7.a("BROKEN", i7);
        f20856e = new R7.a("CANCELLED", i7);
    }
}
