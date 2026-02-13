package y;

import A0.AbstractC0025n;
import Q.C0487e0;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import j0.AbstractC1362A;
import u0.AbstractC2090t;
import u0.C2075e;
import z.u0;

/* renamed from: y.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2305m {

    /* renamed from: a, reason: collision with root package name */
    public final V0.c f26486a;

    /* renamed from: b, reason: collision with root package name */
    public long f26487b = 9205357640488583168L;

    /* renamed from: c, reason: collision with root package name */
    public final y f26488c;

    /* renamed from: d, reason: collision with root package name */
    public final C0487e0 f26489d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26490e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26491f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public long f26492h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0025n f26493i;

    public C2305m(Context context, V0.c cVar, long j, C.F f4) {
        this.f26486a = cVar;
        y yVar = new y(context, AbstractC1362A.z(j));
        this.f26488c = yVar;
        this.f26489d = new C0487e0(Db.q.f3365a, Q.S.f8365c);
        this.f26490e = true;
        this.g = 0L;
        this.f26492h = -1L;
        C2302j c2302j = new C2302j(this, 1);
        C2075e c2075e = AbstractC2090t.f24799a;
        u0.y yVar2 = new u0.y(null, null, c2302j);
        this.f26493i = Build.VERSION.SDK_INT >= 31 ? new C2284F(yVar2, this, yVar) : new C2284F(yVar2, this, yVar, f4);
    }

    public final void a() {
        boolean z8;
        y yVar = this.f26488c;
        EdgeEffect edgeEffect = yVar.f26540d;
        boolean z10 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z8 = !edgeEffect.isFinished();
        } else {
            z8 = false;
        }
        EdgeEffect edgeEffect2 = yVar.f26541e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z8 = !edgeEffect2.isFinished() || z8;
        }
        EdgeEffect edgeEffect3 = yVar.f26542f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z8 = !edgeEffect3.isFinished() || z8;
        }
        EdgeEffect edgeEffect4 = yVar.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z8) {
                z10 = false;
            }
            z8 = z10;
        }
        if (z8) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, u0 u0Var, Jb.c cVar) {
        C2303k c2303k;
        int i7;
        long d10;
        C2305m c2305m;
        long d11;
        float b2;
        if (cVar instanceof C2303k) {
            c2303k = (C2303k) cVar;
            int i10 = c2303k.f26482e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2303k.f26482e = i10 - Integer.MIN_VALUE;
                Object obj = c2303k.f26480c;
                Ib.a aVar = Ib.a.f5345a;
                i7 = c2303k.f26482e;
                Db.q qVar = Db.q.f3365a;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    if (i0.e.d(this.g)) {
                        c2303k.f26482e = 1;
                        u0Var.getClass();
                        u0 u0Var2 = new u0(u0Var.f28106d, c2303k);
                        u0Var2.f28105c = j;
                        return u0Var2.invokeSuspend(qVar) == aVar ? aVar : qVar;
                    }
                    y yVar = this.f26488c;
                    boolean g = y.g(yVar.f26542f);
                    V0.c cVar2 = this.f26486a;
                    long b10 = com.bumptech.glide.c.b((!g || V0.p.b(j) >= 0.0f) ? (!y.g(yVar.g) || V0.p.b(j) <= 0.0f) ? 0.0f : -com.bumptech.glide.c.c(yVar.d(), -V0.p.b(j), Float.intBitsToFloat((int) (this.g >> 32)), cVar2) : com.bumptech.glide.c.c(yVar.c(), V0.p.b(j), Float.intBitsToFloat((int) (this.g >> 32)), cVar2), (!y.g(yVar.f26540d) || V0.p.c(j) >= 0.0f) ? (!y.g(yVar.f26541e) || V0.p.c(j) <= 0.0f) ? 0.0f : -com.bumptech.glide.c.c(yVar.b(), -V0.p.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), cVar2) : com.bumptech.glide.c.c(yVar.e(), V0.p.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), cVar2));
                    if (b10 != 0) {
                        d();
                    }
                    d10 = V0.p.d(j, b10);
                    c2303k.f26478a = this;
                    c2303k.f26479b = d10;
                    c2303k.f26482e = 2;
                    u0Var.getClass();
                    u0 u0Var3 = new u0(u0Var.f28106d, c2303k);
                    u0Var3.f28105c = d10;
                    obj = u0Var3.invokeSuspend(qVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c2305m = this;
                    d11 = V0.p.d(d10, ((V0.p) obj).f9990a);
                    c2305m.f26491f = false;
                    b2 = V0.p.b(d11);
                    y yVar2 = c2305m.f26488c;
                    if (b2 <= 0.0f) {
                    }
                    if (V0.p.c(d11) <= 0.0f) {
                    }
                    c2305m.a();
                    return qVar;
                }
                if (i7 == 1) {
                    com.bumptech.glide.c.c0(obj);
                }
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d10 = c2303k.f26479b;
                c2305m = c2303k.f26478a;
                com.bumptech.glide.c.c0(obj);
                d11 = V0.p.d(d10, ((V0.p) obj).f9990a);
                c2305m.f26491f = false;
                b2 = V0.p.b(d11);
                y yVar22 = c2305m.f26488c;
                if (b2 <= 0.0f) {
                    EdgeEffect c10 = yVar22.c();
                    int F10 = Tb.a.F(V0.p.b(d11));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c10.onAbsorb(F10);
                    } else if (c10.isFinished()) {
                        c10.onAbsorb(F10);
                    }
                } else if (V0.p.b(d11) < 0.0f) {
                    EdgeEffect d12 = yVar22.d();
                    int i11 = -Tb.a.F(V0.p.b(d11));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d12.onAbsorb(i11);
                    } else if (d12.isFinished()) {
                        d12.onAbsorb(i11);
                    }
                }
                if (V0.p.c(d11) <= 0.0f) {
                    EdgeEffect e2 = yVar22.e();
                    int F11 = Tb.a.F(V0.p.c(d11));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e2.onAbsorb(F11);
                    } else if (e2.isFinished()) {
                        e2.onAbsorb(F11);
                    }
                } else if (V0.p.c(d11) < 0.0f) {
                    EdgeEffect b11 = yVar22.b();
                    int i12 = -Tb.a.F(V0.p.c(d11));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b11.onAbsorb(i12);
                    } else if (b11.isFinished()) {
                        b11.onAbsorb(i12);
                    }
                }
                c2305m.a();
                return qVar;
            }
        }
        c2303k = new C2303k(this, cVar);
        Object obj2 = c2303k.f26480c;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = c2303k.f26482e;
        Db.q qVar2 = Db.q.f3365a;
        if (i7 != 0) {
        }
    }

    public final long c() {
        long j = this.f26487b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = com.bumptech.glide.d.o(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void d() {
        if (this.f26490e) {
            this.f26489d.setValue(Db.q.f3365a);
        }
    }

    public final float e(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i7 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i7) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect b2 = this.f26488c.b();
        float f4 = -intBitsToFloat2;
        float f10 = 1 - intBitsToFloat;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f4 = l3.d.d(b2, f4, f10);
        } else {
            b2.onPull(f4, f10);
        }
        return (i10 >= 31 ? l3.d.b(b2) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-f4) : Float.intBitsToFloat(i7);
    }

    public final float f(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i7 = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i7) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect c10 = this.f26488c.c();
        float f4 = 1 - intBitsToFloat;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            intBitsToFloat2 = l3.d.d(c10, intBitsToFloat2, f4);
        } else {
            c10.onPull(intBitsToFloat2, f4);
        }
        return (i10 >= 31 ? l3.d.b(c10) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * intBitsToFloat2 : Float.intBitsToFloat(i7);
    }

    public final float g(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i7 = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i7) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect d10 = this.f26488c.d();
        float f4 = -intBitsToFloat2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f4 = l3.d.d(d10, f4, intBitsToFloat);
        } else {
            d10.onPull(f4, intBitsToFloat);
        }
        return (i10 >= 31 ? l3.d.b(d10) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-f4) : Float.intBitsToFloat(i7);
    }

    public final float h(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i7 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i7) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect e2 = this.f26488c.e();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            intBitsToFloat2 = l3.d.d(e2, intBitsToFloat2, intBitsToFloat);
        } else {
            e2.onPull(intBitsToFloat2, intBitsToFloat);
        }
        return (i10 >= 31 ? l3.d.b(e2) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * intBitsToFloat2 : Float.intBitsToFloat(i7);
    }

    public final void i(long j) {
        boolean a9 = i0.e.a(this.g, 0L);
        boolean a10 = i0.e.a(j, this.g);
        this.g = j;
        if (!a10) {
            long F10 = (Tb.a.F(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Tb.a.F(Float.intBitsToFloat((int) (j >> 32))) << 32);
            y yVar = this.f26488c;
            yVar.f26539c = F10;
            EdgeEffect edgeEffect = yVar.f26540d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (F10 >> 32), (int) (F10 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = yVar.f26541e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (F10 >> 32), (int) (F10 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = yVar.f26542f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (F10 & 4294967295L), (int) (F10 >> 32));
            }
            EdgeEffect edgeEffect4 = yVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (F10 & 4294967295L), (int) (F10 >> 32));
            }
            EdgeEffect edgeEffect5 = yVar.f26543h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (F10 >> 32), (int) (F10 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = yVar.f26544i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (F10 >> 32), (int) (F10 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = yVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (F10 & 4294967295L), (int) (F10 >> 32));
            }
            EdgeEffect edgeEffect8 = yVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & F10), (int) (F10 >> 32));
            }
        }
        if (a9 || a10) {
            return;
        }
        a();
    }
}
