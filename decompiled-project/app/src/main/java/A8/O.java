package A8;

import M1.InterfaceC0394i;

/* loaded from: classes.dex */
public final class O implements D8.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f571a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Cb.a f572b;

    /* renamed from: c, reason: collision with root package name */
    public final D8.c f573c;

    public O(Cb.a aVar, D8.c cVar) {
        this.f572b = aVar;
        this.f573c = cVar;
    }

    public O(D8.c cVar, Cb.a aVar) {
        this.f573c = cVar;
        this.f572b = aVar;
    }

    @Override // Cb.a
    public final Object get() {
        switch (this.f571a) {
            case 0:
                return new N((Hb.i) this.f573c.f3288a, (InterfaceC0394i) this.f572b.get());
            default:
                return new E8.g((C0038b) this.f572b.get(), (Hb.i) this.f573c.f3288a);
        }
    }
}
