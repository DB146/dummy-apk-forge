package m5;

import java.util.Arrays;

/* renamed from: m5.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1620q {

    /* renamed from: c, reason: collision with root package name */
    public int f20637c;

    /* renamed from: d, reason: collision with root package name */
    public int f20638d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20635a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f20636b = 65536;

    /* renamed from: e, reason: collision with root package name */
    public int f20639e = 0;

    /* renamed from: f, reason: collision with root package name */
    public C1604a[] f20640f = new C1604a[100];

    public final synchronized void a(int i7) {
        boolean z8 = i7 < this.f20637c;
        this.f20637c = i7;
        if (z8) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, n5.D.f(this.f20637c, this.f20636b) - this.f20638d);
        int i7 = this.f20639e;
        if (max >= i7) {
            return;
        }
        Arrays.fill(this.f20640f, max, i7, (Object) null);
        this.f20639e = max;
    }
}
