package c2;

import A8.c0;
import W1.C;
import W1.C0558a;
import W1.U;
import Y5.C0660y;
import Y5.C0662z;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import com.kt.apps.media.xemtv.beta.R;
import i2.AbstractC1300H;
import i2.AbstractC1301I;
import i2.C1318f;

/* loaded from: classes.dex */
public class t extends C {

    /* renamed from: A0, reason: collision with root package name */
    public int f14208A0;

    /* renamed from: B0, reason: collision with root package name */
    public ValueAnimator f14209B0;
    public ValueAnimator C0;

    /* renamed from: D0, reason: collision with root package name */
    public ValueAnimator f14210D0;

    /* renamed from: E0, reason: collision with root package name */
    public ValueAnimator f14211E0;

    /* renamed from: F0, reason: collision with root package name */
    public ValueAnimator f14212F0;

    /* renamed from: G0, reason: collision with root package name */
    public ValueAnimator f14213G0;

    /* renamed from: H0, reason: collision with root package name */
    public final r f14214H0;

    /* renamed from: I0, reason: collision with root package name */
    public final c0 f14215I0;

    /* renamed from: J0, reason: collision with root package name */
    public final B9.a f14216J0;

    /* renamed from: K0, reason: collision with root package name */
    public final B9.a f14217K0;

    /* renamed from: L0, reason: collision with root package name */
    public final q f14218L0;

    /* renamed from: m0, reason: collision with root package name */
    public final u f14219m0;

    /* renamed from: n0, reason: collision with root package name */
    public w f14220n0;

    /* renamed from: o0, reason: collision with root package name */
    public Q7.h f14221o0;

    /* renamed from: p0, reason: collision with root package name */
    public final C0660y f14222p0;

    /* renamed from: q0, reason: collision with root package name */
    public final C0662z f14223q0;

    /* renamed from: r0, reason: collision with root package name */
    public View f14224r0;

    /* renamed from: s0, reason: collision with root package name */
    public View f14225s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f14226t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f14227u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f14228v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f14229w0;

