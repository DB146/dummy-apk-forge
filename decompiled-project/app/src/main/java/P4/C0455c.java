package P4;

/* renamed from: P4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455c implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f7987a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0456d f7989c;

    public C0455c(C0456d c0456d, d0 d0Var) {
        this.f7989c = c0456d;
        this.f7987a = d0Var;
    }

    @Override // P4.d0
    public final void a() {
        this.f7987a.a();
    }

    @Override // P4.d0
    public final boolean b() {
        return !this.f7989c.b() && this.f7987a.b();
    }

    @Override // P4.d0
    public final int f(ha.g gVar, q4.g gVar2, int i7) {
        C0456d c0456d = this.f7989c;
        if (c0456d.b()) {
            return -3;
        }
        if (this.f7988b) {
            gVar2.f368b = 4;
            return -4;
        }
        long n6 = c0456d.n();
        int f4 = this.f7987a.f(gVar, gVar2, i7);
        if (f4 != -5) {
            long j = c0456d.f8025f;
            if (j == Long.MIN_VALUE || ((f4 != -4 || gVar2.f23460f < j) && !(f4 == -3 && n6 == Long.MIN_VALUE && !gVar2.f23459e))) {
                return f4;
            }
            gVar2.G();
            gVar2.f368b = 4;
            this.f7988b = true;
            return -4;
        }
        m4.L l10 = (m4.L) gVar.f17916c;
        l10.getClass();
        int i10 = l10.f20079Q;
        int i11 = l10.f20078P;
        if (i11 != 0 || i10 != 0) {
            if (c0456d.f8024e != 0) {
                i11 = 0;
            }
            if (c0456d.f8025f != Long.MIN_VALUE) {
                i10 = 0;
            }
            m4.K a9 = l10.a();
            a9.f19970A = i11;
            a9.f19971B = i10;
            gVar.f17916c = new m4.L(a9);
        }
        return -5;
    }

    @Override // P4.d0
    public final int h(long j) {
        if (this.f7989c.b()) {
            return -3;
        }
        return this.f7987a.h(j);
    }
}
