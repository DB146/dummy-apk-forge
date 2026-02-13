package Y0;

import A0.AbstractC0017g;
import A0.C0005a;
import A0.C0031u;
import A0.L;
import A0.t0;
import A0.u0;
import A0.v0;
import A9.S2;
import B0.C0170c0;
import B0.X;
import B0.u1;
import C.D;
import H2.O;
import Q.C0502m;
import Q.InterfaceC0494i;
import Z9.x;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import cc.F;
import com.kt.apps.media.xemtv.beta.R;
import h3.H;
import java.util.LinkedHashMap;
import l2.InterfaceC1479x;
import l2.Q;
import q1.C1876b;
import u0.C2086p;
import u0.C2088r;
import x0.AbstractC2256a;
import y0.AbstractC2328M;
import y1.AbstractC2352B;
import y1.InterfaceC2365m;
import y1.InterfaceC2366n;
import y1.K;
import y1.m0;
import y1.p0;

/* loaded from: classes.dex */
public abstract class j extends ViewGroup implements InterfaceC2365m, InterfaceC0494i, u0, InterfaceC2366n {

    /* renamed from: A, reason: collision with root package name */
    public Q2.e f11093A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f11094B;

    /* renamed from: C, reason: collision with root package name */
    public long f11095C;

    /* renamed from: D, reason: collision with root package name */
    public p0 f11096D;

    /* renamed from: E, reason: collision with root package name */
    public final i f11097E;

    /* renamed from: F, reason: collision with root package name */
    public final i f11098F;

    /* renamed from: G, reason: collision with root package name */
    public Rb.c f11099G;

    /* renamed from: H, reason: collision with root package name */
    public final int[] f11100H;

    /* renamed from: I, reason: collision with root package name */
    public int f11101I;

    /* renamed from: J, reason: collision with root package name */
    public int f11102J;

    /* renamed from: K, reason: collision with root package name */
    public final O f11103K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public final L f11104M;

    /* renamed from: a, reason: collision with root package name */
    public final t0.d f11105a;

    /* renamed from: b, reason: collision with root package name */
    public final View f11106b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f11107c;

    /* renamed from: d, reason: collision with root package name */
    public Rb.a f11108d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11109e;

    /* renamed from: f, reason: collision with root package name */
    public Rb.a f11110f;

    /* renamed from: u, reason: collision with root package name */
    public Rb.a f11111u;

    /* renamed from: v, reason: collision with root package name */
    public c0.m f11112v;

    /* renamed from: w, reason: collision with root package name */
    public Rb.c f11113w;

    /* renamed from: x, reason: collision with root package name */
    public V0.c f11114x;

    /* renamed from: y, reason: collision with root package name */
    public Rb.c f11115y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC1479x f11116z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [Rb.c, java.lang.Object, u0.r] */
    public j(Context context, C0502m c0502m, int i7, t0.d dVar, View view, t0 t0Var) {
        super(context);
        int i10 = 18;
        int i11 = 1;
        int i12 = 0;
        this.f11105a = dVar;
        this.f11106b = view;
        this.f11107c = t0Var;
        LinkedHashMap linkedHashMap = u1.f1985a;
        setTag(R.id.androidx_compose_ui_view_composition_context, c0502m);
        setSaveFromParentEnabled(false);
        addView(view);
        q qVar = (q) this;
        K.p(this, new a(qVar, i12));
        AbstractC2352B.l(this, this);
        this.f11108d = h.f11089d;
        this.f11110f = h.f11088c;
        this.f11111u = h.f11087b;
        this.f11112v = c0.j.f14110a;
        this.f11114x = Y6.b.a();
        this.f11094B = new int[2];
        this.f11095C = 0L;
        this.f11097E = new i(qVar, i11);
        this.f11098F = new i(qVar, i12);
        this.f11100H = new int[2];
        this.f11101I = Integer.MIN_VALUE;
        this.f11102J = Integer.MIN_VALUE;
        this.f11103K = new O(9);
        L l10 = new L(3);
        l10.f77u = true;
        l10.f45C = qVar;
        c0.m c10 = androidx.compose.ui.input.nestedscroll.a.a(dVar).c(new AppendedSemanticsElement(b.f11070d, true));
        C2086p c2086p = new C2086p();
        c2086p.f24792a = new d(qVar, 1);
        ?? obj = new Object();
        C2088r c2088r = c2086p.f24793b;
        if (c2088r != null) {
            c2088r.f24797a = null;
        }
        c2086p.f24793b = obj;
        obj.f24797a = c2086p;
        setOnRequestDisallowInterceptTouchEvent$ui_release(obj);
        c0.m b2 = androidx.compose.ui.layout.a.b(androidx.compose.ui.draw.a.a(androidx.compose.ui.graphics.a.b(c10.c(c2086p), 0.0f, null, false, 131071), new D(qVar, l10, qVar, i11)), new c(qVar, l10, 2));
        l10.Y(this.f11112v.c(b2));
        this.f11113w = new C0170c0(i10, l10, b2);
        l10.V(this.f11114x);
        this.f11115y = new C0005a(l10, 18);
        l10.f67Z = new c(qVar, l10, 0);
        l10.f69a0 = new d(qVar, 0);
        l10.X(new e(qVar, l10));
        this.f11104M = l10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC2256a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((B0.D) this.f11107c).getSnapshotObserver();
    }

