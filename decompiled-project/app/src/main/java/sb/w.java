package sb;

/* loaded from: classes2.dex */
public final class w extends AbstractC2007a {

    /* renamed from: b, reason: collision with root package name */
    public final gb.o f24343b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24344c;

    public w(gb.i iVar, gb.o oVar, int i7) {
        super(iVar);
        this.f24343b = oVar;
        this.f24344c = i7;
    }

    @Override // gb.i
    public final void p(gb.l lVar) {
        gb.o oVar = this.f24343b;
        boolean z8 = oVar instanceof vb.w;
        gb.k kVar = this.f24251a;
        if (z8) {
            kVar.b(lVar);
        } else {
            kVar.b(new v(lVar, oVar.a(), this.f24344c));
        }
    }
}
