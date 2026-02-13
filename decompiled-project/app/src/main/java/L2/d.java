package L2;

import I2.L;
import I2.M;
import Jb.i;
import K2.r;
import K2.y;

/* loaded from: classes.dex */
public final class d implements M, y {

    /* renamed from: a, reason: collision with root package name */
    public final a f6271a;

    public d(a aVar) {
        this.f6271a = aVar;
    }

    @Override // I2.M
    public final Object a(i iVar) {
        return Boolean.valueOf(this.f6271a.f6264a.u());
    }

    @Override // I2.InterfaceC0333w
    public final Object b(String str, Rb.c cVar, Jb.c cVar2) {
        g R10 = this.f6271a.R(str);
        try {
            Object invoke = cVar.invoke(R10);
            Tb.a.g(R10, null);
            return invoke;
        } finally {
        }
    }

    @Override // K2.y
    public final T2.a c() {
        return this.f6271a;
    }

    @Override // I2.M
    public final Object d(L l10, Rb.e eVar, i iVar) {
        return e(l10, eVar, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(L l10, Rb.e eVar, Jb.c cVar) {
        c cVar2;
        int i7;
        d dVar;
        Throwable th;
        U2.a aVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f6270e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f6270e = i10 - Integer.MIN_VALUE;
                Object obj = cVar2.f6268c;
                Object obj2 = Ib.a.f5345a;
                i7 = cVar2.f6270e;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    U2.a aVar2 = this.f6271a.f6264a;
                    aVar2.u();
                    int ordinal = l10.ordinal();
                    if (ordinal == 0) {
                        aVar2.r();
                    } else if (ordinal == 1) {
                        aVar2.D();
                    } else {
                        if (ordinal != 2) {
                            throw new Db.d(1);
                        }
                        aVar2.i();
                    }
                    try {
                        Object rVar = new r(this, 1);
                        cVar2.f6266a = this;
                        cVar2.f6267b = aVar2;
                        cVar2.f6270e = 1;
                        Object invoke = eVar.invoke(rVar, cVar2);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        dVar = this;
                        obj = invoke;
                        aVar = aVar2;
                    } catch (Throwable th2) {
                        dVar = this;
                        th = th2;
                        aVar = aVar2;
                        aVar.h();
                        if (!aVar.u()) {
                            dVar.getClass();
                        }
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = cVar2.f6267b;
                    dVar = cVar2.f6266a;
                    try {
                        com.bumptech.glide.c.c0(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        aVar.h();
                        if (!aVar.u()) {
                        }
                        throw th;
                    }
                }
                aVar.C();
                aVar.h();
                if (!aVar.u()) {
                    dVar.getClass();
                }
                return obj;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj3 = cVar2.f6268c;
        Object obj22 = Ib.a.f5345a;
        i7 = cVar2.f6270e;
        if (i7 != 0) {
        }
        aVar.C();
        aVar.h();
        if (!aVar.u()) {
        }
        return obj3;
    }
}
