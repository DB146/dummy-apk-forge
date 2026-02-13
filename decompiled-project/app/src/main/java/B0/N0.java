package B0;

import android.graphics.Outline;
import android.os.Build;
import j0.AbstractC1362A;
import j0.C1368f;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1756a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Outline f1757b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC1362A f1758c;

    /* renamed from: d, reason: collision with root package name */
    public C1368f f1759d;

    /* renamed from: e, reason: collision with root package name */
    public j0.z f1760e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1761f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public j0.z f1762h;

    /* renamed from: i, reason: collision with root package name */
    public i0.d f1763i;
    public float j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f1764l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1765m;

    public N0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f1757b = outline;
        this.k = 0L;
        this.f1764l = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (java.lang.Float.intBitsToFloat((int) (r5.f18182e >> 32)) == r0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(j0.l lVar) {
        e();
        j0.z zVar = this.f1760e;
        if (zVar != null) {
            lVar.a(zVar);
            return;
        }
        float f4 = this.j;
        if (f4 <= 0.0f) {
            lVar.e(Float.intBitsToFloat((int) (this.k >> 32)), Float.intBitsToFloat((int) (this.k & 4294967295L)), Float.intBitsToFloat((int) (this.f1764l >> 32)) + Float.intBitsToFloat((int) (this.k >> 32)), Float.intBitsToFloat((int) (this.f1764l & 4294967295L)) + Float.intBitsToFloat((int) (this.k & 4294967295L)), 1);
            return;
        }
        j0.z zVar2 = this.f1762h;
        i0.d dVar = this.f1763i;
        if (zVar2 != null) {
            long j = this.k;
            long j10 = this.f1764l;
            if (dVar != null && com.bumptech.glide.c.H(dVar)) {
                int i7 = (int) (j >> 32);
                if (dVar.f18178a == Float.intBitsToFloat(i7)) {
                    int i10 = (int) (j & 4294967295L);
                    if (dVar.f18179b == Float.intBitsToFloat(i10)) {
                        if (dVar.f18180c == Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i7)) {
                            if (dVar.f18181d == Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i10)) {
                            }
                        }
                    }
                }
            }
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (this.k >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.k & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.f1764l >> 32)) + Float.intBitsToFloat((int) (this.k >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (this.f1764l & 4294967295L)) + Float.intBitsToFloat((int) (this.k & 4294967295L));
        float f10 = this.j;
        i0.d a9 = com.bumptech.glide.c.a(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(f10) << 32) | (4294967295L & Float.floatToRawIntBits(f10)));
        if (zVar2 == null) {
            zVar2 = j0.h.a();
        } else {
            ((C1368f) zVar2).b();
        }
        j0.z.a(zVar2, a9);
        this.f1763i = a9;
        this.f1762h = zVar2;
        lVar.a(zVar2);
    }

    public final Outline b() {
        e();
        if (this.f1765m && this.f1756a) {
            return this.f1757b;
        }
        return null;
    }

    public final boolean c(long j) {
        AbstractC1362A abstractC1362A;
        if (this.f1765m && (abstractC1362A = this.f1758c) != null) {
            return X.k(abstractC1362A, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        return true;
    }

    public final boolean d(AbstractC1362A abstractC1362A, float f4, boolean z8, float f10, long j) {
        this.f1757b.setAlpha(f4);
        boolean a9 = kotlin.jvm.internal.l.a(this.f1758c, abstractC1362A);
        boolean z10 = !a9;
        if (!a9) {
            this.f1758c = abstractC1362A;
            this.f1761f = true;
        }
        this.f1764l = j;
        boolean z11 = abstractC1362A != null && (z8 || f10 > 0.0f);
        if (this.f1765m != z11) {
            this.f1765m = z11;
            this.f1761f = true;
        }
        return z10;
    }

    public final void e() {
        if (this.f1761f) {
            this.k = 0L;
            this.j = 0.0f;
            this.f1760e = null;
            this.f1761f = false;
            this.g = false;
            AbstractC1362A abstractC1362A = this.f1758c;
            Outline outline = this.f1757b;
            if (abstractC1362A == null || !this.f1765m || Float.intBitsToFloat((int) (this.f1764l >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.f1764l & 4294967295L)) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f1756a = true;
            if (abstractC1362A instanceof j0.w) {
                i0.c cVar = ((j0.w) abstractC1362A).f18560e;
                float f4 = cVar.f18174a;
                long floatToRawIntBits = Float.floatToRawIntBits(f4);
                float f10 = cVar.f18175b;
                this.k = (floatToRawIntBits << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
                float f11 = cVar.f18176c;
                float f12 = cVar.f18177d;
                this.f1764l = (Float.floatToRawIntBits(f11 - f4) << 32) | (4294967295L & Float.floatToRawIntBits(f12 - f10));
                outline.setRect(Math.round(f4), Math.round(f10), Math.round(f11), Math.round(f12));
                return;
            }
            if (!(abstractC1362A instanceof j0.x)) {
                if (abstractC1362A instanceof j0.v) {
                    f(((j0.v) abstractC1362A).f18559e);
                    return;
                }
                return;
            }
            i0.d dVar = ((j0.x) abstractC1362A).f18561e;
            float intBitsToFloat = Float.intBitsToFloat((int) (dVar.f18182e >> 32));
            float f13 = dVar.f18178a;
            long floatToRawIntBits2 = Float.floatToRawIntBits(f13);
            float f14 = dVar.f18179b;
            this.k = (floatToRawIntBits2 << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
            float b2 = dVar.b();
            float a9 = dVar.a();
            this.f1764l = (Float.floatToRawIntBits(a9) & 4294967295L) | (Float.floatToRawIntBits(b2) << 32);
            if (com.bumptech.glide.c.H(dVar)) {
                this.f1757b.setRoundRect(Math.round(f13), Math.round(f14), Math.round(dVar.f18180c), Math.round(dVar.f18181d), intBitsToFloat);
                this.j = intBitsToFloat;
                return;
            }
            C1368f c1368f = this.f1759d;
            if (c1368f == null) {
                c1368f = j0.h.a();
                this.f1759d = c1368f;
            }
            c1368f.b();
            j0.z.a(c1368f, dVar);
            f(c1368f);
        }
    }

    public final void f(j0.z zVar) {
        int i7 = Build.VERSION.SDK_INT;
        Outline outline = this.f1757b;
        if (i7 > 28 || ((C1368f) zVar).f18539a.isConvex()) {
            if (i7 >= 30) {
                O0.f1768a.a(outline, zVar);
            } else {
                if (!(zVar instanceof C1368f)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((C1368f) zVar).f18539a);
            }
            this.g = !outline.canClip();
        } else {
            this.f1756a = false;
            outline.setEmpty();
            this.g = true;
        }
        this.f1760e = zVar;
    }
}
