package F;

import A0.G0;
import B0.C0210x;
import android.os.Trace;
import bc.AbstractC0850b;
import bc.AbstractC0852d;
import bc.C0849a;
import bc.EnumC0851c;
import java.util.List;
import y0.C2331P;
import y0.InterfaceC2329N;

/* loaded from: classes.dex */
public final class S implements C {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ G0 f3941A;

    /* renamed from: a, reason: collision with root package name */
    public final int f3942a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3943b;

    /* renamed from: c, reason: collision with root package name */
    public final r8.o f3944c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2329N f3945d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3946e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3947f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3948u;

    /* renamed from: v, reason: collision with root package name */
    public Q f3949v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3950w;

    /* renamed from: x, reason: collision with root package name */
    public long f3951x;

    /* renamed from: y, reason: collision with root package name */
    public long f3952y;

    /* renamed from: z, reason: collision with root package name */
    public long f3953z;

    public S(G0 g02, int i7, long j, r8.o oVar) {
        this.f3941A = g02;
        this.f3942a = i7;
        this.f3943b = j;
        this.f3944c = oVar;
        int i10 = AbstractC0852d.f14006b;
        this.f3953z = System.nanoTime() - AbstractC0852d.f14005a;
    }

    public final boolean a(C0257a c0257a) {
        r8.o oVar;
        long j;
        long j10;
        G0 g02 = this.f3941A;
        E.j jVar = (E.j) ((r) g02.f27b).f3997b.invoke();
        if (this.f3947f) {
            return false;
        }
        int b2 = jVar.b();
        int i7 = this.f3942a;
        if (i7 < 0 || i7 >= b2) {
            return false;
        }
        Object a9 = jVar.a(i7);
        long nanoTime = System.nanoTime();
        long j11 = c0257a.f3957a;
        this.f3951x = Math.max(0L, j11 - nanoTime);
        int i10 = AbstractC0852d.f14006b;
        this.f3953z = System.nanoTime() - AbstractC0852d.f14005a;
        this.f3952y = 0L;
        boolean z8 = this.f3945d != null;
        r8.o oVar2 = this.f3944c;
        if (z8) {
            oVar = oVar2;
        } else {
            long j12 = this.f3951x;
            long j13 = oVar2.a(a9).f3965a;
            if ((!this.f3950w || j12 <= 0) && j13 >= j12) {
                return true;
            }
            Trace.beginSection("compose:lazy:prefetch:compose");
            try {
                if (this.f3945d != null) {
                    B.a.a("Request was already composed!");
                }
                Object c10 = jVar.c(i7);
                this.f3945d = ((C2331P) g02.f28c).a().g(c10, ((r) g02.f27b).a(i7, c10, a9));
                Trace.endSection();
                e();
                long j14 = this.f3952y;
                C0259c c0259c = (C0259c) oVar2.f23857b;
                long j15 = c0259c.f3965a;
                if (j15 == 0) {
                    j10 = j14;
                } else {
                    long j16 = 4;
                    j10 = (j14 / j16) + ((j15 / j16) * 3);
                }
                c0259c.f3965a = j10;
                C0259c a10 = oVar2.a(a9);
                long j17 = a10.f3965a;
                if (j17 == 0) {
                    oVar = oVar2;
                } else {
                    long j18 = 4;
                    oVar = oVar2;
                    j14 = (j14 / j18) + ((j17 / j18) * 3);
                }
                a10.f3965a = j14;
            } finally {
            }
        }
        if (!this.f3950w) {
            if (!this.f3948u) {
                if (this.f3951x <= 0) {
                    return true;
                }
                Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                try {
                    this.f3949v = d();
                    this.f3948u = true;
                } finally {
                }
            }
            Q q10 = this.f3949v;
            if (q10 != null) {
                List[] listArr = (List[]) q10.f3939d;
                int i11 = q10.f3936a;
                List list = (List) q10.f3938c;
                if (i11 < list.size()) {
                    if (((S) q10.f3940e).f3947f) {
                        B.a.c("Should not execute nested prefetch on canceled request");
                    }
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (q10.f3936a < list.size()) {
                        try {
                            if (listArr[q10.f3936a] == null) {
                                if (Math.max(0L, j11 - System.nanoTime()) <= 0) {
                                    return true;
                                }
                                int i12 = q10.f3936a;
                                D d10 = (D) list.get(i12);
                                E.w wVar = d10.f3901a;
                                B b10 = new B(d10);
                                wVar.invoke(b10);
                                listArr[i12] = b10.f3899a;
                            }
                            List list2 = listArr[q10.f3936a];
                            kotlin.jvm.internal.l.b(list2);
                            while (q10.f3937b < list2.size()) {
                                if (((S) list2.get(q10.f3937b)).a(c0257a)) {
                                    return true;
                                }
                                q10.f3937b++;
                            }
                            q10.f3937b = 0;
                            q10.f3936a++;
                        } finally {
                        }
                    }
                }
            }
            e();
        }
        if (this.f3946e) {
            return false;
        }
        long j19 = this.f3943b;
        int i13 = (int) (3 & j19);
        int i14 = (((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1);
        int i15 = (((int) (j19 >> 33)) & ((1 << (i14 + 13)) - 1)) - 1;
        if (((((1 << (18 - i14)) - 1) & ((int) (j19 >> (i14 + 46)))) - 1 == 0) || (i15 == 0)) {
            return false;
        }
        long j20 = this.f3951x;
        r8.o oVar3 = oVar;
        long j21 = oVar3.a(a9).f3966b;
        if ((!this.f3950w || j20 <= 0) && j21 >= j20) {
            return true;
        }
        Trace.beginSection("compose:lazy:prefetch:measure");
        try {
            c(j19);
            Trace.endSection();
            e();
            long j22 = this.f3952y;
            C0259c c0259c2 = (C0259c) oVar3.f23857b;
            long j23 = c0259c2.f3966b;
            if (j23 == 0) {
                j = j22;
            } else {
                long j24 = 4;
                j = (j22 / j24) + ((j23 / j24) * 3);
            }
            c0259c2.f3966b = j;
            C0259c a11 = oVar3.a(a9);
            long j25 = a11.f3966b;
            if (j25 != 0) {
                long j26 = 4;
                j22 = (j22 / j26) + ((j25 / j26) * 3);
            }
            a11.f3966b = j22;
            return false;
        } finally {
        }
    }

    @Override // F.C
    public final void b() {
        this.f3950w = true;
    }

    public final void c(long j) {
        if (this.f3947f) {
            B.a.a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f3946e) {
            B.a.a("Request was already measured!");
        }
        this.f3946e = true;
        InterfaceC2329N interfaceC2329N = this.f3945d;
        if (interfaceC2329N == null) {
            B.a.b("performComposition() must be called before performMeasure()");
            throw new Db.d(0);
        }
        int c10 = interfaceC2329N.c();
        for (int i7 = 0; i7 < c10; i7++) {
            interfaceC2329N.d(i7, j);
        }
    }

    @Override // F.C
    public final void cancel() {
        if (this.f3947f) {
            return;
        }
        this.f3947f = true;
        InterfaceC2329N interfaceC2329N = this.f3945d;
        if (interfaceC2329N != null) {
            interfaceC2329N.b();
        }
        this.f3945d = null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [F.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List[], java.io.Serializable] */
    public final Q d() {
        InterfaceC2329N interfaceC2329N = this.f3945d;
        if (interfaceC2329N == null) {
            B.a.b("Should precompose before resolving nested prefetch states");
            throw new Db.d(0);
        }
        ?? obj = new Object();
        interfaceC2329N.a(new C0210x(obj, 1));
        List list = (List) obj.f19134a;
        if (list == null) {
            return null;
        }
        ?? obj2 = new Object();
        obj2.f3940e = this;
        obj2.f3938c = list;
        obj2.f3939d = new List[list.size()];
        if (!list.isEmpty()) {
            return obj2;
        }
        B.a.a("NestedPrefetchController shouldn't be created with no states");
        return obj2;
    }

    public final void e() {
        int i7 = AbstractC0852d.f14006b;
        long nanoTime = System.nanoTime() - AbstractC0852d.f14005a;
        long j = this.f3953z;
        EnumC0851c unit = EnumC0851c.f13997b;
        kotlin.jvm.internal.l.e(unit, "unit");
        long j10 = 0;
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (nanoTime == j) {
                int i10 = C0849a.f13994d;
            } else {
                long z8 = Z9.x.z(j);
                int i11 = C0849a.f13994d;
                j10 = ((-(z8 >> 1)) << 1) + (((int) z8) & 1);
                int i12 = AbstractC0850b.f13996a;
            }
        } else if (((nanoTime - 1) | 1) == Long.MAX_VALUE) {
            j10 = Z9.x.z(nanoTime);
        } else {
            long j11 = nanoTime - j;
            if (((j11 ^ nanoTime) & (~(j11 ^ j))) < 0) {
                EnumC0851c enumC0851c = EnumC0851c.f13998c;
                if (unit.compareTo(enumC0851c) < 0) {
                    long h10 = Y6.b.h(1L, enumC0851c, unit);
                    long j12 = (nanoTime / h10) - (j / h10);
                    long j13 = (nanoTime % h10) - (j % h10);
                    int i13 = C0849a.f13994d;
                    long N10 = Tb.a.N(j12, enumC0851c);
                    long N11 = Tb.a.N(j13, unit);
                    if (!C0849a.f(N10)) {
                        if (!C0849a.f(N11)) {
                            int i14 = ((int) N10) & 1;
                            if (i14 == (((int) N11) & 1)) {
                                long j14 = (N10 >> 1) + (N11 >> 1);
                                if (i14 == 0) {
                                    if (-4611686018426999999L > j14 || j14 >= 4611686018427000000L) {
                                        N11 = Tb.a.j(j14 / 1000000);
                                    } else {
                                        N11 = j14 << 1;
                                        int i15 = AbstractC0850b.f13996a;
                                    }
                                } else if (-4611686018426L > j14 || j14 >= 4611686018427L) {
                                    N11 = Tb.a.j(h3.H.l(j14, -4611686018427387903L, 4611686018427387903L));
                                } else {
                                    N11 = (j14 * 1000000) << 1;
                                    int i16 = AbstractC0850b.f13996a;
                                }
                            } else {
                                N11 = i14 == 1 ? C0849a.a(N10 >> 1, N11 >> 1) : C0849a.a(N11 >> 1, N10 >> 1);
                            }
                        }
                        N10 = N11;
                    } else if (C0849a.f(N11) && (N11 ^ N10) < 0) {
                        throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
                    }
                    j10 = N10;
                } else {
                    long z10 = Z9.x.z(j11);
                    int i17 = C0849a.f13994d;
                    long j15 = ((-(z10 >> 1)) << 1) + (((int) z10) & 1);
                    int i18 = AbstractC0850b.f13996a;
                    j10 = j15;
                }
            } else {
                j10 = Tb.a.N(j11, unit);
            }
        }
        long j16 = j10 >> 1;
        int i19 = C0849a.f13994d;
        long j17 = (((int) j10) & 1) == 0 ? j16 : j16 > 9223372036854L ? Long.MAX_VALUE : j16 < -9223372036854L ? Long.MIN_VALUE : j16 * 1000000;
        this.f3952y = j17;
        this.f3951x -= j17;
        this.f3953z = nanoTime;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HandleAndRequestImpl { index = ");
        sb2.append(this.f3942a);
        sb2.append(", constraints = ");
        sb2.append((Object) V0.a.k(this.f3943b));
        sb2.append(", isComposed = ");
        sb2.append(this.f3945d != null);
        sb2.append(", isMeasured = ");
        sb2.append(this.f3946e);
        sb2.append(", isCanceled = ");
        sb2.append(this.f3947f);
        sb2.append(" }");
        return sb2.toString();
    }
}
