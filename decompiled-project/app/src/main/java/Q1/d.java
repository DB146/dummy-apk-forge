package Q1;

import M1.InterfaceC0394i;
import fc.InterfaceC1161h;

/* loaded from: classes.dex */
public final class d implements InterfaceC0394i {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0394i f8608a;

    public d(InterfaceC0394i interfaceC0394i) {
        this.f8608a = interfaceC0394i;
    }

    @Override // M1.InterfaceC0394i
    public final Object a(Rb.e eVar, Jb.c cVar) {
        return this.f8608a.a(new c(eVar, null), cVar);
    }

    @Override // M1.InterfaceC0394i
    public final InterfaceC1161h getData() {
        return this.f8608a.getData();
    }
}
