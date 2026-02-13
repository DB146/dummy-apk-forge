package Y5;

import java.util.Objects;

/* renamed from: Y5.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0599a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z0 f11622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z0 f11623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11624c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f11625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0605c1 f11626e;

    public RunnableC0599a1(C0605c1 c0605c1, Z0 z02, Z0 z03, long j, boolean z8) {
        this.f11622a = z02;
        this.f11623b = z03;
        this.f11624c = j;
        this.f11625d = z8;
        Objects.requireNonNull(c0605c1);
        this.f11626e = c0605c1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11626e.T(this.f11622a, this.f11623b, this.f11624c, this.f11625d, null);
    }
}
