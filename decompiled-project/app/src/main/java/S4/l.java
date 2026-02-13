package S4;

/* loaded from: classes.dex */
public final class l extends R4.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9135d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9136e;

    public l(k kVar, long j, long j10) {
        super(j, j10);
        this.f9136e = kVar;
    }

    public l(Z4.b bVar, int i7) {
        super(i7, bVar.k - 1);
        this.f9136e = bVar;
    }

    @Override // R4.l
    public final long a() {
        switch (this.f9135d) {
            case 0:
                b();
                return ((k) this.f9136e).c(this.f8852c);
            default:
                return ((Z4.b) this.f9136e).b((int) this.f8852c) + c();
        }
    }

    @Override // R4.l
    public final long c() {
        switch (this.f9135d) {
            case 0:
                b();
                return ((k) this.f9136e).d(this.f8852c);
            default:
                b();
                return ((Z4.b) this.f9136e).f12163o[(int) this.f8852c];
        }
    }
}
