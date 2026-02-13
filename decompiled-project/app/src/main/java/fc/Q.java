package fc;

import a.AbstractC0672a;
import cc.InterfaceC0937i0;
import ec.C1116a;
import gc.AbstractC1208c;
import gc.AbstractC1212g;
import gc.C1206a;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public abstract class Q {

    /* renamed from: a */
    public static final R7.a f17098a = new R7.a("NO_VALUE", 28);

    /* renamed from: b */
    public static final R7.a f17099b;

    /* renamed from: c */
    public static final R7.a f17100c;

    static {
        int i7 = 28;
        f17099b = new R7.a("NONE", i7);
        f17100c = new R7.a("PENDING", i7);
    }

    public static final P a(int i7, int i10, int i11) {
        if (i7 < 0) {
            throw new IllegalArgumentException(h3.o.l(i7, "replay cannot be negative, but was ").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(h3.o.l(i10, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i7 <= 0 && i10 <= 0 && i11 != 1) {
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(X.c.A(i11)).toString());
        }
        int i12 = i10 + i7;
        if (i12 < 0) {
            i12 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return new P(i7, i12, i11);
    }

    public static final b0 c(Object obj) {
        if (obj == null) {
            obj = AbstractC1208c.f17506b;
        }
        return new b0(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(d0 d0Var, Rb.f fVar, Throwable th, Jb.c cVar) {
        C1166m c1166m;
        int i7;
        try {
            if (cVar instanceof C1166m) {
                C1166m c1166m2 = (C1166m) cVar;
                int i10 = c1166m2.f17159c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c1166m2.f17159c = i10 - Integer.MIN_VALUE;
                    c1166m = c1166m2;
                    Object obj = c1166m.f17158b;
                    Object obj2 = Ib.a.f5345a;
                    i7 = c1166m.f17159c;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        c1166m.f17157a = th;
                        c1166m.f17159c = 1;
                        if (fVar.a(d0Var, th, c1166m) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = c1166m.f17157a;
                        com.bumptech.glide.c.c0(obj);
                    }
                    return Db.q.f3365a;
                }
            }
            if (i7 != 0) {
            }
            return Db.q.f3365a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC0672a.c(th2, th);
            }
            throw th2;
        }
        c1166m = new Jb.c(cVar);
        Object obj3 = c1166m.f17158b;
        Object obj22 = Ib.a.f5345a;
        i7 = c1166m.f17159c;
    }

    public static final void e(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static InterfaceC1161h f(InterfaceC1161h interfaceC1161h, int i7) {
        int i10;
        if (i7 < 0 && i7 != -2 && i7 != -1) {
            throw new IllegalArgumentException(h3.o.l(i7, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i7 == -1) {
            i10 = 2;
            i7 = 0;
        } else {
            i10 = 1;
        }
        boolean z8 = interfaceC1161h instanceof gc.w;
        Hb.j jVar = Hb.j.f4919a;
        return z8 ? ((gc.w) interfaceC1161h).b(jVar, i7, i10) : new gc.i(interfaceC1161h, jVar, i7, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable g(InterfaceC1161h interfaceC1161h, InterfaceC1162i interfaceC1162i, Jb.c cVar) {
        r rVar;
        int i7;
        Throwable th;
        kotlin.jvm.internal.v vVar;
        Throwable th2;
        InterfaceC0937i0 interfaceC0937i0;
        CancellationException cancellationException;
        if (cVar instanceof r) {
            r rVar2 = (r) cVar;
            int i10 = rVar2.f17180c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar2.f17180c = i10 - Integer.MIN_VALUE;
                rVar = rVar2;
                Object obj = rVar.f17179b;
                Ib.a aVar = Ib.a.f5345a;
                i7 = rVar.f17180c;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    ?? obj2 = new Object();
                    try {
                        InterfaceC1162i j = new A8.J(4, interfaceC1162i, obj2);
                        rVar.f17178a = obj2;
                        rVar.f17180c = 1;
                        if (interfaceC1161h.a(j, rVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        vVar = obj2;
                        th2 = (Throwable) vVar.f19134a;
                        if (th2 == null) {
                        }
                        interfaceC0937i0 = (InterfaceC0937i0) rVar.getContext().get(cc.B.f14467b);
                        if (interfaceC0937i0 == null) {
                        }
                        if (th2 != null) {
                        }
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = rVar.f17178a;
                    try {
                        com.bumptech.glide.c.c0(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = (Throwable) vVar.f19134a;
                        if (th2 == null && th2.equals(th)) {
                            throw th;
                        }
                        interfaceC0937i0 = (InterfaceC0937i0) rVar.getContext().get(cc.B.f14467b);
                        if (interfaceC0937i0 == null && interfaceC0937i0.isCancelled() && (cancellationException = interfaceC0937i0.getCancellationException()) != null && cancellationException.equals(th)) {
                            throw th;
                        }
                        if (th2 != null) {
                            return th;
                        }
                        if (th instanceof CancellationException) {
                            AbstractC0672a.c(th2, th);
                            throw th2;
                        }
                        AbstractC0672a.c(th, th2);
                        throw th;
                    }
                }
                return null;
            }
        }
        rVar = new Jb.c(cVar);
        Object obj3 = rVar.f17179b;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = rVar.f17180c;
        if (i7 != 0) {
        }
        return null;
    }

    public static final InterfaceC1161h h(InterfaceC1161h interfaceC1161h) {
        if (interfaceC1161h instanceof Z) {
            return interfaceC1161h;
        }
        if (!(interfaceC1161h instanceof C1160g)) {
            return new C1160g(interfaceC1161h);
        }
        ((C1160g) interfaceC1161h).getClass();
        return interfaceC1161h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0056, B:19:0x006b, B:21:0x0073, B:32:0x0047, B:35:0x0052), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0085 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(InterfaceC1162i interfaceC1162i, ec.t tVar, boolean z8, Hb.d dVar) {
        C1163j c1163j;
        int i7;
        C1116a c1116a;
        InterfaceC1162i interfaceC1162i2;
        C1116a c1116a2;
        Object b2;
        try {
            if (dVar instanceof C1163j) {
                C1163j c1163j2 = (C1163j) dVar;
                int i10 = c1163j2.f17153f;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c1163j2.f17153f = i10 - Integer.MIN_VALUE;
                    c1163j = c1163j2;
                    Object obj = c1163j.f17152e;
                    Object obj2 = Ib.a.f5345a;
                    i7 = c1163j.f17153f;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        if (interfaceC1162i instanceof d0) {
                            throw ((d0) interfaceC1162i).f17139a;
                        }
                        c1116a2 = tVar.iterator();
                        c1163j.f17148a = interfaceC1162i;
                        c1163j.f17149b = tVar;
                        c1163j.f17150c = c1116a2;
                        c1163j.f17151d = z8;
                        c1163j.f17153f = 1;
                        b2 = c1116a2.b(c1163j);
                        if (b2 == obj2) {
                        }
                    } else if (i7 == 1) {
                        z8 = c1163j.f17151d;
                        c1116a = c1163j.f17150c;
                        tVar = c1163j.f17149b;
                        InterfaceC1162i interfaceC1162i3 = c1163j.f17148a;
                        com.bumptech.glide.c.c0(obj);
                        interfaceC1162i2 = interfaceC1162i3;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z8 = c1163j.f17151d;
                        c1116a = c1163j.f17150c;
                        tVar = c1163j.f17149b;
                        InterfaceC1162i interfaceC1162i4 = c1163j.f17148a;
                        com.bumptech.glide.c.c0(obj);
                        InterfaceC1162i interfaceC1162i5 = interfaceC1162i4;
                        c1116a2 = c1116a;
                        interfaceC1162i = interfaceC1162i5;
                        c1163j.f17148a = interfaceC1162i;
                        c1163j.f17149b = tVar;
                        c1163j.f17150c = c1116a2;
                        c1163j.f17151d = z8;
                        c1163j.f17153f = 1;
                        b2 = c1116a2.b(c1163j);
                        if (b2 == obj2) {
                            return obj2;
                        }
                        interfaceC1162i2 = interfaceC1162i;
                        c1116a = c1116a2;
                        obj = b2;
                        if (((Boolean) obj).booleanValue()) {
                            if (z8) {
                                tVar.cancel(null);
                            }
                            return Db.q.f3365a;
                        }
                        Object c10 = c1116a.c();
                        c1163j.f17148a = interfaceC1162i2;
                        c1163j.f17149b = tVar;
                        c1163j.f17150c = c1116a;
                        c1163j.f17151d = z8;
                        c1163j.f17153f = 2;
                        Object emit = interfaceC1162i2.emit(c10, c1163j);
                        interfaceC1162i5 = interfaceC1162i2;
                        if (emit == obj2) {
                            return obj2;
                        }
                        c1116a2 = c1116a;
                        interfaceC1162i = interfaceC1162i5;
                        c1163j.f17148a = interfaceC1162i;
                        c1163j.f17149b = tVar;
                        c1163j.f17150c = c1116a2;
                        c1163j.f17151d = z8;
                        c1163j.f17153f = 1;
                        b2 = c1116a2.b(c1163j);
                        if (b2 == obj2) {
                        }
                    }
                }
            }
            if (i7 != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z8) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    tVar.cancel(cancellationException);
                }
                throw th2;
            }
        }
        c1163j = new Jb.c(dVar);
        Object obj3 = c1163j.f17152e;
        Object obj22 = Ib.a.f5345a;
        i7 = c1163j.f17153f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(InterfaceC1161h interfaceC1161h, Jb.c cVar) {
        C1153B c1153b;
        Object obj;
        int i7;
        Object obj2;
        kotlin.jvm.internal.v vVar;
        C1206a e2;
        A8.F f4;
        if (cVar instanceof C1153B) {
            C1153B c1153b2 = (C1153B) cVar;
            int i10 = c1153b2.f17052d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1153b2.f17052d = i10 - Integer.MIN_VALUE;
                c1153b = c1153b2;
                Object obj3 = c1153b.f17051c;
                obj = Ib.a.f5345a;
                i7 = c1153b.f17052d;
                obj2 = AbstractC1208c.f17506b;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj3);
                    ?? obj4 = new Object();
                    obj4.f19134a = obj2;
                    A8.F f10 = new A8.F(obj4, 3);
                    try {
                        c1153b.f17049a = obj4;
                        c1153b.f17050b = f10;
                        c1153b.f17052d = 1;
                        if (interfaceC1161h.a(f10, c1153b) != obj) {
                            vVar = obj4;
                        }
                    } catch (C1206a e10) {
                        vVar = obj4;
                        e2 = e10;
                        f4 = f10;
                        if (e2.f17500a != f4) {
                            throw e2;
                        }
                        obj = vVar.f19134a;
                        if (obj == obj2) {
                        }
                        return obj;
                    }
                    return obj;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f4 = c1153b.f17050b;
                vVar = c1153b.f17049a;
                try {
                    com.bumptech.glide.c.c0(obj3);
                } catch (C1206a e11) {
                    e2 = e11;
                    if (e2.f17500a != f4) {
                    }
                    obj = vVar.f19134a;
                    if (obj == obj2) {
                    }
                    return obj;
                }
                obj = vVar.f19134a;
                if (obj == obj2) {
                    throw new NoSuchElementException("Expected at least one element");
                }
                return obj;
            }
        }
        c1153b = new Jb.c(cVar);
        Object obj32 = c1153b.f17051c;
        obj = Ib.a.f5345a;
        i7 = c1153b.f17052d;
        obj2 = AbstractC1208c.f17506b;
        if (i7 != 0) {
        }
        obj = vVar.f19134a;
        if (obj == obj2) {
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(InterfaceC1161h interfaceC1161h, Rb.e eVar, Jb.c cVar) {
        C c10;
        Object obj;
        int i7;
        Object obj2;
        Rb.e eVar2;
        kotlin.jvm.internal.v vVar;
        C1206a e2;
        A8.J j;
        if (cVar instanceof C) {
            C c11 = (C) cVar;
            int i10 = c11.f17057e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11.f17057e = i10 - Integer.MIN_VALUE;
                c10 = c11;
                Object obj3 = c10.f17056d;
                obj = Ib.a.f5345a;
                i7 = c10.f17057e;
                obj2 = AbstractC1208c.f17506b;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj3);
                    ?? obj4 = new Object();
                    obj4.f19134a = obj2;
                    A8.J j10 = new A8.J(eVar, (kotlin.jvm.internal.v) obj4);
                    try {
                        c10.f17053a = eVar;
                        c10.f17054b = obj4;
                        c10.f17055c = j10;
                        c10.f17057e = 1;
                        if (interfaceC1161h.a(j10, c10) != obj) {
                            eVar2 = eVar;
                            vVar = obj4;
                        }
                    } catch (C1206a e10) {
                        eVar2 = eVar;
                        vVar = obj4;
                        e2 = e10;
                        j = j10;
                        if (e2.f17500a != j) {
                            throw e2;
                        }
                        obj = vVar.f19134a;
                        if (obj == obj2) {
                        }
                        return obj;
                    }
                    return obj;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = c10.f17055c;
                vVar = c10.f17054b;
                eVar2 = c10.f17053a;
                try {
                    com.bumptech.glide.c.c0(obj3);
                } catch (C1206a e11) {
                    e2 = e11;
                    if (e2.f17500a != j) {
                    }
                    obj = vVar.f19134a;
                    if (obj == obj2) {
                    }
                    return obj;
                }
                obj = vVar.f19134a;
                if (obj == obj2) {
                    throw new NoSuchElementException("Expected at least one element matching the predicate " + eVar2);
                }
                return obj;
            }
        }
        c10 = new Jb.c(cVar);
        Object obj32 = c10.f17056d;
        obj = Ib.a.f5345a;
        i7 = c10.f17057e;
        obj2 = AbstractC1208c.f17506b;
        if (i7 != 0) {
        }
        obj = vVar.f19134a;
        if (obj == obj2) {
        }
        return obj;
    }

    public static final InterfaceC1161h l(M m10, Hb.i iVar, int i7, int i10) {
        return ((i7 == 0 || i7 == -3) && i10 == 1) ? m10 : new gc.i(m10, iVar, i7, i10);
    }

    public static final L m(InterfaceC1161h interfaceC1161h, cc.E e2, Y y10, Object obj) {
        q3.e eVar;
        AbstractC1212g abstractC1212g;
        InterfaceC1161h f4;
        int i7 = 29;
        ec.h.f16890r.getClass();
        ec.g gVar = ec.g.f16888a;
        if (!(interfaceC1161h instanceof AbstractC1212g) || (f4 = (abstractC1212g = (AbstractC1212g) interfaceC1161h).f()) == null) {
            eVar = new q3.e(i7, interfaceC1161h, Hb.j.f4919a);
        } else {
            if (abstractC1212g.f17516b != -3) {
            }
            eVar = new q3.e(i7, f4, abstractC1212g.f17515a);
        }
        b0 c10 = c(obj);
        cc.F.A(e2, (Hb.i) eVar.f23377c, y10.equals(U.f17107a) ? 1 : 4, new F(y10, (InterfaceC1161h) eVar.f23376b, c10, obj, null));
        return new L(c10);
    }
}
