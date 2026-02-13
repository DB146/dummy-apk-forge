package l5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import m4.AbstractC1556J;
import m4.C1549C;
import m4.J0;
import m4.K0;
import m4.L0;
import m4.x0;
import n5.AbstractC1705a;

/* renamed from: l5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1496j extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f19465A;

    /* renamed from: B, reason: collision with root package name */
    public final N f19466B;

    /* renamed from: C, reason: collision with root package name */
    public final StringBuilder f19467C;

    /* renamed from: D, reason: collision with root package name */
    public final Formatter f19468D;

    /* renamed from: E, reason: collision with root package name */
    public final J0 f19469E;

    /* renamed from: F, reason: collision with root package name */
    public final K0 f19470F;

    /* renamed from: G, reason: collision with root package name */
    public final RunnableC1491e f19471G;

    /* renamed from: H, reason: collision with root package name */
    public final RunnableC1491e f19472H;

    /* renamed from: I, reason: collision with root package name */
    public final Drawable f19473I;

    /* renamed from: J, reason: collision with root package name */
    public final Drawable f19474J;

    /* renamed from: K, reason: collision with root package name */
    public final Drawable f19475K;
    public final String L;

    /* renamed from: M, reason: collision with root package name */
    public final String f19476M;

    /* renamed from: N, reason: collision with root package name */
    public final String f19477N;

    /* renamed from: O, reason: collision with root package name */
    public final Drawable f19478O;

    /* renamed from: P, reason: collision with root package name */
    public final Drawable f19479P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f19480Q;

    /* renamed from: R, reason: collision with root package name */
    public final float f19481R;

    /* renamed from: S, reason: collision with root package name */
    public final String f19482S;

    /* renamed from: T, reason: collision with root package name */
    public final String f19483T;

    /* renamed from: U, reason: collision with root package name */
    public x0 f19484U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f19485V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f19486W;

    /* renamed from: a, reason: collision with root package name */
    public final ViewOnClickListenerC1493g f19487a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f19488a0;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f19489b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f19490b0;

    /* renamed from: c, reason: collision with root package name */
    public final View f19491c;

    /* renamed from: c0, reason: collision with root package name */
    public int f19492c0;

    /* renamed from: d, reason: collision with root package name */
    public final View f19493d;

    /* renamed from: d0, reason: collision with root package name */
    public int f19494d0;

    /* renamed from: e, reason: collision with root package name */
    public final View f19495e;

    /* renamed from: e0, reason: collision with root package name */
    public int f19496e0;

    /* renamed from: f, reason: collision with root package name */
    public final View f19497f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f19498f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f19499g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f19500h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f19501i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f19502j0;

    /* renamed from: k0, reason: collision with root package name */
    public long f19503k0;

    /* renamed from: l0, reason: collision with root package name */
    public long[] f19504l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean[] f19505m0;

    /* renamed from: n0, reason: collision with root package name */
    public final long[] f19506n0;

    /* renamed from: o0, reason: collision with root package name */
    public final boolean[] f19507o0;

    /* renamed from: p0, reason: collision with root package name */
    public long f19508p0;

    /* renamed from: q0, reason: collision with root package name */
    public long f19509q0;

    /* renamed from: u, reason: collision with root package name */
    public final View f19510u;

    /* renamed from: v, reason: collision with root package name */
    public final View f19511v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f19512w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f19513x;

    /* renamed from: y, reason: collision with root package name */
    public final View f19514y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f19515z;

    static {
        AbstractC1556J.a("goog.exo.ui");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [l5.e] */
    /* JADX WARN: Type inference failed for: r6v2, types: [l5.e] */
    public C1496j(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.f19492c0 = 5000;
        this.f19496e0 = 0;
        this.f19494d0 = 200;
        this.f19503k0 = -9223372036854775807L;
        this.f19498f0 = true;
        this.f19499g0 = true;
        this.f19500h0 = true;
        this.f19501i0 = true;
        this.f19502j0 = false;
        int i7 = R.layout.exo_player_control_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC1498l.f19521c, 0, 0);
            try {
                this.f19492c0 = obtainStyledAttributes.getInt(19, this.f19492c0);
                i7 = obtainStyledAttributes.getResourceId(5, R.layout.exo_player_control_view);
                this.f19496e0 = obtainStyledAttributes.getInt(8, this.f19496e0);
                this.f19498f0 = obtainStyledAttributes.getBoolean(17, this.f19498f0);
                this.f19499g0 = obtainStyledAttributes.getBoolean(14, this.f19499g0);
                this.f19500h0 = obtainStyledAttributes.getBoolean(16, this.f19500h0);
                this.f19501i0 = obtainStyledAttributes.getBoolean(15, this.f19501i0);
                this.f19502j0 = obtainStyledAttributes.getBoolean(18, this.f19502j0);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(20, this.f19494d0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f19489b = new CopyOnWriteArrayList();
        this.f19469E = new J0();
        this.f19470F = new K0();
        StringBuilder sb2 = new StringBuilder();
        this.f19467C = sb2;
        this.f19468D = new Formatter(sb2, Locale.getDefault());
        this.f19504l0 = new long[0];
        this.f19505m0 = new boolean[0];
        this.f19506n0 = new long[0];
        this.f19507o0 = new boolean[0];
        ViewOnClickListenerC1493g viewOnClickListenerC1493g = new ViewOnClickListenerC1493g(this);
        this.f19487a = viewOnClickListenerC1493g;
        final int i10 = 0;
        this.f19471G = new Runnable(this) { // from class: l5.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1496j f19463b;

            {
                this.f19463b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f19463b.h();
                        return;
                    default:
                        this.f19463b.b();
                        return;
                }
            }
        };
        final int i11 = 1;
        this.f19472H = new Runnable(this) { // from class: l5.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1496j f19463b;

            {
                this.f19463b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f19463b.h();
                        return;
                    default:
                        this.f19463b.b();
                        return;
                }
            }
        };
        LayoutInflater.from(context).inflate(i7, this);
        setDescendantFocusability(262144);
        N n6 = (N) findViewById(R.id.exo_progress);
        View findViewById = findViewById(R.id.exo_progress_placeholder);
        if (n6 != null) {
            this.f19466B = n6;
        } else if (findViewById != null) {
            C1490d c1490d = new C1490d(context, attributeSet, 0);
            c1490d.setId(R.id.exo_progress);
            c1490d.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(c1490d, indexOfChild);
            this.f19466B = c1490d;
        } else {
            this.f19466B = null;
        }
        this.f19515z = (TextView) findViewById(R.id.exo_duration);
        this.f19465A = (TextView) findViewById(R.id.exo_position);
        N n8 = this.f19466B;
        if (n8 != null) {
            ((C1490d) n8).L.add(viewOnClickListenerC1493g);
        }
        View findViewById2 = findViewById(R.id.exo_play);
        this.f19495e = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(viewOnClickListenerC1493g);
        }
        View findViewById3 = findViewById(R.id.exo_pause);
        this.f19497f = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(viewOnClickListenerC1493g);
        }
        View findViewById4 = findViewById(R.id.exo_prev);
        this.f19491c = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(viewOnClickListenerC1493g);
        }
        View findViewById5 = findViewById(R.id.exo_next);
        this.f19493d = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(viewOnClickListenerC1493g);
        }
        View findViewById6 = findViewById(R.id.exo_rew);
        this.f19511v = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(viewOnClickListenerC1493g);
        }
        View findViewById7 = findViewById(R.id.exo_ffwd);
        this.f19510u = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(viewOnClickListenerC1493g);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f19512w = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC1493g);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f19513x = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC1493g);
        }
        View findViewById8 = findViewById(R.id.exo_vr);
        this.f19514y = findViewById8;
        setShowVrButton(false);
        e(false, false, findViewById8);
        Resources resources = context.getResources();
        this.f19480Q = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f19481R = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f19473I = n5.D.t(context, resources, R.drawable.exo_controls_repeat_off);
        this.f19474J = n5.D.t(context, resources, R.drawable.exo_controls_repeat_one);
        this.f19475K = n5.D.t(context, resources, R.drawable.exo_controls_repeat_all);
        this.f19478O = n5.D.t(context, resources, R.drawable.exo_controls_shuffle_on);
        this.f19479P = n5.D.t(context, resources, R.drawable.exo_controls_shuffle_off);
        this.L = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f19476M = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f19477N = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f19482S = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f19483T = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.f19509q0 = -9223372036854775807L;
    }

    public final boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        x0 x0Var = this.f19484U;
        if (x0Var == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (((C1549C) x0Var).d0() == 4) {
                return true;
            }
            ((C9.h) x0Var).x();
            return true;
        }
        if (keyCode == 89) {
            ((C9.h) x0Var).w();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            if (n5.D.V(x0Var)) {
                n5.D.G(x0Var);
                return true;
            }
            n5.D.F(x0Var);
            return true;
        }
        if (keyCode == 87) {
            ((C9.h) x0Var).A();
            return true;
        }
        if (keyCode == 88) {
            ((C9.h) x0Var).C();
            return true;
        }
        if (keyCode == 126) {
            n5.D.G(x0Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        n5.D.F(x0Var);
        return true;
    }

    public final void b() {
        if (d()) {
            setVisibility(8);
            Iterator it = this.f19489b.iterator();
            while (it.hasNext()) {
                InterfaceC1495i interfaceC1495i = (InterfaceC1495i) it.next();
                getVisibility();
                ViewOnLayoutChangeListenerC1497k viewOnLayoutChangeListenerC1497k = (ViewOnLayoutChangeListenerC1497k) interfaceC1495i;
                viewOnLayoutChangeListenerC1497k.getClass();
                viewOnLayoutChangeListenerC1497k.f19518c.j();
            }
            removeCallbacks(this.f19471G);
            removeCallbacks(this.f19472H);
            this.f19503k0 = -9223372036854775807L;
        }
    }

    public final void c() {
        RunnableC1491e runnableC1491e = this.f19472H;
        removeCallbacks(runnableC1491e);
        if (this.f19492c0 <= 0) {
            this.f19503k0 = -9223372036854775807L;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.f19492c0;
        this.f19503k0 = uptimeMillis + j;
        if (this.f19485V) {
            postDelayed(runnableC1491e, j);
        }
    }

    public final boolean d() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f19472H);
        } else if (motionEvent.getAction() == 1) {
            c();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(boolean z8, boolean z10, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.f19480Q : this.f19481R);
        view.setVisibility(z8 ? 0 : 8);
    }

    public final void f() {
        boolean z8;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (d() && this.f19485V) {
            x0 x0Var = this.f19484U;
            if (x0Var != null) {
                C9.h hVar = (C9.h) x0Var;
                z8 = hVar.o(5);
                z11 = hVar.o(7);
                z12 = hVar.o(11);
                z13 = hVar.o(12);
                z10 = hVar.o(9);
            } else {
                z8 = false;
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            e(this.f19500h0, z11, this.f19491c);
            e(this.f19498f0, z12, this.f19511v);
            e(this.f19499g0, z13, this.f19510u);
            e(this.f19501i0, z10, this.f19493d);
            N n6 = this.f19466B;
            if (n6 != null) {
                ((C1490d) n6).setEnabled(z8);
            }
        }
    }

    public final void g() {
        boolean z8;
        boolean z10;
        if (d() && this.f19485V) {
            boolean V7 = n5.D.V(this.f19484U);
            View view = this.f19495e;
            boolean z11 = true;
            if (view != null) {
                z8 = !V7 && view.isFocused();
                z10 = n5.D.f21141a < 21 ? z8 : !V7 && AbstractC1492f.a(view);
                view.setVisibility(V7 ? 0 : 8);
            } else {
                z8 = false;
                z10 = false;
            }
            View view2 = this.f19497f;
            if (view2 != null) {
                z8 |= V7 && view2.isFocused();
                if (n5.D.f21141a < 21) {
                    z11 = z8;
                } else if (!V7 || !AbstractC1492f.a(view2)) {
                    z11 = false;
                }
                z10 |= z11;
                view2.setVisibility(V7 ? 8 : 0);
            }
            if (z8) {
                boolean V10 = n5.D.V(this.f19484U);
                if (V10 && view != null) {
                    view.requestFocus();
                } else if (!V10 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z10) {
                boolean V11 = n5.D.V(this.f19484U);
                if (V11 && view != null) {
                    view.sendAccessibilityEvent(8);
                } else {
                    if (V11 || view2 == null) {
                        return;
                    }
                    view2.sendAccessibilityEvent(8);
                }
            }
        }
    }

    public x0 getPlayer() {
        return this.f19484U;
    }

    public int getRepeatToggleModes() {
        return this.f19496e0;
    }

    public boolean getShowShuffleButton() {
        return this.f19502j0;
    }

    public int getShowTimeoutMs() {
        return this.f19492c0;
    }

    public boolean getShowVrButton() {
        View view = this.f19514y;
        return view != null && view.getVisibility() == 0;
    }

    public final void h() {
        long j;
        long j10;
        if (d() && this.f19485V) {
            x0 x0Var = this.f19484U;
            if (x0Var != null) {
                C1549C c1549c = (C1549C) x0Var;
                j = c1549c.Q() + this.f19508p0;
                j10 = c1549c.P() + this.f19508p0;
            } else {
                j = 0;
                j10 = 0;
            }
            boolean z8 = j != this.f19509q0;
            this.f19509q0 = j;
            TextView textView = this.f19465A;
            if (textView != null && !this.f19490b0 && z8) {
                textView.setText(n5.D.B(this.f19467C, this.f19468D, j));
            }
            N n6 = this.f19466B;
            if (n6 != null) {
                C1490d c1490d = (C1490d) n6;
                c1490d.setPosition(j);
                c1490d.setBufferedPosition(j10);
            }
            RunnableC1491e runnableC1491e = this.f19471G;
            removeCallbacks(runnableC1491e);
            int d02 = x0Var == null ? 1 : ((C1549C) x0Var).d0();
            if (x0Var == null || !((C9.h) x0Var).s()) {
                if (d02 == 4 || d02 == 1) {
                    return;
                }
                postDelayed(runnableC1491e, 1000L);
                return;
            }
            long min = Math.min(n6 != null ? ((C1490d) n6).getPreferredUpdateDelay() : 1000L, 1000 - (j % 1000));
            C1549C c1549c2 = (C1549C) x0Var;
            c1549c2.E0();
            postDelayed(runnableC1491e, n5.D.j(c1549c2.f19872w0.f20492n.f20501a > 0.0f ? ((float) min) / r0 : 1000L, this.f19494d0, 1000L));
        }
    }

    public final void i() {
        ImageView imageView;
        if (d() && this.f19485V && (imageView = this.f19512w) != null) {
            if (this.f19496e0 == 0) {
                e(false, false, imageView);
                return;
            }
            x0 x0Var = this.f19484U;
            String str = this.L;
            Drawable drawable = this.f19473I;
            if (x0Var == null) {
                e(true, false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            e(true, true, imageView);
            C1549C c1549c = (C1549C) x0Var;
            c1549c.E0();
            int i7 = c1549c.f19833R;
            if (i7 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (i7 == 1) {
                imageView.setImageDrawable(this.f19474J);
                imageView.setContentDescription(this.f19476M);
            } else if (i7 == 2) {
                imageView.setImageDrawable(this.f19475K);
                imageView.setContentDescription(this.f19477N);
            }
            imageView.setVisibility(0);
        }
    }

    public final void j() {
        ImageView imageView;
        if (d() && this.f19485V && (imageView = this.f19513x) != null) {
            x0 x0Var = this.f19484U;
            if (!this.f19502j0) {
                e(false, false, imageView);
                return;
            }
            String str = this.f19483T;
            Drawable drawable = this.f19479P;
            if (x0Var == null) {
                e(true, false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            e(true, true, imageView);
            C1549C c1549c = (C1549C) x0Var;
            c1549c.E0();
            if (c1549c.f19834S) {
                drawable = this.f19478O;
            }
            imageView.setImageDrawable(drawable);
            c1549c.E0();
            if (c1549c.f19834S) {
                str = this.f19482S;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        boolean z8;
        L0 Y2;
        boolean z10;
        long j;
        int i7;
        TextView textView;
        N n6;
        L0 l02;
        L0 l03;
        boolean z11;
        boolean z12;
        x0 x0Var = this.f19484U;
        if (x0Var == null) {
            return;
        }
        boolean z13 = this.f19486W;
        boolean z14 = false;
        boolean z15 = true;
        long j10 = -9223372036854775807L;
        K0 k02 = this.f19470F;
        if (z13) {
            L0 Y10 = ((C1549C) x0Var).Y();
            if (Y10.o() <= 100) {
                int o10 = Y10.o();
                for (int i10 = 0; i10 < o10; i10++) {
                    if (Y10.m(i10, k02, 0L).f20015B != -9223372036854775807L) {
                    }
                }
                z8 = true;
                this.f19488a0 = z8;
                this.f19508p0 = 0L;
                C1549C c1549c = (C1549C) x0Var;
                Y2 = c1549c.Y();
                if (Y2.p()) {
                    int U8 = c1549c.U();
                    boolean z16 = this.f19488a0;
                    int i11 = z16 ? 0 : U8;
                    int o11 = z16 ? Y2.o() - 1 : U8;
                    i7 = 0;
                    long j11 = 0;
                    while (true) {
                        if (i11 > o11) {
                            break;
                        }
                        if (i11 == U8) {
                            this.f19508p0 = n5.D.Z(j11);
                        }
                        Y2.n(i11, k02);
                        if (k02.f20015B == j10) {
                            AbstractC1705a.m(this.f19488a0 ^ z15);
                            break;
                        }
                        int i12 = k02.f20016C;
                        while (i12 <= k02.f20017D) {
                            J0 j02 = this.f19469E;
                            Y2.f(i12, j02, z14);
                            Q4.b bVar = j02.f19969u;
                            int i13 = bVar.f8648d;
                            while (i13 < bVar.f8645a) {
                                long d10 = j02.d(i13);
                                int i14 = U8;
                                if (d10 == Long.MIN_VALUE) {
                                    l02 = Y2;
                                    long j12 = j02.f19966d;
                                    if (j12 != j10) {
                                        d10 = j12;
                                    }
                                    l03 = l02;
                                    i13++;
                                    U8 = i14;
                                    Y2 = l03;
                                    j10 = -9223372036854775807L;
                                } else {
                                    l02 = Y2;
                                }
                                long j13 = d10 + j02.f19967e;
                                if (j13 >= 0) {
                                    long[] jArr = this.f19504l0;
                                    if (i7 == jArr.length) {
                                        int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                        this.f19504l0 = Arrays.copyOf(jArr, length);
                                        this.f19505m0 = Arrays.copyOf(this.f19505m0, length);
                                    }
                                    this.f19504l0[i7] = n5.D.Z(j11 + j13);
                                    boolean[] zArr = this.f19505m0;
                                    Q4.a a9 = j02.f19969u.a(i13);
                                    int i15 = a9.f8631b;
                                    if (i15 == -1) {
                                        l03 = l02;
                                        z11 = true;
                                    } else {
                                        int i16 = 0;
                                        while (i16 < i15) {
                                            l03 = l02;
                                            int i17 = a9.f8634e[i16];
                                            if (i17 != 0) {
                                                Q4.a aVar = a9;
                                                z12 = true;
                                                if (i17 != 1) {
                                                    i16++;
                                                    l02 = l03;
                                                    a9 = aVar;
                                                }
                                            } else {
                                                z12 = true;
                                            }
                                            z11 = z12;
                                            break;
                                        }
                                        l03 = l02;
                                        z11 = false;
                                    }
                                    zArr[i7] = !z11;
                                    i7++;
                                    i13++;
                                    U8 = i14;
                                    Y2 = l03;
                                    j10 = -9223372036854775807L;
                                }
                                l03 = l02;
                                i13++;
                                U8 = i14;
                                Y2 = l03;
                                j10 = -9223372036854775807L;
                            }
                            i12++;
                            z15 = true;
                            Y2 = Y2;
                            z14 = false;
                            j10 = -9223372036854775807L;
                        }
                        j11 += k02.f20015B;
                        i11++;
                        z15 = z15;
                        Y2 = Y2;
                        z14 = false;
                        j10 = -9223372036854775807L;
                    }
                    z10 = z15;
                    j = j11;
                } else {
                    z10 = true;
                    j = 0;
                    i7 = 0;
                }
                long Z7 = n5.D.Z(j);
                textView = this.f19515z;
                if (textView != null) {
                    textView.setText(n5.D.B(this.f19467C, this.f19468D, Z7));
                }
                n6 = this.f19466B;
                if (n6 != null) {
                    C1490d c1490d = (C1490d) n6;
                    c1490d.setDuration(Z7);
                    long[] jArr2 = this.f19506n0;
                    int length2 = jArr2.length;
                    int i18 = i7 + length2;
                    long[] jArr3 = this.f19504l0;
                    if (i18 > jArr3.length) {
                        this.f19504l0 = Arrays.copyOf(jArr3, i18);
                        this.f19505m0 = Arrays.copyOf(this.f19505m0, i18);
                    }
                    System.arraycopy(jArr2, 0, this.f19504l0, i7, length2);
                    System.arraycopy(this.f19507o0, 0, this.f19505m0, i7, length2);
                    long[] jArr4 = this.f19504l0;
                    boolean[] zArr2 = this.f19505m0;
                    if (i18 != 0 && (jArr4 == null || zArr2 == null)) {
                        z10 = false;
                    }
                    AbstractC1705a.h(z10);
                    c1490d.f19451d0 = i18;
                    c1490d.f19453e0 = jArr4;
                    c1490d.f19455f0 = zArr2;
                    c1490d.e();
                }
                h();
            }
        }
        z8 = false;
        this.f19488a0 = z8;
        this.f19508p0 = 0L;
        C1549C c1549c2 = (C1549C) x0Var;
        Y2 = c1549c2.Y();
        if (Y2.p()) {
        }
        long Z72 = n5.D.Z(j);
        textView = this.f19515z;
        if (textView != null) {
        }
        n6 = this.f19466B;
        if (n6 != null) {
        }
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19485V = true;
        long j = this.f19503k0;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                b();
            } else {
                postDelayed(this.f19472H, uptimeMillis);
            }
        } else if (d()) {
            c();
        }
        g();
        f();
        i();
        j();
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19485V = false;
        removeCallbacks(this.f19471G);
        removeCallbacks(this.f19472H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (((m4.C1549C) r5).f19822F == android.os.Looper.getMainLooper()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPlayer(x0 x0Var) {
        boolean z8 = false;
        AbstractC1705a.m(Looper.myLooper() == Looper.getMainLooper());
        if (x0Var != null) {
        }
        z8 = true;
        AbstractC1705a.h(z8);
        x0 x0Var2 = this.f19484U;
        if (x0Var2 == x0Var) {
            return;
        }
        ViewOnClickListenerC1493g viewOnClickListenerC1493g = this.f19487a;
        if (x0Var2 != null) {
            ((C1549C) x0Var2).m0(viewOnClickListenerC1493g);
        }
        this.f19484U = x0Var;
        if (x0Var != null) {
            ((C1549C) x0Var).K(viewOnClickListenerC1493g);
        }
        g();
        f();
        i();
        j();
        k();
    }

    public void setProgressUpdateListener(InterfaceC1494h interfaceC1494h) {
    }

    public void setRepeatToggleModes(int i7) {
        this.f19496e0 = i7;
        x0 x0Var = this.f19484U;
        if (x0Var != null) {
            C1549C c1549c = (C1549C) x0Var;
            c1549c.E0();
            int i10 = c1549c.f19833R;
            if (i7 == 0 && i10 != 0) {
                ((C1549C) this.f19484U).r0(0);
            } else if (i7 == 1 && i10 == 2) {
                ((C1549C) this.f19484U).r0(1);
            } else if (i7 == 2 && i10 == 1) {
                ((C1549C) this.f19484U).r0(2);
            }
        }
        i();
    }

    public void setShowFastForwardButton(boolean z8) {
        this.f19499g0 = z8;
        f();
    }

    public void setShowMultiWindowTimeBar(boolean z8) {
        this.f19486W = z8;
        k();
    }

    public void setShowNextButton(boolean z8) {
        this.f19501i0 = z8;
        f();
    }

    public void setShowPreviousButton(boolean z8) {
        this.f19500h0 = z8;
        f();
    }

    public void setShowRewindButton(boolean z8) {
        this.f19498f0 = z8;
        f();
    }

    public void setShowShuffleButton(boolean z8) {
        this.f19502j0 = z8;
        j();
    }

    public void setShowTimeoutMs(int i7) {
        this.f19492c0 = i7;
        if (d()) {
            c();
        }
    }

    public void setShowVrButton(boolean z8) {
        View view = this.f19514y;
        if (view != null) {
            view.setVisibility(z8 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i7) {
        this.f19494d0 = n5.D.i(i7, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f19514y;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            e(getShowVrButton(), onClickListener != null, view);
        }
    }
}
