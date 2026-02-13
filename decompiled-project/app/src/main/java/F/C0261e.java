package F;

import cc.C0944m;

/* renamed from: F.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261e implements c0.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3971a;

    /* renamed from: b, reason: collision with root package name */
    public C0944m f3972b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Jb.c cVar) {
        C0260d c0260d;
        int i7;
        C0944m c0944m;
        if (cVar instanceof C0260d) {
            c0260d = (C0260d) cVar;
            int i10 = c0260d.f3970d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0260d.f3970d = i10 - Integer.MIN_VALUE;
                Object obj = c0260d.f3968b;
                Ib.a aVar = Ib.a.f5345a;
                i7 = c0260d.f3970d;
                Db.q qVar = Db.q.f3365a;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    if (!this.f3971a) {
                        C0944m c0944m2 = this.f3972b;
                        c0260d.f3967a = c0944m2;
                        c0260d.f3970d = 1;
                        C0944m c0944m3 = new C0944m(1, com.bumptech.glide.c.F(c0260d));
                        c0944m3.s();
                        this.f3972b = c0944m3;
                        if (c0944m3.r() == aVar) {
                            return aVar;
                        }
                        c0944m = c0944m2;
                    }
                    return qVar;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0944m = c0260d.f3967a;
                com.bumptech.glide.c.c0(obj);
                if (c0944m != null) {
                    c0944m.resumeWith(qVar);
                }
                return qVar;
            }
        }
        c0260d = new C0260d(this, cVar);
        Object obj2 = c0260d.f3968b;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = c0260d.f3970d;
        Db.q qVar2 = Db.q.f3365a;
        if (i7 != 0) {
        }
        if (c0944m != null) {
        }
        return qVar2;
    }
}
