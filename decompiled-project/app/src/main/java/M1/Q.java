package M1;

import A0.C0005a;
import a.AbstractC0672a;
import cc.C0953t;
import cc.D0;
import cc.InterfaceC0952s;
import fc.InterfaceC1161h;
import java.util.List;
import mc.AbstractC1660e;
import mc.C1659d;
import t8.C2034c;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0394i {

    /* renamed from: a, reason: collision with root package name */
    public final O1.f f6621a;

    /* renamed from: b, reason: collision with root package name */
    public final C2034c f6622b;

    /* renamed from: c, reason: collision with root package name */
    public final cc.E f6623c;

    /* renamed from: f, reason: collision with root package name */
    public int f6626f;
    public D0 g;

    /* renamed from: i, reason: collision with root package name */
    public final q3.n f6628i;

    /* renamed from: l, reason: collision with root package name */
    public final r8.o f6629l;

    /* renamed from: d, reason: collision with root package name */
    public final C0405u f6624d = new C0405u(new C0406v(this, null));

    /* renamed from: e, reason: collision with root package name */
    public final C1659d f6625e = AbstractC1660e.a();

    /* renamed from: h, reason: collision with root package name */
    public final D5.i f6627h = new D5.i(24);
    public final Db.o j = android.support.v4.media.session.b.z(new C0399n(this, 1));
    public final Db.o k = android.support.v4.media.session.b.z(new C0399n(this, 0));

    public Q(O1.f fVar, List list, C2034c c2034c, cc.E e2) {
        this.f6621a = fVar;
        this.f6622b = c2034c;
        this.f6623c = e2;
        this.f6628i = new q3.n(this, list);
        this.f6629l = new r8.o(e2, new C0005a(this, 14), new N(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:12:0x004b, B:14:0x0053, B:16:0x0057, B:17:0x005d), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(Q q10, Jb.c cVar) {
        C0407w c0407w;
        int i7;
        C1659d c1659d;
        int i10;
        q10.getClass();
        try {
            if (cVar instanceof C0407w) {
                c0407w = (C0407w) cVar;
                int i11 = c0407w.f6729e;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c0407w.f6729e = i11 - Integer.MIN_VALUE;
                    Object obj = c0407w.f6727c;
                    Ib.a aVar = Ib.a.f5345a;
                    i7 = c0407w.f6729e;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        c0407w.f6725a = q10;
                        c1659d = q10.f6625e;
                        c0407w.f6726b = c1659d;
                        c0407w.f6729e = 1;
                        if (c1659d.n(c0407w) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C1659d c1659d2 = c0407w.f6726b;
                        Q q11 = c0407w.f6725a;
                        com.bumptech.glide.c.c0(obj);
                        c1659d = c1659d2;
                        q10 = q11;
                    }
                    i10 = q10.f6626f - 1;
                    q10.f6626f = i10;
                    if (i10 == 0) {
                        D0 d02 = q10.g;
                        if (d02 != null) {
                            d02.cancel(null);
                        }
                        q10.g = null;
                    }
                    c1659d.l(null);
                    return Db.q.f3365a;
                }
            }
            i10 = q10.f6626f - 1;
            q10.f6626f = i10;
            if (i10 == 0) {
            }
            c1659d.l(null);
            return Db.q.f3365a;
        } catch (Throwable th) {
            c1659d.l(null);
            throw th;
        }
        c0407w = new C0407w(q10, cVar);
        Object obj2 = c0407w.f6727c;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = c0407w.f6729e;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(12:5|6|(7:57|(1:(1:(1:61)(2:63|64))(3:65|66|67))(1:68)|62|17|(1:19)(1:23)|20|21)(4:8|9|10|(9:12|13|14|(1:24)|16|17|(0)(0)|20|21)(3:30|(1:32)(1:55)|(2:34|(2:36|(2:38|39))(2:47|48))(2:49|(2:51|52)(2:53|54))))|40|41|42|(1:44)|16|17|(0)(0)|20|21))|70|6|(0)(0)|40|41|42|(0)|16|17|(0)(0)|20|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /* JADX WARN: Type inference failed for: r2v3, types: [Jb.i, Rb.e] */
    /* JADX WARN: Type inference failed for: r2v9, types: [Jb.i, Rb.e] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(Q q10, T t5, Jb.c cVar) {
        C0409y c0409y;
        Ib.a aVar;
        int i7;
        InterfaceC0952s interfaceC0952s;
        C0953t c0953t;
        Q q11;
        Object b2;
        InterfaceC0952s interfaceC0952s2;
        Throwable a9;
        b0 u3;
        q10.getClass();
        if (cVar instanceof C0409y) {
            c0409y = (C0409y) cVar;
            int i10 = c0409y.f6737f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0409y.f6737f = i10 - Integer.MIN_VALUE;
                Object obj = c0409y.f6735d;
                aVar = Ib.a.f5345a;
                i7 = c0409y.f6737f;
                boolean z8 = true;
                if (i7 == 0) {
                    try {
                        if (i7 == 1) {
                            interfaceC0952s = (InterfaceC0952s) c0409y.f6732a;
                        } else if (i7 == 2) {
                            C0953t c0953t2 = c0409y.f6734c;
                            Q q12 = c0409y.f6733b;
                            T t10 = (T) c0409y.f6732a;
                            com.bumptech.glide.c.c0(obj);
                            c0953t = c0953t2;
                            q11 = q12;
                            t5 = t10;
                        } else {
                            if (i7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0952s = (InterfaceC0952s) c0409y.f6732a;
                        }
                        com.bumptech.glide.c.c0(obj);
                        interfaceC0952s2 = interfaceC0952s;
                    } catch (Throwable th) {
                        th = th;
                        obj = com.bumptech.glide.c.n(th);
                        interfaceC0952s2 = q10;
                        a9 = Db.m.a(obj);
                        C0953t c0953t3 = (C0953t) interfaceC0952s2;
                        if (a9 != null) {
                        }
                        return Db.q.f3365a;
                    }
                    a9 = Db.m.a(obj);
                    C0953t c0953t32 = (C0953t) interfaceC0952s2;
                    if (a9 != null) {
                        c0953t32.J(obj);
                    } else {
                        c0953t32.W(a9);
                    }
                    return Db.q.f3365a;
                }
                com.bumptech.glide.c.c0(obj);
                c0953t = t5.f6632b;
                try {
                    u3 = q10.f6627h.u();
                } catch (Throwable th2) {
                    th = th2;
                    q10 = c0953t;
                    obj = com.bumptech.glide.c.n(th);
                    interfaceC0952s2 = q10;
                    a9 = Db.m.a(obj);
                    C0953t c0953t322 = (C0953t) interfaceC0952s2;
                    if (a9 != null) {
                    }
                    return Db.q.f3365a;
                }
                if (u3 instanceof C0389d) {
                    ?? r22 = t5.f6631a;
                    Hb.i iVar = t5.f6634d;
                    c0409y.f6732a = c0953t;
                    c0409y.f6737f = 1;
                    try {
                        b2 = q10.g().b(new K(q10, iVar, r22, null), c0409y);
                        if (b2 == aVar) {
                            return aVar;
                        }
                        C0953t c0953t4 = c0953t;
                        obj = b2;
                        interfaceC0952s2 = c0953t4;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        q10 = c0953t;
                        obj = com.bumptech.glide.c.n(th);
                        interfaceC0952s2 = q10;
                        a9 = Db.m.a(obj);
                        C0953t c0953t3222 = (C0953t) interfaceC0952s2;
                        if (a9 != null) {
                        }
                        return Db.q.f3365a;
                    }
                    a9 = Db.m.a(obj);
                    C0953t c0953t32222 = (C0953t) interfaceC0952s2;
                    if (a9 != null) {
                    }
                    return Db.q.f3365a;
                }
                if (!(u3 instanceof U)) {
                    z8 = u3 instanceof c0;
                }
                if (!z8) {
                    if (u3 instanceof S) {
                        throw ((S) u3).f6630b;
                    }
                    throw new Db.d(1);
                }
                if (u3 != t5.f6633c) {
                    kotlin.jvm.internal.l.c(u3, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((U) u3).f6635b;
                }
                c0409y.f6732a = t5;
                c0409y.f6733b = q10;
                c0409y.f6734c = c0953t;
                c0409y.f6737f = 2;
                Object h10 = q10.h(c0409y);
                q11 = q10;
                if (h10 == aVar) {
                    return aVar;
                }
                ?? r23 = t5.f6631a;
                Hb.i iVar2 = t5.f6634d;
                c0409y.f6732a = c0953t;
                c0409y.f6733b = null;
                c0409y.f6734c = null;
                c0409y.f6737f = 3;
                b2 = q11.g().b(new K(q11, iVar2, r23, null), c0409y);
                if (b2 == aVar) {
                    return aVar;
                }
                C0953t c0953t42 = c0953t;
                obj = b2;
                interfaceC0952s2 = c0953t42;
                a9 = Db.m.a(obj);
                C0953t c0953t322222 = (C0953t) interfaceC0952s2;
                if (a9 != null) {
                }
                return Db.q.f3365a;
            }
        }
        c0409y = new C0409y(q10, cVar);
        Object obj2 = c0409y.f6735d;
        aVar = Ib.a.f5345a;
        i7 = c0409y.f6737f;
        boolean z82 = true;
        if (i7 == 0) {
        }
        ?? r232 = t5.f6631a;
        Hb.i iVar22 = t5.f6634d;
        c0409y.f6732a = c0953t;
        c0409y.f6733b = null;
        c0409y.f6734c = null;
        c0409y.f6737f = 3;
        b2 = q11.g().b(new K(q11, iVar22, r232, null), c0409y);
        if (b2 == aVar) {
        }
        C0953t c0953t422 = c0953t;
        obj2 = b2;
        interfaceC0952s2 = c0953t422;
        a9 = Db.m.a(obj2);
        C0953t c0953t3222222 = (C0953t) interfaceC0952s2;
        if (a9 != null) {
        }
        return Db.q.f3365a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:12:0x004b, B:14:0x0052), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(Q q10, Jb.c cVar) {
        C0410z c0410z;
        int i7;
        C1659d c1659d;
        int i10;
        q10.getClass();
        try {
            if (cVar instanceof C0410z) {
                c0410z = (C0410z) cVar;
                int i11 = c0410z.f6742e;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c0410z.f6742e = i11 - Integer.MIN_VALUE;
                    Object obj = c0410z.f6740c;
                    Ib.a aVar = Ib.a.f5345a;
                    i7 = c0410z.f6742e;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        c0410z.f6738a = q10;
                        c1659d = q10.f6625e;
                        c0410z.f6739b = c1659d;
                        c0410z.f6742e = 1;
                        if (c1659d.n(c0410z) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C1659d c1659d2 = c0410z.f6739b;
                        Q q11 = c0410z.f6738a;
                        com.bumptech.glide.c.c0(obj);
                        c1659d = c1659d2;
                        q10 = q11;
                    }
                    i10 = q10.f6626f + 1;
                    q10.f6626f = i10;
                    if (i10 == 1) {
                        q10.g = cc.F.B(q10.f6623c, null, 0, new A(q10, null), 3);
                    }
                    c1659d.l(null);
                    return Db.q.f3365a;
                }
            }
            i10 = q10.f6626f + 1;
            q10.f6626f = i10;
            if (i10 == 1) {
            }
            c1659d.l(null);
            return Db.q.f3365a;
        } catch (Throwable th) {
            c1659d.l(null);
            throw th;
        }
        c0410z = new C0410z(q10, cVar);
        Object obj2 = c0410z.f6740c;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = c0410z.f6742e;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(Q q10, boolean z8, Hb.d dVar) {
        C c10;
        int i7;
        Q q11;
        b0 b0Var;
        boolean z10;
        Q q12;
        Db.j jVar;
        q10.getClass();
        if (dVar instanceof C) {
            c10 = (C) dVar;
            int i10 = c10.f6564f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10.f6564f = i10 - Integer.MIN_VALUE;
                Object obj = c10.f6562d;
                Ib.a aVar = Ib.a.f5345a;
                i7 = c10.f6564f;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    b0 u3 = q10.f6627h.u();
                    if (u3 instanceof c0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    a0 g = q10.g();
                    c10.f6559a = q10;
                    c10.f6560b = u3;
                    c10.f6561c = z8;
                    c10.f6564f = 1;
                    Integer a9 = g.a();
                    if (a9 == aVar) {
                        return aVar;
                    }
                    q11 = q10;
                    b0Var = u3;
                    obj = a9;
                } else if (i7 == 1) {
                    z8 = c10.f6561c;
                    b0Var = c10.f6560b;
                    q11 = c10.f6559a;
                    com.bumptech.glide.c.c0(obj);
                } else {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        q12 = c10.f6559a;
                        com.bumptech.glide.c.c0(obj);
                        jVar = (Db.j) obj;
                        b0 b0Var2 = (b0) jVar.f3354a;
                        if (((Boolean) jVar.f3355b).booleanValue()) {
                            return b0Var2;
                        }
                        q12.f6627h.y(b0Var2);
                        return b0Var2;
                    }
                    q12 = c10.f6559a;
                    com.bumptech.glide.c.c0(obj);
                    jVar = (Db.j) obj;
                    b0 b0Var22 = (b0) jVar.f3354a;
                    if (((Boolean) jVar.f3355b).booleanValue()) {
                    }
                }
                int intValue = ((Number) obj).intValue();
                z10 = b0Var instanceof C0389d;
                int i11 = !z10 ? b0Var.f6658a : -1;
                if (!z10 && intValue == i11) {
                    return b0Var;
                }
                if (z8) {
                    a0 g2 = q11.g();
                    E e2 = new E(q11, i11, null);
                    c10.f6559a = q11;
                    c10.f6560b = null;
                    c10.f6564f = 3;
                    obj = g2.c(e2, c10);
                    if (obj == aVar) {
                        return aVar;
                    }
                    q12 = q11;
                    jVar = (Db.j) obj;
                    b0 b0Var222 = (b0) jVar.f3354a;
                    if (((Boolean) jVar.f3355b).booleanValue()) {
                    }
                } else {
                    a0 g10 = q11.g();
                    D d10 = new D(q11, null);
                    c10.f6559a = q11;
                    c10.f6560b = null;
                    c10.f6564f = 2;
                    obj = g10.b(d10, c10);
                    if (obj == aVar) {
                        return aVar;
                    }
                    q12 = q11;
                    jVar = (Db.j) obj;
                    b0 b0Var2222 = (b0) jVar.f3354a;
                    if (((Boolean) jVar.f3355b).booleanValue()) {
                    }
                }
            }
        }
        c10 = new C(q10, dVar);
        Object obj2 = c10.f6562d;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = c10.f6564f;
        if (i7 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z10 = b0Var instanceof C0389d;
        if (!z10) {
        }
        if (!z10) {
        }
        if (z8) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|80|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0062, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0023. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0146 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:27:0x0134, B:29:0x0146, B:33:0x014e), top: B:26:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014e A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #0 {all -> 0x0172, blocks: (B:27:0x0134, B:29:0x0146, B:33:0x014e), top: B:26:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2 A[Catch: c -> 0x0062, TryCatch #2 {c -> 0x0062, blocks: (B:37:0x005d, B:38:0x0103, B:42:0x006b, B:43:0x00e5, B:61:0x0088, B:63:0x00a2, B:64:0x00a8, B:71:0x0091, B:75:0x00d2), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.jvm.internal.t, java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.v, java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [Rb.c, kotlin.jvm.internal.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(Q q10, boolean z8, Jb.c cVar) {
        F f4;
        Q q11;
        boolean z10;
        kotlin.jvm.internal.v vVar;
        C0388c c0388c;
        kotlin.jvm.internal.v vVar2;
        C0388c c0388c2;
        Object b2;
        kotlin.jvm.internal.t tVar;
        kotlin.jvm.internal.v vVar3;
        Integer a9;
        Q q12;
        int i7;
        Object obj;
        q10.getClass();
        if (cVar instanceof F) {
            f4 = (F) cVar;
            int i10 = f4.f6581w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f4.f6581w = i10 - Integer.MIN_VALUE;
                Object obj2 = f4.f6579u;
                Ib.a aVar = Ib.a.f5345a;
                switch (f4.f6581w) {
                    case 0:
                        com.bumptech.glide.c.c0(obj2);
                        if (!z8) {
                            a0 g = q10.g();
                            f4.f6573a = q10;
                            f4.f6577e = z8;
                            f4.f6581w = 3;
                            obj2 = g.a();
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            int intValue = ((Number) obj2).intValue();
                            a0 g2 = q10.g();
                            G g10 = new G(q10, intValue, null);
                            f4.f6573a = q10;
                            f4.f6577e = z8;
                            f4.f6581w = 4;
                            obj2 = g2.c(g10, f4);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            return (C0389d) obj2;
                        }
                        f4.f6573a = q10;
                        f4.f6577e = z8;
                        f4.f6581w = 1;
                        obj2 = q10.i(f4);
                        if (obj2 == aVar) {
                            return aVar;
                        }
                        int hashCode = obj2 == null ? obj2.hashCode() : 0;
                        a0 g11 = q10.g();
                        f4.f6573a = q10;
                        f4.f6574b = obj2;
                        f4.f6577e = z8;
                        f4.f6578f = hashCode;
                        f4.f6581w = 2;
                        a9 = g11.a();
                        if (a9 != aVar) {
                            return aVar;
                        }
                        q12 = q10;
                        i7 = hashCode;
                        obj = obj2;
                        obj2 = a9;
                        return new C0389d(obj, i7, ((Number) obj2).intValue());
                    case 1:
                        z8 = f4.f6577e;
                        q10 = (Q) f4.f6573a;
                        com.bumptech.glide.c.c0(obj2);
                        if (obj2 == null) {
                        }
                        a0 g112 = q10.g();
                        f4.f6573a = q10;
                        f4.f6574b = obj2;
                        f4.f6577e = z8;
                        f4.f6578f = hashCode;
                        f4.f6581w = 2;
                        a9 = g112.a();
                        if (a9 != aVar) {
                        }
                        break;
                    case 2:
                        i7 = f4.f6578f;
                        z8 = f4.f6577e;
                        obj = f4.f6574b;
                        q12 = (Q) f4.f6573a;
                        try {
                            com.bumptech.glide.c.c0(obj2);
                            return new C0389d(obj, i7, ((Number) obj2).intValue());
                        } catch (C0388c e2) {
                            e = e2;
                            q10 = q12;
                            ?? obj3 = new Object();
                            C2034c c2034c = q10.f6622b;
                            f4.f6573a = q10;
                            f4.f6574b = e;
                            f4.f6575c = obj3;
                            f4.f6576d = obj3;
                            f4.f6577e = z8;
                            f4.f6581w = 5;
                            Object invoke = ((kotlin.jvm.internal.m) c2034c.f24513b).invoke(e);
                            if (invoke == aVar) {
                                return aVar;
                            }
                            q11 = q10;
                            z10 = z8;
                            vVar = obj3;
                            c0388c = e;
                            obj2 = invoke;
                            vVar2 = obj3;
                            vVar.f19134a = obj2;
                            ?? obj4 = new Object();
                            try {
                                H h10 = new H(vVar2, q11, obj4, null);
                                f4.f6573a = c0388c;
                                f4.f6574b = vVar2;
                                f4.f6575c = obj4;
                                f4.f6576d = null;
                                f4.f6581w = 6;
                                if (z10) {
                                }
                                if (b2 != aVar) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                c0388c2 = c0388c;
                                AbstractC0672a.c(c0388c2, th);
                                throw c0388c2;
                            }
                        }
                        break;
                    case 3:
                        z8 = f4.f6577e;
                        q10 = (Q) f4.f6573a;
                        com.bumptech.glide.c.c0(obj2);
                        int intValue2 = ((Number) obj2).intValue();
                        a0 g22 = q10.g();
                        G g102 = new G(q10, intValue2, null);
                        f4.f6573a = q10;
                        f4.f6577e = z8;
                        f4.f6581w = 4;
                        obj2 = g22.c(g102, f4);
                        if (obj2 == aVar) {
                        }
                        return (C0389d) obj2;
                    case 4:
                        boolean z11 = f4.f6577e;
                        com.bumptech.glide.c.c0(obj2);
                        return (C0389d) obj2;
                    case 5:
                        z10 = f4.f6577e;
                        vVar = f4.f6576d;
                        kotlin.jvm.internal.v vVar4 = (kotlin.jvm.internal.v) f4.f6575c;
                        c0388c = (C0388c) f4.f6574b;
                        q11 = (Q) f4.f6573a;
                        com.bumptech.glide.c.c0(obj2);
                        vVar2 = vVar4;
                        vVar.f19134a = obj2;
                        ?? obj42 = new Object();
                        H h102 = new H(vVar2, q11, obj42, null);
                        f4.f6573a = c0388c;
                        f4.f6574b = vVar2;
                        f4.f6575c = obj42;
                        f4.f6576d = null;
                        f4.f6581w = 6;
                        if (z10) {
                            b2 = q11.g().b(new C0408x(h102, null), f4);
                        } else {
                            q11.getClass();
                            b2 = h102.invoke(f4);
                        }
                        if (b2 != aVar) {
                            return aVar;
                        }
                        tVar = obj42;
                        vVar3 = vVar2;
                        Object obj5 = vVar3.f19134a;
                        return new C0389d(obj5, obj5 != null ? obj5.hashCode() : 0, tVar.f19132a);
                    case 6:
                        tVar = (kotlin.jvm.internal.t) f4.f6575c;
                        vVar3 = (kotlin.jvm.internal.v) f4.f6574b;
                        c0388c2 = (C0388c) f4.f6573a;
                        try {
                            com.bumptech.glide.c.c0(obj2);
                            Object obj52 = vVar3.f19134a;
                            return new C0389d(obj52, obj52 != null ? obj52.hashCode() : 0, tVar.f19132a);
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC0672a.c(c0388c2, th);
                            throw c0388c2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        f4 = new F(q10, cVar);
        Object obj22 = f4.f6579u;
        Ib.a aVar2 = Ib.a.f5345a;
        switch (f4.f6581w) {
        }
    }

    @Override // M1.InterfaceC0394i
    public final Object a(Rb.e eVar, Jb.c cVar) {
        e0 e0Var = (e0) cVar.getContext().get(d0.f6662a);
        if (e0Var != null) {
            e0Var.a(this);
        }
        return cc.F.K(new e0(e0Var, this), new L(this, eVar, null), cVar);
    }

    public final a0 g() {
        return (a0) this.k.getValue();
    }

    @Override // M1.InterfaceC0394i
    public final InterfaceC1161h getData() {
        return this.f6624d;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Jb.c cVar) {
        B b2;
        Object obj;
        int i7;
        Q q10;
        int intValue;
        int i10;
        Throwable th;
        Q q11;
        q3.n nVar;
        try {
            if (cVar instanceof B) {
                b2 = (B) cVar;
                int i11 = b2.f6558e;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    b2.f6558e = i11 - Integer.MIN_VALUE;
                    Object obj2 = b2.f6556c;
                    obj = Ib.a.f5345a;
                    i7 = b2.f6558e;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj2);
                        a0 g = g();
                        b2.f6554a = this;
                        b2.f6558e = 1;
                        obj2 = g.a();
                        if (obj2 == obj) {
                            return obj;
                        }
                        q10 = this;
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i10 = b2.f6555b;
                            q11 = b2.f6554a;
                            try {
                                com.bumptech.glide.c.c0(obj2);
                                return Db.q.f3365a;
                            } catch (Throwable th2) {
                                th = th2;
                                q11.f6627h.y(new U(i10, th));
                                throw th;
                            }
                        }
                        q10 = b2.f6554a;
                        com.bumptech.glide.c.c0(obj2);
                    }
                    intValue = ((Number) obj2).intValue();
                    nVar = q10.f6628i;
                    b2.f6554a = q10;
                    b2.f6555b = intValue;
                    b2.f6558e = 2;
                    if (nVar.o(b2) == obj) {
                        return obj;
                    }
                    return Db.q.f3365a;
                }
            }
            nVar = q10.f6628i;
            b2.f6554a = q10;
            b2.f6555b = intValue;
            b2.f6558e = 2;
            if (nVar.o(b2) == obj) {
            }
            return Db.q.f3365a;
        } catch (Throwable th3) {
            i10 = intValue;
            th = th3;
            q11 = q10;
            q11.f6627h.y(new U(i10, th));
            throw th;
        }
        b2 = new B(this, cVar);
        Object obj22 = b2.f6556c;
        obj = Ib.a.f5345a;
        i7 = b2.f6558e;
        if (i7 != 0) {
        }
        intValue = ((Number) obj22).intValue();
    }

    public final Object i(Jb.c cVar) {
        return ((O1.i) this.j.getValue()).a(new r(3, (Hb.d) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r14v2, types: [kotlin.jvm.internal.t, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z8, Jb.c cVar) {
        O o10;
        int i7;
        kotlin.jvm.internal.t tVar;
        if (cVar instanceof O) {
            o10 = (O) cVar;
            int i10 = o10.f6613d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                o10.f6613d = i10 - Integer.MIN_VALUE;
                Object obj2 = o10.f6611b;
                Ib.a aVar = Ib.a.f5345a;
                i7 = o10.f6613d;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj2);
                    ?? obj3 = new Object();
                    O1.i iVar = (O1.i) this.j.getValue();
                    P p10 = new P(obj3, this, obj, z8, null);
                    o10.f6610a = obj3;
                    o10.f6613d = 1;
                    if (iVar.b(p10, o10) == aVar) {
                        return aVar;
                    }
                    tVar = obj3;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = o10.f6610a;
                    com.bumptech.glide.c.c0(obj2);
                }
                return new Integer(tVar.f19132a);
            }
        }
        o10 = new O(this, cVar);
        Object obj22 = o10.f6611b;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = o10.f6613d;
        if (i7 != 0) {
        }
        return new Integer(tVar.f19132a);
    }
}
