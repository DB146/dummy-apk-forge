package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class w0 implements InterfaceC1569g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20514a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20515b;

    /* renamed from: c, reason: collision with root package name */
    public final C1558a0 f20516c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20517d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20518e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20519f;

    /* renamed from: u, reason: collision with root package name */
    public final long f20520u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20521v;

    /* renamed from: w, reason: collision with root package name */
    public final int f20522w;

    static {
        int i7 = n5.D.f21141a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public w0(Object obj, int i7, C1558a0 c1558a0, Object obj2, int i10, long j, long j10, int i11, int i12) {
        this.f20514a = obj;
        this.f20515b = i7;
        this.f20516c = c1558a0;
        this.f20517d = obj2;
        this.f20518e = i10;
        this.f20519f = j;
        this.f20520u = j10;
        this.f20521v = i11;
        this.f20522w = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f20515b == w0Var.f20515b && this.f20518e == w0Var.f20518e && this.f20519f == w0Var.f20519f && this.f20520u == w0Var.f20520u && this.f20521v == w0Var.f20521v && this.f20522w == w0Var.f20522w && O5.b.o(this.f20514a, w0Var.f20514a) && O5.b.o(this.f20517d, w0Var.f20517d) && O5.b.o(this.f20516c, w0Var.f20516c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20514a, Integer.valueOf(this.f20515b), this.f20516c, this.f20517d, Integer.valueOf(this.f20518e), Long.valueOf(this.f20519f), Long.valueOf(this.f20520u), Integer.valueOf(this.f20521v), Integer.valueOf(this.f20522w)});
    }
}
