package i3;

import A9.N2;
import I2.AbstractC0315d;
import I2.H;
import Y5.J0;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import cc.C0943l0;
import cc.F;
import cc.InterfaceC0937i0;
import h3.C1235A;
import h3.C1240b;
import h3.C1247i;
import h3.C1249k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import y7.u0;

/* renamed from: i3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1340B {

    /* renamed from: a, reason: collision with root package name */
    public final q3.p f18318a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f18319b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18320c;

    /* renamed from: d, reason: collision with root package name */
    public final q3.i f18321d;

    /* renamed from: e, reason: collision with root package name */
    public final C1240b f18322e;

    /* renamed from: f, reason: collision with root package name */
    public final C1235A f18323f;
    public final d g;

    /* renamed from: h, reason: collision with root package name */
    public final WorkDatabase f18324h;

    /* renamed from: i, reason: collision with root package name */
    public final q3.q f18325i;
    public final q3.c j;
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18326l;

    /* renamed from: m, reason: collision with root package name */
    public final C0943l0 f18327m;

    public C1340B(B7.d dVar) {
        q3.p pVar = (q3.p) dVar.f2214e;
        this.f18318a = pVar;
        this.f18319b = (Context) dVar.g;
        String str = pVar.f23403a;
        this.f18320c = str;
        this.f18321d = (q3.i) dVar.f2211b;
        C1240b c1240b = (C1240b) dVar.f2210a;
        this.f18322e = c1240b;
        this.f18323f = c1240b.f17671d;
        this.g = (d) dVar.f2212c;
        WorkDatabase workDatabase = (WorkDatabase) dVar.f2213d;
        this.f18324h = workDatabase;
        this.f18325i = workDatabase.C();
        this.j = workDatabase.x();
        ArrayList arrayList = (ArrayList) dVar.f2215f;
        this.k = arrayList;
        this.f18326l = h3.o.p(X.c.n("Work [ id=", str, ", tags={ "), Eb.o.d0(arrayList, ",", null, null, null, 62), " } ]");
        this.f18327m = F.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.work.WorkerParameters, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C1340B c1340b, Jb.c cVar) {
        z zVar;
        int i7;
        OverwritingInputMerger overwritingInputMerger;
        C1249k c1249k;
        final C1340B c1340b2 = c1340b;
        try {
            if (cVar instanceof z) {
                zVar = (z) cVar;
                int i10 = zVar.f18399d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zVar.f18399d = i10 - Integer.MIN_VALUE;
                    Object obj = zVar.f18397b;
                    Ib.a aVar = Ib.a.f5345a;
                    i7 = zVar.f18399d;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        C1240b c1240b = c1340b2.f18322e;
                        c1240b.f17677m.getClass();
                        boolean w10 = vc.i.w();
                        q3.p pVar = c1340b2.f18318a;
                        String str = pVar.f23423x;
                        String str2 = pVar.f23405c;
                        if (w10 && str != null) {
                            int hashCode = pVar.hashCode();
                            if (Build.VERSION.SDK_INT >= 29) {
                                Z2.a.a(hashCode, vc.i.I(str));
                            } else {
                                String I6 = vc.i.I(str);
                                try {
                                    if (vc.i.f25480c == null) {
                                        vc.i.f25480c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                    }
                                    vc.i.f25480c.invoke(null, Long.valueOf(vc.i.f25478a), I6, Integer.valueOf(hashCode));
                                } catch (Exception e2) {
                                    vc.i.v("asyncTraceBegin", e2);
                                }
                            }
                        }
                        final int i11 = 0;
                        Callable callable = new Callable(c1340b2) { // from class: i3.s

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ C1340B f18388b;

                            {
                                this.f18388b = c1340b2;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i11) {
                                    case 0:
                                        C1340B c1340b3 = this.f18388b;
                                        q3.p pVar2 = c1340b3.f18318a;
                                        int i12 = pVar2.f23404b;
                                        String str3 = pVar2.f23405c;
                                        if (i12 != 1) {
                                            String str4 = AbstractC1341C.f18328a;
                                            h3.z.e().a(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
                                            return Boolean.TRUE;
                                        }
                                        if (pVar2.d() || (pVar2.f23404b == 1 && pVar2.k > 0)) {
                                            c1340b3.f18323f.getClass();
                                            if (System.currentTimeMillis() < pVar2.a()) {
                                                h3.z.e().a(AbstractC1341C.f18328a, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                                                return Boolean.TRUE;
                                            }
                                        }
                                        return Boolean.FALSE;
                                    default:
                                        C1340B c1340b4 = this.f18388b;
                                        q3.q qVar = c1340b4.f18325i;
                                        String str5 = c1340b4.f18320c;
                                        boolean z8 = true;
                                        if (qVar.g(str5) == 1) {
                                            qVar.n(2, str5);
                                            WorkDatabase_Impl workDatabase_Impl = qVar.f23424a;
                                            workDatabase_Impl.b();
                                            q3.h hVar = qVar.f23431i;
                                            V2.j a9 = hVar.a();
                                            a9.p(1, str5);
                                            try {
                                                workDatabase_Impl.c();
                                                try {
                                                    a9.l();
                                                    workDatabase_Impl.v();
                                                    hVar.l(a9);
                                                    qVar.o(-256, str5);
                                                } finally {
                                                    workDatabase_Impl.r();
                                                }
                                            } catch (Throwable th) {
                                                hVar.l(a9);
                                                throw th;
                                            }
                                        } else {
                                            z8 = false;
                                        }
                                        return Boolean.valueOf(z8);
                                }
                            }
                        };
                        WorkDatabase workDatabase = c1340b2.f18324h;
                        Boolean shouldExit = (Boolean) workDatabase.u(new N2(callable, 8));
                        kotlin.jvm.internal.l.d(shouldExit, "shouldExit");
                        if (shouldExit.booleanValue()) {
                            return new v();
                        }
                        boolean d10 = pVar.d();
                        String str3 = c1340b2.f18320c;
                        if (d10) {
                            c1249k = pVar.f23407e;
                        } else {
                            c1240b.f17673f.getClass();
                            String className = pVar.f23406d;
                            kotlin.jvm.internal.l.e(className, "className");
                            String str4 = h3.q.f17706a;
                            try {
                                Object newInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
                                kotlin.jvm.internal.l.c(newInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
                                overwritingInputMerger = (OverwritingInputMerger) newInstance;
                            } catch (Exception e10) {
                                h3.z.e().d(h3.q.f17706a, "Trouble instantiating ".concat(className), e10);
                                overwritingInputMerger = null;
                            }
                            if (overwritingInputMerger == null) {
                                h3.z.e().c(AbstractC1341C.f18328a, "Could not create Input Merger ".concat(className));
                                return new t();
                            }
                            List x2 = u0.x(pVar.f23407e);
                            q3.q qVar = c1340b2.f18325i;
                            qVar.getClass();
                            TreeMap treeMap = H.f5039w;
                            H a9 = AbstractC0315d.a(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                            a9.p(1, str3);
                            WorkDatabase_Impl workDatabase_Impl = qVar.f23424a;
                            workDatabase_Impl.b();
                            Cursor n6 = P2.j.n(workDatabase_Impl, a9);
                            try {
                                ArrayList arrayList = new ArrayList(n6.getCount());
                                while (n6.moveToNext()) {
                                    arrayList.add(C1249k.a(n6.getBlob(0)));
                                }
                                n6.close();
                                a9.F();
                                ArrayList i02 = Eb.o.i0(x2, arrayList);
                                C1247i c1247i = new C1247i(0);
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                Iterator it = i02.iterator();
                                while (it.hasNext()) {
                                    Map unmodifiableMap = Collections.unmodifiableMap(((C1249k) it.next()).f17699a);
                                    kotlin.jvm.internal.l.d(unmodifiableMap, "unmodifiableMap(values)");
                                    linkedHashMap.putAll(unmodifiableMap);
                                }
                                c1247i.c(linkedHashMap);
                                c1249k = new C1249k(c1247i.f17696a);
                                c2.i.y(c1249k);
                            } catch (Throwable th) {
                                n6.close();
                                a9.F();
                                throw th;
                            }
                        }
                        UUID fromString = UUID.fromString(str3);
                        q3.i iVar = c1340b2.f18321d;
                        r3.p pVar2 = new r3.p(workDatabase, iVar);
                        r3.o oVar = new r3.o(workDatabase, c1340b2.g, iVar);
                        ?? obj2 = new Object();
                        obj2.f13733a = fromString;
                        obj2.f13734b = c1249k;
                        new HashSet(c1340b2.k);
                        obj2.f13735c = c1240b.f17668a;
                        obj2.f13736d = c1240b.f17669b;
                        obj2.f13737e = iVar;
                        E6.b bVar = c1240b.f17672e;
                        obj2.f13738f = bVar;
                        obj2.g = pVar2;
                        try {
                            h3.y j = bVar.j(c1340b2.f18319b, str2, obj2);
                            j.f17721d = true;
                            Hb.g gVar = zVar.getContext().get(cc.B.f14467b);
                            kotlin.jvm.internal.l.b(gVar);
                            InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) gVar;
                            interfaceC0937i0.invokeOnCompletion(new E.r(j, w10, str, c1340b2));
                            final int i12 = 1;
                            Object u3 = workDatabase.u(new N2(new Callable(c1340b2) { // from class: i3.s

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ C1340B f18388b;

                                {
                                    this.f18388b = c1340b2;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    switch (i12) {
                                        case 0:
                                            C1340B c1340b3 = this.f18388b;
                                            q3.p pVar22 = c1340b3.f18318a;
                                            int i122 = pVar22.f23404b;
                                            String str32 = pVar22.f23405c;
                                            if (i122 != 1) {
                                                String str42 = AbstractC1341C.f18328a;
                                                h3.z.e().a(str42, str32 + " is not in ENQUEUED state. Nothing more to do");
                                                return Boolean.TRUE;
                                            }
                                            if (pVar22.d() || (pVar22.f23404b == 1 && pVar22.k > 0)) {
                                                c1340b3.f18323f.getClass();
                                                if (System.currentTimeMillis() < pVar22.a()) {
                                                    h3.z.e().a(AbstractC1341C.f18328a, "Delaying execution for " + str32 + " because it is being executed before schedule.");
                                                    return Boolean.TRUE;
                                                }
                                            }
                                            return Boolean.FALSE;
                                        default:
                                            C1340B c1340b4 = this.f18388b;
                                            q3.q qVar2 = c1340b4.f18325i;
                                            String str5 = c1340b4.f18320c;
                                            boolean z8 = true;
                                            if (qVar2.g(str5) == 1) {
                                                qVar2.n(2, str5);
                                                WorkDatabase_Impl workDatabase_Impl2 = qVar2.f23424a;
                                                workDatabase_Impl2.b();
                                                q3.h hVar = qVar2.f23431i;
                                                V2.j a92 = hVar.a();
                                                a92.p(1, str5);
                                                try {
                                                    workDatabase_Impl2.c();
                                                    try {
                                                        a92.l();
                                                        workDatabase_Impl2.v();
                                                        hVar.l(a92);
                                                        qVar2.o(-256, str5);
                                                    } finally {
                                                        workDatabase_Impl2.r();
                                                    }
                                                } catch (Throwable th2) {
                                                    hVar.l(a92);
                                                    throw th2;
                                                }
                                            } else {
                                                z8 = false;
                                            }
                                            return Boolean.valueOf(z8);
                                    }
                                }
                            }, 8));
                            kotlin.jvm.internal.l.d(u3, "workDatabase.runInTransa…e\n            }\n        )");
                            if (((Boolean) u3).booleanValue() && !interfaceC0937i0.isCancelled()) {
                                J0 j02 = (J0) iVar.f23385d;
                                kotlin.jvm.internal.l.d(j02, "workTaskExecutor.getMainThreadExecutor()");
                                cc.A o10 = F.o(j02);
                                C1339A c1339a = new C1339A(c1340b2, j, oVar, null);
                                zVar.f18396a = c1340b2;
                                zVar.f18399d = 1;
                                obj = F.K(o10, c1339a, zVar);
                                if (obj == aVar) {
                                    return aVar;
                                }
                            }
                            return new v();
                        } catch (Throwable unused) {
                            String str5 = AbstractC1341C.f18328a;
                            h3.z.e().c(str5, "Could not create Worker " + str2);
                            return new t();
                        }
                    }
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1340b2 = zVar.f18396a;
                    com.bumptech.glide.c.c0(obj);
                    h3.x result = (h3.x) obj;
                    kotlin.jvm.internal.l.d(result, "result");
                    return new u(result);
                }
            }
            if (i7 != 0) {
            }
            h3.x result2 = (h3.x) obj;
            kotlin.jvm.internal.l.d(result2, "result");
            return new u(result2);
        } catch (CancellationException e11) {
            String str6 = AbstractC1341C.f18328a;
            h3.z e12 = h3.z.e();
            String p10 = h3.o.p(new StringBuilder(), c1340b2.f18326l, " was cancelled");
            if (e12.f17724a <= 4) {
                Log.i(str6, p10, e11);
            }
            throw e11;
        } catch (Throwable th2) {
            h3.z.e().d(AbstractC1341C.f18328a, h3.o.p(new StringBuilder(), c1340b2.f18326l, " failed because it threw an exception/error"), th2);
            return new t();
        }
        zVar = new z(c1340b2, cVar);
        Object obj3 = zVar.f18397b;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = zVar.f18399d;
    }

    public final void b(int i7) {
        q3.q qVar = this.f18325i;
        String str = this.f18320c;
        qVar.n(1, str);
        this.f18323f.getClass();
        qVar.l(str, System.currentTimeMillis());
        qVar.k(this.f18318a.f23421v, str);
        qVar.j(str, -1L);
        qVar.o(i7, str);
    }

    public final void c() {
        this.f18323f.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        q3.q qVar = this.f18325i;
        String str = this.f18320c;
        qVar.l(str, currentTimeMillis);
        qVar.n(1, str);
        WorkDatabase_Impl workDatabase_Impl = qVar.f23424a;
        workDatabase_Impl.b();
        q3.h hVar = qVar.j;
        V2.j a9 = hVar.a();
        a9.p(1, str);
        try {
            workDatabase_Impl.c();
            try {
                a9.l();
                workDatabase_Impl.v();
                hVar.l(a9);
                qVar.k(this.f18318a.f23421v, str);
                workDatabase_Impl.b();
                q3.h hVar2 = qVar.f23429f;
                V2.j a10 = hVar2.a();
                a10.p(1, str);
                try {
                    workDatabase_Impl.c();
                    try {
                        a10.l();
                        workDatabase_Impl.v();
                        hVar2.l(a10);
                        qVar.j(str, -1L);
                    } finally {
                    }
                } catch (Throwable th) {
                    hVar2.l(a10);
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            hVar.l(a9);
            throw th2;
        }
    }

    public final void d(h3.x result) {
        kotlin.jvm.internal.l.e(result, "result");
        String str = this.f18320c;
        ArrayList B10 = u0.B(str);
        while (true) {
            boolean isEmpty = B10.isEmpty();
            q3.q qVar = this.f18325i;
            if (isEmpty) {
                C1249k c1249k = ((h3.u) result).f17716a;
                kotlin.jvm.internal.l.d(c1249k, "failure.outputData");
                qVar.k(this.f18318a.f23421v, str);
                qVar.m(str, c1249k);
                return;
            }
            String str2 = (String) Eb.o.k0(B10);
            if (qVar.g(str2) != 6) {
                qVar.n(4, str2);
            }
            B10.addAll(this.j.n(str2));
        }
    }
}
