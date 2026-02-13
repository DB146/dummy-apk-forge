package sb;

import jb.InterfaceC1394e;

/* loaded from: classes2.dex */
public final class l extends AbstractC2007a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1394e f24296b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24297c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24298d;

    public l(gb.i iVar, InterfaceC1394e interfaceC1394e, int i7, int i10) {
        super(iVar);
        this.f24296b = interfaceC1394e;
        this.f24297c = i7;
        this.f24298d = i10;
    }

    @Override // gb.i
    public final void p(gb.l lVar) {
        InterfaceC1394e interfaceC1394e = this.f24296b;
        gb.k kVar = this.f24251a;
        if (E6.b.D(kVar, lVar, interfaceC1394e)) {
            return;
        }
        kVar.b(new k(lVar, interfaceC1394e, this.f24297c, this.f24298d));
    }
}
