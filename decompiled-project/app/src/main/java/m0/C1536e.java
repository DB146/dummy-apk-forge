package m0;

import A0.C0005a;
import B0.D;
import a.AbstractC0672a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import h3.H;
import j0.AbstractC1362A;
import j0.AbstractC1365c;
import j0.C1364b;
import j0.n;
import java.util.concurrent.atomic.AtomicBoolean;
import l0.C1443b;

/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1536e implements InterfaceC1535d {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicBoolean f19707v = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final j0.m f19708b;

    /* renamed from: c, reason: collision with root package name */
    public final C1443b f19709c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f19710d;

    /* renamed from: e, reason: collision with root package name */
    public long f19711e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f19712f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public long f19713h;

    /* renamed from: i, reason: collision with root package name */
    public int f19714i;
    public final int j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19715l;

    /* renamed from: m, reason: collision with root package name */
    public float f19716m;

    /* renamed from: n, reason: collision with root package name */
    public float f19717n;

    /* renamed from: o, reason: collision with root package name */
    public float f19718o;

    /* renamed from: p, reason: collision with root package name */
    public long f19719p;

    /* renamed from: q, reason: collision with root package name */
    public long f19720q;

    /* renamed from: r, reason: collision with root package name */
    public float f19721r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f19722s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f19723t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f19724u;

    public C1536e(D d10, j0.m mVar, C1443b c1443b) {
        this.f19708b = mVar;
        this.f19709c = c1443b;
        RenderNode create = RenderNode.create("Compose", d10);
        this.f19710d = create;
        this.f19711e = 0L;
        this.f19713h = 0L;
        if (f19707v.getAndSet(false)) {
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
                l.c(create, l.a(create));
                l.d(create, l.b(create));
            }
            AbstractC1542k.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        M(0);
        this.f19714i = 0;
        this.j = 3;
        this.k = 1.0f;
        this.f19716m = 1.0f;
        this.f19717n = 1.0f;
        int i7 = n.f18553h;
        this.f19719p = AbstractC1362A.o();
        this.f19720q = AbstractC1362A.o();
        this.f19721r = 8.0f;
    }

    @Override // m0.InterfaceC1535d
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f19720q = j;
            l.d(this.f19710d, AbstractC1362A.z(j));
        }
    }

    @Override // m0.InterfaceC1535d
    public final Matrix B() {
        Matrix matrix = this.f19712f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f19712f = matrix;
        }
        this.f19710d.getMatrix(matrix);
        return matrix;
    }

    @Override // m0.InterfaceC1535d
    public final void C(V0.c cVar, V0.l lVar, C1533b c1533b, C0005a c0005a) {
        Canvas start = this.f19710d.start(Math.max((int) (this.f19711e >> 32), (int) (this.f19713h >> 32)), Math.max((int) (this.f19711e & 4294967295L), (int) (this.f19713h & 4294967295L)));
        try {
            j0.m mVar = this.f19708b;
            Canvas q10 = mVar.a().q();
            mVar.a().r(start);
            C1364b a9 = mVar.a();
            C1443b c1443b = this.f19709c;
            long u3 = AbstractC0672a.u(this.f19711e);
            V0.c y10 = c1443b.u().y();
            V0.l B10 = c1443b.u().B();
            j0.l x2 = c1443b.u().x();
            long D10 = c1443b.u().D();
            C1533b z8 = c1443b.u().z();
            Q7.h u10 = c1443b.u();
            u10.Q(cVar);
            u10.S(lVar);
            u10.P(a9);
            u10.U(u3);
            u10.R(c1533b);
            a9.i();
            try {
                c0005a.invoke(c1443b);
                a9.g();
                Q7.h u11 = c1443b.u();
                u11.Q(y10);
                u11.S(B10);
                u11.P(x2);
                u11.U(D10);
                u11.R(z8);
                mVar.a().r(q10);
            } catch (Throwable th) {
                a9.g();
                Q7.h u12 = c1443b.u();
                u12.Q(y10);
                u12.S(B10);
                u12.P(x2);
                u12.U(D10);
                u12.R(z8);
                throw th;
            }
        } finally {
            this.f19710d.end(start);
        }
    }

    @Override // m0.InterfaceC1535d
    public final void D(int i7, int i10, long j) {
        int i11 = (int) (j >> 32);
        int i12 = (int) (4294967295L & j);
        this.f19710d.setLeftTopRightBottom(i7, i10, i7 + i11, i10 + i12);
        if (V0.k.a(this.f19711e, j)) {
            return;
        }
        if (this.f19715l) {
            this.f19710d.setPivotX(i11 / 2.0f);
            this.f19710d.setPivotY(i12 / 2.0f);
        }
        this.f19711e = j;
    }

    @Override // m0.InterfaceC1535d
    public final float E() {
        return 0.0f;
    }

    @Override // m0.InterfaceC1535d
    public final float F() {
        return this.f19718o;
    }

    @Override // m0.InterfaceC1535d
    public final float G() {
        return this.f19717n;
    }

    @Override // m0.InterfaceC1535d
    public final float H() {
        return 0.0f;
    }

    @Override // m0.InterfaceC1535d
    public final int I() {
        return this.j;
    }

    @Override // m0.InterfaceC1535d
    public final void J(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f19715l = true;
            this.f19710d.setPivotX(((int) (this.f19711e >> 32)) / 2.0f);
            this.f19710d.setPivotY(((int) (4294967295L & this.f19711e)) / 2.0f);
        } else {
            this.f19715l = false;
            this.f19710d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f19710d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // m0.InterfaceC1535d
    public final long K() {
        return this.f19719p;
    }

    public final void L() {
        boolean z8 = this.f19722s;
        boolean z10 = false;
        boolean z11 = z8 && !this.g;
        if (z8 && this.g) {
            z10 = true;
        }
        if (z11 != this.f19723t) {
            this.f19723t = z11;
            this.f19710d.setClipToBounds(z11);
        }
        if (z10 != this.f19724u) {
            this.f19724u = z10;
            this.f19710d.setClipToOutline(z10);
        }
    }

    public final void M(int i7) {
        RenderNode renderNode = this.f19710d;
        if (H.q(i7, 1)) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (H.q(i7, 2)) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // m0.InterfaceC1535d
    public final float a() {
        return this.k;
    }

    @Override // m0.InterfaceC1535d
    public final void b() {
        this.f19710d.setRotationX(0.0f);
    }

    @Override // m0.InterfaceC1535d
    public final void c(float f4) {
        this.k = f4;
        this.f19710d.setAlpha(f4);
    }

    @Override // m0.InterfaceC1535d
    public final void d() {
    }

    @Override // m0.InterfaceC1535d
    public final float e() {
        return this.f19716m;
    }

    @Override // m0.InterfaceC1535d
    public final void f() {
        this.f19710d.setTranslationY(0.0f);
    }

    @Override // m0.InterfaceC1535d
    public final void g() {
        this.f19710d.setRotationY(0.0f);
    }

    @Override // m0.InterfaceC1535d
    public final void h(float f4) {
        this.f19716m = f4;
        this.f19710d.setScaleX(f4);
    }

    @Override // m0.InterfaceC1535d
    public final void i() {
        AbstractC1542k.a(this.f19710d);
    }

    @Override // m0.InterfaceC1535d
    public final void j() {
        this.f19710d.setTranslationX(0.0f);
    }

    @Override // m0.InterfaceC1535d
    public final void k() {
        this.f19710d.setRotation(0.0f);
    }

    @Override // m0.InterfaceC1535d
    public final void l(float f4) {
        this.f19717n = f4;
        this.f19710d.setScaleY(f4);
    }

    @Override // m0.InterfaceC1535d
    public final void m(float f4) {
        this.f19718o = f4;
        this.f19710d.setElevation(f4);
    }

    @Override // m0.InterfaceC1535d
    public final void n(float f4) {
        this.f19721r = f4;
        this.f19710d.setCameraDistance(-f4);
    }

    @Override // m0.InterfaceC1535d
    public final boolean o() {
        return this.f19710d.isValid();
    }

    @Override // m0.InterfaceC1535d
    public final float p() {
        return 0.0f;
    }

    @Override // m0.InterfaceC1535d
    public final long q() {
        return this.f19720q;
    }

    @Override // m0.InterfaceC1535d
    public final void r(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f19719p = j;
            l.c(this.f19710d, AbstractC1362A.z(j));
        }
    }

    @Override // m0.InterfaceC1535d
    public final void s(Outline outline, long j) {
        this.f19713h = j;
        this.f19710d.setOutline(outline);
        this.g = outline != null;
        L();
    }

    @Override // m0.InterfaceC1535d
    public final float t() {
        return this.f19721r;
    }

    @Override // m0.InterfaceC1535d
    public final float u() {
        return 0.0f;
    }

    @Override // m0.InterfaceC1535d
    public final void v(boolean z8) {
        this.f19722s = z8;
        L();
    }

    @Override // m0.InterfaceC1535d
    public final int w() {
        return this.f19714i;
    }

    @Override // m0.InterfaceC1535d
    public final float x() {
        return 0.0f;
    }

    @Override // m0.InterfaceC1535d
    public final void y(j0.l lVar) {
        DisplayListCanvas a9 = AbstractC1365c.a(lVar);
        kotlin.jvm.internal.l.c(a9, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        a9.drawRenderNode(this.f19710d);
    }

    @Override // m0.InterfaceC1535d
    public final void z(int i7) {
        this.f19714i = i7;
        if (H.q(i7, 1) || !AbstractC1362A.j(this.j, 3)) {
            M(1);
        } else {
            M(this.f19714i);
        }
    }
}