    /* renamed from: x0, reason: collision with root package name */
    public final boolean f14230x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f14231y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f14232z0;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, c2.r] */
    public t() {
        u uVar = new u();
        this.f14219m0 = uVar;
        this.f14222p0 = new C0660y(this, 8);
        this.f14223q0 = new C0662z(this);
        this.f14226t0 = 1;
        this.f14230x0 = true;
        this.f14231y0 = true;
        this.f14232z0 = true;
        this.f14214H0 = new Object();
        this.f14215I0 = new c0(this);
        this.f14216J0 = new B9.a(3);
        this.f14217K0 = new B9.a(2);
        this.f14218L0 = new q(0, this);
        uVar.f14233a = 500L;
    }

    public static void o0(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        if (valueAnimator.isStarted()) {
            valueAnimator.end();
        } else if (valueAnimator2.isStarted()) {
            valueAnimator2.end();
        }
    }

    public static ValueAnimator p0(Context context, int i7) {
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, i7);
        valueAnimator.setDuration(valueAnimator.getDuration());
        return valueAnimator;
    }

    public static void q0(ValueAnimator valueAnimator, ValueAnimator valueAnimator2, boolean z8) {
        if (valueAnimator.isStarted()) {
            valueAnimator.reverse();
            if (z8) {
                return;
            }
            valueAnimator.end();
            return;
        }
        valueAnimator2.start();
        if (z8) {
            return;
        }
        valueAnimator2.end();
    }

    @Override // W1.C
    public final void S(Bundle bundle) {
        super.S(bundle);
        F().getDimensionPixelSize(R.dimen.lb_playback_other_rows_center_to_bottom);
        F().getDimensionPixelSize(R.dimen.lb_playback_controls_padding_bottom);
        this.f14227u0 = F().getColor(R.color.lb_playback_controls_background_dark);
        this.f14228v0 = F().getColor(R.color.lb_playback_controls_background_light);
        TypedValue typedValue = new TypedValue();
        C().getTheme().resolveAttribute(R.attr.playbackControlsAutoHideTimeout, typedValue, true);
        this.f14229w0 = typedValue.data;
        C().getTheme().resolveAttribute(R.attr.playbackControlsAutoHideTickleTimeout, typedValue, true);
        F().getDimensionPixelSize(R.dimen.lb_playback_major_fade_translate_y);
        F().getDimensionPixelSize(R.dimen.lb_playback_minor_fade_translate_y);
        s sVar = new s(this, 0);
        Context C2 = C();
        ValueAnimator p02 = p0(C2, R.animator.lb_playback_bg_fade_in);
        this.f14209B0 = p02;
        p02.addUpdateListener(sVar);
        ValueAnimator valueAnimator = this.f14209B0;
        r rVar = this.f14214H0;
        valueAnimator.addListener(rVar);
        ValueAnimator p03 = p0(C2, R.animator.lb_playback_bg_fade_out);
        this.C0 = p03;
        p03.addUpdateListener(sVar);
        this.C0.addListener(rVar);
        s sVar2 = new s(this, 1);
        Context C10 = C();
        ValueAnimator p04 = p0(C10, R.animator.lb_playback_controls_fade_in);
        this.f14210D0 = p04;
        p04.addUpdateListener(sVar2);
        ValueAnimator valueAnimator2 = this.f14210D0;
        B9.a aVar = this.f14216J0;
        valueAnimator2.setInterpolator(aVar);
        ValueAnimator p05 = p0(C10, R.animator.lb_playback_controls_fade_out);
        this.f14211E0 = p05;
        p05.addUpdateListener(sVar2);
        this.f14211E0.setInterpolator(this.f14217K0);
        s sVar3 = new s(this, 2);
        Context C11 = C();
        ValueAnimator p06 = p0(C11, R.animator.lb_playback_controls_fade_in);
        this.f14212F0 = p06;
        p06.addUpdateListener(sVar3);
        this.f14212F0.setInterpolator(aVar);
        ValueAnimator p07 = p0(C11, R.animator.lb_playback_controls_fade_out);
        this.f14213G0 = p07;
        p07.addUpdateListener(sVar3);
        this.f14213G0.setInterpolator(new AccelerateInterpolator());
    }

    @Override // W1.C
    public View T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1300H[] b2;
        View inflate = layoutInflater.inflate(R.layout.lb_playback_fragment, viewGroup, false);
        this.f14224r0 = inflate;
        this.f14225s0 = inflate.findViewById(R.id.playback_fragment_background);
        w wVar = (w) B().D(R.id.playback_controls_dock);
        this.f14220n0 = wVar;
        if (wVar == null) {
            this.f14220n0 = new w();
            U B10 = B();
            B10.getClass();
            C0558a c0558a = new C0558a(B10);
            c0558a.j(R.id.playback_controls_dock, this.f14220n0, null);
            c0558a.e(false);
        }
        Q7.h hVar = this.f14221o0;
        if (hVar == null) {
            Q7.h hVar2 = new Q7.h(new C1318f());
            this.f14221o0 = hVar2;
            AbstractC1301I abstractC1301I = (AbstractC1301I) hVar2.f8696c;
            if (abstractC1301I != null && (b2 = abstractC1301I.b()) != null) {
                for (AbstractC1300H abstractC1300H : b2) {
                }
            }
            w wVar2 = this.f14220n0;
            if (wVar2 != null) {
                wVar2.o0(hVar2);
            }
        } else {
            this.f14220n0.o0(hVar);
        }
        w wVar3 = this.f14220n0;
        wVar3.f14254u0 = this.f14223q0;
        wVar3.f14255v0 = this.f14222p0;
        if (wVar3.f14252s0) {
            throw new IllegalStateException("Item clicked listener must be set before views are created");
        }
        this.f14208A0 = 255;
        s0();
        this.f14220n0.f14256w0 = this.f14218L0;
        u uVar = this.f14219m0;
        if (uVar != null) {
            uVar.f14234b = (ViewGroup) this.f14224r0;
        }
        return this.f14224r0;
    }

    @Override // W1.C
    public final void U() {
        this.f10275S = true;
    }

    @Override // W1.C
    public void V() {
        this.f14224r0 = null;
        this.f14225s0 = null;
        this.f10275S = true;
    }

    @Override // W1.C
    public final void Y() {
        c0 c0Var = this.f14215I0;
        if (c0Var.hasMessages(1)) {
            c0Var.removeMessages(1);
        }
        this.f10275S = true;
    }

    @Override // W1.C
    public final void Z() {
        this.f10275S = true;
        if (this.f14232z0 && this.f14230x0) {
            int i7 = this.f14229w0;
            c0 c0Var = this.f14215I0;
            if (c0Var != null) {
                c0Var.removeMessages(1);
                c0Var.sendEmptyMessageDelayed(1, i7);
            }
        }
        throw null;
    }

    @Override // W1.C
    public final void b0() {
        this.f10275S = true;
        this.f14220n0.getClass();
        this.f14220n0.o0(this.f14221o0);
    }

    @Override // W1.C
    public final void c0() {
        this.f10275S = true;
    }

    @Override // W1.C
    public final void d0(View view, Bundle bundle) {
        this.f14232z0 = true;
        if (this.f14231y0) {
            return;
        }
        r0(false, false);
        this.f14231y0 = true;
    }

    public final void r0(boolean z8, boolean z10) {
        c0 c0Var;
        if (this.f10277U == null) {
            this.f14231y0 = z8;
            return;
        }
        if (this.f10283a < 7) {
            z10 = false;
        }
        if (z8 == this.f14232z0) {
            if (z10) {
                return;
            }
            o0(this.f14209B0, this.C0);
            o0(this.f14210D0, this.f14211E0);
            o0(this.f14212F0, this.f14213G0);
            return;
        }
        this.f14232z0 = z8;
        if (!z8 && (c0Var = this.f14215I0) != null) {
            c0Var.removeMessages(1);
        }
        if (z8) {
            q0(this.C0, this.f14209B0, z10);
            q0(this.f14211E0, this.f14210D0, z10);
            q0(this.f14213G0, this.f14212F0, z10);
        } else {
            q0(this.f14209B0, this.C0, z10);
            q0(this.f14210D0, this.f14211E0, z10);
            q0(this.f14212F0, this.f14213G0, z10);
        }
        if (z10) {
            this.f10277U.announceForAccessibility(G(z8 ? R.string.lb_playback_controls_shown : R.string.lb_playback_controls_hidden));
        }
    }

    public final void s0() {
        View view = this.f14225s0;
        if (view != null) {
            int i7 = this.f14227u0;
            int i10 = this.f14226t0;
            if (i10 == 0) {
                i7 = 0;
            } else if (i10 == 2) {
                i7 = this.f14228v0;
            }
            view.setBackground(new ColorDrawable(i7));
            int i11 = this.f14208A0;
            this.f14208A0 = i11;
            View view2 = this.f14225s0;
            if (view2 != null) {
                view2.getBackground().setAlpha(i11);
            }
        }
    }
}
