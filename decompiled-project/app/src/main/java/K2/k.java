package K2;

import I2.E;
import fc.InterfaceC1162i;

/* loaded from: classes.dex */
public final class k implements InterfaceC1162i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1162i f6043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f6044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6045c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Rb.c f6046d;

    public k(InterfaceC1162i interfaceC1162i, E e2, boolean z8, Rb.c cVar) {
        this.f6043a = interfaceC1162i;
        this.f6044b = e2;
        this.f6045c = z8;
        this.f6046d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // fc.InterfaceC1162i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Hb.d dVar) {
        j jVar;
        Object obj2;
        Ib.a aVar;
        int i7;
        InterfaceC1162i interfaceC1162i;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.f6040b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f6040b = i10 - Integer.MIN_VALUE;
                obj2 = jVar.f6039a;
                aVar = Ib.a.f5345a;
                i7 = jVar.f6040b;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj2);
                    interfaceC1162i = this.f6043a;
                    jVar.f6041c = interfaceC1162i;
                    jVar.f6040b = 1;
                    obj2 = P2.j.m(this.f6044b, true, this.f6045c, this.f6046d, jVar);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.c.c0(obj2);
                        return Db.q.f3365a;
                    }
                    interfaceC1162i = jVar.f6041c;
                    com.bumptech.glide.c.c0(obj2);
                }
                jVar.f6041c = null;
                jVar.f6040b = 2;
                if (interfaceC1162i.emit(obj2, jVar) == aVar) {
                    return aVar;
                }
                return Db.q.f3365a;
            }
        }
        jVar = new j(this, dVar);
        obj2 = jVar.f6039a;
        aVar = Ib.a.f5345a;
        i7 = jVar.f6040b;
        if (i7 != 0) {
        }
        jVar.f6041c = null;
        jVar.f6040b = 2;
        if (interfaceC1162i.emit(obj2, jVar) == aVar) {
        }
        return Db.q.f3365a;
    }
}
