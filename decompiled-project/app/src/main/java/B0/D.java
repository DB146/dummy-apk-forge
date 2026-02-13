package B0;

import A0.AbstractC0012d0;
import A0.AbstractC0017g;
import A0.AbstractC0025n;
import A0.C0006a0;
import A0.C0010c0;
import A0.C0011d;
import A0.C0018g0;
import A0.C0029s;
import A0.C0031u;
import A9.AbstractC0068b1;
import A9.S2;
import A9.Y2;
import B0.C0194o0;
import B0.D;
import K0.C0374d;
import Q.C0480b;
import Q.C0487e0;
import a.AbstractC0672a;
import a0.AbstractC0688o;
import a0.C0693t;
import a0.C0694u;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import c0.l;
import d0.C1034b;
import d0.InterfaceC1037e;
import ea.C1108c;
import f0.ViewOnDragListenerC1126a;
import g3.C1191j;
import h0.AbstractC1217d;
import h0.C1216c;
import h0.C1219f;
import h0.C1221h;
import h0.C1229p;
import h0.InterfaceC1220g;
import hc.C1277e;
import ia.C1358d;
import j0.AbstractC1362A;
import j0.C1364b;
import j0.C1366d;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import l2.C1481z;
import l2.InterfaceC1462f;
import l2.InterfaceC1479x;
import q0.C1874b;
import q0.InterfaceC1873a;
import r0.C1911a;
import r0.C1913c;
import r0.InterfaceC1912b;
import u.AbstractC2060m;
import u.C2042E;
import u.C2046I;
import u.C2070x;
import u0.C2072b;
import u0.C2074d;
import u0.C2082l;
import u0.C2087q;
import u0.InterfaceC2079i;
import w0.C2195a;
import x0.AbstractC2256a;
import y0.AbstractC2322G;
import y0.AbstractC2325J;
import y0.AbstractC2328M;
import y0.C2326K;
import z0.C2580b;

/* loaded from: classes.dex */
public final class D extends ViewGroup implements A0.t0, A0.z0, InterfaceC1462f {

    /* renamed from: Q0, reason: collision with root package name */
    public static Class f1575Q0;

    /* renamed from: R0, reason: collision with root package name */
    public static Method f1576R0;

    /* renamed from: A, reason: collision with root package name */
    public final I0.a f1577A;

    /* renamed from: A0, reason: collision with root package name */
    public final C1874b f1578A0;

    /* renamed from: B, reason: collision with root package name */
    public final D f1579B;

    /* renamed from: B0, reason: collision with root package name */
    public final C1913c f1580B0;

    /* renamed from: C, reason: collision with root package name */
    public final H0.o f1581C;
    public final C2580b C0;

    /* renamed from: D, reason: collision with root package name */
    public final L f1582D;

    /* renamed from: D0, reason: collision with root package name */
    public final F0 f1583D0;

    /* renamed from: E, reason: collision with root package name */
    public e0.c f1584E;

    /* renamed from: E0, reason: collision with root package name */
    public MotionEvent f1585E0;

    /* renamed from: F, reason: collision with root package name */
    public final C0181i f1586F;

    /* renamed from: F0, reason: collision with root package name */
    public long f1587F0;

    /* renamed from: G, reason: collision with root package name */
    public final C1366d f1588G;

    /* renamed from: G0, reason: collision with root package name */
    public final q3.s f1589G0;

    /* renamed from: H, reason: collision with root package name */
    public final d0.i f1590H;

    /* renamed from: H0, reason: collision with root package name */
    public final C2042E f1591H0;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f1592I;

    /* renamed from: I0, reason: collision with root package name */
    public final C f1593I0;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f1594J;

    /* renamed from: J0, reason: collision with root package name */
    public final S2 f1595J0;

    /* renamed from: K, reason: collision with root package name */
    public boolean f1596K;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f1597K0;
    public boolean L;

    /* renamed from: L0, reason: collision with root package name */
    public final B f1598L0;

    /* renamed from: M, reason: collision with root package name */
    public final C2072b f1599M;

    /* renamed from: M0, reason: collision with root package name */
    public final InterfaceC0196p0 f1600M0;

    /* renamed from: N, reason: collision with root package name */
    public final E.u f1601N;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f1602N0;

    /* renamed from: O, reason: collision with root package name */
    public Rb.c f1603O;

    /* renamed from: O0, reason: collision with root package name */
    public final C1191j f1604O0;

    /* renamed from: P, reason: collision with root package name */
    public final q3.i f1605P;

    /* renamed from: P0, reason: collision with root package name */
    public final F0 f1606P0;

    /* renamed from: Q, reason: collision with root package name */
    public final C1034b f1607Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f1608R;

    /* renamed from: S, reason: collision with root package name */
    public final C0185k f1609S;

    /* renamed from: T, reason: collision with root package name */
    public final C0183j f1610T;

    /* renamed from: U, reason: collision with root package name */
    public final A0.v0 f1611U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1612V;

    /* renamed from: W, reason: collision with root package name */
    public C0192n0 f1613W;

    /* renamed from: a, reason: collision with root package name */
    public long f1614a;

    /* renamed from: a0, reason: collision with root package name */
    public B0 f1615a0;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1616b;

    /* renamed from: b0, reason: collision with root package name */
    public V0.a f1617b0;

    /* renamed from: c, reason: collision with root package name */
    public final A0.N f1618c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1619c0;

    /* renamed from: d, reason: collision with root package name */
    public final C0487e0 f1620d;

    /* renamed from: d0, reason: collision with root package name */
    public final C0006a0 f1621d0;

    /* renamed from: e, reason: collision with root package name */
    public final C1221h f1622e;

    /* renamed from: e0, reason: collision with root package name */
    public long f1623e0;

    /* renamed from: f, reason: collision with root package name */
    public Hb.i f1624f;

    /* renamed from: f0, reason: collision with root package name */
    public final int[] f1625f0;

    /* renamed from: g0, reason: collision with root package name */
    public final float[] f1626g0;

    /* renamed from: h0, reason: collision with root package name */
    public final float[] f1627h0;

    /* renamed from: i0, reason: collision with root package name */
    public long f1628i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f1629j0;

    /* renamed from: k0, reason: collision with root package name */
    public long f1630k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f1631l0;

    /* renamed from: m0, reason: collision with root package name */
    public final C0487e0 f1632m0;

    /* renamed from: n0, reason: collision with root package name */
    public final Q.C f1633n0;

    /* renamed from: o0, reason: collision with root package name */
    public Rb.c f1634o0;

    /* renamed from: p0, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0189m f1635p0;

    /* renamed from: q0, reason: collision with root package name */
    public final ViewTreeObserverOnScrollChangedListenerC0191n f1636q0;

    /* renamed from: r0, reason: collision with root package name */
    public final ViewTreeObserverOnTouchModeChangeListenerC0193o f1637r0;

    /* renamed from: s0, reason: collision with root package name */
    public final q3.e f1638s0;

    /* renamed from: t0, reason: collision with root package name */
    public final O0.d f1639t0;

    /* renamed from: u, reason: collision with root package name */
    public final ViewOnDragListenerC1126a f1640u;

    /* renamed from: u0, reason: collision with root package name */
    public final AtomicReference f1641u0;

    /* renamed from: v, reason: collision with root package name */
    public final D5.i f1642v;

    /* renamed from: v0, reason: collision with root package name */
    public final F0 f1643v0;

    /* renamed from: w, reason: collision with root package name */
    public final j0.m f1644w;

    /* renamed from: w0, reason: collision with root package name */
    public final F0 f1645w0;

    /* renamed from: x, reason: collision with root package name */
    public final C0190m0 f1646x;

    /* renamed from: x0, reason: collision with root package name */
    public final C0487e0 f1647x0;

    /* renamed from: y, reason: collision with root package name */
    public final A0.L f1648y;

    /* renamed from: y0, reason: collision with root package name */
    public int f1649y0;

    /* renamed from: z, reason: collision with root package name */
    public final C2070x f1650z;

    /* renamed from: z0, reason: collision with root package name */
    public final C0487e0 f1651z0;

    /* JADX WARN: Type inference failed for: r0v23, types: [B0.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, E.u] */
    /* JADX WARN: Type inference failed for: r0v35, types: [B0.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [q3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [B0.m] */
    /* JADX WARN: Type inference failed for: r1v37, types: [B0.n] */
    /* JADX WARN: Type inference failed for: r1v38, types: [B0.o] */
    /* JADX WARN: Type inference failed for: r1v40, types: [O0.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42, types: [B0.F0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [B0.F0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v56, types: [q0.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v58, types: [z0.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [c0.l, H0.d] */
    public D(Context context, Hb.i iVar) {
        super(context);
        q3.i iVar2;
        C1034b c1034b;
        this.f1614a = 9205357640488583168L;
        this.f1616b = true;
        this.f1618c = new A0.N();
        V0.e b2 = Q5.e.b(context);
        Q.S s3 = Q.S.f8366d;
        this.f1620d = new C0487e0(b2, s3);
        ?? lVar = new c0.l();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(lVar);
        AbstractC0012d0 abstractC0012d0 = new AbstractC0012d0() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, B0.o0] */
            @Override // A0.AbstractC0012d0
            public final l d() {
                ?? lVar2 = new l();
                lVar2.f1941C = D.this;
                return lVar2;
            }

