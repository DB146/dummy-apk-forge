package Q;

import a0.AbstractC0688o;
import android.os.Trace;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import u.C2047J;

/* renamed from: Q.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514s0 extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0518u0 f8499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2047J f8500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2047J f8501c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f8502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f8503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2047J f8504f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f8505u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C2047J f8506v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Set f8507w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0514s0(C0518u0 c0518u0, C2047J c2047j, C2047J c2047j2, List list, List list2, C2047J c2047j3, List list3, C2047J c2047j4, Set set) {
        super(1);
        this.f8499a = c0518u0;
        this.f8500b = c2047j;
        this.f8501c = c2047j2;
        this.f8502d = list;
        this.f8503e = list2;
        this.f8504f = c2047j3;
        this.f8505u = list3;
        this.f8506v = c2047j4;
        this.f8507w = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r0.h() == true) goto L19;
     */
    @Override // Rb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean v10;
        List list;
        C2047J c2047j;
        C2047J c2047j2;
        C0518u0 c0518u0;
        C2047J c2047j3;
        C2047J c2047j4;
        C0518u0 c0518u02;
        List list2;
        boolean z8;
        long longValue = ((Number) obj).longValue();
        C0518u0 c0518u03 = this.f8499a;
        synchronized (c0518u03.f8543b) {
            v10 = c0518u03.v();
        }
        if (v10) {
            C0518u0 c0518u04 = this.f8499a;
            Trace.beginSection("Recomposer:animation");
            try {
                c0518u04.f8542a.a(longValue);
                synchronized (AbstractC0688o.f12405b) {
                    C2047J c2047j5 = AbstractC0688o.f12411i.f12376h;
                    z8 = c2047j5 != null;
                }
                if (z8) {
                    AbstractC0688o.a();
                }
            } finally {
            }
        }
        C0518u0 c0518u05 = this.f8499a;
        C2047J c2047j6 = this.f8500b;
        C2047J c2047j7 = this.f8501c;
        List list3 = this.f8502d;
        List list4 = this.f8503e;
        C2047J c2047j8 = this.f8504f;
        List list5 = this.f8505u;
        C2047J c2047j9 = this.f8506v;
        Set set = this.f8507w;
        Trace.beginSection("Recomposer:recompose");
        try {
            C0518u0.r(c0518u05);
            synchronized (c0518u05.f8543b) {
                try {
                    S.e eVar = c0518u05.f8548h;
                    Object[] objArr = eVar.f8959a;
                    int i7 = eVar.f8961c;
                    for (int i10 = 0; i10 < i7; i10++) {
                        list3.add((C0517u) objArr[i10]);
                    }
                    c0518u05.f8548h.g();
                } finally {
                }
            }
            c2047j6.b();
            c2047j7.b();
            while (true) {
                if (list3.isEmpty() && list4.isEmpty()) {
                    break;
                }
                C0518u0 c0518u06 = c0518u05;
                C2047J c2047j10 = c2047j6;
                C2047J c2047j11 = c2047j7;
                List list6 = list5;
                try {
                    int size = list3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        C0517u c0517u = (C0517u) list3.get(i11);
                        c2047j = c2047j10;
                        try {
                            C0517u q10 = C0518u0.q(c0518u06, c0517u, c2047j);
                            if (q10 != null) {
                                list = list6;
                                try {
                                    list.add(q10);
                                } catch (Throwable th) {
                                    th = th;
                                    c2047j2 = c2047j11;
                                    try {
                                        c0518u06.A(th, null);
                                        C0516t0.c(c0518u06, list3, list4, list, c2047j8, c2047j9, c2047j, c2047j2);
                                        return Db.q.f3365a;
                                    } finally {
                                        list3.clear();
                                    }
                                }
                            } else {
                                list = list6;
                            }
                            c2047j2 = c2047j11;
                            try {
                                c2047j2.a(c0517u);
                                i11++;
                                list6 = list;
                                c2047j10 = c2047j;
                                c2047j11 = c2047j2;
                            } catch (Throwable th2) {
                                th = th2;
                                c0518u06.A(th, null);
                                C0516t0.c(c0518u06, list3, list4, list, c2047j8, c2047j9, c2047j, c2047j2);
                                return Db.q.f3365a;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            list = list6;
                        }
                    }
                    List list7 = list6;
                    c2047j6 = c2047j10;
                    c2047j7 = c2047j11;
                    list3.clear();
                    if (c2047j6.h() || c0518u06.f8548h.f8961c != 0) {
                        synchronized (c0518u06.f8543b) {
                            try {
                                List x2 = c0518u06.x();
                                int size2 = x2.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    C0517u c0517u2 = (C0517u) x2.get(i12);
                                    if (!c2047j7.c(c0517u2) && c0517u2.v(set)) {
                                        list3.add(c0517u2);
                                    }
                                }
                                S.e eVar2 = c0518u06.f8548h;
                                int i13 = eVar2.f8961c;
                                int i14 = 0;
                                for (int i15 = 0; i15 < i13; i15++) {
                                    C0517u c0517u3 = (C0517u) eVar2.f8959a[i15];
                                    if (!c2047j7.c(c0517u3) && !list3.contains(c0517u3)) {
                                        list3.add(c0517u3);
                                        i14++;
                                    } else if (i14 > 0) {
                                        Object[] objArr2 = eVar2.f8959a;
                                        objArr2[i15 - i14] = objArr2[i15];
                                    }
                                }
                                int i16 = i13 - i14;
                                Arrays.fill(eVar2.f8959a, i16, i13, (Object) null);
                                eVar2.f8961c = i16;
                            } finally {
                            }
                        }
                    }
                    if (list3.isEmpty()) {
                        try {
                            C0516t0.g(list4, c0518u06);
                            while (!list4.isEmpty()) {
                                List z10 = c0518u06.z(list4, c2047j6);
                                c2047j8.getClass();
                                Iterator it = z10.iterator();
                                while (it.hasNext()) {
                                    c2047j8.j(it.next());
                                }
                                C0516t0.g(list4, c0518u06);
                            }
                        } catch (Throwable th4) {
                            c0518u06.A(th4, null);
                            C0516t0.c(c0518u06, list3, list4, list7, c2047j8, c2047j9, c2047j6, c2047j7);
                        }
                    }
                    c0518u05 = c0518u06;
                    list5 = list7;
                } catch (Throwable th5) {
                    th = th5;
                    list = list6;
                    c2047j = c2047j10;
                }
            }
            if (!list5.isEmpty()) {
                try {
                    int size3 = list5.size();
                    for (int i17 = 0; i17 < size3; i17++) {
                        c2047j9.a((C0517u) list5.get(i17));
                    }
                    int size4 = list5.size();
                    for (int i18 = 0; i18 < size4; i18++) {
                        ((C0517u) list5.get(i18)).d();
                    }
                } catch (Throwable th6) {
                    try {
                        c0518u05.A(th6, null);
                        C0516t0.c(c0518u05, list3, list4, list5, c2047j8, c2047j9, c2047j6, c2047j7);
                    } finally {
                        list5.clear();
                    }
                }
            }
            long j = 255;
            char c10 = 7;
            if (c2047j8.h()) {
                try {
                    c2047j9.k(c2047j8);
                    Object[] objArr3 = c2047j8.f24610b;
                    long[] jArr = c2047j8.f24609a;
                    int length = jArr.length - 2;
                    c0518u0 = c0518u05;
                    if (length >= 0) {
                        int i19 = 0;
                        while (true) {
                            try {
                                long j10 = jArr[i19];
                                c2047j3 = c2047j6;
                                c2047j4 = c2047j7;
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i20 = 8 - ((~(i19 - length)) >>> 31);
                                    int i21 = 0;
                                    while (i21 < i20) {
                                        if ((j10 & j) < 128) {
                                            try {
                                                ((C0517u) objArr3[(i19 << 3) + i21]).f();
                                            } catch (Throwable th7) {
                                                th = th7;
                                                C0518u0 c0518u07 = c0518u0;
                                                try {
                                                    c0518u07.A(th, null);
                                                    C0516t0.c(c0518u07, list3, list4, list5, c2047j8, c2047j9, c2047j3, c2047j4);
                                                    c2047j8.b();
                                                    return Db.q.f3365a;
                                                } finally {
                                                    c2047j8.b();
                                                }
                                            }
                                        }
                                        j10 >>= 8;
                                        i21++;
                                        j = 255;
                                    }
                                    if (i20 != 8) {
                                        break;
                                    }
                                }
                                if (i19 == length) {
                                    break;
                                }
                                i19++;
                                c2047j6 = c2047j3;
                                c2047j7 = c2047j4;
                                j = 255;
                            } catch (Throwable th8) {
                                th = th8;
                                c2047j3 = c2047j6;
                                c2047j4 = c2047j7;
                                C0518u0 c0518u072 = c0518u0;
                                c0518u072.A(th, null);
                                C0516t0.c(c0518u072, list3, list4, list5, c2047j8, c2047j9, c2047j3, c2047j4);
                                c2047j8.b();
                                return Db.q.f3365a;
                            }
                        }
                    } else {
                        c2047j3 = c2047j6;
                        c2047j4 = c2047j7;
                    }
                    c0518u02 = c0518u0;
                } catch (Throwable th9) {
                    th = th9;
                    c0518u0 = c0518u05;
                }
            } else {
                c0518u02 = c0518u05;
                c2047j3 = c2047j6;
                c2047j4 = c2047j7;
            }
            if (c2047j9.h()) {
                try {
                    Object[] objArr4 = c2047j9.f24610b;
                    long[] jArr2 = c2047j9.f24609a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i22 = 0;
                        while (true) {
                            long j11 = jArr2[i22];
                            list2 = list5;
                            if ((((~j11) << c10) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                for (int i24 = 0; i24 < i23; i24++) {
                                    if ((j11 & 255) < 128) {
                                        try {
                                            ((C0517u) objArr4[(i22 << 3) + i24]).g();
                                        } catch (Throwable th10) {
                                            th = th10;
                                            try {
                                                c0518u02.A(th, null);
                                                C0516t0.c(c0518u02, list3, list4, list2, c2047j8, c2047j9, c2047j3, c2047j4);
                                                c2047j9.b();
                                                return Db.q.f3365a;
                                            } finally {
                                                c2047j9.b();
                                            }
                                        }
                                    }
                                    j11 >>= 8;
                                }
                                if (i23 != 8) {
                                    break;
                                }
                            }
                            if (i22 == length2) {
                                break;
                            }
                            i22++;
                            list5 = list2;
                            c10 = 7;
                        }
                    }
                } catch (Throwable th11) {
                    th = th11;
                    list2 = list5;
                }
            }
            synchronized (c0518u02.f8543b) {
                c0518u02.u();
            }
            AbstractC0688o.k().m();
            c2047j4.b();
            c2047j3.b();
            c0518u02.f8554p = null;
            return Db.q.f3365a;
        } finally {
        }
    }
}
