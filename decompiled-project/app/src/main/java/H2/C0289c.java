package H2;

/* renamed from: H2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289c implements C {

    /* renamed from: a, reason: collision with root package name */
    public final C f4645a;

    /* renamed from: b, reason: collision with root package name */
    public int f4646b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f4647c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f4648d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f4649e = null;

    public C0289c(C c10) {
        this.f4645a = c10;
    }

    public final void a() {
        int i7 = this.f4646b;
        if (i7 == 0) {
            return;
        }
        C c10 = this.f4645a;
        if (i7 == 1) {
            c10.k(this.f4647c, this.f4648d);
        } else if (i7 == 2) {
            c10.d(this.f4647c, this.f4648d);
        } else if (i7 == 3) {
            c10.c(this.f4649e, this.f4647c, this.f4648d);
        }
        this.f4649e = null;
        this.f4646b = 0;
    }

    @Override // H2.C
    public final void c(Object obj, int i7, int i10) {
        int i11;
        int i12;
        int i13;
        if (this.f4646b == 3 && i7 <= (i12 = this.f4648d + (i11 = this.f4647c)) && (i13 = i7 + i10) >= i11 && this.f4649e == obj) {
            this.f4647c = Math.min(i7, i11);
            this.f4648d = Math.max(i12, i13) - this.f4647c;
            return;
        }
        a();
        this.f4647c = i7;
        this.f4648d = i10;
        this.f4649e = obj;
        this.f4646b = 3;
    }

    @Override // H2.C
    public final void d(int i7, int i10) {
        int i11;
        if (this.f4646b == 2 && (i11 = this.f4647c) >= i7 && i11 <= i7 + i10) {
            this.f4648d += i10;
            this.f4647c = i7;
        } else {
            a();
            this.f4647c = i7;
            this.f4648d = i10;
            this.f4646b = 2;
        }
    }

    @Override // H2.C
    public final void e(int i7, int i10) {
        a();
        this.f4645a.e(i7, i10);
    }

    @Override // H2.C
    public final void k(int i7, int i10) {
        int i11;
        if (this.f4646b == 1 && i7 >= (i11 = this.f4647c)) {
            int i12 = this.f4648d;
            if (i7 <= i11 + i12) {
                this.f4648d = i12 + i10;
                this.f4647c = Math.min(i7, i11);
                return;
            }
        }
        a();
        this.f4647c = i7;
        this.f4648d = i10;
        this.f4646b = 1;
    }
}
