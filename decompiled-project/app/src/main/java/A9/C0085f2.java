package A9;

import W1.C0558a;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: A9.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0085f2 extends W1.C {

    /* renamed from: A0, reason: collision with root package name */
    public View f1156A0;

    /* renamed from: B0, reason: collision with root package name */
    public int f1157B0;
    public int C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f1158D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f1159E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f1160F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f1161G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f1162H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f1163I0;

    /* renamed from: J0, reason: collision with root package name */
    public C9.g f1164J0;

    /* renamed from: K0, reason: collision with root package name */
    public final boolean f1165K0;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f1166L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f1167M0;

    /* renamed from: N0, reason: collision with root package name */
    public int f1168N0;

    /* renamed from: O0, reason: collision with root package name */
    public ValueAnimator f1169O0;

    /* renamed from: P0, reason: collision with root package name */
    public ValueAnimator f1170P0;

    /* renamed from: Q0, reason: collision with root package name */
    public ValueAnimator f1171Q0;

    /* renamed from: R0, reason: collision with root package name */
    public ValueAnimator f1172R0;

    /* renamed from: S0, reason: collision with root package name */
    public ValueAnimator f1173S0;

    /* renamed from: T0, reason: collision with root package name */
    public ValueAnimator f1174T0;

    /* renamed from: U0, reason: collision with root package name */
    public final C0095i0 f1175U0;

    /* renamed from: V0, reason: collision with root package name */
    public final A8.c0 f1176V0;

    /* renamed from: W0, reason: collision with root package name */
    public final C0077d2 f1177W0;

    /* renamed from: X0, reason: collision with root package name */
    public final C0077d2 f1178X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final B9.a f1179Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final B9.a f1180Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final C0134s0 f1181a1;

    /* renamed from: b1, reason: collision with root package name */
    public final C0073c2 f1182b1;

    /* renamed from: m0, reason: collision with root package name */
    public D5.i f1183m0;

    /* renamed from: n0, reason: collision with root package name */
    public Tb.a f1184n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f1185o0;

    /* renamed from: p0, reason: collision with root package name */
    public final C0121o2 f1186p0;

    /* renamed from: q0, reason: collision with root package name */
    public A2 f1187q0;

    /* renamed from: r0, reason: collision with root package name */
    public C0098j f1188r0;

    /* renamed from: s0, reason: collision with root package name */
    public C9.d f1189s0;

    /* renamed from: t0, reason: collision with root package name */
    public Z1 f1190t0;

    /* renamed from: u0, reason: collision with root package name */
    public T f1191u0;

    /* renamed from: v0, reason: collision with root package name */
    public final C0077d2 f1192v0;

    /* renamed from: w0, reason: collision with root package name */
    public final C0077d2 f1193w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f1194x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f1195y0;

    /* renamed from: z0, reason: collision with root package name */
    public View f1196z0;

    public C0085f2() {
        C0121o2 c0121o2 = new C0121o2();
        this.f1186p0 = c0121o2;
        this.f1192v0 = new C0077d2(this);
        this.f1193w0 = new C0077d2(this);
        this.f1157B0 = 1;
        this.f1165K0 = true;
        this.f1166L0 = true;
        this.f1167M0 = true;
        this.f1175U0 = new C0095i0(this, 1);
        this.f1176V0 = new A8.c0(this, Looper.getMainLooper(), 1);
        this.f1177W0 = new C0077d2(this);
        this.f1178X0 = new C0077d2(this);
        this.f1179Y0 = new B9.a(1);
        this.f1180Z0 = new B9.a(0);
        this.f1181a1 = new C0134s0(1, this);
        this.f1182b1 = new C0073c2(this);
        c0121o2.f1327a = 500L;
    }

    public static void o0(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        if (valueAnimator.isStarted()) {
            valueAnimator.end();
        } else if (valueAnimator2.isStarted()) {
            valueAnimator2.end();
        }
    }

    public static ValueAnimator r0(Context context, int i7) {
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, i7);
        valueAnimator.setDuration(valueAnimator.getDuration());
        return valueAnimator;
    }

    public static void v0(ValueAnimator valueAnimator, ValueAnimator valueAnimator2, boolean z8) {
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

    public final void A0(boolean z8, boolean z10) {
        Log.v("PlaybackSupportFragment", "showControlsOverlay false");
        if (this.f10277U == null) {
            this.f1166L0 = false;
            return;
        }
        if (this.f10283a < 7) {
            z10 = false;
        }
        if (!this.f1167M0) {
            if (z10) {
                return;
            }
            o0(this.f1169O0, this.f1170P0);
            o0(this.f1171Q0, this.f1172R0);
            o0(this.f1173S0, this.f1174T0);
            return;
        }
        this.f1167M0 = false;
        A8.c0 c0Var = this.f1176V0;
        if (c0Var != null) {
            c0Var.removeMessages(1);
        }
        this.f1163I0 = (q0() == null || q0().getSelectedPosition() == 0) ? this.f1161G0 : this.f1162H0;
        v0(this.f1169O0, this.f1170P0, z10);
        v0(this.f1171Q0, this.f1172R0, z10);
        v0(this.f1173S0, this.f1174T0, z10);
        if (z10) {
            this.f10277U.announceForAccessibility(G(R.string.lb_playback_controls_hidden));
        }
    }

    public final void B0() {
        StringBuilder sb2 = new StringBuilder("tickle enabled ");
        sb2.append(this.f1165K0);
        sb2.append(" isResumed ");
        sb2.append(this.f10283a >= 7);
        Log.v("PlaybackSupportFragment", sb2.toString());
        A8.c0 c0Var = this.f1176V0;
        if (c0Var != null) {
            c0Var.removeMessages(1);
        }
        int i7 = this.f1160F0;
        if (i7 <= 0 || !this.f1165K0 || c0Var == null) {
            return;
        }
        c0Var.removeMessages(1);
        c0Var.sendEmptyMessageDelayed(1, i7);
    }

    public final void C0() {
        View view = this.f1156A0;
        if (view != null) {
            int i7 = this.C0;
            int i10 = this.f1157B0;
            if (i10 == 0) {
                i7 = 0;
            } else if (i10 == 2) {
                i7 = this.f1158D0;
            }
            view.setBackground(new ColorDrawable(i7));
            int i11 = this.f1168N0;
            this.f1168N0 = i11;
            View view2 = this.f1156A0;
            if (view2 != null) {
                view2.getBackground().setAlpha(i11);
            }
        }
    }

    @Override // W1.C
    public void S(Bundle bundle) {
        super.S(bundle);
        this.f1195y0 = F().getDimensionPixelSize(R.dimen.lb_playback_other_rows_center_to_bottom);
        this.f1194x0 = F().getDimensionPixelSize(R.dimen.lb_playback_controls_padding_bottom);
        this.C0 = F().getColor(R.color.lb_playback_controls_background_dark);
        this.f1158D0 = F().getColor(R.color.lb_playback_controls_background_light);
        TypedValue typedValue = new TypedValue();
        C().getTheme().resolveAttribute(R.attr.playbackControlsAutoHideTimeout, typedValue, true);
        this.f1159E0 = typedValue.data;
        C().getTheme().resolveAttribute(R.attr.playbackControlsAutoHideTickleTimeout, typedValue, true);
        this.f1160F0 = typedValue.data;
        this.f1161G0 = F().getDimensionPixelSize(R.dimen.lb_playback_major_fade_translate_y);
        this.f1162H0 = F().getDimensionPixelSize(R.dimen.lb_playback_minor_fade_translate_y);
        C0081e2 c0081e2 = new C0081e2(this, 0);
        Context C2 = C();
        ValueAnimator r02 = r0(C2, R.animator.lb_playback_bg_fade_in);
        this.f1169O0 = r02;
        r02.addUpdateListener(c0081e2);
        ValueAnimator valueAnimator = this.f1169O0;
        C0095i0 c0095i0 = this.f1175U0;
        valueAnimator.addListener(c0095i0);
        ValueAnimator r03 = r0(C2, R.animator.lb_playback_bg_fade_out);
        this.f1170P0 = r03;
        r03.addUpdateListener(c0081e2);
        this.f1170P0.addListener(c0095i0);
        C0081e2 c0081e22 = new C0081e2(this, 1);
        Context C10 = C();
        ValueAnimator r04 = r0(C10, R.animator.lb_playback_controls_fade_in);
        this.f1171Q0 = r04;
        r04.addUpdateListener(c0081e22);
        ValueAnimator valueAnimator2 = this.f1171Q0;
        B9.a aVar = this.f1179Y0;
        valueAnimator2.setInterpolator(aVar);
        ValueAnimator r05 = r0(C10, R.animator.lb_playback_controls_fade_out);
        this.f1172R0 = r05;
        r05.addUpdateListener(c0081e22);
        this.f1172R0.setInterpolator(this.f1180Z0);
        C0081e2 c0081e23 = new C0081e2(this, 2);
        Context C11 = C();
        ValueAnimator r06 = r0(C11, R.animator.lb_playback_controls_fade_in);
        this.f1173S0 = r06;
        r06.addUpdateListener(c0081e23);
        this.f1173S0.setInterpolator(aVar);
        ValueAnimator r07 = r0(C11, R.animator.lb_playback_controls_fade_out);
        this.f1174T0 = r07;
        r07.addUpdateListener(c0081e23);
        this.f1174T0.setInterpolator(new AccelerateInterpolator());
    }

    @Override // W1.C
    public View T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lb_playback_fragment, viewGroup, false);
        this.f1196z0 = inflate;
        this.f1156A0 = inflate.findViewById(R.id.playback_fragment_background);
        A2 a22 = (A2) B().D(R.id.playback_controls_dock);
        this.f1187q0 = a22;
        if (a22 == null) {
            this.f1187q0 = new A2();
            W1.U B10 = B();
            B10.getClass();
            C0558a c0558a = new C0558a(B10);
            c0558a.j(R.id.playback_controls_dock, this.f1187q0, null);
            c0558a.e(false);
        }
        C0098j c0098j = this.f1188r0;
        if (c0098j == null) {
            C0098j c0098j2 = new C0098j(new X());
            this.f1188r0 = c0098j2;
            z0();
            y0();
            w0();
            A2 a23 = this.f1187q0;
            if (a23 != null) {
                a23.t0(c0098j2);
            }
        } else {
            this.f1187q0.t0(c0098j);
        }
        this.f1187q0.y0(this.f1193w0);
        this.f1187q0.x0(this.f1192v0);
        this.f1168N0 = 255;
        C0();
        this.f1187q0.f748I0 = this.f1181a1;
        C0121o2 p02 = p0();
        if (p02 != null) {
            p02.f1329c = (ViewGroup) this.f1196z0;
        }
        return this.f1196z0;
    }

    @Override // W1.C
    public final void U() {
        D5.i iVar = this.f1183m0;
        if (iVar != null) {
            ((C9.c) iVar.f3256b).c(null);
        }
        this.f10275S = true;
    }

    @Override // W1.C
    public void V() {
        this.f1196z0 = null;
        this.f1156A0 = null;
        this.f10275S = true;
    }

    @Override // W1.C
    public void Y() {
        D5.i iVar = this.f1183m0;
        if (iVar != null) {
            ((C9.c) iVar.f3256b).getClass();
        }
        A8.c0 c0Var = this.f1176V0;
        if (c0Var.hasMessages(1)) {
            c0Var.removeMessages(1);
        }
        this.f10275S = true;
    }

    @Override // W1.C
    public void Z() {
        this.f10275S = true;
        if (this.f1167M0 && this.f1165K0) {
            int i7 = this.f1159E0;
            A8.c0 c0Var = this.f1176V0;
            if (c0Var != null) {
                c0Var.removeMessages(1);
                c0Var.sendEmptyMessageDelayed(1, i7);
            }
        }
        q0().setOnTouchInterceptListener(this.f1177W0);
        q0().setOnKeyInterceptListener(this.f1178X0);
        D5.i iVar = this.f1183m0;
        if (iVar != null) {
            ((C9.c) iVar.f3256b).getClass();
        }
    }

    @Override // W1.C
    public void b0() {
        this.f10275S = true;
        VerticalGridView verticalGridView = this.f1187q0.f751n0;
        if (verticalGridView != null) {
            verticalGridView.setWindowAlignmentOffset(-this.f1194x0);
            verticalGridView.setWindowAlignmentOffsetPercent(-1.0f);
            verticalGridView.setItemAlignmentOffset(this.f1195y0 - this.f1194x0);
            verticalGridView.setItemAlignmentOffsetPercent(50.0f);
            verticalGridView.setPadding(verticalGridView.getPaddingLeft(), verticalGridView.getPaddingTop(), verticalGridView.getPaddingRight(), this.f1194x0);
            verticalGridView.setWindowAlignment(2);
        }
        this.f1187q0.t0(this.f1188r0);
        D5.i iVar = this.f1183m0;
        if (iVar != null) {
            ((C9.c) iVar.f3256b).f3072d.R(true);
        }
    }

    @Override // W1.C
    public void c0() {
        D5.i iVar = this.f1183m0;
        if (iVar != null) {
            ((C9.c) iVar.f3256b).f3072d.R(false);
        }
        this.f10275S = true;
    }

    @Override // W1.C
    public void d0(View view, Bundle bundle) {
        this.f1167M0 = true;
        if (this.f1166L0) {
            return;
        }
        A0(false, false);
        this.f1166L0 = true;
    }

    public C0121o2 p0() {
        return this.f1186p0;
    }

    public final VerticalGridView q0() {
        A2 a22 = this.f1187q0;
        if (a22 == null) {
            return null;
        }
        return a22.f751n0;
    }

    public void s0(int i7, String str) {
    }

    public final boolean t0(InputEvent inputEvent) {
        boolean z8;
        int i7;
        int i10;
        boolean z10 = this.f1167M0;
        StringBuilder sb2 = new StringBuilder("onInterceptInputEvent hidden ");
        sb2.append(!z10);
        sb2.append(" ");
        sb2.append(inputEvent);
        Log.v("PlaybackSupportFragment", sb2.toString());
        if (inputEvent instanceof KeyEvent) {
            KeyEvent keyEvent = (KeyEvent) inputEvent;
            i7 = keyEvent.getKeyCode();
            i10 = keyEvent.getAction();
            C9.g gVar = this.f1164J0;
            z8 = gVar != null ? gVar.onKey(this.f10277U, i7, keyEvent) : false;
        } else {
            z8 = false;
            i7 = 0;
            i10 = 0;
        }
        if (i7 == 4 || i7 == 111) {
            if (this.f1185o0) {
                return false;
            }
            if (!z10) {
                return z8;
            }
            if (((KeyEvent) inputEvent).getAction() == 1) {
                A0(false, true);
            }
            return true;
        }
        switch (i7) {
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                if (!z10) {
                    z8 = true;
                }
                if (i10 != 0) {
                    return z8;
                }
                B0();
                return z8;
            default:
                if (!z8 || i10 != 0) {
                    return z8;
                }
                B0();
                return z8;
        }
    }

    public void u0(int i7, int i10) {
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [u.T, u.e] */
    public final void w0() {
        AbstractC0117n2 abstractC0117n2;
        AbstractC0113m2[] b2;
        C0098j c0098j = this.f1188r0;
        if (c0098j == null || (abstractC0117n2 = c0098j.f852b) == null || (b2 = abstractC0117n2.b()) == null) {
            return;
        }
        for (int i7 = 0; i7 < b2.length; i7++) {
            AbstractC0113m2 abstractC0113m2 = b2[i7];
            if ((abstractC0113m2 instanceof C9.d) && abstractC0113m2.b() == null) {
                C0120o1 c0120o1 = new C0120o1();
                C0116n1 c0116n1 = new C0116n1();
                c0116n1.f1301c = 0;
                c0116n1.a(100.0f);
                c0120o1.f1326a = new C0116n1[]{c0116n1};
                AbstractC0113m2 abstractC0113m22 = b2[i7];
                if (abstractC0113m22.f1282a == null) {
                    abstractC0113m22.f1282a = new u.T(0);
                }
                abstractC0113m22.f1282a.put(C0120o1.class, c0120o1);
            }
        }
    }

    public final void x0(boolean z8) {
        A8.c0 c0Var;
        if (this.f1185o0 == z8) {
            return;
        }
        this.f1185o0 = z8;
        q0().setSelectedPosition(0);
        if (this.f1185o0 && (c0Var = this.f1176V0) != null) {
            c0Var.removeMessages(1);
        }
        int childCount = q0().getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = q0().getChildAt(i7);
            q0().getClass();
            H2.i0 M3 = RecyclerView.M(childAt);
            if ((M3 != null ? M3.c() : -1) > 0) {
                childAt.setVisibility(this.f1185o0 ? 4 : 0);
            }
        }
    }

    public final void y0() {
        C9.d dVar;
        C0098j c0098j = this.f1188r0;
        if (c0098j == null || this.f1190t0 == null || (dVar = this.f1189s0) == null) {
            return;
        }
        AbstractC0117n2 abstractC0117n2 = c0098j.f852b;
        if (abstractC0117n2 == null) {
            X x2 = new X();
            x2.c(this.f1190t0.getClass(), this.f1189s0);
            this.f1188r0.d(x2);
        } else if (abstractC0117n2 instanceof X) {
            ((X) abstractC0117n2).c(Z1.class, dVar);
        }
    }

    public final void z0() {
        C0098j c0098j = this.f1188r0;
        if (c0098j == null || this.f1190t0 == null) {
            return;
        }
        if (c0098j.f1233c.size() == 0) {
            c0098j.g(this.f1190t0);
            return;
        }
        c0098j.f1233c.set(0, this.f1190t0);
        c0098j.f851a.e(0, 1);
    }
}
