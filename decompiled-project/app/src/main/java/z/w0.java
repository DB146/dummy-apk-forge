package z;

import A0.AbstractC0017g;
import i0.C1289b;
import y.C2305m;
import y.EnumC2292N;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public E.A f28121a;

    /* renamed from: b, reason: collision with root package name */
    public C2305m f28122b;

    /* renamed from: c, reason: collision with root package name */
    public C2565l f28123c;

    /* renamed from: d, reason: collision with root package name */
    public V f28124d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28125e;

    /* renamed from: f, reason: collision with root package name */
    public t0.d f28126f;
    public final C2576x g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28127h;

    /* renamed from: i, reason: collision with root package name */
    public int f28128i = 1;
    public Z j = AbstractC2556g0.f27981a;
    public final t0 k = new t0(this);

    /* renamed from: l, reason: collision with root package name */
    public final u0.w f28129l = new u0.w(this, 3);

    public w0(E.A a9, C2305m c2305m, C2565l c2565l, V v10, boolean z8, t0.d dVar, C2576x c2576x) {
        this.f28121a = a9;
        this.f28122b = c2305m;
        this.f28123c = c2565l;
        this.f28124d = v10;
        this.f28125e = z8;
        this.f28126f = dVar;
        this.g = c2576x;
    }

    public static final long a(w0 w0Var, Z z8, long j, int i7) {
        long j10;
        t0.g gVar = w0Var.f28126f.f24416a;
        t0.g gVar2 = null;
        t0.g gVar3 = (gVar == null || !gVar.f14112B) ? null : (t0.g) AbstractC0017g.i(gVar);
        long j11 = 0;
        long R10 = gVar3 != null ? gVar3.R(i7, j) : 0L;
        long d10 = C1289b.d(j, R10);
        long d11 = w0Var.d(w0Var.g(z8.a(w0Var.f(w0Var.d(C1289b.a(w0Var.f28124d == V.f27944b ? 1 : 2, d10))))));
        long d12 = C1289b.d(d10, d11);
        t0.g gVar4 = w0Var.f28126f.f24416a;
        if (gVar4 != null && gVar4.f14112B) {
            gVar2 = (t0.g) AbstractC0017g.i(gVar4);
        }
        t0.g gVar5 = gVar2;
        if (gVar5 != null) {
            j10 = d11;
            j11 = gVar5.A(i7, d11, d12);
        } else {
            j10 = d11;
        }
        return C1289b.e(C1289b.e(R10, j10), j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r14v2, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, Jb.c cVar) {
        q0 q0Var;
        int i7;
        w0 w0Var;
        kotlin.jvm.internal.u uVar;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i10 = q0Var.f28072e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                q0Var.f28072e = i10 - Integer.MIN_VALUE;
                Object obj = q0Var.f28070c;
                Ib.a aVar = Ib.a.f5345a;
                i7 = q0Var.f28072e;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    ?? obj2 = new Object();
                    obj2.f19133a = j;
                    this.f28127h = true;
                    EnumC2292N enumC2292N = EnumC2292N.f26416a;
                    s0 s0Var = new s0(this, obj2, j, null);
                    q0Var.f28068a = this;
                    q0Var.f28069b = obj2;
                    q0Var.f28072e = 1;
                    if (e(enumC2292N, s0Var, q0Var) == aVar) {
                        return aVar;
                    }
                    w0Var = this;
                    uVar = obj2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = q0Var.f28069b;
                    w0Var = q0Var.f28068a;
                    com.bumptech.glide.c.c0(obj);
                }
                w0Var.f28127h = false;
                return new V0.p(uVar.f19133a);
            }
        }
        q0Var = new q0(this, cVar);
        Object obj3 = q0Var.f28070c;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = q0Var.f28072e;
        if (i7 != 0) {
        }
        w0Var.f28127h = false;
        return new V0.p(uVar.f19133a);
    }

    public final float c(float f4) {
        return this.f28125e ? f4 * (-1) : f4;
    }

    public final long d(long j) {
        return this.f28125e ? C1289b.f(j, -1.0f) : j;
    }

    public final Object e(EnumC2292N enumC2292N, Rb.e eVar, Jb.c cVar) {
        Object f4 = this.f28121a.f(enumC2292N, new v0(this, eVar, null), cVar);
        return f4 == Ib.a.f5345a ? f4 : Db.q.f3365a;
    }

    public final float f(long j) {
        return Float.intBitsToFloat((int) (this.f28124d == V.f27944b ? j >> 32 : j & 4294967295L));
    }

    public final long g(float f4) {
        long floatToRawIntBits;
        long j;
        if (f4 == 0.0f) {
            return 0L;
        }
        if (this.f28124d == V.f27944b) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(f4);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(f4);
            j = floatToRawIntBits3 << 32;
        }
        return j | (floatToRawIntBits & 4294967295L);
    }
}
