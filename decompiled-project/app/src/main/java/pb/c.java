package pb;

import jb.InterfaceC1394e;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1394e f23272c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23273d;

    public c(gb.d dVar, InterfaceC1394e interfaceC1394e) {
        super(dVar);
        this.f23272c = interfaceC1394e;
        this.f23273d = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    @Override // gb.d
    public final void b(gb.e eVar) {
        this.f23261b.a(new b(eVar, this.f23272c, this.f23273d));
    }
}
