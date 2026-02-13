package i;

import P4.C0463k;
import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import ea.C1108c;
import h.AbstractC1213a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C1527i;
import m.C1528j;
import o.InterfaceC1726c;
import o.InterfaceC1731e0;
import o.U0;
import y1.AbstractC2352B;
import y1.AbstractC2377z;
import y1.K;
import y1.S;

/* loaded from: classes.dex */
public final class G extends Q5.e implements InterfaceC1726c {

    /* renamed from: B, reason: collision with root package name */
    public static final AccelerateInterpolator f18001B = new AccelerateInterpolator();

    /* renamed from: C, reason: collision with root package name */
    public static final DecelerateInterpolator f18002C = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public final C0463k f18003A;

    /* renamed from: d, reason: collision with root package name */
    public Context f18004d;

    /* renamed from: e, reason: collision with root package name */
    public Context f18005e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarOverlayLayout f18006f;
    public ActionBarContainer g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1731e0 f18007h;

    /* renamed from: i, reason: collision with root package name */
    public ActionBarContextView f18008i;
    public final View j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public F f18009l;

    /* renamed from: m, reason: collision with root package name */
    public F f18010m;

    /* renamed from: n, reason: collision with root package name */
    public C1108c f18011n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18012o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f18013p;

    /* renamed from: q, reason: collision with root package name */
    public int f18014q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18015r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f18016s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18017t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f18018u;

    /* renamed from: v, reason: collision with root package name */
    public C1528j f18019v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18020w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f18021x;

    /* renamed from: y, reason: collision with root package name */
    public final E f18022y;

    /* renamed from: z, reason: collision with root package name */
    public final E f18023z;

    public G(Activity activity, boolean z8) {
        new ArrayList();
        this.f18013p = new ArrayList();
        this.f18014q = 0;
        this.f18015r = true;
        this.f18018u = true;
        this.f18022y = new E(this, 0);
        this.f18023z = new E(this, 1);
        this.f18003A = new C0463k(this, 28);
        View decorView = activity.getWindow().getDecorView();
        Y(decorView);
        if (z8) {
            return;
        }
        this.j = decorView.findViewById(R.id.content);
    }

    public G(Dialog dialog) {
        new ArrayList();
        this.f18013p = new ArrayList();
        this.f18014q = 0;
        this.f18015r = true;
        this.f18018u = true;
        this.f18022y = new E(this, 0);
        this.f18023z = new E(this, 1);
        this.f18003A = new C0463k(this, 28);
        Y(dialog.getWindow().getDecorView());
    }

