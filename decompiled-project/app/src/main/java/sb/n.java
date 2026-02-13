package sb;

import jb.InterfaceC1394e;

/* loaded from: classes2.dex */
public final class n extends AbstractC2007a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1394e f24306b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24307c;

    public n(gb.i iVar, InterfaceC1394e interfaceC1394e, boolean z8) {
        super(iVar);
        this.f24306b = interfaceC1394e;
        this.f24307c = z8;
    }

    @Override // gb.i
    public final void p(gb.l lVar) {
        this.f24251a.b(new m(lVar, this.f24306b, this.f24307c));
    }
}
