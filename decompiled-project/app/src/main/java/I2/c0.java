package I2;

import A9.C0163z1;
import B0.C0204u;
import hc.C1277e;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import t8.C2034c;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f5150l = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name */
    public final E f5151a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5152b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5153c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5154d;

    /* renamed from: e, reason: collision with root package name */
    public final C0204u f5155e;
    public final String[] g;

    /* renamed from: h, reason: collision with root package name */
    public final C0330t f5157h;

    /* renamed from: i, reason: collision with root package name */
    public final C2034c f5158i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public Rb.a k = new C0163z1(25);

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f5156f = new LinkedHashMap();

    public c0(E e2, HashMap hashMap, HashMap hashMap2, String[] strArr, boolean z8, C0204u c0204u) {
        String str;
        this.f5151a = e2;
        this.f5152b = hashMap;
        this.f5153c = hashMap2;
        this.f5154d = z8;
        this.f5155e = c0204u;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str2 = strArr[i7];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
            this.f5156f.put(lowerCase, Integer.valueOf(i7));
            String str3 = (String) this.f5152b.get(strArr[i7]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                kotlin.jvm.internal.l.d(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i7] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.f5152b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            kotlin.jvm.internal.l.d(lowerCase2, "toLowerCase(...)");
            if (this.f5156f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                kotlin.jvm.internal.l.d(lowerCase3, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f5156f;
                linkedHashMap.put(lowerCase3, Eb.B.E(lowerCase2, linkedHashMap));
            }
        }
        this.f5157h = new C0330t(this.g.length);
        this.f5158i = new C2034c(this.g.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c0 c0Var, InterfaceC0333w interfaceC0333w, Jb.c cVar) {
        N n6;
        int i7;
        Set set;
        Set set2;
        c0Var.getClass();
        if (cVar instanceof N) {
            n6 = (N) cVar;
            int i10 = n6.f5063d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                n6.f5063d = i10 - Integer.MIN_VALUE;
                Object obj = n6.f5061b;
                Ib.a aVar = Ib.a.f5345a;
                i7 = n6.f5063d;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    Ba.i iVar = new Ba.i(4);
                    n6.f5060a = interfaceC0333w;
                    n6.f5063d = 1;
                    obj = interfaceC0333w.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", iVar, n6);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        set2 = (Set) n6.f5060a;
                        com.bumptech.glide.c.c0(obj);
                        return set2;
                    }
                    interfaceC0333w = (InterfaceC0333w) n6.f5060a;
                    com.bumptech.glide.c.c0(obj);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    return set;
                }
                n6.f5060a = set;
                n6.f5063d = 2;
                if (AbstractC0315d.e(interfaceC0333w, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", n6) == aVar) {
                    return aVar;
                }
                set2 = set;
                return set2;
            }
        }
        n6 = new N(c0Var, cVar);
        Object obj2 = n6.f5061b;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = n6.f5063d;
        if (i7 != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0085 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:13:0x0079, B:15:0x0085, B:33:0x0049, B:36:0x0057, B:39:0x0066), top: B:32:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c0 c0Var, Jb.c cVar) {
        T t5;
        int i7;
        q3.s sVar;
        Throwable th;
        q3.s sVar2;
        Set set;
        c0Var.getClass();
        if (cVar instanceof T) {
            t5 = (T) cVar;
            int i10 = t5.f5085e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                t5.f5085e = i10 - Integer.MIN_VALUE;
                Object obj = t5.f5083c;
                Ib.a aVar = Ib.a.f5345a;
                i7 = t5.f5085e;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    E e2 = c0Var.f5151a;
                    sVar = e2.g;
                    boolean h10 = sVar.h();
                    Eb.x xVar = Eb.x.f3893a;
                    if (h10) {
                        try {
                            if (c0Var.j.compareAndSet(true, false) && ((Boolean) c0Var.k.invoke()).booleanValue()) {
                                V v10 = new V(c0Var, null);
                                t5.f5081a = c0Var;
                                t5.f5082b = sVar;
                                t5.f5085e = 1;
                                obj = e2.w(false, v10, t5);
                                if (obj == aVar) {
                                    return aVar;
                                }
                            }
                            sVar.H();
                        } catch (Throwable th2) {
                            th = th2;
                            sVar2 = sVar;
                            sVar2.H();
                            throw th;
                        }
                    }
                    return xVar;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar2 = t5.f5082b;
                c0 c0Var2 = t5.f5081a;
                try {
                    com.bumptech.glide.c.c0(obj);
                    sVar = sVar2;
                    c0Var = c0Var2;
                } catch (Throwable th3) {
                    th = th3;
                    sVar2.H();
                    throw th;
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    c0Var.f5158i.c(set);
                    c0Var.f5155e.invoke(set);
                }
                sVar.H();
                return set;
            }
        }
        t5 = new T(c0Var, cVar);
        Object obj2 = t5.f5083c;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = t5.f5085e;
        if (i7 != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        sVar.H();
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00df -> B:11:0x00e0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c0 c0Var, M m10, int i7, Jb.c cVar) {
        X x2;
        int i10;
        String[] strArr;
        c0 c0Var2;
        int i11;
        InterfaceC0333w interfaceC0333w;
        int i12;
        String str;
        c0 c0Var3 = c0Var;
        InterfaceC0333w interfaceC0333w2 = m10;
        int i13 = i7;
        c0Var.getClass();
        if (cVar instanceof X) {
            x2 = (X) cVar;
            int i14 = x2.f5104x;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x2.f5104x = i14 - Integer.MIN_VALUE;
                Object obj = x2.f5102v;
                Ib.a aVar = Ib.a.f5345a;
                i10 = x2.f5104x;
                if (i10 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    String str2 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i13 + ", 0)";
                    x2.f5095a = c0Var3;
                    x2.f5096b = interfaceC0333w2;
                    x2.f5099e = i13;
                    x2.f5104x = 1;
                    if (AbstractC0315d.e(interfaceC0333w2, str2, x2) == aVar) {
                        return aVar;
                    }
                } else if (i10 == 1) {
                    int i15 = x2.f5099e;
                    interfaceC0333w2 = x2.f5096b;
                    c0 c0Var4 = x2.f5095a;
                    com.bumptech.glide.c.c0(obj);
                    i13 = i15;
                    c0Var3 = c0Var4;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = x2.f5101u;
                    i12 = x2.f5100f;
                    i13 = x2.f5099e;
                    strArr = x2.f5098d;
                    str = x2.f5097c;
                    interfaceC0333w = x2.f5096b;
                    c0Var2 = x2.f5095a;
                    com.bumptech.glide.c.c0(obj);
                    int i16 = 1;
                    i12 += i16;
                    if (i12 >= i11) {
                        String str3 = strArr[i12];
                        StringBuilder o10 = A3.c.o("CREATE ", c0Var2.f5154d ? "TEMP" : "", " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str3, "` AFTER ");
                        h3.o.v(o10, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                        String k = A3.c.k(o10, i13, " AND invalidated = 0; END");
                        x2.f5095a = c0Var2;
                        x2.f5096b = interfaceC0333w;
                        x2.f5097c = str;
                        x2.f5098d = strArr;
                        x2.f5099e = i13;
                        x2.f5100f = i12;
                        x2.f5101u = i11;
                        x2.f5104x = 2;
                        if (AbstractC0315d.e(interfaceC0333w, k, x2) == aVar) {
                            return aVar;
                        }
                        i16 = 1;
                        i12 += i16;
                        if (i12 >= i11) {
                            return Db.q.f3365a;
                        }
                    }
                }
                String str4 = c0Var3.g[i13];
                strArr = f5150l;
                c0Var2 = c0Var3;
                i11 = 3;
                interfaceC0333w = interfaceC0333w2;
                i12 = 0;
                str = str4;
                if (i12 >= i11) {
                }
            }
        }
        x2 = new X(c0Var3, cVar);
        Object obj2 = x2.f5102v;
        Ib.a aVar2 = Ib.a.f5345a;
        i10 = x2.f5104x;
        if (i10 != 0) {
        }
        String str42 = c0Var3.g[i13];
        strArr = f5150l;
        c0Var2 = c0Var3;
        i11 = 3;
        interfaceC0333w = interfaceC0333w2;
        i12 = 0;
        str = str42;
        if (i12 >= i11) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v5, types: [I2.w] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x008d -> B:10:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(c0 c0Var, M m10, int i7, Jb.c cVar) {
        Y y10;
        int i10;
        String str;
        int i11;
        M m11;
        int i12;
        String[] strArr;
        c0Var.getClass();
        if (cVar instanceof Y) {
            y10 = (Y) cVar;
            int i13 = y10.f5112v;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                y10.f5112v = i13 - Integer.MIN_VALUE;
                Object obj = y10.f5110f;
                Ib.a aVar = Ib.a.f5345a;
                i10 = y10.f5112v;
                if (i10 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    str = c0Var.g[i7];
                    i11 = 3;
                    m11 = m10;
                    i12 = 0;
                    strArr = f5150l;
                    if (i12 < i11) {
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = y10.f5109e;
                    i12 = y10.f5108d;
                    String[] strArr2 = y10.f5107c;
                    str = y10.f5106b;
                    ?? r42 = y10.f5105a;
                    com.bumptech.glide.c.c0(obj);
                    strArr = strArr2;
                    m11 = r42;
                    i12++;
                    if (i12 < i11) {
                        String str2 = "DROP TRIGGER IF EXISTS `" + ("room_table_modification_trigger_" + str + '_' + strArr[i12]) + '`';
                        y10.f5105a = m11;
                        y10.f5106b = str;
                        y10.f5107c = strArr;
                        y10.f5108d = i12;
                        y10.f5109e = i11;
                        y10.f5112v = 1;
                        if (AbstractC0315d.e(m11, str2, y10) == aVar) {
                            return aVar;
                        }
                        i12++;
                        if (i12 < i11) {
                            return Db.q.f3365a;
                        }
                    }
                }
            }
        }
        y10 = new Y(c0Var, cVar);
        Object obj2 = y10.f5110f;
        Ib.a aVar2 = Ib.a.f5345a;
        i10 = y10.f5112v;
        if (i10 != 0) {
        }
    }

    public final void e(C0320i onRefreshScheduled, C0320i onRefreshCompleted) {
        kotlin.jvm.internal.l.e(onRefreshScheduled, "onRefreshScheduled");
        kotlin.jvm.internal.l.e(onRefreshCompleted, "onRefreshCompleted");
        if (this.j.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            C1277e c1277e = this.f5151a.f5026a;
            if (c1277e != null) {
                cc.F.B(c1277e, new cc.D(), 0, new W(this, onRefreshCompleted, null), 2);
            } else {
                kotlin.jvm.internal.l.j("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Jb.c cVar) {
        Z z8;
        int i7;
        q3.s sVar;
        if (cVar instanceof Z) {
            z8 = (Z) cVar;
            int i10 = z8.f5116d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                z8.f5116d = i10 - Integer.MIN_VALUE;
                Object obj = z8.f5114b;
                Ib.a aVar = Ib.a.f5345a;
                i7 = z8.f5116d;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    E e2 = this.f5151a;
                    q3.s sVar2 = e2.g;
                    if (sVar2.h()) {
                        try {
                            b0 b0Var = new b0(this, null);
                            z8.f5113a = sVar2;
                            z8.f5116d = 1;
                            if (e2.w(false, b0Var, z8) == aVar) {
                                return aVar;
                            }
                            sVar = sVar2;
                        } catch (Throwable th) {
                            th = th;
                            sVar = sVar2;
                            sVar.H();
                            throw th;
                        }
                    }
                    return Db.q.f3365a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = z8.f5113a;
                try {
                    com.bumptech.glide.c.c0(obj);
                } catch (Throwable th2) {
                    th = th2;
                    sVar.H();
                    throw th;
                }
                sVar.H();
                return Db.q.f3365a;
            }
        }
        z8 = new Z(this, cVar);
        Object obj2 = z8.f5114b;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = z8.f5116d;
        if (i7 != 0) {
        }
        sVar.H();
        return Db.q.f3365a;
    }

    public final Db.j g(String[] strArr) {
        Fb.i iVar = new Fb.i();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
            Set set = (Set) this.f5153c.get(lowerCase);
            if (set != null) {
                iVar.addAll(set);
            } else {
                iVar.add(str);
            }
        }
        String[] strArr2 = (String[]) O5.b.i(iVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str2 = strArr2[i7];
            LinkedHashMap linkedHashMap = this.f5156f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.l.d(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) linkedHashMap.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i7] = num.intValue();
        }
        return new Db.j(strArr2, iArr);
    }
}
