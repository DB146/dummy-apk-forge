package q3;

import androidx.work.OverwritingInputMerger;
import h3.C1243e;
import h3.C1249k;
import h3.H;
import h3.z;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: y, reason: collision with root package name */
    public static final String f23402y;

    /* renamed from: a, reason: collision with root package name */
    public final String f23403a;

    /* renamed from: b, reason: collision with root package name */
    public int f23404b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23405c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23406d;

    /* renamed from: e, reason: collision with root package name */
    public C1249k f23407e;

    /* renamed from: f, reason: collision with root package name */
    public final C1249k f23408f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public long f23409h;

    /* renamed from: i, reason: collision with root package name */
    public long f23410i;
    public final C1243e j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f23411l;

    /* renamed from: m, reason: collision with root package name */
    public final long f23412m;

    /* renamed from: n, reason: collision with root package name */
    public long f23413n;

    /* renamed from: o, reason: collision with root package name */
    public final long f23414o;

    /* renamed from: p, reason: collision with root package name */
    public final long f23415p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f23416q;

    /* renamed from: r, reason: collision with root package name */
    public final int f23417r;

    /* renamed from: s, reason: collision with root package name */
    public final int f23418s;

    /* renamed from: t, reason: collision with root package name */
    public final int f23419t;

    /* renamed from: u, reason: collision with root package name */
    public final long f23420u;

    /* renamed from: v, reason: collision with root package name */
    public final int f23421v;

    /* renamed from: w, reason: collision with root package name */
    public final int f23422w;

    /* renamed from: x, reason: collision with root package name */
    public String f23423x;

    static {
        String g = z.g("WorkSpec");
        kotlin.jvm.internal.l.d(g, "tagWithPrefix(\"WorkSpec\")");
        f23402y = g;
    }

    public p(String id, int i7, String workerClassName, String inputMergerClassName, C1249k input, C1249k output, long j, long j10, long j11, C1243e constraints, int i10, int i11, long j12, long j13, long j14, long j15, boolean z8, int i12, int i13, int i14, long j16, int i15, int i16, String str) {
        kotlin.jvm.internal.l.e(id, "id");
        h3.o.t(i7, "state");
        kotlin.jvm.internal.l.e(workerClassName, "workerClassName");
        kotlin.jvm.internal.l.e(inputMergerClassName, "inputMergerClassName");
        kotlin.jvm.internal.l.e(input, "input");
        kotlin.jvm.internal.l.e(output, "output");
        kotlin.jvm.internal.l.e(constraints, "constraints");
        h3.o.t(i11, "backoffPolicy");
        h3.o.t(i12, "outOfQuotaPolicy");
        this.f23403a = id;
        this.f23404b = i7;
        this.f23405c = workerClassName;
        this.f23406d = inputMergerClassName;
        this.f23407e = input;
        this.f23408f = output;
        this.g = j;
        this.f23409h = j10;
        this.f23410i = j11;
        this.j = constraints;
        this.k = i10;
        this.f23411l = i11;
        this.f23412m = j12;
        this.f23413n = j13;
        this.f23414o = j14;
        this.f23415p = j15;
        this.f23416q = z8;
        this.f23417r = i12;
        this.f23418s = i13;
        this.f23419t = i14;
        this.f23420u = j16;
        this.f23421v = i15;
        this.f23422w = i16;
        this.f23423x = str;
    }

    public /* synthetic */ p(String str, int i7, String str2, String str3, C1249k c1249k, C1249k c1249k2, long j, long j10, long j11, C1243e c1243e, int i10, int i11, long j12, long j13, long j14, long j15, boolean z8, int i12, int i13, long j16, int i14, int i15, String str4, int i16) {
        this(str, (i16 & 2) != 0 ? 1 : i7, str2, (i16 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i16 & 16) != 0 ? C1249k.f17698b : c1249k, (i16 & 32) != 0 ? C1249k.f17698b : c1249k2, (i16 & 64) != 0 ? 0L : j, (i16 & 128) != 0 ? 0L : j10, (i16 & 256) != 0 ? 0L : j11, (i16 & 512) != 0 ? C1243e.j : c1243e, (i16 & 1024) != 0 ? 0 : i10, (i16 & 2048) != 0 ? 1 : i11, (i16 & 4096) != 0 ? 30000L : j12, (i16 & 8192) != 0 ? -1L : j13, (i16 & 16384) != 0 ? 0L : j14, (32768 & i16) != 0 ? -1L : j15, (65536 & i16) != 0 ? false : z8, (131072 & i16) == 0 ? i12 : 1, (262144 & i16) != 0 ? 0 : i13, 0, (1048576 & i16) != 0 ? Long.MAX_VALUE : j16, (2097152 & i16) != 0 ? 0 : i14, (4194304 & i16) != 0 ? -256 : i15, (i16 & 8388608) != 0 ? null : str4);
    }

    public static p b(p pVar, String str, int i7, String str2, C1249k c1249k, int i10, long j, int i11, int i12, long j10, int i13, int i14) {
        boolean z8;
        int i15;
        String id = (i14 & 1) != 0 ? pVar.f23403a : str;
        int i16 = (i14 & 2) != 0 ? pVar.f23404b : i7;
        String workerClassName = (i14 & 4) != 0 ? pVar.f23405c : str2;
        String inputMergerClassName = pVar.f23406d;
        C1249k input = (i14 & 16) != 0 ? pVar.f23407e : c1249k;
        C1249k output = pVar.f23408f;
        long j11 = pVar.g;
        long j12 = pVar.f23409h;
        long j13 = pVar.f23410i;
        C1243e constraints = pVar.j;
        int i17 = (i14 & 1024) != 0 ? pVar.k : i10;
        int i18 = pVar.f23411l;
        long j14 = pVar.f23412m;
        long j15 = (i14 & 8192) != 0 ? pVar.f23413n : j;
        long j16 = pVar.f23414o;
        long j17 = pVar.f23415p;
        boolean z10 = pVar.f23416q;
        int i19 = pVar.f23417r;
        if ((i14 & 262144) != 0) {
            z8 = z10;
            i15 = pVar.f23418s;
        } else {
            z8 = z10;
            i15 = i11;
        }
        int i20 = (524288 & i14) != 0 ? pVar.f23419t : i12;
        long j18 = (1048576 & i14) != 0 ? pVar.f23420u : j10;
        int i21 = (i14 & 2097152) != 0 ? pVar.f23421v : i13;
        int i22 = pVar.f23422w;
        String str3 = pVar.f23423x;
        pVar.getClass();
        kotlin.jvm.internal.l.e(id, "id");
        h3.o.t(i16, "state");
        kotlin.jvm.internal.l.e(workerClassName, "workerClassName");
        kotlin.jvm.internal.l.e(inputMergerClassName, "inputMergerClassName");
        kotlin.jvm.internal.l.e(input, "input");
        kotlin.jvm.internal.l.e(output, "output");
        kotlin.jvm.internal.l.e(constraints, "constraints");
        h3.o.t(i18, "backoffPolicy");
        h3.o.t(i19, "outOfQuotaPolicy");
        return new p(id, i16, workerClassName, inputMergerClassName, input, output, j11, j12, j13, constraints, i17, i18, j14, j15, j16, j17, z8, i19, i15, i20, j18, i21, i22, str3);
    }

    public final long a() {
        long j;
        boolean z8 = this.f23404b == 1 && this.k > 0;
        long j10 = this.f23413n;
        boolean d10 = d();
        long j11 = this.f23410i;
        long j12 = this.f23409h;
        long j13 = this.f23420u;
        int i7 = this.f23411l;
        h3.o.t(i7, "backoffPolicy");
        int i10 = this.f23418s;
        if (j13 != Long.MAX_VALUE && d10) {
            return i10 == 0 ? j13 : H.g(j13, j10 + 900000);
        }
        if (z8) {
            int i11 = this.k;
            j = H.h(i7 == 2 ? this.f23412m * i11 : Math.scalb((float) r5, i11 - 1), 18000000L) + j10;
        } else {
            long j14 = this.g;
            if (d10) {
                long j15 = i10 == 0 ? j10 + j14 : j10 + j12;
                j = (j11 == j12 || i10 != 0) ? j15 : (j12 - j11) + j15;
            } else {
                j = j10 == -1 ? Long.MAX_VALUE : j10 + j14;
            }
        }
        return j;
    }

    public final boolean c() {
        return !kotlin.jvm.internal.l.a(C1243e.j, this.j);
    }

    public final boolean d() {
        return this.f23409h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.l.a(this.f23403a, pVar.f23403a) && this.f23404b == pVar.f23404b && kotlin.jvm.internal.l.a(this.f23405c, pVar.f23405c) && kotlin.jvm.internal.l.a(this.f23406d, pVar.f23406d) && kotlin.jvm.internal.l.a(this.f23407e, pVar.f23407e) && kotlin.jvm.internal.l.a(this.f23408f, pVar.f23408f) && this.g == pVar.g && this.f23409h == pVar.f23409h && this.f23410i == pVar.f23410i && kotlin.jvm.internal.l.a(this.j, pVar.j) && this.k == pVar.k && this.f23411l == pVar.f23411l && this.f23412m == pVar.f23412m && this.f23413n == pVar.f23413n && this.f23414o == pVar.f23414o && this.f23415p == pVar.f23415p && this.f23416q == pVar.f23416q && this.f23417r == pVar.f23417r && this.f23418s == pVar.f23418s && this.f23419t == pVar.f23419t && this.f23420u == pVar.f23420u && this.f23421v == pVar.f23421v && this.f23422w == pVar.f23422w && kotlin.jvm.internal.l.a(this.f23423x, pVar.f23423x);
    }

    public final int hashCode() {
        int c10 = A3.c.c(this.f23422w, A3.c.c(this.f23421v, h3.o.f(A3.c.c(this.f23419t, A3.c.c(this.f23418s, (P.c.b(this.f23417r) + h3.o.g(this.f23416q, h3.o.f(h3.o.f(h3.o.f(h3.o.f((P.c.b(this.f23411l) + A3.c.c(this.k, (this.j.hashCode() + h3.o.f(h3.o.f(h3.o.f((this.f23408f.hashCode() + ((this.f23407e.hashCode() + A3.c.d(A3.c.d((P.c.b(this.f23404b) + (this.f23403a.hashCode() * 31)) * 31, 31, this.f23405c), 31, this.f23406d)) * 31)) * 31, 31, this.g), 31, this.f23409h), 31, this.f23410i)) * 31, 31)) * 31, 31, this.f23412m), 31, this.f23413n), 31, this.f23414o), 31, this.f23415p), 31)) * 31, 31), 31), 31, this.f23420u), 31), 31);
        String str = this.f23423x;
        return c10 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return A3.c.l(new StringBuilder("{WorkSpec: "), this.f23403a, '}');
    }
}
