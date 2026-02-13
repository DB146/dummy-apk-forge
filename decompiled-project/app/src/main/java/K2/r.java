package K2;

import I2.InterfaceC0333w;

/* loaded from: classes.dex */
public final class r implements y, InterfaceC0333w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6077b;

    public /* synthetic */ r(Object obj, int i7) {
        this.f6076a = i7;
        this.f6077b = obj;
    }

    @Override // I2.InterfaceC0333w
    public final Object b(String str, Rb.c cVar, Jb.c cVar2) {
        switch (this.f6076a) {
            case 0:
                return ((x) this.f6077b).b(str, cVar, cVar2);
            default:
                return ((L2.d) this.f6077b).b(str, cVar, cVar2);
        }
    }

    @Override // K2.y
    public final T2.a c() {
        switch (this.f6076a) {
            case 0:
                return ((x) this.f6077b).f6104a;
            default:
                return ((L2.d) this.f6077b).f6271a;
        }
    }
}
