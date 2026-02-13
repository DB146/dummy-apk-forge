package m0;

import A0.C0005a;
import a.AbstractC0672a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import h3.H;
import j0.AbstractC1362A;
import j0.AbstractC1363a;
import j0.AbstractC1365c;
import j0.C1364b;
import j0.n;
import l0.C1443b;

/* renamed from: m0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1538g implements InterfaceC1535d {

    /* renamed from: b, reason: collision with root package name */
    public final j0.m f19725b;

    /* renamed from: c, reason: collision with root package name */
    public final C1443b f19726c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f19727d;

    /* renamed from: e, reason: collision with root package name */
    public long f19728e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f19729f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public float f19730h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19731i;
    public float j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public float f19732l;

    /* renamed from: m, reason: collision with root package name */
    public long f19733m;

    /* renamed from: n, reason: collision with root package name */
    public long f19734n;

    /* renamed from: o, reason: collision with root package name */
    public float f19735o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19736p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19737q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f19738r;

    /* renamed from: s, reason: collision with root package name */
    public int f19739s;

    public C1538g() {
        j0.m mVar = new j0.m();
        C1443b c1443b = new C1443b();
        this.f19725b = mVar;
        this.f19726c = c1443b;
        RenderNode d10 = AbstractC1363a.d();
        this.f19727d = d10;
        this.f19728e = 0L;
        d10.setClipToBounds(false);
        M(d10, 0);
        this.f19730h = 1.0f;
        this.f19731i = 3;
        this.j = 1.0f;
        this.k = 1.0f;
        long j = n.f18548b;
        this.f19733m = j;
        this.f19734n = j;
        this.f19735o = 8.0f;
        this.f19739s = 0;
    }

    public static void M(RenderNode renderNode, int i7) {
        if (H.q(i7, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (H.q(i7, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // m0.InterfaceC1535d
    public final void A(long j) {
        this.f19734n = j;
        this.f19727d.setSpotShadowColor(AbstractC1362A.z(j));
    }

    @Override // m0.InterfaceC1535d
    public final Matrix B() {
        Matrix matrix = this.f19729f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f19729f = matrix;
        }
        this.f19727d.getMatrix(matrix);
        return matrix;
    }

    @Override // m0.InterfaceC1535d
    public final void C(V0.c cVar, V0.l lVar, C1533b c1533b, C0005a c0005a) {
        RecordingCanvas beginRecording;
        C1443b c1443b = this.f19726c;
        beginRecording = this.f19727d.beginRecording();
        try {
            j0.m mVar = this.f19725b;
            C1364b c1364b = mVar.f18547a;
            Canvas canvas = c1364b.f18529a;
            c1364b.f18529a = beginRecording;
            Q7.h hVar = c1443b.f19142b;
            hVar.Q(cVar);
            hVar.S(lVar);
            hVar.f8696c = c1533b;
            hVar.U(this.f19728e);
            hVar.P(c1364b);
            c0005a.invoke(c1443b);
            mVar.f18547a.f18529a = canvas;
        } finally {
            this.f19727d.endRecording();
        }
    }

    @Override // m0.InterfaceC1535d
    public final void D(int i7, int i10, long j) {
        this.f19727d.setPosition(i7, i10, ((int) (j >> 32)) + i7, ((int) (4294967295L & j)) + i10);
        this.f19728e = AbstractC0672a.u(j);
    }

    @Override // m0.InterfaceC1535d
    public final float E() {
        return 0.0f;
    }

    @Override // m0.InterfaceC1535d
    public final float F() {
        return this.f19732l;
    }

    @Override // m0.InterfaceC1535d
    public final float G() {
        return this.k;
    }

    @Override // m0.InterfaceC1535d
    public final float H() {
        return 0.0f;
    }

    @Override // m0.InterfaceC1535d
    public final int I() {
        return this.f19731i;
    }

    @Override // m0.InterfaceC1535d
    public final void J(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f19727d.resetPivot();
        } else {
            this.f19727d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f19727d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // m0.InterfaceC1535d
    public final long K() {
        return this.f19733m;
    }

    public final void L() {
        boolean z8 = this.f19736p;
        boolean z10 = false;
        boolean z11 = z8 && !this.g;
        if (z8 && this.g) {
            z10 = true;
        }
        if (z11 != this.f19737q) {
            this.f19737q = z11;
            this.f19727d.setClipToBounds(z11);
        }
        if (z10 != this.f19738r) {
            this.f19738r = z10;
            this.f19727d.setClipToOutline(z10);
        }
    }

    @Override // m0.InterfaceC1535d
    public final float a() {
        return this.f19730h;
    }

    @Override // m0.InterfaceC1535d
    public final void b() {
        this.f19727d.setRotationX(0.0f);
    }

    @Override // m0.InterfaceC1535d
    public final void c(float f4) {
        this.f19730h = f4;
        this.f19727d.setAlpha(f4);
    }

    @Override // m0.InterfaceC1535d
    public final void d() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f19727d.setRenderEffect(null);
        }
    }

    @Override // m0.InterfaceC1535d
    public final float e() {
        return this.j;
    }

    @Override // m0.InterfaceC1535d
    public final void f() {
        this.f19727d.setTranslationY(0.0f);
    }

    @Override // m0.InterfaceC1535d
    public final void g() {
        this.f19727d.setRotationY(0.0f);
    }

    @Override // m0.InterfaceC1535d
    public final void h(float f4) {
        this.j = f4;
        this.f19727d.setScaleX(f4);
    }

    @Override // m0.InterfaceC1535d
    public final void i() {
        this.f19727d.discardDisplayList();
    }

    @Override // m0.InterfaceC1535d
    public final void j() {
        this.f19727d.setTranslationX(0.0f);
    }

    @Override // m0.InterfaceC1535d
    public final void k() {
        this.f19727d.setRotationZ(0.0f);
    }

    @Override // m0.InterfaceC1535d
    public final void l(float f4) {
        this.k = f4;
        this.f19727d.setScaleY(f4);
    }

    @Override // m0.InterfaceC1535d
    public final void m(float f4) {
        this.f19732l = f4;
        this.f19727d.setElevation(f4);
    }

    @Override // m0.InterfaceC1535d
    public final void n(float f4) {
        this.f19735o = f4;
        this.f19727d.setCameraDistance(f4);
    }

    @Override // m0.InterfaceC1535d
    public final boolean o() {
        boolean hasDisplayList;
        hasDisplayList = this.f19727d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // m0.InterfaceC1535d
    public final float p() {
        return 0.0f;
    }

    @Override // m0.InterfaceC1535d
    public final long q() {
        return this.f19734n;
    }

    @Override // m0.InterfaceC1535d
    public final void r(long j) {
        this.f19733m = j;
        this.f19727d.setAmbientShadowColor(AbstractC1362A.z(j));
    }

    @Override // m0.InterfaceC1535d
    public final void s(Outline outline, long j) {
        this.f19727d.setOutline(outline);
        this.g = outline != null;
        L();
    }

    @Override // m0.InterfaceC1535d
    public final float t() {
        return this.f19735o;
    }

    @Override // m0.InterfaceC1535d
    public final float u() {
        return 0.0f;
    }

    @Override // m0.InterfaceC1535d
    public final void v(boolean z8) {
        this.f19736p = z8;
        L();
    }

    @Override // m0.InterfaceC1535d
    public final int w() {
        return this.f19739s;
    }

    @Override // m0.InterfaceC1535d
    public final float x() {
        return 0.0f;
    }

    @Override // m0.InterfaceC1535d
    public final void y(j0.l lVar) {
        AbstractC1365c.a(lVar).drawRenderNode(this.f19727d);
    }

    @Override // m0.InterfaceC1535d
    public final void z(int i7) {
        this.f19739s = i7;
        if (H.q(i7, 1) || !AbstractC1362A.j(this.f19731i, 3)) {
            M(this.f19727d, 1);
        } else {
            M(this.f19727d, this.f19739s);
        }
    }
}
