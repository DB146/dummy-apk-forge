package l5;

import N6.t0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import k6.ViewOnLayoutChangeListenerC1430a;
import m4.AbstractC1556J;
import m4.C1549C;
import m4.J0;
import m4.K0;
import m4.L0;
import m4.M0;
import m4.N0;
import m4.r0;
import m4.s0;
import m4.x0;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class B extends FrameLayout {

    /* renamed from: L0, reason: collision with root package name */
    public static final float[] f19260L0;

    /* renamed from: A, reason: collision with root package name */
    public final View f19261A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f19262A0;

    /* renamed from: B, reason: collision with root package name */
    public final View f19263B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f19264B0;

    /* renamed from: C, reason: collision with root package name */
    public final View f19265C;
    public int C0;

    /* renamed from: D, reason: collision with root package name */
    public final View f19266D;

    /* renamed from: D0, reason: collision with root package name */
    public int f19267D0;

    /* renamed from: E, reason: collision with root package name */
    public final View f19268E;

    /* renamed from: E0, reason: collision with root package name */
    public int f19269E0;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f19270F;

    /* renamed from: F0, reason: collision with root package name */
    public long[] f19271F0;

    /* renamed from: G, reason: collision with root package name */
    public final TextView f19272G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean[] f19273G0;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f19274H;

    /* renamed from: H0, reason: collision with root package name */
    public final long[] f19275H0;

    /* renamed from: I, reason: collision with root package name */
    public final ImageView f19276I;

    /* renamed from: I0, reason: collision with root package name */
    public final boolean[] f19277I0;

    /* renamed from: J, reason: collision with root package name */
    public final View f19278J;

    /* renamed from: J0, reason: collision with root package name */
    public long f19279J0;

    /* renamed from: K, reason: collision with root package name */
    public final ImageView f19280K;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f19281K0;
    public final ImageView L;

    /* renamed from: M, reason: collision with root package name */
    public final ImageView f19282M;

    /* renamed from: N, reason: collision with root package name */
    public final View f19283N;

    /* renamed from: O, reason: collision with root package name */
    public final View f19284O;

    /* renamed from: P, reason: collision with root package name */
    public final View f19285P;

    /* renamed from: Q, reason: collision with root package name */
    public final TextView f19286Q;

    /* renamed from: R, reason: collision with root package name */
    public final TextView f19287R;

    /* renamed from: S, reason: collision with root package name */
    public final N f19288S;

    /* renamed from: T, reason: collision with root package name */
    public final StringBuilder f19289T;

    /* renamed from: U, reason: collision with root package name */
    public final Formatter f19290U;

    /* renamed from: V, reason: collision with root package name */
    public final J0 f19291V;

    /* renamed from: W, reason: collision with root package name */
    public final K0 f19292W;

    /* renamed from: a, reason: collision with root package name */
    public final G f19293a;

    /* renamed from: a0, reason: collision with root package name */
    public final k1.a f19294a0;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f19295b;

    /* renamed from: b0, reason: collision with root package name */
    public final Drawable f19296b0;

    /* renamed from: c, reason: collision with root package name */
    public final ViewOnClickListenerC1503q f19297c;

    /* renamed from: c0, reason: collision with root package name */
    public final Drawable f19298c0;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f19299d;

    /* renamed from: d0, reason: collision with root package name */
    public final Drawable f19300d0;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f19301e;

    /* renamed from: e0, reason: collision with root package name */
    public final String f19302e0;

    /* renamed from: f, reason: collision with root package name */
    public final w f19303f;

    /* renamed from: f0, reason: collision with root package name */
    public final String f19304f0;

    /* renamed from: g0, reason: collision with root package name */
    public final String f19305g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Drawable f19306h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Drawable f19307i0;

    /* renamed from: j0, reason: collision with root package name */
    public final float f19308j0;

    /* renamed from: k0, reason: collision with root package name */
    public final float f19309k0;

    /* renamed from: l0, reason: collision with root package name */
    public final String f19310l0;

    /* renamed from: m0, reason: collision with root package name */
    public final String f19311m0;

    /* renamed from: n0, reason: collision with root package name */
    public final Drawable f19312n0;

    /* renamed from: o0, reason: collision with root package name */
    public final Drawable f19313o0;

    /* renamed from: p0, reason: collision with root package name */
    public final String f19314p0;

    /* renamed from: q0, reason: collision with root package name */
    public final String f19315q0;

    /* renamed from: r0, reason: collision with root package name */
    public final Drawable f19316r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Drawable f19317s0;

    /* renamed from: t0, reason: collision with root package name */
    public final String f19318t0;

    /* renamed from: u, reason: collision with root package name */
    public final C1505t f19319u;

    /* renamed from: u0, reason: collision with root package name */
    public final String f19320u0;

    /* renamed from: v, reason: collision with root package name */
    public final C1502p f19321v;

    /* renamed from: v0, reason: collision with root package name */
    public x0 f19322v0;

    /* renamed from: w, reason: collision with root package name */
    public final C1502p f19323w;

    /* renamed from: w0, reason: collision with root package name */
    public r f19324w0;

    /* renamed from: x, reason: collision with root package name */
    public final G3.A f19325x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f19326x0;

    /* renamed from: y, reason: collision with root package name */
    public final PopupWindow f19327y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f19328y0;

    /* renamed from: z, reason: collision with root package name */
    public final int f19329z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f19330z0;

    static {
        AbstractC1556J.a("goog.exo.ui");
        f19260L0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public B(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        boolean z8;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ViewOnClickListenerC1503q viewOnClickListenerC1503q;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        Typeface a9;
        ImageView imageView;
        boolean z22;
        this.C0 = 5000;
        this.f19269E0 = 0;
        this.f19267D0 = 200;
        int i7 = R.layout.exo_styled_player_control_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC1498l.f19523e, 0, 0);
            try {
                i7 = obtainStyledAttributes.getResourceId(6, R.layout.exo_styled_player_control_view);
                this.C0 = obtainStyledAttributes.getInt(21, this.C0);
                this.f19269E0 = obtainStyledAttributes.getInt(9, this.f19269E0);
                boolean z23 = obtainStyledAttributes.getBoolean(18, true);
                boolean z24 = obtainStyledAttributes.getBoolean(15, true);
                boolean z25 = obtainStyledAttributes.getBoolean(17, true);
                boolean z26 = obtainStyledAttributes.getBoolean(16, true);
                boolean z27 = obtainStyledAttributes.getBoolean(19, false);
                boolean z28 = obtainStyledAttributes.getBoolean(20, false);
                boolean z29 = obtainStyledAttributes.getBoolean(22, false);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(23, this.f19267D0));
                boolean z30 = obtainStyledAttributes.getBoolean(2, true);
                obtainStyledAttributes.recycle();
                z8 = z28;
                z16 = z25;
                z11 = z29;
                z13 = z30;
                z14 = z23;
                z10 = z27;
                z15 = z24;
                z12 = z26;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z8 = false;
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
            z14 = true;
            z15 = true;
            z16 = true;
        }
        LayoutInflater.from(context).inflate(i7, this);
        setDescendantFocusability(262144);
        ViewOnClickListenerC1503q viewOnClickListenerC1503q2 = new ViewOnClickListenerC1503q(this);
        this.f19297c = viewOnClickListenerC1503q2;
        this.f19299d = new CopyOnWriteArrayList();
        this.f19291V = new J0();
        this.f19292W = new K0();
        StringBuilder sb2 = new StringBuilder();
        this.f19289T = sb2;
        this.f19290U = new Formatter(sb2, Locale.getDefault());
        this.f19271F0 = new long[0];
        this.f19273G0 = new boolean[0];
        this.f19275H0 = new long[0];
        this.f19277I0 = new boolean[0];
        this.f19294a0 = new k1.a(this, 3);
        this.f19286Q = (TextView) findViewById(R.id.exo_duration);
        this.f19287R = (TextView) findViewById(R.id.exo_position);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_subtitle);
        this.f19280K = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC1503q2);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.L = imageView3;
        Aa.q qVar = new Aa.q(this, 7);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(qVar);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f19282M = imageView4;
        Aa.q qVar2 = new Aa.q(this, 7);
        if (imageView4 != null) {
            imageView4.setVisibility(8);
            imageView4.setOnClickListener(qVar2);
        }
        View findViewById = findViewById(R.id.exo_settings);
        this.f19283N = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(viewOnClickListenerC1503q2);
        }
        View findViewById2 = findViewById(R.id.exo_playback_speed);
        this.f19284O = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(viewOnClickListenerC1503q2);
        }
        View findViewById3 = findViewById(R.id.exo_audio_track);
        this.f19285P = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(viewOnClickListenerC1503q2);
        }
        N n6 = (N) findViewById(R.id.exo_progress);
        View findViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (n6 != null) {
            this.f19288S = n6;
            z17 = z8;
        } else if (findViewById4 != null) {
            z17 = z8;
            C1490d c1490d = new C1490d(context, attributeSet, R.style.ExoStyledControls_TimeBar);
            c1490d.setId(R.id.exo_progress);
            c1490d.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(c1490d, indexOfChild);
            this.f19288S = c1490d;
        } else {
            z17 = z8;
            this.f19288S = null;
        }
        N n8 = this.f19288S;
        if (n8 != null) {
            ((C1490d) n8).L.add(viewOnClickListenerC1503q2);
        }
        View findViewById5 = findViewById(R.id.exo_play_pause);
        this.f19265C = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(viewOnClickListenerC1503q2);
        }
        View findViewById6 = findViewById(R.id.exo_prev);
        this.f19261A = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(viewOnClickListenerC1503q2);
        }
        View findViewById7 = findViewById(R.id.exo_next);
        this.f19263B = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(viewOnClickListenerC1503q2);
        }
        ThreadLocal threadLocal = n1.k.f21047a;
        if (context.isRestricted()) {
            viewOnClickListenerC1503q = viewOnClickListenerC1503q2;
            z19 = z10;
            z20 = z12;
            z21 = z11;
            z18 = z17;
            a9 = null;
        } else {
            viewOnClickListenerC1503q = viewOnClickListenerC1503q2;
            z18 = z17;
            z19 = z10;
            z20 = z12;
            z21 = z11;
            a9 = n1.k.a(context, R.font.roboto_medium_numbers, new TypedValue(), 0, null, false, false);
        }
        View findViewById8 = findViewById(R.id.exo_rew);
        TextView textView = findViewById8 == null ? (TextView) findViewById(R.id.exo_rew_with_amount) : null;
        this.f19272G = textView;
        if (textView != null) {
            textView.setTypeface(a9);
        }
        findViewById8 = findViewById8 == null ? textView : findViewById8;
        this.f19268E = findViewById8;
        ViewOnClickListenerC1503q viewOnClickListenerC1503q3 = viewOnClickListenerC1503q;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(viewOnClickListenerC1503q3);
        }
        View findViewById9 = findViewById(R.id.exo_ffwd);
        TextView textView2 = findViewById9 == null ? (TextView) findViewById(R.id.exo_ffwd_with_amount) : null;
        this.f19270F = textView2;
        if (textView2 != null) {
            textView2.setTypeface(a9);
        }
        findViewById9 = findViewById9 == null ? textView2 : findViewById9;
        this.f19266D = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(viewOnClickListenerC1503q3);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f19274H = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(viewOnClickListenerC1503q3);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f19276I = imageView6;
        if (imageView6 != null) {
            imageView6.setOnClickListener(viewOnClickListenerC1503q3);
        }
        Resources resources = context.getResources();
        this.f19295b = resources;
        this.f19308j0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f19309k0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View findViewById10 = findViewById(R.id.exo_vr);
        this.f19278J = findViewById10;
        if (findViewById10 != null) {
            k(findViewById10, false);
        }
        G g = new G(this);
        this.f19293a = g;
        g.f19342C = z13;
        w wVar = new w(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{n5.D.t(context, resources, R.drawable.exo_styled_controls_speed), n5.D.t(context, resources, R.drawable.exo_styled_controls_audiotrack)});
        this.f19303f = wVar;
        this.f19329z = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f19301e = recyclerView;
        recyclerView.setAdapter(wVar);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f19327y = popupWindow;
        if (n5.D.f21141a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(viewOnClickListenerC1503q3);
        this.f19281K0 = true;
        this.f19325x = new G3.A(getResources(), 1);
        this.f19312n0 = n5.D.t(context, resources, R.drawable.exo_styled_controls_subtitle_on);
        this.f19313o0 = n5.D.t(context, resources, R.drawable.exo_styled_controls_subtitle_off);
        this.f19314p0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f19315q0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f19321v = new C1502p(this, 1);
        this.f19323w = new C1502p(this, 0);
        this.f19319u = new C1505t(this, resources.getStringArray(R.array.exo_controls_playback_speeds), f19260L0);
        this.f19316r0 = n5.D.t(context, resources, R.drawable.exo_styled_controls_fullscreen_exit);
        this.f19317s0 = n5.D.t(context, resources, R.drawable.exo_styled_controls_fullscreen_enter);
        this.f19296b0 = n5.D.t(context, resources, R.drawable.exo_styled_controls_repeat_off);
        this.f19298c0 = n5.D.t(context, resources, R.drawable.exo_styled_controls_repeat_one);
        this.f19300d0 = n5.D.t(context, resources, R.drawable.exo_styled_controls_repeat_all);
        this.f19306h0 = n5.D.t(context, resources, R.drawable.exo_styled_controls_shuffle_on);
        this.f19307i0 = n5.D.t(context, resources, R.drawable.exo_styled_controls_shuffle_off);
        this.f19318t0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f19320u0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f19302e0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f19304f0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f19305g0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f19310l0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f19311m0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        g.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        g.h(findViewById9, z15);
        g.h(findViewById8, z14);
        g.h(findViewById6, z16);
        g.h(findViewById7, z20);
        g.h(imageView6, z19);
        g.h(imageView2, z18);
        g.h(findViewById10, z21);
        if (this.f19269E0 != 0) {
            imageView = imageView5;
            z22 = true;
        } else {
            imageView = imageView5;
            z22 = false;
        }
        g.h(imageView, z22);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1430a(this, 1));
    }

    public static void a(B b2) {
        if (b2.f19324w0 == null) {
            return;
        }
        boolean z8 = b2.f19326x0;
        b2.f19326x0 = !z8;
        String str = b2.f19320u0;
        Drawable drawable = b2.f19317s0;
        String str2 = b2.f19318t0;
        Drawable drawable2 = b2.f19316r0;
        ImageView imageView = b2.L;
        if (imageView != null) {
            if (z8) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            }
        }
        boolean z10 = b2.f19326x0;
        ImageView imageView2 = b2.f19282M;
        if (imageView2 == null) {
            return;
        }
        if (z10) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    public static boolean c(x0 x0Var, K0 k02) {
        L0 Y2;
        int o10;
        C9.h hVar = (C9.h) x0Var;
        if (!hVar.o(17) || (o10 = (Y2 = ((C1549C) hVar).Y()).o()) <= 1 || o10 > 100) {
            return false;
        }
        for (int i7 = 0; i7 < o10; i7++) {
            if (Y2.m(i7, k02, 0L).f20015B == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f4) {
        x0 x0Var = this.f19322v0;
        if (x0Var == null || !((C9.h) x0Var).o(13)) {
            return;
        }
        C1549C c1549c = (C1549C) this.f19322v0;
        c1549c.E0();
        s0 s0Var = new s0(f4, c1549c.f19872w0.f20492n.f20502b);
        c1549c.E0();
        if (c1549c.f19872w0.f20492n.equals(s0Var)) {
            return;
        }
        r0 f10 = c1549c.f19872w0.f(s0Var);
        c1549c.f19835T++;
        c1549c.f19875y.f19951v.a(4, s0Var).b();
        c1549c.C0(f10, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final boolean d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        x0 x0Var = this.f19322v0;
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
            C9.h hVar = (C9.h) x0Var;
            if (!hVar.o(12)) {
                return true;
            }
            hVar.x();
            return true;
        }
        if (keyCode == 89) {
            C9.h hVar2 = (C9.h) x0Var;
            if (hVar2.o(11)) {
                hVar2.w();
                return true;
            }
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
            C9.h hVar3 = (C9.h) x0Var;
            if (!hVar3.o(9)) {
                return true;
            }
            hVar3.A();
            return true;
        }
        if (keyCode == 88) {
            C9.h hVar4 = (C9.h) x0Var;
            if (!hVar4.o(7)) {
                return true;
            }
            hVar4.C();
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

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return d(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e(H2.K k, View view) {
        this.f19301e.setAdapter(k);
        q();
        this.f19281K0 = false;
        PopupWindow popupWindow = this.f19327y;
        popupWindow.dismiss();
        this.f19281K0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i7 = this.f19329z;
        popupWindow.showAsDropDown(view, width - i7, (-popupWindow.getHeight()) - i7);
    }

    public final t0 f(N0 n02, int i7) {
        N6.r.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        N6.H h10 = n02.f20114a;
        int i10 = 0;
        for (int i11 = 0; i11 < h10.size(); i11++) {
            M0 m02 = (M0) h10.get(i11);
            if (m02.f20108b.f8108c == i7) {
                for (int i12 = 0; i12 < m02.f20107a; i12++) {
                    if (m02.b(i12)) {
                        m4.L l10 = m02.f20108b.f8109d[i12];
                        if ((l10.f20088d & 2) == 0) {
                            y yVar = new y(n02, i11, i12, this.f19325x.c(l10));
                            int i13 = i10 + 1;
                            if (objArr.length < i13) {
                                objArr = Arrays.copyOf(objArr, N6.B.f(objArr.length, i13));
                            }
                            objArr[i10] = yVar;
                            i10 = i13;
                        }
                    }
                }
            }
        }
        return N6.H.D(i10, objArr);
    }

    public final void g() {
        G g = this.f19293a;
        int i7 = g.f19365z;
        if (i7 == 3 || i7 == 2) {
            return;
        }
        g.f();
        if (!g.f19342C) {
            g.i(2);
        } else if (g.f19365z == 1) {
            g.f19352m.start();
        } else {
            g.f19353n.start();
        }
    }

    public x0 getPlayer() {
        return this.f19322v0;
    }

    public int getRepeatToggleModes() {
        return this.f19269E0;
    }

    public boolean getShowShuffleButton() {
        return this.f19293a.b(this.f19276I);
    }

    public boolean getShowSubtitleButton() {
        return this.f19293a.b(this.f19280K);
    }

    public int getShowTimeoutMs() {
        return this.C0;
    }

    public boolean getShowVrButton() {
        return this.f19293a.b(this.f19278J);
    }

    public final boolean h() {
        G g = this.f19293a;
        return g.f19365z == 0 && g.f19343a.i();
    }

    public final boolean i() {
        return getVisibility() == 0;
    }

    public final void j() {
        m();
        l();
        p();
        r();
        t();
        n();
        s();
    }

    public final void k(View view, boolean z8) {
        if (view == null) {
            return;
        }
        view.setEnabled(z8);
        view.setAlpha(z8 ? this.f19308j0 : this.f19309k0);
    }

    public final void l() {
        boolean z8;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j;
        long j10;
        if (i() && this.f19328y0) {
            x0 x0Var = this.f19322v0;
            if (x0Var != null) {
                z8 = (this.f19330z0 && c(x0Var, this.f19292W)) ? ((C9.h) x0Var).o(10) : ((C9.h) x0Var).o(5);
                C9.h hVar = (C9.h) x0Var;
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
            Resources resources = this.f19295b;
            View view = this.f19268E;
            if (z12) {
                x0 x0Var2 = this.f19322v0;
                if (x0Var2 != null) {
                    C1549C c1549c = (C1549C) x0Var2;
                    c1549c.E0();
                    j10 = c1549c.f19824H;
                } else {
                    j10 = 5000;
                }
                int i7 = (int) (j10 / 1000);
                TextView textView = this.f19272G;
                if (textView != null) {
                    textView.setText(String.valueOf(i7));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i7, Integer.valueOf(i7)));
                }
            }
            View view2 = this.f19266D;
            if (z13) {
                x0 x0Var3 = this.f19322v0;
                if (x0Var3 != null) {
                    C1549C c1549c2 = (C1549C) x0Var3;
                    c1549c2.E0();
                    j = c1549c2.f19825I;
                } else {
                    j = 15000;
                }
                int i10 = (int) (j / 1000);
                TextView textView2 = this.f19270F;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i10));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i10, Integer.valueOf(i10)));
                }
            }
            k(this.f19261A, z11);
            k(view, z12);
            k(view2, z13);
            k(this.f19263B, z10);
            N n6 = this.f19288S;
            if (n6 != null) {
                ((C1490d) n6).setEnabled(z8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (((m4.C1549C) r6.f19322v0).Y().p() == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        View view;
        boolean z8;
        if (i() && this.f19328y0 && (view = this.f19265C) != null) {
            boolean V7 = n5.D.V(this.f19322v0);
            int i7 = V7 ? R.drawable.exo_styled_controls_play : R.drawable.exo_styled_controls_pause;
            int i10 = V7 ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            Context context = getContext();
            Resources resources = this.f19295b;
            ((ImageView) view).setImageDrawable(n5.D.t(context, resources, i7));
            view.setContentDescription(resources.getString(i10));
            x0 x0Var = this.f19322v0;
            if (x0Var != null) {
                z8 = true;
                if (((C9.h) x0Var).o(1)) {
                    if (((C9.h) this.f19322v0).o(17)) {
                    }
                    k(view, z8);
                }
            }
            z8 = false;
            k(view, z8);
        }
    }

    public final void n() {
        C1505t c1505t;
        x0 x0Var = this.f19322v0;
        if (x0Var == null) {
            return;
        }
        C1549C c1549c = (C1549C) x0Var;
        c1549c.E0();
        float f4 = c1549c.f19872w0.f20492n.f20501a;
        float f10 = Float.MAX_VALUE;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            c1505t = this.f19319u;
            float[] fArr = c1505t.f19541e;
            if (i7 >= fArr.length) {
                break;
            }
            float abs = Math.abs(f4 - fArr[i7]);
            if (abs < f10) {
                i10 = i7;
                f10 = abs;
            }
            i7++;
        }
        c1505t.f19542f = i10;
        String str = c1505t.f19540d[i10];
        w wVar = this.f19303f;
        wVar.f19548e[0] = str;
        k(this.f19283N, wVar.m(1) || wVar.m(0));
    }

    public final void o() {
        long j;
        long j10;
        if (i() && this.f19328y0) {
            x0 x0Var = this.f19322v0;
            if (x0Var == null || !((C9.h) x0Var).o(16)) {
                j = 0;
                j10 = 0;
            } else {
                C1549C c1549c = (C1549C) x0Var;
                j = c1549c.Q() + this.f19279J0;
                j10 = c1549c.P() + this.f19279J0;
            }
            TextView textView = this.f19287R;
            if (textView != null && !this.f19264B0) {
                textView.setText(n5.D.B(this.f19289T, this.f19290U, j));
            }
            N n6 = this.f19288S;
            if (n6 != null) {
                C1490d c1490d = (C1490d) n6;
                c1490d.setPosition(j);
                c1490d.setBufferedPosition(j10);
            }
            k1.a aVar = this.f19294a0;
            removeCallbacks(aVar);
            int d02 = x0Var == null ? 1 : ((C1549C) x0Var).d0();
            if (x0Var == null || !((C9.h) x0Var).s()) {
                if (d02 == 4 || d02 == 1) {
                    return;
                }
                postDelayed(aVar, 1000L);
                return;
            }
            long min = Math.min(n6 != null ? ((C1490d) n6).getPreferredUpdateDelay() : 1000L, 1000 - (j % 1000));
            C1549C c1549c2 = (C1549C) x0Var;
            c1549c2.E0();
            postDelayed(aVar, n5.D.j(c1549c2.f19872w0.f20492n.f20501a > 0.0f ? ((float) min) / r0 : 1000L, this.f19267D0, 1000L));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        G g = this.f19293a;
        g.f19343a.addOnLayoutChangeListener(g.f19363x);
        this.f19328y0 = true;
        if (h()) {
            g.g();
        }
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        G g = this.f19293a;
        g.f19343a.removeOnLayoutChangeListener(g.f19363x);
        this.f19328y0 = false;
        removeCallbacks(this.f19294a0);
        g.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
        View view = this.f19293a.f19344b;
        if (view != null) {
            view.layout(0, 0, i11 - i7, i12 - i10);
        }
    }

    public final void p() {
        ImageView imageView;
        if (i() && this.f19328y0 && (imageView = this.f19274H) != null) {
            if (this.f19269E0 == 0) {
                k(imageView, false);
                return;
            }
            x0 x0Var = this.f19322v0;
            String str = this.f19302e0;
            Drawable drawable = this.f19296b0;
            if (x0Var == null || !((C9.h) x0Var).o(15)) {
                k(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            k(imageView, true);
            C1549C c1549c = (C1549C) x0Var;
            c1549c.E0();
            int i7 = c1549c.f19833R;
            if (i7 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (i7 == 1) {
                imageView.setImageDrawable(this.f19298c0);
                imageView.setContentDescription(this.f19304f0);
            } else {
                if (i7 != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f19300d0);
                imageView.setContentDescription(this.f19305g0);
            }
        }
    }

    public final void q() {
        RecyclerView recyclerView = this.f19301e;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i7 = this.f19329z;
        int min = Math.min(recyclerView.getMeasuredWidth(), width - (i7 * 2));
        PopupWindow popupWindow = this.f19327y;
        popupWindow.setWidth(min);
        popupWindow.setHeight(Math.min(getHeight() - (i7 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void r() {
        ImageView imageView;
        if (i() && this.f19328y0 && (imageView = this.f19276I) != null) {
            x0 x0Var = this.f19322v0;
            if (!this.f19293a.b(imageView)) {
                k(imageView, false);
                return;
            }
            String str = this.f19311m0;
            Drawable drawable = this.f19307i0;
            if (x0Var == null || !((C9.h) x0Var).o(14)) {
                k(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            k(imageView, true);
            C1549C c1549c = (C1549C) x0Var;
            c1549c.E0();
            if (c1549c.f19834S) {
                drawable = this.f19306h0;
            }
            imageView.setImageDrawable(drawable);
            c1549c.E0();
            if (c1549c.f19834S) {
                str = this.f19310l0;
            }
            imageView.setContentDescription(str);
        }
    }

    public final void s() {
        boolean z8;
        long j;
        int i7;
        int i10;
        int i11;
        int i12;
        J0 j02;
        boolean z10;
        x0 x0Var = this.f19322v0;
        if (x0Var == null) {
            return;
        }
        boolean z11 = this.f19330z0;
        boolean z12 = false;
        boolean z13 = true;
        K0 k02 = this.f19292W;
        this.f19262A0 = z11 && c(x0Var, k02);
        this.f19279J0 = 0L;
        C9.h hVar = (C9.h) x0Var;
        L0 Y2 = hVar.o(17) ? ((C1549C) x0Var).Y() : L0.f20097a;
        long j10 = -9223372036854775807L;
        if (Y2.p()) {
            z8 = true;
            if (hVar.o(16)) {
                long j11 = hVar.j();
                if (j11 != -9223372036854775807L) {
                    j = n5.D.M(j11);
                    i7 = 0;
                }
            }
            j = 0;
            i7 = 0;
        } else {
            int U8 = ((C1549C) x0Var).U();
            boolean z14 = this.f19262A0;
            int i13 = z14 ? 0 : U8;
            int o10 = z14 ? Y2.o() - 1 : U8;
            i7 = 0;
            long j12 = 0;
            while (true) {
                if (i13 > o10) {
                    break;
                }
                if (i13 == U8) {
                    this.f19279J0 = n5.D.Z(j12);
                }
                Y2.n(i13, k02);
                if (k02.f20015B == j10) {
                    AbstractC1705a.m(this.f19262A0 ^ z13);
                    break;
                }
                int i14 = k02.f20016C;
                while (i14 <= k02.f20017D) {
                    J0 j03 = this.f19291V;
                    Y2.f(i14, j03, z12);
                    Q4.b bVar = j03.f19969u;
                    int i15 = bVar.f8648d;
                    while (i15 < bVar.f8645a) {
                        long d10 = j03.d(i15);
                        if (d10 == Long.MIN_VALUE) {
                            i10 = U8;
                            i11 = o10;
                            long j13 = j03.f19966d;
                            if (j13 == j10) {
                                i12 = i10;
                                j02 = j03;
                                i15++;
                                o10 = i11;
                                U8 = i12;
                                j03 = j02;
                                j10 = -9223372036854775807L;
                            } else {
                                d10 = j13;
                            }
                        } else {
                            i10 = U8;
                            i11 = o10;
                        }
                        long j14 = d10 + j03.f19967e;
                        if (j14 >= 0) {
                            long[] jArr = this.f19271F0;
                            if (i7 == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f19271F0 = Arrays.copyOf(jArr, length);
                                this.f19273G0 = Arrays.copyOf(this.f19273G0, length);
                            }
                            this.f19271F0[i7] = n5.D.Z(j12 + j14);
                            boolean[] zArr = this.f19273G0;
                            Q4.a a9 = j03.f19969u.a(i15);
                            int i16 = a9.f8631b;
                            if (i16 == -1) {
                                i12 = i10;
                                j02 = j03;
                                z10 = true;
                            } else {
                                int i17 = 0;
                                while (i17 < i16) {
                                    i12 = i10;
                                    int i18 = a9.f8634e[i17];
                                    j02 = j03;
                                    if (i18 == 0 || i18 == 1) {
                                        z10 = true;
                                        break;
                                    } else {
                                        i17++;
                                        i10 = i12;
                                        j03 = j02;
                                    }
                                }
                                i12 = i10;
                                j02 = j03;
                                z10 = false;
                            }
                            zArr[i7] = !z10;
                            i7++;
                        } else {
                            i12 = i10;
                            j02 = j03;
                        }
                        i15++;
                        o10 = i11;
                        U8 = i12;
                        j03 = j02;
                        j10 = -9223372036854775807L;
                    }
                    i14++;
                    z13 = true;
                    z12 = false;
                    j10 = -9223372036854775807L;
                }
                j12 += k02.f20015B;
                i13++;
                o10 = o10;
                U8 = U8;
                z12 = false;
                j10 = -9223372036854775807L;
            }
            z8 = z13;
            j = j12;
        }
        long Z7 = n5.D.Z(j);
        TextView textView = this.f19286Q;
        if (textView != null) {
            textView.setText(n5.D.B(this.f19289T, this.f19290U, Z7));
        }
        N n6 = this.f19288S;
        if (n6 != null) {
            C1490d c1490d = (C1490d) n6;
            c1490d.setDuration(Z7);
            long[] jArr2 = this.f19275H0;
            int length2 = jArr2.length;
            int i19 = i7 + length2;
            long[] jArr3 = this.f19271F0;
            if (i19 > jArr3.length) {
                this.f19271F0 = Arrays.copyOf(jArr3, i19);
                this.f19273G0 = Arrays.copyOf(this.f19273G0, i19);
            }
            boolean z15 = false;
            System.arraycopy(jArr2, 0, this.f19271F0, i7, length2);
            System.arraycopy(this.f19277I0, 0, this.f19273G0, i7, length2);
            long[] jArr4 = this.f19271F0;
            boolean[] zArr2 = this.f19273G0;
            if (i19 == 0 || (jArr4 != null && zArr2 != null)) {
                z15 = z8;
            }
            AbstractC1705a.h(z15);
            c1490d.f19451d0 = i19;
            c1490d.f19453e0 = jArr4;
            c1490d.f19455f0 = zArr2;
            c1490d.e();
        }
        o();
    }

    public void setAnimationEnabled(boolean z8) {
        this.f19293a.f19342C = z8;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(r rVar) {
        this.f19324w0 = rVar;
        boolean z8 = rVar != null;
        ImageView imageView = this.L;
        if (imageView != null) {
            if (z8) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z10 = rVar != null;
        ImageView imageView2 = this.f19282M;
        if (imageView2 == null) {
            return;
        }
        if (z10) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
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
        x0 x0Var2 = this.f19322v0;
        if (x0Var2 == x0Var) {
            return;
        }
        ViewOnClickListenerC1503q viewOnClickListenerC1503q = this.f19297c;
        if (x0Var2 != null) {
            ((C1549C) x0Var2).m0(viewOnClickListenerC1503q);
        }
        this.f19322v0 = x0Var;
        if (x0Var != null) {
            ((C1549C) x0Var).K(viewOnClickListenerC1503q);
        }
        j();
    }

    public void setProgressUpdateListener(u uVar) {
    }

    public void setRepeatToggleModes(int i7) {
        this.f19269E0 = i7;
        x0 x0Var = this.f19322v0;
        if (x0Var != null && ((C9.h) x0Var).o(15)) {
            C1549C c1549c = (C1549C) this.f19322v0;
            c1549c.E0();
            int i10 = c1549c.f19833R;
            if (i7 == 0 && i10 != 0) {
                ((C1549C) this.f19322v0).r0(0);
            } else if (i7 == 1 && i10 == 2) {
                ((C1549C) this.f19322v0).r0(1);
            } else if (i7 == 2 && i10 == 1) {
                ((C1549C) this.f19322v0).r0(2);
            }
        }
        this.f19293a.h(this.f19274H, i7 != 0);
        p();
    }

    public void setShowFastForwardButton(boolean z8) {
        this.f19293a.h(this.f19266D, z8);
        l();
    }

    public void setShowMultiWindowTimeBar(boolean z8) {
        this.f19330z0 = z8;
        s();
    }

    public void setShowNextButton(boolean z8) {
        this.f19293a.h(this.f19263B, z8);
        l();
    }

    public void setShowPreviousButton(boolean z8) {
        this.f19293a.h(this.f19261A, z8);
        l();
    }

    public void setShowRewindButton(boolean z8) {
        this.f19293a.h(this.f19268E, z8);
        l();
    }

    public void setShowShuffleButton(boolean z8) {
        this.f19293a.h(this.f19276I, z8);
        r();
    }

    public void setShowSubtitleButton(boolean z8) {
        this.f19293a.h(this.f19280K, z8);
    }

    public void setShowTimeoutMs(int i7) {
        this.C0 = i7;
        if (h()) {
            this.f19293a.g();
        }
    }

    public void setShowVrButton(boolean z8) {
        this.f19293a.h(this.f19278J, z8);
    }

    public void setTimeBarMinUpdateInterval(int i7) {
        this.f19267D0 = n5.D.i(i7, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f19278J;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            k(view, onClickListener != null);
        }
    }

    public final void t() {
        C1502p c1502p = this.f19321v;
        c1502p.getClass();
        c1502p.f19534d = Collections.emptyList();
        C1502p c1502p2 = this.f19323w;
        c1502p2.getClass();
        c1502p2.f19534d = Collections.emptyList();
        x0 x0Var = this.f19322v0;
        ImageView imageView = this.f19280K;
        if (x0Var != null && ((C9.h) x0Var).o(30) && ((C9.h) this.f19322v0).o(29)) {
            N0 Z7 = ((C1549C) this.f19322v0).Z();
            t0 f4 = f(Z7, 1);
            c1502p2.f19534d = f4;
            B b2 = c1502p2.g;
            x0 x0Var2 = b2.f19322v0;
            x0Var2.getClass();
            k5.i f02 = ((C1549C) x0Var2).f0();
            boolean isEmpty = f4.isEmpty();
            w wVar = b2.f19303f;
            if (!isEmpty) {
                if (c1502p2.m(f02)) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= f4.f7343d) {
                            break;
                        }
                        y yVar = (y) f4.get(i7);
                        if (yVar.f19552a.f20111e[yVar.f19553b]) {
                            wVar.f19548e[1] = yVar.f19554c;
                            break;
                        }
                        i7++;
                    }
                } else {
                    wVar.f19548e[1] = b2.getResources().getString(R.string.exo_track_selection_auto);
                }
            } else {
                wVar.f19548e[1] = b2.getResources().getString(R.string.exo_track_selection_none);
            }
            if (this.f19293a.b(imageView)) {
                c1502p.n(f(Z7, 3));
            } else {
                c1502p.n(t0.f7341e);
            }
        }
        k(imageView, c1502p.a() > 0);
        w wVar2 = this.f19303f;
        k(this.f19283N, wVar2.m(1) || wVar2.m(0));
    }
}
