package A9;

import I2.C0330t;
import W1.C0558a;
import Y5.C0646q0;
import android.transition.Transition;
import android.transition.TransitionManager;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class J implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f840a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f842c;

    public /* synthetic */ J(int i7, Object obj, boolean z8) {
        this.f840a = i7;
        this.f842c = obj;
        this.f841b = z8;
    }

    public J(Y5.S0 s02, boolean z8) {
        this.f840a = 2;
        this.f841b = z8;
        Objects.requireNonNull(s02);
        this.f842c = s02;
    }

    public J(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f840a = 3;
        this.f842c = aspectRatioFrameLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r5 != r0) goto L24;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C0558a c0558a;
        int i7 = 1;
        switch (this.f840a) {
            case 0:
                W w10 = (W) this.f842c;
                Transition u3 = E6.b.u(w10.C(), w10.f1011Y0 ? R.transition.lb_browse_headers_in : R.transition.lb_browse_headers_out);
                w10.f1027o1 = u3;
                E6.b.c(u3, new C(w10, i7));
                boolean z8 = this.f841b;
                TransitionManager.go(z8 ? w10.f1024l1 : w10.f1025m1, w10.f1027o1);
                if (w10.f1008V0) {
                    if (!z8) {
                        W1.U u10 = w10.f10265H;
                        u10.getClass();
                        C0558a c0558a2 = new C0558a(u10);
                        c0558a2.c(w10.f1009W0);
                        c0558a2.e(false);
                        return;
                    }
                    int i10 = w10.p1.f863b;
                    if (i10 >= 0) {
                        W1.U u11 = w10.f10265H;
                        if (i10 == u11.f10358d.size()) {
                            c0558a = u11.f10361h;
                            if (c0558a == null) {
                                throw new IndexOutOfBoundsException();
                            }
                        } else {
                            c0558a = (C0558a) u11.f10358d.get(i10);
                        }
                        W1.U u12 = w10.f10265H;
                        int i11 = c0558a.f10424u;
                        if (i11 >= 0) {
                            u12.T(i11, 1);
                            return;
                        } else {
                            u12.getClass();
                            throw new IllegalArgumentException(h3.o.l(i11, "Bad id: "));
                        }
                    }
                    return;
                }
                return;
            case 1:
                P3.o oVar = (P3.o) this.f842c;
                oVar.getClass();
                W3.o.a();
                C0330t c0330t = (C0330t) oVar.f7838b;
                boolean z10 = c0330t.f5199a;
                boolean z11 = this.f841b;
                c0330t.f5199a = z11;
                if (z10 != z11) {
                    ((P3.n) c0330t.f5200b).a(z11);
                    return;
                }
                return;
            case 2:
                Y5.S0 s02 = (Y5.S0) this.f842c;
                C0646q0 c0646q0 = (C0646q0) s02.f3094a;
                boolean a9 = c0646q0.a();
                boolean z12 = c0646q0.f11901M != null && c0646q0.f11901M.booleanValue();
                boolean z13 = this.f841b;
                c0646q0.f11901M = Boolean.valueOf(z13);
                if (z12 == z13) {
                    Y5.W w11 = c0646q0.f11912f;
                    C0646q0.l(w11);
                    w11.f11573B.b(Boolean.valueOf(z13), "Default data collection state already set to");
                }
                if (c0646q0.a() != a9) {
                    boolean a10 = c0646q0.a();
                    if (c0646q0.f11901M == null || !c0646q0.f11901M.booleanValue()) {
                        i7 = 0;
                        break;
                    }
                }
                Y5.W w12 = c0646q0.f11912f;
                C0646q0.l(w12);
                w12.f11582y.c("Default data collection is different than actual status", Boolean.valueOf(z13), Boolean.valueOf(a9));
                s02.a0();
                return;
            default:
                this.f841b = false;
                int i12 = AspectRatioFrameLayout.f14734d;
                ((AspectRatioFrameLayout) this.f842c).getClass();
                return;
        }
    }
}
