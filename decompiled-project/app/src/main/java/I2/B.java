package I2;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import cc.AbstractC0923b0;
import cc.C0943l0;
import cc.InterfaceC0937i0;
import hc.C1277e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p.C1843a;
import y6.C2399e;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.e f5007a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5008b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5009c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5010d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5011e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f5012f;
    public Executor g;

    /* renamed from: h, reason: collision with root package name */
    public Q9.a f5013h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5014i;
    public final D j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final D5.i f5015l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f5016m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f5017n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f5018o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5019p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5020q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5021r;

    public B(Context context, Class cls, String str) {
        kotlin.jvm.internal.l.e(context, "context");
        this.f5010d = new ArrayList();
        this.f5011e = new ArrayList();
        this.j = D.f5022a;
        this.k = -1L;
        this.f5015l = new D5.i(16);
        this.f5016m = new LinkedHashSet();
        this.f5017n = new LinkedHashSet();
        this.f5018o = new ArrayList();
        this.f5019p = true;
        this.f5021r = true;
        this.f5007a = kotlin.jvm.internal.w.a(cls);
        this.f5008b = context;
        this.f5009c = str;
    }

    public final void a(M2.a... aVarArr) {
        for (M2.a aVar : aVarArr) {
            LinkedHashSet linkedHashSet = this.f5017n;
            linkedHashSet.add(Integer.valueOf(aVar.f6743a));
            linkedHashSet.add(Integer.valueOf(aVar.f6744b));
        }
        M2.a[] migrations = (M2.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        D5.i iVar = this.f5015l;
        iVar.getClass();
        kotlin.jvm.internal.l.e(migrations, "migrations");
        for (M2.a aVar2 : migrations) {
            iVar.s(aVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0232, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0459  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E b() {
        String str;
        boolean z8;
        H2.E e2;
        U2.d dVar;
        A a9;
        U2.d dVar2;
        Intent intent;
        Executor o10;
        Hb.i iVar;
        boolean z10;
        Executor executor = this.f5012f;
        if (executor == null && this.g == null) {
            E2.d dVar3 = C1843a.f22963e;
            this.g = dVar3;
            this.f5012f = dVar3;
        } else if (executor != null && this.g == null) {
            this.g = executor;
        } else if (executor == null) {
            this.f5012f = this.g;
        }
        LinkedHashSet migrationStartAndEndVersions = this.f5017n;
        LinkedHashSet migrationsNotRequiredFrom = this.f5016m;
        kotlin.jvm.internal.l.e(migrationStartAndEndVersions, "migrationStartAndEndVersions");
        kotlin.jvm.internal.l.e(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
        if (!migrationStartAndEndVersions.isEmpty()) {
            Iterator it = migrationStartAndEndVersions.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (migrationsNotRequiredFrom.contains(Integer.valueOf(intValue))) {
                    throw new IllegalArgumentException(h3.o.l(intValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ").toString());
                }
            }
        }
        U2.c cVar = this.f5013h;
        if (cVar == null) {
            cVar = new C2399e(15);
        }
        U2.c cVar2 = cVar;
        if (this.k > 0) {
            if (this.f5009c != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        ArrayList arrayList = this.f5010d;
        boolean z11 = this.f5014i;
        D d10 = this.j;
        d10.getClass();
        Context context = this.f5008b;
        kotlin.jvm.internal.l.e(context, "context");
        if (d10 == D.f5022a) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            d10 = (activityManager == null || activityManager.isLowRamDevice()) ? D.f5023b : D.f5024c;
        }
        D d11 = d10;
        Executor executor2 = this.f5012f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C0313b c0313b = new C0313b(context, this.f5009c, cVar2, this.f5015l, arrayList, z11, d11, executor2, executor3, null, this.f5019p, this.f5020q, migrationsNotRequiredFrom, null, null, null, this.f5011e, this.f5018o, false, null, null);
        c0313b.f5146v = this.f5021r;
        Class q10 = c2.i.q(this.f5007a);
        Package r32 = q10.getPackage();
        if (r32 == null || (str = r32.getName()) == null) {
            str = "";
        }
        String canonicalName = q10.getCanonicalName();
        kotlin.jvm.internal.l.b(canonicalName);
        if (str.length() == 0) {
            z8 = true;
        } else {
            z8 = true;
            canonicalName = canonicalName.substring(str.length() + 1);
            kotlin.jvm.internal.l.d(canonicalName, "substring(...)");
        }
        String replace = canonicalName.replace('.', '_');
        kotlin.jvm.internal.l.d(replace, "replace(...)");
        String concat = replace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(str.length() == 0 ? concat : str + '.' + concat, z8, q10.getClassLoader());
            kotlin.jvm.internal.l.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            E e10 = (E) cls.getDeclaredConstructor(null).newInstance(null);
            e10.getClass();
            e10.k = c0313b.f5146v;
            try {
                e2 = e10.f();
                kotlin.jvm.internal.l.c(e2, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            } catch (Db.i unused) {
                e2 = null;
            }
            e10.f5030e = e2 == null ? new A(c0313b, new Ba.o(e10, 12)) : new A(c0313b, e2);
            e10.f5031f = e10.e();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set l10 = e10.l();
            List list = c0313b.f5142r;
            int size = list.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = l10.iterator();
            while (true) {
                int i7 = -1;
                if (it2.hasNext()) {
                    Yb.c cVar3 = (Yb.c) it2.next();
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i10 = size2 - 1;
                            if (((kotlin.jvm.internal.e) cVar3).d(list.get(size2))) {
                                zArr[size2] = z8;
                                i7 = size2;
                                break;
                            }
                            if (i10 < 0) {
                                break;
                            }
                            size2 = i10;
                        }
                    }
                    if (i7 < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + ((kotlin.jvm.internal.e) cVar3).b() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(cVar3, list.get(i7));
                } else {
                    int size3 = list.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i11 = size3 - 1;
                            if (size3 >= size || !zArr[size3]) {
                                break;
                            }
                            if (i11 < 0) {
                                break;
                            }
                            size3 = i11;
                        }
                    }
                    for (M2.a aVar : e10.d(linkedHashMap)) {
                        int i12 = aVar.f6743a;
                        D5.i iVar2 = c0313b.f5131d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) iVar2.f3256b;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i12))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i12));
                            if (map == null) {
                                map = Eb.w.f3892a;
                            }
                            z10 = map.containsKey(Integer.valueOf(aVar.f6744b));
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            iVar2.s(aVar);
                        }
                    }
                    LinkedHashMap n6 = e10.n();
                    List list2 = c0313b.f5141q;
                    boolean[] zArr2 = new boolean[list2.size()];
                    for (Map.Entry entry : n6.entrySet()) {
                        Yb.c cVar4 = (Yb.c) entry.getKey();
                        for (Yb.c kclass : (List) entry.getValue()) {
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i13 = size4 - 1;
                                    if (((kotlin.jvm.internal.e) kclass).d(list2.get(size4))) {
                                        zArr2[size4] = z8;
                                        break;
                                    }
                                    if (i13 < 0) {
                                        break;
                                    }
                                    size4 = i13;
                                }
                            }
                            size4 = -1;
                            if (size4 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + ((kotlin.jvm.internal.e) kclass).b() + ") for " + ((kotlin.jvm.internal.e) cVar4).b() + " is missing in the database configuration.").toString());
                            }
                            Object converter = list2.get(size4);
                            kotlin.jvm.internal.l.e(kclass, "kclass");
                            kotlin.jvm.internal.l.e(converter, "converter");
                            e10.j.put(kclass, converter);
                        }
                    }
                    int size5 = list2.size() - 1;
                    if (size5 >= 0) {
                        while (true) {
                            int i14 = size5 - 1;
                            if (!zArr2[size5]) {
                                throw new IllegalArgumentException("Unexpected type converter " + list2.get(size5) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i14 < 0) {
                                break;
                            }
                            size5 = i14;
                        }
                    }
                    Hb.i iVar3 = c0313b.f5145u;
                    if (iVar3 != null) {
                        Hb.g gVar = iVar3.get(Hb.e.f4918a);
                        kotlin.jvm.internal.l.c(gVar, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
                        cc.A a10 = (cc.A) gVar;
                        AbstractC0923b0 abstractC0923b0 = a10 instanceof AbstractC0923b0 ? (AbstractC0923b0) a10 : null;
                        if (abstractC0923b0 == null || (o10 = abstractC0923b0.X()) == null) {
                            o10 = new cc.O(a10);
                        }
                        e10.f5028c = o10;
                        e10.f5029d = new K(o10);
                        e10.f5026a = cc.F.b(iVar3.plus(new C0943l0((InterfaceC0937i0) iVar3.get(cc.B.f14467b))));
                        if (e10.p()) {
                            C1277e c1277e = e10.f5026a;
                            if (c1277e == null) {
                                kotlin.jvm.internal.l.j("coroutineScope");
                                throw null;
                            }
                            iVar = c1277e.f17939a.plus(a10.W(z8 ? 1 : 0));
                        } else {
                            C1277e c1277e2 = e10.f5026a;
                            if (c1277e2 == null) {
                                kotlin.jvm.internal.l.j("coroutineScope");
                                throw null;
                            }
                            iVar = c1277e2.f17939a;
                        }
                        e10.f5027b = iVar;
                    } else {
                        e10.f5028c = c0313b.f5134h;
                        e10.f5029d = new K(c0313b.f5135i);
                        Executor executor4 = e10.f5028c;
                        if (executor4 == null) {
                            kotlin.jvm.internal.l.j("internalQueryExecutor");
                            throw null;
                        }
                        C1277e b2 = cc.F.b(E6.b.w(cc.F.o(executor4), cc.F.d()));
                        e10.f5026a = b2;
                        K k = e10.f5029d;
                        if (k == null) {
                            kotlin.jvm.internal.l.j("internalTransactionExecutor");
                            throw null;
                        }
                        e10.f5027b = b2.f17939a.plus(cc.F.o(k));
                    }
                    e10.f5032h = c0313b.f5133f;
                    A a11 = e10.f5030e;
                    if (a11 == null) {
                        kotlin.jvm.internal.l.j("connectionManager");
                        throw null;
                    }
                    U2.d c10 = a11.c();
                    if (c10 != null) {
                        dVar = c10;
                        while (!(dVar instanceof O2.b)) {
                            if (dVar instanceof InterfaceC0314c) {
                                dVar = ((InterfaceC0314c) dVar).l();
                            }
                        }
                        a9 = e10.f5030e;
                        if (a9 != null) {
                            kotlin.jvm.internal.l.j("connectionManager");
                            throw null;
                        }
                        U2.d c11 = a9.c();
                        if (c11 != null) {
                            dVar2 = c11;
                            while (!(dVar2 instanceof O2.a)) {
                                if (dVar2 instanceof InterfaceC0314c) {
                                    dVar2 = ((InterfaceC0314c) dVar2).l();
                                }
                            }
                            intent = c0313b.j;
                            if (intent != null) {
                                String str2 = c0313b.f5129b;
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                C0323l i15 = e10.i();
                                Context context2 = c0313b.f5128a;
                                kotlin.jvm.internal.l.e(context2, "context");
                                i15.f5174h = intent;
                                i15.f5175i = new C0327p(context2, str2, i15);
                            }
                            return e10;
                        }
                        dVar2 = null;
                        intent = c0313b.j;
                        if (intent != null) {
                        }
                        return e10;
                    }
                    dVar = null;
                    a9 = e10.f5030e;
                    if (a9 != null) {
                    }
                }
            }
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("Cannot find implementation for " + q10.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("Cannot access the constructor " + q10.getCanonicalName(), e12);
        } catch (InstantiationException e13) {
            throw new RuntimeException("Failed to create an instance of " + q10.getCanonicalName(), e13);
        }
    }
}
