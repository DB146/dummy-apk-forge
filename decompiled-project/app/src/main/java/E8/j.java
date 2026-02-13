package E8;

import Db.q;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final o f3784a;

    /* renamed from: b, reason: collision with root package name */
    public final o f3785b;

    public j(o localOverrideSettings, o remoteSettings) {
        kotlin.jvm.internal.l.e(localOverrideSettings, "localOverrideSettings");
        kotlin.jvm.internal.l.e(remoteSettings, "remoteSettings");
        this.f3784a = localOverrideSettings;
        this.f3785b = remoteSettings;
    }

    public final double a() {
        Double b2 = this.f3784a.b();
        if (b2 != null) {
            double doubleValue = b2.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double b10 = this.f3785b.b();
        if (b10 != null) {
            double doubleValue2 = b10.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Jb.c cVar) {
        i iVar;
        Ib.a aVar;
        int i7;
        j jVar;
        o oVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.f3783d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f3783d = i10 - Integer.MIN_VALUE;
                Object obj = iVar.f3781b;
                aVar = Ib.a.f5345a;
                i7 = iVar.f3783d;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    iVar.f3780a = this;
                    iVar.f3783d = 1;
                    if (this.f3784a.d(iVar) == aVar) {
                        return aVar;
                    }
                    jVar = this;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.c.c0(obj);
                        return q.f3365a;
                    }
                    jVar = iVar.f3780a;
                    com.bumptech.glide.c.c0(obj);
                }
                oVar = jVar.f3785b;
                iVar.f3780a = null;
                iVar.f3783d = 2;
                if (oVar.d(iVar) == aVar) {
                    return aVar;
                }
                return q.f3365a;
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.f3781b;
        aVar = Ib.a.f5345a;
        i7 = iVar.f3783d;
        if (i7 != 0) {
        }
        oVar = jVar.f3785b;
        iVar.f3780a = null;
        iVar.f3783d = 2;
        if (oVar.d(iVar) == aVar) {
        }
        return q.f3365a;
    }
}