    public final void W(boolean z8) {
        S i7;
        S s3;
        if (z8) {
            if (!this.f18017t) {
                this.f18017t = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f18006f;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                b0(false);
            }
        } else if (this.f18017t) {
            this.f18017t = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f18006f;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            b0(false);
        }
        if (!this.g.isLaidOut()) {
            if (z8) {
                ((U0) this.f18007h).f21436a.setVisibility(4);
                this.f18008i.setVisibility(0);
                return;
            } else {
                ((U0) this.f18007h).f21436a.setVisibility(0);
                this.f18008i.setVisibility(8);
                return;
            }
        }
        if (z8) {
            U0 u02 = (U0) this.f18007h;
            i7 = K.a(u02.f21436a);
            i7.a(0.0f);
            i7.c(100L);
            i7.d(new C1527i(u02, 4));
            s3 = this.f18008i.i(0, 200L);
        } else {
            U0 u03 = (U0) this.f18007h;
            S a9 = K.a(u03.f21436a);
            a9.a(1.0f);
            a9.c(200L);
            a9.d(new C1527i(u03, 0));
            i7 = this.f18008i.i(8, 100L);
            s3 = a9;
        }
        C1528j c1528j = new C1528j();
        ArrayList arrayList = c1528j.f19675a;
        arrayList.add(i7);
        View view = (View) i7.f26657a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) s3.f26657a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(s3);
        c1528j.b();
    }

    public final Context X() {
        if (this.f18005e == null) {
            TypedValue typedValue = new TypedValue();
            this.f18004d.getTheme().resolveAttribute(com.kt.apps.media.xemtv.beta.R.attr.actionBarWidgetTheme, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                this.f18005e = new ContextThemeWrapper(this.f18004d, i7);
            } else {
                this.f18005e = this.f18004d;
            }
        }
        return this.f18005e;
    }

    public final void Y(View view) {
        InterfaceC1731e0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.kt.apps.media.xemtv.beta.R.id.decor_content_parent);
        this.f18006f = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.kt.apps.media.xemtv.beta.R.id.action_bar);
        if (findViewById instanceof InterfaceC1731e0) {
            wrapper = (InterfaceC1731e0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f18007h = wrapper;
        this.f18008i = (ActionBarContextView) view.findViewById(com.kt.apps.media.xemtv.beta.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.kt.apps.media.xemtv.beta.R.id.action_bar_container);
        this.g = actionBarContainer;
        InterfaceC1731e0 interfaceC1731e0 = this.f18007h;
        if (interfaceC1731e0 == null || this.f18008i == null || actionBarContainer == null) {
            throw new IllegalStateException(G.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((U0) interfaceC1731e0).f21436a.getContext();
        this.f18004d = context;
        if ((((U0) this.f18007h).f21437b & 4) != 0) {
            this.k = true;
        }
        int i7 = context.getApplicationInfo().targetSdkVersion;
        this.f18007h.getClass();
        a0(context.getResources().getBoolean(com.kt.apps.media.xemtv.beta.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f18004d.obtainStyledAttributes(null, AbstractC1213a.f17566a, com.kt.apps.media.xemtv.beta.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f18006f;
            if (!actionBarOverlayLayout2.f12967u) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f18021x = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.g;
            WeakHashMap weakHashMap = K.f26642a;
            AbstractC2352B.k(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void Z(boolean z8) {
        if (this.k) {
            return;
        }
        int i7 = z8 ? 4 : 0;
        U0 u02 = (U0) this.f18007h;
        int i10 = u02.f21437b;
        this.k = true;
        u02.a((i7 & 4) | (i10 & (-5)));
    }

    public final void a0(boolean z8) {
        if (z8) {
            this.g.setTabContainer(null);
            ((U0) this.f18007h).getClass();
        } else {
            ((U0) this.f18007h).getClass();
            this.g.setTabContainer(null);
        }
        this.f18007h.getClass();
        ((U0) this.f18007h).f21436a.setCollapsible(false);
        this.f18006f.setHasNonEmbeddedTabs(false);
    }

    public final void b0(boolean z8) {
        boolean z10 = this.f18017t || !this.f18016s;
        View view = this.j;
        final C0463k c0463k = this.f18003A;
        if (!z10) {
            if (this.f18018u) {
                this.f18018u = false;
                C1528j c1528j = this.f18019v;
                if (c1528j != null) {
                    c1528j.a();
                }
                int i7 = this.f18014q;
                E e2 = this.f18022y;
                if (i7 != 0 || (!this.f18020w && !z8)) {
                    e2.a();
                    return;
                }
                this.g.setAlpha(1.0f);
                this.g.setTransitioning(true);
                C1528j c1528j2 = new C1528j();
                float f4 = -this.g.getHeight();
                if (z8) {
                    this.g.getLocationInWindow(new int[]{0, 0});
                    f4 -= r12[1];
                }
                S a9 = K.a(this.g);
                a9.e(f4);
                final View view2 = (View) a9.f26657a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c0463k != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: y1.Q
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((i.G) C0463k.this.f8074b).g.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z11 = c1528j2.f19679e;
                ArrayList arrayList = c1528j2.f19675a;
                if (!z11) {
                    arrayList.add(a9);
                }
                if (this.f18015r && view != null) {
                    S a10 = K.a(view);
                    a10.e(f4);
                    if (!c1528j2.f19679e) {
                        arrayList.add(a10);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f18001B;
                boolean z12 = c1528j2.f19679e;
                if (!z12) {
                    c1528j2.f19677c = accelerateInterpolator;
                }
                if (!z12) {
                    c1528j2.f19676b = 250L;
                }
                if (!z12) {
                    c1528j2.f19678d = e2;
                }
                this.f18019v = c1528j2;
                c1528j2.b();
                return;
            }
            return;
        }
        if (this.f18018u) {
            return;
        }
        this.f18018u = true;
        C1528j c1528j3 = this.f18019v;
        if (c1528j3 != null) {
            c1528j3.a();
        }
        this.g.setVisibility(0);
        int i10 = this.f18014q;
        E e10 = this.f18023z;
        if (i10 == 0 && (this.f18020w || z8)) {
            this.g.setTranslationY(0.0f);
            float f10 = -this.g.getHeight();
            if (z8) {
                this.g.getLocationInWindow(new int[]{0, 0});
                f10 -= r12[1];
            }
            this.g.setTranslationY(f10);
            C1528j c1528j4 = new C1528j();
            S a11 = K.a(this.g);
            a11.e(0.0f);
            final View view3 = (View) a11.f26657a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c0463k != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: y1.Q
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((i.G) C0463k.this.f8074b).g.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z13 = c1528j4.f19679e;
            ArrayList arrayList2 = c1528j4.f19675a;
            if (!z13) {
                arrayList2.add(a11);
            }
            if (this.f18015r && view != null) {
                view.setTranslationY(f10);
                S a12 = K.a(view);
                a12.e(0.0f);
                if (!c1528j4.f19679e) {
                    arrayList2.add(a12);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f18002C;
            boolean z14 = c1528j4.f19679e;
            if (!z14) {
                c1528j4.f19677c = decelerateInterpolator;
            }
            if (!z14) {
                c1528j4.f19676b = 250L;
            }
            if (!z14) {
                c1528j4.f19678d = e10;
            }
            this.f18019v = c1528j4;
            c1528j4.b();
        } else {
            this.g.setAlpha(1.0f);
            this.g.setTranslationY(0.0f);
            if (this.f18015r && view != null) {
                view.setTranslationY(0.0f);
            }
            e10.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f18006f;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = K.f26642a;
            AbstractC2377z.c(actionBarOverlayLayout);
        }
    }
}
