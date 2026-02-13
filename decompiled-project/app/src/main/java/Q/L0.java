package Q;

import fc.InterfaceC1162i;

/* loaded from: classes.dex */
public final class L0 implements InterfaceC1162i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0497j0 f8328b;

    public /* synthetic */ L0(C0497j0 c0497j0, int i7) {
        this.f8327a = i7;
        this.f8328b = c0497j0;
    }

    @Override // fc.InterfaceC1162i
    public final Object emit(Object obj, Hb.d dVar) {
        switch (this.f8327a) {
            case 0:
                this.f8328b.setValue(obj);
                return Db.q.f3365a;
            default:
                this.f8328b.setValue(obj);
                return Db.q.f3365a;
        }
    }
}
