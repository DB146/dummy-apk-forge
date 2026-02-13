package sb;

import jb.InterfaceC1394e;
import kb.C1436a;

/* loaded from: classes2.dex */
public final class q extends AbstractC2007a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24318b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1394e f24319c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(gb.i iVar, InterfaceC1394e interfaceC1394e, int i7) {
        super(iVar);
        this.f24318b = i7;
        this.f24319c = interfaceC1394e;
    }

    @Override // gb.i
    public final void p(gb.l lVar) {
        switch (this.f24318b) {
            case 0:
                this.f24251a.b(new nb.g(7, lVar, this.f24319c));
                return;
            case 1:
                this.f24251a.b(new i(lVar, this.f24319c, 1));
                return;
            default:
                U2.b bVar = new U2.b(lVar, this.f24319c);
                lVar.c((C1436a) bVar.f9510e);
                this.f24251a.b(bVar);
                return;
        }
    }
}
