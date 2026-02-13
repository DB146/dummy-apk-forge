package sb;

import gb.AbstractC1204a;
import jb.InterfaceC1394e;

/* loaded from: classes2.dex */
public final class p extends AbstractC1204a {

    /* renamed from: a, reason: collision with root package name */
    public final gb.i f24315a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1394e f24316b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24317c;

    public p(gb.i iVar, InterfaceC1394e interfaceC1394e, boolean z8) {
        this.f24315a = iVar;
        this.f24316b = interfaceC1394e;
        this.f24317c = z8;
    }

    @Override // gb.AbstractC1204a
    public final void d(gb.b bVar) {
        this.f24315a.b(new o(bVar, this.f24316b, this.f24317c));
    }
}
