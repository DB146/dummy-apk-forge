package qb;

import gb.AbstractC1204a;
import jb.InterfaceC1391b;
import jb.InterfaceC1395f;

/* loaded from: classes2.dex */
public final class g extends gb.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23609a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23610b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23611c;

    public /* synthetic */ g(int i7, Object obj, Object obj2) {
        this.f23609a = i7;
        this.f23610b = obj;
        this.f23611c = obj2;
    }

    @Override // gb.f
    public final void c(gb.g gVar) {
        switch (this.f23609a) {
            case 0:
                ((AbstractC1204a) this.f23611c).c(new nb.e(3, gVar, (AbstractC1909a) this.f23610b));
                return;
            case 1:
                ((gb.p) this.f23610b).d(new nb.g(2, gVar, (InterfaceC1395f) this.f23611c));
                return;
            default:
                ((gb.i) this.f23610b).b(new pb.h(gVar, (InterfaceC1391b) this.f23611c, 1));
                return;
        }
    }
}
