package B0;

import I2.C0330t;
import Q.C0506o;
import Q.C0518u0;
import Q.EnumC0507o0;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import cc.C0927d0;
import com.kt.apps.media.xemtv.beta.R;
import hc.C1277e;
import java.lang.ref.WeakReference;
import l2.C1481z;
import l2.InterfaceC1479x;
import x0.AbstractC2256a;

/* renamed from: B0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0167b extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f1849a;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f1850b;

    /* renamed from: c, reason: collision with root package name */
    public y1 f1851c;

    /* renamed from: d, reason: collision with root package name */
    public Q.r f1852d;

    /* renamed from: e, reason: collision with root package name */
    public c1 f1853e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1854f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1855u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1856v;

    public AbstractC0167b(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        G g = new G(this, 1);
        addOnAttachStateChangeListener(g);
        b1 b1Var = new b1(this);
        android.support.v4.media.session.b.r(this).f4280a.add(b1Var);
        this.f1853e = new c1(this, g, b1Var, 0);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(Q.r rVar) {
        if (this.f1852d != rVar) {
            this.f1852d = rVar;
            if (rVar != null) {
                this.f1849a = null;
            }
            y1 y1Var = this.f1851c;
            if (y1Var != null) {
                y1Var.a();
                this.f1851c = null;
                if (isAttachedToWindow()) {
                    d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f1850b != iBinder) {
            this.f1850b = iBinder;
            this.f1849a = null;
        }
    }

    public abstract void a(C0506o c0506o);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        b();
        super.addView(view, i7);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, int i10) {
        b();
        super.addView(view, i7, i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i7, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i7, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z8) {
        b();
        return super.addViewInLayout(view, i7, layoutParams, z8);
    }

    public final void b() {
        if (this.f1855u) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        y1 y1Var = this.f1851c;
        if (y1Var != null) {
            y1Var.a();
        }
        this.f1851c = null;
        requestLayout();
    }

    public final void d() {
        if (this.f1851c == null) {
            try {
                this.f1855u = true;
                this.f1851c = z1.a(this, g(), new Y.e(-656146368, new C0165a(this, 0), true));
            } finally {
                this.f1855u = false;
            }
        }
    }

    public void e(int i7, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i11 - i7) - getPaddingRight(), (i12 - i10) - getPaddingBottom());
        }
    }

    public void f(int i7, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i7, i10);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i7)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i10)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if (r4 > 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Type inference failed for: r2v0, types: [Q.r] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Q.r] */
    /* JADX WARN: Type inference failed for: r2v14, types: [Q.u0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Q.r] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [B0.k0] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Q.r g() {
        Hb.i iVar;
        ?? r62;
        Q.r rVar;
        int i7 = 2;
        C0518u0 c0518u0 = this.f1852d;
        if (c0518u0 == 0) {
            c0518u0 = u1.b(this);
            if (c0518u0 == 0) {
                ViewParent parent = getParent();
                c0518u0 = c0518u0;
                while (c0518u0 == 0 && (parent instanceof View)) {
                    Q.r b2 = u1.b((View) parent);
                    parent = parent.getParent();
                    c0518u0 = b2;
                }
            }
            if (c0518u0 != 0) {
                Object obj = (!(c0518u0 instanceof C0518u0) || ((EnumC0507o0) c0518u0.f8558t.getValue()).compareTo(EnumC0507o0.f8475b) > 0) ? c0518u0 : null;
                if (obj != null) {
                    this.f1849a = new WeakReference(obj);
                }
            } else {
                c0518u0 = 0;
            }
            if (c0518u0 == 0) {
                WeakReference weakReference = this.f1849a;
                if (weakReference != null && (rVar = (Q.r) weakReference.get()) != null) {
                    boolean z8 = rVar instanceof C0518u0;
                    c0518u0 = rVar;
                    if (z8) {
                        int compareTo = ((EnumC0507o0) ((C0518u0) rVar).f8558t.getValue()).compareTo(EnumC0507o0.f8475b);
                        c0518u0 = rVar;
                    }
                    if (c0518u0 == 0) {
                        if (!isAttachedToWindow()) {
                            AbstractC2256a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                        }
                        Object parent2 = getParent();
                        View view = this;
                        while (parent2 instanceof View) {
                            View view2 = (View) parent2;
                            if (view2.getId() == 16908290) {
                                break;
                            }
                            view = view2;
                            parent2 = view2.getParent();
                        }
                        Q.r b10 = u1.b(view);
                        if (b10 == null) {
                            ((k1) m1.f1933a.get()).getClass();
                            Hb.j jVar = Hb.j.f4919a;
                            Db.o oVar = C0182i0.f1909A;
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                iVar = (Hb.i) C0182i0.f1909A.getValue();
                            } else {
                                iVar = (Hb.i) C0182i0.f1910B.get();
                                if (iVar == null) {
                                    throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                                }
                            }
                            Hb.i plus = iVar.plus(jVar);
                            Q.T t5 = (Q.T) plus.get(Q.S.f8364b);
                            if (t5 != null) {
                                C0186k0 c0186k0 = new C0186k0(t5);
                                C0330t c0330t = (C0330t) c0186k0.f1927c;
                                synchronized (c0330t.f5200b) {
                                    c0330t.f5199a = false;
                                    r62 = c0186k0;
                                }
                            } else {
                                r62 = 0;
                            }
                            ?? obj2 = new Object();
                            Hb.i iVar2 = (c0.p) plus.get(c0.b.f14088A);
                            if (iVar2 == null) {
                                iVar2 = new K0();
                                obj2.f19134a = iVar2;
                            }
                            if (r62 != 0) {
                                jVar = r62;
                            }
                            Hb.i plus2 = plus.plus(jVar).plus(iVar2);
                            C0518u0 c0518u02 = new C0518u0(plus2);
                            synchronized (c0518u02.f8543b) {
                                c0518u02.f8557s = true;
                            }
                            C1277e b11 = cc.F.b(plus2);
                            InterfaceC1479x d10 = l2.Q.d(view);
                            C1481z w10 = d10 != null ? d10.w() : null;
                            if (w10 == null) {
                                AbstractC2256a.c("ViewTreeLifecycleOwner not found from " + view);
                                throw new Db.d(0);
                            }
                            view.addOnAttachStateChangeListener(new n1(view, c0518u02));
                            w10.a(new r1(b11, r62, c0518u02, obj2, view));
                            view.setTag(R.id.androidx_compose_ui_view_composition_context, c0518u02);
                            C0927d0 c0927d0 = C0927d0.f14526a;
                            Handler handler = view.getHandler();
                            int i10 = dc.e.f16632a;
                            view.addOnAttachStateChangeListener(new G(cc.F.B(c0927d0, new dc.d(handler, "windowRecomposer cleanup", false).f16631f, 0, new l1(c0518u02, view, null), 2), i7));
                            c0518u0 = c0518u02;
                        } else {
                            if (!(b10 instanceof C0518u0)) {
                                throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                            }
                            c0518u0 = (C0518u0) b10;
                        }
                        Object obj3 = ((EnumC0507o0) c0518u0.f8558t.getValue()).compareTo(EnumC0507o0.f8475b) > 0 ? c0518u0 : null;
                        if (obj3 != null) {
                            this.f1849a = new WeakReference(obj3);
                        }
                    }
                }
                c0518u0 = 0;
                if (c0518u0 == 0) {
                }
            }
        }
        return c0518u0;
    }

    public final boolean getHasComposition() {
        return this.f1851c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f1854f;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f1856v || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        e(i7, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        d();
        f(i7, i10);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i7);
    }

    public final void setParentCompositionContext(Q.r rVar) {
        setParentContext(rVar);
    }

    public final void setShowLayoutBounds(boolean z8) {
        this.f1854f = z8;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((D) ((A0.t0) childAt)).setShowLayoutBounds(z8);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z8) {
        super.setTransitionGroup(z8);
        this.f1856v = true;
    }

    public final void setViewCompositionStrategy(d1 d1Var) {
        c1 c1Var = this.f1853e;
        if (c1Var != null) {
            c1Var.invoke();
        }
        ((X) d1Var).getClass();
        G g = new G(this, 1);
        addOnAttachStateChangeListener(g);
        b1 b1Var = new b1(this);
        android.support.v4.media.session.b.r(this).f4280a.add(b1Var);
        this.f1853e = new c1(this, g, b1Var, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
