package hc;

import a.AbstractC0672a;
import cc.AbstractC0921a0;
import cc.C;
import cc.C0955v;
import cc.F;
import cc.G0;
import cc.InterfaceC0937i0;
import cc.L0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: hc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1273a {

    /* renamed from: c, reason: collision with root package name */
    public static final R7.a f17931c;

    /* renamed from: d, reason: collision with root package name */
    public static final R7.a f17932d;

    /* renamed from: a, reason: collision with root package name */
    public static final R7.a f17929a = new R7.a("NO_DECISION", 28);

    /* renamed from: b, reason: collision with root package name */
    public static final R7.a f17930b = new R7.a("CLOSED", 28);

    /* renamed from: e, reason: collision with root package name */
    public static final R7.a f17933e = new R7.a("CONDITION_FALSE", 28);

    /* renamed from: f, reason: collision with root package name */
    public static final R7.a f17934f = new R7.a("NO_THREAD_ELEMENTS", 28);

    static {
        int i7 = 28;
        f17931c = new R7.a("UNDEFINED", i7);
        f17932d = new R7.a("REUSABLE_CLAIMED", i7);
    }

    public static final void a(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException(h3.o.l(i7, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(u uVar, long j, Rb.e eVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (uVar.f17971c >= j && !uVar.c()) {
                return uVar;
            }
            Object obj = AbstractC1276d.f17937a.get(uVar);
            R7.a aVar = f17930b;
            if (obj == aVar) {
                return aVar;
            }
            u uVar2 = (u) ((AbstractC1276d) obj);
            if (uVar2 == null) {
                uVar2 = (u) eVar.invoke(Long.valueOf(uVar.f17971c + 1), uVar);
                do {
                    atomicReferenceFieldUpdater = AbstractC1276d.f17937a;
                    if (atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                        if (uVar.c()) {
                            uVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(uVar) == null);
            }
            uVar = uVar2;
        }
    }

    public static final u c(Object obj) {
        if (obj != f17930b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Hb.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f17940a.iterator();
        while (it.hasNext()) {
            try {
                ((C) it.next()).P(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0672a.c(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC0672a.c(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f17930b;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(Hb.i iVar, Object obj) {
        if (obj == f17934f) {
            return;
        }
        if (!(obj instanceof C1272B)) {
            Object fold = iVar.fold(null, x.f17975c);
            kotlin.jvm.internal.l.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((y) fold).a(obj);
            return;
        }
        C1272B c1272b = (C1272B) obj;
        y[] yVarArr = c1272b.f17927c;
        int length = yVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i7 = length - 1;
            y yVar = yVarArr[length];
            kotlin.jvm.internal.l.b(yVar);
            yVar.a(c1272b.f17926b[length]);
            if (i7 < 0) {
                return;
            } else {
                length = i7;
            }
        }
    }

    public static final void h(Hb.d dVar, Object obj) {
        if (!(dVar instanceof h)) {
            dVar.resumeWith(obj);
            return;
        }
        h hVar = (h) dVar;
        Throwable a9 = Db.m.a(obj);
        Object c0955v = a9 == null ? obj : new C0955v(false, a9);
        Jb.c cVar = hVar.f17944e;
        Hb.i context = cVar.getContext();
        cc.A a10 = hVar.f17943d;
        if (a10.V(context)) {
            hVar.f17945f = c0955v;
            hVar.f14494c = 1;
            a10.T(cVar.getContext(), hVar);
            return;
        }
        AbstractC0921a0 a11 = G0.a();
        if (a11.b0()) {
            hVar.f17945f = c0955v;
            hVar.f14494c = 1;
            a11.Y(hVar);
            return;
        }
        a11.a0(true);
        try {
            InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) cVar.getContext().get(cc.B.f14467b);
            if (interfaceC0937i0 == null || interfaceC0937i0.isActive()) {
                Object obj2 = hVar.f17946u;
                Hb.i context2 = cVar.getContext();
                Object m10 = m(context2, obj2);
                L0 J10 = m10 != f17934f ? F.J(cVar, context2, m10) : null;
                try {
                    cVar.resumeWith(obj);
                } finally {
                    if (J10 == null || J10.Z()) {
                        g(context2, m10);
                    }
                }
            } else {
                CancellationException cancellationException = interfaceC0937i0.getCancellationException();
                hVar.c(c0955v, cancellationException);
                hVar.resumeWith(com.bumptech.glide.c.n(cancellationException));
            }
            do {
            } while (a11.d0());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long j(String str, long j, long j10, long j11) {
        String str2;
        int i7;
        Long valueOf;
        long j12;
        int i10 = w.f17973a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        com.bumptech.glide.c.g(10);
        int length = str2.length();
        if (length != 0) {
            int i11 = 0;
            char charAt = str2.charAt(0);
            long j13 = -9223372036854775807L;
            if (kotlin.jvm.internal.l.f(charAt, 48) < 0) {
                if (length != 1) {
                    if (charAt == '+') {
                        i7 = 0;
                        i11 = 1;
                        long j14 = 0;
                        long j15 = -256204778801521550L;
                        while (i11 < length) {
                            int digit = Character.digit((int) str2.charAt(i11), 10);
                            if (digit >= 0) {
                                if (j14 < j15) {
                                    if (j15 == -256204778801521550L) {
                                        j15 = j13 / 10;
                                        if (j14 < j15) {
                                        }
                                    }
                                }
                                long j16 = j14 * 10;
                                long j17 = digit;
                                if (j16 >= j13 + j17) {
                                    j14 = j16 - j17;
                                    i11++;
                                }
                            }
                        }
                        valueOf = i7 == 0 ? Long.valueOf(j14) : Long.valueOf(-j14);
                        if (valueOf == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
                        }
                        long longValue = valueOf.longValue();
                        if (j10 <= longValue) {
                            j12 = j11;
                            if (longValue <= j12) {
                                return longValue;
                            }
                        } else {
                            j12 = j11;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j12 + ", but is '" + longValue + '\'').toString());
                    }
                    if (charAt == '-') {
                        j13 = Long.MIN_VALUE;
                        i11 = 1;
                    }
                }
            }
            i7 = i11;
            long j142 = 0;
            long j152 = -256204778801521550L;
            while (i11 < length) {
            }
            valueOf = i7 == 0 ? Long.valueOf(j142) : Long.valueOf(-j142);
            if (valueOf == null) {
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public static int k(int i7, int i10, String str) {
        return (int) j(str, i7, 1, (i10 & 8) != 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2097150);
    }

    public static final Object l(Hb.i iVar) {
        Object fold = iVar.fold(0, x.f17974b);
        kotlin.jvm.internal.l.b(fold);
        return fold;
    }

    public static final Object m(Hb.i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        return obj == 0 ? f17934f : obj instanceof Integer ? iVar.fold(new C1272B(((Number) obj).intValue(), iVar), x.f17976d) : ((y) obj).b(iVar);
    }
}
