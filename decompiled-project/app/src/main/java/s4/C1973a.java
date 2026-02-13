package s4;

/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1973a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1975c f24029a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24030b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24031c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24032d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24033e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24034f;

    public C1973a(InterfaceC1975c interfaceC1975c, long j, long j10, long j11, long j12, long j13) {
        this.f24029a = interfaceC1975c;
        this.f24030b = j;
        this.f24031c = j10;
        this.f24032d = j11;
        this.f24033e = j12;
        this.f24034f = j13;
    }

    @Override // s4.s
    public final boolean g() {
        return true;
    }

    @Override // s4.s
    public final r h(long j) {
        t tVar = new t(j, C1974b.a(this.f24029a.e(j), 0L, this.f24031c, this.f24032d, this.f24033e, this.f24034f));
        return new r(tVar, tVar);
    }

    @Override // s4.s
    public final long i() {
        return this.f24030b;
    }
}
