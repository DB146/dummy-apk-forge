package K2;

import I2.L;
import I2.M;
import a.AbstractC0672a;
import android.database.SQLException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class x implements M, y {

    /* renamed from: a, reason: collision with root package name */
    public final i f6104a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6105b;

    /* renamed from: c, reason: collision with root package name */
    public final Eb.l f6106c = new Eb.l();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f6107d = new AtomicBoolean(false);

    public x(i iVar, boolean z8) {
        this.f6104a = iVar;
        this.f6105b = z8;
    }

    @Override // I2.M
    public final Object a(Jb.i iVar) {
        if (this.f6107d.get()) {
            AbstractC0672a.s(21, "Connection is recycled");
            throw null;
        }
        C0379a c0379a = (C0379a) iVar.getContext().get(C0379a.f6007b);
        if (c0379a != null && c0379a.f6008a == this) {
            return Boolean.valueOf(!this.f6106c.isEmpty());
        }
        AbstractC0672a.s(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // I2.InterfaceC0333w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Rb.c cVar, Jb.c cVar2) {
        w wVar;
        int i7;
        i iVar;
        x xVar;
        try {
            try {
                if (cVar2 instanceof w) {
                    wVar = (w) cVar2;
                    int i10 = wVar.f6103u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        wVar.f6103u = i10 - Integer.MIN_VALUE;
                        Object obj = wVar.f6101e;
                        Ib.a aVar = Ib.a.f5345a;
                        i7 = wVar.f6103u;
                        if (i7 != 0) {
                            com.bumptech.glide.c.c0(obj);
                            if (this.f6107d.get()) {
                                AbstractC0672a.s(21, "Connection is recycled");
                                throw null;
                            }
                            C0379a c0379a = (C0379a) wVar.getContext().get(C0379a.f6007b);
                            if (c0379a == null || c0379a.f6008a != this) {
                                AbstractC0672a.s(21, "Attempted to use connection on a different coroutine");
                                throw null;
                            }
                            wVar.f6097a = this;
                            wVar.f6098b = str;
                            wVar.f6099c = cVar;
                            iVar = this.f6104a;
                            wVar.f6100d = iVar;
                            wVar.f6103u = 1;
                            if (iVar.f6036b.n(wVar) == aVar) {
                                return aVar;
                            }
                            xVar = this;
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i iVar2 = wVar.f6100d;
                            cVar = wVar.f6099c;
                            String str2 = wVar.f6098b;
                            xVar = wVar.f6097a;
                            com.bumptech.glide.c.c0(obj);
                            iVar = iVar2;
                            str = str2;
                        }
                        q qVar = new q(xVar, xVar.f6104a.R(str));
                        Object invoke = cVar.invoke(qVar);
                        Tb.a.g(qVar, null);
                        return invoke;
                    }
                }
                Object invoke2 = cVar.invoke(qVar);
                Tb.a.g(qVar, null);
                return invoke2;
            } finally {
            }
            q qVar2 = new q(xVar, xVar.f6104a.R(str));
        } finally {
            iVar.l(null);
        }
        wVar = new w(this, cVar2);
        Object obj2 = wVar.f6101e;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = wVar.f6103u;
        if (i7 != 0) {
        }
    }

    @Override // K2.y
    public final T2.a c() {
        return this.f6104a;
    }

    @Override // I2.M
    public final Object d(L l10, Rb.e eVar, Jb.i iVar) {
        if (this.f6107d.get()) {
            AbstractC0672a.s(21, "Connection is recycled");
            throw null;
        }
        C0379a c0379a = (C0379a) iVar.getContext().get(C0379a.f6007b);
        if (c0379a != null && c0379a.f6008a == this) {
            return g(l10, eVar, iVar);
        }
        AbstractC0672a.s(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[Catch: all -> 0x006e, TRY_ENTER, TryCatch #0 {all -> 0x006e, blocks: (B:12:0x0051, B:15:0x005d, B:20:0x0068, B:21:0x0097, B:25:0x0070, B:26:0x0076, B:27:0x0077, B:28:0x007d, B:29:0x0083), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:12:0x0051, B:15:0x005d, B:20:0x0068, B:21:0x0097, B:25:0x0070, B:26:0x0076, B:27:0x0077, B:28:0x007d, B:29:0x0083), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(L l10, Jb.c cVar) {
        t tVar;
        int i7;
        i iVar;
        x xVar;
        boolean isEmpty;
        try {
            if (cVar instanceof t) {
                tVar = (t) cVar;
                int i10 = tVar.f6084f;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    tVar.f6084f = i10 - Integer.MIN_VALUE;
                    Object obj = tVar.f6082d;
                    Ib.a aVar = Ib.a.f5345a;
                    i7 = tVar.f6084f;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        tVar.f6079a = this;
                        tVar.f6080b = l10;
                        iVar = this.f6104a;
                        tVar.f6081c = iVar;
                        tVar.f6084f = 1;
                        if (iVar.f6036b.n(tVar) == aVar) {
                            return aVar;
                        }
                        xVar = this;
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i iVar2 = tVar.f6081c;
                        L l11 = tVar.f6080b;
                        xVar = tVar.f6079a;
                        com.bumptech.glide.c.c0(obj);
                        iVar = iVar2;
                        l10 = l11;
                    }
                    Eb.l lVar = xVar.f6106c;
                    int i11 = lVar.f3884c;
                    isEmpty = lVar.isEmpty();
                    i iVar3 = xVar.f6104a;
                    if (isEmpty) {
                        AbstractC0672a.h(iVar3, "SAVEPOINT '" + i11 + '\'');
                    } else {
                        int ordinal = l10.ordinal();
                        if (ordinal == 0) {
                            AbstractC0672a.h(iVar3, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            AbstractC0672a.h(iVar3, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                throw new Db.d(1);
                            }
                            AbstractC0672a.h(iVar3, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                    }
                    lVar.addLast(new s(i11));
                    Db.q qVar = Db.q.f3365a;
                    iVar.l(null);
                    return qVar;
                }
            }
            Eb.l lVar2 = xVar.f6106c;
            int i112 = lVar2.f3884c;
            isEmpty = lVar2.isEmpty();
            i iVar32 = xVar.f6104a;
            if (isEmpty) {
            }
            lVar2.addLast(new s(i112));
            Db.q qVar2 = Db.q.f3365a;
            iVar.l(null);
            return qVar2;
        } catch (Throwable th) {
            iVar.l(null);
            throw th;
        }
        tVar = new t(this, cVar);
        Object obj2 = tVar.f6082d;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = tVar.f6084f;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:12:0x0052, B:14:0x005a, B:17:0x0066, B:19:0x006f, B:20:0x00ac, B:24:0x0077, B:25:0x008c, B:27:0x0092, B:28:0x0098, B:29:0x00b2, B:30:0x00b9), top: B:11:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2 A[Catch: all -> 0x0075, TRY_ENTER, TryCatch #0 {all -> 0x0075, blocks: (B:12:0x0052, B:14:0x005a, B:17:0x0066, B:19:0x006f, B:20:0x00ac, B:24:0x0077, B:25:0x008c, B:27:0x0092, B:28:0x0098, B:29:0x00b2, B:30:0x00b9), top: B:11:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z8, Jb.c cVar) {
        u uVar;
        int i7;
        x xVar;
        i iVar;
        Eb.l lVar;
        try {
            if (cVar instanceof u) {
                uVar = (u) cVar;
                int i10 = uVar.f6090f;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    uVar.f6090f = i10 - Integer.MIN_VALUE;
                    Object obj = uVar.f6088d;
                    Ib.a aVar = Ib.a.f5345a;
                    i7 = uVar.f6090f;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        uVar.f6085a = this;
                        i iVar2 = this.f6104a;
                        uVar.f6086b = iVar2;
                        uVar.f6087c = z8;
                        uVar.f6090f = 1;
                        if (iVar2.f6036b.n(uVar) == aVar) {
                            return aVar;
                        }
                        xVar = this;
                        iVar = iVar2;
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z8 = uVar.f6087c;
                        iVar = uVar.f6086b;
                        xVar = uVar.f6085a;
                        com.bumptech.glide.c.c0(obj);
                    }
                    lVar = xVar.f6106c;
                    if (!lVar.isEmpty()) {
                        throw new IllegalStateException("Not in a transaction");
                    }
                    s sVar = (s) Eb.o.k0(lVar);
                    i iVar3 = xVar.f6104a;
                    if (z8) {
                        sVar.getClass();
                        if (lVar.isEmpty()) {
                            AbstractC0672a.h(iVar3, "END TRANSACTION");
                        } else {
                            AbstractC0672a.h(iVar3, "RELEASE SAVEPOINT '" + sVar.f6078a + '\'');
                        }
                    } else if (lVar.isEmpty()) {
                        AbstractC0672a.h(iVar3, "ROLLBACK TRANSACTION");
                    } else {
                        AbstractC0672a.h(iVar3, "ROLLBACK TRANSACTION TO SAVEPOINT '" + sVar.f6078a + '\'');
                    }
                    Db.q qVar = Db.q.f3365a;
                    iVar.l(null);
                    return qVar;
                }
            }
            lVar = xVar.f6106c;
            if (!lVar.isEmpty()) {
            }
        } catch (Throwable th) {
            iVar.l(null);
            throw th;
        }
        uVar = new u(this, cVar);
        Object obj2 = uVar.f6088d;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = uVar.f6090f;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(L l10, Rb.e eVar, Jb.c cVar) {
        v vVar;
        Object obj;
        Ib.a aVar;
        int i7;
        x xVar;
        x xVar2;
        int i10;
        SQLException e2;
        Throwable th;
        try {
            if (cVar instanceof v) {
                vVar = (v) cVar;
                int i11 = vVar.f6096f;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    vVar.f6096f = i11 - Integer.MIN_VALUE;
                    obj = vVar.f6094d;
                    aVar = Ib.a.f5345a;
                    i7 = vVar.f6096f;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        if (l10 == null) {
                            l10 = L.f5057a;
                        }
                        vVar.f6091a = this;
                        vVar.f6092b = eVar;
                        vVar.f6096f = 1;
                        if (e(l10, vVar) == aVar) {
                            return aVar;
                        }
                        xVar = this;
                    } else if (i7 == 1) {
                        eVar = (Rb.e) vVar.f6092b;
                        xVar = (x) vVar.f6091a;
                        com.bumptech.glide.c.c0(obj);
                    } else {
                        if (i7 == 2) {
                            i10 = vVar.f6093c;
                            xVar2 = (x) vVar.f6091a;
                            try {
                                com.bumptech.glide.c.c0(obj);
                                boolean z8 = i10 != 0;
                                vVar.f6091a = obj;
                                vVar.f6096f = 3;
                                return xVar2.f(z8, vVar) != aVar ? aVar : obj;
                            } catch (Throwable th2) {
                                th = th2;
                                xVar = xVar2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    try {
                                        vVar.f6091a = th;
                                        vVar.f6092b = th3;
                                        vVar.f6096f = 5;
                                        if (xVar.f(false, vVar) == aVar) {
                                            return aVar;
                                        }
                                        throw th3;
                                    } catch (SQLException e10) {
                                        e2 = e10;
                                        th = th3;
                                        if (th != null) {
                                            throw e2;
                                        }
                                        AbstractC0672a.c(th, e2);
                                        throw th;
                                    }
                                }
                            }
                        }
                        if (i7 == 3) {
                            Object obj2 = vVar.f6091a;
                            com.bumptech.glide.c.c0(obj);
                            return obj2;
                        }
                        if (i7 == 4) {
                            Object obj3 = vVar.f6091a;
                            com.bumptech.glide.c.c0(obj);
                            return obj3;
                        }
                        if (i7 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) vVar.f6092b;
                        th = (Throwable) vVar.f6091a;
                        try {
                            com.bumptech.glide.c.c0(obj);
                            throw th;
                        } catch (SQLException e11) {
                            e2 = e11;
                            if (th != null) {
                            }
                        }
                    }
                    r rVar = new r(xVar, 0);
                    vVar.f6091a = xVar;
                    vVar.f6092b = null;
                    vVar.f6093c = 1;
                    vVar.f6096f = 2;
                    obj = eVar.invoke(rVar, vVar);
                    if (obj != aVar) {
                        return aVar;
                    }
                    xVar2 = xVar;
                    i10 = 1;
                    if (i10 != 0) {
                    }
                    vVar.f6091a = obj;
                    vVar.f6096f = 3;
                    if (xVar2.f(z8, vVar) != aVar) {
                    }
                }
            }
            r rVar2 = new r(xVar, 0);
            vVar.f6091a = xVar;
            vVar.f6092b = null;
            vVar.f6093c = 1;
            vVar.f6096f = 2;
            obj = eVar.invoke(rVar2, vVar);
            if (obj != aVar) {
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
        vVar = new v(this, cVar);
        obj = vVar.f6094d;
        aVar = Ib.a.f5345a;
        i7 = vVar.f6096f;
        if (i7 != 0) {
        }
    }
}
