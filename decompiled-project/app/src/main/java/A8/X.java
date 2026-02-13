package A8;

/* loaded from: classes.dex */
public final class X implements D8.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f601a;

    /* renamed from: b, reason: collision with root package name */
    public final D8.c f602b;

    /* renamed from: c, reason: collision with root package name */
    public final D8.c f603c;

    /* renamed from: d, reason: collision with root package name */
    public final Cb.a f604d;

    /* renamed from: e, reason: collision with root package name */
    public final Cb.a f605e;

    /* renamed from: f, reason: collision with root package name */
    public final Cb.a f606f;

    public /* synthetic */ X(D8.c cVar, D8.c cVar2, Cb.a aVar, Cb.a aVar2, Cb.a aVar3, int i7) {
        this.f601a = i7;
        this.f602b = cVar;
        this.f603c = cVar2;
        this.f604d = aVar;
        this.f605e = aVar2;
        this.f606f = aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [C8.a] */
    @Override // Cb.a
    public final Object get() {
        switch (this.f601a) {
            case 0:
                return new W((Y6.i) this.f602b.f3288a, (k8.e) this.f603c.f3288a, (E8.j) this.f604d.get(), (C0048l) this.f605e.get(), (Hb.i) ((D8.c) this.f606f).f3288a);
            default:
                Hb.i iVar = (Hb.i) this.f602b.f3288a;
                k8.e eVar = (k8.e) this.f603c.f3288a;
                C0038b c0038b = (C0038b) this.f604d.get();
                E8.g gVar = (E8.g) this.f605e.get();
                Cb.a aVar = this.f606f;
                return new E8.e(iVar, eVar, c0038b, gVar, aVar instanceof C8.a ? (C8.a) aVar : new D8.a(aVar));
        }
    }
}
