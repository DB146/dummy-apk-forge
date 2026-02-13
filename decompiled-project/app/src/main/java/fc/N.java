package fc;

import cc.C0944m;

/* loaded from: classes2.dex */
public final class N implements cc.S {

    /* renamed from: a, reason: collision with root package name */
    public final P f17079a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17080b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17081c;

    /* renamed from: d, reason: collision with root package name */
    public final C0944m f17082d;

    public N(P p10, long j, Object obj, C0944m c0944m) {
        this.f17079a = p10;
        this.f17080b = j;
        this.f17081c = obj;
        this.f17082d = c0944m;
    }

    @Override // cc.S
    public final void b() {
        P p10 = this.f17079a;
        synchronized (p10) {
            if (this.f17080b < p10.n()) {
                return;
            }
            Object[] objArr = p10.f17093v;
            kotlin.jvm.internal.l.b(objArr);
            long j = this.f17080b;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            Q.e(objArr, j, Q.f17098a);
            p10.i();
        }
    }
}
