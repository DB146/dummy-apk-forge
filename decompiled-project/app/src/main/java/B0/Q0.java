package B0;

import A9.L2;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import j0.AbstractC1362A;
import j0.C1364b;

/* loaded from: classes.dex */
public final class Q0 implements InterfaceC0211x0 {

    /* renamed from: a, reason: collision with root package name */
    public final RenderNode f1778a = L2.d();

    @Override // B0.InterfaceC0211x0
    public final void A(float f4) {
        this.f1778a.setElevation(f4);
    }

    @Override // B0.InterfaceC0211x0
    public final boolean B() {
        boolean clipToOutline;
        clipToOutline = this.f1778a.getClipToOutline();
        return clipToOutline;
    }

    @Override // B0.InterfaceC0211x0
    public final void C(int i7) {
        this.f1778a.offsetTopAndBottom(i7);
    }

    @Override // B0.InterfaceC0211x0
    public final void D(boolean z8) {
        this.f1778a.setClipToOutline(z8);
    }

    @Override // B0.InterfaceC0211x0
    public final void E(j0.m mVar, j0.z zVar, R0 r02) {
        RecordingCanvas beginRecording;
        beginRecording = this.f1778a.beginRecording();
        C1364b c1364b = mVar.f18547a;
        Canvas canvas = c1364b.f18529a;
        c1364b.f18529a = beginRecording;
        if (zVar != null) {
            c1364b.i();
            c1364b.a(zVar);
        }
        r02.invoke(c1364b);
        if (zVar != null) {
            c1364b.g();
        }
        mVar.f18547a.f18529a = canvas;
        this.f1778a.endRecording();
    }

    @Override // B0.InterfaceC0211x0
    public final void F(Outline outline) {
        this.f1778a.setOutline(outline);
    }

    @Override // B0.InterfaceC0211x0
    public final void G(int i7) {
        this.f1778a.setSpotShadowColor(i7);
    }

    @Override // B0.InterfaceC0211x0
    public final boolean H() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f1778a.setHasOverlappingRendering(true);
        return hasOverlappingRendering;
    }

    @Override // B0.InterfaceC0211x0
    public final void I(Matrix matrix) {
        this.f1778a.getMatrix(matrix);
    }

    @Override // B0.InterfaceC0211x0
    public final float J() {
        float elevation;
        elevation = this.f1778a.getElevation();
        return elevation;
    }

    @Override // B0.InterfaceC0211x0
    public final float a() {
        float alpha;
        alpha = this.f1778a.getAlpha();
        return alpha;
    }

    @Override // B0.InterfaceC0211x0
    public final void b() {
        this.f1778a.setRotationX(0.0f);
    }

    @Override // B0.InterfaceC0211x0
    public final void c(float f4) {
        this.f1778a.setAlpha(f4);
    }

    @Override // B0.InterfaceC0211x0
    public final void d() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f1778a.setRenderEffect(null);
        }
    }

    @Override // B0.InterfaceC0211x0
    public final int e() {
        int left;
        left = this.f1778a.getLeft();
        return left;
    }

    @Override // B0.InterfaceC0211x0
    public final void f() {
        this.f1778a.setTranslationY(0.0f);
    }

    @Override // B0.InterfaceC0211x0
    public final void g() {
        this.f1778a.setRotationY(0.0f);
    }

    @Override // B0.InterfaceC0211x0
    public final int getHeight() {
        int height;
        height = this.f1778a.getHeight();
        return height;
    }

    @Override // B0.InterfaceC0211x0
    public final int getWidth() {
        int width;
        width = this.f1778a.getWidth();
        return width;
    }

    @Override // B0.InterfaceC0211x0
    public final void h(float f4) {
        this.f1778a.setScaleX(f4);
    }

    @Override // B0.InterfaceC0211x0
    public final void i() {
        this.f1778a.discardDisplayList();
    }

    @Override // B0.InterfaceC0211x0
    public final void j() {
        this.f1778a.setTranslationX(0.0f);
    }

    @Override // B0.InterfaceC0211x0
    public final void k() {
        this.f1778a.setRotationZ(0.0f);
    }

    @Override // B0.InterfaceC0211x0
    public final void l(float f4) {
        this.f1778a.setScaleY(f4);
    }

    @Override // B0.InterfaceC0211x0
    public final int m() {
        int right;
        right = this.f1778a.getRight();
        return right;
    }

    @Override // B0.InterfaceC0211x0
    public final void n(float f4) {
        this.f1778a.setCameraDistance(f4);
    }

    @Override // B0.InterfaceC0211x0
    public final boolean o() {
        boolean hasDisplayList;
        hasDisplayList = this.f1778a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // B0.InterfaceC0211x0
    public final void p(int i7) {
        this.f1778a.offsetLeftAndRight(i7);
    }

    @Override // B0.InterfaceC0211x0
    public final int q() {
        int bottom;
        bottom = this.f1778a.getBottom();
        return bottom;
    }

    @Override // B0.InterfaceC0211x0
    public final boolean r() {
        boolean clipToBounds;
        clipToBounds = this.f1778a.getClipToBounds();
        return clipToBounds;
    }

    @Override // B0.InterfaceC0211x0
    public final void s(Canvas canvas) {
        canvas.drawRenderNode(this.f1778a);
    }

    @Override // B0.InterfaceC0211x0
    public final int t() {
        int top;
        top = this.f1778a.getTop();
        return top;
    }

    @Override // B0.InterfaceC0211x0
    public final void u(float f4) {
        this.f1778a.setPivotX(f4);
    }

    @Override // B0.InterfaceC0211x0
    public final void v(boolean z8) {
        this.f1778a.setClipToBounds(z8);
    }

    @Override // B0.InterfaceC0211x0
    public final boolean w(int i7, int i10, int i11, int i12) {
        boolean position;
        position = this.f1778a.setPosition(i7, i10, i11, i12);
        return position;
    }

    @Override // B0.InterfaceC0211x0
    public final void x() {
        RenderNode renderNode = this.f1778a;
        if (AbstractC1362A.i(1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (AbstractC1362A.i(2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // B0.InterfaceC0211x0
    public final void y(int i7) {
        this.f1778a.setAmbientShadowColor(i7);
    }

    @Override // B0.InterfaceC0211x0
    public final void z(float f4) {
        this.f1778a.setPivotY(f4);
    }
}
