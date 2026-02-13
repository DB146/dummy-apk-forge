package I2;

/* renamed from: I2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335y extends A4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f5210c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0335y(A a9, int i7) {
        super(i7, 1);
        this.f5210c = a9;
    }

    @Override // A4.c
    public final void B(V2.c cVar) {
        this.f5210c.d(new L2.a(cVar));
    }

    @Override // A4.c
    public final void C(V2.c cVar, int i7, int i10) {
        E(cVar, i7, i10);
    }

    @Override // A4.c
    public final void D(V2.c cVar) {
        L2.a aVar = new L2.a(cVar);
        A a9 = this.f5210c;
        a9.f(aVar);
        a9.f5006h = cVar;
    }

    @Override // A4.c
    public final void E(V2.c cVar, int i7, int i10) {
        this.f5210c.e(new L2.a(cVar), i7, i10);
    }
}
