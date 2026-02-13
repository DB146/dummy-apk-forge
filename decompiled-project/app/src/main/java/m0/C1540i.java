package m0;

import A0.C0005a;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import h3.H;
import j0.AbstractC1362A;
import j0.AbstractC1365c;
import j0.C1364b;
import j0.n;
import l0.C1443b;
import n0.AbstractC1693a;

/* renamed from: m0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1540i implements InterfaceC1535d {

    /* renamed from: v, reason: collision with root package name */
    public static final C1539h f19740v = new Canvas();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1693a f19741b;

    /* renamed from: c, reason: collision with root package name */
    public final j0.m f19742c;

    /* renamed from: d, reason: collision with root package name */
    public final m f19743d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f19744e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f19745f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f19746h;

    /* renamed from: i, reason: collision with root package name */
    public long f19747i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19748l;

    /* renamed from: m, reason: collision with root package name */
    public final int f19749m;

    /* renamed from: n, reason: collision with root package name */
    public int f19750n;

    /* renamed from: o, reason: collision with root package name */
    public float f19751o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19752p;

    /* renamed from: q, reason: collision with root package name */
    public float f19753q;

    /* renamed from: r, reason: collision with root package name */
    public float f19754r;

    /* renamed from: s, reason: collision with root package name */
    public float f19755s;

    /* renamed from: t, reason: collision with root package name */
    public long f19756t;

    /* renamed from: u, reason: collision with root package name */
    public long f19757u;

    public C1540i(AbstractC1693a abstractC1693a) {
        j0.m mVar = new j0.m();
        C1443b c1443b = new C1443b();
        this.f19741b = abstractC1693a;
        this.f19742c = mVar;
        m mVar2 = new m(abstractC1693a, mVar, c1443b);
        this.f19743d = mVar2;
        this.f19744e = abstractC1693a.getResources();
        this.f19745f = new Rect();
        abstractC1693a.addView(mVar2);
        mVar2.setClipBounds(null);
        this.f19747i = 0L;
        View.generateViewId();
        this.f19749m = 3;
        this.f19750n = 0;
        this.f19751o = 1.0f;
        this.f19753q = 1.0f;
        this.f19754r = 1.0f;
        long j = n.f18548b;
        this.f19756t = j;
        this.f19757u = j;
    }

    @Override // m0.InterfaceC1535d
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f19757u = j;
            this.f19743d.setOutlineSpotShadowColor(AbstractC1362A.z(j));
        }
    }

    @Override // m0.InterfaceC1535d
    public final Matrix B() {
        return this.f19743d.getMatrix();
    }

    @Override // m0.InterfaceC1535d
    public final void C(V0.c cVar, V0.l lVar, C1533b c1533b, C0005a c0005a) {
        m mVar = this.f19743d;
        ViewParent parent = mVar.getParent();
        AbstractC1693a abstractC1693a = this.f19741b;
        if (parent == null) {
            abstractC1693a.addView(mVar);
        }
        mVar.f19766u = cVar;
        mVar.f19767v = lVar;
        mVar.f19768w = c0005a;
        mVar.f19769x = c1533b;
        if (mVar.isAttachedToWindow()) {
            mVar.setVisibility(4);
            mVar.setVisibility(0);
            try {
                j0.m mVar2 = this.f19742c;
                C1539h c1539h = f19740v;
                C1364b c1364b = mVar2.f18547a;
                Canvas canvas = c1364b.f18529a;
                c1364b.f18529a = c1539h;
                abstractC1693a.a(c1364b, mVar, mVar.getDrawingTime());
                mVar2.f18547a.f18529a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // m0.InterfaceC1535d
    public final void D(int i7, int i10, long j) {
        boolean a9 = V0.k.a(this.f19747i, j);
        m mVar = this.f19743d;
        if (a9) {
            int i11 = this.g;
            if (i11 != i7) {
                mVar.offsetLeftAndRight(i7 - i11);
            }
            int i12 = this.f19746h;
            if (i12 != i10) {
                mVar.offsetTopAndBottom(i10 - i12);
            }
        } else {
            if (M()) {
                this.j = true;
            }
            int i13 = (int) (j >> 32);
            int i14 = (int) (4294967295L & j);
            mVar.layout(i7, i10, i7 + i13, i10 + i14);
            this.f19747i = j;
            if (this.f19752p) {
                mVar.setPivotX(i13 / 2.0f);
                mVar.setPivotY(i14 / 2.0f);
            }
        }
        this.g = i7;
        this.f19746h = i10;
    }

    @Override // m0.InterfaceC1535d
    public final float E() {
        return 0.0f;
    }

    @Override // m0.InterfaceC1535d
    public final float F() {
        return this.f19755s;
    }

    @Override // m0.InterfaceC1535d
    public final float G() {
        return this.f19754r;
    }

    @Override // m0.InterfaceC1535d
    public final float H() {
        return 0.0f;
    }

    @Override // m0.InterfaceC1535d
    public final int I() {
        return this.f19749m;
    }

    @Override // m0.InterfaceC1535d
    public final void J(long j) {
        long j10 = 9223372034707292159L & j;
        m mVar = this.f19743d;
        if (j10 != 9205357640488583168L) {
            this.f19752p = false;
            mVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            mVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                mVar.resetPivot();
                return;
            }
            this.f19752p = true;
            mVar.setPivotX(((int) (this.f19747i >> 32)) / 2.0f);
            mVar.setPivotY(((int) (this.f19747i & 4294967295L)) / 2.0f);
        }
    }

    @Override // m0.InterfaceC1535d
    public final long K() {
        return this.f19756t;
    }

    public final void L(int i7) {
        boolean z8 = true;
        boolean q10 = H.q(i7, 1);
        m mVar = this.f19743d;
        if (q10) {
            mVar.setLayerType(2, null);
        } else if (H.q(i7, 2)) {
            mVar.setLayerType(0, null);
            z8 = false;
        } else {
            mVar.setLayerType(0, null);
        }
        mVar.setCanUseCompositingLayer$ui_graphics_release(z8);
    }

    public final boolean M() {
        return this.f19748l || this.f19743d.getClipToOutline();
    }

    @Override // m0.InterfaceC1535d
    public final float a() {
        return this.f19751o;
    }

    @Override // m0.InterfaceC1535d
    public final void b() {
        this.f19743d.setRotationX(0.0f);
    }

    @Override // m0.InterfaceC1535d
    public final void c(float f4) {
        this.f19751o = f4;
        this.f19743d.setAlpha(f4);
    }

    @Override // m0.InterfaceC1535d
    public final void d() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f19743d.setRenderEffect(null);
        }
    }

    @Override // m0.InterfaceC1535d
    public final float e() {
        return this.f19753q;
    }

    @Override // m0.InterfaceC1535d
    public final void f() {
        this.f19743d.setTranslationY(0.0f);
    }

    @Override // m0.InterfaceC1535d
    public final void g() {
        this.f19743d.setRotationY(0.0f);
    }

    @Override // m0.InterfaceC1535d
    public final void h(float f4) {
        this.f19753q = f4;
        this.f19743d.setScaleX(f4);
    }

    @Override // m0.InterfaceC1535d
    public final void i() {
        this.f19741b.removeViewInLayout(this.f19743d);
    }

    @Override // m0.InterfaceC1535d
    public final void j() {
        this.f19743d.setTranslationX(0.0f);
    }

    @Override // m0.InterfaceC1535d
    public final void k() {
        this.f19743d.setRotation(0.0f);
    }

    @Override // m0.InterfaceC1535d
    public final void l(float f4) {
        this.f19754r = f4;
        this.f19743d.setScaleY(f4);
    }

    @Override // m0.InterfaceC1535d
    public final void m(float f4) {
        this.f19755s = f4;
        this.f19743d.setElevation(f4);
    }

    @Override // m0.InterfaceC1535d
    public final void n(float f4) {
        this.f19743d.setCameraDistance(f4 * this.f19744e.getDisplayMetrics().densityDpi);
    }

    @Override // m0.InterfaceC1535d
    public final float p() {
        return 0.0f;
    }

    @Override // m0.InterfaceC1535d
    public final long q() {
        return this.f19757u;
    }

    @Override // m0.InterfaceC1535d
    public final void r(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f19756t = j;
            this.f19743d.setOutlineAmbientShadowColor(AbstractC1362A.z(j));
        }
    }

    @Override // m0.InterfaceC1535d
    public final void s(Outline outline, long j) {
        m mVar = this.f19743d;
        mVar.f19764e = outline;
        mVar.invalidateOutline();
        if (M() && outline != null) {
            mVar.setClipToOutline(true);
            if (this.f19748l) {
                this.f19748l = false;
                this.j = true;
            }
        }
        this.k = outline != null;
    }

    @Override // m0.InterfaceC1535d
    public final float t() {
        return this.f19743d.getCameraDistance() / this.f19744e.getDisplayMetrics().densityDpi;
    }

    @Override // m0.InterfaceC1535d
    public final float u() {
        return 0.0f;
    }

    @Override // m0.InterfaceC1535d
    public final void v(boolean z8) {
        boolean z10 = false;
        this.f19748l = z8 && !this.k;
        this.j = true;
        if (z8 && this.k) {
            z10 = true;
        }
        this.f19743d.setClipToOutline(z10);
    }

    @Override // m0.InterfaceC1535d
    public final int w() {
        return this.f19750n;
    }

    @Override // m0.InterfaceC1535d
    public final float x() {
        return 0.0f;
    }

    @Override // m0.InterfaceC1535d
    public final void y(j0.l lVar) {
        Rect rect;
        boolean z8 = this.j;
        m mVar = this.f19743d;
        if (z8) {
            if (!M() || this.k) {
                rect = null;
            } else {
                rect = this.f19745f;
                rect.left = 0;
                rect.top = 0;
                rect.right = mVar.getWidth();
                rect.bottom = mVar.getHeight();
            }
            mVar.setClipBounds(rect);
        }
        if (AbstractC1365c.a(lVar).isHardwareAccelerated()) {
            this.f19741b.a(lVar, mVar, mVar.getDrawingTime());
        }
    }

    @Override // m0.InterfaceC1535d
    public final void z(int i7) {
        this.f19750n = i7;
        if (H.q(i7, 1) || !AbstractC1362A.j(this.f19749m, 3)) {
            L(1);
        } else {
            L(this.f19750n);
        }
    }
}
