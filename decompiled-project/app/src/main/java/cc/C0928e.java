package cc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: cc.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0928e {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14527b = AtomicIntegerFieldUpdater.newUpdater(C0928e.class, "notCompletedCount");

    /* renamed from: a, reason: collision with root package name */
    public final I[] f14528a;
    private volatile int notCompletedCount;

    public C0928e(I[] iArr) {
        this.f14528a = iArr;
        this.notCompletedCount = iArr.length;
    }
}
