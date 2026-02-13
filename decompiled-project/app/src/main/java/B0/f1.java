package B0;

import A9.Y2;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import i0.C1288a;
import j0.AbstractC1362A;
import j0.C1364b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m0.C1533b;

/* loaded from: classes.dex */
public final class f1 extends View implements A0.s0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Y2 f1886D = new Y2(1);

    /* renamed from: E, reason: collision with root package name */
    public static Method f1887E;

    /* renamed from: F, reason: collision with root package name */
    public static Field f1888F;

    /* renamed from: G, reason: collision with root package name */
    public static boolean f1889G;

    /* renamed from: H, reason: collision with root package name */
    public static boolean f1890H;

    /* renamed from: A, reason: collision with root package name */
    public boolean f1891A;

    /* renamed from: B, reason: collision with root package name */
    public final long f1892B;

    /* renamed from: C, reason: collision with root package name */
    public int f1893C;

    /* renamed from: a, reason: collision with root package name */
    public final D f1894a;

    /* renamed from: b, reason: collision with root package name */
    public final B0 f1895b;

    /* renamed from: c, reason: collision with root package name */
    public Rb.e f1896c;

    /* renamed from: d, reason: collision with root package name */
    public A0.k0 f1897d;

    /* renamed from: e, reason: collision with root package name */
    public final N0 f1898e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1899f;

    /* renamed from: u, reason: collision with root package name */
    public Rect f1900u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1901v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1902w;

    /* renamed from: x, reason: collision with root package name */
    public final j0.m f1903x;

    /* renamed from: y, reason: collision with root package name */
    public final I0 f1904y;

    /* renamed from: z, reason: collision with root package name */
    public long f1905z;

    public f1(D d10, B0 b02, Rb.e eVar, A0.k0 k0Var) {
        super(d10.getContext());
        this.f1894a = d10;
        this.f1895b = b02;
        this.f1896c = eVar;
        this.f1897d = k0Var;
        this.f1898e = new N0();
        this.f1903x = new j0.m();
        this.f1904y = new I0(N.f1754e);
        this.f1905z = j0.G.f18526b;
        this.f1891A = true;
        setWillNotDraw(false);
        b02.addView(this);
        this.f1892B = View.generateViewId();
    }

    private final j0.z getManualClipPath() {
        if (getClipToOutline()) {
            N0 n02 = this.f1898e;
            if (n02.g) {
                n02.e();
                return n02.f1760e;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z8) {
        if (z8 != this.f1901v) {
            this.f1901v = z8;
            this.f1894a.v(this, z8);
        }
    }

    @Override // A0.s0
    public final long a(long j, boolean z8) {
        I0 i02 = this.f1904y;
        if (!z8) {
            return !i02.f1696d ? AbstractC1362A.s(j, i02.b(this)) : j;
        }
        boolean z10 = i02.f1694b;
        float[] fArr = (float[]) i02.f1699h;
        if (z10) {
            i02.f1695c = X.h(i02.b(this), fArr);
            i02.f1694b = false;
        }
        if (!i02.f1695c) {
            fArr = null;
        }
        if (fArr == null) {
            return 9187343241974906880L;
        }
        return !i02.f1696d ? AbstractC1362A.s(j, fArr) : j;
    }

    @Override // A0.s0
    public final void b(long j) {
        int i7 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        if (i7 == getWidth() && i10 == getHeight()) {
            return;
        }
        setPivotX(j0.G.b(this.f1905z) * i7);
        setPivotY(j0.G.c(this.f1905z) * i10);
        setOutlineProvider(this.f1898e.b() != null ? f1886D : null);
        layout(getLeft(), getTop(), getLeft() + i7, getTop() + i10);
        j();
        this.f1904y.d();
    }

    @Override // A0.s0
    public final void c(C1288a c1288a, boolean z8) {
        I0 i02 = this.f1904y;
        if (!z8) {
            float[] b2 = i02.b(this);
            if (i02.f1696d) {
                return;
            }
            AbstractC1362A.t(b2, c1288a);
            return;
        }
        boolean z10 = i02.f1694b;
        float[] fArr = (float[]) i02.f1699h;
        if (z10) {
            i02.f1695c = X.h(i02.b(this), fArr);
            i02.f1694b = false;
        }
        if (!i02.f1695c) {
            fArr = null;
        }
        if (fArr != null) {
            if (i02.f1696d) {
                return;
            }
            AbstractC1362A.t(fArr, c1288a);
        } else {
            c1288a.f18168a = 0.0f;
            c1288a.f18169b = 0.0f;
            c1288a.f18170c = 0.0f;
            c1288a.f18171d = 0.0f;
        }
    }

    @Override // A0.s0
    public final void d(j0.B b2) {
        A0.k0 k0Var;
        int i7 = b2.f18499a | this.f1893C;
        if ((i7 & 4096) != 0) {
            long j = b2.f18507w;
            this.f1905z = j;
            setPivotX(j0.G.b(j) * getWidth());
            setPivotY(j0.G.c(this.f1905z) * getHeight());
        }
        if ((i7 & 1) != 0) {
            setScaleX(b2.f18500b);
        }
        if ((i7 & 2) != 0) {
            setScaleY(b2.f18501c);
        }
        if ((i7 & 4) != 0) {
            setAlpha(b2.f18502d);
        }
        if ((i7 & 8) != 0) {
            setTranslationX(0.0f);
        }
        if ((i7 & 16) != 0) {
            setTranslationY(0.0f);
        }
        if ((i7 & 32) != 0) {
            setElevation(b2.f18503e);
        }
        if ((i7 & 1024) != 0) {
            setRotation(0.0f);
        }
        if ((i7 & 256) != 0) {
            setRotationX(0.0f);
        }
        if ((i7 & 512) != 0) {
            setRotationY(0.0f);
        }
        if ((i7 & 2048) != 0) {
            setCameraDistancePx(b2.f18506v);
        }
        boolean z8 = true;
        boolean z10 = getManualClipPath() != null;
        boolean z11 = b2.f18509y;
        Y5.A a9 = AbstractC1362A.f18492a;
        boolean z12 = z11 && b2.f18508x != a9;
        if ((i7 & 24576) != 0) {
            this.f1899f = z11 && b2.f18508x == a9;
            j();
            setClipToOutline(z12);
        }
        boolean d10 = this.f1898e.d(b2.f18498C, b2.f18502d, z12, b2.f18503e, b2.f18510z);
        N0 n02 = this.f1898e;
        if (n02.f1761f) {
            setOutlineProvider(n02.b() != null ? f1886D : null);
        }
        boolean z13 = getManualClipPath() != null;
        if (z10 != z13 || (z13 && d10)) {
            invalidate();
        }
        if (!this.f1902w && getElevation() > 0.0f && (k0Var = this.f1897d) != null) {
            k0Var.invoke();
        }
        if ((i7 & 7963) != 0) {
            this.f1904y.d();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            if ((i7 & 64) != 0) {
                setOutlineAmbientShadowColor(AbstractC1362A.z(b2.f18504f));
            }
            if ((i7 & 128) != 0) {
                setOutlineSpotShadowColor(AbstractC1362A.z(b2.f18505u));
            }
        }
        if (i10 >= 31 && (131072 & i7) != 0) {
            setRenderEffect(null);
        }
        if ((i7 & 32768) != 0) {
            if (AbstractC1362A.i(1)) {
                setLayerType(2, null);
            } else if (AbstractC1362A.i(2)) {
                setLayerType(0, null);
                z8 = false;
            } else {
                setLayerType(0, null);
            }
            this.f1891A = z8;
        }
        this.f1893C = b2.f18499a;
    }

    @Override // A0.s0
    public final void destroy() {
        setInvalidated(false);
        D d10 = this.f1894a;
        d10.f1608R = true;
        this.f1896c = null;
        this.f1897d = null;
        d10.E(this);
        this.f1895b.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z8;
        j0.m mVar = this.f1903x;
        C1364b c1364b = mVar.f18547a;
        Canvas canvas2 = c1364b.f18529a;
        c1364b.f18529a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z8 = false;
        } else {
            c1364b.i();
            this.f1898e.a(c1364b);
            z8 = true;
        }
        Rb.e eVar = this.f1896c;
        if (eVar != null) {
            eVar.invoke(c1364b, null);
        }
        if (z8) {
            c1364b.g();
        }
        mVar.f18547a.f18529a = canvas2;
        setInvalidated(false);
    }

    @Override // A0.s0
    public final void e(Rb.e eVar, A0.k0 k0Var) {
        this.f1895b.addView(this);
        I0 i02 = this.f1904y;
        i02.f1693a = false;
        i02.f1694b = false;
        i02.f1696d = true;
        i02.f1695c = true;
        AbstractC1362A.u((float[]) i02.g);
        AbstractC1362A.u((float[]) i02.f1699h);
        this.f1899f = false;
        this.f1902w = false;
        this.f1905z = j0.G.f18526b;
        this.f1896c = eVar;
        this.f1897d = k0Var;
        setInvalidated(false);
    }

    @Override // A0.s0
    public final void f(long j) {
        int i7 = (int) (j >> 32);
        int left = getLeft();
        I0 i02 = this.f1904y;
        if (i7 != left) {
            offsetLeftAndRight(i7 - getLeft());
            i02.d();
        }
        int i10 = (int) (j & 4294967295L);
        if (i10 != getTop()) {
            offsetTopAndBottom(i10 - getTop());
            i02.d();
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // A0.s0
    public final void g() {
        if (!this.f1901v || f1890H) {
            return;
        }
        X.r(this);
        setInvalidated(false);
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final B0 getContainer() {
        return this.f1895b;
    }

    public long getLayerId() {
        return this.f1892B;
    }

    public final D getOwnerView() {
        return this.f1894a;
    }

    public long getOwnerViewId() {
        long uniqueDrawingId;
        if (Build.VERSION.SDK_INT < 29) {
            return -1L;
        }
        uniqueDrawingId = this.f1894a.getUniqueDrawingId();
        return uniqueDrawingId;
    }

    @Override // A0.s0
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo0getUnderlyingMatrixsQKQjiQ() {
        return this.f1904y.b(this);
    }

    @Override // A0.s0
    public final void h(j0.l lVar, C1533b c1533b) {
        boolean z8 = getElevation() > 0.0f;
        this.f1902w = z8;
        if (z8) {
            lVar.o();
        }
        this.f1895b.a(lVar, this, getDrawingTime());
        if (this.f1902w) {
            lVar.j();
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f1891A;
    }

    @Override // A0.s0
    public final boolean i(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (this.f1899f) {
            return 0.0f <= intBitsToFloat && intBitsToFloat < ((float) getWidth()) && 0.0f <= intBitsToFloat2 && intBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f1898e.c(j);
        }
        return true;
    }

    @Override // android.view.View, A0.s0
    public final void invalidate() {
        if (this.f1901v) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f1894a.invalidate();
    }

    public final void j() {
        Rect rect;
        if (this.f1899f) {
            Rect rect2 = this.f1900u;
            if (rect2 == null) {
                this.f1900u = new Rect(0, 0, getWidth(), getHeight());
            } else {
                kotlin.jvm.internal.l.b(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f1900u;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
    }

    public final void setCameraDistancePx(float f4) {
        setCameraDistance(f4 * getResources().getDisplayMetrics().densityDpi);
    }
}
