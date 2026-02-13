package fc;

/* loaded from: classes2.dex */
public final class L implements Z, InterfaceC1161h, gc.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f17078a;

    public L(J j) {
        this.f17078a = j;
    }

    @Override // fc.InterfaceC1161h
    public final Object a(InterfaceC1162i interfaceC1162i, Hb.d dVar) {
        ((b0) this.f17078a).a(interfaceC1162i, dVar);
        return Ib.a.f5345a;
    }

    @Override // gc.w
    public final InterfaceC1161h b(Hb.i iVar, int i7, int i10) {
        return (((i7 < 0 || i7 >= 2) && i7 != -2) || i10 != 2) ? Q.l(this, iVar, i7, i10) : this;
    }

    @Override // fc.Z
    public final Object getValue() {
        return ((b0) this.f17078a).getValue();
    }
}
