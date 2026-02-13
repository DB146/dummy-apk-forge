package K2;

import A9.N2;
import a.AbstractC0672a;
import android.database.SQLException;
import bc.C0849a;
import bc.EnumC0851c;
import cc.F;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h implements InterfaceC0380b {

    /* renamed from: a, reason: collision with root package name */
    public final p f6030a;

    /* renamed from: b, reason: collision with root package name */
    public final p f6031b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadLocal f6032c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f6033d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6034e;

    public h(q3.s sVar) {
        this.f6032c = new ThreadLocal();
        this.f6033d = new AtomicBoolean(false);
        int i7 = C0849a.f13994d;
        this.f6034e = Tb.a.M(30, EnumC0851c.f13999d);
        p pVar = new p(1, new N2(sVar, 10));
        this.f6030a = pVar;
        this.f6031b = pVar;
    }

    public h(final q3.s sVar, final String fileName, int i7) {
        final int i10 = 1;
        kotlin.jvm.internal.l.e(fileName, "fileName");
        this.f6032c = new ThreadLocal();
        final int i11 = 0;
        this.f6033d = new AtomicBoolean(false);
        int i12 = C0849a.f13994d;
        this.f6034e = Tb.a.M(30, EnumC0851c.f13999d);
        if (i7 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        this.f6030a = new p(i7, new Rb.a() { // from class: K2.c
            @Override // Rb.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        T2.a d10 = sVar.d(fileName);
                        AbstractC0672a.h(d10, "PRAGMA query_only = 1");
                        return d10;
                    default:
                        return sVar.d(fileName);
                }
            }
        });
        this.f6031b = new p(1, new Rb.a() { // from class: K2.c
            @Override // Rb.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        T2.a d10 = sVar.d(fileName);
                        AbstractC0672a.h(d10, "PRAGMA query_only = 1");
                        return d10;
                    default:
                        return sVar.d(fileName);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f6033d.compareAndSet(false, true)) {
            this.f6030a.c();
            this.f6031b.c();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|(1:(2:74|75)(3:(1:(3:12|13|14)(2:54|55))(7:56|57|58|59|(1:71)(1:62)|63|(2:65|(1:67)(1:68))(2:69|70))|32|33))(2:76|(3:78|(2:80|(1:82)(1:83))|(1:(3:90|(2:92|(1:94))(2:95|(1:97))|75)(2:88|89))(5:(1:99)(1:109)|100|101|102|(1:104)(6:105|59|(0)|71|63|(0)(0))))(2:110|111))|16|17|(3:19|(2:23|24)|21)|27))|112|6|(0)(0)|16|17|(0)|27|(1:(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0173 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #4 {all -> 0x0189, blocks: (B:17:0x016d, B:19:0x0173, B:24:0x017f, B:21:0x0182), top: B:16:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #5 {all -> 0x006c, blocks: (B:58:0x0067, B:59:0x0113, B:63:0x0131, B:65:0x013c, B:69:0x018a, B:70:0x0191), top: B:57:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018a A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #5 {all -> 0x006c, blocks: (B:58:0x0067, B:59:0x0113, B:63:0x0131, B:65:0x013c, B:69:0x018a, B:70:0x0191), top: B:57:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [K2.d] */
    @Override // K2.InterfaceC0380b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(boolean z8, Rb.e eVar, Jb.c cVar) {
        e eVar2;
        int i7;
        Throwable th;
        p pVar;
        kotlin.jvm.internal.v vVar;
        Rb.e eVar3;
        p pVar2;
        kotlin.jvm.internal.v vVar2;
        Hb.i context;
        h hVar;
        Object obj;
        kotlin.jvm.internal.v vVar3;
        x xVar;
        final boolean z10 = z8;
        if (cVar instanceof e) {
            eVar2 = (e) cVar;
            int i10 = eVar2.f6023x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar2.f6023x = i10 - Integer.MIN_VALUE;
                Object obj2 = eVar2.f6021v;
                Ib.a aVar = Ib.a.f5345a;
                i7 = eVar2.f6023x;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj2);
                    if (this.f6033d.get()) {
                        AbstractC0672a.s(21, "Connection pool is closed");
                        throw null;
                    }
                    ThreadLocal threadLocal = this.f6032c;
                    x xVar2 = (x) threadLocal.get();
                    U9.i iVar = C0379a.f6007b;
                    if (xVar2 == null) {
                        C0379a c0379a = (C0379a) eVar2.getContext().get(iVar);
                        xVar2 = c0379a != null ? c0379a.f6008a : null;
                    }
                    if (xVar2 != null) {
                        if (!z10 && xVar2.f6105b) {
                            AbstractC0672a.s(1, "Cannot upgrade connection from reader to writer");
                            throw null;
                        }
                        if (eVar2.getContext().get(iVar) == null) {
                            C0379a c0379a2 = new C0379a(xVar2);
                            kotlin.jvm.internal.l.e(threadLocal, "<this>");
                            Hb.i w10 = E6.b.w(c0379a2, new hc.y(xVar2, threadLocal));
                            f fVar = new f(eVar, xVar2, null);
                            eVar2.f6023x = 1;
                            obj2 = F.K(w10, fVar, eVar2);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                        } else {
                            eVar2.f6023x = 2;
                            obj2 = eVar.invoke(xVar2, eVar2);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                        }
                        return obj2;
                    }
                    p pVar3 = z10 ? this.f6030a : this.f6031b;
                    ?? obj3 = new Object();
                    try {
                        Hb.i context2 = eVar2.getContext();
                        long j = this.f6034e;
                        ?? r92 = new Rb.a() { // from class: K2.d
                            @Override // Rb.a
                            public final Object invoke() {
                                h hVar2 = h.this;
                                hVar2.getClass();
                                String str = z10 ? "reader" : "writer";
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Timed out attempting to acquire a " + str + " connection.");
                                sb2.append("\n\nWriter pool:\n");
                                hVar2.f6031b.d(sb2);
                                sb2.append("Reader pool:");
                                sb2.append('\n');
                                hVar2.f6030a.d(sb2);
                                try {
                                    AbstractC0672a.s(5, sb2.toString());
                                    throw null;
                                } catch (SQLException e2) {
                                    e2.printStackTrace();
                                    return Db.q.f3365a;
                                }
                            }
                        };
                        eVar2.f6014a = this;
                        eVar2.f6015b = eVar;
                        eVar2.f6016c = pVar3;
                        eVar2.f6017d = obj3;
                        eVar2.f6018e = context2;
                        eVar2.f6019f = obj3;
                        eVar2.f6020u = z10;
                        eVar2.f6023x = 3;
                        Object b2 = pVar3.b(j, r92, eVar2);
                        if (b2 == aVar) {
                            return aVar;
                        }
                        eVar3 = eVar;
                        pVar2 = pVar3;
                        vVar2 = obj3;
                        vVar = vVar2;
                        obj2 = b2;
                        context = context2;
                        hVar = this;
                        i iVar2 = (i) obj2;
                        iVar2.getClass();
                        kotlin.jvm.internal.l.e(context, "context");
                        iVar2.f6037c = context;
                        iVar2.f6038d = new Throwable();
                        vVar2.f19134a = new x(iVar2, hVar.f6030a == hVar.f6031b && z10);
                        obj = vVar.f19134a;
                        if (obj != null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        pVar = pVar3;
                        vVar = obj3;
                    }
                } else {
                    if (i7 == 1 || i7 == 2) {
                        com.bumptech.glide.c.c0(obj2);
                        return obj2;
                    }
                    if (i7 == 3) {
                        z10 = eVar2.f6020u;
                        vVar2 = eVar2.f6019f;
                        context = eVar2.f6018e;
                        vVar = eVar2.f6017d;
                        pVar2 = eVar2.f6016c;
                        eVar3 = (Rb.e) eVar2.f6015b;
                        hVar = (h) eVar2.f6014a;
                        try {
                            com.bumptech.glide.c.c0(obj2);
                            i iVar22 = (i) obj2;
                            iVar22.getClass();
                            kotlin.jvm.internal.l.e(context, "context");
                            iVar22.f6037c = context;
                            iVar22.f6038d = new Throwable();
                            vVar2.f19134a = new x(iVar22, hVar.f6030a == hVar.f6031b && z10);
                            obj = vVar.f19134a;
                            if (obj != null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            x xVar3 = (x) obj;
                            C0379a c0379a3 = new C0379a(xVar3);
                            ThreadLocal threadLocal2 = hVar.f6032c;
                            kotlin.jvm.internal.l.e(threadLocal2, "<this>");
                            Hb.i w11 = E6.b.w(c0379a3, new hc.y(xVar3, threadLocal2));
                            g gVar = new g(eVar3, vVar, null);
                            eVar2.f6014a = pVar2;
                            eVar2.f6015b = vVar;
                            eVar2.f6016c = null;
                            eVar2.f6017d = null;
                            eVar2.f6018e = null;
                            eVar2.f6019f = null;
                            eVar2.f6023x = 4;
                            obj2 = F.K(w11, gVar, eVar2);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            vVar3 = vVar;
                            pVar = pVar2;
                        } catch (Throwable th3) {
                            th = th3;
                            pVar = pVar2;
                        }
                    } else {
                        if (i7 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vVar3 = (kotlin.jvm.internal.v) eVar2.f6015b;
                        pVar = (p) eVar2.f6014a;
                        try {
                            com.bumptech.glide.c.c0(obj2);
                        } catch (Throwable th4) {
                            vVar = vVar3;
                            th = th4;
                        }
                    }
                    try {
                        throw th;
                    } finally {
                    }
                }
                xVar = (x) vVar3.f19134a;
                if (xVar != null) {
                    i iVar3 = xVar.f6104a;
                    if (xVar.f6107d.compareAndSet(false, true)) {
                        try {
                            AbstractC0672a.h(iVar3, "ROLLBACK TRANSACTION");
                        } catch (SQLException unused) {
                        }
                    }
                    iVar3.f6037c = null;
                    iVar3.f6038d = null;
                    pVar.e(iVar3);
                }
                return obj2;
            }
        }
        eVar2 = new e(this, cVar);
        Object obj22 = eVar2.f6021v;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = eVar2.f6023x;
        if (i7 != 0) {
        }
        xVar = (x) vVar3.f19134a;
        if (xVar != null) {
        }
        return obj22;
    }
}
