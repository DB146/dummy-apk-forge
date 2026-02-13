package qb;

import jb.InterfaceC1394e;

/* loaded from: classes2.dex */
public final class n extends AbstractC1909a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23626b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1394e f23627c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(gb.f fVar, InterfaceC1394e interfaceC1394e, int i7) {
        super(fVar);
        this.f23626b = i7;
        this.f23627c = interfaceC1394e;
    }

    @Override // gb.f
    public final void c(gb.g gVar) {
        switch (this.f23626b) {
            case 0:
                this.f23591a.b(new b(gVar, this.f23627c));
                return;
            case 1:
                this.f23591a.b(new nb.g(3, gVar, this.f23627c));
                return;
            default:
                this.f23591a.b(new nb.e(5, gVar, this.f23627c));
                return;
        }
    }
}
