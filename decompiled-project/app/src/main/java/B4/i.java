package B4;

import s4.InterfaceC1984l;
import s4.v;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public v f2078b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1984l f2079c;

    /* renamed from: d, reason: collision with root package name */
    public g f2080d;

    /* renamed from: e, reason: collision with root package name */
    public long f2081e;

    /* renamed from: f, reason: collision with root package name */
    public long f2082f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public int f2083h;

    /* renamed from: i, reason: collision with root package name */
    public int f2084i;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2085l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2086m;

    /* renamed from: a, reason: collision with root package name */
    public final e f2077a = new e();
    public q3.c j = new q3.c(3, (char) 0);

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(n5.v vVar);

    public abstract boolean c(n5.v vVar, long j, q3.c cVar);

    public void d(boolean z8) {
        if (z8) {
            this.j = new q3.c(3, (char) 0);
            this.f2082f = 0L;
            this.f2083h = 0;
        } else {
            this.f2083h = 1;
        }
        this.f2081e = -1L;
        this.g = 0L;
    }
}
