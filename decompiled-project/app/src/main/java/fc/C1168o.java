package fc;

import gc.C1205A;

/* renamed from: fc.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1168o implements InterfaceC1161h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1161h f17165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Jb.i f17166b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1168o(InterfaceC1161h interfaceC1161h, Rb.f fVar) {
        this.f17165a = interfaceC1161h;
        this.f17166b = (Jb.i) fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v4, types: [Jb.i, Rb.f] */
    /* JADX WARN: Type inference failed for: r9v6, types: [Jb.i, Rb.f] */
    @Override // fc.InterfaceC1161h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(InterfaceC1162i interfaceC1162i, Hb.d dVar) {
        C1167n c1167n;
        Ib.a aVar;
        int i7;
        C1168o c1168o;
        d0 d0Var;
        ?? r22;
        C1205A c1205a;
        Throwable th;
        C1205A c1205a2;
        ?? r92;
        try {
            if (dVar instanceof C1167n) {
                c1167n = (C1167n) dVar;
                int i10 = c1167n.f17161b;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c1167n.f17161b = i10 - Integer.MIN_VALUE;
                    Object obj = c1167n.f17160a;
                    aVar = Ib.a.f5345a;
                    i7 = c1167n.f17161b;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        try {
                            InterfaceC1161h interfaceC1161h = this.f17165a;
                            c1167n.f17163d = this;
                            c1167n.f17164e = interfaceC1162i;
                            c1167n.f17161b = 1;
                            if (interfaceC1161h.a(interfaceC1162i, c1167n) == aVar) {
                                return aVar;
                            }
                            c1168o = this;
                        } catch (Throwable th2) {
                            th = th2;
                            c1168o = this;
                            d0Var = new d0(th);
                            r22 = c1168o.f17166b;
                            c1167n.f17163d = th;
                            c1167n.f17164e = null;
                            c1167n.f17161b = 2;
                            if (Q.d(d0Var, r22, th, c1167n) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                    } else {
                        if (i7 != 1) {
                            if (i7 == 2) {
                                Throwable th3 = (Throwable) c1167n.f17163d;
                                com.bumptech.glide.c.c0(obj);
                                throw th3;
                            }
                            if (i7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1205a2 = (C1205A) c1167n.f17163d;
                            try {
                                com.bumptech.glide.c.c0(obj);
                                c1205a2.releaseIntercepted();
                                return Db.q.f3365a;
                            } catch (Throwable th4) {
                                th = th4;
                                c1205a2.releaseIntercepted();
                                throw th;
                            }
                        }
                        interfaceC1162i = c1167n.f17164e;
                        c1168o = (C1168o) c1167n.f17163d;
                        try {
                            com.bumptech.glide.c.c0(obj);
                        } catch (Throwable th5) {
                            th = th5;
                            d0Var = new d0(th);
                            r22 = c1168o.f17166b;
                            c1167n.f17163d = th;
                            c1167n.f17164e = null;
                            c1167n.f17161b = 2;
                            if (Q.d(d0Var, r22, th, c1167n) != aVar) {
                            }
                        }
                    }
                    c1205a = new C1205A(interfaceC1162i, c1167n.getContext());
                    r92 = c1168o.f17166b;
                    c1167n.f17163d = c1205a;
                    c1167n.f17164e = null;
                    c1167n.f17161b = 3;
                    if (r92.a(c1205a, null, c1167n) != aVar) {
                        return aVar;
                    }
                    c1205a2 = c1205a;
                    c1205a2.releaseIntercepted();
                    return Db.q.f3365a;
                }
            }
            r92 = c1168o.f17166b;
            c1167n.f17163d = c1205a;
            c1167n.f17164e = null;
            c1167n.f17161b = 3;
            if (r92.a(c1205a, null, c1167n) != aVar) {
            }
        } catch (Throwable th6) {
            th = th6;
            c1205a2 = c1205a;
            c1205a2.releaseIntercepted();
            throw th;
        }
        c1167n = new C1167n(this, dVar);
        Object obj2 = c1167n.f17160a;
        aVar = Ib.a.f5345a;
        i7 = c1167n.f17161b;
        if (i7 != 0) {
        }
        c1205a = new C1205A(interfaceC1162i, c1167n.getContext());
    }
}