    public static final int k(q qVar, int i7, int i10, int i11) {
        return (i11 >= 0 || i7 == i10) ? View.MeasureSpec.makeMeasureSpec(H.k(i11, i7, i10), 1073741824) : (i11 != -2 || i10 == Integer.MAX_VALUE) ? (i11 != -1 || i10 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
    }

    public static C1876b m(C1876b c1876b, int i7, int i10, int i11, int i12) {
        int i13 = c1876b.f23341a - i7;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = c1876b.f23342b - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = c1876b.f23343c - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = c1876b.f23344d - i12;
        return C1876b.b(i13, i14, i15, i16 >= 0 ? i16 : 0);
    }

    @Override // y1.InterfaceC2364l
    public final void a(View view, View view2, int i7, int i10) {
        O o10 = this.f11103K;
        if (i10 == 1) {
            o10.f4604c = i7;
        } else {
            o10.f4603b = i7;
        }
    }

    @Override // y1.InterfaceC2364l
    public final void b(View view, int i7) {
        O o10 = this.f11103K;
        if (i7 == 1) {
            o10.f4604c = 0;
        } else {
            o10.f4603b = 0;
        }
    }

    @Override // y1.InterfaceC2364l
    public final void c(View view, int i7, int i10, int[] iArr, int i11) {
        if (this.f11106b.isNestedScrollingEnabled()) {
            float f4 = i7;
            float f10 = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(f4 * f10) << 32) | (Float.floatToRawIntBits(i10 * f10) & 4294967295L);
            int i12 = i11 == 0 ? 1 : 2;
            t0.g gVar = this.f11105a.f24416a;
            t0.g gVar2 = null;
            if (gVar != null && gVar.f14112B) {
                gVar2 = (t0.g) AbstractC0017g.i(gVar);
            }
            long R10 = gVar2 != null ? gVar2.R(i12, floatToRawIntBits) : 0L;
            iArr[0] = X.c(Float.intBitsToFloat((int) (R10 >> 32)));
            iArr[1] = X.c(Float.intBitsToFloat((int) (R10 & 4294967295L)));
        }
    }

