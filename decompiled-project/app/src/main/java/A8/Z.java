package A8;

/* loaded from: classes.dex */
public final class Z implements D8.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f612a;

    /* renamed from: b, reason: collision with root package name */
    public final Cb.a f613b;

    /* renamed from: c, reason: collision with root package name */
    public final Cb.a f614c;

    public /* synthetic */ Z(Cb.a aVar, Cb.a aVar2, int i7) {
        this.f612a = i7;
        this.f613b = aVar;
        this.f614c = aVar2;
    }

    @Override // Cb.a
    public final Object get() {
        switch (this.f612a) {
            case 0:
                return new Y((k0) this.f613b.get(), (l0) this.f614c.get());
            default:
                return new E8.j((E8.o) this.f613b.get(), (E8.o) this.f614c.get());
        }
    }
}