            @Override // A0.AbstractC0012d0
            public final void e(l lVar2) {
                ((C0194o0) lVar2).f1941C = D.this;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return D.this.hashCode();
            }
        };
        this.f1622e = new C1221h(new C0204u(1, this, D.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0, 0), new C0206v(2, this, D.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0, 0), new C0200s(0, this, D.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0, 1), new C0208w(0, 0, D.class, this, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;"));
        this.f1624f = iVar;
        this.f1640u = new ViewOnDragListenerC1126a();
        this.f1642v = new D5.i(3);
        c0.m a9 = androidx.compose.ui.input.key.a.a(new C0214z(this, 0));
        c0.m a10 = androidx.compose.ui.input.rotary.a.a();
        this.f1644w = new j0.m();
        this.f1646x = new C0190m0(ViewConfiguration.get(context));
        A0.L l10 = new A0.L(3);
        l10.X(C2326K.f26564a);
        l10.V(getDensity());
        l10.Z(getViewConfiguration());
        l10.Y(emptySemanticsElement.c(a10).c(a9).c(((C1221h) getFocusOwner()).g).c(m4getDragAndDropManager().f16924c).c(abstractC0012d0));
        this.f1648y = l10;
        C2070x c2070x = AbstractC2060m.f24696a;
        this.f1650z = new C2070x();
        getLayoutNodes();
        this.f1577A = new I0.a();
        this.f1579B = this;
        this.f1581C = new H0.o(getRoot(), lVar, getLayoutNodes());
        L l11 = new L(this);
        this.f1582D = l11;
        this.f1584E = new e0.c(this, new C0200s(0, this, X.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0));
        ?? obj = new Object();
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f1586F = obj;
        this.f1588G = new C1366d(this);
        this.f1590H = new d0.i();
        this.f1592I = new ArrayList();
        this.f1599M = new C2072b();
        A0.L root = getRoot();
        ?? obj2 = new Object();
        obj2.f3499b = root;
        obj2.f3500c = new I0((C0031u) root.f60S.f226c);
        obj2.f3501d = new C1358d();
        obj2.f3502e = new C0029s();
        this.f1601N = obj2;
        this.f1603O = r.f1960b;
        if (g()) {
            d0.i autofillTree = getAutofillTree();
            ?? obj3 = new Object();
            obj3.f23382a = this;
            obj3.f23383b = autofillTree;
            AutofillManager f4 = L0.a.f(getContext().getSystemService(L0.a.i()));
            if (f4 == null) {
                throw new IllegalStateException("Autofill service could not be located.");
            }
            obj3.f23384c = f4;
            setImportantForAutofill(1);
            D0.a m10 = Y6.b.m(this);
            AutofillId i7 = m10 != null ? AbstractC0068b1.i(m10.f3146a) : null;
            if (i7 == null) {
                throw X.c.c("Required value was null.");
            }
            obj3.f23385d = i7;
            iVar2 = obj3;
        } else {
            iVar2 = null;
        }
        this.f1605P = iVar2;
        if (g()) {
            AutofillManager f10 = L0.a.f(context.getSystemService(L0.a.i()));
            if (f10 == null) {
                throw X.c.c("Autofill service could not be located.");
            }
            c1034b = new C1034b(new R7.a(f10, 22), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            c1034b = null;
        }
        this.f1607Q = c1034b;
        this.f1609S = new C0185k(context);
        m3getClipboardManager();
        this.f1610T = new Object();
        this.f1611U = new A0.v0(new C0214z(this, 1));
        this.f1621d0 = new C0006a0(getRoot());
        long j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f1623e0 = (j & 4294967295L) | (j << 32);
        this.f1625f0 = new int[]{0, 0};
        float[] g = AbstractC1362A.g();
        this.f1626g0 = AbstractC1362A.g();
        this.f1627h0 = AbstractC1362A.g();
        this.f1628i0 = -1L;
        this.f1630k0 = 9187343241974906880L;
        this.f1631l0 = true;
        this.f1632m0 = C0480b.o(null);
        B b10 = new B(this, 1);
        Q7.h hVar = Q.I0.f8308a;
        this.f1633n0 = new Q.C(b10, null);
        this.f1635p0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: B0.m
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                D.this.J();
            }
        };
        this.f1636q0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: B0.n
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                D.this.J();
            }
        };
        this.f1637r0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: B0.o
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z8) {
                C1913c c1913c = D.this.f1580B0;
                int i10 = z8 ? 1 : 2;
                c1913c.getClass();
                c1913c.f23645a.setValue(new C1911a(i10));
            }
        };
        this.f1638s0 = new q3.e(getView(), this);
        ?? obj4 = new Object();
        new AtomicReference(null);
        this.f1639t0 = obj4;
        this.f1641u0 = new AtomicReference(null);
        getTextInputService();
        this.f1643v0 = new Object();
        this.f1645w0 = new Object();
        this.f1647x0 = new C0487e0(AbstractC0672a.f(context), s3);
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = Build.VERSION.SDK_INT;
        this.f1649y0 = i10 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        V0.l lVar2 = layoutDirection != 0 ? layoutDirection != 1 ? null : V0.l.f9983b : V0.l.f9982a;
        this.f1651z0 = C0480b.o(lVar2 == null ? V0.l.f9982a : lVar2);
        this.f1578A0 = new Object();
        this.f1580B0 = new C1913c(isInTouchMode() ? 1 : 2);
        ?? obj5 = new Object();
        new S.e(new C0011d[16]);
        new S.e(new C1358d[16]);
        new S.e(new A0.L[16]);
        new S.e(new C1358d[16]);
        this.C0 = obj5;
        this.f1583D0 = new F0(this, 5);
        this.f1589G0 = new q3.s(2);
        this.f1591H0 = new C2042E();
        int i11 = 0;
        this.f1593I0 = new C(this, i11);
        this.f1595J0 = new S2(this, 3);
        this.f1598L0 = new B(this, i11);
        this.f1600M0 = i10 < 29 ? new q3.l(g) : new C0198q0();
        addOnAttachStateChangeListener(this.f1584E);
        setWillNotDraw(false);
        setFocusable(true);
        if (i10 >= 26) {
            W.f1804a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        y1.K.n(this, l11);
        setOnDragListener(m4getDragAndDropManager());
        getRoot().b(this);
        if (i10 >= 29) {
            S.f1781a.a(this);
        }
        this.f1604O0 = i10 >= 31 ? new C1191j(8) : null;
        this.f1606P0 = new F0(this, 3);
    }

    public static final void b(D d10, int i7, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int d11;
        L l10 = d10.f1582D;
        if (kotlin.jvm.internal.l.a(str, l10.f1720G)) {
            int d12 = l10.f1718E.d(i7);
            if (d12 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d12);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.l.a(str, l10.f1721H) || (d11 = l10.f1719F.d(i7)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, d11);
    }

    public static final boolean f(D d10, C1216c c1216c, i0.c cVar) {
        Integer D10;
        if (d10.isFocused() || d10.hasFocus()) {
            return true;
        }
        return super.requestFocus((c1216c == null || (D10 = AbstractC1217d.D(c1216c.f17595a)) == null) ? 130 : D10.intValue(), cVar != null ? AbstractC1362A.y(cVar) : null);
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @Db.a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @Db.a
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0195p get_viewTreeOwners() {
        return (C0195p) this.f1632m0.getValue();
    }

    public static void h(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof D) {
                ((D) childAt).w();
            } else if (childAt instanceof ViewGroup) {
                h((ViewGroup) childAt);
            }
        }
    }

    public static long i(int i7) {
        long j;
        long j10;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == Integer.MIN_VALUE) {
            j = 0 << 32;
        } else {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalStateException();
                }
                j10 = size;
                j = j10 << 32;
                return j | j10;
            }
            j = 0 << 32;
            size = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        j10 = size;
        return j | j10;
    }

    public static View j(View view, int i7) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (kotlin.jvm.internal.l.a(declaredMethod.invoke(view, null), Integer.valueOf(i7))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View j = j(viewGroup.getChildAt(i10), i7);
                    if (j != null) {
                        return j;
                    }
                }
            }
        }
        return null;
    }

    public static void m(A0.L l10) {
        l10.B();
        S.e x2 = l10.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            m((A0.L) objArr[i10]);
        }
    }

    public static boolean p(MotionEvent motionEvent) {
        boolean z8 = (Float.floatToRawIntBits(motionEvent.getX()) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040;
        if (!z8) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i7 = 1; i7 < pointerCount; i7++) {
                z8 = (Float.floatToRawIntBits(motionEvent.getX(i7)) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i7)) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !L0.f1748a.a(motionEvent, i7));
                if (z8) {
                    break;
                }
            }
        }
        return z8;
    }

    private void setDensity(V0.c cVar) {
        this.f1620d.setValue(cVar);
    }

    private void setFontFamilyResolver(N0.d dVar) {
        this.f1647x0.setValue(dVar);
    }

    private void setLayoutDirection(V0.l lVar) {
        this.f1651z0.setValue(lVar);
    }

    private final void set_viewTreeOwners(C0195p c0195p) {
        this.f1632m0.setValue(c0195p);
    }

    public final void A(A0.L l10, boolean z8, boolean z10) {
        C0006a0 c0006a0 = this.f1621d0;
        if (!z8) {
            c0006a0.getClass();
            int ordinal = l10.f61T.f96d.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                throw new Db.d(1);
            }
            A0.L t5 = l10.t();
            boolean z11 = t5 == null || t5.G();
            A0.P p10 = l10.f61T;
            if (!z10) {
                if (l10.q()) {
                    return;
                }
                if (l10.p() && l10.G() == z11 && l10.G() == p10.f105p.f175G) {
                    return;
                }
            }
            C0010c0 c0010c0 = p10.f105p;
            c0010c0.f177I = true;
            c0010c0.f178J = true;
            if (!l10.f73c0 && c0010c0.f175G && z11) {
                if ((t5 == null || !t5.p()) && (t5 == null || !t5.q())) {
                    c0006a0.f158b.e(l10, false);
                }
                if (c0006a0.f160d) {
                    return;
                }
                F(null);
                return;
            }
            return;
        }
        c0006a0.getClass();
        int ordinal2 = l10.f61T.f96d.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    throw new Db.d(1);
                }
            }
        }
        A0.P p11 = l10.f61T;
        if ((p11.f97e || p11.f98f) && !z10) {
            return;
        }
        p11.f98f = true;
        p11.g = true;
        C0010c0 c0010c02 = p11.f105p;
        c0010c02.f177I = true;
        c0010c02.f178J = true;
        if (l10.f73c0) {
            return;
        }
        A0.L t10 = l10.t();
        boolean a9 = kotlin.jvm.internal.l.a(l10.H(), Boolean.TRUE);
        q3.c cVar = c0006a0.f158b;
        if (a9 && ((t10 == null || !t10.f61T.f97e) && (t10 == null || !t10.f61T.f98f))) {
            cVar.e(l10, true);
        } else if (l10.G() && ((t10 == null || !t10.p()) && (t10 == null || !t10.q()))) {
            cVar.e(l10, false);
        }
        if (c0006a0.f160d) {
            return;
        }
        F(null);
    }

    public final void B() {
        L l10 = this.f1582D;
        l10.f1714A = true;
        if (l10.u() && !l10.L) {
            l10.L = true;
            l10.f1733l.post(l10.f1725M);
        }
        e0.c cVar = this.f1584E;
        cVar.f16650u = true;
        if (!cVar.d() || cVar.f16642B) {
            return;
        }
        cVar.f16642B = true;
        cVar.f16652w.post(cVar.f16643C);
    }

    public final void C() {
        if (this.f1629j0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f1628i0) {
            this.f1628i0 = currentAnimationTimeMillis;
            InterfaceC0196p0 interfaceC0196p0 = this.f1600M0;
            float[] fArr = this.f1626g0;
            interfaceC0196p0.a(this, fArr);
            X.h(fArr, this.f1627h0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f1625f0;
            view.getLocationOnScreen(iArr);
            float f4 = iArr[0];
            float f10 = iArr[1];
            view.getLocationInWindow(iArr);
            float f11 = iArr[0];
            float f12 = f10 - iArr[1];
            this.f1630k0 = (Float.floatToRawIntBits(f4 - f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
        }
    }

    public final void D(MotionEvent motionEvent) {
        this.f1628i0 = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC0196p0 interfaceC0196p0 = this.f1600M0;
        float[] fArr = this.f1626g0;
        interfaceC0196p0.a(this, fArr);
        X.h(fArr, this.f1627h0);
        float x2 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long s3 = AbstractC1362A.s((Float.floatToRawIntBits(x2) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (s3 >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (s3 & 4294967295L));
        this.f1630k0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final void E(A0.s0 s0Var) {
        q3.s sVar;
        Reference poll;
        S.e eVar;
        if (this.f1615a0 != null) {
            Y2 y22 = f1.f1886D;
        }
        do {
            sVar = this.f1589G0;
            poll = ((ReferenceQueue) sVar.f23439c).poll();
            eVar = (S.e) sVar.f23438b;
            if (poll != null) {
                eVar.k(poll);
            }
        } while (poll != null);
        eVar.b(new WeakReference(s0Var, (ReferenceQueue) sVar.f23439c));
        this.f1592I.remove(s0Var);
    }

    public final void F(A0.L l10) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (l10 != null) {
            while (l10 != null && l10.f61T.f105p.f198z == A0.H.f30a) {
                if (!this.f1619c0) {
                    A0.L t5 = l10.t();
                    if (t5 == null) {
                        break;
                    }
                    long j = ((C0031u) t5.f60S.f226c).f26557d;
                    if (V0.a.f(j) && V0.a.e(j)) {
                        break;
                    }
                }
                l10 = l10.t();
            }
            if (l10 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long G(long j) {
        C();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f1630k0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f1630k0 & 4294967295L));
        return AbstractC1362A.s((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.f1627h0);
    }

    public final int H(MotionEvent motionEvent) {
        Object obj;
        int i7 = 0;
        if (this.f1602N0) {
            this.f1602N0 = false;
            int metaState = motionEvent.getMetaState();
            this.f1642v.getClass();
            j1.f1923a.setValue(new C2087q(metaState));
        }
        C2072b c2072b = this.f1599M;
        C1108c a9 = c2072b.a(this, motionEvent);
        E.u uVar = this.f1601N;
        if (a9 != null) {
            ArrayList arrayList = (ArrayList) a9.f16831c;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i10 = size - 1;
                    obj = arrayList.get(size);
                    if (((C2082l) obj).f24782e) {
                        break;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    size = i10;
                }
            }
            obj = null;
            C2082l c2082l = (C2082l) obj;
            if (c2082l != null) {
                this.f1614a = c2082l.f24781d;
            }
            i7 = uVar.e(a9, this, q(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (i7 & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                c2072b.f24742c.delete(pointerId);
                c2072b.f24741b.delete(pointerId);
            }
        } else if (!uVar.f3498a) {
            ((u.r) ((C1358d) uVar.f3501d).f18487b).a();
            ((I0) uVar.f3500c).e();
        }
        return i7;
    }

    public final void I(MotionEvent motionEvent, int i7, long j, boolean z8) {
        int actionMasked = motionEvent.getActionMasked();
        int i10 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i10 = motionEvent.getActionIndex();
            }
        } else if (i7 != 9 && i7 != 10) {
            i10 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i10 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((i10 < 0 || i13 < i10) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            float f4 = pointerCoords.x;
            long s3 = s((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (s3 >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (s3 & 4294967295L));
            i13++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i7, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z8 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C1108c a9 = this.f1599M.a(this, obtain);
        kotlin.jvm.internal.l.b(a9);
        this.f1601N.e(a9, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        boolean z8;
        long j;
        long O10;
        float[] fArr;
        I0.b bVar;
        boolean z10;
        int[] iArr = this.f1625f0;
        getLocationOnScreen(iArr);
        long j10 = this.f1623e0;
        int i7 = (int) (j10 >> 32);
        int i10 = (int) (j10 & 4294967295L);
        int i11 = iArr[0];
        if (i7 != i11 || i10 != iArr[1] || this.f1628i0 < 0) {
            this.f1623e0 = (4294967295L & iArr[1]) | (i11 << 32);
            if (i7 != Integer.MAX_VALUE && i10 != Integer.MAX_VALUE) {
                getRoot().f61T.f105p.U();
                z8 = true;
                C();
                I0.a rectManager = getRectManager();
                j = this.f1623e0;
                O10 = Z9.x.O(this.f1630k0);
                rectManager.getClass();
                fArr = this.f1626g0;
                if ((Tb.a.a(fArr) & 2) != 0) {
                    fArr = null;
                }
                bVar = rectManager.f4956b;
                if (V0.i.a(O10, bVar.f4965c)) {
                    bVar.f4965c = O10;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!V0.i.a(j, bVar.f4966d)) {
                    bVar.f4966d = j;
                    z10 = true;
                }
                if (fArr != null) {
                    z10 = true;
                }
                rectManager.f4959e = !z10 || rectManager.f4959e;
                this.f1621d0.a(z8);
                getRectManager().a();
            }
        }
        z8 = false;
        C();
        I0.a rectManager2 = getRectManager();
        j = this.f1623e0;
        O10 = Z9.x.O(this.f1630k0);
        rectManager2.getClass();
        fArr = this.f1626g0;
        if ((Tb.a.a(fArr) & 2) != 0) {
        }
        bVar = rectManager2.f4956b;
        if (V0.i.a(O10, bVar.f4965c)) {
        }
        if (!V0.i.a(j, bVar.f4966d)) {
        }
        if (fArr != null) {
        }
        rectManager2.f4959e = !z10 || rectManager2.f4959e;
        this.f1621d0.a(z8);
        getRectManager().a();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        kotlin.jvm.internal.l.b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i7, layoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, int i10) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i7;
        generateDefaultLayoutParams.height = i10;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i7, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        boolean isText;
        boolean isDate;
        boolean isList;
        boolean isToggle;
        CharSequence textValue;
        boolean isText2;
        boolean isDate2;
        boolean isList2;
        boolean isToggle2;
        H0.i v10;
        Rb.c cVar;
        CharSequence textValue2;
        if (g()) {
            C1034b c1034b = this.f1607Q;
            if (c1034b != null) {
                int size = sparseArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    int keyAt = sparseArray.keyAt(i7);
                    AutofillValue g = L0.a.g(sparseArray.get(keyAt));
                    isText2 = g.isText();
                    if (isText2) {
                        A0.L l10 = (A0.L) c1034b.f16301b.f4510c.b(keyAt);
                        if (l10 != null && (v10 = l10.v()) != null) {
                            Object g2 = v10.f4494a.g(H0.h.g);
                            if (g2 == null) {
                                g2 = null;
                            }
                            H0.a aVar = (H0.a) g2;
                            if (aVar != null && (cVar = (Rb.c) aVar.f4461b) != null) {
                                textValue2 = g.getTextValue();
                            }
                        }
                    } else {
                        isDate2 = g.isDate();
                        if (isDate2) {
                            Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                        } else {
                            isList2 = g.isList();
                            if (isList2) {
                                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                            } else {
                                isToggle2 = g.isToggle();
                                if (isToggle2) {
                                    Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                                }
                            }
                        }
                    }
                }
            }
            q3.i iVar = this.f1605P;
            if (iVar != null) {
                d0.i iVar2 = (d0.i) iVar.f23383b;
                if (iVar2.f16309a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    int keyAt2 = sparseArray.keyAt(i10);
                    AutofillValue g10 = L0.a.g(sparseArray.get(keyAt2));
                    isText = g10.isText();
                    if (isText) {
                        textValue = g10.getTextValue();
                        textValue.toString();
                        if (iVar2.f16309a.get(Integer.valueOf(keyAt2)) != null) {
                            throw new ClassCastException();
                        }
                    } else {
                        isDate = g10.isDate();
                        if (isDate) {
                            throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        isList = g10.isList();
                        if (isList) {
                            throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        isToggle = g10.isToggle();
                        if (isToggle) {
                            throw new Error("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return this.f1582D.m(i7, this.f1614a, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i7) {
        return this.f1582D.m(i7, this.f1614a, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            m(getRoot());
        }
        t(true);
        AbstractC0688o.k().m();
        this.f1596K = true;
        j0.m mVar = this.f1644w;
        C1364b c1364b = mVar.f18547a;
        Canvas canvas2 = c1364b.f18529a;
        c1364b.f18529a = canvas;
        getRoot().j(c1364b, null);
        mVar.f18547a.f18529a = canvas2;
        ArrayList arrayList = this.f1592I;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((A0.s0) arrayList.get(i7)).g();
            }
        }
        if (f1.f1890H) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        arrayList.clear();
        this.f1596K = false;
        ArrayList arrayList2 = this.f1594J;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        getRectManager().a();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C2195a c2195a;
        int size;
        C0018g0 c0018g0;
        c0.l lVar;
        C0018g0 c0018g02;
        if (this.f1597K0) {
            S2 s22 = this.f1595J0;
            removeCallbacks(s22);
            if (motionEvent.getActionMasked() == 8) {
                this.f1597K0 = false;
            } else {
                s22.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (p(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.isFromSource(4194304)) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            Context context = getContext();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 26) {
                Method method = y1.L.f26648a;
                D0.d.d(viewConfiguration);
            } else {
                y1.L.a(viewConfiguration, context);
            }
            Context context2 = getContext();
            if (i7 >= 26) {
                D0.d.c(viewConfiguration);
            } else {
                y1.L.a(viewConfiguration, context2);
            }
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            InterfaceC1220g focusOwner = getFocusOwner();
            A0.K k = new A0.K(4, this, motionEvent);
            C1221h c1221h = (C1221h) focusOwner;
            if (c1221h.f17608e.f17602f) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            } else {
                C1229p g = AbstractC1217d.g(c1221h.f17607d);
                if (g != null) {
                    if (!g.f14113a.f14112B) {
                        AbstractC2256a.b("visitAncestors called on an unattached node");
                    }
                    c0.l lVar2 = g.f14113a;
                    A0.L t5 = AbstractC0017g.t(g);
                    loop0: while (true) {
                        if (t5 == null) {
                            lVar = null;
                            break;
                        }
                        if ((((c0.l) t5.f60S.f229f).f14116d & 16384) != 0) {
                            while (lVar2 != null) {
                                if ((lVar2.f14115c & 16384) != 0) {
                                    S.e eVar = null;
                                    lVar = lVar2;
                                    while (lVar != null) {
                                        if (lVar instanceof C2195a) {
                                            break loop0;
                                        }
                                        if ((lVar.f14115c & 16384) != 0 && (lVar instanceof AbstractC0025n)) {
                                            int i10 = 0;
                                            for (c0.l lVar3 = ((AbstractC0025n) lVar).f269D; lVar3 != null; lVar3 = lVar3.f14118f) {
                                                if ((lVar3.f14115c & 16384) != 0) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        lVar = lVar3;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new S.e(new c0.l[16]);
                                                        }
                                                        if (lVar != null) {
                                                            eVar.b(lVar);
                                                            lVar = null;
                                                        }
                                                        eVar.b(lVar3);
                                                    }
                                                }
                                            }
                                            if (i10 == 1) {
                                            }
                                        }
                                        lVar = AbstractC0017g.e(eVar);
                                    }
                                }
                                lVar2 = lVar2.f14117e;
                            }
                        }
                        t5 = t5.t();
                        lVar2 = (t5 == null || (c0018g02 = t5.f60S) == null) ? null : (A0.B0) c0018g02.f228e;
                    }
                    c2195a = (C2195a) lVar;
                } else {
                    c2195a = null;
                }
                if (c2195a != null) {
                    C2195a c2195a2 = c2195a;
                    if (!c2195a2.f14113a.f14112B) {
                        AbstractC2256a.b("visitAncestors called on an unattached node");
                    }
                    c0.l lVar4 = c2195a2.f14113a.f14117e;
                    A0.L t10 = AbstractC0017g.t(c2195a);
                    ArrayList arrayList = null;
                    while (t10 != null) {
                        if ((((c0.l) t10.f60S.f229f).f14116d & 16384) != 0) {
                            while (lVar4 != null) {
                                if ((lVar4.f14115c & 16384) != 0) {
                                    c0.l lVar5 = lVar4;
                                    S.e eVar2 = null;
                                    while (lVar5 != null) {
                                        if (lVar5 instanceof C2195a) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(lVar5);
                                        } else if ((lVar5.f14115c & 16384) != 0 && (lVar5 instanceof AbstractC0025n)) {
                                            int i11 = 0;
                                            for (c0.l lVar6 = ((AbstractC0025n) lVar5).f269D; lVar6 != null; lVar6 = lVar6.f14118f) {
                                                if ((lVar6.f14115c & 16384) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        lVar5 = lVar6;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new S.e(new c0.l[16]);
                                                        }
                                                        if (lVar5 != null) {
                                                            eVar2.b(lVar5);
                                                            lVar5 = null;
                                                        }
                                                        eVar2.b(lVar6);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                        lVar5 = AbstractC0017g.e(eVar2);
                                    }
                                }
                                lVar4 = lVar4.f14117e;
                            }
                        }
                        t10 = t10.t();
                        lVar4 = (t10 == null || (c0018g0 = t10.f60S) == null) ? null : (A0.B0) c0018g0.f228e;
                    }
                    if (arrayList != null && arrayList.size() - 1 >= 0) {
                        while (true) {
                            int i12 = size - 1;
                            ((C2195a) arrayList.get(size)).getClass();
                            if (i12 < 0) {
                                break;
                            }
                            size = i12;
                        }
                    }
                    c0.l lVar7 = c2195a2.f14113a;
                    S.e eVar3 = null;
                    while (lVar7 != null) {
                        if (lVar7 instanceof C2195a) {
                        } else if ((lVar7.f14115c & 16384) != 0 && (lVar7 instanceof AbstractC0025n)) {
                            int i13 = 0;
                            for (c0.l lVar8 = ((AbstractC0025n) lVar7).f269D; lVar8 != null; lVar8 = lVar8.f14118f) {
                                if ((lVar8.f14115c & 16384) != 0) {
                                    i13++;
                                    if (i13 == 1) {
                                        lVar7 = lVar8;
                                    } else {
                                        if (eVar3 == null) {
                                            eVar3 = new S.e(new c0.l[16]);
                                        }
                                        if (lVar7 != null) {
                                            eVar3.b(lVar7);
                                            lVar7 = null;
                                        }
                                        eVar3.b(lVar8);
                                    }
                                }
                            }
                            if (i13 == 1) {
                            }
                        }
                        lVar7 = AbstractC0017g.e(eVar3);
                    }
                    if (((Boolean) k.invoke()).booleanValue()) {
                        return true;
                    }
                    c0.l lVar9 = c2195a2.f14113a;
                    S.e eVar4 = null;
                    while (lVar9 != null) {
                        if (lVar9 instanceof C2195a) {
                        } else if ((lVar9.f14115c & 16384) != 0 && (lVar9 instanceof AbstractC0025n)) {
                            int i14 = 0;
                            for (c0.l lVar10 = ((AbstractC0025n) lVar9).f269D; lVar10 != null; lVar10 = lVar10.f14118f) {
                                if ((lVar10.f14115c & 16384) != 0) {
                                    i14++;
                                    if (i14 == 1) {
                                        lVar9 = lVar10;
                                    } else {
                                        if (eVar4 == null) {
                                            eVar4 = new S.e(new c0.l[16]);
                                        }
                                        if (lVar9 != null) {
                                            eVar4.b(lVar9);
                                            lVar9 = null;
                                        }
                                        eVar4.b(lVar10);
                                    }
                                }
                            }
                            if (i14 == 1) {
                            }
                        }
                        lVar9 = AbstractC0017g.e(eVar4);
                    }
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            r rVar = ((C2195a) arrayList.get(i15)).f25638C;
                        }
                    }
                }
            }
        } else if ((l(motionEvent) & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i7;
        int i10;
        boolean z8 = this.f1597K0;
        S2 s22 = this.f1595J0;
        if (z8) {
            removeCallbacks(s22);
            s22.run();
        }
        if (p(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        L l10 = this.f1582D;
        AccessibilityManager accessibilityManager = l10.g;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            D d10 = l10.f1728d;
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y10 = motionEvent.getY();
                d10.t(true);
                C0029s c0029s = new C0029s();
                long floatToRawIntBits = (Float.floatToRawIntBits(x2) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L);
                C0018g0 c0018g0 = d10.getRoot().f60S;
                A0.n0 n0Var = (A0.n0) c0018g0.f227d;
                j0.B b2 = A0.n0.f270U;
                ((A0.n0) c0018g0.f227d).y0(A0.n0.f273X, n0Var.p0(floatToRawIntBits), c0029s, 1, true);
                for (int s3 = y7.u0.s(c0029s); -1 < s3; s3--) {
                    Object e2 = c0029s.f306a.e(s3);
                    kotlin.jvm.internal.l.c(e2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                    A0.L t5 = AbstractC0017g.t((c0.l) e2);
                    if (d10.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(t5) != null) {
                        break;
                    }
                    if (t5.f60S.d(8)) {
                        int z10 = l10.z(t5.f70b);
                        H0.n e10 = y7.u0.e(t5, false);
                        if (X.j(e10)) {
                            if (!e10.i().f4494a.c(H0.q.f4559x)) {
                                i10 = z10;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i10 = Integer.MIN_VALUE;
                d10.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                int i11 = l10.f1729e;
                if (i11 != i10) {
                    l10.f1729e = i10;
                    L.D(l10, i10, 128, null, 12);
                    L.D(l10, i11, 256, null, 12);
                }
            } else if (action == 10) {
                int i12 = l10.f1729e;
                if (i12 == Integer.MIN_VALUE) {
                    d10.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                } else if (i12 != Integer.MIN_VALUE) {
                    l10.f1729e = Integer.MIN_VALUE;
                    L.D(l10, Integer.MIN_VALUE, 128, null, 12);
                    L.D(l10, i12, 256, null, 12);
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            i7 = 1;
            if (!r(motionEvent)) {
                return false;
            }
        } else {
            if (actionMasked == 10 && q(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f1585E0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f1585E0 = MotionEvent.obtainNoHistory(motionEvent);
                this.f1597K0 = true;
                postDelayed(s22, 8L);
                return false;
            }
            i7 = 1;
        }
        if ((l(motionEvent) & i7) != 0) {
            return i7;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((C1221h) getFocusOwner()).c(keyEvent, new A0.K(3, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f1642v.getClass();
        j1.f1923a.setValue(new C2087q(metaState));
        return ((C1221h) getFocusOwner()).c(keyEvent, C1219f.f17603a) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0018g0 c0018g0;
        if (isFocused()) {
            C1221h c1221h = (C1221h) getFocusOwner();
            if (c1221h.f17608e.f17602f) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                C1229p g = AbstractC1217d.g(c1221h.f17607d);
                if (g != null) {
                    if (!g.f14113a.f14112B) {
                        AbstractC2256a.b("visitAncestors called on an unattached node");
                    }
                    c0.l lVar = g.f14113a;
                    A0.L t5 = AbstractC0017g.t(g);
                    while (t5 != null) {
                        if ((((c0.l) t5.f60S.f229f).f14116d & 131072) != 0) {
                            while (lVar != null) {
                                if ((lVar.f14115c & 131072) != 0) {
                                    c0.l lVar2 = lVar;
                                    S.e eVar = null;
                                    while (lVar2 != null) {
                                        if ((lVar2.f14115c & 131072) != 0 && (lVar2 instanceof AbstractC0025n)) {
                                            int i7 = 0;
                                            for (c0.l lVar3 = ((AbstractC0025n) lVar2).f269D; lVar3 != null; lVar3 = lVar3.f14118f) {
                                                if ((lVar3.f14115c & 131072) != 0) {
                                                    i7++;
                                                    if (i7 == 1) {
                                                        lVar2 = lVar3;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new S.e(new c0.l[16]);
                                                        }
                                                        if (lVar2 != null) {
                                                            eVar.b(lVar2);
                                                            lVar2 = null;
                                                        }
                                                        eVar.b(lVar3);
                                                    }
                                                }
                                            }
                                            if (i7 == 1) {
                                            }
                                        }
                                        lVar2 = AbstractC0017g.e(eVar);
                                    }
                                }
                                lVar = lVar.f14117e;
                            }
                        }
                        t5 = t5.t();
                        lVar = (t5 == null || (c0018g0 = t5.f60S) == null) ? null : (A0.B0) c0018g0.f228e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            Q.f1777a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f1597K0) {
            S2 s22 = this.f1595J0;
            removeCallbacks(s22);
            MotionEvent motionEvent2 = this.f1585E0;
            kotlin.jvm.internal.l.b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f1597K0 = false;
            } else {
                s22.run();
            }
        }
        if (p(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !r(motionEvent)) {
            return false;
        }
        int l10 = l(motionEvent);
        if ((l10 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (l10 & 1) != 0;
    }

    public final View findViewByAccessibilityIdTraversal(int i7) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i7));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = j(this, i7);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (h0.AbstractC1217d.p(h0.AbstractC1217d.j((h0.C1229p) r8), h0.AbstractC1217d.d(r0, r7), r1, r2) != false) goto L27;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i7) {
        i0.c d10;
        if (view == null || this.f1621d0.f159c) {
            return super.focusSearch(view, i7);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i7);
        if (view == this) {
            C1229p g = AbstractC1217d.g(((C1221h) getFocusOwner()).f17607d);
            d10 = g != null ? AbstractC1217d.j(g) : null;
            if (d10 == null) {
                d10 = AbstractC1217d.d(view, this);
            }
        } else {
            d10 = AbstractC1217d.d(view, this);
        }
        C1216c E10 = AbstractC1217d.E(i7);
        int i10 = E10 != null ? E10.f17595a : 6;
        ?? obj = new Object();
        if (((C1221h) getFocusOwner()).d(i10, d10, new C0210x(obj, 0)) == null) {
            return view;
        }
        if (obj.f19134a != null) {
            if (findNextFocus != null) {
                if (C1216c.a(i10, 1) ? true : C1216c.a(i10, 2)) {
                    return super.focusSearch(view, i7);
                }
                Object obj2 = obj.f19134a;
                kotlin.jvm.internal.l.b(obj2);
            }
            return this;
        }
        if (findNextFocus == null) {
            return view;
        }
        return findNextFocus;
    }

    public C0181i getAccessibilityManager() {
        return this.f1586F;
    }

    public final C0192n0 getAndroidViewsHandler$ui_release() {
        if (this.f1613W == null) {
            C0192n0 c0192n0 = new C0192n0(getContext());
            this.f1613W = c0192n0;
            addView(c0192n0, -1);
            requestLayout();
        }
        C0192n0 c0192n02 = this.f1613W;
        kotlin.jvm.internal.l.b(c0192n02);
        return c0192n02;
    }

    public InterfaceC1037e getAutofill() {
        return this.f1605P;
    }

    public d0.h getAutofillManager() {
        return this.f1607Q;
    }

    public d0.i getAutofillTree() {
        return this.f1590H;
    }

    /* renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public C0183j m2getClipboard() {
        return this.f1610T;
    }

    /* renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public C0185k m3getClipboardManager() {
        return this.f1609S;
    }

    public final Rb.c getConfigurationChangeObserver() {
        return this.f1603O;
    }

    public final e0.c getContentCaptureManager$ui_release() {
        return this.f1584E;
    }

    public Hb.i getCoroutineContext() {
        return this.f1624f;
    }

    public V0.c getDensity() {
        return (V0.c) this.f1620d.getValue();
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public ViewOnDragListenerC1126a m4getDragAndDropManager() {
        return this.f1640u;
    }

    public InterfaceC1220g getFocusOwner() {
        return this.f1622e;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        i0.c x2 = x();
        if (x2 != null) {
            rect.left = Math.round(x2.f18174a);
            rect.top = Math.round(x2.f18175b);
            rect.right = Math.round(x2.f18176c);
            rect.bottom = Math.round(x2.f18177d);
            return;
        }
        if (kotlin.jvm.internal.l.a(((C1221h) getFocusOwner()).d(6, null, r.f1961c), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public N0.d getFontFamilyResolver() {
        return (N0.d) this.f1647x0.getValue();
    }

    public N0.c getFontLoader() {
        return this.f1645w0;
    }

    public j0.s getGraphicsContext() {
        return this.f1588G;
    }

    public InterfaceC1873a getHapticFeedBack() {
        return this.f1578A0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f1621d0.f158b.p();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public InterfaceC1912b getInputModeManager() {
        return this.f1580B0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f1628i0;
    }

    @Override // android.view.View, android.view.ViewParent
    public V0.l getLayoutDirection() {
        return (V0.l) this.f1651z0.getValue();
    }

    public C2070x getLayoutNodes() {
        return this.f1650z;
    }

    public long getMeasureIteration() {
        C0006a0 c0006a0 = this.f1621d0;
        if (!c0006a0.f159c) {
            AbstractC2256a.a("measureIteration should be only used during the measure/layout pass");
        }
        return c0006a0.g;
    }

    public C2580b getModifierLocalManager() {
        return this.C0;
    }

    public AbstractC2322G getPlacementScope() {
        int i7 = AbstractC2325J.f26563b;
        return new y0.x(this, 1);
    }

    public InterfaceC2079i getPointerIconService() {
        return this.f1606P0;
    }

    public I0.a getRectManager() {
        return this.f1577A;
    }

    public A0.L getRoot() {
        return this.f1648y;
    }

    public A0.z0 getRootForTest() {
        return this.f1579B;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        C1191j c1191j;
        if (Build.VERSION.SDK_INT < 31 || (c1191j = this.f1604O0) == null) {
            return false;
        }
        return ((Boolean) ((C0487e0) c1191j.f17441b).getValue()).booleanValue();
    }

    public H0.o getSemanticsOwner() {
        return this.f1581C;
    }

    public A0.N getSharedDrawScope() {
        return this.f1618c;
    }

    public boolean getShowLayoutBounds() {
        return this.f1612V;
    }

    public A0.v0 getSnapshotObserver() {
        return this.f1611U;
    }

    public Y0 getSoftwareKeyboardController() {
        return this.f1643v0;
    }

    public O0.d getTextInputService() {
        return this.f1639t0;
    }

    public Z0 getTextToolbar() {
        return this.f1583D0;
    }

    public View getView() {
        return this;
    }

    public e1 getViewConfiguration() {
        return this.f1646x;
    }

    public final C0195p getViewTreeOwners() {
        return (C0195p) this.f1633n0.getValue();
    }

    public i1 getWindowInfo() {
        return this.f1642v;
    }

    public final C1034b get_autofillManager$ui_release() {
        return this.f1607Q;
    }

    public final void k(A0.L l10, boolean z8) {
        this.f1621d0.f(l10, z8);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:12:0x0034, B:14:0x003e, B:19:0x004e, B:22:0x0077, B:24:0x007b, B:25:0x0055, B:31:0x0061, B:34:0x0069, B:36:0x008d, B:44:0x00a0, B:46:0x00a6, B:48:0x00ba, B:49:0x00bd, B:51:0x00c1, B:53:0x00c7, B:55:0x00cb, B:56:0x00d1, B:59:0x00d9, B:62:0x00e1, B:63:0x00ed, B:65:0x00f3, B:67:0x00f9, B:69:0x00ff, B:70:0x0105, B:72:0x0109, B:73:0x010d, B:78:0x0120, B:80:0x0124, B:81:0x012b, B:87:0x013c, B:88:0x0146, B:90:0x014e, B:91:0x0151, B:97:0x015a), top: B:4:0x0018, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(MotionEvent motionEvent) {
        int i7;
        boolean z8;
        int actionMasked;
        removeCallbacks(this.f1593I0);
        try {
            D(motionEvent);
            this.f1629j0 = true;
            t(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f1585E0;
                boolean z10 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                E.u uVar = this.f1601N;
                if (motionEvent2 != null) {
                    if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                        z8 = false;
                        if (z8) {
                            if (motionEvent2.getButtonState() == 0 && (actionMasked = motionEvent2.getActionMasked()) != 0 && actionMasked != 2 && actionMasked != 6) {
                                if (motionEvent2.getActionMasked() != 10 && z10) {
                                    I(motionEvent2, 10, motionEvent2.getEventTime(), true);
                                }
                            }
                            if (!uVar.f3498a) {
                                ((u.r) ((C1358d) uVar.f3501d).f18487b).a();
                                ((I0) uVar.f3500c).e();
                            }
                        }
                    }
                    z8 = true;
                    if (z8) {
                    }
                }
                boolean z11 = motionEvent.getToolType(0) == 3;
                if (z10 || !z11 || actionMasked2 == 3 || actionMasked2 == 9 || !q(motionEvent)) {
                    i7 = 9;
                } else {
                    i7 = 9;
                    I(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.f1585E0;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.f1585E0;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    C2072b c2072b = this.f1599M;
                    if (action == i7 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            c2072b.f24742c.delete(pointerId);
                            c2072b.f24741b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.f1585E0;
                        float x2 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.f1585E0;
                        boolean z12 = (x2 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.f1585E0;
                        boolean z13 = (motionEvent7 != null ? motionEvent7.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z12 || z13) {
                            if (pointerId >= 0) {
                                c2072b.f24742c.delete(pointerId);
                                c2072b.f24741b.delete(pointerId);
                            }
                            I0 i02 = (I0) uVar.f3500c;
                            if (i02.f1695c) {
                                i02.f1695c = true;
                            } else {
                                ((C2074d) i02.g).f24752a.g();
                            }
                        }
                    }
                }
                this.f1585E0 = MotionEvent.obtainNoHistory(motionEvent);
                return H(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.f1629j0 = false;
        }
    }

    @Override // l2.InterfaceC1462f
    public final void n(InterfaceC1479x interfaceC1479x) {
        setShowLayoutBounds(F0.a());
    }

    public final void o(A0.L l10) {
        this.f1621d0.p(l10, false);
        S.e x2 = l10.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            o((A0.L) objArr[i10]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C1481z w10;
        InterfaceC1479x interfaceC1479x;
        q3.i iVar;
        super.onAttachedToWindow();
        Boolean valueOf = Boolean.valueOf(hasWindowFocus());
        D5.i iVar2 = this.f1642v;
        ((C0487e0) iVar2.f3256b).setValue(valueOf);
        iVar2.getClass();
        o(getRoot());
        m(getRoot());
        getSnapshotObserver().f314a.d();
        if (g() && (iVar = this.f1605P) != null) {
            d0.g gVar = d0.g.f16308a;
            gVar.getClass();
            ((AutofillManager) iVar.f23384c).registerCallback(gVar);
        }
        InterfaceC1479x d10 = l2.Q.d(this);
        Q2.e n6 = android.support.v4.media.session.b.n(this);
        C0195p viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (d10 != null && n6 != null && (d10 != (interfaceC1479x = viewTreeOwners.f1943a) || n6 != interfaceC1479x))) {
            if (d10 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (n6 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (w10 = viewTreeOwners.f1943a.w()) != null) {
                w10.f(this);
            }
            d10.w().a(this);
            C0195p c0195p = new C0195p(d10, n6);
            set_viewTreeOwners(c0195p);
            Rb.c cVar = this.f1634o0;
            if (cVar != null) {
                cVar.invoke(c0195p);
            }
            this.f1634o0 = null;
        }
        int i7 = isInTouchMode() ? 1 : 2;
        C1913c c1913c = this.f1580B0;
        c1913c.getClass();
        c1913c.f23645a.setValue(new C1911a(i7));
        C0195p viewTreeOwners2 = getViewTreeOwners();
        C1481z w11 = viewTreeOwners2 != null ? viewTreeOwners2.f1943a.w() : null;
        if (w11 == null) {
            throw X.c.c("No lifecycle owner exists");
        }
        w11.a(this);
        w11.a(this.f1584E);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f1635p0);
        getViewTreeObserver().addOnScrollChangedListener(this.f1636q0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f1637r0);
        if (Build.VERSION.SDK_INT >= 31) {
            V.f1797a.b(this);
        }
        C1034b c1034b = this.f1607Q;
        if (c1034b != null) {
            ((C1221h) getFocusOwner()).f17611i.a(c1034b);
            getSemanticsOwner().f4511d.a(c1034b);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.f1641u0.get() != null) {
            throw new ClassCastException();
        }
        this.f1638s0.getClass();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(Q5.e.b(getContext()));
        this.f1642v.getClass();
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f1649y0) {
            this.f1649y0 = i7 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(AbstractC0672a.f(getContext()));
        }
        this.f1603O.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f1641u0.get() != null) {
            throw new ClassCastException();
        }
        this.f1638s0.getClass();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        H0.n nVar;
        AutofillId autofillId;
        String a9;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        e0.c cVar = this.f1584E;
        cVar.getClass();
        for (long j : jArr) {
            X0 x02 = (X0) cVar.c().b((int) j);
            if (x02 != null && (nVar = x02.f1809a) != null) {
                AbstractC0187l.q();
                autofillId = cVar.f16644a.getAutofillId();
                ViewTranslationRequest.Builder l10 = AbstractC0187l.l(autofillId, nVar.g);
                Object g = nVar.f4505d.f4494a.g(H0.q.f4560y);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
                if (list != null && (a9 = X0.a.a("\n", 62, list)) != null) {
                    forText = TranslationRequestValue.forText(new C0374d(a9));
                    l10.setValue("android:text", forText);
                    build = l10.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        q3.i iVar;
        super.onDetachedFromWindow();
        A0.v0 snapshotObserver = getSnapshotObserver();
        Q9.a aVar = snapshotObserver.f314a.f12432h;
        if (aVar != null) {
            aVar.c();
        }
        C0694u c0694u = snapshotObserver.f314a;
        synchronized (c0694u.g) {
            S.e eVar = c0694u.f12431f;
            Object[] objArr = eVar.f8959a;
            int i7 = eVar.f8961c;
            for (int i10 = 0; i10 < i7; i10++) {
                C0693t c0693t = (C0693t) objArr[i10];
                c0693t.f12421e.a();
                c0693t.f12422f.a();
                c0693t.k.a();
                c0693t.f12425l.clear();
            }
        }
        this.f1642v.getClass();
        C0195p viewTreeOwners = getViewTreeOwners();
        C1481z w10 = viewTreeOwners != null ? viewTreeOwners.f1943a.w() : null;
        if (w10 == null) {
            throw X.c.c("No lifecycle owner exists");
        }
        w10.f(this.f1584E);
        w10.f(this);
        if (g() && (iVar = this.f1605P) != null) {
            d0.g gVar = d0.g.f16308a;
            gVar.getClass();
            ((AutofillManager) iVar.f23384c).unregisterCallback(gVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f1635p0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f1636q0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f1637r0);
        if (Build.VERSION.SDK_INT >= 31) {
            V.f1797a.a(this);
        }
        C1034b c1034b = this.f1607Q;
        if (c1034b != null) {
            C2042E c2042e = getSemanticsOwner().f4511d;
            int f4 = c2042e.f(c1034b);
            if (f4 >= 0) {
                c2042e.i(f4);
            }
            C2042E c2042e2 = ((C1221h) getFocusOwner()).f17611i;
            int f10 = c2042e2.f(c1034b);
            if (f10 >= 0) {
                c2042e2.i(f10);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z8, int i7, Rect rect) {
        super.onFocusChanged(z8, i7, rect);
        if (z8 || hasFocus()) {
            return;
        }
        AbstractC1217d.e(((C1221h) getFocusOwner()).f17607d, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        this.f1628i0 = 0L;
        this.f1621d0.j(this.f1598L0);
        this.f1617b0 = null;
        J();
        if (this.f1613W != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i11 - i7, i12 - i10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        C0006a0 c0006a0 = this.f1621d0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                o(getRoot());
            }
            long i11 = i(i7);
            long i12 = i(i10);
            long k = Tb.a.k((int) (i11 >>> 32), (int) (i11 & 4294967295L), (int) (i12 >>> 32), (int) (4294967295L & i12));
            V0.a aVar = this.f1617b0;
            if (aVar == null) {
                this.f1617b0 = new V0.a(k);
                this.f1619c0 = false;
            } else if (!V0.a.b(aVar.f9967a, k)) {
                this.f1619c0 = true;
            }
            c0006a0.q(k);
            c0006a0.l();
            setMeasuredDimension(getRoot().f61T.f105p.f26554a, getRoot().f61T.f105p.f26555b);
            if (this.f1613W != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f61T.f105p.f26554a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f61T.f105p.f26555b, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i7) {
        if (!g() || viewStructure == null) {
            return;
        }
        C1034b c1034b = this.f1607Q;
        if (c1034b != null) {
            A0.L l10 = c1034b.f16301b.f4508a;
            AutofillId autofillId = c1034b.f16305f;
            String str = c1034b.f16304e;
            I0.a aVar = c1034b.f16303d;
            tc.b.F(viewStructure, l10, autofillId, str, aVar);
            Object[] objArr = u.O.f24630a;
            C2042E c2042e = new C2042E(2);
            c2042e.a(l10);
            c2042e.a(viewStructure);
            while (c2042e.h()) {
                Object i10 = c2042e.i(c2042e.f24585b - 1);
                kotlin.jvm.internal.l.c(i10, "null cannot be cast to non-null type android.view.ViewStructure");
                ViewStructure viewStructure2 = (ViewStructure) i10;
                Object i11 = c2042e.i(c2042e.f24585b - 1);
                kotlin.jvm.internal.l.c(i11, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                S.b bVar = (S.b) ((A0.L) i11).n();
                int i12 = bVar.f8953a.f8961c;
                for (int i13 = 0; i13 < i12; i13++) {
                    A0.L l11 = (A0.L) bVar.get(i13);
                    if (!l11.f73c0 && l11.F() && l11.G()) {
                        H0.i v10 = l11.v();
                        if (v10 != null) {
                            H0.t tVar = H0.h.g;
                            C2046I c2046i = v10.f4494a;
                            if (c2046i.b(tVar) || c2046i.b(H0.q.f4551p) || c2046i.b(H0.q.f4552q)) {
                                ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                tc.b.F(newChild, l11, c1034b.f16305f, str, aVar);
                                c2042e.a(l11);
                                c2042e.a(newChild);
                            }
                        }
                        c2042e.a(l11);
                        c2042e.a(viewStructure2);
                    }
                }
            }
        }
        q3.i iVar = this.f1605P;
        if (iVar != null) {
            d0.i iVar2 = (d0.i) iVar.f23383b;
            if (iVar2.f16309a.isEmpty()) {
                return;
            }
            LinkedHashMap linkedHashMap = iVar2.f16309a;
            int addChildCount = viewStructure.addChildCount(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int intValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                newChild2.setAutofillId((AutofillId) iVar.f23385d, intValue);
                newChild2.setId(intValue, ((D) iVar.f23382a).getContext().getPackageName(), null, null);
                newChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i7) {
        int toolType = motionEvent.getToolType(i7);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i7);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        if (this.f1616b) {
            V0.l lVar = i7 != 0 ? i7 != 1 ? null : V0.l.f9983b : V0.l.f9982a;
            if (lVar == null) {
                lVar = V0.l.f9982a;
            }
            setLayoutDirection(lVar);
        }
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.jvm.internal.a, G0.k] */
    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C1191j c1191j;
        int i7 = 2;
        if (Build.VERSION.SDK_INT < 31 || (c1191j = this.f1604O0) == null) {
            return;
        }
        H0.o semanticsOwner = getSemanticsOwner();
        Hb.i coroutineContext = getCoroutineContext();
        S.e eVar = new S.e(new G0.l[16]);
        AbstractC0672a.x(semanticsOwner.a(), 0, new kotlin.jvm.internal.a(1, 8, S.e.class, eVar, "add", "add(Ljava/lang/Object;)Z"));
        eVar.o(new M(new Rb.c[]{G0.d.f4255c, G0.d.f4256d}, i7));
        int i10 = eVar.f8961c;
        G0.l lVar = (G0.l) (i10 == 0 ? null : eVar.f8959a[i10 - 1]);
        if (lVar == null) {
            return;
        }
        C1277e b2 = cc.F.b(coroutineContext);
        H0.n nVar = lVar.f4276a;
        V0.j jVar = lVar.f4278c;
        G0.f fVar = new G0.f(nVar, jVar, b2, c1191j, this);
        A0.n0 n0Var = lVar.f4279d;
        i0.c x2 = AbstractC2328M.g(n0Var).x(n0Var, true);
        long j = (jVar.f9977a << 32) | (jVar.f9978b & 4294967295L);
        ScrollCaptureTarget h10 = AbstractC0187l.h(this, new Rect(Math.round(x2.f18174a), Math.round(x2.f18175b), Math.round(x2.f18176c), Math.round(x2.f18177d)), new Point((int) (j >> 32), (int) (j & 4294967295L)), fVar);
        h10.setScrollBounds(AbstractC1362A.x(jVar));
        consumer.accept(h10);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        e0.c cVar = this.f1584E;
        cVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (kotlin.jvm.internal.l.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            y7.u0.n(cVar, longSparseArray);
        } else {
            cVar.f16644a.post(new Aa.j(13, cVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z8) {
        boolean a9;
        ((C0487e0) this.f1642v.f3256b).setValue(Boolean.valueOf(z8));
        this.f1602N0 = true;
        super.onWindowFocusChanged(z8);
        if (!z8 || getShowLayoutBounds() == (a9 = F0.a())) {
            return;
        }
        setShowLayoutBounds(a9);
        m(getRoot());
    }

    public final boolean q(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x2 && x2 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    public final boolean r(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f1585E0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int ordinal = ((C1221h) getFocusOwner()).f17607d.r0().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return super.requestFocus(i7, rect);
        }
        if (ordinal != 3) {
            throw new Db.d(1);
        }
        C1216c E10 = AbstractC1217d.E(i7);
        int i10 = E10 != null ? E10.f17595a : 7;
        return kotlin.jvm.internal.l.a(((C1221h) getFocusOwner()).d(i10, rect != null ? new i0.c(rect.left, rect.top, rect.right, rect.bottom) : null, new A(i10)), Boolean.TRUE);
    }

    public final long s(long j) {
        C();
        long s3 = AbstractC1362A.s(j, this.f1626g0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f1630k0 >> 32)) + Float.intBitsToFloat((int) (s3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f1630k0 & 4294967295L)) + Float.intBitsToFloat((int) (s3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.f1582D.f1731h = j;
    }

    public final void setConfigurationChangeObserver(Rb.c cVar) {
        this.f1603O = cVar;
    }

    public final void setContentCaptureManager$ui_release(e0.c cVar) {
        this.f1584E = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [S.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public void setCoroutineContext(Hb.i iVar) {
        this.f1624f = iVar;
        c0.l lVar = (c0.l) getRoot().f60S.f229f;
        if (lVar instanceof u0.y) {
            ((u0.y) lVar).q0();
        }
        if (!lVar.f14113a.f14112B) {
            AbstractC2256a.b("visitSubtreeIf called on an unattached node");
        }
        S.e eVar = new S.e(new c0.l[16]);
        c0.l lVar2 = lVar.f14113a;
        c0.l lVar3 = lVar2.f14118f;
        if (lVar3 == null) {
            AbstractC0017g.b(eVar, lVar2);
        } else {
            eVar.b(lVar3);
        }
        while (true) {
            int i7 = eVar.f8961c;
            if (i7 == 0) {
                return;
            }
            c0.l lVar4 = (c0.l) eVar.l(i7 - 1);
            if ((lVar4.f14116d & 16) != 0) {
                for (c0.l lVar5 = lVar4; lVar5 != null; lVar5 = lVar5.f14118f) {
                    if ((lVar5.f14115c & 16) != 0) {
                        AbstractC0025n abstractC0025n = lVar5;
                        ?? r52 = 0;
                        while (abstractC0025n != 0) {
                            if (abstractC0025n instanceof A0.y0) {
                                A0.y0 y0Var = (A0.y0) abstractC0025n;
                                if (y0Var instanceof u0.y) {
                                    ((u0.y) y0Var).q0();
                                }
                            } else if ((abstractC0025n.f14115c & 16) != 0 && (abstractC0025n instanceof AbstractC0025n)) {
                                c0.l lVar6 = abstractC0025n.f269D;
                                int i10 = 0;
                                abstractC0025n = abstractC0025n;
                                r52 = r52;
                                while (lVar6 != null) {
                                    if ((lVar6.f14115c & 16) != 0) {
                                        i10++;
                                        r52 = r52;
                                        if (i10 == 1) {
                                            abstractC0025n = lVar6;
                                        } else {
                                            if (r52 == 0) {
                                                r52 = new S.e(new c0.l[16]);
                                            }
                                            if (abstractC0025n != 0) {
                                                r52.b(abstractC0025n);
                                                abstractC0025n = 0;
                                            }
                                            r52.b(lVar6);
                                        }
                                    }
                                    lVar6 = lVar6.f14118f;
                                    abstractC0025n = abstractC0025n;
                                    r52 = r52;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC0025n = AbstractC0017g.e(r52);
                        }
                    }
                }
            }
            AbstractC0017g.b(eVar, lVar4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.f1628i0 = j;
    }

    public final void setOnViewTreeOwnersAvailable(Rb.c cVar) {
        C0195p viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f1634o0 = cVar;
    }

    public void setShowLayoutBounds(boolean z8) {
        this.f1612V = z8;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(boolean z8) {
        B b2;
        C0006a0 c0006a0 = this.f1621d0;
        if (c0006a0.f158b.p() || ((S.e) c0006a0.f161e.f23391b).f8961c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z8) {
                try {
                    b2 = this.f1598L0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                b2 = null;
            }
            if (c0006a0.j(b2)) {
                requestLayout();
            }
            c0006a0.a(false);
            if (this.L) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.L = false;
            }
            Trace.endSection();
        }
    }

    public final void u(A0.L l10, long j) {
        C0006a0 c0006a0 = this.f1621d0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c0006a0.k(l10, j);
            if (!c0006a0.f158b.p()) {
                c0006a0.a(false);
                if (this.L) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.L = false;
                }
            }
            getRectManager().a();
        } finally {
            Trace.endSection();
        }
    }

    public final void v(A0.s0 s0Var, boolean z8) {
        ArrayList arrayList = this.f1592I;
        if (!z8) {
            if (this.f1596K) {
                return;
            }
            arrayList.remove(s0Var);
            ArrayList arrayList2 = this.f1594J;
            if (arrayList2 != null) {
                arrayList2.remove(s0Var);
                return;
            }
            return;
        }
        if (!this.f1596K) {
            arrayList.add(s0Var);
            return;
        }
        ArrayList arrayList3 = this.f1594J;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f1594J = arrayList3;
        }
        arrayList3.add(s0Var);
    }

    public final void w() {
        C1034b c1034b;
        if (this.f1608R) {
            C0694u c0694u = getSnapshotObserver().f314a;
            synchronized (c0694u.g) {
                try {
                    S.e eVar = c0694u.f12431f;
                    int i7 = eVar.f8961c;
                    int i10 = 0;
                    for (int i11 = 0; i11 < i7; i11++) {
                        C0693t c0693t = (C0693t) eVar.f8959a[i11];
                        c0693t.e();
                        if (!(c0693t.f12422f.f24607e != 0)) {
                            i10++;
                        } else if (i10 > 0) {
                            Object[] objArr = eVar.f8959a;
                            objArr[i11 - i10] = objArr[i11];
                        }
                    }
                    int i12 = i7 - i10;
                    Arrays.fill(eVar.f8959a, i12, i7, (Object) null);
                    eVar.f8961c = i12;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f1608R = false;
        }
        C0192n0 c0192n0 = this.f1613W;
        if (c0192n0 != null) {
            h(c0192n0);
        }
        if (g() && (c1034b = this.f1607Q) != null) {
            u.y yVar = c1034b.g;
            if (yVar.f24733d == 0 && c1034b.f16306h) {
                ((AutofillManager) c1034b.f16300a.f8927b).commit();
                c1034b.f16306h = false;
            }
            if (yVar.f24733d != 0) {
                c1034b.f16306h = true;
            }
        }
        while (this.f1591H0.h() && this.f1591H0.e(0) != null) {
            int i13 = this.f1591H0.f24585b;
            for (int i14 = 0; i14 < i13; i14++) {
                Rb.a aVar = (Rb.a) this.f1591H0.e(i14);
                C2042E c2042e = this.f1591H0;
                if (i14 < 0 || i14 >= c2042e.f24585b) {
                    c2042e.l(i14);
                    throw null;
                }
                Object[] objArr2 = c2042e.f24584a;
                Object obj = objArr2[i14];
                objArr2[i14] = null;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.f1591H0.j(0, i13);
        }
    }

    public final i0.c x() {
        if (isFocused()) {
            C1229p g = AbstractC1217d.g(((C1221h) getFocusOwner()).f17607d);
            if (g != null) {
                return AbstractC1217d.j(g);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return AbstractC1217d.d(findFocus, this);
        }
        return null;
    }

    public final void y(A0.L l10) {
        L l11 = this.f1582D;
        l11.f1714A = true;
        if (l11.u()) {
            l11.v(l10);
        }
        e0.c cVar = this.f1584E;
        cVar.f16650u = true;
        if (cVar.d()) {
            cVar.f16651v.h(Db.q.f3365a);
        }
    }

    public final void z(A0.L l10, boolean z8, boolean z10, boolean z11) {
        A0.L t5;
        A0.L t10;
        A0.Y y10;
        A0.M m10;
        C0006a0 c0006a0 = this.f1621d0;
        if (!z8) {
            if (c0006a0.p(l10, z10) && z11) {
                F(l10);
                return;
            }
            return;
        }
        c0006a0.getClass();
        if (l10.f78v == null) {
            AbstractC2256a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        A0.P p10 = l10.f61T;
        int ordinal = p10.f96d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    throw new Db.d(1);
                }
                if (!p10.f97e || z10) {
                    p10.f97e = true;
                    p10.f105p.f176H = true;
                    if (l10.f73c0) {
                        return;
                    }
                    boolean a9 = kotlin.jvm.internal.l.a(l10.H(), Boolean.TRUE);
                    q3.c cVar = c0006a0.f158b;
                    if ((a9 || (p10.f97e && (l10.s() == A0.H.f30a || !((y10 = p10.f106q) == null || (m10 = y10.f138E) == null || !m10.e())))) && ((t5 = l10.t()) == null || !t5.f61T.f97e)) {
                        cVar.e(l10, true);
                    } else if ((l10.G() || C0006a0.h(l10)) && ((t10 = l10.t()) == null || !t10.q())) {
                        cVar.e(l10, false);
                    }
                    if (c0006a0.f160d || !z11) {
                        return;
                    }
                    F(l10);
                    return;
                }
                return;
            }
        }
        c0006a0.f163h.b(new A0.Z(l10, true, z10));
    }
}