    @Override // Q.InterfaceC0494i
    public final void d() {
        View view = this.f11106b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f11110f.invoke();
        }
    }

    @Override // Q.InterfaceC0494i
    public final void e() {
        this.f11111u.invoke();
    }

    @Override // Q.InterfaceC0494i
    public final void f() {
        this.f11110f.invoke();
        removeAllViewsInLayout();
    }

    @Override // y1.InterfaceC2365m
    public final void g(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        if (this.f11106b.isNestedScrollingEnabled()) {
            float f4 = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(i7 * f4) << 32) | (Float.floatToRawIntBits(i10 * f4) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i12 * f4) & 4294967295L) | (Float.floatToRawIntBits(i11 * f4) << 32);
            int i14 = i13 == 0 ? 1 : 2;
            t0.g gVar = this.f11105a.f24416a;
            t0.g gVar2 = null;
            if (gVar != null && gVar.f14112B) {
                gVar2 = (t0.g) AbstractC0017g.i(gVar);
            }
            long A10 = gVar2 != null ? gVar2.A(i14, floatToRawIntBits, floatToRawIntBits2) : 0L;
            iArr[0] = X.c(Float.intBitsToFloat((int) (A10 >> 32)));
            iArr[1] = X.c(Float.intBitsToFloat((int) (A10 & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f11100H;
        getLocationInWindow(iArr);
        int i7 = iArr[0];
        region.op(i7, iArr[1], getWidth() + i7, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final V0.c getDensity() {
        return this.f11114x;
    }

    public final View getInteropView() {
        return this.f11106b;
    }

    public final L getLayoutNode() {
        return this.f11104M;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f11106b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC1479x getLifecycleOwner() {
        return this.f11116z;
    }

    public final c0.m getModifier() {
        return this.f11112v;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        O o10 = this.f11103K;
        return o10.f4604c | o10.f4603b;
    }

    public final Rb.c getOnDensityChanged$ui_release() {
        return this.f11115y;
    }

    public final Rb.c getOnModifierChanged$ui_release() {
        return this.f11113w;
    }

    public final Rb.c getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f11099G;
    }

    public final Rb.a getRelease() {
        return this.f11111u;
    }

    public final Rb.a getReset() {
        return this.f11110f;
    }

    public final Q2.e getSavedStateRegistryOwner() {
        return this.f11093A;
    }

    public final Rb.a getUpdate() {
        return this.f11108d;
    }

    public final View getView() {
        return this.f11106b;
    }

    @Override // y1.InterfaceC2364l
    public final void h(View view, int i7, int i10, int i11, int i12, int i13) {
        if (this.f11106b.isNestedScrollingEnabled()) {
            float f4 = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(i7 * f4) << 32) | (Float.floatToRawIntBits(i10 * f4) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i11 * f4) << 32) | (Float.floatToRawIntBits(i12 * f4) & 4294967295L);
            int i14 = i13 == 0 ? 1 : 2;
            t0.g gVar = this.f11105a.f24416a;
            t0.g gVar2 = null;
            if (gVar != null && gVar.f14112B) {
                gVar2 = (t0.g) AbstractC0017g.i(gVar);
            }
            if (gVar2 != null) {
                gVar2.A(i14, floatToRawIntBits, floatToRawIntBits2);
            }
        }
    }

    @Override // y1.InterfaceC2364l
    public final boolean i(View view, View view2, int i7, int i10) {
        return ((i7 & 2) == 0 && (i7 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.L) {
            this.f11104M.A();
            return null;
        }
        this.f11106b.postOnAnimation(new S2(this.f11098F, 18));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f11106b.isNestedScrollingEnabled();
    }

    @Override // y1.InterfaceC2366n
    public final p0 l(View view, p0 p0Var) {
        this.f11096D = new p0(p0Var);
        return n(p0Var);
    }

    public final p0 n(p0 p0Var) {
        m0 m0Var = p0Var.f26731a;
        C1876b g = m0Var.g(-1);
        C1876b c1876b = C1876b.f23340e;
        if (g.equals(c1876b) && m0Var.h(-9).equals(c1876b) && m0Var.f() == null) {
            return p0Var;
        }
        C0031u c0031u = (C0031u) this.f11104M.f60S.f226c;
        if (!c0031u.f310Y.f14112B) {
            return p0Var;
        }
        long O10 = x.O(c0031u.A(0L));
        int i7 = (int) (O10 >> 32);
        if (i7 < 0) {
            i7 = 0;
        }
        int i10 = (int) (O10 & 4294967295L);
        if (i10 < 0) {
            i10 = 0;
        }
        long z8 = AbstractC2328M.g(c0031u).z();
        int i11 = (int) (z8 >> 32);
        int i12 = (int) (z8 & 4294967295L);
        long j = c0031u.f26556c;
        long O11 = x.O(c0031u.A((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
        int i13 = i11 - ((int) (O11 >> 32));
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = i12 - ((int) (4294967295L & O11));
        int i15 = i14 >= 0 ? i14 : 0;
        return (i7 == 0 && i10 == 0 && i13 == 0 && i15 == 0) ? p0Var : p0Var.f26731a.n(i7, i10, i13, i15);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11097E.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.L) {
            this.f11104M.A();
        } else {
            this.f11106b.postOnAnimation(new S2(this.f11098F, 18));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f314a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        this.f11106b.layout(0, 0, i11 - i7, i12 - i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        View view = this.f11106b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i7, i10);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f11101I = i7;
        this.f11102J = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f4, float f10, boolean z8) {
        if (!this.f11106b.isNestedScrollingEnabled()) {
            return false;
        }
        F.B(this.f11105a.c(), null, 0, new f(z8, this, com.bumptech.glide.c.b(f4 * (-1.0f), f10 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f4, float f10) {
        if (!this.f11106b.isNestedScrollingEnabled()) {
            return false;
        }
        F.B(this.f11105a.c(), null, 0, new g(this, com.bumptech.glide.c.b(f4 * (-1.0f), f10 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
    }

    @Override // A0.u0
    public final boolean r() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        Rb.c cVar = this.f11099G;
        if (cVar != null) {
            cVar.invoke(Boolean.valueOf(z8));
        }
        super.requestDisallowInterceptTouchEvent(z8);
    }

    public final void setDensity(V0.c cVar) {
        if (cVar != this.f11114x) {
            this.f11114x = cVar;
            Rb.c cVar2 = this.f11115y;
            if (cVar2 != null) {
                cVar2.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC1479x interfaceC1479x) {
        if (interfaceC1479x != this.f11116z) {
            this.f11116z = interfaceC1479x;
            Q.i(this, interfaceC1479x);
        }
    }

    public final void setModifier(c0.m mVar) {
        if (mVar != this.f11112v) {
            this.f11112v = mVar;
            Rb.c cVar = this.f11113w;
            if (cVar != null) {
                cVar.invoke(mVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Rb.c cVar) {
        this.f11115y = cVar;
    }

    public final void setOnModifierChanged$ui_release(Rb.c cVar) {
        this.f11113w = cVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Rb.c cVar) {
        this.f11099G = cVar;
    }

    public final void setRelease(Rb.a aVar) {
        this.f11111u = aVar;
    }

    public final void setReset(Rb.a aVar) {
        this.f11110f = aVar;
    }

    public final void setSavedStateRegistryOwner(Q2.e eVar) {
        if (eVar != this.f11093A) {
            this.f11093A = eVar;
            android.support.v4.media.session.b.C(this, eVar);
        }
    }

    public final void setUpdate(Rb.a aVar) {
        this.f11108d = aVar;
        this.f11109e = true;
        this.f11097E.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
