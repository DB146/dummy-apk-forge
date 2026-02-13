package y9;

import A9.C0085f2;
import A9.C0098j;
import A9.C0099j0;
import A9.C0121o2;
import A9.N1;
import A9.t3;
import A9.u3;
import W1.C0558a;
import W1.U;
import Y5.C0660y;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import cn.pedant.SweetAlert.SweetAlertDialog;
import com.kt.apps.core.base.leanback.SeekBar;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.core.utils.AnimationUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import l2.AbstractC1456G;
import m4.C1549C;
import m4.InterfaceC1587p;
import m4.q0;
import m4.v0;
import u.C2054g;

/* renamed from: y9.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2456A extends C0085f2 implements K, L {
    public static final Db.o g2 = android.support.v4.media.session.b.z(new wa.f(16));

    /* renamed from: h2, reason: collision with root package name */
    public static final Db.o f27431h2 = android.support.v4.media.session.b.z(new wa.f(17));

    /* renamed from: A1, reason: collision with root package name */
    public SeekBar f27432A1;
    public ViewGroup B1;

    /* renamed from: C1, reason: collision with root package name */
    public TextView f27433C1;

    /* renamed from: D1, reason: collision with root package name */
    public TextView f27434D1;

    /* renamed from: E1, reason: collision with root package name */
    public View f27435E1;

    /* renamed from: F1, reason: collision with root package name */
    public ViewGroup f27436F1;

    /* renamed from: G1, reason: collision with root package name */
    public ImageView f27437G1;

    /* renamed from: H1, reason: collision with root package name */
    public ImageView f27438H1;

    /* renamed from: I1, reason: collision with root package name */
    public ImageView f27439I1;

    /* renamed from: J1, reason: collision with root package name */
    public View f27440J1;
    public TextView K1;

    /* renamed from: L1, reason: collision with root package name */
    public SweetAlertDialog f27441L1;

    /* renamed from: M1, reason: collision with root package name */
    public N1 f27442M1;

    /* renamed from: Q1, reason: collision with root package name */
    public wa.h f27445Q1;

    /* renamed from: T1, reason: collision with root package name */
    public Timer f27448T1;

    /* renamed from: U1, reason: collision with root package name */
    public final StringBuilder f27449U1;

    /* renamed from: V1, reason: collision with root package name */
    public final Formatter f27450V1;

    /* renamed from: W1, reason: collision with root package name */
    public long f27451W1;

    /* renamed from: X1, reason: collision with root package name */
    public final Db.o f27452X1;

    /* renamed from: Y1, reason: collision with root package name */
    public final Db.o f27453Y1;

    /* renamed from: Z1, reason: collision with root package name */
    public final Db.o f27454Z1;

    /* renamed from: a2, reason: collision with root package name */
    public final Db.o f27455a2;
    public final Db.o b2;

    /* renamed from: c2, reason: collision with root package name */
    public final Db.o f27457c2;

    /* renamed from: d1, reason: collision with root package name */
    public O9.a f27458d1;

    /* renamed from: d2, reason: collision with root package name */
    public t f27459d2;

    /* renamed from: e1, reason: collision with root package name */
    public E9.g f27460e1;
    public boolean e2;

    /* renamed from: f1, reason: collision with root package name */
    public La.g f27461f1;

    /* renamed from: f2, reason: collision with root package name */
    public String f27462f2;

    /* renamed from: g1, reason: collision with root package name */
    public C9.g f27463g1;

    /* renamed from: h1, reason: collision with root package name */
    public C0098j f27464h1;

    /* renamed from: i1, reason: collision with root package name */
    public t3 f27465i1;

    /* renamed from: j1, reason: collision with root package name */
    public u3 f27466j1;

    /* renamed from: k1, reason: collision with root package name */
    public SurfaceView f27467k1;

    /* renamed from: l1, reason: collision with root package name */
    public C9.a f27468l1;

    /* renamed from: m1, reason: collision with root package name */
    public int f27469m1;

    /* renamed from: o1, reason: collision with root package name */
    public float f27471o1;
    public FrameLayout p1;

    /* renamed from: q1, reason: collision with root package name */
    public ImageButton f27472q1;

    /* renamed from: r1, reason: collision with root package name */
    public View f27473r1;

    /* renamed from: s1, reason: collision with root package name */
    public View f27474s1;
    public View t1;

    /* renamed from: u1, reason: collision with root package name */
    public LinearLayout f27475u1;

    /* renamed from: v1, reason: collision with root package name */
    public TextView f27476v1;

    /* renamed from: w1, reason: collision with root package name */
    public TextView f27477w1;

    /* renamed from: x1, reason: collision with root package name */
    public View f27478x1;

    /* renamed from: y1, reason: collision with root package name */
    public TextView f27479y1;

    /* renamed from: z1, reason: collision with root package name */
    public TextView f27480z1;

    /* renamed from: c1, reason: collision with root package name */
    public final Db.o f27456c1 = android.support.v4.media.session.b.z(new wa.f(18));

    /* renamed from: n1, reason: collision with root package name */
    public int f27470n1 = -1;
    public final C2469l N1 = new Object();

    /* renamed from: O1, reason: collision with root package name */
    public final Db.o f27443O1 = android.support.v4.media.session.b.z(new C2468k(this, 1));

    /* renamed from: P1, reason: collision with root package name */
    public final Db.o f27444P1 = android.support.v4.media.session.b.z(new wa.f(14));

    /* renamed from: R1, reason: collision with root package name */
    public final Db.o f27446R1 = android.support.v4.media.session.b.z(new C2468k(this, 2));

    /* renamed from: S1, reason: collision with root package name */
    public final Db.o f27447S1 = android.support.v4.media.session.b.z(new C2468k(this, 3));

    /* JADX WARN: Type inference failed for: r0v3, types: [y9.l, java.lang.Object] */
    public AbstractC2456A() {
        StringBuilder sb2 = new StringBuilder();
        this.f27449U1 = sb2;
        this.f27450V1 = new Formatter(sb2, Locale.getDefault());
        this.f27452X1 = android.support.v4.media.session.b.z(new C2468k(this, 4));
        this.f27453Y1 = android.support.v4.media.session.b.z(new C2468k(this, 5));
        this.f27454Z1 = android.support.v4.media.session.b.z(new C2468k(this, 6));
        this.f27455a2 = android.support.v4.media.session.b.z(new C2468k(this, 7));
        this.b2 = android.support.v4.media.session.b.z(new C2468k(this, 16));
        this.f27457c2 = android.support.v4.media.session.b.z(new C2468k(this, 0));
        this.f27459d2 = t.f27537d;
        this.f27462f2 = "";
    }

    public static final void O0(AbstractC2456A abstractC2456A) {
        LinearLayout linearLayout = abstractC2456A.f27475u1;
        if (linearLayout != null) {
            AnimationUtilsKt.fadeOut$default(linearLayout, false, null, 3, null);
        }
        FrameLayout frameLayout = abstractC2456A.p1;
        if (frameLayout != null) {
            AnimationUtilsKt.translateY$default(frameLayout, 0.0f, null, new C2468k(abstractC2456A, 10), 2, null);
        }
    }

    public final void D0() {
        View view;
        SeekBar seekBar;
        if (Build.VERSION.SDK_INT >= 26 && (seekBar = this.f27432A1) != null) {
            ViewGroup viewGroup = this.B1;
            int i7 = 0;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                i7 = 1;
            }
            seekBar.setFocusable(i7);
        }
        t3 t3Var = this.f27465i1;
        if (t3Var != null && (view = t3Var.f1271a) != null) {
            view.setNextFocusUpId(R.id.ic_play_pause);
        }
        FrameLayout frameLayout = this.p1;
        if (frameLayout != null) {
            frameLayout.setNextFocusUpId(R.id.ic_play_pause);
        }
    }

    public void E0(String number) {
        kotlin.jvm.internal.l.e(number, "number");
    }

    public final void F0(View view) {
        ImageButton imageButton;
        if (view != null) {
            view.requestFocus();
            return;
        }
        ImageButton imageButton2 = this.f27472q1;
        if ((imageButton2 == null || true != imageButton2.isFocused()) && (imageButton = this.f27472q1) != null) {
            imageButton.requestFocus();
        }
    }

    public N9.a G0() {
        return null;
    }

    public final E9.g H0() {
        E9.g gVar = this.f27460e1;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.l.j("exoPlayerManager");
        throw null;
    }

    public final ValueAnimator I0() {
        return (ValueAnimator) this.f27454Z1.getValue();
    }

    public abstract AbstractC1456G J0();

    public final v K0() {
        return (v) this.f27452X1.getValue();
    }

    public final ValueAnimator.AnimatorUpdateListener L0() {
        return (ValueAnimator.AnimatorUpdateListener) this.f27455a2.getValue();
    }

    public final C0121o2 M0() {
        return (C0121o2) this.f27456c1.getValue();
    }

    public final void N0(t tVar, boolean z8, View view) {
        FrameLayout frameLayout;
        VerticalGridView verticalGridView;
        ViewPropertyAnimator animate;
        VerticalGridView verticalGridView2;
        String message = "currentState: " + this.f27459d2 + ",targetState: " + tVar;
        kotlin.jvm.internal.l.e(message, "message");
        t tVar2 = this.f27459d2;
        int ordinal = tVar.ordinal();
        Db.o oVar = this.f27457c2;
        Db.o oVar2 = this.b2;
        if (ordinal == 0) {
            t tVar3 = t.f27536c;
            if (tVar2 == tVar3) {
                t3 t3Var = this.f27465i1;
                if (t3Var != null && (verticalGridView = t3Var.f1376c) != null) {
                    verticalGridView.h0(0);
                }
                F0(view);
                I0().cancel();
                I0().removeAllUpdateListeners();
                I0().addUpdateListener((ValueAnimator.AnimatorUpdateListener) oVar.getValue());
                I0().addUpdateListener((ValueAnimator.AnimatorUpdateListener) oVar2.getValue());
                I0().start();
                FrameLayout frameLayout2 = this.p1;
                if (frameLayout2 != null) {
                    AnimationUtilsKt.translateY$default(frameLayout2, this.f27471o1, null, new r(this, view, 1), 2, null);
                }
            } else if (tVar2 == t.f27535b) {
                if (I0().isRunning()) {
                    I0().pause();
                    I0().addUpdateListener((ValueAnimator.AnimatorUpdateListener) oVar.getValue());
                    I0().resume();
                } else {
                    View view2 = this.f27435E1;
                    if (view2 != null) {
                        AnimationUtilsKt.fadeIn$default(view2, false, new wa.f(15), 1, null);
                    }
                    ImageButton imageButton = this.f27472q1;
                    if (imageButton != null) {
                        AnimationUtilsKt.fadeIn$default(imageButton, false, new r(this, view, 2), 1, null);
                    }
                }
            } else if (tVar2 == t.f27537d) {
                I0().cancel();
                I0().removeAllUpdateListeners();
                I0().addUpdateListener(L0());
                I0().addUpdateListener((ValueAnimator.AnimatorUpdateListener) oVar.getValue());
                I0().addUpdateListener((ValueAnimator.AnimatorUpdateListener) oVar2.getValue());
                I0().start();
            }
            if (tVar2 != tVar3) {
                float f4 = this.f27471o1;
                if (f4 > 0.0f && (frameLayout = this.p1) != null) {
                    frameLayout.setTranslationY(f4);
                }
                F0(view);
            }
        } else if (ordinal == 1) {
            t3 t3Var2 = this.f27465i1;
            if (t3Var2 != null && (verticalGridView2 = t3Var2.f1376c) != null) {
                verticalGridView2.h0(0);
            }
            int ordinal2 = tVar2.ordinal();
            if (ordinal2 == 0) {
                I0().removeUpdateListener((ValueAnimator.AnimatorUpdateListener) oVar.getValue());
                ImageButton imageButton2 = this.f27472q1;
                if (imageButton2 != null) {
                    imageButton2.setAlpha(0.0f);
                }
            } else if (ordinal2 == 2) {
                I0().removeAllUpdateListeners();
                I0().cancel();
                I0().addUpdateListener((ValueAnimator.AnimatorUpdateListener) oVar2.getValue());
                I0().start();
                FrameLayout frameLayout3 = this.p1;
                if (frameLayout3 != null) {
                    AnimationUtilsKt.translateY(frameLayout3, this.f27471o1, new C2468k(this, 11), new C2468k(this, 12));
                }
            } else if (ordinal2 != 3) {
                ImageButton imageButton3 = this.f27472q1;
                if (imageButton3 != null && (animate = imageButton3.animate()) != null) {
                    animate.cancel();
                }
                ImageButton imageButton4 = this.f27472q1;
                if (imageButton4 != null) {
                    imageButton4.setAlpha(0.0f);
                }
            } else {
                I0().cancel();
                ImageButton imageButton5 = this.f27472q1;
                if (imageButton5 != null) {
                    imageButton5.setAlpha(0.0f);
                }
                FrameLayout frameLayout4 = this.p1;
                if (frameLayout4 != null) {
                    frameLayout4.setTranslationY(this.f27471o1);
                }
                I0().removeAllUpdateListeners();
                I0().addUpdateListener(L0());
                I0().addUpdateListener((ValueAnimator.AnimatorUpdateListener) oVar2.getValue());
                I0().start();
            }
            F0(view);
        } else if (ordinal == 2) {
            FrameLayout frameLayout5 = this.p1;
            Float valueOf = frameLayout5 != null ? Float.valueOf(frameLayout5.getTranslationY()) : null;
            String message2 = "y = " + valueOf + " - " + this.f27471o1;
            kotlin.jvm.internal.l.e(message2, "message");
            if (tVar2 == t.f27537d) {
                View view3 = this.f27474s1;
                if (view3 != null) {
                    AnimationUtilsKt.fadeIn$default(view3, false, new C2468k(this, 9), 1, null);
                }
            } else if ((tVar2 == t.f27534a || tVar2 == t.f27535b) && I0().isRunning()) {
                I0().pause();
                I0().addListener(new u(this, 1));
                I0().resume();
            } else {
                View view4 = this.f27474s1;
                if (view4 == null || view4.getVisibility() != 0) {
                    I0().removeAllUpdateListeners();
                    I0().addUpdateListener(L0());
                    I0().addListener(new u(this, 2));
                    I0().start();
                } else {
                    LinearLayout linearLayout = this.f27475u1;
                    if (linearLayout != null && linearLayout.getVisibility() == 0) {
                        I0().cancel();
                        O0(this);
                    }
                }
            }
        } else {
            if (ordinal != 3) {
                throw new Db.d(1);
            }
            I0().cancel();
            I0().removeAllUpdateListeners();
            Message.obtain(K0(), 1003).sendToTarget();
        }
        Message.obtain(K0(), 1000).sendToTarget();
        if (z8) {
            Z0();
        }
        this.f27459d2 = tVar;
    }

    public final void P0() {
        View findViewById;
        View view = this.f27474s1;
        if (view != null) {
            AnimationUtilsKt.fadeOut$default(view, false, new wa.f(15), 1, null);
        }
        this.f27459d2 = t.f27537d;
        W1.C S02 = S0();
        if (!K() || S02 == null) {
            return;
        }
        View view2 = this.f10277U;
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup == null) {
            return;
        }
        if (viewGroup.findViewById(R.id.container_program) == null) {
            viewGroup.addView(LayoutInflater.from(i0()).inflate(R.layout.container_program, viewGroup, false));
        } else {
            View view3 = this.f10277U;
            if (view3 != null && (findViewById = view3.findViewById(R.id.container_program)) != null) {
                AnimationUtilsKt.fadeIn$default(findViewById, false, new wa.f(15), 1, null);
            }
        }
        W1.C D10 = B().D(R.id.container_program);
        if (D10 == null) {
            U B10 = B();
            B10.getClass();
            C0558a c0558a = new C0558a(B10);
            c0558a.j(R.id.container_program, S02, null);
            c0558a.f();
            return;
        }
        if (D10.L() || D10.f10272P || D10.f10258A) {
            U B11 = B();
            B11.getClass();
            C0558a c0558a2 = new C0558a(B11);
            c0558a2.j(R.id.container_program, S02, null);
            c0558a2.f();
        }
    }

    public final void Q0() {
        Message.obtain(K0(), 1000).sendToTarget();
        Z0();
    }

    @Override // W1.C
    public void R(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        super.R(context);
    }

    public final boolean R0() {
        W1.C D10;
        W1.C D11;
        try {
            if (!K() || (D10 = B().D(R.id.container_program)) == null || !D10.K()) {
                return false;
            }
            W1.C D12 = B().D(R.id.container_program);
            if ((D12 == null || !D12.f10272P) && (D11 = B().D(R.id.container_program)) != null) {
                return D11.N();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public W1.C S0() {
        return null;
    }

    @Override // A9.C0085f2, W1.C
    public View T(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        final int i7 = 1;
        final int i10 = 5;
        final int i11 = 0;
        final int i12 = 2;
        kotlin.jvm.internal.l.e(inflater, "inflater");
        View T10 = super.T(inflater, viewGroup, bundle);
        kotlin.jvm.internal.l.c(T10, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) T10;
        M0().f1327a = 0L;
        View inflate = LayoutInflater.from(C()).inflate(R.layout.core_layout_surfaces, viewGroup2, false);
        kotlin.jvm.internal.l.c(inflate, "null cannot be cast to non-null type android.view.SurfaceView");
        SurfaceView surfaceView = (SurfaceView) inflate;
        this.f27467k1 = surfaceView;
        viewGroup2.addView(surfaceView, 0);
        viewGroup2.getViewTreeObserver().addOnGlobalLayoutListener(new x(this, viewGroup2));
        SurfaceView surfaceView2 = this.f27467k1;
        kotlin.jvm.internal.l.b(surfaceView2);
        surfaceView2.getHolder().addCallback(new c2.x(this, i12));
        if (2 != this.f1157B0) {
            this.f1157B0 = 2;
            C0();
        }
        View inflate2 = LayoutInflater.from(C()).inflate(R.layout.playback_vertical_grid_overlay, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.f27474s1 = inflate2;
        inflate2.setLayoutParams(layoutParams);
        this.p1 = (FrameLayout) inflate2.findViewById(R.id.browse_grid_dock);
        u3 u3Var = new u3();
        u3Var.f1415d = false;
        this.f27466j1 = u3Var;
        u3Var.j(5);
        u3 u3Var2 = this.f27466j1;
        kotlin.jvm.internal.l.b(u3Var2);
        t3 d10 = u3Var2.d(this.p1);
        this.f27465i1 = d10;
        FrameLayout frameLayout = this.p1;
        if (frameLayout != null) {
            frameLayout.addView(d10.f1271a);
        }
        u3 u3Var3 = this.f27466j1;
        if (u3Var3 != null) {
            u3Var3.f1416e = new Ca.p(2);
        }
        if (u3Var3 != null) {
            u3Var3.f1417f = new p(this);
        }
        t3 t3Var = this.f27465i1;
        kotlin.jvm.internal.l.b(t3Var);
        t3Var.f1376c.setOnChildLaidOutListener(this.N1);
        u3 u3Var4 = this.f27466j1;
        kotlin.jvm.internal.l.b(u3Var4);
        u3Var4.c(this.f27465i1, this.f27464h1);
        inflate2.setVisibility(8);
        viewGroup2.addView(inflate2);
        this.f27440J1 = LayoutInflater.from(C()).inflate(R.layout.layout_tv_channel_number, viewGroup, false);
        View inflate3 = LayoutInflater.from(C()).inflate(R.layout.layout_video_codec_info, viewGroup, false);
        kotlin.jvm.internal.l.c(inflate3, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup3 = (ViewGroup) inflate3;
        this.f27436F1 = viewGroup3;
        DataBinderMapperImpl dataBinderMapperImpl = J1.e.f5416a;
        boolean z8 = J1.k.f5429y;
        J1.k kVar = (J1.k) viewGroup3.getTag(R.id.dataBinding);
        if (kVar == null) {
            Object tag = viewGroup3.getTag();
            if (!(tag instanceof String)) {
                throw new IllegalArgumentException("View is not a binding layout");
            }
            DataBinderMapperImpl dataBinderMapperImpl2 = J1.e.f5416a;
            int d11 = dataBinderMapperImpl2.d((String) tag);
            if (d11 == 0) {
                throw new IllegalArgumentException(X.c.g(tag, "View is not a binding layout. Tag: "));
            }
            kVar = dataBinderMapperImpl2.b(viewGroup3, d11);
        }
        viewGroup2.addView(this.f27436F1);
        View view = this.f27440J1;
        if (view != null) {
            viewGroup2.addView(view);
        }
        this.t1 = viewGroup2.findViewById(R.id.playback_fragment_background);
        this.f27476v1 = (TextView) viewGroup2.findViewById(R.id.playback_title);
        this.f27477w1 = (TextView) viewGroup2.findViewById(R.id.playback_info);
        this.f27478x1 = viewGroup2.findViewById(R.id.playback_live_container);
        this.f27479y1 = (TextView) viewGroup2.findViewById(R.id.playback_live);
        this.f27480z1 = (TextView) viewGroup2.findViewById(R.id.playback_live_program_duration);
        this.f27475u1 = (LinearLayout) viewGroup2.findViewById(R.id.info_container);
        this.f27472q1 = (ImageButton) viewGroup2.findViewById(R.id.ic_play_pause);
        this.f27432A1 = (SeekBar) viewGroup2.findViewById(R.id.video_progress_bar);
        this.B1 = (ViewGroup) viewGroup2.findViewById(R.id.progress_bar_container);
        this.f27433C1 = (TextView) viewGroup2.findViewById(R.id.content_position);
        this.f27434D1 = (TextView) viewGroup2.findViewById(R.id.content_duration);
        this.f27437G1 = (ImageView) viewGroup2.findViewById(R.id.btn_video_codec_info);
        this.f27435E1 = viewGroup2.findViewById(R.id.center_controls_container);
        this.f27438H1 = (ImageView) viewGroup2.findViewById(R.id.btn_favourite);
        this.f27473r1 = viewGroup2.findViewById(R.id.btn_program_list);
        this.f27439I1 = (ImageView) viewGroup2.findViewById(R.id.btn_voice);
        C0121o2 M02 = M0();
        View view2 = this.f27435E1;
        kotlin.jvm.internal.l.b(view2);
        M02.f1329c = (ViewGroup) view2;
        this.K1 = (TextView) viewGroup2.findViewById(R.id.channel_number);
        A0(false, false);
        View findViewById = viewGroup2.findViewById(R.id.playback_controls_dock);
        kotlin.jvm.internal.l.b(findViewById);
        findViewById.setVisibility(8);
        ImageButton imageButton = this.f27472q1;
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: y9.o

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbstractC2456A f27523b;

                {
                    this.f27523b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    AbstractC2456A abstractC2456A = this.f27523b;
                    switch (i11) {
                        case 0:
                            Db.o oVar = AbstractC2456A.g2;
                            abstractC2456A.getClass();
                            try {
                                if (abstractC2456A.R0()) {
                                    return;
                                }
                                ViewGroup viewGroup4 = abstractC2456A.f27436F1;
                                if (viewGroup4 == null || viewGroup4.getVisibility() != 0) {
                                    if (abstractC2456A.f27459d2 == t.f27537d) {
                                        abstractC2456A.N0(t.f27534a, true, null);
                                    }
                                    C9.b bVar = abstractC2456A.H0().f3820w;
                                    if (bVar == null || true != bVar.s()) {
                                        C9.b bVar2 = abstractC2456A.H0().f3820w;
                                        if (bVar2 != null) {
                                            bVar2.Q();
                                            return;
                                        }
                                        return;
                                    }
                                    C9.b bVar3 = abstractC2456A.H0().f3820w;
                                    if (bVar3 != null) {
                                        bVar3.P();
                                    }
                                    Message.obtain(abstractC2456A.K0(), 1000).sendToTarget();
                                    return;
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 1:
                            Db.o oVar2 = AbstractC2456A.g2;
                            Message.obtain(abstractC2456A.K0(), 1003).sendToTarget();
                            ((Runnable) abstractC2456A.f27453Y1.getValue()).run();
                            ViewGroup viewGroup5 = abstractC2456A.f27436F1;
                            if (viewGroup5 != null) {
                                AnimationUtilsKt.fadeIn$default(viewGroup5, false, new wa.f(15), 1, null);
                                return;
                            }
                            return;
                        case 2:
                            Db.o oVar3 = AbstractC2456A.g2;
                            view3.setSelected(!view3.isSelected());
                            abstractC2456A.T0(view3.isSelected());
                            abstractC2456A.Q0();
                            return;
                        case 3:
                            Db.o oVar4 = AbstractC2456A.g2;
                            abstractC2456A.P0();
                            return;
                        case 4:
                            Db.o oVar5 = AbstractC2456A.g2;
                            view3.setSelected(!view3.isSelected());
                            abstractC2456A.h1(null);
                            abstractC2456A.Q0();
                            return;
                        default:
                            TextView textView = abstractC2456A.f27477w1;
                            if ((textView != null ? textView.getMaxLines() : 0) < 100) {
                                TextView textView2 = abstractC2456A.f27477w1;
                                if (textView2 != null) {
                                    textView2.setMaxLines(100);
                                    return;
                                }
                                return;
                            }
                            TextView textView3 = abstractC2456A.f27477w1;
                            if (textView3 != null) {
                                textView3.setMaxLines(2);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        M0().f1328b = new p(this);
        ViewGroup viewGroup4 = this.f27436F1;
        if (viewGroup4 != null) {
            AnimationUtilsKt.gone(viewGroup4);
        }
        ImageView imageView = this.f27437G1;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: y9.o

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbstractC2456A f27523b;

                {
                    this.f27523b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    AbstractC2456A abstractC2456A = this.f27523b;
                    switch (i7) {
                        case 0:
                            Db.o oVar = AbstractC2456A.g2;
                            abstractC2456A.getClass();
                            try {
                                if (abstractC2456A.R0()) {
                                    return;
                                }
                                ViewGroup viewGroup42 = abstractC2456A.f27436F1;
                                if (viewGroup42 == null || viewGroup42.getVisibility() != 0) {
                                    if (abstractC2456A.f27459d2 == t.f27537d) {
                                        abstractC2456A.N0(t.f27534a, true, null);
                                    }
                                    C9.b bVar = abstractC2456A.H0().f3820w;
                                    if (bVar == null || true != bVar.s()) {
                                        C9.b bVar2 = abstractC2456A.H0().f3820w;
                                        if (bVar2 != null) {
                                            bVar2.Q();
                                            return;
                                        }
                                        return;
                                    }
                                    C9.b bVar3 = abstractC2456A.H0().f3820w;
                                    if (bVar3 != null) {
                                        bVar3.P();
                                    }
                                    Message.obtain(abstractC2456A.K0(), 1000).sendToTarget();
                                    return;
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 1:
                            Db.o oVar2 = AbstractC2456A.g2;
                            Message.obtain(abstractC2456A.K0(), 1003).sendToTarget();
                            ((Runnable) abstractC2456A.f27453Y1.getValue()).run();
                            ViewGroup viewGroup5 = abstractC2456A.f27436F1;
                            if (viewGroup5 != null) {
                                AnimationUtilsKt.fadeIn$default(viewGroup5, false, new wa.f(15), 1, null);
                                return;
                            }
                            return;
                        case 2:
                            Db.o oVar3 = AbstractC2456A.g2;
                            view3.setSelected(!view3.isSelected());
                            abstractC2456A.T0(view3.isSelected());
                            abstractC2456A.Q0();
                            return;
                        case 3:
                            Db.o oVar4 = AbstractC2456A.g2;
                            abstractC2456A.P0();
                            return;
                        case 4:
                            Db.o oVar5 = AbstractC2456A.g2;
                            view3.setSelected(!view3.isSelected());
                            abstractC2456A.h1(null);
                            abstractC2456A.Q0();
                            return;
                        default:
                            TextView textView = abstractC2456A.f27477w1;
                            if ((textView != null ? textView.getMaxLines() : 0) < 100) {
                                TextView textView2 = abstractC2456A.f27477w1;
                                if (textView2 != null) {
                                    textView2.setMaxLines(100);
                                    return;
                                }
                                return;
                            }
                            TextView textView3 = abstractC2456A.f27477w1;
                            if (textView3 != null) {
                                textView3.setMaxLines(2);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        ImageView imageView2 = this.f27438H1;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: y9.o

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbstractC2456A f27523b;

                {
                    this.f27523b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    AbstractC2456A abstractC2456A = this.f27523b;
                    switch (i12) {
                        case 0:
                            Db.o oVar = AbstractC2456A.g2;
                            abstractC2456A.getClass();
                            try {
                                if (abstractC2456A.R0()) {
                                    return;
                                }
                                ViewGroup viewGroup42 = abstractC2456A.f27436F1;
                                if (viewGroup42 == null || viewGroup42.getVisibility() != 0) {
                                    if (abstractC2456A.f27459d2 == t.f27537d) {
                                        abstractC2456A.N0(t.f27534a, true, null);
                                    }
                                    C9.b bVar = abstractC2456A.H0().f3820w;
                                    if (bVar == null || true != bVar.s()) {
                                        C9.b bVar2 = abstractC2456A.H0().f3820w;
                                        if (bVar2 != null) {
                                            bVar2.Q();
                                            return;
                                        }
                                        return;
                                    }
                                    C9.b bVar3 = abstractC2456A.H0().f3820w;
                                    if (bVar3 != null) {
                                        bVar3.P();
                                    }
                                    Message.obtain(abstractC2456A.K0(), 1000).sendToTarget();
                                    return;
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 1:
                            Db.o oVar2 = AbstractC2456A.g2;
                            Message.obtain(abstractC2456A.K0(), 1003).sendToTarget();
                            ((Runnable) abstractC2456A.f27453Y1.getValue()).run();
                            ViewGroup viewGroup5 = abstractC2456A.f27436F1;
                            if (viewGroup5 != null) {
                                AnimationUtilsKt.fadeIn$default(viewGroup5, false, new wa.f(15), 1, null);
                                return;
                            }
                            return;
                        case 2:
                            Db.o oVar3 = AbstractC2456A.g2;
                            view3.setSelected(!view3.isSelected());
                            abstractC2456A.T0(view3.isSelected());
                            abstractC2456A.Q0();
                            return;
                        case 3:
                            Db.o oVar4 = AbstractC2456A.g2;
                            abstractC2456A.P0();
                            return;
                        case 4:
                            Db.o oVar5 = AbstractC2456A.g2;
                            view3.setSelected(!view3.isSelected());
                            abstractC2456A.h1(null);
                            abstractC2456A.Q0();
                            return;
                        default:
                            TextView textView = abstractC2456A.f27477w1;
                            if ((textView != null ? textView.getMaxLines() : 0) < 100) {
                                TextView textView2 = abstractC2456A.f27477w1;
                                if (textView2 != null) {
                                    textView2.setMaxLines(100);
                                    return;
                                }
                                return;
                            }
                            TextView textView3 = abstractC2456A.f27477w1;
                            if (textView3 != null) {
                                textView3.setMaxLines(2);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        View view3 = this.f27473r1;
        if (view3 != null) {
            final int i13 = 3;
            view3.setOnClickListener(new View.OnClickListener(this) { // from class: y9.o

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbstractC2456A f27523b;

                {
                    this.f27523b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    AbstractC2456A abstractC2456A = this.f27523b;
                    switch (i13) {
                        case 0:
                            Db.o oVar = AbstractC2456A.g2;
                            abstractC2456A.getClass();
                            try {
                                if (abstractC2456A.R0()) {
                                    return;
                                }
                                ViewGroup viewGroup42 = abstractC2456A.f27436F1;
                                if (viewGroup42 == null || viewGroup42.getVisibility() != 0) {
                                    if (abstractC2456A.f27459d2 == t.f27537d) {
                                        abstractC2456A.N0(t.f27534a, true, null);
                                    }
                                    C9.b bVar = abstractC2456A.H0().f3820w;
                                    if (bVar == null || true != bVar.s()) {
                                        C9.b bVar2 = abstractC2456A.H0().f3820w;
                                        if (bVar2 != null) {
                                            bVar2.Q();
                                            return;
                                        }
                                        return;
                                    }
                                    C9.b bVar3 = abstractC2456A.H0().f3820w;
                                    if (bVar3 != null) {
                                        bVar3.P();
                                    }
                                    Message.obtain(abstractC2456A.K0(), 1000).sendToTarget();
                                    return;
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 1:
                            Db.o oVar2 = AbstractC2456A.g2;
                            Message.obtain(abstractC2456A.K0(), 1003).sendToTarget();
                            ((Runnable) abstractC2456A.f27453Y1.getValue()).run();
                            ViewGroup viewGroup5 = abstractC2456A.f27436F1;
                            if (viewGroup5 != null) {
                                AnimationUtilsKt.fadeIn$default(viewGroup5, false, new wa.f(15), 1, null);
                                return;
                            }
                            return;
                        case 2:
                            Db.o oVar3 = AbstractC2456A.g2;
                            view32.setSelected(!view32.isSelected());
                            abstractC2456A.T0(view32.isSelected());
                            abstractC2456A.Q0();
                            return;
                        case 3:
                            Db.o oVar4 = AbstractC2456A.g2;
                            abstractC2456A.P0();
                            return;
                        case 4:
                            Db.o oVar5 = AbstractC2456A.g2;
                            view32.setSelected(!view32.isSelected());
                            abstractC2456A.h1(null);
                            abstractC2456A.Q0();
                            return;
                        default:
                            TextView textView = abstractC2456A.f27477w1;
                            if ((textView != null ? textView.getMaxLines() : 0) < 100) {
                                TextView textView2 = abstractC2456A.f27477w1;
                                if (textView2 != null) {
                                    textView2.setMaxLines(100);
                                    return;
                                }
                                return;
                            }
                            TextView textView3 = abstractC2456A.f27477w1;
                            if (textView3 != null) {
                                textView3.setMaxLines(2);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        ImageView imageView3 = this.f27439I1;
        if (imageView3 != null) {
            final int i14 = 4;
            imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: y9.o

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbstractC2456A f27523b;

                {
                    this.f27523b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    AbstractC2456A abstractC2456A = this.f27523b;
                    switch (i14) {
                        case 0:
                            Db.o oVar = AbstractC2456A.g2;
                            abstractC2456A.getClass();
                            try {
                                if (abstractC2456A.R0()) {
                                    return;
                                }
                                ViewGroup viewGroup42 = abstractC2456A.f27436F1;
                                if (viewGroup42 == null || viewGroup42.getVisibility() != 0) {
                                    if (abstractC2456A.f27459d2 == t.f27537d) {
                                        abstractC2456A.N0(t.f27534a, true, null);
                                    }
                                    C9.b bVar = abstractC2456A.H0().f3820w;
                                    if (bVar == null || true != bVar.s()) {
                                        C9.b bVar2 = abstractC2456A.H0().f3820w;
                                        if (bVar2 != null) {
                                            bVar2.Q();
                                            return;
                                        }
                                        return;
                                    }
                                    C9.b bVar3 = abstractC2456A.H0().f3820w;
                                    if (bVar3 != null) {
                                        bVar3.P();
                                    }
                                    Message.obtain(abstractC2456A.K0(), 1000).sendToTarget();
                                    return;
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 1:
                            Db.o oVar2 = AbstractC2456A.g2;
                            Message.obtain(abstractC2456A.K0(), 1003).sendToTarget();
                            ((Runnable) abstractC2456A.f27453Y1.getValue()).run();
                            ViewGroup viewGroup5 = abstractC2456A.f27436F1;
                            if (viewGroup5 != null) {
                                AnimationUtilsKt.fadeIn$default(viewGroup5, false, new wa.f(15), 1, null);
                                return;
                            }
                            return;
                        case 2:
                            Db.o oVar3 = AbstractC2456A.g2;
                            view32.setSelected(!view32.isSelected());
                            abstractC2456A.T0(view32.isSelected());
                            abstractC2456A.Q0();
                            return;
                        case 3:
                            Db.o oVar4 = AbstractC2456A.g2;
                            abstractC2456A.P0();
                            return;
                        case 4:
                            Db.o oVar5 = AbstractC2456A.g2;
                            view32.setSelected(!view32.isSelected());
                            abstractC2456A.h1(null);
                            abstractC2456A.Q0();
                            return;
                        default:
                            TextView textView = abstractC2456A.f27477w1;
                            if ((textView != null ? textView.getMaxLines() : 0) < 100) {
                                TextView textView2 = abstractC2456A.f27477w1;
                                if (textView2 != null) {
                                    textView2.setMaxLines(100);
                                    return;
                                }
                                return;
                            }
                            TextView textView3 = abstractC2456A.f27477w1;
                            if (textView3 != null) {
                                textView3.setMaxLines(2);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        ImageView imageView4 = this.f27439I1;
        if (imageView4 != null) {
            imageView4.setOnLongClickListener(new Ba.n(i7, this));
        }
        TextView textView = this.f27477w1;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: y9.o

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbstractC2456A f27523b;

                {
                    this.f27523b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    AbstractC2456A abstractC2456A = this.f27523b;
                    switch (i10) {
                        case 0:
                            Db.o oVar = AbstractC2456A.g2;
                            abstractC2456A.getClass();
                            try {
                                if (abstractC2456A.R0()) {
                                    return;
                                }
                                ViewGroup viewGroup42 = abstractC2456A.f27436F1;
                                if (viewGroup42 == null || viewGroup42.getVisibility() != 0) {
                                    if (abstractC2456A.f27459d2 == t.f27537d) {
                                        abstractC2456A.N0(t.f27534a, true, null);
                                    }
                                    C9.b bVar = abstractC2456A.H0().f3820w;
                                    if (bVar == null || true != bVar.s()) {
                                        C9.b bVar2 = abstractC2456A.H0().f3820w;
                                        if (bVar2 != null) {
                                            bVar2.Q();
                                            return;
                                        }
                                        return;
                                    }
                                    C9.b bVar3 = abstractC2456A.H0().f3820w;
                                    if (bVar3 != null) {
                                        bVar3.P();
                                    }
                                    Message.obtain(abstractC2456A.K0(), 1000).sendToTarget();
                                    return;
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 1:
                            Db.o oVar2 = AbstractC2456A.g2;
                            Message.obtain(abstractC2456A.K0(), 1003).sendToTarget();
                            ((Runnable) abstractC2456A.f27453Y1.getValue()).run();
                            ViewGroup viewGroup5 = abstractC2456A.f27436F1;
                            if (viewGroup5 != null) {
                                AnimationUtilsKt.fadeIn$default(viewGroup5, false, new wa.f(15), 1, null);
                                return;
                            }
                            return;
                        case 2:
                            Db.o oVar3 = AbstractC2456A.g2;
                            view32.setSelected(!view32.isSelected());
                            abstractC2456A.T0(view32.isSelected());
                            abstractC2456A.Q0();
                            return;
                        case 3:
                            Db.o oVar4 = AbstractC2456A.g2;
                            abstractC2456A.P0();
                            return;
                        case 4:
                            Db.o oVar5 = AbstractC2456A.g2;
                            view32.setSelected(!view32.isSelected());
                            abstractC2456A.h1(null);
                            abstractC2456A.Q0();
                            return;
                        default:
                            TextView textView2 = abstractC2456A.f27477w1;
                            if ((textView2 != null ? textView2.getMaxLines() : 0) < 100) {
                                TextView textView22 = abstractC2456A.f27477w1;
                                if (textView22 != null) {
                                    textView22.setMaxLines(100);
                                    return;
                                }
                                return;
                            }
                            TextView textView3 = abstractC2456A.f27477w1;
                            if (textView3 != null) {
                                textView3.setMaxLines(2);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        return viewGroup2;
    }

    public void T0(boolean z8) {
    }

    public void U0(q0 error) {
        kotlin.jvm.internal.l.e(error, "error");
    }

    @Override // A9.C0085f2, W1.C
    public void V() {
        this.f27467k1 = null;
        this.f27469m1 = 0;
        super.V();
    }

    public void V0(int i7) {
    }

    @Override // W1.C
    public void W() {
        C1549C c1549c;
        this.p1 = null;
        this.f27472q1 = null;
        this.f27474s1 = null;
        this.t1 = null;
        this.f27467k1 = null;
        this.f27432A1 = null;
        this.B1 = null;
        this.f27434D1 = null;
        this.f27433C1 = null;
        this.f27436F1 = null;
        E9.g H02 = H0();
        w wVar = (w) this.f27446R1.getValue();
        if (wVar != null && (c1549c = H02.f3807c) != null) {
            c1549c.m0(wVar);
        }
        C1549C c1549c2 = H02.f3807c;
        if (c1549c2 != null) {
            c1549c2.m0((v0) H02.f3809e.getValue());
        }
        H02.f3819v.a();
        C9.b bVar = H02.f3820w;
        if (bVar != null) {
            bVar.O();
        }
        C1549C c1549c3 = H02.f3807c;
        if (c1549c3 != null) {
            c1549c3.l0();
        }
        H02.f3807c = null;
        H02.f3820w = null;
        ((s) this.f27443O1.getValue()).c(null);
        this.f27468l1 = null;
        this.f27473r1 = null;
        this.f10275S = true;
    }

    public void W0() {
    }

    public final void X0(List linkStreams, Map playItemMetaData, Map map, boolean z8, boolean z10, boolean z11) {
        kotlin.jvm.internal.l.e(linkStreams, "linkStreams");
        kotlin.jvm.internal.l.e(playItemMetaData, "playItemMetaData");
        SweetAlertDialog sweetAlertDialog = this.f27441L1;
        if (sweetAlertDialog != null) {
            sweetAlertDialog.dismissWithAnimation();
        }
        if (!M0().g) {
            M0().b();
        }
        Db.o oVar = this.f27443O1;
        ((s) oVar.getValue()).c(null);
        H0().d(linkStreams, z8, playItemMetaData, (w) this.f27446R1.getValue(), map);
        C9.g gVar = new C9.g(A(), H0().f3820w);
        this.f27463g1 = gVar;
        gVar.c((s) oVar.getValue());
        C9.g gVar2 = this.f27463g1;
        if (gVar2 == null) {
            kotlin.jvm.internal.l.j("mTransportControlGlue");
            throw null;
        }
        gVar2.f3091C = true;
        if (gVar2.f3072d.L()) {
            gVar2.b();
        } else {
            C0099j0 c0099j0 = new C0099j0(gVar2, 1);
            if (gVar2.f3071c == null) {
                gVar2.f3071c = new ArrayList();
            }
            gVar2.f3071c.add(c0099j0);
        }
        Q0();
        String message = "PlayVideo: " + new G8.m().f(linkStreams);
        kotlin.jvm.internal.l.e(message, "message");
        if (!z11 || R0()) {
            t tVar = this.f27459d2;
            if (tVar != t.f27536c && !z11 && tVar != t.f27537d) {
                e1(true);
            }
        } else {
            c1((String) playItemMetaData.get("extra:media_title"), (String) playItemMetaData.get("extra:media_description"), z10);
            e1(false);
        }
        ViewGroup viewGroup = this.B1;
        if (viewGroup != null) {
            AnimationUtilsKt.visible(viewGroup);
        }
        D0();
        SeekBar seekBar = this.f27432A1;
        if (seekBar != null) {
            seekBar.setActivated(false);
        }
        SeekBar seekBar2 = this.f27432A1;
        if (seekBar2 != null) {
            seekBar2.setFocusable(false);
        }
    }

    @Override // A9.C0085f2, W1.C
    public void Y() {
        super.Y();
        O5.b.q().f27485a = null;
    }

    public final void Y0(String title, String str, boolean z8, boolean z10) {
        kotlin.jvm.internal.l.e(title, "title");
        String message = title + " - " + str + " - " + z8;
        kotlin.jvm.internal.l.e(message, "message");
        Message.obtain(K0(), 1000).sendToTarget();
        c1(title, str, z8);
        if (z10) {
            M0().b();
        }
        if (M0().g) {
            e1(false);
        } else {
            e1(true);
        }
        ViewGroup viewGroup = this.B1;
        if (viewGroup != null) {
            AnimationUtilsKt.visible(viewGroup);
        }
    }

    @Override // A9.C0085f2, W1.C
    public final void Z() {
        l2.H b2;
        super.Z();
        wa.h hVar = this.f27445Q1;
        if (hVar != null) {
            hVar.a();
        }
        wa.h hVar2 = this.f27445Q1;
        if (hVar2 != null && (b2 = hVar2.b()) != null) {
            b2.e(H(), new Aa.b(new C2470m(this, 0), 11));
        }
        float f4 = this.f27471o1;
        FrameLayout frameLayout = this.p1;
        Float valueOf = frameLayout != null ? Float.valueOf(frameLayout.getTranslationY()) : null;
        if (valueOf == null || f4 != valueOf.floatValue()) {
            FrameLayout frameLayout2 = this.p1;
            if (frameLayout2 != null) {
                frameLayout2.requestFocus();
            }
        } else {
            ImageButton imageButton = this.f27472q1;
            if (imageButton != null) {
                imageButton.requestFocus();
            }
        }
        if (this instanceof Aa.w) {
            O5.b.q().f27485a = new n5.h(this, 1);
        }
    }

    public final void Z0() {
        Message obtain = Message.obtain(K0(), 1002);
        obtain.obj = (Runnable) this.f27453Y1.getValue();
        obtain.arg1 = 1001;
        obtain.sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0158, code lost:
    
        if (r2 == null) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a1(C1549C c1549c) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        Object obj;
        String str;
        View view;
        TextView textView9;
        View view2;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        N9.a G02 = G0();
        String str2 = "LIVE";
        Formatter formatter = this.f27450V1;
        StringBuilder sb2 = this.f27449U1;
        String str3 = null;
        if (G02 != null) {
            View view3 = this.f10277U;
            if (view3 != null && (textView12 = (TextView) view3.findViewById(R.id.video_title)) != null) {
                String str4 = G02.f7393e;
                int length = str4.length();
                CharSequence charSequence = str4;
                if (length <= 0) {
                    charSequence = null;
                }
                if (charSequence == null) {
                    c1549c.E0();
                    charSequence = c1549c.f19842a0.f20319a;
                }
                textView12.setText(charSequence);
            }
            View view4 = this.f10277U;
            if (view4 != null && (textView11 = (TextView) view4.findViewById(R.id.video_duration)) != null) {
                if (G02.f7391c.length() > 0 && G02.f7392d.length() > 0) {
                    str2 = n5.D.B(sb2, formatter, G02.a() - G02.d());
                }
                textView11.setText(str2);
            }
        } else {
            View view5 = this.f10277U;
            if (view5 != null && (textView5 = (TextView) view5.findViewById(R.id.video_title)) != null) {
                c1549c.E0();
                textView5.setText(c1549c.f19842a0.f20319a);
            }
            if (c1549c.j() < 120000) {
                View view6 = this.f10277U;
                if (view6 != null && (textView4 = (TextView) view6.findViewById(R.id.video_duration)) != null) {
                    textView4.setText("LIVE");
                }
                View view7 = this.f10277U;
                if (view7 != null && (textView3 = (TextView) view7.findViewById(R.id.video_duration_title)) != null) {
                    AnimationUtilsKt.visible(textView3);
                }
            } else {
                View view8 = this.f10277U;
                if (view8 != null && (textView2 = (TextView) view8.findViewById(R.id.video_duration_title)) != null) {
                    AnimationUtilsKt.visible(textView2);
                }
                View view9 = this.f10277U;
                if (view9 != null && (textView = (TextView) view9.findViewById(R.id.video_duration)) != null) {
                    AnimationUtilsKt.visible(textView);
                    textView.setText(n5.D.B(sb2, formatter, c1549c.j()));
                }
            }
        }
        c1549c.E0();
        int i7 = c1549c.f19868u0.f22048a;
        Integer valueOf = Integer.valueOf(i7);
        if (i7 <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            c1549c.E0();
            int i10 = c1549c.f19868u0.f22048a;
            c1549c.E0();
            String str5 = i10 + "x" + c1549c.f19868u0.f22049b;
            if (str5 != null && (view2 = this.f10277U) != null && (textView10 = (TextView) view2.findViewById(R.id.video_resolution)) != null) {
                textView10.setText(str5);
            }
        }
        c1549c.E0();
        m4.L l10 = c1549c.f19844b0;
        if (l10 != null && (str = l10.f20093w) != null && (view = this.f10277U) != null && (textView9 = (TextView) view.findViewById(R.id.video_codec)) != null) {
            textView9.setText(str);
        }
        View view10 = this.f10277U;
        if (view10 != null && (textView8 = (TextView) view10.findViewById(R.id.video_frame_rate)) != null) {
            c1549c.E0();
            m4.L l11 = c1549c.f19844b0;
            if (l11 != null) {
                float f4 = l11.f20070G;
                obj = Float.valueOf(f4);
                if (f4 <= 0.0d) {
                    obj = null;
                }
            }
            obj = "No Value";
            textView8.setText(String.valueOf(obj));
        }
        View view11 = this.f10277U;
        if (view11 != null && (textView7 = (TextView) view11.findViewById(R.id.byte_rate)) != null) {
            c1549c.E0();
            q4.d dVar = c1549c.f19859m0;
            textView7.setText(String.valueOf(dVar != null ? Integer.valueOf(dVar.f23452e) : null));
        }
        View view12 = this.f10277U;
        if (view12 == null || (textView6 = (TextView) view12.findViewById(R.id.audio_codec)) == null) {
            return;
        }
        c1549c.E0();
        m4.L l12 = c1549c.f19846c0;
        String str6 = l12 != null ? l12.f20093w : null;
        String obj2 = str6 != null ? ac.g.v0(str6).toString() : null;
        if (obj2 != null && obj2.length() != 0) {
            str3 = str6;
        }
        if (str3 == null) {
            str3 = "NoValue";
        }
        textView6.setText(str3);
    }

    @Override // A9.C0085f2, W1.C
    public final void b0() {
        super.b0();
        A0(false, false);
        View view = this.f10277U;
        View findViewById = view != null ? view.findViewById(R.id.playback_controls_dock) : null;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        if (this.f27448T1 == null) {
            Timer timer = new Timer();
            this.f27448T1 = timer;
            try {
                timer.schedule((z) this.f27447S1.getValue(), 1000L, 1000L);
            } catch (Exception unused) {
                this.f27448T1 = null;
            }
        }
    }

    public void b1(int i7) {
        VerticalGridView verticalGridView;
        this.f27470n1 = i7;
        t3 t3Var = this.f27465i1;
        if (t3Var == null || (verticalGridView = t3Var.f1376c) == null) {
            return;
        }
        verticalGridView.setSelectedPositionSmooth(i7);
    }

    public void c() {
        Q0();
    }

    @Override // A9.C0085f2, W1.C
    public void c0() {
        Timer timer = this.f27448T1;
        if (timer != null) {
            timer.cancel();
        }
        this.f27448T1 = null;
        super.c0();
    }

    public final void c1(String str, String str2, boolean z8) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4 = this.f27476v1;
        if (!String.valueOf(textView4 != null ? textView4.getText() : null).equalsIgnoreCase(str) && (textView3 = this.f27476v1) != null) {
            textView3.setText(str);
        }
        TextView textView5 = this.f27477w1;
        if (!String.valueOf(textView5 != null ? textView5.getText() : null).equalsIgnoreCase(str2) && (textView2 = this.f27477w1) != null) {
            textView2.setText(str2 != null ? ac.g.v0(str2).toString() : null);
        }
        TextView textView6 = this.f27476v1;
        if ((textView6 == null || !textView6.isSelected()) && (textView = this.f27476v1) != null) {
            textView.setSelected(true);
        }
        if (str2 == null) {
            TextView textView7 = this.f27477w1;
            if (textView7 != null) {
                AnimationUtilsKt.gone(textView7);
            }
        } else {
            TextView textView8 = this.f27477w1;
            if (textView8 != null) {
                AnimationUtilsKt.visible(textView8);
            }
        }
        if (z8) {
            TextView textView9 = this.f27479y1;
            if (textView9 != null) {
                AnimationUtilsKt.visible(textView9);
            }
            View view = this.f27478x1;
            if (view != null) {
                AnimationUtilsKt.visible(view);
            }
        } else {
            View view2 = this.f27478x1;
            if (view2 != null) {
                AnimationUtilsKt.gone(view2);
            }
        }
        LinearLayout linearLayout = this.f27475u1;
        if (linearLayout != null) {
            AnimationUtilsKt.fadeIn$default(linearLayout, false, null, 3, null);
        }
        View view3 = this.f27474s1;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        if (this.f27471o1 > 0.0f) {
            this.f27470n1 = 0;
            ImageButton imageButton = this.f27472q1;
            if (imageButton != null) {
                imageButton.requestFocus();
            }
            FrameLayout frameLayout = this.p1;
            if (frameLayout != null) {
                AnimationUtilsKt.translateY$default(frameLayout, this.f27471o1, null, new wa.f(15), 2, null);
            }
        }
    }

    @Override // A9.C0085f2, W1.C
    public void d0(View view, Bundle bundle) {
        l2.H h10;
        l2.H h11;
        kotlin.jvm.internal.l.e(view, "view");
        super.d0(view, bundle);
        H0().e();
        H0();
        C9.g gVar = new C9.g(A(), H0().f3820w);
        this.f27463g1 = gVar;
        gVar.c((s) this.f27443O1.getValue());
        C9.g gVar2 = this.f27463g1;
        if (gVar2 == null) {
            kotlin.jvm.internal.l.j("mTransportControlGlue");
            throw null;
        }
        gVar2.f3091C = false;
        wa.h hVar = this.f27445Q1;
        if (hVar != null && (h11 = (l2.H) hVar.f5329c.getValue()) != null) {
            h11.e(H(), new Aa.b(new C2470m(this, 1), 11));
        }
        wa.h hVar2 = this.f27445Q1;
        if (hVar2 != null && (h10 = (l2.H) hVar2.f5331e.getValue()) != null) {
            h10.e(H(), new Aa.b(new C2470m(this, 2), 11));
        }
        J0().e(H(), new Aa.b(new C2470m(this, 3), 11));
    }

    public final void d1(List objectList, sa.h hVar, List... listArr) {
        kotlin.jvm.internal.l.e(objectList, "objectList");
        String message = "setupRowAdapter: " + this.f27470n1;
        kotlin.jvm.internal.l.e(message, "message");
        C0098j c0098j = new C0098j(hVar);
        this.f27464h1 = c0098j;
        c0098j.h(0, objectList);
        if (listArr.length != 0) {
            for (List list : listArr) {
                C0098j c0098j2 = this.f27464h1;
                kotlin.jvm.internal.l.c(c0098j2, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ArrayObjectAdapter");
                c0098j2.h(0, list);
            }
        }
        i1();
    }

    public final void e1(boolean z8) {
        if (M0().g) {
            N0(t.f27535b, z8, null);
        } else {
            N0(t.f27534a, z8, null);
        }
    }

    @Override // y9.J
    public final void f() {
        SeekBar seekBar;
        C1549C c1549c;
        ViewGroup viewGroup = this.f27436F1;
        if ((viewGroup == null || viewGroup.getVisibility() != 0) && !R0()) {
            SeekBar seekBar2 = this.f27432A1;
            if (seekBar2 != null && seekBar2.isFocused() && (seekBar = this.f27432A1) != null && seekBar.f16081C && (c1549c = H0().f3807c) != null) {
                long j = 30000;
                if (this.f27451W1 + j <= c1549c.b0()) {
                    c1549c.z(5, this.f27451W1 + j);
                } else if (this.f27451W1 < c1549c.b0()) {
                    c1549c.z(5, c1549c.b0() - this.f27451W1);
                }
                j1(c1549c);
            }
            if (this.f27459d2 != t.f27537d) {
                Q0();
            } else if (M0().g) {
                N0(t.f27535b, true, this.f27438H1);
            } else {
                N0(t.f27534a, true, this.f27438H1);
            }
        }
    }

    public final void f1(int i7, String str, Rb.a aVar) {
        if (this.f10272P || L() || !K() || C() == null || this.f10258A) {
            return;
        }
        ImageButton imageButton = this.f27472q1;
        if (imageButton != null) {
            imageButton.setActivated(true);
        }
        if (str == null) {
            str = F().getString(R.string.error_playback_popup_content_text, Integer.valueOf(i7));
            kotlin.jvm.internal.l.d(str, "getString(...)");
        }
        this.f27441L1 = ActivityUtilsKt.showErrorDialog$default(this, null, str, G(R.string.error_playback_popup_title_text), null, null, false, false, new okhttp3.internal.http2.g(4, this, aVar), new C2468k(this, 15), 121, null);
    }

    @Override // y9.J
    public final void g() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f27436F1;
        if ((viewGroup2 == null || viewGroup2.getVisibility() != 0) && !R0()) {
            t tVar = this.f27459d2;
            if (tVar == t.f27537d) {
                if (M0().g) {
                    N0(t.f27535b, true, null);
                    return;
                } else {
                    N0(t.f27534a, true, null);
                    return;
                }
            }
            if (tVar != t.f27534a && tVar != t.f27535b) {
                Q0();
                return;
            }
            TextView textView = this.f27477w1;
            if (textView == null || !textView.isFocused()) {
                SeekBar seekBar = this.f27432A1;
                if (seekBar == null || !seekBar.isFocused() || (viewGroup = this.B1) == null || viewGroup.getVisibility() != 0) {
                    N0(t.f27536c, true, null);
                    return;
                }
                ImageButton imageButton = this.f27472q1;
                if (imageButton != null) {
                    imageButton.requestFocus();
                }
                Q0();
            }
        }
    }

    public final void h1(Bundle bundle) {
        qb.b bVar;
        C0660y c0660y = lb.b.f19616e;
        if (bundle != null) {
            La.g gVar = this.f27461f1;
            if (gVar == null) {
                kotlin.jvm.internal.l.j("voiceSelectorManager");
                throw null;
            }
            qb.r d10 = gVar.d(bundle);
            bVar = new qb.b(y.f27546b, c0660y);
            d10.b(bVar);
        } else {
            La.g gVar2 = this.f27461f1;
            if (gVar2 == null) {
                kotlin.jvm.internal.l.j("voiceSelectorManager");
                throw null;
            }
            qb.r d11 = gVar2.d(com.bumptech.glide.c.e());
            bVar = new qb.b(y.f27547c, c0660y);
            d11.b(bVar);
        }
        new C2054g().a(bVar);
    }

    @Override // y9.J
    public final void i() {
        if (R0()) {
            return;
        }
        ViewGroup viewGroup = this.f27436F1;
        if ((viewGroup == null || viewGroup.getVisibility() != 0) && this.f27459d2 == t.f27537d) {
            C1549C c1549c = H0().f3807c;
            if (c1549c == null || !c1549c.s()) {
                if (M0().g) {
                    N0(t.f27535b, false, null);
                    return;
                } else {
                    N0(t.f27534a, false, null);
                    return;
                }
            }
            if (M0().g) {
                N0(t.f27535b, true, null);
            } else {
                N0(t.f27534a, true, null);
            }
        }
    }

    public final void i1() {
        if (this.f27465i1 != null) {
            u3 u3Var = this.f27466j1;
            kotlin.jvm.internal.l.b(u3Var);
            u3Var.c(this.f27465i1, this.f27464h1);
            b1(Math.max(0, this.f27470n1));
        }
    }

    @Override // y9.J
    public final void j() {
        SeekBar seekBar;
        C1549C c1549c;
        ViewGroup viewGroup = this.f27436F1;
        if ((viewGroup == null || viewGroup.getVisibility() != 0) && !R0()) {
            SeekBar seekBar2 = this.f27432A1;
            if (seekBar2 != null && seekBar2.isFocused() && (seekBar = this.f27432A1) != null && seekBar.f16081C && (c1549c = H0().f3807c) != null) {
                long j = this.f27451W1;
                long j10 = j - 30000;
                if (j10 >= 0) {
                    c1549c.z(5, j10);
                } else if (j >= 0) {
                    c1549c.z(5, 0L);
                }
                j1(c1549c);
            }
            if (this.f27459d2 != t.f27537d) {
                Q0();
            } else if (M0().g) {
                N0(t.f27535b, true, this.f27439I1);
            } else {
                N0(t.f27534a, true, this.f27439I1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j1(InterfaceC1587p interfaceC1587p) {
        ViewGroup viewGroup = this.B1;
        if ((viewGroup == null || viewGroup.getVisibility() == 0) && interfaceC1587p != 0) {
            C1549C c1549c = (C1549C) interfaceC1587p;
            long b02 = c1549c.b0();
            SeekBar seekBar = this.f27432A1;
            if (seekBar != null) {
                seekBar.setMax((int) b02);
            }
            this.f27451W1 = c1549c.Q();
            SeekBar seekBar2 = this.f27432A1;
            if (seekBar2 != null) {
                seekBar2.setSecondaryProgress((int) c1549c.O());
            }
            SeekBar seekBar3 = this.f27432A1;
            if (seekBar3 != null) {
                seekBar3.setProgress((int) c1549c.Q());
            }
            long Q3 = c1549c.Q();
            StringBuilder sb2 = this.f27449U1;
            Formatter formatter = this.f27450V1;
            String h10 = X.c.h(n5.D.B(sb2, formatter, Q3), " /");
            String t5 = X.c.t(" ", n5.D.B(sb2, formatter, ((C9.h) interfaceC1587p).j()));
            TextView textView = this.f27433C1;
            if (textView != null) {
                textView.setText(h10);
            }
            TextView textView2 = this.f27434D1;
            if (textView2 != null) {
                textView2.setText(t5);
            }
        }
    }

    @Override // y9.J
    public final void k() {
        Q0();
    }

    @Override // y9.J
    public final void l() {
        SeekBar seekBar;
        ViewGroup viewGroup = this.f27436F1;
        if ((viewGroup == null || viewGroup.getVisibility() != 0) && !R0()) {
            View view = this.f27474s1;
            if ((view == null || view.getVisibility() != 0) && this.f27459d2 == t.f27537d) {
                if (this.f27475u1 == null) {
                    return;
                }
                View view2 = this.f27474s1;
                boolean z8 = false;
                if (view2 != null && view2.getVisibility() == 0) {
                    z8 = true;
                }
                View view3 = this.f27474s1;
                Integer valueOf = view3 != null ? Integer.valueOf(view3.getVisibility()) : null;
                View view4 = this.f27474s1;
                String message = "{mPlaybackOverlaysContainerView visibility: " + valueOf + "mPlaybackOverlaysContainerView alpha: " + (view4 != null ? Float.valueOf(view4.getAlpha()) : null) + "}";
                kotlin.jvm.internal.l.e(message, "message");
                if (z8) {
                    View view5 = this.f27474s1;
                    kotlin.jvm.internal.l.b(view5);
                    if (view5.getAlpha() >= 1.0f) {
                        return;
                    }
                }
                if (M0().g) {
                    N0(t.f27535b, true, null);
                    return;
                } else {
                    N0(t.f27534a, true, null);
                    return;
                }
            }
            ViewGroup viewGroup2 = this.B1;
            if (viewGroup2 != null && viewGroup2.getVisibility() == 0 && (seekBar = this.f27432A1) != null && seekBar.isFocused()) {
                if (this.f27459d2 == t.f27534a) {
                    ImageButton imageButton = this.f27472q1;
                    kotlin.jvm.internal.l.b(imageButton);
                    if (imageButton.getAlpha() > 0.0f) {
                        Q0();
                        return;
                    }
                    return;
                }
                return;
            }
            ImageButton imageButton2 = this.f27472q1;
            if (imageButton2 != null && imageButton2.isFocused()) {
                Q0();
                return;
            }
            t3 t3Var = this.f27465i1;
            kotlin.jvm.internal.l.b(t3Var);
            int selectedPosition = t3Var.f1376c.getSelectedPosition();
            if (selectedPosition < 0 || selectedPosition >= 5) {
                return;
            }
            t3 t3Var2 = this.f27465i1;
            kotlin.jvm.internal.l.b(t3Var2);
            String message2 = "mGridViewHolder!!.gridView.selectedPosition: " + t3Var2.f1376c.getSelectedPosition();
            kotlin.jvm.internal.l.e(message2, "message");
            if (M0().g) {
                N0(t.f27535b, true, null);
            } else {
                N0(t.f27534a, true, null);
            }
        }
    }

    @Override // y9.J
    public final void m(int i7) {
        Message.obtain(O5.b.q(), 100001, i7, 0).sendToTarget();
    }

    @Override // y9.J
    public final void p() {
        Message.obtain(O5.b.q(), 100002).sendToTarget();
    }

    @Override // A9.C0085f2
    public final C0121o2 p0() {
        return M0();
    }

    @Override // y9.J
    public final void q() {
        N0(t.f27536c, true, null);
    }

    @Override // y9.J
    public final void u() {
        Q0();
    }

    @Override // A9.C0085f2
    public final void u0(int i7, int i10) {
        C1549C c1549c = H0().f3807c;
        if (c1549c != null) {
            a1(c1549c);
        }
        int width = j0().getWidth();
        int height = j0().getHeight();
        SurfaceView surfaceView = this.f27467k1;
        kotlin.jvm.internal.l.b(surfaceView);
        ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
        int i11 = width * i10;
        int i12 = i7 * height;
        if (i11 > i12 && i10 > 0) {
            layoutParams.height = height;
            layoutParams.width = i12 / i10;
        } else if (i7 > 0) {
            layoutParams.width = width;
            layoutParams.height = i11 / i7;
        }
        SurfaceView surfaceView2 = this.f27467k1;
        kotlin.jvm.internal.l.b(surfaceView2);
        surfaceView2.setLayoutParams(layoutParams);
    }

    public void v() {
        Q0();
    }
}
