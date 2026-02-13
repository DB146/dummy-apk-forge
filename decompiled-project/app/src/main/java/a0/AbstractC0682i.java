package a0;

/* renamed from: a0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0682i {

    /* renamed from: a, reason: collision with root package name */
    public C0686m f12386a;

    /* renamed from: b, reason: collision with root package name */
    public long f12387b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12388c;

    /* renamed from: d, reason: collision with root package name */
    public int f12389d;

    public AbstractC0682i(long j, C0686m c0686m) {
        int i7;
        int numberOfTrailingZeros;
        this.f12386a = c0686m;
        this.f12387b = j;
        Q7.h hVar = AbstractC0688o.f12404a;
        if (j != 0) {
            C0686m d10 = d();
            long[] jArr = d10.f12401d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j10 = d10.f12399b;
                long j11 = d10.f12400c;
                if (j10 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
                } else {
                    long j12 = d10.f12398a;
                    if (j12 != 0) {
                        j11 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j12);
                    }
                }
                j = numberOfTrailingZeros + j11;
            }
            synchronized (AbstractC0688o.f12405b) {
                i7 = AbstractC0688o.f12408e.a(j);
            }
        } else {
            i7 = -1;
        }
        this.f12389d = i7;
    }

    public static void q(AbstractC0682i abstractC0682i) {
        AbstractC0688o.f12404a.N(abstractC0682i);
    }

    public final void a() {
        synchronized (AbstractC0688o.f12405b) {
            b();
            p();
        }
    }

    public void b() {
        AbstractC0688o.f12406c = AbstractC0688o.f12406c.o(g());
    }

    public abstract void c();

    public C0686m d() {
        return this.f12386a;
    }

    public abstract Rb.c e();

    public abstract boolean f();

    public long g() {
        return this.f12387b;
    }

    public int h() {
        return 0;
    }

    public abstract Rb.c i();

    public final AbstractC0682i j() {
        Q7.h hVar = AbstractC0688o.f12404a;
        AbstractC0682i abstractC0682i = (AbstractC0682i) hVar.w();
        hVar.N(this);
        return abstractC0682i;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(InterfaceC0695v interfaceC0695v);

    public final void o() {
        int i7 = this.f12389d;
        if (i7 >= 0) {
            AbstractC0688o.u(i7);
            this.f12389d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(C0686m c0686m) {
        this.f12386a = c0686m;
    }

    public void s(long j) {
        this.f12387b = j;
    }

    public void t(int i7) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract AbstractC0682i u(Rb.c cVar);
}
