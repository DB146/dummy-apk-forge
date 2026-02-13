package fc;

/* renamed from: fc.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1173u implements InterfaceC1161h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1161h f17193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Jb.i f17194c;

    /* JADX WARN: Multi-variable type inference failed */
    public C1173u(InterfaceC1161h interfaceC1161h, Rb.e eVar, int i7) {
        this.f17192a = i7;
        switch (i7) {
            case 1:
                this.f17193b = interfaceC1161h;
                this.f17194c = (Jb.i) eVar;
                return;
            default:
                this.f17193b = interfaceC1161h;
                this.f17194c = (Jb.i) eVar;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Jb.i, Rb.e] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Jb.i, Rb.e] */
    @Override // fc.InterfaceC1161h
    public final Object a(InterfaceC1162i interfaceC1162i, Hb.d dVar) {
        switch (this.f17192a) {
            case 0:
                Object a9 = this.f17193b.a(new C1159f(new Object(), interfaceC1162i, this.f17194c), dVar);
                return a9 == Ib.a.f5345a ? a9 : Db.q.f3365a;
            default:
                Object a10 = this.f17193b.a(new A8.J(interfaceC1162i, (Rb.e) this.f17194c), dVar);
                return a10 == Ib.a.f5345a ? a10 : Db.q.f3365a;
        }
    }
}
