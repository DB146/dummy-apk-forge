package l2;

/* renamed from: l2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1454E extends AbstractC1455F implements InterfaceC1477v {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1479x f19154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC1456G f19155f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1454E(AbstractC1456G abstractC1456G, InterfaceC1479x interfaceC1479x, I i7) {
        super(abstractC1456G, i7);
        this.f19155f = abstractC1456G;
        this.f19154e = interfaceC1479x;
    }

    @Override // l2.AbstractC1455F
    public final void b() {
        this.f19154e.w().f(this);
    }

    @Override // l2.AbstractC1455F
    public final boolean c(InterfaceC1479x interfaceC1479x) {
        return this.f19154e == interfaceC1479x;
    }

    @Override // l2.AbstractC1455F
    public final boolean d() {
        return this.f19154e.w().f19242d.compareTo(EnumC1474s.f19230d) >= 0;
    }

    @Override // l2.InterfaceC1477v
    public final void onStateChanged(InterfaceC1479x interfaceC1479x, r rVar) {
        InterfaceC1479x interfaceC1479x2 = this.f19154e;
        EnumC1474s enumC1474s = interfaceC1479x2.w().f19242d;
        if (enumC1474s == EnumC1474s.f19227a) {
            this.f19155f.i(this.f19156a);
            return;
        }
        EnumC1474s enumC1474s2 = null;
        while (enumC1474s2 != enumC1474s) {
            a(d());
            enumC1474s2 = enumC1474s;
            enumC1474s = interfaceC1479x2.w().f19242d;
        }
    }
}
