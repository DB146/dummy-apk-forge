package B0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import j0.AbstractC1362A;
import j0.C1364b;

/* loaded from: classes.dex */
public final class P0 implements InterfaceC0211x0 {
    public static boolean g = true;

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f1771a;

    /* renamed from: b, reason: collision with root package name */
    public int f1772b;

    /* renamed from: c, reason: collision with root package name */
    public int f1773c;

    /* renamed from: d, reason: collision with root package name */
    public int f1774d;

    /* renamed from: e, reason: collision with root package name */
    public int f1775e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1776f;

    public P0(D d10) {
        RenderNode create = RenderNode.create("Compose", d10);
        this.f1771a = create;
        if (g) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                U0.c(create, U0.a(create));
                U0.d(create, U0.b(create));
            }
            T0.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            g = false;
        }
    }

    @Override // B0.InterfaceC0211x0
    public final void A(float f4) {
        this.f1771a.setElevation(f4);
    }

    @Override // B0.InterfaceC0211x0
    public final boolean B() {
        return this.f1771a.getClipToOutline();
    }

    @Override // B0.InterfaceC0211x0
    public final void C(int i7) {
        this.f1773c += i7;
        this.f1775e += i7;
        this.f1771a.offsetTopAndBottom(i7);
    }

    @Override // B0.InterfaceC0211x0
    public final void D(boolean z8) {
        this.f1771a.setClipToOutline(z8);
    }

    @Override // B0.InterfaceC0211x0
    public final void E(j0.m mVar, j0.z zVar, R0 r02) {
        DisplayListCanvas start = this.f1771a.start(getWidth(), getHeight());
        Canvas q10 = mVar.a().q();
        mVar.a().r((Canvas) start);
        C1364b a9 = mVar.a();
        if (zVar != null) {
            a9.i();
            a9.a(zVar);
        }
        r02.invoke(a9);
        if (zVar != null) {
            a9.g();
        }
        mVar.a().r(q10);
        this.f1771a.end(start);
    }

    @Override // B0.InterfaceC0211x0
    public final void F(Outline outline) {
        this.f1771a.setOutline(outline);
    }

    @Override // B0.InterfaceC0211x0
    public final void G(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            U0.d(this.f1771a, i7);
        }
    }

    @Override // B0.InterfaceC0211x0
    public final boolean H() {
        return this.f1771a.setHasOverlappingRendering(true);
    }

    @Override // B0.InterfaceC0211x0
    public final void I(Matrix matrix) {
        this.f1771a.getMatrix(matrix);
    }

    @Override // B0.InterfaceC0211x0
    public final float J() {
        return this.f1771a.getElevation();
    }

    @Override // B0.InterfaceC0211x0
    public final float a() {
        return this.f1771a.getAlpha();
    }

    @Override // B0.InterfaceC0211x0
    public final void b() {
        this.f1771a.setRotationX(0.0f);
    }

    @Override // B0.InterfaceC0211x0
    public final void c(float f4) {
        this.f1771a.setAlpha(f4);
    }

    @Override // B0.InterfaceC0211x0
    public final void d() {
    }

    @Override // B0.InterfaceC0211x0
    public final int e() {
        return this.f1772b;
    }

    @Override // B0.InterfaceC0211x0
    public final void f() {
        this.f1771a.setTranslationY(0.0f);
    }

    @Override // B0.InterfaceC0211x0
    public final void g() {
        this.f1771a.setRotationY(0.0f);
    }

    @Override // B0.InterfaceC0211x0
    public final int getHeight() {
        return this.f1775e - this.f1773c;
    }

    @Override // B0.InterfaceC0211x0
    public final int getWidth() {
        return this.f1774d - this.f1772b;
    }

    @Override // B0.InterfaceC0211x0
    public final void h(float f4) {
        this.f1771a.setScaleX(f4);
    }

    @Override // B0.InterfaceC0211x0
    public final void i() {
        T0.a(this.f1771a);
    }

    @Override // B0.InterfaceC0211x0
    public final void j() {
        this.f1771a.setTranslationX(0.0f);
    }

    @Override // B0.InterfaceC0211x0
    public final void k() {
        this.f1771a.setRotation(0.0f);
    }

    @Override // B0.InterfaceC0211x0
    public final void l(float f4) {
        this.f1771a.setScaleY(f4);
    }

    @Override // B0.InterfaceC0211x0
    public final int m() {
        return this.f1774d;
    }

    @Override // B0.InterfaceC0211x0
    public final void n(float f4) {
        this.f1771a.setCameraDistance(-f4);
    }

    @Override // B0.InterfaceC0211x0
    public final boolean o() {
        return this.f1771a.isValid();
    }

    @Override // B0.InterfaceC0211x0
    public final void p(int i7) {
        this.f1772b += i7;
        this.f1774d += i7;
        this.f1771a.offsetLeftAndRight(i7);
    }

    @Override // B0.InterfaceC0211x0
    public final int q() {
        return this.f1775e;
    }

    @Override // B0.InterfaceC0211x0
    public final boolean r() {
        return this.f1776f;
    }

    @Override // B0.InterfaceC0211x0
    public final void s(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f1771a);
    }

    @Override // B0.InterfaceC0211x0
    public final int t() {
        return this.f1773c;
    }

    @Override // B0.InterfaceC0211x0
    public final void u(float f4) {
        this.f1771a.setPivotX(f4);
    }

    @Override // B0.InterfaceC0211x0
    public final void v(boolean z8) {
        this.f1776f = z8;
        this.f1771a.setClipToBounds(z8);
    }

    @Override // B0.InterfaceC0211x0
    public final boolean w(int i7, int i10, int i11, int i12) {
        this.f1772b = i7;
        this.f1773c = i10;
        this.f1774d = i11;
        this.f1775e = i12;
        return this.f1771a.setLeftTopRightBottom(i7, i10, i11, i12);
    }

    @Override // B0.InterfaceC0211x0
    public final void x() {
        if (AbstractC1362A.i(1)) {
            this.f1771a.setLayerType(2);
            this.f1771a.setHasOverlappingRendering(true);
        } else if (AbstractC1362A.i(2)) {
            this.f1771a.setLayerType(0);
            this.f1771a.setHasOverlappingRendering(false);
        } else {
            this.f1771a.setLayerType(0);
            this.f1771a.setHasOverlappingRendering(true);
        }
    }

    @Override // B0.InterfaceC0211x0
    public final void y(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            U0.c(this.f1771a, i7);
        }
    }

    @Override // B0.InterfaceC0211x0
    public final void z(float f4) {
        this.f1771a.setPivotY(f4);
    }
}
