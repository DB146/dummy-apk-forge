package m0;

import A9.Y2;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import j0.C1364b;
import l0.AbstractC1444c;
import l0.C1443b;
import n0.AbstractC1693a;

/* loaded from: classes.dex */
public final class m extends View {

    /* renamed from: y, reason: collision with root package name */
    public static final Y2 f19759y = new Y2(3);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1693a f19760a;

    /* renamed from: b, reason: collision with root package name */
    public final j0.m f19761b;

    /* renamed from: c, reason: collision with root package name */
    public final C1443b f19762c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19763d;

    /* renamed from: e, reason: collision with root package name */
    public Outline f19764e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19765f;

    /* renamed from: u, reason: collision with root package name */
    public V0.c f19766u;

    /* renamed from: v, reason: collision with root package name */
    public V0.l f19767v;

    /* renamed from: w, reason: collision with root package name */
    public kotlin.jvm.internal.m f19768w;

    /* renamed from: x, reason: collision with root package name */
    public C1533b f19769x;

    public m(AbstractC1693a abstractC1693a, j0.m mVar, C1443b c1443b) {
        super(abstractC1693a.getContext());
        this.f19760a = abstractC1693a;
        this.f19761b = mVar;
        this.f19762c = c1443b;
        setOutlineProvider(f19759y);
        this.f19765f = true;
        this.f19766u = AbstractC1444c.f19145a;
        this.f19767v = V0.l.f9982a;
        InterfaceC1535d.f19706a.getClass();
        this.f19768w = C1532a.f19682c;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [Rb.c, kotlin.jvm.internal.m] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j0.m mVar = this.f19761b;
        C1364b c1364b = mVar.f18547a;
        Canvas canvas2 = c1364b.f18529a;
        c1364b.f18529a = canvas;
        V0.c cVar = this.f19766u;
        V0.l lVar = this.f19767v;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        C1533b c1533b = this.f19769x;
        ?? r92 = this.f19768w;
        C1443b c1443b = this.f19762c;
        V0.c y10 = c1443b.f19142b.y();
        Q7.h hVar = c1443b.f19142b;
        V0.l B10 = hVar.B();
        j0.l x2 = hVar.x();
        long D10 = hVar.D();
        C1533b c1533b2 = (C1533b) hVar.f8696c;
        hVar.Q(cVar);
        hVar.S(lVar);
        hVar.P(c1364b);
        hVar.U(floatToRawIntBits);
        hVar.f8696c = c1533b;
        c1364b.i();
        try {
            r92.invoke(c1443b);
            c1364b.g();
            hVar.Q(y10);
            hVar.S(B10);
            hVar.P(x2);
            hVar.U(D10);
            hVar.f8696c = c1533b2;
            mVar.f18547a.f18529a = canvas2;
            this.f19763d = false;
        } catch (Throwable th) {
            c1364b.g();
            hVar.Q(y10);
            hVar.S(B10);
            hVar.P(x2);
            hVar.U(D10);
            hVar.f8696c = c1533b2;
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f19765f;
    }

    public final j0.m getCanvasHolder() {
        return this.f19761b;
    }

    public final View getOwnerView() {
        return this.f19760a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f19765f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f19763d) {
            return;
        }
        this.f19763d = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z8) {
        if (this.f19765f != z8) {
            this.f19765f = z8;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z8) {
        this.f19763d = z8;
    }
}
