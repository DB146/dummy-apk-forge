package pb;

import ha.C1265a;
import jb.InterfaceC1392c;

/* loaded from: classes2.dex */
public final class g extends a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23282c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(gb.d dVar, Object obj, int i7) {
        super(dVar);
        this.f23282c = i7;
        this.f23283d = obj;
    }

    @Override // gb.d
    public final void b(gb.e eVar) {
        switch (this.f23282c) {
            case 0:
                this.f23261b.a(new f(eVar, (C1265a) this.f23283d));
                return;
            default:
                wb.b bVar = new wb.b();
                eVar.f(bVar);
                new j(eVar, (InterfaceC1392c) this.f23283d, bVar, this.f23261b).b();
                return;
        }
    }
}
