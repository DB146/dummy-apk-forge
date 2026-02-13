package K2;

import I2.E;
import fc.InterfaceC1161h;
import fc.InterfaceC1162i;

/* loaded from: classes.dex */
public final class l implements InterfaceC1161h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1161h f6047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f6048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6049c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Rb.c f6050d;

    public l(InterfaceC1161h interfaceC1161h, E e2, boolean z8, Rb.c cVar) {
        this.f6047a = interfaceC1161h;
        this.f6048b = e2;
        this.f6049c = z8;
        this.f6050d = cVar;
    }

    @Override // fc.InterfaceC1161h
    public final Object a(InterfaceC1162i interfaceC1162i, Hb.d dVar) {
        Object a9 = this.f6047a.a(new k(interfaceC1162i, this.f6048b, this.f6049c, this.f6050d), dVar);
        return a9 == Ib.a.f5345a ? a9 : Db.q.f3365a;
    }
}
