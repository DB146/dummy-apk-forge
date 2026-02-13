package A0;

import A9.C0091h0;
import A9.C0095i0;
import A9.C0099j0;
import A9.C0115n0;
import A9.C0125p2;
import A9.J2;
import A9.S1;
import A9.V1;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import i2.AbstractC1297E;
import i2.C1294B;
import i2.C1303K;
import i2.C1322j;

/* renamed from: A0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216a;

    /* renamed from: b, reason: collision with root package name */
    public int f217b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f218c;

    /* renamed from: d, reason: collision with root package name */
    public Object f219d;

    /* renamed from: e, reason: collision with root package name */
    public Object f220e;

    /* renamed from: f, reason: collision with root package name */
    public Object f221f;
    public final Object g;

    public C0016f0(C0018g0 c0018g0, c0.l lVar, int i7, S.e eVar, S.e eVar2, boolean z8) {
        this.f216a = 0;
        this.g = c0018g0;
        this.f219d = lVar;
        this.f217b = i7;
        this.f220e = eVar;
        this.f221f = eVar2;
        this.f218c = z8;
    }

    public C0016f0(C0115n0 c0115n0, Drawable drawable) {
        this.f216a = 1;
        this.f217b = 0;
        new C0099j0(this, 0);
        this.f219d = c0115n0;
        this.g = drawable;
        this.f218c = true;
        drawable.setAlpha(255);
        if (((V1) this.f220e) != null) {
            return;
        }
        C0125p2 c0125p2 = c0115n0.j;
        c0125p2.getClass();
        V1 a9 = c0115n0.a(new S1(c0125p2, 0, 1.0f), new S1(c0125p2, 0, 0.0f));
        a9.f989d.add(new C0091h0(this));
        this.f220e = a9;
        c0115n0.f();
    }

    public C0016f0(C1322j c1322j, Drawable drawable) {
        this.f216a = 2;
        this.f217b = 0;
        this.f219d = c1322j;
        this.g = drawable;
        this.f218c = true;
        drawable.setAlpha(255);
        if (((AbstractC1297E) this.f220e) != null) {
            return;
        }
        C1303K c1303k = c1322j.f18272f;
        c1303k.getClass();
        AbstractC1297E a9 = c1322j.a(new C1294B(c1303k, 0, 1.0f), new C1294B(c1303k, 0, 0.0f));
        a9.f18212d.add(new c2.l(this));
        this.f220e = a9;
        c1322j.d();
    }

    public boolean a(int i7, int i10) {
        S.e eVar = (S.e) this.f220e;
        int i11 = this.f217b;
        c0.k kVar = (c0.k) eVar.f8959a[i7 + i11];
        c0.k kVar2 = (c0.k) ((S.e) this.f221f).f8959a[i11 + i10];
        h0 h0Var = i0.f239a;
        return kotlin.jvm.internal.l.a(kVar, kVar2) || c0.o.a(kVar, kVar2);
    }

    public void b(boolean z8, boolean z10) {
        float f4;
        Object obj = this.g;
        int i7 = 0;
        switch (this.f216a) {
            case 1:
                boolean z11 = !z8;
                Drawable drawable = (Drawable) obj;
                if (this.f218c == z11) {
                    if (z10) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.f221f;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            this.f221f = null;
                        }
                        if (drawable != null) {
                            drawable.setAlpha(z8 ? 0 : 255);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f218c = z11;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.f221f;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f221f = null;
                }
                float f10 = z8 ? 1.0f : 0.0f;
                f4 = z8 ? 0.0f : 1.0f;
                if (drawable == null) {
                    return;
                }
                if (z10) {
                    drawable.setAlpha(z8 ? 0 : 255);
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f4);
                this.f221f = ofFloat;
                ofFloat.setDuration(500L);
                ((ValueAnimator) this.f221f).addUpdateListener(new J2(this, 2));
                ((ValueAnimator) this.f221f).addListener(new C0095i0(this, i7));
                ((ValueAnimator) this.f221f).start();
                return;
            default:
                boolean z12 = !z8;
                Drawable drawable2 = (Drawable) obj;
                if (this.f218c == z12) {
                    if (z10) {
                        ValueAnimator valueAnimator3 = (ValueAnimator) this.f221f;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                            this.f221f = null;
                        }
                        if (drawable2 != null) {
                            drawable2.setAlpha(z8 ? 0 : 255);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f218c = z12;
                ValueAnimator valueAnimator4 = (ValueAnimator) this.f221f;
                if (valueAnimator4 != null) {
                    valueAnimator4.cancel();
                    this.f221f = null;
                }
                float f11 = z8 ? 1.0f : 0.0f;
                f4 = z8 ? 0.0f : 1.0f;
                if (drawable2 == null) {
                    return;
                }
                if (z10) {
                    drawable2.setAlpha(z8 ? 0 : 255);
                    return;
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, f4);
                this.f221f = ofFloat2;
                ofFloat2.setDuration(500L);
                ((ValueAnimator) this.f221f).addUpdateListener(new B6.c(this, 5));
                ((ValueAnimator) this.f221f).addListener(new c2.m(this));
                ((ValueAnimator) this.f221f).start();
                return;
        }
    }

    public void c(int i7) {
        if (i7 == this.f217b) {
            return;
        }
        this.f217b = i7;
        if (i7 == 1) {
            b(false, false);
        } else {
            if (i7 != 2) {
                return;
            }
            b(false, false);
        }
    }
}
