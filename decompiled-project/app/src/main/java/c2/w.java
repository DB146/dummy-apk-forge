package c2;

import A9.C0161z;
import A9.I1;
import W1.C;
import Y5.C0660y;
import Y5.C0662z;
import android.animation.TimeAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;
import i2.AbstractC1309Q;
import i2.C1324l;
import i2.C1333u;
import i2.C1335w;
import i2.C1336x;

/* loaded from: classes.dex */
public class w extends C {

    /* renamed from: m0, reason: collision with root package name */
    public Q7.h f14246m0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f14249p0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f14252s0;

    /* renamed from: u0, reason: collision with root package name */
    public C0662z f14254u0;

    /* renamed from: v0, reason: collision with root package name */
    public C0660y f14255v0;

    /* renamed from: w0, reason: collision with root package name */
    public q f14256w0;

    /* renamed from: n0, reason: collision with root package name */
    public final C1336x f14247n0 = new C1336x();

    /* renamed from: o0, reason: collision with root package name */
    public int f14248o0 = -1;

    /* renamed from: q0, reason: collision with root package name */
    public final C0161z f14250q0 = new C0161z(1, this);

    /* renamed from: r0, reason: collision with root package name */
    public final boolean f14251r0 = true;

    /* renamed from: t0, reason: collision with root package name */
    public final boolean f14253t0 = true;

    /* renamed from: x0, reason: collision with root package name */
    public final q f14257x0 = new q(1, this);

    public static void p0(C1335w c1335w, boolean z8, boolean z10) {
        v vVar = c1335w.f18309x;
        TimeAnimator timeAnimator = vVar.f14242c;
        timeAnimator.end();
        float f4 = z8 ? 1.0f : 0.0f;
        C9.h hVar = vVar.f14241b;
        AbstractC1309Q abstractC1309Q = vVar.f14240a;
        if (z10) {
            abstractC1309Q.getClass();
            C1324l j = AbstractC1309Q.j(hVar);
            j.f18278u = f4;
            abstractC1309Q.p(j);
        } else {
            abstractC1309Q.getClass();
            if (AbstractC1309Q.j(hVar).f18278u != f4) {
                float f10 = AbstractC1309Q.j(hVar).f18278u;
                vVar.f14245f = f10;
                vVar.g = f4 - f10;
                timeAnimator.start();
            }
        }
        AbstractC1309Q abstractC1309Q2 = (AbstractC1309Q) c1335w.f18306u;
        abstractC1309Q2.getClass();
        C1324l j10 = AbstractC1309Q.j(c1335w.f18307v);
        j10.f18276e = z8;
        abstractC1309Q2.o(j10, z8);
    }

    @Override // W1.C
    public final View T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lb_rows_fragment, viewGroup, false);
        if (inflate.findViewById(R.id.container_list) != null) {
            throw new ClassCastException();
        }
        if (this.f14249p0) {
            this.f14249p0 = true;
        }
        return inflate;
    }

    @Override // W1.C
    public final void V() {
        this.f14252s0 = false;
        this.f10275S = true;
        C0161z c0161z = this.f14250q0;
        if (c0161z.f1486b) {
            c0161z.f1486b = false;
            ((w) c0161z.f1487c).f14247n0.f4599a.unregisterObserver(c0161z);
        }
    }

    @Override // W1.C
    public final void a0(Bundle bundle) {
        bundle.putInt("currentSelectedPosition", this.f14248o0);
    }

    @Override // W1.C
    public final void d0(View view, Bundle bundle) {
        if (bundle != null) {
            this.f14248o0 = bundle.getInt("currentSelectedPosition", -1);
        }
        this.f14246m0.getClass();
        throw null;
    }

    public final void o0(Q7.h hVar) {
        if (this.f14246m0 != hVar) {
            this.f14246m0 = hVar;
            C1336x c1336x = this.f14247n0;
            Q7.h hVar2 = c1336x.f18310d;
            if (hVar != hVar2) {
                C1333u c1333u = c1336x.g;
                if (hVar2 != null) {
                    ((I1) hVar2.f8695b).unregisterObserver(c1333u);
                }
                c1336x.f18310d = hVar;
                if (hVar == null) {
                    c1336x.d();
                } else {
                    ((I1) hVar.f8695b).registerObserver(c1333u);
                    boolean z8 = c1336x.f4600b;
                    c1336x.f18310d.getClass();
                    if (z8) {
                        c1336x.f18310d.getClass();
                        c1336x.l(false);
                    }
                    c1336x.d();
                }
            }
            c1336x.d();
            this.f14252s0 = false;
            c1336x.f18311e = this.f14257x0;
        }
    }
}
