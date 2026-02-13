package P4;

/* loaded from: classes.dex */
public final class i0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f8063a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f8065c;

    public i0(k0 k0Var) {
        this.f8065c = k0Var;
    }

    @Override // P4.d0
    public final void a() {
        k0 k0Var = this.f8065c;
        if (k0Var.f8087y) {
            return;
        }
        k0Var.f8085w.a();
    }

    @Override // P4.d0
    public final boolean b() {
        return this.f8065c.f8088z;
    }

    public final void c() {
        if (this.f8064b) {
            return;
        }
        k0 k0Var = this.f8065c;
        k0Var.f8081e.i(n5.o.h(k0Var.f8086x.f20096z), k0Var.f8086x, 0, null, 0L);
        this.f8064b = true;
    }

    @Override // P4.d0
    public final int f(ha.g gVar, q4.g gVar2, int i7) {
        c();
        k0 k0Var = this.f8065c;
        boolean z8 = k0Var.f8088z;
        if (z8 && k0Var.f8075A == null) {
            this.f8063a = 2;
        }
        int i10 = this.f8063a;
        if (i10 == 2) {
            gVar2.a(4);
            return -4;
        }
        if ((i7 & 2) != 0 || i10 == 0) {
            gVar.f17916c = k0Var.f8086x;
            this.f8063a = 1;
            return -5;
        }
        if (!z8) {
            return -3;
        }
        k0Var.f8075A.getClass();
        gVar2.a(1);
        gVar2.f23460f = 0L;
        if ((i7 & 4) == 0) {
            gVar2.I(k0Var.f8076B);
            gVar2.f23458d.put(k0Var.f8075A, 0, k0Var.f8076B);
        }
        if ((i7 & 1) == 0) {
            this.f8063a = 2;
        }
        return -4;
    }

    @Override // P4.d0
    public final int h(long j) {
        c();
        if (j <= 0 || this.f8063a == 2) {
            return 0;
        }
        this.f8063a = 2;
        return 1;
    }
}
