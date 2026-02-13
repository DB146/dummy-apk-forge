package tb;

import ea.C1111f;
import gb.p;
import gb.q;
import jb.InterfaceC1394e;

/* loaded from: classes2.dex */
public final class e extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24534a;

    /* renamed from: b, reason: collision with root package name */
    public final p f24535b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1394e f24536c;

    public /* synthetic */ e(p pVar, InterfaceC1394e interfaceC1394e, int i7) {
        this.f24534a = i7;
        this.f24536c = interfaceC1394e;
        this.f24535b = pVar;
    }

    @Override // gb.p
    public final void e(q qVar) {
        switch (this.f24534a) {
            case 0:
                this.f24535b.d(new d(qVar, this.f24536c, 0));
                return;
            case 1:
                this.f24535b.d(new C1111f(14, qVar, this.f24536c));
                return;
            default:
                this.f24535b.d(new d(qVar, this.f24536c, 1));
                return;
        }
    }
}
