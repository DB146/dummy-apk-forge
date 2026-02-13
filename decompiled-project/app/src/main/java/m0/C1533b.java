package m0;

import A0.C0005a;
import E.u;
import E5.o;
import a.AbstractC0672a;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import i0.C1289b;
import j0.AbstractC1362A;
import j0.C1368f;
import j0.v;
import j0.w;
import j0.x;
import l0.AbstractC1444c;
import l0.C1443b;
import l0.InterfaceC1445d;
import u.C2047J;
import u.S;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1533b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1535d f19684a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f19689f;
    public float j;
    public AbstractC1362A k;

    /* renamed from: l, reason: collision with root package name */
    public C1368f f19692l;

    /* renamed from: m, reason: collision with root package name */
    public C1368f f19693m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19694n;

    /* renamed from: o, reason: collision with root package name */
    public C1443b f19695o;

    /* renamed from: p, reason: collision with root package name */
    public o f19696p;

    /* renamed from: q, reason: collision with root package name */
    public int f19697q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f19699s;

    /* renamed from: t, reason: collision with root package name */
    public long f19700t;

    /* renamed from: u, reason: collision with root package name */
    public long f19701u;

    /* renamed from: v, reason: collision with root package name */
    public long f19702v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19703w;

    /* renamed from: x, reason: collision with root package name */
    public RectF f19704x;

    /* renamed from: b, reason: collision with root package name */
    public V0.c f19685b = AbstractC1444c.f19145a;

    /* renamed from: c, reason: collision with root package name */
    public V0.l f19686c = V0.l.f9982a;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.m f19687d = C1532a.f19681b;

    /* renamed from: e, reason: collision with root package name */
    public final C0005a f19688e = new C0005a(this, 25);
    public boolean g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f19690h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f19691i = 9205357640488583168L;

    /* renamed from: r, reason: collision with root package name */
    public final u f19698r = new Object();

    static {
        int i7 = AbstractC1541j.f19758a;
        int i10 = AbstractC1541j.f19758a;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, E.u] */
    public C1533b(InterfaceC1535d interfaceC1535d) {
        this.f19684a = interfaceC1535d;
        interfaceC1535d.v(false);
        this.f19700t = 0L;
        this.f19701u = 0L;
        this.f19702v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z8 = this.f19703w;
            InterfaceC1535d interfaceC1535d = this.f19684a;
            Outline outline2 = null;
            if (z8 || interfaceC1535d.F() > 0.0f) {
                C1368f c1368f = this.f19692l;
                if (c1368f != null) {
                    RectF rectF = this.f19704x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f19704x = rectF;
                    }
                    Path path = c1368f.f18539a;
                    path.computeBounds(rectF, false);
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 > 28 || path.isConvex()) {
                        outline = this.f19689f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f19689f = outline;
                        }
                        if (i7 >= 30) {
                            outline.setPath(path);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.f19694n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f19689f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f19694n = true;
                        outline = null;
                    }
                    this.f19692l = c1368f;
                    if (outline != null) {
                        outline.setAlpha(interfaceC1535d.a());
                        outline2 = outline;
                    }
                    interfaceC1535d.s(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.f19694n && this.f19703w) {
                        interfaceC1535d.v(false);
                        interfaceC1535d.i();
                    } else {
                        interfaceC1535d.v(this.f19703w);
                    }
                } else {
                    interfaceC1535d.v(this.f19703w);
                    Outline outline4 = this.f19689f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f19689f = outline4;
                    }
                    long u3 = AbstractC0672a.u(this.f19701u);
                    long j = this.f19690h;
                    long j10 = this.f19691i;
                    if (j10 != 9205357640488583168L) {
                        u3 = j10;
                    }
                    int i10 = (int) (j >> 32);
                    int i11 = (int) (j & 4294967295L);
                    int i12 = (int) (u3 >> 32);
                    int i13 = (int) (u3 & 4294967295L);
                    outline4.setRoundRect(Math.round(Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i12) + Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i13) + Float.intBitsToFloat(i11)), this.j);
                    outline4.setAlpha(interfaceC1535d.a());
                    interfaceC1535d.s(outline4, (Math.round(Float.intBitsToFloat(i13)) & 4294967295L) | (Math.round(Float.intBitsToFloat(i12)) << 32));
                }
            } else {
                interfaceC1535d.v(false);
                interfaceC1535d.s(null, 0L);
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.f19699s && this.f19697q == 0) {
            u uVar = this.f19698r;
            C1533b c1533b = (C1533b) uVar.f3499b;
            if (c1533b != null) {
                c1533b.e();
                uVar.f3499b = null;
            }
            C2047J c2047j = (C2047J) uVar.f3501d;
            if (c2047j != null) {
                Object[] objArr = c2047j.f24610b;
                long[] jArr = c2047j.f24609a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j = jArr[i7];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i7 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j) < 128) {
                                    ((C1533b) objArr[(i7 << 3) + i11]).e();
                                }
                                j >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i7 == length) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
                c2047j.b();
            }
            this.f19684a.i();
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [Rb.c, kotlin.jvm.internal.m] */
    public final void c(InterfaceC1445d interfaceC1445d) {
        u uVar = this.f19698r;
        uVar.f3500c = (C1533b) uVar.f3499b;
        C2047J c2047j = (C2047J) uVar.f3501d;
        if (c2047j != null && c2047j.h()) {
            C2047J c2047j2 = (C2047J) uVar.f3502e;
            if (c2047j2 == null) {
                int i7 = S.f24634a;
                c2047j2 = new C2047J();
                uVar.f3502e = c2047j2;
            }
            c2047j2.k(c2047j);
            c2047j.b();
        }
        uVar.f3498a = true;
        this.f19687d.invoke(interfaceC1445d);
        uVar.f3498a = false;
        C1533b c1533b = (C1533b) uVar.f3500c;
        if (c1533b != null) {
            c1533b.e();
        }
        C2047J c2047j3 = (C2047J) uVar.f3502e;
        if (c2047j3 == null || !c2047j3.h()) {
            return;
        }
        Object[] objArr = c2047j3.f24610b;
        long[] jArr = c2047j3.f24609a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            ((C1533b) objArr[(i10 << 3) + i12]).e();
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        c2047j3.b();
    }

    public final AbstractC1362A d() {
        AbstractC1362A wVar;
        AbstractC1362A abstractC1362A = this.k;
        C1368f c1368f = this.f19692l;
        if (abstractC1362A != null) {
            return abstractC1362A;
        }
        if (c1368f != null) {
            v vVar = new v(c1368f);
            this.k = vVar;
            return vVar;
        }
        long u3 = AbstractC0672a.u(this.f19701u);
        long j = this.f19690h;
        long j10 = this.f19691i;
        if (j10 != 9205357640488583168L) {
            u3 = j10;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (u3 >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (u3 & 4294967295L)) + intBitsToFloat2;
        if (this.j > 0.0f) {
            wVar = new x(com.bumptech.glide.c.a(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            wVar = new w(new i0.c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = wVar;
        return wVar;
    }

    public final void e() {
        this.f19697q--;
        b();
    }

    public final void f(long j, long j10, float f4) {
        if (C1289b.b(this.f19690h, j) && i0.e.a(this.f19691i, j10) && this.j == f4 && this.f19692l == null) {
            return;
        }
        this.k = null;
        this.f19692l = null;
        this.g = true;
        this.f19694n = false;
        this.f19690h = j;
        this.f19691i = j10;
        this.j = f4;
        a();
    }
}
